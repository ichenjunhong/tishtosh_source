package com.p683ss.android.ugc.aweme.player;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.player.p2051ab.C38843a;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.abr.PlayerAbABREnableExp;
import com.p683ss.android.ugc.aweme.video.experiment.PlayeAbReuseEngineExp;

/* renamed from: com.ss.android.ugc.aweme.player.c */
public final class C38850c {

    /* renamed from: a */
    public static final boolean f98948a = false;

    /* renamed from: b */
    public static final boolean f98949b = false;

    /* renamed from: c */
    public static C38843a f98950c = null;

    /* renamed from: d */
    public static String f98951d = null;

    /* renamed from: e */
    public static int f98952e = -1;

    /* renamed from: f */
    private static Boolean f98953f;

    /* renamed from: a */
    public static int m86283a() {
        int i = f98952e + 1;
        f98952e = i;
        return i;
    }

    /* renamed from: e */
    private static String m86288e() {
        try {
            if (f98951d == null) {
                f98951d = Build.HARDWARE;
            }
        } catch (Throwable unused) {
            f98951d = null;
        }
        return f98951d;
    }

    /* renamed from: c */
    public static boolean m86286c() {
        if (m86288e() == null || !m86288e().toLowerCase().startsWith("mt")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m86287d() {
        if (C10181b.m20511a().mo18168a(PlayeAbReuseEngineExp.class, true, "player_reuse_engine", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m86285b() {
        if (f98953f == null) {
            boolean z = true;
            if (C10181b.m20511a().mo18168a(PlayerAbABREnableExp.class, true, "player_abr_enable", 31744, 0) != 1) {
                z = false;
            }
            f98953f = Boolean.valueOf(z);
        }
        return f98953f.booleanValue();
    }

    /* renamed from: a */
    public static String m86284a(String str, int i) {
        if (!TextUtils.isEmpty(str) && str.length() > i) {
            return str.substring(0, i - 1);
        }
        return str;
    }
}
