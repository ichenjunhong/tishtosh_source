package com.p683ss.android.ugc.aweme.newfollow.p2000g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.lighten.p766a.C12194h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.experiment.RecommendSuperAccountExperiment;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.util.C37937e;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import com.p683ss.android.ugc.aweme.p1382aq.C23219ax;
import com.p683ss.android.ugc.aweme.p1382aq.C23221az;
import com.p683ss.android.ugc.aweme.p1382aq.C23246p;
import com.p683ss.android.ugc.aweme.p1382aq.C23250t;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.HashMap;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.newfollow.g.b */
public final class C37879b {

    /* renamed from: a */
    private static long f96431a = -1;

    /* renamed from: b */
    private static Map<String, Long> f96432b = new HashMap();

    /* renamed from: c */
    private static long f96433c = -1;

    /* renamed from: a */
    public static void m84580a(String str, String str2) {
        if (f96431a != -1) {
            long currentTimeMillis = System.currentTimeMillis() - f96431a;
            if (currentTimeMillis > 0) {
                m84567a(currentTimeMillis, str, str2);
            }
            f96431a = -1;
        }
    }

    /* renamed from: a */
    public static void m84578a(String str, long j) {
        f96432b.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public static void m84574a(Aweme aweme, String str, boolean z) {
        C26890h.onEvent(MobClick.obtain().setEventName("click").setLabelName("video_pause").setValue(aweme.getAid()));
        if (TextUtils.equals(str, "general_search")) {
            C23089d a = C23089d.m56640a().mo47829a("enter_from", str).mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme.getAuthorUid()).mo47826a("enter_fullscreen", z ? 1 : 0);
            if (C37937e.m84810h()) {
                a.mo47826a("is_auto_play", 1);
            }
            C26890h.m65011a("video_pause", a.f61491a);
        }
    }

    /* renamed from: a */
    public static void m84577a(User user, String str, int i, String str2, String str3) {
        C26890h.m65011a("follow_card", C23089d.m56640a().mo47829a("rec_uid", user.getUid()).mo47829a("enter_from", "homepage_follow").mo47829a("event_type", str).mo47826a("impr_order", i).mo47829a("req_id", str2).mo47829a("trigger_reason", str3).mo47829a("rec_reason", m84594d(user.getRecommendReason())).f61491a);
    }

    /* renamed from: a */
    public static void m84581a(String str, String str2, Aweme aweme) {
        C23088c a = C23088c.m56631a().mo47824a("previous_page", "").mo47824a("author_id", aweme.getAuthorUid()).mo47824a("enter_method", "content_card");
        if (aweme.getAwemeType() == 13) {
            a.mo47824a("is_reposted", "1").mo47824a("from_group_id", aweme.getFromGroupId()).mo47824a("page_type", "list").mo47824a("repost_comment_id", aweme.getForwardCommentId());
        }
        C26890h.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setValue(aweme.getAuthorUid()).setExtValueString(aweme.getAid()).setJsonObject(a.mo47825b()));
        C23089d a2 = C23089d.m56640a().mo47829a("previous_page", "").mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("to_user_id", aweme.getAuthorUid()).mo47829a("enter_method", "content_card");
        if (TextUtils.equals("follow", str)) {
            a2.mo47831b();
            a2.mo47829a("enter_from", str2);
            a2.mo47829a("previous_page", "homepage_follow");
            a2.mo47829a("previous_page_position", "content_card_button");
            a2.mo47829a("enter_method", "follow_button");
        } else if (TextUtils.equals("follow_cancel", str)) {
            a2.mo47829a("enter_from", "homepage_follow");
            a2.mo47829a("enter_method", "menu_sheet");
        } else {
            a2.mo47829a("enter_from", str2);
        }
        if (aweme.getAwemeType() == 13) {
            a2.mo47829a("is_reposted", "1").mo47829a("from_group_id", aweme.getFromGroupId()).mo47829a("page_type", "list").mo47829a("repost_comment_id", aweme.getForwardCommentId());
        }
        a2.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
        C26890h.m65012a(str, C23198ae.m56851a(a2.f61491a));
    }

    /* renamed from: a */
    public static void m84575a(User user) {
        C26890h.m65011a("follow", C23089d.m56640a().mo47829a("to_user_id", user.getUid()).mo47829a("enter_from", "homepage_follow").mo47829a("enter_type", "card").mo47829a("trigger_reason", "cold_launch").mo47829a("rec_reason", m84594d(user.getRecommendReason())).mo47831b().f61491a);
    }

    /* renamed from: a */
    public static void m84579a(String str, User user) {
        C26890h.m65012a("enter_personal_detail", C23198ae.m56851a(C23089d.m56640a().mo47829a("to_user_id", user.getUid()).mo47829a("enter_from", "homepage_follow").mo47829a("enter_type", "card").mo47829a("trigger_reason", "cold_launch").mo47829a("rec_reason", m84594d(user.getRecommendReason())).mo47829a("log_pb", C29981aa.m70153a().mo60161a(str)).mo47831b().f61491a));
    }

    /* renamed from: a */
    public static void m84573a(Aweme aweme, String str, String str2, String str3, String str4) {
        if (aweme != null) {
            C23088c a = C23088c.m56631a();
            a.mo47824a("group_id", aweme.getAid());
            a.mo47824a("compilation_id", C23198ae.m56884t(aweme));
            C32401a.m74902b(a, aweme, str3);
            C32401a.m74896a(a, aweme, str4);
            if (TextUtils.equals(str3, "rec_follow")) {
                a.mo47824a("content_source", "content_card");
            }
            C26890h.onEvent(MobClick.obtain().setEventName(str2).setLabelName(str3).setValue(str).setJsonObject(a.mo47825b()));
            C23089d b = C23089d.m56640a().mo47829a("author_id", aweme.getAuthorUid()).mo47829a("to_user_id", str).mo47829a("compilation_id", C23198ae.m56884t(aweme)).mo47829a("enter_method", TextUtils.equals(str2, "head") ? "click_head" : "click_name").mo47830a(C32401a.m74899a(str3, aweme)).mo47830a(C32401a.m74903b(aweme, str4)).mo47831b();
            if (TextUtils.equals(str3, "rec_follow")) {
                b.mo47829a("content_source", "content_card");
            }
            if (C23198ae.m56864f(str3)) {
                b.mo47829a("relation_type", C47915gg.m103646a(aweme) ? "follow" : "unfollow");
                b.mo47829a("video_type", C23198ae.m56886v(aweme));
                b.mo47829a("rec_uid", C23198ae.m56887w(aweme));
            }
            if (C23198ae.m56860d(str3)) {
                b.mo47829a("log_pb", C29981aa.m70153a().mo60161a(aweme.getRequestId()));
                C26890h.m65012a("enter_personal_detail", C23198ae.m56851a(b.f61491a));
                return;
            }
            C26890h.m65011a("enter_personal_detail", b.f61491a);
        }
    }

    /* renamed from: a */
    public static void m84566a() {
        if (f96431a == -1) {
            f96431a = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public static void m84582b() {
        if (f96433c == -1) {
            f96433c = System.currentTimeMillis();
        }
    }

    /* renamed from: d */
    public static void m84595d() {
        C26890h.onEvent(MobClick.obtain().setEventName("phone_number").setLabelName("click"));
    }

    /* renamed from: c */
    public static void m84590c() {
        C26890h.m65011a("click_add_friends", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").f61491a);
    }

    /* renamed from: c */
    public static void m84593c(String str) {
        C26890h.m65011a(str, (Map<String, String>) new HashMap<String,String>());
    }

    /* renamed from: d */
    private static String m84594d(String str) {
        if (RecommendSuperAccountExperiment.m69625b()) {
            return "super_account";
        }
        return str;
    }

    /* renamed from: a */
    public static long m84565a(String str) {
        if (f96432b.containsKey(str)) {
            return ((Long) f96432b.get(str)).longValue();
        }
        return -1;
    }

    /* renamed from: b */
    public static void m84587b(String str) {
        if (m84565a(str) == -1) {
            m84578a(str, System.currentTimeMillis());
        }
    }

    /* renamed from: c */
    static int m84589c(Aweme aweme) {
        int i;
        if (aweme == null) {
            return -1;
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        if (aweme == null) {
            return -1;
        }
        if (aweme.getAwemeType() == 2) {
            i = 1;
        } else {
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    public static void m84569a(Aweme aweme) {
        if (aweme != null) {
            C26890h.onEvent(MobClick.obtain().setEventName("click").setLabelName("video_play").setValue(aweme.getAid()));
        }
    }

    /* renamed from: b */
    public static void m84583b(Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "poi_page");
        hashMap.put("request_id", C23198ae.m56857c(aweme));
        hashMap.put("position", "poi_page");
        hashMap.put("host_value", C23198ae.m56846a(aweme));
        hashMap.put("room_value", C23198ae.m56853b(aweme));
        C26890h.m65011a("live_notice", (Map<String, String>) hashMap);
    }

    /* renamed from: b */
    public static void m84586b(User user) {
        C26890h.m65011a("follow_cancel", C23089d.m56640a().mo47829a("to_user_id", user.getUid()).mo47829a("enter_from", "homepage_follow").mo47829a("enter_type", "card").mo47829a("trigger_reason", "cold_launch").mo47829a("rec_reason", m84594d(user.getRecommendReason())).mo47831b().f61491a);
    }

    /* renamed from: c */
    public static void m84591c(Aweme aweme, String str) {
        if (!(aweme == null || aweme.getPromotion() == null || !TextUtils.equals(str, "general_search"))) {
            C26088l.m63315b(C12194h.m24638a(), aweme, "result_ad");
            C26088l.m63333c(C12194h.m24638a(), aweme, "result_ad");
        }
    }

    /* renamed from: b */
    public static void m84584b(Aweme aweme, String str) {
        if (aweme != null) {
            C23088c a = C23088c.m56631a().mo47824a("enter_type", "normal_way").mo47824a("enter_from", str).mo47824a("group_id", aweme.getAid()).mo47824a("compilation_id", C23198ae.m56884t(aweme)).mo47822a("is_photo", Integer.valueOf(m84589c(aweme)));
            C32401a.m74902b(a, aweme, str);
            C32401a.m74896a(a, aweme, C32401a.m74897a());
            C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(aweme.getAuthorUid()).setJsonObject(a.mo47825b()));
            C26890h.m65011a("enter_personal_detail_backup", C23089d.m56640a().mo47829a("enter_type", "normal_way").mo47829a("enter_from", "personal_homepage").mo47829a("to_user_id", aweme.getAuthorUid()).mo47829a("compilation_id", C23198ae.m56884t(aweme)).mo47830a(C32401a.m74899a(str, aweme)).mo47830a(C32401a.m74903b(aweme, C32401a.m74897a())).f61491a);
        }
    }

    /* renamed from: a */
    public static void m84571a(Aweme aweme, String str) {
        String str2;
        if (aweme != null) {
            C23088c a = C23088c.m56631a().mo47822a("is_photo", Integer.valueOf(m84589c(aweme)));
            C32401a.m74902b(a, aweme, str);
            C32401a.m74896a(a, aweme, C32401a.m74897a());
            C26890h.onEvent(MobClick.obtain().setEventName("enter_fullscreen").setLabelName(str).setValue(aweme.getAid()).setJsonObject(a.mo47825b()));
            C23089d a2 = C23089d.m56640a();
            a2.mo47829a("content_type", C23198ae.m56879o(aweme));
            a2.mo47830a(C32401a.m74899a(str, aweme));
            a2.mo47830a(C32401a.m74903b(aweme, C32401a.m74897a()));
            if (C23198ae.m56864f(str)) {
                String str3 = "relation_type";
                if (C47915gg.m103646a(aweme)) {
                    str2 = "follow";
                } else {
                    str2 = "unfollow";
                }
                a2.mo47829a(str3, str2);
                a2.mo47829a("video_type", C23198ae.m56886v(aweme));
                a2.mo47829a("rec_uid", C23198ae.m56887w(aweme));
            }
            if (TextUtils.equals("general_search", str) || TextUtils.equals("search_result", str)) {
                a2.mo47829a("video_tag", "");
                a2.mo47829a("rank", C23198ae.m56854b(aweme, 9));
            }
            if (C23198ae.m56860d(str)) {
                a2.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
                C26890h.m65012a("enter_fullscreen", C23198ae.m56851a(a2.f61491a));
                return;
            }
            C26890h.m65011a("enter_fullscreen", a2.f61491a);
        }
    }

    /* renamed from: b */
    public static void m84588b(String str, String str2) {
        if (f96433c != -1) {
            long currentTimeMillis = System.currentTimeMillis() - f96433c;
            if (currentTimeMillis > 0) {
                m84567a(currentTimeMillis, str, str2);
            }
            f96433c = -1;
        }
    }

    /* renamed from: a */
    public static void m84567a(long j, String str, String str2) {
        if (!"poi_page".equalsIgnoreCase(str)) {
            C23088c a = C23088c.m56631a();
            a.mo47824a("page_type", str2);
            C26890h.onEvent(MobClick.obtain().setEventName("stay_time").setLabelName(str).setValue(String.valueOf(j)).setJsonObject(a.mo47825b()));
            new C23213as().mo48005a(String.valueOf(j)).mo48006b(str).mo48008d(str2).mo48076e();
        }
    }

    /* renamed from: a */
    public static void m84576a(User user, String str, int i, String str2) {
        m84577a(user, str, i, str2, "cold_launch");
    }

    /* renamed from: b */
    public static void m84585b(Aweme aweme, String str, String str2, String str3) {
        if (aweme != null) {
            C26890h.onEvent(MobClick.obtain().setEventName("comment").setLabelName(str).setValue(aweme.getAid()).setJsonObject(C32401a.m74896a(C23088c.m56631a().mo47824a("enter_from", str).mo47824a("enter_method", "click").mo47824a("reply_to_comment_id", str3).mo47824a("request_id", C23198ae.m56857c(aweme)).mo47822a("is_photo", Integer.valueOf(m84589c(aweme))), aweme, str2).mo47825b()));
            C26890h.m65011a("comment", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("group_id", aweme.getAid()).f61491a);
        }
    }

    /* renamed from: a */
    public static void m84568a(Context context, TextExtraStruct textExtraStruct, Aweme aweme, String str) {
        if (textExtraStruct.getType() == 1) {
            C23088c a = C23088c.m56631a();
            a.mo47824a("hashtag", textExtraStruct.getHashTagName());
            a.mo47824a("request_id", C23198ae.m56857c(aweme));
            a.mo47824a("is_photo", C23198ae.m56859d(aweme));
            C32401a.m74902b(a, aweme, str);
            C32401a.m74896a(a, aweme, C32401a.m74897a());
            C26890h.onEvent(MobClick.obtain().setEventName("challenge_click").setLabelName(str).setValue(aweme.getAid()).setExtValueString(textExtraStruct.getCid()).setJsonObject(a.mo47825b()));
            C26088l.m63380q(context, aweme);
            ((C23250t) new C23250t().mo48150f(str).mo47954f(aweme).mo48154t(textExtraStruct.getCid()).mo47941a("click_in_video_name")).mo48156v(C23198ae.m56857c(aweme)).mo48152h(C32401a.m74897a()).mo48076e();
        } else if (textExtraStruct.getType() == 2) {
            m84584b(aweme, str);
            m84573a(aweme, textExtraStruct.getUserId(), LeakCanaryFileProvider.f132049i, str, "list");
        } else {
            C23088c a2 = C23088c.m56631a();
            C32401a.m74902b(a2, aweme, str);
            C32401a.m74896a(a2, aweme, C32401a.m74897a());
            C26890h.onEvent(MobClick.obtain().setEventName(LeakCanaryFileProvider.f132049i).setLabelName("video_at").setValue(textExtraStruct.getUserId()).setJsonObject(a2.mo47825b()));
            C23089d b = C23089d.m56640a().mo47829a("enter_from", str).mo47829a("to_user_id", textExtraStruct.getUserId()).mo47829a("group_id", aweme.getAid()).mo47829a("enter_method", "video_at").mo47831b();
            b.mo47830a(C32401a.m74899a(str, aweme));
            b.mo47830a(C32401a.m74903b(aweme, C32401a.m74897a()));
            if (C23198ae.m56860d(str)) {
                b.mo47829a("log_pb", C29981aa.m70153a().mo60161a(aweme.getRequestId()));
                C26890h.m65012a("enter_personal_detail", C23198ae.m56851a(b.f61491a));
            } else {
                C26890h.m65011a("enter_personal_detail", b.f61491a);
            }
            C23088c a3 = C23088c.m56631a();
            a3.mo47824a("enter_method", "click_head");
            C32401a.m74902b(a3, aweme, str);
            C32401a.m74896a(a3, aweme, C32401a.m74897a());
            if (aweme.getAuthor() != null) {
                C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(aweme.getAuthor().getUid()).setJsonObject(a3.mo47825b()));
                Map<String, String> map = C23089d.m56640a().mo47829a("enter_from", "personal_homepage").mo47829a("to_user_id", aweme.getAuthor().getUid()).mo47829a("group_id", aweme.getAid()).mo47829a("enter_method", "click_name").f61491a;
                map.putAll(C32401a.m74899a(str, aweme));
                map.putAll(C32401a.m74903b(aweme, C32401a.m74897a()));
                C26890h.m65011a("enter_personal_detail_backup", map);
            }
        }
    }

    /* renamed from: c */
    public static void m84592c(Aweme aweme, String str, String str2, String str3) {
        if (aweme != null) {
            if ("poi_page".equalsIgnoreCase(str)) {
                ((C23246p) new C23246p().mo48125h(C23198ae.m56877m(aweme)).mo48126s(C23198ae.m56846a(aweme)).mo48127t(C23198ae.m56873k(aweme)).mo48124g(str).mo48128u(str3).mo47941a("click_cover")).mo48129v(C23198ae.m56857c(aweme)).mo48130w(C23198ae.m56884t(aweme)).mo48076e();
            } else {
                C23089d b = C23089d.m56640a().mo47829a("enter_from", str).mo47829a("enter_method", "click_cover").mo47829a("music_id", C23198ae.m56873k(aweme)).mo47829a("compilation_id", C23198ae.m56884t(aweme)).mo47830a(C32401a.m74899a(str, aweme)).mo47830a(C32401a.m74903b(aweme, str2)).mo47829a("process_id", str3).mo47831b();
                if (C23198ae.m56860d(str)) {
                    b.mo47829a("log_pb", C29981aa.m70153a().mo60161a(aweme.getRequestId()));
                    C26890h.m65012a("enter_music_detail", C23198ae.m56851a(b.f61491a));
                } else {
                    C26890h.m65011a("enter_music_detail", b.f61491a);
                }
            }
            C23088c a = C23088c.m56631a().mo47824a("request_id", C23198ae.m56857c(aweme)).mo47822a("is_photo", Integer.valueOf(m84589c(aweme)));
            if (!"poi_page".equalsIgnoreCase(str)) {
                C32401a.m74902b(a, aweme, str);
                C32401a.m74896a(a, aweme, str2);
            }
            C26890h.onEvent(MobClick.obtain().setEventName("song_cover").setLabelName(str).setValue(aweme.getAid()).setExtValueString(C23198ae.m56873k(aweme)).setJsonObject(a.mo47825b()));
        }
    }

    /* renamed from: a */
    public static void m84572a(Aweme aweme, String str, String str2, String str3) {
        if (aweme != null) {
            String str4 = "";
            String str5 = "";
            if (TextUtils.equals("general_search", str3) || TextUtils.equals("search_result", str3)) {
                str5 = C23198ae.m56854b(aweme, 9);
            }
            ((C23219ax) ((C23219ax) ((C23219ax) new C23219ax().mo48039a(str3).mo48041b(str3).mo47954f(aweme).mo48043c(str2).mo48100j(str)).mo48040a(false).mo48102l(str4)).mo48101k(str5)).mo48070a((Map<String, String>) C32401a.m74903b(aweme, C32401a.m74897a())).mo48076e();
            C23088c a = C23088c.m56631a();
            C32401a.m74902b(a, aweme, str3);
            C32401a.m74896a(a, aweme, C32401a.m74897a());
            if (C37937e.m84810h()) {
                a.mo47822a("is_auto_play", Integer.valueOf(1));
            }
            if ("poi_page".equalsIgnoreCase(str3)) {
                a.mo47824a("poi_id", C23198ae.m56861e(aweme));
                a.mo47824a("poi_type", C23198ae.m56867h(aweme));
            }
            a.mo47824a("enter_from", str3);
            a.mo47824a("content_source", str2);
            a.mo47824a("tab_name", str);
            C26890h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("finish").setValue(aweme.getAid()).setJsonObject(a.mo47825b()));
        }
    }

    /* renamed from: a */
    public static void m84570a(Aweme aweme, long j, boolean z, String str, String str2, String str3) {
        if (aweme != null) {
            String str4 = "";
            String str5 = "";
            if (TextUtils.equals("general_search", str) || TextUtils.equals("search_result", str)) {
                str5 = C23198ae.m56854b(aweme, 9);
            }
            ((C23221az) ((C23221az) ((C23221az) new C23221az().mo48052a(str).mo48055b(str).mo47954f(aweme).mo48049a(j).mo48059e(str3).mo48100j(str2)).mo48053a(z).mo48057d(C23198ae.m56857c(aweme)).mo48102l(str4)).mo48101k(str5)).mo48070a((Map<String, String>) C32401a.m74903b(aweme, C32401a.m74897a())).mo48076e();
            C23088c a = C23088c.m56631a().mo47822a("enter_fullscreen", Integer.valueOf(z ? 1 : 0));
            C32401a.m74902b(a, aweme, str);
            C32401a.m74896a(a, aweme, C32401a.m74897a());
            if (C37937e.m84810h()) {
                a.mo47822a("is_auto_play", Integer.valueOf(1));
            }
            if ("poi_page".equalsIgnoreCase(str)) {
                a.mo47824a("poi_id", C23198ae.m56861e(aweme));
                a.mo47824a("poi_type", C23198ae.m56867h(aweme));
            }
            a.mo47824a("content_source", str3);
            a.mo47824a("tab_name", str2);
            C26890h.onEvent(MobClick.obtain().setEventName("play_time").setLabelName(str).setValue(aweme.getAid()).setExtValueLong(j).setJsonObject(a.mo47825b()));
        }
    }
}
