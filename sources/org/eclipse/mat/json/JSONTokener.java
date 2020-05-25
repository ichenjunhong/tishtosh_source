package org.eclipse.mat.json;

public class JSONTokener {

    /* renamed from: in */
    private final String f133279in;
    private int pos;

    public static int dehexchar(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return (c - 'A') + 10;
        }
        if (c < 'a' || c > 'f') {
            return -1;
        }
        return (c - 'a') + 10;
    }

    public void back() {
        int i = this.pos - 1;
        this.pos = i;
        if (i == -1) {
            this.pos = 0;
        }
    }

    public boolean more() {
        if (this.pos < this.f133279in.length()) {
            return true;
        }
        return false;
    }

    public char nextClean() throws JSONException {
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == -1) {
            return 0;
        }
        return (char) nextCleanInternal;
    }

    public char next() {
        if (this.pos >= this.f133279in.length()) {
            return 0;
        }
        String str = this.f133279in;
        int i = this.pos;
        this.pos = i + 1;
        return str.charAt(i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(" at character ");
        sb.append(this.pos);
        sb.append(" of ");
        sb.append(this.f133279in);
        return sb.toString();
    }

    public Object nextValue() throws JSONException {
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == -1) {
            throw syntaxError("End of input");
        } else if (nextCleanInternal == 34 || nextCleanInternal == 39) {
            return nextString((char) nextCleanInternal);
        } else {
            if (nextCleanInternal == 91) {
                return readArray();
            }
            if (nextCleanInternal == 123) {
                return readObject();
            }
            this.pos--;
            return readLiteral();
        }
    }

    private int nextCleanInternal() throws JSONException {
        while (this.pos < this.f133279in.length()) {
            String str = this.f133279in;
            int i = this.pos;
            this.pos = i + 1;
            char charAt = str.charAt(i);
            if (!(charAt == 13 || charAt == ' ')) {
                if (charAt != '/') {
                    switch (charAt) {
                        case 9:
                        case 10:
                            break;
                        default:
                            return charAt;
                    }
                } else if (this.pos == this.f133279in.length()) {
                    return charAt;
                } else {
                    char charAt2 = this.f133279in.charAt(this.pos);
                    if (charAt2 != '*' && charAt2 != '/') {
                        return charAt;
                    }
                    skipComment();
                }
            }
        }
        return -1;
    }

    private JSONArray readArray() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        boolean z = false;
        while (true) {
            int nextCleanInternal = nextCleanInternal();
            if (nextCleanInternal != -1) {
                if (nextCleanInternal == 44 || nextCleanInternal == 59) {
                    jSONArray.put((Object) null);
                } else if (nextCleanInternal != 93) {
                    this.pos--;
                    jSONArray.put(nextValue());
                    int nextCleanInternal2 = nextCleanInternal();
                    if (!(nextCleanInternal2 == 44 || nextCleanInternal2 == 59)) {
                        if (nextCleanInternal2 == 93) {
                            return jSONArray;
                        }
                        throw syntaxError("Unterminated array");
                    }
                } else {
                    if (z) {
                        jSONArray.put((Object) null);
                    }
                    return jSONArray;
                }
                z = true;
            } else {
                throw syntaxError("Unterminated array");
            }
        }
    }

    private char readEscapeCharacter() throws JSONException {
        String str = this.f133279in;
        int i = this.pos;
        this.pos = i + 1;
        char charAt = str.charAt(i);
        if (charAt == 'b') {
            return 8;
        }
        if (charAt == 'f') {
            return 12;
        }
        if (charAt == 'n') {
            return 10;
        }
        if (charAt == 'r') {
            return 13;
        }
        switch (charAt) {
            case 't':
                return 9;
            case 'u':
                if (this.pos + 4 <= this.f133279in.length()) {
                    String substring = this.f133279in.substring(this.pos, this.pos + 4);
                    this.pos += 4;
                    return (char) Integer.parseInt(substring, 16);
                }
                throw syntaxError("Unterminated escape sequence");
            default:
                return charAt;
        }
    }

    private void skipComment() throws JSONException {
        String str = this.f133279in;
        int i = this.pos;
        this.pos = i + 1;
        if (str.charAt(i) == '*') {
            int indexOf = this.f133279in.indexOf("*/", this.pos);
            if (indexOf != -1) {
                this.pos = indexOf + 2;
                return;
            }
            throw syntaxError("Unterminated comment");
        }
        while (this.pos < this.f133279in.length()) {
            char charAt = this.f133279in.charAt(this.pos);
            if (charAt == 13 || charAt == 10) {
                this.pos++;
                return;
            }
            this.pos++;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0087 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object readLiteral() throws org.eclipse.mat.json.JSONException {
        /*
            r6 = this;
            java.lang.String r0 = "{}[]/\\:,=;# \t\f"
            java.lang.String r0 = r6.nextToInternal(r0)
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0092
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0017
            java.lang.Object r0 = org.eclipse.mat.json.JSONObject.NULL
            return r0
        L_0x0017:
            java.lang.String r1 = "true"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x0022
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0022:
            java.lang.String r1 = "false"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L_0x002d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x002d:
            r1 = 46
            int r1 = r0.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0087
            r1 = 10
            java.lang.String r2 = "0x"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L_0x0063
            java.lang.String r2 = "0X"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x0049
            goto L_0x0063
        L_0x0049:
            java.lang.String r2 = "0"
            boolean r2 = r0.startsWith(r2)
            if (r2 == 0) goto L_0x005f
            int r2 = r0.length()
            r3 = 1
            if (r2 <= r3) goto L_0x005f
            java.lang.String r1 = r0.substring(r3)
            r2 = 8
            goto L_0x006a
        L_0x005f:
            r1 = r0
            r2 = 10
            goto L_0x006a
        L_0x0063:
            r1 = 2
            java.lang.String r1 = r0.substring(r1)
            r2 = 16
        L_0x006a:
            long r1 = java.lang.Long.parseLong(r1, r2)     // Catch:{ NumberFormatException -> 0x0087 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0082
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0082
            int r1 = (int) r1     // Catch:{ NumberFormatException -> 0x0087 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0087 }
            return r1
        L_0x0082:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0087 }
            return r1
        L_0x0087:
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x008c }
            return r1
        L_0x008c:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            return r1
        L_0x0092:
            java.lang.String r0 = "Expected literal value"
            org.eclipse.mat.json.JSONException r0 = r6.syntaxError(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.json.JSONTokener.readLiteral():java.lang.Object");
    }

    private JSONObject readObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int nextCleanInternal = nextCleanInternal();
        if (nextCleanInternal == 125) {
            return jSONObject;
        }
        if (nextCleanInternal != -1) {
            this.pos--;
        }
        while (true) {
            Object nextValue = nextValue();
            if (nextValue instanceof String) {
                int nextCleanInternal2 = nextCleanInternal();
                if (nextCleanInternal2 == 58 || nextCleanInternal2 == 61) {
                    if (this.pos < this.f133279in.length() && this.f133279in.charAt(this.pos) == '>') {
                        this.pos++;
                    }
                    jSONObject.put((String) nextValue, nextValue());
                    int nextCleanInternal3 = nextCleanInternal();
                    if (nextCleanInternal3 != 44 && nextCleanInternal3 != 59) {
                        if (nextCleanInternal3 == 125) {
                            return jSONObject;
                        }
                        throw syntaxError("Unterminated object");
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Expected ':' after ");
                    sb.append(nextValue);
                    throw syntaxError(sb.toString());
                }
            } else if (nextValue == null) {
                throw syntaxError("Names cannot be null");
            } else {
                StringBuilder sb2 = new StringBuilder("Names must be strings, but ");
                sb2.append(nextValue);
                sb2.append(" is of type ");
                sb2.append(nextValue.getClass().getName());
                throw syntaxError(sb2.toString());
            }
        }
    }

    public JSONTokener(String str) {
        this.f133279in = str;
    }

    public String nextTo(char c) {
        return nextToInternal(String.valueOf(c)).trim();
    }

    public char skipTo(char c) {
        int indexOf = this.f133279in.indexOf(c, this.pos);
        if (indexOf == -1) {
            return 0;
        }
        this.pos = indexOf;
        return c;
    }

    public String nextTo(String str) {
        if (str != null) {
            return nextToInternal(str).trim();
        }
        throw new NullPointerException();
    }

    public void skipPast(String str) {
        int i;
        int indexOf = this.f133279in.indexOf(str, this.pos);
        if (indexOf == -1) {
            i = this.f133279in.length();
        } else {
            i = str.length() + indexOf;
        }
        this.pos = i;
    }

    public JSONException syntaxError(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this);
        return new JSONException(sb.toString());
    }

    private String nextToInternal(String str) {
        int i = this.pos;
        while (this.pos < this.f133279in.length()) {
            char charAt = this.f133279in.charAt(this.pos);
            if (charAt == 13 || charAt == 10 || str.indexOf(charAt) != -1) {
                return this.f133279in.substring(i, this.pos);
            }
            this.pos++;
        }
        return this.f133279in.substring(i);
    }

    public char next(char c) throws JSONException {
        char next = next();
        if (next == c) {
            return next;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(c);
        sb.append(" but was ");
        sb.append(next);
        throw syntaxError(sb.toString());
    }

    public String next(int i) throws JSONException {
        if (this.pos + i <= this.f133279in.length()) {
            String substring = this.f133279in.substring(this.pos, this.pos + i);
            this.pos += i;
            return substring;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is out of bounds");
        throw syntaxError(sb.toString());
    }

    public String nextString(char c) throws JSONException {
        int i = this.pos;
        StringBuilder sb = null;
        while (this.pos < this.f133279in.length()) {
            String str = this.f133279in;
            int i2 = this.pos;
            this.pos = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt == c) {
                if (sb == null) {
                    return new String(this.f133279in.substring(i, this.pos - 1));
                }
                sb.append(this.f133279in, i, this.pos - 1);
                return sb.toString();
            } else if (charAt == '\\') {
                if (this.pos != this.f133279in.length()) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(this.f133279in, i, this.pos - 1);
                    sb.append(readEscapeCharacter());
                    i = this.pos;
                } else {
                    throw syntaxError("Unterminated escape sequence");
                }
            }
        }
        throw syntaxError("Unterminated string");
    }
}
