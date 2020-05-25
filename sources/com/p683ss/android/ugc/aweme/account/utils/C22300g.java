package com.p683ss.android.ugc.aweme.account.utils;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.buildconfigdiff.C24095a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.main.service.C36694o;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import com.p683ss.android.ugc.aweme.router.C41302w;

/* renamed from: com.ss.android.ugc.aweme.account.utils.g */
public final class C22300g {
    /* renamed from: a */
    public static void m55188a(Context context, String str, String str2) {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C26890h.m65011a("click_feedback_entrance", new C20856a().mo44776a("enter_method", str2).mo44776a("enter_from", str).f56798a);
            try {
                SmartRouter.buildRoute(context, C32816h.m75716b().getFeedbackConf().getNotLoggedIn()).open();
            } catch (C10174a unused) {
                C18922i iVar = new C18922i(C24095a.m58957n());
                iVar.mo38778a("enter_from", str);
                if (C22298e.m55183b()) {
                    iVar.mo38778a("locale", ((C36694o) C23826bi.m58450a(C36694o.class)).mo47888a());
                }
                ((C36703x) C23826bi.m58450a(C36703x.class)).mo47870a(context, iVar.toString(), true);
            }
        }
    }

    /* renamed from: b */
    public static void m55189b(Context context, String str, String str2) {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C26890h.m65011a("click_feedback_entrance", new C20856a().mo44776a("enter_method", str2).mo44776a("enter_from", str).f56798a);
            try {
                C41302w.m91042a().mo83861a(C24095a.m58956m());
            } catch (Exception unused) {
                C18922i iVar = new C18922i(C24095a.m58956m());
                iVar.mo38778a("enter_from", str);
                if (C22298e.m55183b()) {
                    iVar.mo38778a("locale", ((C36694o) C23826bi.m58450a(C36694o.class)).mo47888a());
                }
                ((C36703x) C23826bi.m58450a(C36703x.class)).mo47870a(context, iVar.toString(), true);
            }
        }
    }

    /* renamed from: a */
    public static String m55187a(String str, Uri uri, String str2, String str3, String str4, String str5) {
        Builder buildUpon = Uri.parse(uri.getQueryParameter(str)).buildUpon();
        buildUpon.appendQueryParameter("username", str2);
        buildUpon.appendQueryParameter("has_mobile", str3);
        buildUpon.appendQueryParameter("has_email", str4);
        Uri parse = Uri.parse(str5);
        for (String str6 : parse.getQueryParameterNames()) {
            buildUpon.appendQueryParameter(str6, parse.getQueryParameter(str6));
        }
        return buildUpon.toString();
    }
}
