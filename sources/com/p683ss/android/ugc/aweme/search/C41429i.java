package com.p683ss.android.ugc.aweme.search;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.discover.abtest.DiscoverMvpExperiment;
import com.p683ss.android.ugc.aweme.discover.abtest.MtGuessWordStyleExperiment;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchInDetailModeExperiment;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchIntermediateExperiment;

/* renamed from: com.ss.android.ugc.aweme.search.i */
public class C41429i {
    /* renamed from: i */
    public static boolean m91249i() {
        return m91250j();
    }

    /* renamed from: e */
    public static boolean m91245e() {
        return m91246f() ? false : false;
    }

    /* renamed from: f */
    public static boolean m91246f() {
        if (C10181b.m20511a().mo18168a(DiscoverMvpExperiment.class, true, "discover_mvp", 31744, 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static int m91248h() {
        return C10181b.m20511a().mo18168a(SearchIntermediateExperiment.class, true, "search_intermediate_style", 31744, 0);
    }

    /* renamed from: j */
    public static boolean m91250j() {
        if (C10181b.m20511a().mo18168a(MtGuessWordStyleExperiment.class, true, "mt_guess_word_style", 31744, 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m91247g() {
        if (C10181b.m20511a().mo18168a(SearchInDetailModeExperiment.class, true, "search_in_detail_mode", 31744, 0) == 0 && !m91246f() && m91248h() == 0) {
            return false;
        }
        return true;
    }
}
