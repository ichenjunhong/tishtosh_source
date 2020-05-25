package com.p683ss.android.ugc.aweme.search;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.discover.abtest.EnableHistorySugNewStyleExperiment;
import com.p683ss.android.ugc.aweme.discover.abtest.MtGuessWordStyleExperiment;

/* renamed from: com.ss.android.ugc.aweme.search.g */
public final class C41424g extends C41429i {
    /* renamed from: b */
    public static boolean m91241b() {
        if (m91248h() == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m91240a() {
        if (C10181b.m20511a().mo18168a(EnableHistorySugNewStyleExperiment.class, true, "enable_history_sug_new_style", 31744, 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m91242c() {
        if (C10181b.m20511a().mo18168a(MtGuessWordStyleExperiment.class, true, "mt_guess_word_style", 31744, 0) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m91243d() {
        if (C10181b.m20511a().mo18168a(MtGuessWordStyleExperiment.class, true, "mt_guess_word_style", 31744, 0) == 2) {
            return true;
        }
        return false;
    }
}
