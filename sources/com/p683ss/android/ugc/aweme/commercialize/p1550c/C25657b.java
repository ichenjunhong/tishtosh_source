package com.p683ss.android.ugc.aweme.commercialize.p1550c;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.commercialize.link.p1573a.C25948a.C25949a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeNationalTask;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStarAtlas;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22320c;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c.b */
public final class C25657b implements C22320c {
    /* renamed from: a */
    public final String mo46424a() {
        return AppLog.getServerDeviceId();
    }

    /* renamed from: b */
    public final void mo46436b(AwemeRawAd awemeRawAd) {
        C26060ay.f68819a.mo53545a("show", awemeRawAd.getTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C25659d<Object,Object,Object>(awemeRawAd));
    }

    /* renamed from: a */
    public final void mo46430a(AwemeRawAd awemeRawAd) {
        C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C25658c<Object,Object,Object>(awemeRawAd));
    }

    /* renamed from: c */
    public final void mo46437c(Context context, Aweme aweme) {
        C26088l.m63375n(context, aweme);
    }

    /* renamed from: a */
    public final void mo46425a(Context context, Aweme aweme) {
        C26088l.m63296a(context, "comment_first_ad", "click_message", aweme, C26088l.m63263a(context, aweme, "raw ad click", false));
    }

    /* renamed from: b */
    public final void mo46433b(Context context, Aweme aweme) {
        C26088l.m63296a(context, "comment_first_ad", "click_message", aweme, C26088l.m63263a(context, aweme, "raw ad click", false));
    }

    /* renamed from: c */
    public final void mo46438c(Context context, AwemeRawAd awemeRawAd) {
        C26088l.m63294a(context, "click_title", awemeRawAd, C26088l.m63329c(context, awemeRawAd, "raw feed comment click title"));
    }

    /* renamed from: d */
    public final void mo46440d(Context context, AwemeRawAd awemeRawAd) {
        C26088l.m63294a(context, "comment_first_show", awemeRawAd, C26088l.m63329c(context, awemeRawAd, "raw feed comment first show"));
    }

    /* renamed from: e */
    public final void mo46442e(Context context, AwemeRawAd awemeRawAd) {
        C26088l.m63294a(context, "othershow", awemeRawAd, C26088l.m63329c(context, awemeRawAd, "raw feed comment first show"));
    }

    /* renamed from: a */
    public final void mo46426a(Context context, AwemeRawAd awemeRawAd) {
        C26088l.m63291a(context, awemeRawAd, (String) null);
    }

    /* renamed from: b */
    public final void mo46434b(Context context, AwemeRawAd awemeRawAd) {
        C26088l.m63294a(context, "click_source", awemeRawAd, C26088l.m63329c(context, awemeRawAd, "raw feed comment click source"));
    }

    /* renamed from: a */
    public final void mo46427a(Context context, AwemeRawAd awemeRawAd, String str) {
        C26088l.m63291a(context, awemeRawAd, str);
    }

    /* renamed from: b */
    public final void mo46435b(Context context, String str, String str2, String str3) {
        C26088l.m63325b(context, str, str2, str3);
    }

    /* renamed from: d */
    public final void mo46441d(Context context, String str, String str2, String str3) {
        C26088l.m63297a(context, str, str2, str3);
    }

    /* renamed from: c */
    public final void mo46439c(Context context, String str, String str2, String str3) {
        C26088l.m63344d(context, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo46428a(Context context, String str, String str2, String str3) {
        C26088l.m63337c(context, str, str2, str3);
    }

    /* renamed from: a */
    public final void mo46432a(String str, String str2, Aweme aweme, boolean z) {
        C26138s a = C26428bm.m63902a(aweme);
        String str3 = "";
        if (a != null && a.linkType == 0) {
            String str4 = "enterprise_link";
            if (C26512f.m64064g(aweme) && z) {
                C26088l.m63303a("link_click", C11010c.m22280a(), a, aweme, true, null, false);
            }
            str3 = str4;
        }
        AwemeStarAtlas starAtlasInfo = aweme.getStarAtlasInfo();
        if (!(starAtlasInfo == null || starAtlasInfo.getStarAtlasLink() == null)) {
            str3 = "starmap_link";
        }
        AwemeNationalTask awemeNationalTask = aweme.getAwemeNationalTask();
        if (!(awemeNationalTask == null || awemeNationalTask.getNationalTaskLink() == null)) {
            str3 = "task_link";
        }
        if (a != null && a.linkType == 1) {
            str3 = "ad_link";
        }
        C26890h.m65011a(str2, C23089d.m56640a().mo47829a("group_id", aweme.getAid()).mo47829a("enter_from", str).mo47829a("author_id", aweme.getAuthorUid()).mo47829a("link_type", str3).f61491a);
    }

    /* renamed from: a */
    public final void mo46431a(String str, Context context, C26138s sVar, Aweme aweme, String str2) {
        C25949a a = new C25949a().mo53294a(sVar).mo53295a(aweme);
        a.f68519e = true;
        C25949a a2 = a.mo53297a(true).mo53296a(str);
        C52711k.m112240b(str2, "refer");
        C25949a aVar = a2;
        aVar.f68522h = str2;
        C26088l.m63274a(context, aVar.mo53298a());
    }

    /* renamed from: a */
    public final void mo46429a(Context context, String str, String str2, String str3, long j, JSONObject jSONObject) {
        C26890h.m65006a(context, str, str2, str3, j, jSONObject);
    }
}
