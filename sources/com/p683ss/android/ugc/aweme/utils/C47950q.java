package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.profile.model.User;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.q */
public final class C47950q {

    /* renamed from: a */
    public static final C47950q f120545a = new C47950q();

    private C47950q() {
    }

    /* renamed from: b */
    public static boolean m103753b(Aweme aweme) {
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getPrivateStatus() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m103754c(Aweme aweme) {
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getPrivateStatus() == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m103755d(Aweme aweme) {
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getPrivateStatus() == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m103756e(Aweme aweme) {
        if (aweme != null) {
            User author = aweme.getAuthor();
            if (author != null && author.getFollowStatus() == 2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m103757f(Aweme aweme) {
        if (aweme != null) {
            User author = aweme.getAuthor();
            if (author != null && author.getFollowStatus() == 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m103752a(Aweme aweme) {
        if (aweme != null) {
            AwemeStatus status = aweme.getStatus();
            if (status != null && status.getPrivateStatus() == 2) {
                User author = aweme.getAuthor();
                if ((author == null || author.getFollowStatus() != 2) && !C31190f.m72831a(aweme)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public static final boolean m103758g(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        if (C47915gg.m103647a(aweme.getAuthorUid())) {
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            User curUser = g.getCurUser();
            C52711k.m112236a((Object) curUser, "AccountProxyService.userService().curUser");
            return curUser.isSecret();
        }
        User author = aweme.getAuthor();
        C52711k.m112236a((Object) author, "aweme.author");
        return author.isSecret();
    }
}
