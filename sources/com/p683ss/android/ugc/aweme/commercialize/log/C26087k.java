package com.p683ss.android.ugc.aweme.commercialize.log;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p683ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.C22396a;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.k */
public final class C26087k {
    /* renamed from: a */
    public static void m63251a(C26138s sVar, Aweme aweme, String str, boolean z, String str2) {
        C22396a aVar;
        String str3;
        String str4;
        if (aweme != null && sVar != null) {
            String str5 = "normaltitle";
            if (!z) {
                int i = sVar.feedShowType;
                if (i != 4) {
                    switch (i) {
                        case 1:
                            str5 = "weaktitle";
                            break;
                        case 2:
                            str5 = "strongtitle";
                            break;
                    }
                } else {
                    str5 = "specialtitle";
                }
            }
            IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
            if (createIAdServicebyMonsterPlugin != null) {
                aVar = createIAdServicebyMonsterPlugin.getLatestRecommendFeedAdInfo();
            } else {
                aVar = null;
            }
            String str6 = "";
            long j = 0;
            if (aVar != null) {
                if (aVar.f60319a != null) {
                    j = aVar.f60319a.longValue();
                }
                str6 = aVar.f60320b;
            }
            String str7 = "link_userside";
            C23089d a = C23089d.m56640a().mo47829a("degree_style_difference", str5);
            String str8 = "is_enterprise";
            if (C47915gg.m103661j(aweme.getAuthor())) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C23089d a2 = a.mo47829a(str8, str3).mo47829a("action_type", str);
            String str9 = "page_type";
            if (z) {
                str4 = "video_comment";
            } else {
                str4 = "video_play";
            }
            C23089d a3 = a2.mo47829a(str9, str4).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("group_id", aweme.getAid());
            String str10 = "enter_from";
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C26890h.m65011a(str7, a3.mo47829a(str10, str2).mo47829a("scene_id", "1002").mo47829a("link_type", "ad_link").mo47827a("cid", j).mo47829a("log_extra", str6).f61491a);
        }
    }

    /* renamed from: a */
    public static void m63252a(NationalTaskLink nationalTaskLink, Aweme aweme, String str, boolean z, String str2) {
        C22396a aVar;
        String str3;
        String str4;
        if (aweme != null && nationalTaskLink != null) {
            IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
            if (createIAdServicebyMonsterPlugin != null) {
                aVar = createIAdServicebyMonsterPlugin.getLatestRecommendFeedAdInfo();
            } else {
                aVar = null;
            }
            String str5 = "";
            long j = 0;
            if (aVar != null) {
                if (aVar.f60319a != null) {
                    j = aVar.f60319a.longValue();
                }
                str5 = aVar.f60320b;
            }
            String str6 = "link_userside";
            C23089d a = C23089d.m56640a().mo47829a("link_id", nationalTaskLink.getId()).mo47829a("degree_style_difference", "normaltitle");
            String str7 = "is_enterprise";
            if (C47915gg.m103661j(aweme.getAuthor())) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C23089d a2 = a.mo47829a(str7, str3).mo47829a("action_type", str);
            String str8 = "page_type";
            if (z) {
                str4 = "video_comment";
            } else {
                str4 = "video_play";
            }
            C23089d a3 = a2.mo47829a(str8, str4).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("group_id", aweme.getAid());
            String str9 = "enter_from";
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C26890h.m65011a(str6, a3.mo47829a(str9, str2).mo47829a("scene_id", "1002").mo47829a("link_type", "task_link").mo47827a("cid", j).mo47829a("log_extra", str5).f61491a);
        }
    }

    /* renamed from: a */
    public static void m63253a(StarAtlasLink starAtlasLink, Aweme aweme, String str, boolean z, String str2) {
        C22396a aVar;
        String str3;
        String str4;
        if (aweme != null && starAtlasLink != null) {
            IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
            if (createIAdServicebyMonsterPlugin != null) {
                aVar = createIAdServicebyMonsterPlugin.getLatestRecommendFeedAdInfo();
            } else {
                aVar = null;
            }
            String str5 = "";
            long j = 0;
            if (aVar != null) {
                if (aVar.f60319a != null) {
                    j = aVar.f60319a.longValue();
                }
                str5 = aVar.f60320b;
            }
            String str6 = "link_userside";
            C23089d a = C23089d.m56640a().mo47829a("link_id", starAtlasLink.getId()).mo47829a("degree_style_difference", "normaltitle");
            String str7 = "is_enterprise";
            if (C47915gg.m103661j(aweme.getAuthor())) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C23089d a2 = a.mo47829a(str7, str3).mo47829a("action_type", str);
            String str8 = "page_type";
            if (z) {
                str4 = "video_comment";
            } else {
                str4 = "video_play";
            }
            C23089d a3 = a2.mo47829a(str8, str4).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("group_id", aweme.getAid());
            String str9 = "enter_from";
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C26890h.m65011a(str6, a3.mo47829a(str9, str2).mo47829a("scene_id", "1002").mo47829a("link_type", "starmap_link").mo47827a("cid", j).mo47829a("log_extra", str5).f61491a);
        }
    }
}
