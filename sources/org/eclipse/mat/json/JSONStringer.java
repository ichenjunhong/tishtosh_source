package org.eclipse.mat.json;

import com.C2240a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JSONStringer {
    private final String indent;
    final StringBuilder out;
    private final List<Scope> stack;

    enum Scope {
        EMPTY_ARRAY,
        NONEMPTY_ARRAY,
        EMPTY_OBJECT,
        DANGLING_KEY,
        NONEMPTY_OBJECT,
        NULL
    }

    public JSONStringer array() throws JSONException {
        return open(Scope.EMPTY_ARRAY, "[");
    }

    public JSONStringer endArray() throws JSONException {
        return close(Scope.EMPTY_ARRAY, Scope.NONEMPTY_ARRAY, "]");
    }

    public JSONStringer endObject() throws JSONException {
        return close(Scope.EMPTY_OBJECT, Scope.NONEMPTY_OBJECT, "}");
    }

    public JSONStringer object() throws JSONException {
        return open(Scope.EMPTY_OBJECT, "{");
    }

    public JSONStringer() {
        this.out = new StringBuilder();
        this.stack = new ArrayList();
        this.indent = null;
    }

    private void newline() {
        if (this.indent != null) {
            this.out.append("\n");
            for (int i = 0; i < this.stack.size(); i++) {
                this.out.append(this.indent);
            }
        }
    }

    public String toString() {
        if (this.out.length() == 0) {
            return null;
        }
        return this.out.toString();
    }

    private void beforeKey() throws JSONException {
        Scope peek = peek();
        if (peek == Scope.NONEMPTY_OBJECT) {
            this.out.append(',');
        } else if (peek != Scope.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        newline();
        replaceTop(Scope.DANGLING_KEY);
    }

    private Scope peek() throws JSONException {
        if (!this.stack.isEmpty()) {
            return (Scope) this.stack.get(this.stack.size() - 1);
        }
        throw new JSONException("Nesting problem");
    }

    private void beforeValue() throws JSONException {
        String str;
        if (!this.stack.isEmpty()) {
            Scope peek = peek();
            if (peek == Scope.EMPTY_ARRAY) {
                replaceTop(Scope.NONEMPTY_ARRAY);
                newline();
            } else if (peek == Scope.NONEMPTY_ARRAY) {
                this.out.append(',');
                newline();
            } else if (peek == Scope.DANGLING_KEY) {
                StringBuilder sb = this.out;
                if (this.indent == null) {
                    str = ":";
                } else {
                    str = ": ";
                }
                sb.append(str);
                replaceTop(Scope.NONEMPTY_OBJECT);
            } else if (peek != Scope.NULL) {
                throw new JSONException("Nesting problem");
            }
        }
    }

    private void replaceTop(Scope scope) {
        this.stack.set(this.stack.size() - 1, scope);
    }

    public JSONStringer key(String str) throws JSONException {
        if (str != null) {
            beforeKey();
            string(str);
            return this;
        }
        throw new JSONException("Names must be non-null");
    }

    public JSONStringer value(long j) throws JSONException {
        if (!this.stack.isEmpty()) {
            beforeValue();
            this.out.append(j);
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    JSONStringer(int i) {
        this.out = new StringBuilder();
        this.stack = new ArrayList();
        char[] cArr = new char[i];
        Arrays.fill(cArr, ' ');
        this.indent = new String(cArr);
    }

    public JSONStringer value(double d) throws JSONException {
        if (!this.stack.isEmpty()) {
            beforeValue();
            this.out.append(JSONObject.numberToString(Double.valueOf(d)));
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    public JSONStringer value(Object obj) throws JSONException {
        if (this.stack.isEmpty()) {
            throw new JSONException("Nesting problem");
        } else if (obj instanceof JSONArray) {
            ((JSONArray) obj).writeTo(this);
            return this;
        } else if (obj instanceof JSONObject) {
            ((JSONObject) obj).writeTo(this);
            return this;
        } else {
            beforeValue();
            if (obj == null || (obj instanceof Boolean) || obj == JSONObject.NULL) {
                this.out.append(obj);
            } else if (obj instanceof Number) {
                this.out.append(JSONObject.numberToString((Number) obj));
            } else {
                string(obj.toString());
            }
            return this;
        }
    }

    private void string(String str) {
        this.out.append("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case 8:
                        this.out.append("\\b");
                        break;
                    case 9:
                        this.out.append("\\t");
                        break;
                    case 10:
                        this.out.append("\\n");
                        break;
                    default:
                        switch (charAt) {
                            case 12:
                                this.out.append("\\f");
                                break;
                            case 13:
                                this.out.append("\\r");
                                break;
                            default:
                                if (charAt > 31) {
                                    this.out.append(charAt);
                                    break;
                                } else {
                                    this.out.append(C2240a.m6772a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                    break;
                                }
                        }
                }
            } else {
                StringBuilder sb = this.out;
                sb.append('\\');
                sb.append(charAt);
            }
        }
        this.out.append("\"");
    }

    public JSONStringer value(boolean z) throws JSONException {
        if (!this.stack.isEmpty()) {
            beforeValue();
            this.out.append(z);
            return this;
        }
        throw new JSONException("Nesting problem");
    }

    /* access modifiers changed from: 0000 */
    public JSONStringer open(Scope scope, String str) throws JSONException {
        if (!this.stack.isEmpty() || this.out.length() <= 0) {
            beforeValue();
            this.stack.add(scope);
            this.out.append(str);
            return this;
        }
        throw new JSONException("Nesting problem: multiple top-level roots");
    }

    /* access modifiers changed from: 0000 */
    public JSONStringer close(Scope scope, Scope scope2, String str) throws JSONException {
        Scope peek = peek();
        if (peek == scope2 || peek == scope) {
            this.stack.remove(this.stack.size() - 1);
            if (peek == scope2) {
                newline();
            }
            this.out.append(str);
            return this;
        }
        throw new JSONException("Nesting problem");
    }
}
