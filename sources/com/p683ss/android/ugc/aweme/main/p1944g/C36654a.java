package com.p683ss.android.ugc.aweme.main.p1944g;

import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.shortvideo.C43212df;

/* renamed from: com.ss.android.ugc.aweme.main.g.a */
public final class C36654a {
    /* renamed from: a */
    public static boolean m82564a() {
        if (!AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishable()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m82563a(FragmentActivity fragmentActivity) {
        if (m82564a() && fragmentActivity != null) {
            Fragment a = fragmentActivity.getSupportFragmentManager().mo2224a("publish");
            if (a instanceof C43212df) {
                ((C43212df) a).mo87845a();
            }
        }
    }

    /* renamed from: b */
    public static void m82565b(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            Fragment a = fragmentActivity.getSupportFragmentManager().mo2224a("publish");
            if (a instanceof C43212df) {
                ((C43212df) a).mo87846b();
            }
        }
    }
}
