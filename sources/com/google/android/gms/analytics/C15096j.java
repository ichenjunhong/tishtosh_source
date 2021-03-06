package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.C15096j;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.analytics.j */
public abstract class C15096j<T extends C15096j> {
    /* renamed from: a */
    public abstract void mo27841a(T t);

    /* renamed from: a */
    public static String m31260a(Map map) {
        return m31259a(map, 1);
    }

    /* renamed from: a */
    public static String m31258a(Object obj) {
        return m31259a(obj, 0);
    }

    /* renamed from: a */
    private static String m31259a(Object obj, int i) {
        if (i > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (TextUtils.isEmpty((String) obj)) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof Boolean) {
            if (!((Boolean) obj).booleanValue()) {
                return "";
            }
            return obj.toString();
        } else if (obj instanceof List) {
            StringBuilder sb = new StringBuilder();
            if (i > 0) {
                sb.append("[");
            }
            List list = (List) obj;
            int length = sb.length();
            for (Object next : list) {
                if (sb.length() > length) {
                    sb.append(", ");
                }
                sb.append(m31259a(next, i + 1));
            }
            if (i > 0) {
                sb.append("]");
            }
            return sb.toString();
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            boolean z = false;
            int i2 = 0;
            for (Entry entry : new TreeMap((Map) obj).entrySet()) {
                String a = m31259a(entry.getValue(), i + 1);
                if (!TextUtils.isEmpty(a)) {
                    if (i > 0 && !z) {
                        sb2.append("{");
                        i2 = sb2.length();
                        z = true;
                    }
                    if (sb2.length() > i2) {
                        sb2.append(", ");
                    }
                    sb2.append((String) entry.getKey());
                    sb2.append('=');
                    sb2.append(a);
                }
            }
            if (z) {
                sb2.append("}");
            }
            return sb2.toString();
        }
    }
}
