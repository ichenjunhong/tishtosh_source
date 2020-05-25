package org.eclipse.mat.json;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JSONArray {
    private final List<Object> values;

    public JSONArray put(boolean z) {
        this.values.add(Boolean.valueOf(z));
        return this;
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public int length() {
        return this.values.size();
    }

    public JSONArray() {
        this.values = new ArrayList();
    }

    public String toString() {
        try {
            JSONStringer jSONStringer = new JSONStringer();
            writeTo(jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    public boolean optBoolean(int i) {
        return optBoolean(i, false);
    }

    public double optDouble(int i) {
        return optDouble(i, Double.NaN);
    }

    public int optInt(int i) {
        return optInt(i, 0);
    }

    public long optLong(int i) {
        return optLong(i, 0);
    }

    public String optString(int i) {
        return optString(i, "");
    }

    public JSONArray put(Object obj) {
        this.values.add(obj);
        return this;
    }

    public boolean isNull(int i) {
        Object opt = opt(i);
        if (opt == null || opt == JSONObject.NULL) {
            return true;
        }
        return false;
    }

    public JSONArray optJSONArray(int i) {
        Object opt = opt(i);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject optJSONObject(int i) {
        Object opt = opt(i);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    public JSONArray put(double d) throws JSONException {
        this.values.add(Double.valueOf(JSON.checkDouble(d)));
        return this;
    }

    public JSONArray(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof JSONArray) || !((JSONArray) obj).values.equals(this.values)) {
            return false;
        }
        return true;
    }

    public boolean getBoolean(int i) throws JSONException {
        Object obj = get(i);
        Boolean bool = JSON.toBoolean(obj);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "boolean");
    }

    public double getDouble(int i) throws JSONException {
        Object obj = get(i);
        Double d = JSON.toDouble(obj);
        if (d != null) {
            return d.doubleValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "double");
    }

    public int getInt(int i) throws JSONException {
        Object obj = get(i);
        Integer integer = JSON.toInteger(obj);
        if (integer != null) {
            return integer.intValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "int");
    }

    public JSONArray getJSONArray(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "JSONArray");
    }

    public JSONObject getJSONObject(int i) throws JSONException {
        Object obj = get(i);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "JSONObject");
    }

    public long getLong(int i) throws JSONException {
        Object obj = get(i);
        Long l = JSON.toLong(obj);
        if (l != null) {
            return l.longValue();
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "long");
    }

    public String getString(int i) throws JSONException {
        Object obj = get(i);
        String json = JSON.toString(obj);
        if (json != null) {
            return json;
        }
        throw JSON.typeMismatch(Integer.valueOf(i), obj, "String");
    }

    public Object opt(int i) {
        if (i < 0 || i >= this.values.size()) {
            return null;
        }
        return this.values.get(i);
    }

    public JSONArray put(int i) {
        this.values.add(Integer.valueOf(i));
        return this;
    }

    public String toString(int i) throws JSONException {
        JSONStringer jSONStringer = new JSONStringer(i);
        writeTo(jSONStringer);
        return jSONStringer.toString();
    }

    /* access modifiers changed from: 0000 */
    public void writeTo(JSONStringer jSONStringer) throws JSONException {
        jSONStringer.array();
        for (Object value : this.values) {
            jSONStringer.value(value);
        }
        jSONStringer.endArray();
    }

    public JSONArray(Collection collection) {
        this();
        this.values.addAll(collection);
    }

    public String join(String str) throws JSONException {
        JSONStringer jSONStringer = new JSONStringer();
        jSONStringer.open(Scope.NULL, "");
        int size = this.values.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                jSONStringer.out.append(str);
            }
            jSONStringer.value(this.values.get(i));
        }
        Scope scope = Scope.NULL;
        jSONStringer.close(scope, scope, "");
        return jSONStringer.out.toString();
    }

    public JSONObject toJSONObject(JSONArray jSONArray) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        int min = Math.min(jSONArray.length(), this.values.size());
        if (min == 0) {
            return null;
        }
        for (int i = 0; i < min; i++) {
            jSONObject.put(JSON.toString(jSONArray.opt(i)), opt(i));
        }
        return jSONObject;
    }

    public JSONArray(JSONTokener jSONTokener) throws JSONException {
        Object nextValue = jSONTokener.nextValue();
        if (nextValue instanceof JSONArray) {
            this.values = ((JSONArray) nextValue).values;
            return;
        }
        throw JSON.typeMismatch(nextValue, "JSONArray");
    }

    public Object get(int i) throws JSONException {
        try {
            Object obj = this.values.get(i);
            if (obj != null) {
                return obj;
            }
            StringBuilder sb = new StringBuilder("Value at ");
            sb.append(i);
            sb.append(" is null.");
            throw new JSONException(sb.toString());
        } catch (IndexOutOfBoundsException unused) {
            StringBuilder sb2 = new StringBuilder("Index ");
            sb2.append(i);
            sb2.append(" out of range [0..");
            sb2.append(this.values.size());
            sb2.append(")");
            throw new JSONException(sb2.toString());
        }
    }

    public JSONArray put(long j) {
        this.values.add(Long.valueOf(j));
        return this;
    }

    public boolean optBoolean(int i, boolean z) {
        Boolean bool = JSON.toBoolean(opt(i));
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public double optDouble(int i, double d) {
        Double d2 = JSON.toDouble(opt(i));
        if (d2 != null) {
            return d2.doubleValue();
        }
        return d;
    }

    public int optInt(int i, int i2) {
        Integer integer = JSON.toInteger(opt(i));
        if (integer != null) {
            return integer.intValue();
        }
        return i2;
    }

    public long optLong(int i, long j) {
        Long l = JSON.toLong(opt(i));
        if (l != null) {
            return l.longValue();
        }
        return j;
    }

    public String optString(int i, String str) {
        String json = JSON.toString(opt(i));
        if (json != null) {
            return json;
        }
        return str;
    }

    public JSONArray put(int i, double d) throws JSONException {
        return put(i, (Object) Double.valueOf(d));
    }

    public JSONArray put(int i, int i2) throws JSONException {
        return put(i, (Object) Integer.valueOf(i2));
    }

    public JSONArray put(int i, long j) throws JSONException {
        return put(i, (Object) Long.valueOf(j));
    }

    public JSONArray put(int i, Object obj) throws JSONException {
        if (obj instanceof Number) {
            JSON.checkDouble(((Number) obj).doubleValue());
        }
        while (this.values.size() <= i) {
            this.values.add(null);
        }
        this.values.set(i, obj);
        return this;
    }

    public JSONArray put(int i, boolean z) throws JSONException {
        return put(i, (Object) Boolean.valueOf(z));
    }
}
