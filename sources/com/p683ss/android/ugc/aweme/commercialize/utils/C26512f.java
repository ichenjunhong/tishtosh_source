package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.geckoclient.C10885e;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1570d.C25906d;
import com.p683ss.android.ugc.aweme.commercialize.model.C26116c;
import com.p683ss.android.ugc.aweme.commercialize.model.C26133n;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import com.p683ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.miniapp_api.C36949e;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.experiment.LinkMigrationExperiment;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.f */
public class C26512f extends C26503d {

    /* renamed from: b */
    static final /* synthetic */ boolean f69836b = (!C26512f.class.desiredAssertionStatus());

    /* renamed from: P */
    public static boolean m64114P(Aweme aweme) {
        return false;
    }

    /* renamed from: a */
    public static String m64127a(int i) {
        switch (i) {
            case 1:
                return "reviewing";
            case 2:
                return "review_reject";
            case 3:
                return "advertiser_confirming";
            case 4:
                return "advertiser_reject";
            case 6:
                return "advertiser_ready";
            case 7:
                return "advertiser_schedule";
            default:
                return "";
        }
    }

    /* renamed from: f */
    public static boolean m64147f(C26136q qVar) {
        return qVar == null;
    }

    /* renamed from: b */
    public static boolean m64139b() {
        try {
            return C32816h.m75716b().getBioSettings().getEnableBioEmail().booleanValue();
        } catch (C10174a unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m64144c() {
        C10181b.m20511a().mo18172a(LinkMigrationExperiment.class, true, "enable_link_ad_migration", 31744, true);
        return false;
    }

    /* renamed from: a */
    public static boolean m64130a() {
        try {
            return C32816h.m75716b().getBioSettings().getEnableBioUrl().booleanValue();
        } catch (C10174a unused) {
            return false;
        }
    }

    /* renamed from: N */
    public static boolean m64112N(Aweme aweme) {
        if (m64113O(aweme) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public static boolean m64119U(Aweme aweme) {
        AwemeSplashInfo l = m64069l(aweme);
        if (l == null) {
            return false;
        }
        return l.adCardShownOnce;
    }

    /* renamed from: V */
    public static String m64120V(Aweme aweme) {
        AwemeSplashInfo l = m64069l(aweme);
        if (l == null) {
            return null;
        }
        return l.getAwesomeSplashId();
    }

    /* renamed from: b */
    public static boolean m64141b(String str) {
        if (str == null || !str.contains("__back_url__")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m64143c(C26136q qVar) {
        if (m64147f(qVar)) {
            return "";
        }
        return qVar.getId();
    }

    /* renamed from: e */
    public static String m64146e(C26136q qVar) {
        if (m64147f(qVar)) {
            return "";
        }
        return qVar.getOpenUrl();
    }

    /* renamed from: g */
    public static String m64148g(C26136q qVar) {
        if (m64147f(qVar)) {
            return "";
        }
        return qVar.getWebUrl();
    }

    /* renamed from: h */
    public static String m64149h(C26136q qVar) {
        if (m64147f(qVar)) {
            return "";
        }
        return qVar.getWebTitle();
    }

    /* renamed from: F */
    public static String m64104F(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getFormUrl();
    }

    /* renamed from: G */
    public static String m64105G(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getWebUrl();
    }

    /* renamed from: H */
    public static String m64106H(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getWebTitle();
    }

    /* renamed from: I */
    public static String m64107I(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getPackageName();
    }

    /* renamed from: K */
    public static boolean m64109K(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getPlayFunModel() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: L */
    public static boolean m64110L(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        SpecialSticker specialSticker = aweme.getSpecialSticker();
        if (specialSticker == null || specialSticker.getStickerType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public static C26133n m64113O(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return null;
        }
        return aweme.getAwemeRawAd().getDouPlusLinkData();
    }

    /* renamed from: Q */
    public static boolean m64115Q(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdHintData() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public static boolean m64121W(Aweme aweme) {
        AwemeSplashInfo l = m64069l(aweme);
        if (l != null && ((long) l.getEndTime()) >= System.currentTimeMillis() / 1000) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public static boolean m64122X(Aweme aweme) {
        AwemeRawAd k = m64068k(aweme);
        if (k == null || !k.isPopUps()) {
            return false;
        }
        String openUrl = k.getOpenUrl();
        if (TextUtils.isEmpty(openUrl)) {
            return false;
        }
        return C26540w.m64245d(openUrl);
    }

    /* renamed from: Z */
    public static boolean m64124Z(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !aweme.getAwemeRawAd().isOpenSystemBrowser()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m64128a(C26136q qVar) {
        if (m64147f(qVar)) {
            return "";
        }
        return qVar.getSourceType();
    }

    /* renamed from: ac */
    public static boolean m64135ac(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getIndicatorData() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: ae */
    private static String m64137ae(Aweme aweme) {
        String str = "";
        if (aweme == null || !aweme.isAd()) {
            return str;
        }
        return aweme.getAwemeRawAd().getType();
    }

    /* renamed from: b */
    public static String m64138b(Challenge challenge) {
        if (!m64131a(challenge)) {
            return "";
        }
        return challenge.getChallengeDisclaimer().getContent();
    }

    /* renamed from: c */
    public static Aweme m64142c(String str) {
        IAwemeService a = C23324d.m57378a();
        Aweme rawAdAwemeById = a.getRawAdAwemeById(str);
        Aweme awemeById = a.getAwemeById(str);
        if (rawAdAwemeById != null) {
            return rawAdAwemeById;
        }
        return awemeById;
    }

    /* renamed from: J */
    public static boolean m64108J(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (!TextUtils.equals(awemeRawAd.getType(), "redpacket")) {
            return false;
        }
        UrlModel redImageUrl = awemeRawAd.getRedImageUrl();
        if (redImageUrl == null || C9376b.m18558a((Collection<T>) redImageUrl.getUrlList())) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public static CardStruct m64111M(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getCardInfos() == null || !aweme.getAwemeRawAd().getCardInfos().containsKey("5")) {
            return null;
        }
        return (CardStruct) aweme.getAwemeRawAd().getCardInfos().get("5");
    }

    /* renamed from: T */
    public static Bundle m64118T(Aweme aweme) {
        Bundle R = m64116R(aweme);
        CardStruct M = m64111M(aweme);
        if (M != null && !TextUtils.isEmpty(M.getCardUrl())) {
            R.putString("url", M.getCardUrl());
            R.putBoolean("use_css_injection", false);
        }
        if (C26369ac.m63812a(aweme)) {
            R.putBoolean("show_load_dialog", true);
        }
        return R;
    }

    /* renamed from: Y */
    public static boolean m64123Y(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        String openUrl = aweme.getAwemeRawAd().getOpenUrl();
        String microAppUrl = aweme.getAwemeRawAd().getMicroAppUrl();
        if (C36949e.m83168d(openUrl) || (C36949e.m83168d(microAppUrl) && !C26540w.m64242c(openUrl))) {
            return true;
        }
        return false;
    }

    /* renamed from: aa */
    public static boolean m64133aa(Aweme aweme) {
        if (aweme == null || !aweme.isAd()) {
            return false;
        }
        if (!f69836b && aweme.getAwemeRawAd() == null) {
            throw new AssertionError();
        } else if (m64057a(aweme) && aweme.getAwemeRawAd().getFakeAuthor() != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static String m64145d(C26136q qVar) {
        if (m64147f(qVar)) {
            return "";
        }
        if (qVar.getSourceUrl() == null) {
            return "";
        }
        if (C9376b.m18558a((Collection<T>) qVar.getSourceUrl().getUrlList())) {
            return "";
        }
        return (String) qVar.getSourceUrl().getUrlList().get(0);
    }

    /* renamed from: S */
    public static Bundle m64117S(Aweme aweme) {
        Bundle R = m64116R(aweme);
        CardStruct A = m64049A(aweme);
        if (A != null && !TextUtils.isEmpty(A.getCardUrl()) && m64132a(A)) {
            R.putString("url", Uri.parse(A.getCardUrl()).buildUpon().appendQueryParameter("type", "4").toString());
            R.putBoolean("use_css_injection", false);
        } else if (A != null && !TextUtils.isEmpty(A.getCardUrl()) && A.getCardType() == 1001) {
            R.putString("url", A.getCardUrl());
        }
        R.putBoolean("show_load_dialog", true);
        return R;
    }

    /* renamed from: a */
    public static Bundle m64125a(C26116c cVar) {
        if (cVar == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("ad_id", cVar.f68955a);
        bundle.putLong("aweme_creative_id", cVar.f68955a);
        bundle.putString("bundle_download_app_log_extra", cVar.f68956b);
        bundle.putString("group_id", String.valueOf(cVar.f68957c));
        bundle.putString("ad_type", cVar.f68964j);
        bundle.putInt("ad_system_origin", cVar.f68965k);
        if (!TextUtils.isEmpty(cVar.f68961g)) {
            bundle.putString("bundle_download_url", cVar.f68961g);
            bundle.putBoolean("bundle_is_from_app_ad", true);
            bundle.putString("aweme_package_name", cVar.f68962h);
            bundle.putString("bundle_download_app_name", cVar.f68963i);
        }
        bundle.putString("ad_js_url", (String) SharePrefCache.inst().getJsActlogUrl().mo47782d());
        if (cVar.f68966l != null) {
            bundle.putString("aweme_id", cVar.f68966l.getAid());
        }
        return bundle;
    }

    /* renamed from: ad */
    private static String m64136ad(Aweme aweme) {
        if (m64082y(aweme)) {
            String str = null;
            if (!(aweme == null || !aweme.isAd() || aweme.getAwemeRawAd().getDefaultCardInfo() == null)) {
                str = aweme.getAwemeRawAd().getDefaultCardInfo().getCardUrl();
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (TextUtils.equals(m64137ae(aweme), "form")) {
            return m64104F(aweme);
        }
        if (TextUtils.equals(m64137ae(aweme), "app")) {
            return m64077t(aweme);
        }
        if (TextUtils.equals(m64137ae(aweme), "web")) {
            return m64105G(aweme);
        }
        return "";
    }

    /* renamed from: b */
    public static boolean m64140b(C26136q qVar) {
        String a = m64128a(qVar);
        if (TextUtils.equals(a, "web") || TextUtils.equals(a, "gif") || TextUtils.equals(a, "webp")) {
            return true;
        }
        return false;
    }

    /* renamed from: ab */
    public static boolean m64134ab(Aweme aweme) {
        List list;
        if (!m64061d(aweme) || aweme.getAwemeRawAd().getCardInfos() == null) {
            return false;
        }
        CardStruct s = m64076s(aweme);
        if (s == null || !s.isEnablePreload()) {
            return false;
        }
        String cardUrl = s.getCardUrl();
        if (cardUrl == null) {
            return false;
        }
        List<String> list2 = null;
        try {
            list = C32816h.m75716b().getAdLandingPageConfig().getAdCardPreloadCommonChannel();
            try {
                list2 = C32816h.m75716b().getAdLandingPageConfig().getAdCardPreloadCommonPrefix();
            } catch (C10174a unused) {
            }
        } catch (C10174a unused2) {
            list = null;
        }
        if (C9376b.m18558a((Collection<T>) list) || C9376b.m18558a((Collection<T>) list2)) {
            return false;
        }
        for (String str : list2) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str2 = (String) it.next();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2);
                    if (cardUrl.contains(sb.toString())) {
                        if (C47731bq.m103352f()) {
                            return C47731bq.m103343c(C48380q.m104672e().mo41210d(), str2);
                        }
                        C10885e e = C47731bq.m103348e();
                        if (e != null) {
                            return e.mo19666b(str2);
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: R */
    public static Bundle m64116R(Aweme aweme) {
        Bundle bundle = new Bundle();
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return bundle;
        }
        long longValue = aweme.getAwemeRawAd().getCreativeId().longValue();
        String logExtra = aweme.getAwemeRawAd().getLogExtra();
        String downloadUrl = aweme.getAwemeRawAd().getDownloadUrl();
        String quickAppUrl = aweme.getAwemeRawAd().getQuickAppUrl();
        String ad = m64136ad(aweme);
        CardStruct s = m64076s(aweme);
        if (m64132a(s)) {
            ad = Uri.parse(ad).buildUpon().appendQueryParameter("type", "3").toString();
        }
        bundle.putString("url", ad);
        bundle.putLong("ad_id", longValue);
        bundle.putString("ad_type", aweme.getAwemeRawAd().getType());
        bundle.putInt("ad_system_origin", aweme.getAwemeRawAd().getSystemOrigin());
        bundle.putString("ad_js_url", (String) SharePrefCache.inst().getJsActlogUrl().mo47782d());
        bundle.putString("aweme_id", aweme.getAid());
        bundle.putBoolean("show_load_dialog", false);
        bundle.putString("bundle_download_app_log_extra", logExtra);
        bundle.putString("bundle_download_url", downloadUrl);
        bundle.putString("bundle_ad_quick_app_url", quickAppUrl);
        bundle.putBoolean("bundle_forbidden_jump", true);
        bundle.putBoolean("bundle_show_download_status_bar", false);
        if (!TextUtils.equals("SM-G9550", Build.MODEL) || !TextUtils.equals("samsung", Build.BRAND.toLowerCase())) {
            bundle.putBoolean("bundle_fix_webview", false);
        }
        String str = "";
        C25906d preloadData = aweme.getAwemeRawAd().getPreloadData();
        if (preloadData != null) {
            str = preloadData.getSiteId();
        }
        String str2 = "";
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (!(createIAdServicebyMonsterPlugin == null || createIAdServicebyMonsterPlugin.getAdLandPagePreloadService() == null)) {
            str2 = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46652a(str, aweme.getAwemeRawAd().getAdId(), aweme.getAwemeRawAd().getCreativeId(), C22858c.f61207c);
        }
        bundle.putString("preload_channel_name", str2);
        bundle.putInt("preload_web_status", aweme.getAwemeRawAd().getPreloadWeb());
        bundle.putString("commerce_enter_from", "feedad");
        if (s != null) {
            bundle.putBoolean("bundle_enable_card_preload", s.isEnablePreload());
        }
        return bundle;
    }

    /* renamed from: a */
    public static boolean m64131a(Challenge challenge) {
        if (challenge == null) {
            return false;
        }
        ChallengeDisclaimer challengeDisclaimer = challenge.getChallengeDisclaimer();
        if (challengeDisclaimer != null && !TextUtils.isEmpty(challengeDisclaimer.getTitle()) && !TextUtils.isEmpty(challengeDisclaimer.getContent())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m64132a(CardStruct cardStruct) {
        if (cardStruct == null) {
            return false;
        }
        if (cardStruct.getCardType() == 8 || cardStruct.getCardType() == 9) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T> T m64126a(String str, Type type) {
        try {
            return C47759cc.m103382a().getGson().mo34885a(str, type);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m64129a(String str, String str2) {
        if (m64141b(str)) {
            return str.replace("__back_url__", Uri.encode(str2));
        }
        return str;
    }
}
