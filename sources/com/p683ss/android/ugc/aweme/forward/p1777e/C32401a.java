package com.p683ss.android.ugc.aweme.forward.p1777e;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.forward.view.FeedDetailActivity;
import com.p683ss.android.ugc.aweme.forward.view.OriginDetailActivity;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.AbsFollowFeedDetailActivity;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.forward.e.a */
public final class C32401a {
    /* renamed from: a */
    public static String m74897a() {
        Activity g = C11016e.m22312g();
        if (g instanceof FeedDetailActivity) {
            return C22858c.f61208d;
        }
        if (g instanceof AbsFollowFeedDetailActivity) {
            return ((AbsFollowFeedDetailActivity) g).f96494g;
        }
        return "list";
    }

    /* renamed from: b */
    private static boolean m74905b() {
        Activity g = C11016e.m22312g();
        if ((g instanceof OriginDetailActivity) || ((g instanceof AbsFollowFeedDetailActivity) && ((AbsFollowFeedDetailActivity) g).f96495h)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static HashMap<String, String> m74898a(Aweme aweme, String str) {
        return PoiServiceImpl.createIPoiServicebyMonsterPlugin().appendPoiParams(aweme);
    }

    /* renamed from: a */
    public static HashMap<String, String> m74899a(String str, Aweme aweme) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("enter_from", str);
        if (aweme != null) {
            hashMap.put("author_id", aweme.getAuthorUid());
            hashMap.put("group_id", aweme.getAid());
        }
        return hashMap;
    }

    /* renamed from: b */
    public static HashMap<String, String> m74903b(Aweme aweme, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (aweme == null) {
            return hashMap;
        }
        if (aweme.getAwemeType() == 13) {
            hashMap.put("page_type", str);
            hashMap.put("is_reposted", "1");
            hashMap.put("repost_comment_id", aweme.getForwardCommentId());
            hashMap.put("from_group_id", aweme.getFromGroupId());
            hashMap.put("from_user_id", aweme.getFromUserId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                hashMap.put("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                hashMap.put("forward_user_id", aweme.getForwardUserId());
            }
        } else if (m74905b()) {
            hashMap.put("page_type", C22858c.f61208d);
            if (!TextUtils.isEmpty(aweme.getRepostFromGroupId())) {
                hashMap.put("repost_from_group_id", aweme.getRepostFromGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
                hashMap.put("repost_from_user_id", aweme.getRepostFromUserId());
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static C23088c m74902b(C23088c cVar, Aweme aweme, String str) {
        if (cVar == null) {
            cVar = new C23088c();
        }
        if (aweme != null) {
            cVar.mo47824a("enter_from", str);
            cVar.mo47824a("author_id", aweme.getAuthorUid());
            cVar.mo47824a("request_id", C23198ae.m56857c(aweme));
        }
        return cVar;
    }

    /* renamed from: a */
    public static C23088c m74896a(C23088c cVar, Aweme aweme, String str) {
        if (cVar == null) {
            cVar = new C23088c();
        }
        if (aweme == null) {
            return cVar;
        }
        if (aweme.getAwemeType() == 13) {
            cVar.mo47824a("page_type", str).mo47824a("is_reposted", "1").mo47824a("repost_comment_id", aweme.getForwardCommentId()).mo47824a("from_group_id", aweme.getFromGroupId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                cVar.mo47824a("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                cVar.mo47824a("forward_user_id", aweme.getForwardUserId());
            }
        } else if (m74905b()) {
            cVar.mo47824a("page_type", C22858c.f61208d);
            if (!TextUtils.isEmpty(aweme.getRepostFromGroupId())) {
                cVar.mo47824a("repost_from_group_id", aweme.getRepostFromGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getRepostFromUserId())) {
                cVar.mo47824a("repost_from_user_id", aweme.getRepostFromUserId());
            }
        }
        return cVar;
    }

    /* renamed from: a */
    public static void m74900a(String str, Aweme aweme, String str2, String str3) {
        C23089d a = C23089d.m56640a();
        a.mo47830a(m74899a(str, aweme)).mo47830a(m74903b(aweme, str2)).mo47830a(m74898a(aweme, str)).mo47829a("enter_method", str3);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo47829a("country_name", aweme.getAuthor().getRegion());
        }
        C26890h.m65011a("click_repost_button", a.f61491a);
    }

    /* renamed from: b */
    public static void m74904b(String str, Aweme aweme, String str2, String str3) {
        C23089d a = C23089d.m56640a();
        a.mo47830a(m74899a(str, aweme)).mo47830a(m74903b(aweme, str2)).mo47830a(m74898a(aweme, str)).mo47829a("enter_method", str3);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo47829a("country_name", aweme.getAuthor().getRegion());
        }
        C26890h.m65011a("click_comment_and_repost", a.f61491a);
    }

    /* renamed from: a */
    public static void m74901a(String str, Aweme aweme, String str2, String str3, boolean z) {
        String str4;
        C23089d a = C23089d.m56640a();
        C23089d a2 = a.mo47830a(m74899a(str, aweme)).mo47830a(m74903b(aweme, str2)).mo47830a(m74898a(aweme, str)).mo47829a("enter_method", str3);
        String str5 = "is_success";
        if (z) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        a2.mo47829a(str5, str4);
        if (aweme != null && aweme.getAwemeType() == 13) {
            a.mo47829a("from_user_id", aweme.getFromUserId());
        }
        if ((TextUtils.equals(str, "homepage_fresh") || TextUtils.equals(str, "homepage_channel")) && C35802a.m80931b()) {
            a.mo47829a("tab_name", C35802a.m80930a());
        }
        if (aweme != null) {
            if (C35802a.m80931b()) {
                int i = 12000;
                if (TextUtils.equals(str, "homepage_fresh")) {
                    i = 7;
                }
                a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56847a(aweme, i)));
            } else {
                return;
            }
        }
        C26890h.m65011a("repost", a.f61491a);
    }
}
