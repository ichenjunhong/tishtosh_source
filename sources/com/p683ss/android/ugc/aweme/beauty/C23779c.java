package com.p683ss.android.ugc.aweme.beauty;

import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.beauty.c */
public final class C23779c {

    /* renamed from: a */
    public static final C23779c f63369a = new C23779c();

    /* renamed from: b */
    private static final SharedPreferences f63370b = C35807d.m80935a(C39629l.m88233b(), "beauty_params", 0);

    private C23779c() {
    }

    /* renamed from: c */
    private static String m58362c(int i, String str) {
        StringBuilder sb = new StringBuilder("beauty_params_default");
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    private static String m58363d(int i, String str) {
        StringBuilder sb = new StringBuilder("beauty_params_max");
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static final float m58358a(int i, String str) {
        float f;
        C52711k.m112240b(str, "gender");
        float f2 = f63370b.getFloat(m58362c(i, str), -1.0f);
        if (f2 != -1.0f) {
            return f2;
        }
        if (!C52711k.m112239a((Object) str, (Object) "0")) {
            f = f63370b.getFloat(m58362c(i, "0"), -1.0f);
        } else {
            f = f63370b.getFloat(m58362c(i, "2"), -1.0f);
        }
        return f;
    }

    /* renamed from: b */
    public static final float m58360b(int i, String str) {
        float f;
        C52711k.m112240b(str, "gender");
        float f2 = f63370b.getFloat(m58363d(i, str), -1.0f);
        if (f2 != -1.0f) {
            return f2;
        }
        if (!C52711k.m112239a((Object) str, (Object) "0")) {
            f = f63370b.getFloat(m58363d(i, "0"), -1.0f);
        } else {
            f = f63370b.getFloat(m58363d(i, "2"), -1.0f);
        }
        return f;
    }

    /* renamed from: a */
    public static final void m58359a(int i, String str, float f) {
        C52711k.m112240b(str, "gender");
        f63370b.edit().putFloat(m58362c(i, str), f).commit();
    }

    /* renamed from: b */
    public static final void m58361b(int i, String str, float f) {
        C52711k.m112240b(str, "gender");
        f63370b.edit().putFloat(m58363d(i, str), f).commit();
    }
}
