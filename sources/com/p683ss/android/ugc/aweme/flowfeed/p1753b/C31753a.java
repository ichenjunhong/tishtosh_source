package com.p683ss.android.ugc.aweme.flowfeed.p1753b;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.feed.experiment.ShareButtonStyleExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.utils.C47789cu;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.b.a */
public final class C31753a {
    /* renamed from: b */
    public static boolean m73741b(Aweme aweme) {
        if (C31190f.m72831a(aweme) || !C47950q.m103755d(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m73740a(User user) {
        if (user == null || !user.isLive() || !C46635b.m101190a() || user.isBlock()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m73742b(User user) {
        if (user == null || !TextUtils.equals(user.getUid(), C20854a.m53167g().getCurUser().getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m73743c(Aweme aweme) {
        User author = aweme.getAuthor();
        if (author == null || !TextUtils.equals(author.getUid(), C20854a.m53167g().getCurUser().getUid())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m73739a(Aweme aweme) {
        if (aweme.getAuthor() == null || !aweme.getAuthor().isLive() || !C46635b.m101190a() || aweme.getAuthor().isBlock()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static String m73744d(Aweme aweme) {
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && aweme.getAuthor() != null && statistics.getCommentCount() > 0) {
            return C33095b.m76068a(statistics.getCommentCount());
        }
        if (!C47789cu.m103418a()) {
            return "0";
        }
        return C11010c.m22280a().getString(R.string.a7v);
    }

    /* renamed from: e */
    public static String m73745e(Aweme aweme) {
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && aweme.getAuthor() != null && statistics.getDiggCount() > 0) {
            return C33095b.m76068a(statistics.getDiggCount());
        }
        if (!C47789cu.m103418a()) {
            return "0";
        }
        return C11010c.m22280a().getString(R.string.apm);
    }

    /* renamed from: f */
    public static String m73746f(Aweme aweme) {
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null && aweme.getAuthor() != null && statistics.getShareCount() > 0) {
            return C33095b.m76068a(statistics.getShareCount());
        }
        if (!C47789cu.m103418a()) {
            return "0";
        }
        return C11010c.m22280a().getString(R.string.dhf);
    }

    /* renamed from: g */
    public static int m73747g(Aweme aweme) {
        if (aweme.getStatistics() == null || aweme.getAuthor() == null || m73743c(aweme)) {
            return 1;
        }
        return C10181b.m20511a().mo18168a(ShareButtonStyleExperiment.class, true, "share_button_style", 31744, 0);
    }

    /* renamed from: h */
    public static boolean m73748h(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 13 || aweme.getAwemeType() == 0 || aweme.getAwemeType() == 2 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56) {
            return true;
        }
        return false;
    }
}
