package com.bytedance.apm.p498p.p500b;

import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.bytedance.apm.p.b.a */
public final class C9172a {

    /* renamed from: a */
    private static HashMap<String, Integer> f25122a = new HashMap<>();

    static {
        m18197a("com.ss.android.ugc.aweme.splash.SplashActivity", R.id.z0);
        m18197a("com.ss.android.ugc.aweme.following.ui.FollowingFollowerActivity", R.id.ay2);
        m18197a("com.ss.android.ugc.aweme.main.MainActivity", R.id.a22);
    }

    /* renamed from: a */
    public static Integer m18196a(String str) {
        return (Integer) f25122a.get(str);
    }

    /* renamed from: a */
    private static void m18197a(String str, int i) {
        f25122a.put(str, Integer.valueOf(i));
    }
}
