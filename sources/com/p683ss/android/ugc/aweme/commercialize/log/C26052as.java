package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p683ss.android.ugc.aweme.p1382aq.C23196ad;
import com.p683ss.android.ugc.aweme.p1382aq.C23217av;
import com.p683ss.android.ugc.aweme.p1382aq.C23247q;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23250t;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.utils.C47729bp.C47730a;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.as */
public final class C26052as implements LogHelper {
    /* renamed from: a */
    public static LogHelper m63104a() {
        if (C27991b.f73419C == null) {
            synchronized (LogHelper.class) {
                if (C27991b.f73419C == null) {
                    C27991b.f73419C = C27628bo.m66307b();
                }
            }
        }
        return (LogHelper) C27991b.f73419C;
    }

    public final void logEnterPage(String str) {
        C52711k.m112240b(str, "pageName");
        new C23247q().mo48131a(str).mo48076e();
    }

    public final void logLiveMergeShow(String str, boolean z) {
        C52711k.m112240b(str, "enterFrom");
        C46641d.m101218a(str, z);
    }

    public final void logEnterLiveMerge(String str, String str2) {
        C52711k.m112240b(str, "message");
        C52711k.m112240b(str2, "newType");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", str);
        hashMap.put("ui_type", str2);
        C26890h.m65011a("enter_live_merge", (Map<String, String>) hashMap);
    }

    public final void logFollowUserEventI18n(String str, String str2) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "toUserId");
        new C23253w().mo48161b(str).mo48166f(str2).mo48076e();
    }

    public final void logVideoPlayFromPush(String str, String str2) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(str2, "ruleId");
        new C23217av(str).mo48036s(str2).mo48076e();
    }

    public final void sendFollowApproveEvent(String str, String str2) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "uid");
        C23196ad.m56841a("follow_approve").mo47957b("enter_from", str).mo47957b("to_user_id", str2).mo48076e();
    }

    public final void startRecyclerViewFpsMonitor(String str, RecyclerView recyclerView) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(recyclerView, "recyclerView");
        C47730a.m103327a(str).mo95020a(recyclerView);
    }

    public final void sendFollowRefuseEvent(String str, String str2) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "uid");
        C23196ad.m56841a("follow_refuse").mo47957b("enter_from", str).mo47957b("to_user_id", str2).mo47958g().mo48076e();
    }

    public final void logFeedRawAdFollow(Context context, Aweme aweme, FollowStatus followStatus) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C26088l.m63281a(context, aweme, followStatus);
    }

    public final void logHomepageRawAdFollow(Context context, Aweme aweme, FollowStatus followStatus) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C26088l.m63314b(context, aweme, followStatus);
    }

    public final void logFollowUserEvent(String str, String str2, String str3) {
        C52711k.m112240b(str, "event");
        C52711k.m112240b(str2, "enterFrom");
        new C23253w(str).mo48161b(str2).mo48166f(str3).mo48076e();
    }

    public final void logEnterTagDetail(String str, String str2, String str3) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "authorId");
        C52711k.m112240b(str3, "tagId");
        new C23250t().mo48150f(str).mo48153s(str2).mo48154t(str3).mo48076e();
    }

    public final void sendEnterPersonalDetailEvent(String str, String str2, String str3) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "uid");
        C52711k.m112240b(str3, "enterMethod");
        ((C23249s) new C23249s().mo48137c(str).mo47941a(str3)).mo48144s(str2).mo48076e();
    }

    public final void logLiveFromMessage(Context context, String str, String str2, long j) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str2, "uid");
        C46641d.m101205a(context, 1, str2, j, C46641d.m101204a("message", "head", str));
    }

    public final void logFollowUserEvent(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "previousPage");
        C52711k.m112240b(str3, "toUserId");
        C52711k.m112240b(str4, "groupId");
        new C23253w().mo48161b(str).mo48164d(str2).mo48166f(str3).mo48168h(str4).mo48076e();
    }

    public final void logFollowUserEventI18n(String str, String str2, String str3, String str4) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "toUserId");
        C52711k.m112240b(str3, "previousPage");
        C52711k.m112240b(str4, "previousPagePosition");
        new C23253w().mo48161b(str).mo48166f(str2).mo48164d(str3).mo48165e(str4).mo48076e();
    }

    public final void logVideoPlay(String str, Aweme aweme, int i, String str2) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str2, "playerType");
        new C23217av().mo48025b(str).mo48026c(aweme, i).mo48032f(str2).mo48076e();
    }

    public final void logVideoPlay(String str, String str2, String str3, String str4, String str5) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "aid");
        C52711k.m112240b(str3, "authorId");
        C52711k.m112240b(str5, "playerType");
        new C23217av().mo48025b(str).mo48023a(str2, str3, str4).mo48032f(str5).mo48076e();
    }

    public final void logFollowUserEventPush(String str, String str2, String str3, String str4, String str5, String str6) {
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "toUserId");
        C52711k.m112240b(str4, "previousPage");
        C52711k.m112240b(str5, "previousPagePosition");
        C52711k.m112240b(str6, "ruleId");
        C23253w e = new C23253w(str).mo48161b(str2).mo48166f(str3).mo48164d(str4).mo48165e(str5);
        e.f62147e = str6;
        e.mo48076e();
    }

    public final void logFollowUserEventWithEventName(String str, String str2, String str3, String str4, String str5, String str6) {
        C52711k.m112240b(str, "event");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "previousPage");
        C52711k.m112240b(str4, "previousPagePosition");
        C52711k.m112240b(str5, "enterMethod");
        C52711k.m112240b(str6, "toUserId");
        new C23253w(str).mo48161b(str2).mo48164d(str3).mo48165e(str4).mo48163c(str5).mo48166f(str6).mo48076e();
    }

    public final void logFollowUserEvent(String str, String str2, String str3, String str4, String str5, String str6) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "previousPage");
        C52711k.m112240b(str3, "previousPagePosition");
        C52711k.m112240b(str4, "enterMethod");
        C52711k.m112240b(str5, "toUserId");
        C52711k.m112240b(str6, "followType");
        new C23253w().mo48161b(str).mo48164d(str2).mo48165e(str3).mo48163c(str4).mo48166f(str5).mo48167g(str6).mo48076e();
    }

    public final void logFollowUserEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "previousPage");
        C52711k.m112240b(str3, "previousPagePosition");
        C52711k.m112240b(str4, "enterMethod");
        C52711k.m112240b(str5, "toUserId");
        C52711k.m112240b(str6, "groupId");
        C52711k.m112240b(str7, "followType");
        new C23253w().mo48161b(str).mo48164d(str2).mo48165e(str3).mo48163c(str4).mo48166f(str5).mo48168h(str6).mo48076e();
    }

    public final void logLiveShow(String str, long j, String str2, String str3, String str4, int i, boolean z, String str5) {
        String str6 = str;
        C52711k.m112240b(str, "anchorID");
        String str7 = str2;
        C52711k.m112240b(str2, "enterFrom");
        String str8 = str3;
        C52711k.m112240b(str3, "enterMethod");
        String str9 = str5;
        C52711k.m112240b(str9, "awemeId");
        C46641d.m101215a(str6, j, str7, str8, str4, i, str9);
    }
}
