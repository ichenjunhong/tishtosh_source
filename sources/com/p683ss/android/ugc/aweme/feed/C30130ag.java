package com.p683ss.android.ugc.aweme.feed;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.feed.experiment.ShareGuideThresholdExperiment;
import com.p683ss.android.ugc.aweme.utils.C47685au;

/* renamed from: com.ss.android.ugc.aweme.feed.ag */
public final class C30130ag {
    /* renamed from: b */
    public static void m70702b() {
        m70704d();
        C23543g d = C23542f.m57719d();
        d.mo48707b("share_guide_show_times", d.mo48699a("share_guide_show_times", 0) + 1);
    }

    /* renamed from: c */
    public static String m70703c() {
        return C23542f.m57719d().mo48703a("last_share_type", (String) C23183v.m56778a().mo47925u().mo47782d());
    }

    /* renamed from: a */
    public static boolean m70701a() {
        int a = C10181b.m20511a().mo18168a(ShareGuideThresholdExperiment.class, true, "share_guide_threshold", 31744, 0);
        if (a < 0) {
            a = Integer.MAX_VALUE;
        }
        m70704d();
        if (C23542f.m57719d().mo48699a("share_guide_show_times", 0) < a) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static void m70704d() {
        int c = C47685au.m103205c(System.currentTimeMillis());
        C23543g d = C23542f.m57719d();
        if (d.mo48699a("share_guide_date_day", -1) != c) {
            d.mo48707b("share_guide_date_day", c);
            d.mo48707b("share_guide_show_times", 0);
        }
    }

    /* renamed from: a */
    public static void m70700a(String str) {
        C23542f.m57719d().mo48709b("last_share_type", str);
    }
}
