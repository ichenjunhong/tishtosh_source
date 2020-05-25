package com.bytedance.android.livesdk.p272ad;

import android.content.SharedPreferences;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdkapi.depend.p438f.C8630a;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.ad.d */
public final class C4527d {

    /* renamed from: a */
    protected static C17971f f12453a = C2942b.m8369a();

    /* renamed from: b */
    private static SharedPreferences f12454b;

    /* renamed from: c */
    private static Map<String, Object> f12455c = new HashMap();

    /* renamed from: a */
    private static SharedPreferences m10917a() {
        if (f12454b == null) {
            f12454b = C35807d.m80935a(C3922z.m9915e(), "live_sdk_core", 4);
        }
        return f12454b;
    }

    /* renamed from: a */
    public static <T> T m10918a(C8630a<T> aVar) {
        if (f12455c.containsKey(aVar.f23612a)) {
            return f12455c.get(aVar.f23612a);
        }
        if (aVar.f23615d == Boolean.class) {
            T valueOf = Boolean.valueOf(m10917a().getBoolean(aVar.f23612a, ((Boolean) aVar.f23614c).booleanValue()));
            f12455c.put(aVar.f23612a, valueOf);
            return valueOf;
        } else if (aVar.f23615d == Integer.class || aVar.f23615d == Short.class) {
            T valueOf2 = Integer.valueOf(m10917a().getInt(aVar.f23612a, ((Integer) aVar.f23614c).intValue()));
            f12455c.put(aVar.f23612a, valueOf2);
            return valueOf2;
        } else if (aVar.f23615d == Float.class) {
            T valueOf3 = Float.valueOf(m10917a().getFloat(aVar.f23612a, ((Float) aVar.f23614c).floatValue()));
            f12455c.put(aVar.f23612a, valueOf3);
            return valueOf3;
        } else if (aVar.f23615d == Long.class) {
            T valueOf4 = Long.valueOf(m10917a().getLong(aVar.f23612a, ((Long) aVar.f23614c).longValue()));
            f12455c.put(aVar.f23612a, valueOf4);
            return valueOf4;
        } else if (aVar.f23615d == Double.class) {
            T valueOf5 = Double.valueOf(m10916a(aVar.f23612a, ((Double) aVar.f23614c).doubleValue()));
            f12455c.put(aVar.f23612a, valueOf5);
            return valueOf5;
        } else if (aVar.f23615d != String.class) {
            return m10919a(aVar.f23612a, aVar.f23615d, aVar.f23614c);
        } else {
            T string = m10917a().getString(aVar.f23612a, (String) aVar.f23614c);
            if (string == null) {
                f12455c.remove(aVar.f23612a);
            } else {
                f12455c.put(aVar.f23612a, string);
            }
            return string;
        }
    }

    /* renamed from: a */
    private static double m10916a(String str, double d) {
        try {
            return Double.parseDouble(m10917a().getString(str, String.valueOf(d)));
        } catch (Exception unused) {
            return d;
        }
    }

    /* renamed from: a */
    public static <T> void m10920a(C8630a aVar, T t) {
        if (t == null) {
            f12455c.remove(aVar.f23612a);
            m10917a().edit().remove(aVar.f23612a).apply();
            return;
        }
        f12455c.put(aVar.f23612a, t);
        if (aVar.f23615d == Boolean.class) {
            m10917a().edit().putBoolean(aVar.f23612a, ((Boolean) t).booleanValue()).apply();
        } else if (aVar.f23615d == Integer.class) {
            m10917a().edit().putInt(aVar.f23612a, ((Integer) t).intValue()).apply();
        } else if (aVar.f23615d == Float.class) {
            m10917a().edit().putFloat(aVar.f23612a, ((Float) t).floatValue()).apply();
        } else if (aVar.f23615d == Long.class) {
            m10917a().edit().putLong(aVar.f23612a, ((Long) t).longValue()).apply();
        } else if (aVar.f23615d == Double.class) {
            m10917a().edit().putString(aVar.f23612a, t.toString()).apply();
        } else if (aVar.f23615d == String.class) {
            m10917a().edit().putString(aVar.f23612a, (String) t).apply();
        } else {
            m10917a().edit().putString(aVar.f23612a, f12453a.mo34889b(t)).apply();
        }
    }

    /* renamed from: a */
    private static <T> T m10919a(String str, Class<T> cls, T t) {
        try {
            if (f12455c.containsKey(str)) {
                return f12455c.get(str);
            }
            T a = f12453a.mo34884a(m10917a().getString(str, ""), cls);
            if (a == null) {
                f12455c.remove(str);
            } else {
                f12455c.put(str, a);
            }
            return a;
        } catch (Exception unused) {
            f12455c.remove(str);
            return t;
        }
    }
}
