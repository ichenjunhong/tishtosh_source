package com.p683ss.android.ugc.aweme.comment.p1524i;

import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.comment.services.C25281a.C25282a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.C27338h;
import com.p683ss.android.ugc.aweme.discover.mob.C28384ae;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1912k.C35802a;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.comment.i.a */
public final class C25207a {
    /* renamed from: a */
    public static void m61287a(String str, String str2, String str3) {
        C26890h.m65007a(C11010c.m22280a(), "comment_at", str, str2, str3);
    }

    /* renamed from: a */
    public static void m61289a(String str, String str2, String str3, String str4) {
        String str5 = str2;
        String str6 = str3;
        C26890h.m65006a(C11010c.m22280a(), "emoji_to_keyboard", str5, str6, 0, C23088c.m56631a().mo47824a("return_method", str).mo47824a("group_id", str3).mo47824a("enter_from", str2).mo47824a("author_id", str4).mo47825b());
        C26890h.m65011a("emoji_to_keyboard", C23089d.m56640a().mo47829a("enter_from", str2).mo47829a("return_method", str).mo47829a("group_id", str3).mo47829a("author_id", str4).f61491a);
    }

    /* renamed from: a */
    public static void m61290a(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        C26890h.m65011a("reply_via_video", m61293b(str, str2, str3, str4, str5, i, i2, str6).f61491a);
    }

    /* renamed from: a */
    public static void m61291a(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, String str8) {
        C23089d b = m61293b(str, str2, str3, str4, str5, i, i2, str6);
        b.mo47829a("enter_from", str7).mo47829a("comment_group_id", str8);
        C26890h.m65011a("video_comment_show", b.f61491a);
    }

    /* renamed from: a */
    public static void m61284a(String str, Aweme aweme, String str2, String str3, String str4) {
        C23089d a = C23089d.m56640a();
        a.mo47830a(C23794bh.m58391e().mo65591a(str, aweme)).mo47830a(C23794bh.m58391e().mo65596b(aweme, str)).mo47829a("comment_id", str2).mo47829a("enter_method", str4).mo47830a(C23794bh.m58391e().mo65590a(aweme, str3));
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo47829a("country_name", aweme.getAuthor().getRegion());
        }
        C26890h.m65011a("report_comment", a.f61491a);
    }

    /* renamed from: a */
    public static void m61288a(String str, String str2, String str3, Aweme aweme) {
        C23089d a = C23089d.m56640a();
        a.mo47830a(C23794bh.m58391e().mo65591a(str, aweme)).mo47829a("comment_id", str3).mo47829a("to_user_id", str2);
        C26890h.m65011a("copy_comment", a.f61491a);
    }

    /* renamed from: a */
    public static void m61286a(String str, Aweme aweme, String str2, boolean z, String str3, String str4, boolean z2) {
        C23089d a = m61276a(str, aweme, str2, z, str3);
        if (z2 && !TextUtils.equals(str, "homepage_fresh_topic")) {
            a.mo47829a("enter_from", "trending_page");
            a.mo47829a("is_fullscreen", "0");
        }
        if (C23198ae.m56860d(str)) {
            a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
            String str5 = "comment_user_id";
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            a.mo47829a(str5, str4);
            C26890h.m65012a("like_comment", C23198ae.m56851a(a.f61491a));
            return;
        }
        C26890h.m65011a("like_comment", a.f61491a);
    }

    /* renamed from: a */
    public static void m61285a(String str, Aweme aweme, String str2, boolean z, String str3, String str4, String str5, String str6, String str7) {
        C23089d a = m61276a(str, aweme, str2, z, str3);
        if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
            if (!TextUtils.equals(str7, "0")) {
                a.mo47829a("parent_id", str7);
                a.mo47829a("comment_category", "reply_to_reply");
            } else if (!TextUtils.equals(str6, "0")) {
                a.mo47829a("parent_id", str6);
                a.mo47829a("comment_category", "reply");
            } else {
                a.mo47829a("parent_id", str2);
                a.mo47829a("comment_category", "original");
            }
        }
        String str8 = TextUtils.equals("4", str5) ? "cancel_dislike_comment" : "dislike_comment";
        if (C23198ae.m56860d(str)) {
            a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
            String str9 = "comment_user_id";
            if (TextUtils.isEmpty(str4)) {
                str4 = "";
            }
            a.mo47829a(str9, str4);
            C26890h.m65012a(str8, C23198ae.m56851a(a.f61491a));
            return;
        }
        C26890h.m65011a(str8, a.f61491a);
    }

    /* renamed from: a */
    public static void m61292a(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        if ("opus".equals(str2) || "collection".equals(str2)) {
            str2 = z ? "personal_homepage" : "others_homepage";
        }
        C26890h.m65006a(C11010c.m22280a(), str, str2, str3, 0, C23088c.m56631a().mo47824a("reply_uid", str5).mo47824a("reply_comment_id", str4).mo47822a("is_photo", Integer.valueOf(z2 ? 1 : 0)).mo47822a("is_retry", Integer.valueOf(0)).mo47825b());
    }

    /* renamed from: a */
    public static void m61279a() {
        C26890h.m65011a("favorite_emoji", C23089d.m56640a().f61491a);
    }

    /* renamed from: a */
    public static void m61280a(String str) {
        C23089d a = C23089d.m56640a();
        a.mo47829a("enter_from", str);
        a.mo47829a("enter_method", "click_blank");
        C26890h.m65011a("close_comment_tab", a.f61491a);
    }

    /* renamed from: a */
    public static String m61278a(Comment comment) {
        boolean z;
        if (comment == null) {
            return "original";
        }
        String replyId = comment.getReplyId();
        boolean a = C9376b.m18558a((Collection<T>) comment.getReplyComments());
        if (comment.getCommentType() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !TextUtils.isEmpty(replyId) && !TextUtils.equals(replyId, "0")) {
            return "reply_to_reply";
        }
        if (z || a) {
            return "reply";
        }
        return "original";
    }

    /* renamed from: a */
    public static C23089d m61277a(String str, String str2) {
        C23089d a = C23089d.m56640a();
        a.mo47829a("enter_from", str).mo47829a("group_id", str2);
        Aweme awemeById = C23324d.m57378a().getAwemeById(str2);
        if (awemeById != null) {
            a.mo47829a("author_id", awemeById.getAuthorUid());
        }
        return a;
    }

    /* renamed from: b */
    public static void m61294b(String str, String str2, String str3) {
        C23089d a = m61277a(str, str2);
        a.mo47829a("parent_comment_id", str3);
        C26890h.m65011a("hide_all_reply", a.f61491a);
    }

    /* renamed from: c */
    public static void m61296c(String str, String str2, String str3) {
        C23089d a = m61277a(str, str2);
        a.mo47829a("parent_comment_id", str3);
        C26890h.m65011a("show_more_reply", a.f61491a);
    }

    /* renamed from: b */
    public static void m61295b(String str, String str2, String str3, String str4) {
        C23089d a = m61277a(str, str2);
        a.mo47829a("enter_from", str);
        a.mo47829a("group_id", str2);
        a.mo47829a("author_id", str3);
        a.mo47829a("comment_id", str4);
        C26890h.m65011a("creator_like_comment_show", a.f61491a);
    }

    /* renamed from: a */
    public static void m61281a(String str, Aweme aweme, long j, String str2) {
        C23089d a = C23089d.m56640a();
        a.mo47830a(C23794bh.m58391e().mo65591a(str, aweme)).mo47830a(C23794bh.m58391e().mo65590a(aweme, str2)).mo47827a("stay_time", j);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo47829a("country_name", aweme.getAuthor().getRegion());
        }
        C26890h.m65011a("close_text", a.f61491a);
    }

    /* renamed from: a */
    public static void m61283a(String str, Aweme aweme, String str2, String str3) {
        C23089d a = C23089d.m56640a();
        a.mo47830a(C23794bh.m58391e().mo65591a(str, aweme)).mo47830a(C23794bh.m58391e().mo65590a(aweme, str3)).mo47829a("comment_category", str2);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo47829a("country_name", aweme.getAuthor().getRegion());
        }
        C26890h.m65011a("enter_text", a.f61491a);
    }

    /* renamed from: a */
    public static C23089d m61276a(String str, Aweme aweme, String str2, boolean z, String str3) {
        String str4;
        C23089d a = C23089d.m56640a().mo47830a(C23794bh.m58391e().mo65591a(str, aweme)).mo47830a(C23794bh.m58391e().mo65590a(aweme, str3)).mo47826a("is_success", z ? 1 : 0);
        if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
            a.mo47829a("country_name", aweme.getAuthor().getRegion());
        }
        if (TextUtils.equals(str, "general_search")) {
            if (C28384ae.m67362a()) {
                if (aweme == null || aweme.getVideo() == null || aweme.getVideo().getVideoTag() == null) {
                    a.mo47829a("video_tag", "");
                } else {
                    a.mo47829a("video_tag", aweme.getVideo().getVideoTag().getTitle());
                }
            }
            String str5 = "is_fullscreen";
            if (C27338h.m65876a()) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            a.mo47829a(str5, str4);
            a.mo47829a("rank", C23198ae.m56854b(aweme, 9));
        }
        if (z) {
            a.mo47829a("comment_id", str2);
        }
        return a;
    }

    /* renamed from: b */
    private static C23089d m61293b(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        return C23089d.m56640a().mo47829a("enter_method", str).mo47829a("group_id", str2).mo47829a("comment_id", str3).mo47829a("comment_user_id", str4).mo47829a("author_id", C20854a.m53167g().getCurUserId()).mo47829a("parent_id", str5).mo47826a("parent_position", i).mo47826a("secondary_position", i2).mo47829a("comment_category", str6);
    }

    /* renamed from: a */
    public static void m61282a(String str, Aweme aweme, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map<String, String> map) {
        String str14;
        String str15;
        String str16 = str;
        int i2 = i;
        Map<String, String> map2 = map;
        if (aweme != null) {
            C23089d a = C23089d.m56640a();
            a.mo47830a(C23794bh.m58391e().mo65591a(str, aweme));
            String str17 = str2;
            a.mo47830a(C23794bh.m58391e().mo65590a(aweme, str2));
            a.mo47829a("previous_page", str8);
            if (aweme.getStatistics() != null) {
                a.mo47829a("outter_comment_cnt", String.valueOf(aweme.getStatistics().getCommentCount()));
            }
            if ("homepage_country".equals(str) && aweme.getAuthor() != null) {
                a.mo47829a("country_name", aweme.getAuthor().getRegion());
            }
            if (i2 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                a.mo47829a("is_long_item", sb.toString());
            }
            if (!TextUtils.isEmpty(str4)) {
                String str18 = str4;
                a.mo47829a("enter_method", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                String str19 = str3;
                a.mo47829a("trigger_comment_id", str3);
            }
            if (aweme.getPoiStruct() != null) {
                a.mo47829a("poi_id", aweme.getPoiStruct().poiId);
            }
            if (!TextUtils.isEmpty(str5)) {
                String str20 = str5;
                a.mo47829a("playlist_type", str5);
            }
            if (!TextUtils.isEmpty(str7)) {
                String str21 = str6;
                a.mo47829a(str6, str7);
            }
            if (!TextUtils.isEmpty(BusinessComponentServiceUtils.getBusinessBridgeService().mo49723a()) && ((TextUtils.equals(str, "homepage_fresh") || TextUtils.equals(str, "homepage_channel")) && C35802a.m80931b())) {
                a.mo47829a("tab_name", BusinessComponentServiceUtils.getBusinessBridgeService().mo49723a());
            }
            a.mo47829a("request_id", C23198ae.m56857c(aweme));
            if (C27338h.m65876a()) {
                a.mo47829a("is_fullscreen", "1");
            }
            if (aweme.getMobParams() != null && "poi_page".equalsIgnoreCase(str)) {
                a.mo47829a("page_poi_id", (String) aweme.getMobParams().get("page_poi_id"));
                a.mo47829a("page_poi_city", (String) aweme.getMobParams().get("page_poi_city"));
                a.mo47829a("page_poi_device_samecity", (String) aweme.getMobParams().get("page_poi_device_samecity"));
                a.mo47829a("page_poi_backend_type", (String) aweme.getMobParams().get("page_poi_backend_type"));
            }
            if (C23198ae.m56864f(str)) {
                String str22 = "relation_type";
                if (C47915gg.m103646a(aweme)) {
                    str15 = "follow";
                } else {
                    str15 = "unfollow";
                }
                a.mo47829a(str22, str15);
                a.mo47829a("video_type", C23198ae.m56886v(aweme));
                a.mo47829a("rec_uid", C23198ae.m56887w(aweme));
            }
            if (TextUtils.equals(str, "general_search")) {
                if (C28384ae.m67362a()) {
                    if (aweme.getVideo() == null || aweme.getVideo().getVideoTag() == null) {
                        a.mo47829a("video_tag", "");
                    } else {
                        a.mo47829a("video_tag", aweme.getVideo().getVideoTag().getTitle());
                    }
                }
                String str23 = "is_fullscreen";
                if (C27338h.m65876a()) {
                    str14 = "1";
                } else {
                    str14 = "0";
                }
                a.mo47829a(str23, str14);
                a.mo47829a("rank", C23198ae.m56854b(aweme, 9));
            }
            a.mo47827a("position", C25282a.m61494a().getPlayerManagerCurrentPosition());
            a.mo47829a("impr_type", C23198ae.m56883s(aweme));
            if (!TextUtils.isEmpty(aweme.getMixId())) {
                a.mo47829a("compilation_id", aweme.getMixId());
            }
            C25282a.m61494a().appendV4CommonParams(a, str9, str10);
            a.mo47829a("card_type", str12);
            a.mo47829a("object_id", str11);
            if (C23198ae.m56860d(str)) {
                a.mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(aweme)));
                C25282a.m61494a().onEventV3JsonIncludingPoiParams(aweme, "click_comment_button", a);
                return;
            }
            if (!TextUtils.isEmpty(str13)) {
                a.mo47829a("creation_id", str13);
            }
            if (TextUtils.equals(str, "homepage_fresh_topic")) {
                a.mo47829a("enter_from", str);
                if (!TextUtils.isEmpty(aweme.getHotSpot())) {
                    a.mo47829a("topic_name", aweme.getHotSpot());
                } else if (aweme.getHotListStruct() != null && !TextUtils.isEmpty(aweme.getHotListStruct().getTitile())) {
                    a.mo47829a("topic_name", aweme.getHotListStruct().getTitile());
                }
            } else if (map2 != null) {
                a.mo47829a("enter_from", (String) map2.get("enter_from"));
                a.mo47829a("enter_method", (String) map2.get("enter_method"));
                a.mo47829a("trending_topic", (String) map2.get("trending_topic"));
                a.mo47829a("order", (String) map2.get("order"));
                a.mo47829a("is_rising_topic", (String) map2.get("is_rising_topic"));
                a.mo47829a("is_fullscreen", (String) map2.get("is_fullscreen"));
            }
            C25282a.m61494a().onEventV3IncludingPoiParams(aweme, "click_comment_button", a);
        }
    }
}
