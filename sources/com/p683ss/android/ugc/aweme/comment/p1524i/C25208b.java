package com.p683ss.android.ugc.aweme.comment.p1524i;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23200ag;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.i.b */
public final class C25208b {

    /* renamed from: a */
    public static final C25208b f66788a = new C25208b();

    private C25208b() {
    }

    /* renamed from: a */
    public static C23089d m61297a(String str, String str2) {
        C23089d a = C23089d.m56640a();
        a.mo47829a("enter_from", str).mo47829a("group_id", str2);
        Aweme awemeById = C23324d.m57378a().getAwemeById(str2);
        if (awemeById != null) {
            a.mo47829a("author_id", awemeById.getAuthorUid());
        }
        C52711k.m112236a((Object) a, "builder");
        return a;
    }

    /* renamed from: a */
    public static final void m61301a(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        C26890h.m65011a("click_comment_emoji", m61298a(str, str2, str3, str4, str5, Integer.valueOf(i), logPbBean).f61491a);
    }

    /* renamed from: b */
    public static final void m61302b(String str, String str2, String str3, String str4, String str5, int i, LogPbBean logPbBean) {
        C26890h.m65011a("show_comment_emoji", m61298a(str, str2, str3, str4, str5, Integer.valueOf(i), logPbBean).f61491a);
    }

    /* renamed from: a */
    private static C23089d m61298a(String str, String str2, String str3, String str4, String str5, Integer num, LogPbBean logPbBean) {
        C23089d a = C23089d.m56640a().mo47829a("emoji_type", str);
        CharSequence charSequence = str;
        if (TextUtils.equals(charSequence, "recommend")) {
            a.mo47829a("group_id", str2).mo47829a("author_id", str3).mo47829a("emoji_uri", str5).mo47828a("position", (Object) num).mo47828a("log_pb", (Object) logPbBean);
        } else if (TextUtils.equals(charSequence, "search")) {
            a.mo47829a("group_id", str2).mo47829a("author_id", str3).mo47829a("search_keyword", str4).mo47829a("emoji_uri", str5).mo47828a("position", (Object) num).mo47828a("log_pb", (Object) logPbBean);
        }
        C52711k.m112236a((Object) a, "builder");
        return a;
    }

    /* renamed from: a */
    public static final void m61300a(String str, String str2, String str3, int i, String str4, int i2, long j, String str5, int i3, String str6, String str7, String str8, String str9) {
        String str10;
        String str11 = str4;
        int i4 = i3;
        C26890h.m65008a(C11010c.m22280a(), "comment_duration", str, str2, str3, C23088c.m56631a().mo47823a("duration", Long.valueOf(j)).mo47825b());
        String str12 = str3;
        int i5 = i;
        long j2 = j;
        C23089d a = m61297a(str, str2).mo47829a("parent_comment_id", str3).mo47826a("parent_position", i).mo47829a("relation_label_type", str7).mo47829a("label_type", str6).mo47827a("duration", j).mo47829a("relation", str9);
        if (!TextUtils.isEmpty(str11)) {
            int i6 = i2;
            a.mo47829a("secondary_comment_id", str4).mo47826a("secondary_position", i2);
        }
        if (i4 != 0) {
            a.mo47826a("is_long_item", i4);
        }
        if (C23198ae.m56860d(str)) {
            a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(str5));
            String str13 = "comment_user_id";
            if (TextUtils.isEmpty(str8)) {
                str10 = "";
            } else {
                str10 = str8;
            }
            a.mo47829a(str13, str10);
            C26890h.m65012a("comment_duration", C23198ae.m56851a(a.f61491a));
            return;
        }
        C26890h.m65011a("comment_duration", a.f61491a);
    }

    /* renamed from: a */
    public static final void m61299a(Aweme aweme, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9, String str10, boolean z, boolean z2, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, boolean z3) {
        String str19;
        String str20;
        Aweme aweme2 = aweme;
        String str21 = str;
        String str22 = str2;
        String str23 = str3;
        String str24 = str6;
        String str25 = "";
        String str26 = "";
        String str27 = "";
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, C42311c.f106865i);
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "category");
        C52711k.m112240b(str24, "emojiTimes");
        C52711k.m112240b(str25, "sendMethod");
        C52711k.m112240b(str26, "emojiOrder");
        C52711k.m112240b(str27, "replyCommentType");
        CharSequence charSequence = str22;
        if (!TextUtils.equals(charSequence, "trending_page") || str15 == null) {
            str19 = str22;
        } else {
            str19 = str15;
        }
        if (TextUtils.equals(charSequence, "homepage_fresh_topic")) {
            str19 = "homepage_fresh_topic";
        }
        if (!TextUtils.equals(charSequence, "homepage_fresh_topic") && z3) {
            str22 = "trending_page";
        }
        C23200ag agVar = (C23200ag) ((C23200ag) new C23200ag().mo47964c(str).mo47960a(str22).mo47962b(str19).mo47975w(str7).mo47954f(aweme).mo47965d(str3).mo47972t(str10).mo47971s(str9).mo47970h(str8).mo48100j(str11)).mo48101k(str12);
        if (str4 == null) {
            str20 = "";
        } else {
            str20 = str4;
        }
        C23200ag v = agVar.mo47968f(str20).mo47969g(str5).mo47961a(z).mo47967e(str24).mo47959a(i).mo47963b(z2).mo47973u(str13).mo47974v(str14);
        v.f61685a = str16;
        v.f61699b = str17;
        C23200ag agVar2 = (C23200ag) v.mo47976x(str18).mo48099b(Boolean.valueOf(z3));
        agVar2.f61700c = str25;
        agVar2.f61701d = 0;
        agVar2.f61702e = str26;
        agVar2.f61673O = str27;
        agVar2.mo48076e();
    }
}
