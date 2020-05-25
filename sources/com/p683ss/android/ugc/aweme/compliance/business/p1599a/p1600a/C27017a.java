package com.p683ss.android.ugc.aweme.compliance.business.p1599a.p1600a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p683ss.android.ugc.aweme.compliance.api.services.report.IReportService.C27014a;
import com.p683ss.android.ugc.aweme.compliance.business.p1599a.C27016a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.a.a.a */
public final class C27017a implements IReportService {
    public final void reportDouPlus(Activity activity, Aweme aweme) {
    }

    /* renamed from: a */
    public static IReportService m65231a() {
        Object a = C27991b.m66756a(IReportService.class);
        if (a != null) {
            return (IReportService) a;
        }
        if (C27991b.f73472ac == null) {
            synchronized (IReportService.class) {
                if (C27991b.f73472ac == null) {
                    C27991b.f73472ac = new C27017a();
                }
            }
        }
        return (C27017a) C27991b.f73472ac;
    }

    public final void reportMobHelper(Map<String, String> map) {
        if (map != null) {
            C26890h.m65011a("tip_off", map);
        }
    }

    public final String reportType(Aweme aweme) {
        return C27016a.m65228a(aweme);
    }

    public final String getReportEnterMethod(String str) {
        if (TextUtils.equals(str, "long_press_mask_layer")) {
            return "long_press";
        }
        return "click_share_button";
    }

    public final String getAwemeReportType(Aweme aweme) {
        if (aweme == null) {
            return "";
        }
        if (aweme.isForwardAweme()) {
            return "forward";
        }
        if (aweme.isImage()) {
            return "image";
        }
        return "video";
    }

    public final void report(Activity activity, Builder builder) {
        C27016a.m65229a(activity, builder);
    }

    public final void reportAd(Activity activity, Builder builder) {
        if (activity != null) {
            C27016a.m65229a(activity, builder);
        }
    }

    public final void reportWithCallback(Activity activity, Builder builder, C27014a aVar) {
        C27016a.m65229a(activity, builder);
    }

    public final void reportAweme(Activity activity, Aweme aweme, String str, String str2) {
        String a = C27016a.m65228a(aweme);
        String str3 = "";
        if (activity != null) {
            Builder appendQueryParameter = new Builder().appendQueryParameter("object_id", str).appendQueryParameter("owner_id", str2).appendQueryParameter("report_type", a);
            appendQueryParameter.appendQueryParameter("locale", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage());
            if (!TextUtils.isEmpty(str3)) {
                appendQueryParameter.appendQueryParameter("video_owner_id", str3);
            }
            C27016a.m65230a(appendQueryParameter);
            SmartRouter.buildRoute((Context) activity, "//webview").withParam(appendQueryParameter.build()).withParam("show_load_dialog", false).withParam("hide_nav_bar", true).open();
        }
    }

    public final void sendReportEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C23089d a = new C23089d().mo47829a("author_id", str5).mo47829a("object_id", str4).mo47829a("object_type", str2).mo47829a("enter_from", str).mo47829a("enter_method", str7).mo47829a("group_id", str3);
        if (!TextUtils.isEmpty(str6)) {
            a.mo47829a("room_id", str6);
        }
        C26890h.m65011a("click_report", a.f61491a);
    }
}
