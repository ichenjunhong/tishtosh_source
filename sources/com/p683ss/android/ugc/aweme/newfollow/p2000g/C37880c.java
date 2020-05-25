package com.p683ss.android.ugc.aweme.newfollow.p2000g;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.mob.C28390aj;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.follow.p1764c.C31870a;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.util.C37937e;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23217av;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23256z;
import java.util.HashMap;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.ss.android.ugc.aweme.newfollow.g.c */
public final class C37880c implements C31870a {
    /* renamed from: a */
    public final void mo64983a() {
        C37879b.m84566a();
    }

    /* renamed from: a */
    public final void mo64994a(Aweme aweme, String str, String str2, String str3) {
        C37879b.m84572a(aweme, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo64997a(Aweme aweme, String str, boolean z) {
        C37879b.m84574a(aweme, str, z);
    }

    /* renamed from: a */
    public final void mo64999a(String str, String str2, Aweme aweme) {
        C37879b.m84581a(str, str2, aweme);
    }

    /* renamed from: a */
    public final void mo64995a(Aweme aweme, String str, String str2, String str3, String str4) {
        C37879b.m84573a(aweme, str, str2, str3, str4);
    }

    /* renamed from: a */
    public final void mo64998a(String str, String str2) {
        C37879b.m84580a(str, str2);
    }

    /* renamed from: a */
    public final void mo64996a(Aweme aweme, String str, String str2, String str3, boolean z, String str4) {
        if (aweme != null) {
            String str5 = "";
            String str6 = "";
            if (TextUtils.equals("general_search", str) || TextUtils.equals("search_result", str)) {
                str6 = C23198ae.m56854b(aweme, 9);
            }
            C23217av h = ((C23217av) new C23217av().mo48025b(str).mo48029d(str).mo47954f(aweme).mo48100j(str2)).mo48035h(str3);
            h.f61873d = z ? 1 : 0;
            ((C23217av) ((C23217av) h.mo48102l(str5)).mo48101k(str6)).mo48070a((Map<String, String>) C32401a.m74903b(aweme, C32401a.m74897a())).mo48076e();
            if (TextUtils.equals(str4, "search_result") || TextUtils.equals(str4, "general_search")) {
                C28390aj.f74551a.mo56821a("search_video_play", aweme, str, TextUtils.equals(str4, "search_result"));
            }
            C23088c a = C23088c.m56631a();
            C32401a.m74902b(a, aweme, str);
            C32401a.m74896a(a, aweme, C32401a.m74897a());
            if (C37937e.m84810h()) {
                a.mo47822a("is_auto_play", Integer.valueOf(1));
            }
            if ("poi_page".equalsIgnoreCase(str)) {
                a.mo47824a("poi_id", C23198ae.m56861e(aweme));
                a.mo47824a("poi_type", C23198ae.m56867h(aweme));
            }
            a.mo47822a("enter_fullscreen", Integer.valueOf(z));
            a.mo47824a("content_source", str3);
            a.mo47824a("tab_name", str2);
            C26890h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName(str).setValue(aweme.getAid()).setJsonObject(a.mo47825b()));
        }
    }

    /* renamed from: a */
    public final void mo64993a(Aweme aweme, String str, String str2, int i, String str3, String str4, int i2) {
        String str5;
        if (TextUtils.equals("poi_page", str3)) {
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str3);
            hashMap.put("group_id", aweme.getAid());
            hashMap.put("comment_id", str);
            String str6 = "position";
            if (i2 >= 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                str5 = sb.toString();
            } else {
                str5 = "";
            }
            hashMap.put(str6, str5);
            C26890h.m65011a("like_comment", (Map<String, String>) hashMap);
            return;
        }
        String str7 = "common";
        if (1 == i) {
            str7 = "author";
        } else if (2 == i) {
            str7 = "following";
        }
        C26890h.onEvent(MobClick.obtain().setEventName("like_comment").setLabelName(str3).setValue(str).setExtValueString(str2).setJsonObject(C23088c.m56631a().mo47824a("attribute", str7).mo47825b()));
        C23089d a = C23089d.m56640a();
        a.mo47829a("comment_id", str);
        a.mo47830a(C32401a.m74899a(str3, aweme));
        a.mo47830a(C32401a.m74903b(aweme, str4));
        if (TextUtils.equals("general_search", str3) || TextUtils.equals("search_result", str3)) {
            a.mo47829a("video_tag", "");
            a.mo47829a("rank", C23198ae.m56854b(aweme, 9));
            a.mo47829a("is_fullscreen", "0");
        }
        if (C23198ae.m56860d(str3)) {
            a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
            C26890h.m65012a("like_comment", C23198ae.m56851a(a.f61491a));
            return;
        }
        C26890h.m65011a("like_comment", a.f61491a);
    }

    /* renamed from: b */
    public final void mo65000b(Aweme aweme) {
        C37879b.m84569a(aweme);
    }

    /* renamed from: a */
    public final void mo64985a(Aweme aweme) {
        C37879b.m84583b(aweme);
    }

    /* renamed from: c */
    public final void mo65004c(Aweme aweme) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "poi_page");
        hashMap.put("request_id", C23198ae.m56857c(aweme));
        hashMap.put("position", "poi_page");
        hashMap.put("host_value", C23198ae.m56846a(aweme));
        hashMap.put("room_value", C23198ae.m56853b(aweme));
        C26890h.m65011a("live_play", (Map<String, String>) hashMap);
    }

    /* renamed from: c */
    public final void mo65005c(Aweme aweme, String str) {
        C37879b.m84584b(aweme, str);
    }

    /* renamed from: d */
    public final void mo65007d(Aweme aweme, String str) {
        C37879b.m84591c(aweme, str);
    }

    /* renamed from: b */
    public final void mo65001b(Aweme aweme, String str) {
        C37879b.m84571a(aweme, str);
    }

    /* renamed from: a */
    public final void mo64989a(Aweme aweme, String str) {
        if (aweme != null) {
            C23088c a = C23088c.m56631a();
            C32401a.m74902b(a, aweme, str);
            C32401a.m74896a(a, aweme, C32401a.m74897a());
            a.mo47824a("enter_fullscreen", "0");
            a.mo47824a("content_type", C23198ae.m56879o(aweme));
            a.mo47822a("is_photo", Integer.valueOf(C37879b.m84589c(aweme)));
            C26890h.onEvent(MobClick.obtain().setEventName("show").setLabelName(str).setValue(aweme.getAid()).setJsonObject(a.mo47825b()));
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str);
            hashMap.put("previous_page", str);
            hashMap.put("group_id", C23198ae.m56877m(aweme));
            hashMap.put("author_id", C23198ae.m56846a(aweme));
            hashMap.put("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
            hashMap.put("content_type", C23198ae.m56879o(aweme));
            hashMap.put("enter_fullscreen", "0");
            if (aweme.isForwardAweme()) {
                hashMap.put("is_reposted", "1");
                hashMap.put("from_group_id", aweme.getFromGroupId());
                hashMap.put("from_user_id", aweme.getFromUserId());
            }
            C26890h.m65014b("show", C23198ae.m56851a((Map<String, String>) hashMap));
        }
    }

    /* renamed from: a */
    public final void mo64990a(Aweme aweme, String str, int i) {
        if (aweme != null) {
            C26890h.m65012a("like_cancel", C23198ae.m56851a(C23089d.m56640a().mo47829a("enter_from", str).mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme))).f61491a));
        }
    }

    /* renamed from: a */
    public final void mo64986a(Aweme aweme, long j, String str) {
        if (aweme != null) {
            C23088c a = C23088c.m56631a();
            C32401a.m74902b(a, aweme, str);
            C32401a.m74896a(a, aweme, C32401a.m74897a());
            a.mo47822a("is_photo", Integer.valueOf(C37879b.m84589c(aweme)));
            a.mo47824a("stay_time", String.valueOf(j));
            C26890h.onEvent(MobClick.obtain().setEventName("show_time").setLabelName(str).setValue(aweme.getAid()).setJsonObject(a.mo47825b()));
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", str);
            hashMap.put("previous_page", str);
            hashMap.put("group_id", C23198ae.m56877m(aweme));
            hashMap.put("author_id", aweme.getAuthorUid());
            hashMap.put("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
            hashMap.put("content_type", C23198ae.m56879o(aweme));
            hashMap.put("stay_time", String.valueOf(j));
            C26890h.m65012a("show_time", C23198ae.m56851a((Map<String, String>) hashMap));
        }
    }

    /* renamed from: b */
    public final void mo65002b(Aweme aweme, String str, String str2) {
        String str3;
        if (aweme != null) {
            ((C23249s) new C23249s().mo47954f(aweme).mo48137c("poi_page").mo48144s(str2).mo47941a(str)).mo48076e();
            C23088c a = C23088c.m56631a().mo47824a("request_id", C23198ae.m56857c(aweme)).mo47822a("is_photo", Integer.valueOf(C37879b.m84589c(aweme))).mo47824a("poi_id", C23198ae.m56861e(aweme)).mo47824a("poi_type", C23198ae.m56867h(aweme));
            MobClick obtain = MobClick.obtain();
            if ("click_name".equalsIgnoreCase(str)) {
                str3 = LeakCanaryFileProvider.f132049i;
            } else {
                str3 = "head";
            }
            C26890h.onEvent(obtain.setEventName(str3).setLabelName("poi_page").setValue(C23198ae.m56877m(aweme)).setExtValueLong(C23198ae.m56871j(aweme).longValue()).setJsonObject(a.mo47825b()));
        }
    }

    /* renamed from: a */
    public final void mo64991a(Aweme aweme, String str, String str2) {
        if (aweme != null && !"poi_page".equalsIgnoreCase(str)) {
            C23088c a = C23088c.m56631a().mo47824a("enter_from", str).mo47824a("enter_method", "click").mo47822a("is_photo", Integer.valueOf(C37879b.m84589c(aweme)));
            if (TextUtils.equals("general_search", str) || TextUtils.equals("search_result", str)) {
                a.mo47824a("video_tag", "");
                a.mo47824a("rank", C23198ae.m56854b(aweme, 9));
                a.mo47824a("is_fullscreen", "0");
            }
            C32401a.m74902b(a, aweme, str);
            C32401a.m74896a(a, aweme, C32401a.m74897a());
        }
    }

    /* renamed from: a */
    public final void mo64984a(Context context, TextExtraStruct textExtraStruct, Aweme aweme, String str) {
        C37879b.m84568a(context, textExtraStruct, aweme, str);
    }

    /* renamed from: c */
    public final void mo65006c(Aweme aweme, String str, String str2, String str3) {
        C37879b.m84585b(aweme, str, str2, str3);
    }

    /* renamed from: b */
    public final void mo65003b(Aweme aweme, String str, String str2, String str3) {
        C37879b.m84592c(aweme, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo64987a(Aweme aweme, long j, boolean z, String str) {
        C37879b.m84570a(aweme, j, z, str, "", "");
    }

    /* renamed from: a */
    public final void mo64988a(Aweme aweme, long j, boolean z, String str, String str2, String str3) {
        C37879b.m84570a(aweme, j, z, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo64992a(Aweme aweme, String str, String str2, int i, String str3, long j) {
        if (aweme != null) {
            String str4 = "";
            String str5 = "";
            if (TextUtils.equals("general_search", str) || TextUtils.equals("search_result", str)) {
                str5 = C23198ae.m56854b(aweme, 9);
            }
            C23256z f = new C23256z().mo48189d(str).mo48191e(str2).mo47954f(aweme).mo48185b(i).mo48192f(str3);
            f.f62175a = 0;
            ((C23256z) ((C23256z) f.mo48183a(j).mo48102l(str4)).mo48101k(str5)).mo48070a((Map<String, String>) C32401a.m74903b(aweme, C32401a.m74897a())).mo48076e();
            C23088c a = C23088c.m56631a().mo47824a("enter_from", str).mo47824a("enter_method", "click").mo47822a("is_photo", Integer.valueOf(C37879b.m84589c(aweme)));
            C32401a.m74902b(a, aweme, str);
            C32401a.m74896a(a, aweme, C32401a.m74897a());
            if ("poi_page".equalsIgnoreCase(str)) {
                a.mo47824a("poi_id", C23198ae.m56861e(aweme));
                a.mo47824a("poi_type", C23198ae.m56867h(aweme));
            }
            C26890h.onEvent(MobClick.obtain().setEventName("like").setLabelName(str).setValue(aweme.getAid()).setJsonObject(a.mo47825b()));
        }
    }
}
