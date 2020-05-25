package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.b */
public final class C31186b {
    /* renamed from: a */
    public static boolean m72812a(Aweme aweme) {
        return C31174a.m72802a(aweme);
    }

    /* renamed from: a */
    public static boolean m72811a(C30016ag agVar) {
        if (agVar == null || !m72812a(agVar.mo53999e())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Aweme m72813b(C30016ag agVar) {
        if (agVar == null) {
            return null;
        }
        return agVar.mo53999e();
    }

    /* renamed from: b */
    public static boolean m72814b(Aweme aweme) {
        if (aweme == null || aweme.getUploadMiscInfoStruct().vpaInfo == null || aweme.getUploadMiscInfoStruct().vpaInfo.getInfoBarType() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m72815c(C30016ag agVar) {
        if (agVar == null || agVar.mo53999e() == null || !agVar.mo53999e().isAd()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m72816d(C30016ag agVar) {
        if (agVar == null || agVar.mo53999e() == null || agVar.mo53999e().getAwemeType() != 31) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m72817e(C30016ag agVar) {
        if (agVar == null || agVar.mo54004j() == null || agVar.mo54004j().mo60247q() != 1) {
            return false;
        }
        return true;
    }
}
