package com.p683ss.android.ugc.aweme.commercialize.p1550c;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26325a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26345b;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26348d;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22323f;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.report.C41201a;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c.h */
public final class C25665h implements C22323f {
    /* renamed from: a */
    public final void mo46455a(Context context, User user) {
        UserProfileActivity.m89401a(context, user);
    }

    /* renamed from: a */
    private static C26325a m62219a(AwemeRawAd awemeRawAd, String str) {
        Aweme aweme = new Aweme();
        aweme.setAwemeRawAd(awemeRawAd);
        aweme.setAd(true);
        return C26345b.m63777a(aweme, str);
    }

    /* renamed from: a */
    public final void mo46456a(Context context, String str) {
        Object obj;
        Aweme awemeById = C23324d.m57378a().getAwemeById(str);
        if (context instanceof Activity) {
            IReportService a = C27013a.m65227a();
            Activity activity = (Activity) context;
            String str2 = "landing_page";
            String str3 = C29094ad.f76264a;
            C52711k.m112240b(awemeById, "aweme");
            C52711k.m112240b(str2, "reportFrom");
            C52711k.m112240b(str3, "reportType");
            HashMap hashMap = new HashMap();
            C26138s a2 = C26428bm.m63902a(awemeById);
            Map map = hashMap;
            String str4 = "log_extra";
            String str5 = null;
            if (a2 != null) {
                obj = a2.logExtra;
            } else {
                obj = null;
            }
            map.put(str4, obj);
            String str6 = "cid";
            if (a2 != null) {
                str5 = a2.creativeId;
            }
            map.put(str6, str5);
            Builder builder = new Builder();
            String b = new C17971f().mo34889b(hashMap);
            C52711k.m112236a((Object) b, "Gson().toJson(extraMap)");
            a.reportAd(activity, C41201a.m90894a(builder, awemeById, str2, str3, b));
        }
    }

    /* renamed from: a */
    public final void mo46453a(Context context, C26138s sVar, Aweme aweme) {
        C26540w.m64202a(context, sVar, aweme, true);
    }

    /* renamed from: a */
    public final void mo46457a(Context context, String str, String str2) {
        if (!C26540w.m64226a(context, str, false)) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            if (!TextUtils.isEmpty(str2)) {
                intent.setData(Uri.parse(str2));
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: a */
    public final void mo46454a(Context context, AwemeRawAd awemeRawAd, String str, boolean z) {
        if (z) {
            C26348d.m63785a(context, m62219a(awemeRawAd, str), new C25666i(awemeRawAd, context, str), C25667j.f67886a).mo54089a();
        } else {
            C26348d.m63784a(context, m62219a(awemeRawAd, str)).mo54089a();
        }
    }
}
