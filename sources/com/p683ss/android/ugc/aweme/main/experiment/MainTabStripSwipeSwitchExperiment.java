package com.p683ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22711b;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import p2628d.p2639f.p2641b.C52711k;

@C10178a(mo18163a = "following_foru_swipe_disable_unloginuser")
/* renamed from: com.ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment */
public final class MainTabStripSwipeSwitchExperiment {
    public static final MainTabStripSwipeSwitchExperiment INSTANCE = new MainTabStripSwipeSwitchExperiment();
    @C10179b(mo18165a = true)
    public static final int ORIGIN = 0;
    private static final String SP_NAME = "MTMainTabPreferences";
    private static final String SP_SWIPED = "swiped";
    @C10179b
    public static final int SWIPE_MODE_1 = 1;
    @C10179b
    public static final int SWIPE_MODE_2 = 2;
    private static Keva mPreferences;

    private MainTabStripSwipeSwitchExperiment() {
    }

    /* renamed from: b */
    public static boolean m82551b() {
        if (C10181b.m20511a().mo18168a(MainTabStripSwipeSwitchExperiment.class, true, "following_foru_swipe_disable_unloginuser", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m82552c() {
        if (mPreferences == null) {
            return false;
        }
        Keva keva = mPreferences;
        if (keva == null) {
            C52711k.m112234a();
        }
        return keva.getBoolean(SP_SWIPED, false);
    }

    static {
        try {
            mPreferences = Keva.getRepoFromSp(C11010c.m22280a(), SP_NAME, 0);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("SharedPreferencesAnnotatedManager getSP failed ");
            sb.append(th.getMessage());
            C47625i.m103103a(sb.toString());
        }
    }

    /* renamed from: a */
    public static boolean m82550a() {
        if (C10181b.m20511a().mo18168a(MainTabStripSwipeSwitchExperiment.class, true, "following_foru_swipe_disable_unloginuser", 31744, 0) != 0 && !C47915gg.m103651b()) {
            C22711b d = C23794bh.m58390d();
            C52711k.m112236a((Object) d, "LegacyServiceUtils.getTimeLockRulerService()");
            if (!d.mo47105b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m82549a(boolean z) {
        Keva keva = mPreferences;
        if (keva != null) {
            keva.storeBoolean(SP_SWIPED, true);
        }
    }
}
