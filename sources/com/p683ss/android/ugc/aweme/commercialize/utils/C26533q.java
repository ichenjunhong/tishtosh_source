package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.common.applog.GlobalContext;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.p1103ad.p1104a.C18522b;
import com.p683ss.android.p1103ad.p1104a.C18522b.C18524a;
import com.p683ss.android.p1103ad.p1104a.C18542d;
import com.p683ss.android.p1103ad.p1104a.p1107b.C18526b;
import com.p683ss.android.p1103ad.p1104a.p1107b.C18530d;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.commerce.model.C25516b;
import com.p683ss.android.ugc.aweme.commercialize.C25732e;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26058aw;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.p1549b.C25652a.C25653a;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25710b;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25717g;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25718h;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1579a.C26357e;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26456b;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26460e;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26452a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26452a.C26453a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26454b;
import com.p683ss.android.ugc.aweme.commercialize.views.AdLightWebPageView;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26780c.C26781a;
import com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.crossplatform.business.PreRenderWebViewBusiness;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p683ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.miniapp.utils.C36917d;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1962b.C36960b;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.util.C47615c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.views.C48191h;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.q */
public abstract class C26533q {

    /* renamed from: a */
    private static final String[] f69868a = {"webcast_room"};

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.q$a */
    public interface C26534a {
        /* renamed from: a */
        void mo49915a(boolean z);
    }

    /* renamed from: a */
    public static boolean m64227a(Uri uri) {
        return uri != null && (TextUtils.equals(WebKitApi.SCHEME_HTTP, uri.getScheme()) || TextUtils.equals(WebKitApi.SCHEME_HTTPS, uri.getScheme()));
    }

    /* renamed from: a */
    public static boolean m64211a(Context context, Aweme aweme) {
        return m64218a(context, aweme, false);
    }

    /* renamed from: a */
    private static boolean m64218a(Context context, Aweme aweme, boolean z) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        return m64220a(context, aweme.getAwemeRawAd().getOpenUrl(), aweme, false);
    }

    /* renamed from: a */
    public static boolean m64220a(Context context, String str, Aweme aweme, boolean z) {
        return m64221a(context, str, aweme, z, true);
    }

    /* renamed from: a */
    public static boolean m64221a(Context context, String str, Aweme aweme, boolean z, boolean z2) {
        if (context == null || aweme == null || !aweme.isAd() || TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            return false;
        }
        Uri build = parse.buildUpon().appendQueryParameter("source_aid", aweme.getAid()).build();
        String lowerCase = build.getScheme().toLowerCase();
        if (m64248e(str) && aweme.getAwemeRawAd() != null) {
            build = build.buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).build();
            str = build.toString();
        }
        if (m64230a(lowerCase)) {
            C26460e.m63978a(str);
            C23060d.f61431e.mo47789a(context, str, (String) null);
            C26058aw.m63132a(str);
            return true;
        } else if (z) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(build);
            if (!C18920g.m46049a(context, intent)) {
                return false;
            }
            if (str.contains("__back_url__")) {
                str = str.replace("__back_url__", Uri.encode(C25653a.f67876a));
                intent.setData(Uri.parse(str));
                C0013i.m16a((Callable<TResult>) new C26535r<TResult>(aweme));
            }
            intent.putExtra(C23060d.f61428b, str);
            intent.addFlags(268435456);
            if (!m64210a(context, intent)) {
                return false;
            }
            boolean Y = C26512f.m64123Y(aweme);
            if (z2 && !Y) {
                C26088l.m63338d(context, aweme);
                m64208a((C26534a) new C26536s(context, aweme));
            }
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m64226a(Context context, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C36949e.m83168d(str)) {
            C36983a.m83185b().mo76294a().openMiniApp(context, str, new C36960b());
            return true;
        }
        if (str.contains("__back_url__")) {
            str = str.replace("__back_url__", Uri.encode(C25653a.f67876a));
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme)) {
            return false;
        }
        if (m64230a(scheme)) {
            C26460e.m63978a(str);
            C23060d.f61431e.mo47789a(context, str, (String) null);
            return true;
        } else if (m64238b(str)) {
            C41302w.m91042a().mo83861a(str);
            return true;
        } else if (z) {
            return false;
        } else {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (!C18920g.m46049a(context, intent)) {
                return false;
            }
            intent.putExtra(C23060d.f61428b, str);
            if (!m64210a(context, intent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m64230a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals(C23057c.f61423a, lowerCase) || TextUtils.equals(C23057c.f61425c, lowerCase)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m64229a(Aweme aweme) {
        return aweme == null || (aweme.isAd() && C47615c.m103090a(aweme.getAwemeRawAd()));
    }

    /* renamed from: a */
    public static boolean m64214a(Context context, Aweme aweme, String str, String str2) {
        return m64215a(context, aweme, str, str2, aweme == null || (aweme.isAd() && C47615c.m103090a(aweme.getAwemeRawAd())));
    }

    /* renamed from: a */
    private static boolean m64215a(Context context, Aweme aweme, String str, String str2, boolean z) {
        return m64216a(context, aweme, str, str2, z, true);
    }

    /* renamed from: a */
    private static boolean m64216a(Context context, Aweme aweme, String str, String str2, boolean z, boolean z2) {
        return m64217a(context, aweme, str, str2, z, true, 1);
    }

    /* renamed from: a */
    public static boolean m64217a(Context context, Aweme aweme, String str, String str2, boolean z, boolean z2, int i) {
        return C26452a.m63962a(context, aweme, str, str2, z, z2, i, Boolean.valueOf(false));
    }

    /* renamed from: a */
    public static boolean m64222a(Context context, String str, String str2) {
        return m64223a(context, str, str2, false, null);
    }

    /* renamed from: a */
    public static boolean m64223a(Context context, String str, String str2, boolean z, Map<String, String> map) {
        return m64224a(context, str, str2, z, map, true);
    }

    /* renamed from: a */
    private static boolean m64224a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2) {
        return m64225a(context, str, str2, z, map, z2, (C26453a) null);
    }

    /* renamed from: a */
    public static boolean m64225a(Context context, String str, String str2, boolean z, Map<String, String> map, boolean z2, C26453a aVar) {
        return C26452a.m63964a(context, str, str2, z, map, z2, aVar);
    }

    /* renamed from: a */
    public static boolean m64219a(Context context, String str, Aweme aweme, int i) {
        return C26454b.m63966a(context, str, aweme, i);
    }

    /* renamed from: a */
    static boolean m64213a(Context context, Aweme aweme, C25908e eVar, int i) {
        if (!aweme.isAd()) {
            return false;
        }
        eVar.mo53245a(i);
        if (m64215a(context, aweme, aweme.getAwemeRawAd().getConsultUrl(), aweme.getAwemeRawAd().getWebTitle(), true)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m64212a(Context context, Aweme aweme, int i) {
        return m64235b(context, aweme, PreRenderWebViewBusiness.m65564a(i));
    }

    /* renamed from: a */
    public static boolean m64228a(C26781a aVar) {
        if (aVar == null || aVar.f70551a == null || aVar.f70552b == null) {
            return false;
        }
        C26512f.m64142c(aVar.f70558h);
        int i = aVar.f70554d;
        if (((i == 7 || i == 8) && m64237b(aVar)) || m64241c(aVar)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m64209a(Context context) {
        return C26456b.m63968a(context);
    }

    /* renamed from: b */
    static final /* synthetic */ Object m64231b(Aweme aweme) throws Exception {
        try {
            C25732e.m62287a().f68051a = aweme;
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
        return null;
    }

    /* renamed from: a */
    public static void m64208a(C26534a aVar) {
        C0013i.m12a(5000).mo19a((C0011g<TResult, TContinuationResult>) new C26537t<TResult,TContinuationResult>(aVar));
    }

    /* renamed from: d */
    public static boolean m64245d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return false;
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if (TextUtils.isEmpty(lowerCase) || m64230a(lowerCase)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        return C18920g.m46049a(GlobalContext.getContext(), intent);
    }

    /* renamed from: e */
    private static boolean m64248e(String str) {
        if (str == null) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return false;
            }
            for (String equals : f69868a) {
                if (TextUtils.equals(equals, parse.getHost())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m64237b(C26781a aVar) {
        if (aVar == null || aVar.f70551a == null || aVar.f70552b == null || !(aVar.f70551a instanceof Activity) || !AdPopUpWebPageWidget.m64806a(aVar.f70552b) || !AdPopUpWebPageWidget.m64805a(aVar.mo54672a())) {
            return false;
        }
        C47718bf.m103288a(new C25710b(1));
        return true;
    }

    /* renamed from: c */
    private static boolean m64241c(C26781a aVar) {
        if (aVar == null || aVar.f70551a == null || aVar.f70552b == null) {
            return false;
        }
        aVar.mo54671a(true);
        if (!(aVar.f70551a instanceof Activity) || !AdPopUpWebPageWidget.m64807a(aVar.f70552b, aVar.f70555e) || !AdPopUpWebPageWidget.m64805a(aVar.mo54672a())) {
            return false;
        }
        C47718bf.m103288a(new C25710b(1));
        return true;
    }

    /* renamed from: c */
    public static boolean m64242c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            return false;
        }
        String lowerCase = parse.getScheme().toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        if (m64230a(lowerCase)) {
            return true;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        return C18920g.m46049a(GlobalContext.getContext(), intent);
    }

    /* renamed from: b */
    public static boolean m64238b(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("aweme://")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m64232b(Context context, Aweme aweme) {
        return m64214a(context, aweme, (String) null, (String) null);
    }

    /* renamed from: d */
    public static boolean m64244d(Context context, Aweme aweme) {
        if (context != null && C26512f.m64124Z(aweme)) {
            return m64236b(context, aweme.getAwemeRawAd().getWebUrl());
        }
        return false;
    }

    /* renamed from: c */
    public static void m64239c(Context context, Aweme aweme) {
        if (context != null && aweme != null && aweme.getAwemeRawAd() != null) {
            String phoneNumber = aweme.getAwemeRawAd().getPhoneNumber();
            if (!TextUtils.isEmpty(phoneNumber)) {
                StringBuilder sb = new StringBuilder("tel:");
                sb.append(phoneNumber);
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(sb.toString()));
                intent.setFlags(268435456);
                m64210a(context, intent);
            }
        }
    }

    /* renamed from: b */
    public static boolean m64236b(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return m64210a(context, Intent.createChooser(intent, ""));
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m64246e(Context context, Aweme aweme) {
        boolean z;
        if (context == null || aweme == null || aweme.getSpecialSticker() == null) {
            return false;
        }
        String openUrl = aweme.getSpecialSticker().getOpenUrl();
        if (!TextUtils.isEmpty(openUrl)) {
            return C26540w.m64226a(context, openUrl, false);
        }
        String linkUrl = aweme.getSpecialSticker().getLinkUrl();
        if (C26512f.m64061d(aweme)) {
            z = C47615c.m103090a(aweme.getAwemeRawAd());
        } else {
            z = true;
        }
        return m64224a(context, linkUrl, aweme.getSpecialSticker().getTitle(), false, null, z);
    }

    /* renamed from: f */
    public static boolean m64249f(Context context, Aweme aweme) {
        if (aweme.getActivityPendant() == null) {
            return false;
        }
        C25516b activityPendant = aweme.getActivityPendant();
        if (!TextUtils.isEmpty(activityPendant.getJumpOpenUrl()) && m64226a(context, activityPendant.getJumpOpenUrl(), false)) {
            return true;
        }
        if (TextUtils.isEmpty(activityPendant.getJumpWebUrl())) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            C26453a aVar = new C26453a(awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), awemeRawAd.getDownloadUrl(), awemeRawAd.getPackageName(), awemeRawAd.getAppName(), awemeRawAd.getType());
            return m64225a(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, null, C47615c.m103090a(awemeRawAd), aVar);
        }
        return m64224a(context, activityPendant.getJumpWebUrl(), activityPendant.getTitle(), false, null, false);
    }

    /* renamed from: a */
    public static void m64206a(Context context, String str) {
        if (context != null && str != null) {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(parse.getQueryParameter("url")));
            String queryParameter = parse.getQueryParameter("immersive_mode");
            String queryParameter2 = parse.getQueryParameter("enter_from");
            String queryParameter3 = parse.getQueryParameter("author_id");
            if (queryParameter != null) {
                Integer c = C52830p.m112395c(queryParameter);
                if (c != null && c.intValue() == 1) {
                    intent.putExtra("use_ordinary_web", false);
                }
            }
            if (queryParameter2 != null) {
                intent.putExtra("quick_shop_enter_from", queryParameter2);
            }
            if (queryParameter3 != null) {
                intent.putExtra("owner_id", queryParameter3);
            }
            intent.putExtra("web_type", 2);
            C26540w.m64210a(context, intent);
        }
    }

    /* renamed from: a */
    public static boolean m64210a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException | SecurityException unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m64235b(Context context, Aweme aweme, String str) {
        if (!(context instanceof Activity) || !AdLightWebPageView.m64327a((Activity) context, str)) {
            return false;
        }
        C47718bf.m103288a(new C25710b(1));
        return true;
    }

    /* renamed from: a */
    public static void m64203a(Context context, Aweme aweme, String str) {
        new C10643a(context).mo18899b((int) R.string.dp).mo18886a((int) R.string.ah2, (OnClickListener) new C26538u(context, aweme, str)).mo18900b((int) R.string.wf, (OnClickListener) new C26539v(context, aweme)).mo18897a().mo18882b();
        C26088l.m63371l(context, aweme);
    }

    /* renamed from: b */
    public static boolean m64233b(Context context, Aweme aweme, int i) {
        if (context == null || aweme == null) {
            return false;
        }
        return m64228a(new C26781a().mo54668a(context).mo54669a(aweme.getAwemeRawAd()).mo54667a(i).mo54670a(aweme.getAid()));
    }

    /* renamed from: a */
    public static void m64207a(Context context, String str, String str2, String str3) {
        if (!m64226a(context, str2, false)) {
            m64222a(context, str, str3);
        }
    }

    /* renamed from: a */
    public static void m64202a(Context context, C26138s sVar, Aweme aweme, boolean z) {
        if (context != null && sVar != null) {
            if (!(sVar == null || !m64248e(sVar.openUrl) || aweme.getAwemeRawAd() == null)) {
                sVar.openUrl = Uri.parse(sVar.openUrl).buildUpon().appendQueryParameter("creative_id", aweme.getAwemeRawAd().getCreativeIdStr()).appendQueryParameter("log_extra", aweme.getAwemeRawAd().getLogExtra()).build().toString();
            }
            C26357e.m63797a(context, sVar, aweme, z);
        }
    }

    /* renamed from: c */
    static boolean m64240c(Context context, Aweme aweme, C25908e eVar, int i) {
        boolean a = eVar.mo53245a(i);
        if ((i == 2 || i == 6 || i == 3 || i == 8) && C26512f.m64132a(C26512f.m64049A(aweme))) {
            C47718bf.m103288a(new C25717g(aweme, i));
            if (i == 6) {
                return true;
            }
            return false;
        } else if (a && !eVar.mo53247c() && !C26512f.m64133aa(aweme)) {
            C26460e.m63976a(context, null);
            return true;
        } else if (C26540w.m64211a(context, aweme) || C36917d.m83053a(context, aweme)) {
            return false;
        } else {
            m64232b(context, aweme);
            return false;
        }
    }

    /* renamed from: a */
    public static void m64204a(Context context, NationalTaskLink nationalTaskLink, Aweme aweme, boolean z) {
        if (context != null && nationalTaskLink != null) {
            String openUrl = nationalTaskLink.getOpenUrl();
            if (!TextUtils.isEmpty(nationalTaskLink.getOpenUrl()) && C36949e.m83168d(openUrl)) {
                StringBuilder sb = new StringBuilder();
                sb.append(openUrl);
                sb.append("&schema_from=ad_link");
                String sb2 = sb.toString();
                if (z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("&position=comment_page");
                    openUrl = sb3.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb2);
                    sb4.append("&position=in_video_tag");
                    openUrl = sb4.toString();
                }
            }
            if (!C26540w.m64226a(context, openUrl, false)) {
                m64222a(context, nationalTaskLink.getWebUrl(), (String) null);
            }
        }
    }

    /* renamed from: d */
    static void m64243d(Context context, Aweme aweme, C25908e eVar, int i) {
        eVar.mo53245a(i);
        if (TextUtils.isEmpty(aweme.getAwemeRawAd().getPhoneKey()) || !(context instanceof Activity)) {
            C26540w.m64239c(context, aweme);
            return;
        }
        String str = null;
        switch (i) {
            case 2:
                str = "draw_ad";
                break;
            case 3:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            case 20:
            case 21:
                str = "background_ad";
                break;
            case 6:
                str = "comment_end_ad";
                break;
            case 8:
                str = "homepage_ad";
                break;
        }
        C26435bs a = C26435bs.m63920a();
        Activity activity = (Activity) context;
        if (aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            C18524a aVar = new C18524a();
            aVar.f51046a = String.valueOf(awemeRawAd.getAdId());
            aVar.f51048c = String.valueOf(awemeRawAd.getCreativeId());
            aVar.f51051f = awemeRawAd.getLogExtra();
            C18524a a2 = aVar.mo37800c(awemeRawAd.getPhoneNumber()).mo37795a(awemeRawAd.getInstancePhoneId()).mo37797a(awemeRawAd.getPhoneKey());
            a2.f51049d = 1;
            C18524a b = a2.mo37799b(str);
            b.f51057l = 4;
            C18522b a3 = b.mo37796a(Long.valueOf(System.currentTimeMillis())).mo37798a();
            C48191h hVar = new C48191h(activity);
            hVar.show();
            C18542d.m44864a().mo37811a(activity, a3, new C18530d(hVar) {

                /* renamed from: a */
                final /* synthetic */ C48191h f69699a;

                /* renamed from: a */
                public final void mo37804a(C18526b bVar) {
                    this.f69699a.dismiss();
                }

                /* renamed from: b */
                public final void mo37805b(C18526b bVar) {
                    this.f69699a.dismiss();
                }

                {
                    this.f69699a = r2;
                }
            });
        }
    }

    /* renamed from: e */
    static boolean m64247e(Context context, Aweme aweme, C25908e eVar, int i) {
        eVar.mo53245a(i);
        if (i == 3 || i == 4 || i == 35 || i == 22 || i == 5 || i == 36 || i == 23 || i == 6) {
            if ((eVar.mo53247c() && C26540w.m64211a(context, aweme)) || C36917d.m83053a(context, aweme)) {
                return false;
            }
            if (m64233b(context, aweme, i) || m64212a(context, aweme, i)) {
                return true;
            }
            m64232b(context, aweme);
            return false;
        } else if (m64233b(context, aweme, i) || m64212a(context, aweme, i)) {
            return true;
        } else {
            C47718bf.m103288a(new C25718h(aweme, i));
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m64250f(android.content.Context r2, com.p683ss.android.ugc.aweme.feed.model.Aweme r3, com.p683ss.android.ugc.aweme.commercialize.feed.C25908e r4, int r5) {
        /*
            r4.mo53245a(r5)
            r4 = 0
            if (r3 == 0) goto L_0x006e
            boolean r5 = r3.isAd()
            if (r5 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r3.getAwemeRawAd()
            java.lang.String r5 = r5.getRedOpenUrl()
            boolean r5 = m64220a(r2, r5, r3, r4)
            if (r5 != 0) goto L_0x006e
            if (r2 != 0) goto L_0x001e
        L_0x001c:
            r5 = 0
            goto L_0x0058
        L_0x001e:
            if (r3 != 0) goto L_0x0021
            goto L_0x001c
        L_0x0021:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r3.getAwemeRawAd()
            if (r5 != 0) goto L_0x0028
            goto L_0x001c
        L_0x0028:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r3.getAwemeRawAd()
            java.lang.String r5 = r5.getRedMpUrl()
            boolean r0 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83168d(r5)
            if (r0 != 0) goto L_0x0037
            goto L_0x001c
        L_0x0037:
            com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r0 = new com.ss.android.ugc.aweme.miniapp_api.model.b.b$a
            r0.<init>()
            java.lang.String r1 = "025002"
            com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r0 = r0.mo76223c(r1)
            java.lang.String r1 = "red_mp_url"
            com.ss.android.ugc.aweme.miniapp_api.model.b.b$a r0 = r0.mo76225e(r1)
            com.ss.android.ugc.aweme.miniapp_api.model.b.b r0 = r0.mo76221a()
            com.ss.android.ugc.aweme.miniapp_api.services.a r1 = com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a.m83185b()
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r1 = r1.mo76294a()
            r1.openMiniApp(r2, r5, r0)
            r5 = 1
        L_0x0058:
            if (r5 != 0) goto L_0x006e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r3.getAwemeRawAd()
            java.lang.String r5 = r5.getRedUrl()
            r0 = 0
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r3.getAwemeRawAd()
            boolean r1 = com.p683ss.android.ugc.aweme.util.C47615c.m103090a(r1)
            m64215a(r2, r3, r5, r0, r1)
        L_0x006e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.m64250f(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.commercialize.feed.e, int):boolean");
    }

    /* renamed from: a */
    public static void m64205a(Context context, StarAtlasLink starAtlasLink, Aweme aweme, boolean z) {
        if (context != null && starAtlasLink != null) {
            String openUrl = starAtlasLink.getOpenUrl();
            if (!TextUtils.isEmpty(starAtlasLink.getOpenUrl()) && C36949e.m83168d(openUrl)) {
                StringBuilder sb = new StringBuilder();
                sb.append(openUrl);
                sb.append("&schema_from=ad_link");
                String sb2 = sb.toString();
                if (z) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(sb2);
                    sb3.append("&position=comment_page");
                    openUrl = sb3.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb2);
                    sb4.append("&position=in_video_tag");
                    openUrl = sb4.toString();
                }
            }
            if (!C26540w.m64226a(context, openUrl, false)) {
                m64222a(context, starAtlasLink.getWebUrl(), (String) null);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0127  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m64234b(android.content.Context r10, com.p683ss.android.ugc.aweme.feed.model.Aweme r11, com.p683ss.android.ugc.aweme.commercialize.feed.C25908e r12, int r13) {
        /*
            boolean r0 = m64244d(r10, r11)
            r1 = 1
            if (r0 == 0) goto L_0x000b
            r12.mo53245a(r13)
            return r1
        L_0x000b:
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64061d(r11)
            r2 = 0
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r11.getAwemeRawAd()
            java.lang.String r0 = r0.getAuthorUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0021
            goto L_0x0027
        L_0x0021:
            switch(r13) {
                case 35: goto L_0x0025;
                case 36: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0027
        L_0x0025:
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            java.lang.String r11 = "click_title"
            com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26460e.m63976a(r10, r11)
            return r1
        L_0x0030:
            boolean r0 = r12.mo53245a(r13)
            r3 = 0
            if (r0 == 0) goto L_0x0067
            boolean r12 = r12.mo53247c()
            if (r12 != 0) goto L_0x0067
            r12 = 22
            if (r13 == r12) goto L_0x004c
            r12 = 23
            if (r13 == r12) goto L_0x004c
            r12 = 24
            if (r13 != r12) goto L_0x004a
            goto L_0x004c
        L_0x004a:
            r12 = 1
            goto L_0x004d
        L_0x004c:
            r12 = 0
        L_0x004d:
            if (r12 == 0) goto L_0x0067
            boolean r12 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64133aa(r11)
            if (r12 != 0) goto L_0x0067
            boolean r12 = m64233b(r10, r11, r13)
            if (r12 == 0) goto L_0x005c
            return r1
        L_0x005c:
            boolean r11 = m64212a(r10, r11, r13)
            if (r11 == 0) goto L_0x0063
            return r1
        L_0x0063:
            com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26460e.m63976a(r10, r3)
            return r1
        L_0x0067:
            if (r10 != 0) goto L_0x006c
        L_0x0069:
            r12 = 0
            goto L_0x00e4
        L_0x006c:
            if (r11 != 0) goto L_0x006f
            goto L_0x0069
        L_0x006f:
            boolean r12 = r11.isAd()
            if (r12 != 0) goto L_0x0076
            goto L_0x0069
        L_0x0076:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r11.getAwemeRawAd()
            if (r12 != 0) goto L_0x007f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x007f:
            java.lang.String r0 = "aweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r0)
            java.lang.String r12 = r12.getOpenUrl()
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.m62898b(r12)
            if (r0 != 0) goto L_0x008f
            goto L_0x0069
        L_0x008f:
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.p1572im.C25938a.m62898b(r12)
            if (r0 != 0) goto L_0x0096
            goto L_0x00a0
        L_0x0096:
            android.net.Uri r12 = android.net.Uri.parse(r12)
            java.lang.String r0 = "uid"
            java.lang.String r3 = r12.getQueryParameter(r0)
        L_0x00a0:
            com.ss.android.ugc.aweme.im.service.model.a r12 = new com.ss.android.ugc.aweme.im.service.model.a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r11.getAwemeRawAd()
            if (r0 != 0) goto L_0x00ab
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00ab:
            java.lang.String r4 = "aweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            java.lang.String r0 = r0.getLogExtra()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r11.getAwemeRawAd()
            if (r4 != 0) goto L_0x00bd
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00bd:
            java.lang.String r5 = "aweme.awemeRawAd!!"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.Long r4 = r4.getCreativeId()
            long r4 = r4.longValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r12.<init>(r0, r4)
            com.ss.android.ugc.aweme.commercialize.utils.c.d$a r0 = new com.ss.android.ugc.aweme.commercialize.utils.c.d$a
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r11, r10, r12, r4)
            com.ss.android.ugc.aweme.profile.api.e r12 = com.p683ss.android.ugc.aweme.profile.api.C39792e.m88511a()
            android.os.Handler r0 = (android.os.Handler) r0
            r12.mo80873a(r0, r3, r2)
            r12 = 1
        L_0x00e4:
            if (r12 == 0) goto L_0x00e7
            return r2
        L_0x00e7:
            boolean r12 = m64211a(r10, r11)
            if (r12 == 0) goto L_0x00ee
            return r2
        L_0x00ee:
            boolean r12 = com.p683ss.android.ugc.aweme.miniapp.utils.C36917d.m83053a(r10, r11)
            if (r12 == 0) goto L_0x00f5
            return r2
        L_0x00f5:
            boolean r12 = m64233b(r10, r11, r13)
            if (r12 == 0) goto L_0x00fc
            return r1
        L_0x00fc:
            boolean r12 = m64212a(r10, r11, r13)
            if (r12 == 0) goto L_0x0103
            return r1
        L_0x0103:
            r12 = 34
            if (r13 != r12) goto L_0x0127
            if (r11 == 0) goto L_0x011c
            boolean r12 = r11.isAd()
            if (r12 == 0) goto L_0x011a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r12 = r11.getAwemeRawAd()
            boolean r12 = com.p683ss.android.ugc.aweme.util.C47615c.m103090a(r12)
            if (r12 == 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r7 = 0
            goto L_0x011d
        L_0x011c:
            r7 = 1
        L_0x011d:
            r5 = 0
            r6 = 0
            r8 = 1
            r9 = 5
            r3 = r10
            r4 = r11
            m64217a(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x012a
        L_0x0127:
            m64232b(r10, r11)
        L_0x012a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.m64234b(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.commercialize.feed.e, int):boolean");
    }
}
