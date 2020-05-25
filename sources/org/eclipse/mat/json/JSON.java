package org.eclipse.mat.json;

public class JSON {
    static String toString(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    static Boolean toBoolean(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return Boolean.valueOf((String) obj);
        }
        return null;
    }

    static double checkDouble(double d) throws JSONException {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            return d;
        }
        StringBuilder sb = new StringBuilder("Forbidden numeric value: ");
        sb.append(d);
        throw new JSONException(sb.toString());
    }

    static Double toDouble(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf((String) obj);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    static Integer toInteger(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf((int) Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    static Long toLong(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf((long) Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static JSONException typeMismatch(Object obj, String str) throws JSONException {
        if (obj == null) {
            throw new JSONException("Value is null.");
        }
        StringBuilder sb = new StringBuilder("Value ");
        sb.append(obj);
        sb.append(" of type ");
        sb.append(obj.getClass().getName());
        sb.append(" cannot be converted to ");
        sb.append(str);
        throw new JSONException(sb.toString());
    }

    public static void put(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject != null && str != null && str.length() != 0) {
            try {
                jSONObject.put(str, obj);
            } catch (JSONException unused) {
            }
        }
    }

    public static JSONException typeMismatch(Object obj, Object obj2, String str) throws JSONException {
        if (obj2 == null) {
            StringBuilder sb = new StringBuilder("Value at ");
            sb.append(obj);
            sb.append(" is null.");
            throw new JSONException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Value ");
        sb2.append(obj2);
        sb2.append(" at ");
        sb2.append(obj);
        sb2.append(" of type ");
        sb2.append(obj2.getClass().getName());
        sb2.append(" cannot be converted to ");
        sb2.append(str);
        throw new JSONException(sb2.toString());
    }
}
