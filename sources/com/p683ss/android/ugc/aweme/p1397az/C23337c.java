package com.p683ss.android.ugc.aweme.p1397az;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Pair;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.az.c */
public final class C23337c {

    /* renamed from: a */
    public static volatile int f62343a = 0;

    /* renamed from: b */
    private static final List<String> f62344b = Arrays.asList(new String[]{"REDMI 6A", "VIVO 1812", "MRD-LX1F", "VIVO 1908", "MRD-LX1", "AMN-LX9", "TECNO ID3K", "TECNO KB2", "TECNO KB3", "KSA-LX9", "INFINIX X627V"});

    /* renamed from: a */
    public static boolean m57398a() {
        return C23341d.m57403a();
    }

    /* renamed from: c */
    public static boolean m57400c() {
        return C23341d.m57404b();
    }

    /* renamed from: b */
    public static boolean m57399b() {
        if (f62343a == -1 || f62343a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m57401d() {
        if (f62343a == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m57397a(C23335b bVar) {
        if (!m57398a()) {
            bVar.mo48399a();
        }
    }

    /* renamed from: a */
    public static Pair<Integer, String> m57395a(Context context) {
        if (VERSION.SDK_INT < 23) {
            return new Pair<>(Integer.valueOf(-1), "Android 6.0以下版本");
        }
        long a = C23331a.m57388a(context);
        if (a <= 1287651328) {
            return new Pair<>(Integer.valueOf(-1), "内存1.2G及以下");
        }
        if (a <= 1610612736) {
            return new Pair<>(Integer.valueOf(1), "1.5G内存及以下");
        }
        int a2 = C23331a.m57385a();
        int b = C23331a.m57390b();
        if (a2 <= 4 && b <= 2048000) {
            return new Pair<>(Integer.valueOf(1), "4核及以下 && 主频低于2GHZ");
        }
        if (a <= 2147483648L && VERSION.SDK_INT < 24) {
            return new Pair<>(Integer.valueOf(1), "内存2G及以下 && Android7.0以下");
        }
        if (b > 0 && b <= 1620000) {
            return new Pair<>(Integer.valueOf(1), "主频低于1.6GHZ");
        }
        String str = Build.MODEL;
        for (String equalsIgnoreCase : f62344b) {
            if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                Integer valueOf = Integer.valueOf(1);
                StringBuilder sb = new StringBuilder("过滤单独机型为低端机： ");
                sb.append(str);
                return new Pair<>(valueOf, sb.toString());
            }
        }
        return new Pair<>(Integer.valueOf(0), "");
    }

    /* renamed from: a */
    public static void m57396a(Context context, int i) {
        if (context != null) {
            SharedPreferences a = C35807d.m80935a(context, "performance_sp", 0);
            if (a.getInt("update_version", -1) != 2) {
                f62343a = ((Integer) m57395a(context).first).intValue();
                a.edit().putInt("update_version", 2).putInt("performance_poor_score", f62343a).apply();
            } else if (a.contains("performance_poor_score")) {
                f62343a = a.getInt("performance_poor_score", 0);
            } else {
                if (a.getBoolean("is_performance_poor", false)) {
                    f62343a = 1;
                }
            }
        }
    }
}
