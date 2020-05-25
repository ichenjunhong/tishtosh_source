package com.p683ss.android.ugc.aweme.comment.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.p620a.C10178a;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import p2628d.p2639f.p2641b.C52711k;

@C10178a(mo18163a = "comment_change_username_interval")
/* renamed from: com.ss.android.ugc.aweme.comment.abtest.MTCommentUsernamePromptExperiment */
public final class MTCommentUsernamePromptExperiment {
    private static final String COMMENT_INVALID_USERNAME = "comment_invalid_username";
    @C10179b(mo18165a = true)
    public static final int Group = 0;
    @C10179b
    public static final int Group1 = 7;
    @C10179b
    public static final int Group2 = 3;
    @C10179b
    public static final int Group3 = 1;
    public static final MTCommentUsernamePromptExperiment INSTANCE = new MTCommentUsernamePromptExperiment();
    private static final String KEY_NEXT_TIME = "key_next_time";
    private static final long ONE_DAY_MILLIS = 86400000;

    private MTCommentUsernamePromptExperiment() {
    }

    /* renamed from: b */
    public static final void m60921b() {
        Keva.getRepo(COMMENT_INVALID_USERNAME).storeLong(m60919a(KEY_NEXT_TIME), System.currentTimeMillis() + (((long) m60922c()) * 86400000));
    }

    /* renamed from: c */
    private static int m60922c() {
        return C10181b.m20511a().mo18168a(MTCommentUsernamePromptExperiment.class, true, "comment_change_username_interval", 31744, 0);
    }

    /* renamed from: a */
    public static final boolean m60920a() {
        if (!C23794bh.m58377C().mo59619b() || m60922c() == 0 || Keva.getRepo(COMMENT_INVALID_USERNAME).getLong(m60919a(KEY_NEXT_TIME), 0) >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m60919a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        sb.append(g.getCurUserId());
        return sb.toString();
    }
}
