package com.bytedance.android.livesdkapi.depend.p438f;

import android.content.SharedPreferences;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdkapi.depend.f.b */
public final class C8631b {

    /* renamed from: a */
    static Map<String, Map<String, Object>> f23616a = new HashMap();

    /* renamed from: b */
    static C17971f f23617b = C2942b.m8369a();

    /* renamed from: a */
    private static boolean m17036a(String str, String str2, boolean z) {
        return m17032a(str).getBoolean(str2, z);
    }

    /* renamed from: a */
    static SharedPreferences m17032a(String str) {
        return C35807d.m80935a(((IHostContext) C4116c.m10249a(IHostContext.class)).context(), str, 0);
    }

    /* renamed from: a */
    public static <T> T m17033a(C8630a<T> aVar) {
        if (aVar.f23615d == Boolean.class) {
            return Boolean.valueOf(m17036a(aVar.f23613b, aVar.f23612a, ((Boolean) aVar.f23614c).booleanValue()));
        }
        if (aVar.f23615d == Integer.class || aVar.f23615d == Short.class) {
            return Integer.valueOf(m17030a(aVar.f23613b, aVar.f23612a, ((Integer) aVar.f23614c).intValue()));
        }
        if (aVar.f23615d == Float.class) {
            return Float.valueOf(m17029a(aVar.f23613b, aVar.f23612a, ((Float) aVar.f23614c).floatValue()));
        }
        if (aVar.f23615d == Long.class) {
            return Long.valueOf(m17031a(aVar.f23613b, aVar.f23612a, ((Long) aVar.f23614c).longValue()));
        }
        if (aVar.f23615d == Double.class) {
            return Double.valueOf(m17028a(aVar.f23613b, aVar.f23612a, ((Double) aVar.f23614c).doubleValue()));
        }
        if (aVar.f23615d == String.class) {
            return m17035a(aVar.f23613b, aVar.f23612a, (String) aVar.f23614c);
        }
        return m17034a(aVar.f23613b, aVar.f23612a, aVar.f23615d, aVar.f23614c);
    }

    /* renamed from: a */
    private static float m17029a(String str, String str2, float f) {
        return m17032a(str).getFloat(str2, f);
    }

    /* renamed from: a */
    private static double m17028a(String str, String str2, double d) {
        try {
            return Double.parseDouble(m17032a(str).getString(str2, String.valueOf(d)));
        } catch (Exception unused) {
            return d;
        }
    }

    /* renamed from: a */
    private static int m17030a(String str, String str2, int i) {
        return m17032a(str).getInt(str2, i);
    }

    /* renamed from: a */
    private static long m17031a(String str, String str2, long j) {
        return m17032a(str).getLong(str2, j);
    }

    /* renamed from: a */
    private static String m17035a(String str, String str2, String str3) {
        return m17032a(str).getString(str2, str3);
    }

    /* renamed from: a */
    private static <T> T m17034a(String str, String str2, Class<T> cls, T t) {
        Map map = (Map) f23616a.get(str);
        if (map == null) {
            map = new HashMap();
            f23616a.put(str, map);
        }
        try {
            if (map.containsKey(str2)) {
                return map.get(str2);
            }
            T a = f23617b.mo34884a(m17032a(str).getString(str2, ""), cls);
            if (a == null) {
                map.remove(str2);
                return t;
            }
            map.put(str2, a);
            return a;
        } catch (Exception unused) {
            map.remove(str2);
            return t;
        }
    }
}
