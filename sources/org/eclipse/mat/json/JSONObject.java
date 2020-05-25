package org.eclipse.mat.json;

import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class JSONObject {
    private static final Double NEGATIVE_ZERO = Double.valueOf(-0.0d);
    public static final Object NULL = new Object() {
        public final boolean equals(Object obj) {
            return obj == this || obj == null;
        }

        public final String toString() {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
    };
    private final Map<String, Object> nameValuePairs;

    public int length() {
        return this.nameValuePairs.size();
    }

    public JSONObject() {
        this.nameValuePairs = new HashMap();
    }

    public Iterator keys() {
        return this.nameValuePairs.keySet().iterator();
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

    public JSONArray names() {
        if (this.nameValuePairs.isEmpty()) {
            return null;
        }
        return new JSONArray((Collection) new ArrayList(this.nameValuePairs.keySet()));
    }

    public boolean has(String str) {
        return this.nameValuePairs.containsKey(str);
    }

    public Object opt(String str) {
        return this.nameValuePairs.get(str);
    }

    public boolean optBoolean(String str) {
        return optBoolean(str, false);
    }

    public double optDouble(String str) {
        return optDouble(str, Double.NaN);
    }

    public int optInt(String str) {
        return optInt(str, 0);
    }

    public long optLong(String str) {
        return optLong(str, 0);
    }

    public String optString(String str) {
        return optString(str, "");
    }

    public Object remove(String str) {
        return this.nameValuePairs.remove(str);
    }

    /* access modifiers changed from: 0000 */
    public String checkName(String str) throws JSONException {
        if (str != null) {
            return str;
        }
        throw new JSONException("Names must be non-null");
    }

    public JSONArray optJSONArray(String str) {
        Object opt = opt(str);
        if (opt instanceof JSONArray) {
            return (JSONArray) opt;
        }
        return null;
    }

    public JSONObject optJSONObject(String str) {
        Object opt = opt(str);
        if (opt instanceof JSONObject) {
            return (JSONObject) opt;
        }
        return null;
    }

    public JSONObject(String str) throws JSONException {
        this(new JSONTokener(str));
    }

    public Object get(String str) throws JSONException {
        Object obj = this.nameValuePairs.get(str);
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder("No value for ");
        sb.append(str);
        throw new JSONException(sb.toString());
    }

    public boolean getBoolean(String str) throws JSONException {
        Object obj = get(str);
        Boolean bool = JSON.toBoolean(obj);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw JSON.typeMismatch(str, obj, "boolean");
    }

    public double getDouble(String str) throws JSONException {
        Object obj = get(str);
        Double d = JSON.toDouble(obj);
        if (d != null) {
            return d.doubleValue();
        }
        throw JSON.typeMismatch(str, obj, "double");
    }

    public int getInt(String str) throws JSONException {
        Object obj = get(str);
        Integer integer = JSON.toInteger(obj);
        if (integer != null) {
            return integer.intValue();
        }
        throw JSON.typeMismatch(str, obj, "int");
    }

    public JSONArray getJSONArray(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw JSON.typeMismatch(str, obj, "JSONArray");
    }

    public JSONObject getJSONObject(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw JSON.typeMismatch(str, obj, "JSONObject");
    }

    public long getLong(String str) throws JSONException {
        Object obj = get(str);
        Long l = JSON.toLong(obj);
        if (l != null) {
            return l.longValue();
        }
        throw JSON.typeMismatch(str, obj, "long");
    }

    public String getString(String str) throws JSONException {
        Object obj = get(str);
        String json = JSON.toString(obj);
        if (json != null) {
            return json;
        }
        throw JSON.typeMismatch(str, obj, "String");
    }

    public boolean isNull(String str) {
        Object obj = this.nameValuePairs.get(str);
        if (obj == null || obj == NULL) {
            return true;
        }
        return false;
    }

    public String toString(int i) throws JSONException {
        JSONStringer jSONStringer = new JSONStringer(i);
        writeTo(jSONStringer);
        return jSONStringer.toString();
    }

    public JSONObject(Map map) {
        this();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                this.nameValuePairs.put(str, entry.getValue());
            } else {
                throw new NullPointerException();
            }
        }
    }

    public static String numberToString(Number number) throws JSONException {
        if (number != null) {
            double doubleValue = number.doubleValue();
            JSON.checkDouble(doubleValue);
            if (number.equals(NEGATIVE_ZERO)) {
                return "-0";
            }
            long longValue = number.longValue();
            if (doubleValue == ((double) longValue)) {
                return Long.toString(longValue);
            }
            return number.toString();
        }
        throw new JSONException("Number must be non-null");
    }

    public static String quote(String str) {
        if (str == null) {
            return "\"\"";
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            jSONStringer.open(Scope.NULL, "");
            jSONStringer.value((Object) str);
            Scope scope = Scope.NULL;
            jSONStringer.close(scope, scope, "");
            return jSONStringer.toString();
        } catch (JSONException unused) {
            throw new AssertionError();
        }
    }

    public JSONArray toJSONArray(JSONArray jSONArray) throws JSONException {
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        if (length == 0) {
            return null;
        }
        for (int i = 0; i < length; i++) {
            jSONArray2.put(opt(JSON.toString(jSONArray.opt(i))));
        }
        return jSONArray2;
    }

    /* access modifiers changed from: 0000 */
    public void writeTo(JSONStringer jSONStringer) throws JSONException {
        jSONStringer.object();
        for (Entry entry : this.nameValuePairs.entrySet()) {
            jSONStringer.key((String) entry.getKey()).value(entry.getValue());
        }
        jSONStringer.endObject();
    }

    public JSONObject(JSONTokener jSONTokener) throws JSONException {
        Object nextValue = jSONTokener.nextValue();
        if (nextValue instanceof JSONObject) {
            this.nameValuePairs = ((JSONObject) nextValue).nameValuePairs;
            return;
        }
        throw JSON.typeMismatch(nextValue, "JSONObject");
    }

    public boolean optBoolean(String str, boolean z) {
        Boolean bool = JSON.toBoolean(opt(str));
        if (bool != null) {
            return bool.booleanValue();
        }
        return z;
    }

    public double optDouble(String str, double d) {
        Double d2 = JSON.toDouble(opt(str));
        if (d2 != null) {
            return d2.doubleValue();
        }
        return d;
    }

    public int optInt(String str, int i) {
        Integer integer = JSON.toInteger(opt(str));
        if (integer != null) {
            return integer.intValue();
        }
        return i;
    }

    public long optLong(String str, long j) {
        Long l = JSON.toLong(opt(str));
        if (l != null) {
            return l.longValue();
        }
        return j;
    }

    public String optString(String str, String str2) {
        String json = JSON.toString(opt(str));
        if (json != null) {
            return json;
        }
        return str2;
    }

    public JSONObject put(String str, int i) throws JSONException {
        this.nameValuePairs.put(checkName(str), Integer.valueOf(i));
        return this;
    }

    public JSONObject putOpt(String str, Object obj) throws JSONException {
        if (str == null || obj == null) {
            return this;
        }
        return put(str, obj);
    }

    public JSONObject put(String str, double d) throws JSONException {
        this.nameValuePairs.put(checkName(str), Double.valueOf(JSON.checkDouble(d)));
        return this;
    }

    public JSONObject accumulate(String str, Object obj) throws JSONException {
        Object obj2 = this.nameValuePairs.get(checkName(str));
        if (obj2 == null) {
            return put(str, obj);
        }
        if (obj instanceof Number) {
            JSON.checkDouble(((Number) obj).doubleValue());
        }
        if (obj2 instanceof JSONArray) {
            ((JSONArray) obj2).put(obj);
        } else {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(obj2);
            jSONArray.put(obj);
            this.nameValuePairs.put(str, jSONArray);
        }
        return this;
    }

    public JSONObject put(String str, long j) throws JSONException {
        this.nameValuePairs.put(checkName(str), Long.valueOf(j));
        return this;
    }

    public JSONObject(JSONObject jSONObject, String[] strArr) throws JSONException {
        this();
        for (String str : strArr) {
            Object opt = jSONObject.opt(str);
            if (opt != null) {
                this.nameValuePairs.put(str, opt);
            }
        }
    }

    public JSONObject put(String str, Object obj) throws JSONException {
        if (obj == null) {
            this.nameValuePairs.remove(str);
            return this;
        }
        if (obj instanceof Number) {
            JSON.checkDouble(((Number) obj).doubleValue());
        }
        this.nameValuePairs.put(checkName(str), obj);
        return this;
    }

    public JSONObject put(String str, boolean z) throws JSONException {
        this.nameValuePairs.put(checkName(str), Boolean.valueOf(z));
        return this;
    }
}
