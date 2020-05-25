package com.p683ss.android.ugc.aweme.i18n.language.p1805a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.bytedance.ies.dmt.p664ui.common.rebranding.C10683a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33115h;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33121l;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.net.CommonApi;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.sticker.types.p2321ar.pixelloop.p2324b.C46485a;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.i18n.language.a.b */
public final class C33098b {

    /* renamed from: a */
    public static final String f85922a;

    /* renamed from: b */
    public Map<String, C35834e> f85923b;

    /* renamed from: c */
    public CommonApi f85924c;

    /* renamed from: com.ss.android.ugc.aweme.i18n.language.a.b$a */
    static class C33101a {

        /* renamed from: a */
        public static C33098b f85931a = new C33098b();
    }

    /* renamed from: a */
    public static C33098b m76080a() {
        return C33101a.f85931a;
    }

    /* renamed from: c */
    public static String m76082c() {
        return Resources.getSystem().getConfiguration().locale.getCountry();
    }

    /* renamed from: b */
    public final String mo70131b() {
        return m76081a(C33106b.m76103a());
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f61282b);
        sb.append("/aweme/v1/device/update/");
        f85922a = sb.toString();
    }

    private C33098b() {
        this.f85923b = new LinkedHashMap();
        if ("local_test".equals(C11010c.m22295p()) || "lark_inhouse".equals(C11010c.m22295p())) {
            this.f85923b.put("sq", new C33097a("sq", "sq", "", "Translate To Key"));
        }
        this.f85923b.put("en", new C33097a("en", "en", "", "English"));
        this.f85923b.put("ar", new C33097a("ar", "ar", "", "العربية"));
        this.f85923b.put("de-DE", new C33097a("de-DE", "de", "DE", "Deutsch (Deutschland)"));
        this.f85923b.put("es", new C33097a("es", "es", "", "Español"));
        this.f85923b.put("fi-FI", new C33097a("fi-FI", "fi", "FI", "Suomi (Suomi)"));
        this.f85923b.put("fr", new C33097a("fr", "fr", "", "Français"));
        this.f85923b.put("id-ID", new C33097a("id-ID", "id", "ID", "Bahasa Indonesia (Indonesia)"));
        this.f85923b.put("ja-JP", new C33097a("ja-JP", "ja", "JP", "日本語（日本）"));
        this.f85923b.put("ko-KR", new C33097a("ko-KR", "ko", "KR", "한국어 (대한민국)"));
        this.f85923b.put("ms-MY", new C33097a("ms-MY", "ms", "MY", "Bahasa Melayu (Malaysia)"));
        this.f85923b.put("ru-RU", new C33097a("ru-RU", "ru", "RU", "Русский (Россия)"));
        this.f85923b.put("th-TH", new C33097a("th-TH", "th", "TH", "ไทย (ไทย)"));
        this.f85923b.put("tr-TR", new C33097a("tr-TR", "tr", "TR", "Türkçe (Türkiye)"));
        this.f85923b.put("vi-VN", new C33097a("vi-VN", "vi", "VN", "Tiếng Việt (Việt Nam)"));
        C33097a aVar = new C33097a("zh-Hant-TW", "zh", "TW", "繁體中文", "zh-Hant");
        this.f85923b.put("zh-Hant-TW", aVar);
        this.f85923b.put("af-ZA", new C33097a("af-ZA", "af", "ZA", "Afrikaans"));
        this.f85923b.put("he-IL", new C33097a("he-IL", "he", "IL", "עברית (ישראל)"));
        this.f85923b.put("jv-MY", new C33097a("jv-MY", "jv", "MY", "Basa Jawa (Malaysia)"));
        this.f85923b.put("ceb-PH", new C33097a("ceb-PH", "ceb", "PH", "Cebuano (Pilipinas)"));
        this.f85923b.put("cs-CZ", new C33097a("cs-CZ", "cs", "CZ", "Čeština (Česká republika)"));
        this.f85923b.put("it-IT", new C33097a("it-IT", "it", "IT", "Italiano (Italia)"));
        this.f85923b.put("hu-HU", new C33097a("hu-HU", "hu", "HU", "Magyar (Magyarország)"));
        this.f85923b.put("nl-NL", new C33097a("nl-NL", "nl", "NL", "Nederlands (Nederland)"));
        this.f85923b.put("pl-PL", new C33097a("pl-PL", "pl", "PL", "Polski (Polska)"));
        this.f85923b.put("pt-BR", new C33097a("pt-BR", "pt", "BR", "Português (Brasil)"));
        this.f85923b.put("ro-RO", new C33097a("ro-RO", "ro", "RO", "Română (Romania)"));
        this.f85923b.put("sv-SE", new C33097a("sv-SE", "sv", "SE", "Svenska (Sverige)"));
        this.f85923b.put("sw", new C33097a("sw", "sw", "", "Kiswahili"));
        this.f85923b.put("fil-PH", new C33097a("fil-PH", "fil", "PH", "Filipino (Pilipinas)"));
        this.f85923b.put("el-GR", new C33097a("el-GR", "el", "GR", "Ελληνικά (Ελλάδα)"));
        this.f85923b.put("zu-ZA", new C33097a("zu-ZA", "zu", "ZA", "isiZulu"));
        this.f85923b.put("uk-UA", new C33097a("uk-UA", "uk", "UA", "Українська (Україна)"));
        this.f85923b.put("ur", new C33097a("ur", "ur", "", "اردو"));
        this.f85923b.put("mr-IN", new C33097a("mr-IN", "mr", "IN", "मराठी"));
        this.f85923b.put("hi-IN", new C33097a("hi-IN", "hi", "IN", "हिंदी"));
        this.f85923b.put("bn-IN", new C33097a("bn-IN", "bn", "IN", "বাঙ্গালি (ভারত)"));
        this.f85923b.put("pa-IN", new C33097a("pa-IN", "pa", "IN", "ਪੰਜਾਬੀ (ਭਾਰਤ)"));
        this.f85923b.put("gu-IN", new C33097a("gu-IN", "gu", "IN", "ગુજરાતી"));
        this.f85923b.put("or-IN", new C33097a("or-IN", C46485a.f117298d, "IN", "ଓଡିଆ"));
        this.f85923b.put("ta-IN", new C33097a("ta-IN", "ta", "IN", "தமிழ்"));
        this.f85923b.put("te-IN", new C33097a("te-IN", "te", "IN", "తెలుగు"));
        this.f85923b.put("kn-IN", new C33097a("kn-IN", "kn", "IN", "ಕನ್ನಡ"));
        this.f85923b.put("ml-IN", new C33097a("ml-IN", "ml", "IN", "മലയാളം"));
        this.f85923b.put("my-MM", new C33097a("my-MM", "my", "MM", "မမြန်မာဘာသာ (မြန်မာ)"));
        this.f85923b.put("km-KH", new C33097a("km-KH", "km", "KH", "ភាសាខ្មែរ (កម្ពុជា)"));
    }

    /* renamed from: a */
    public final C35834e mo70128a(Context context) {
        C35834e eVar = (C35834e) this.f85923b.get(C33106b.m76108b());
        if (eVar != null) {
            return eVar;
        }
        return (C35834e) this.f85923b.get("en");
    }

    /* renamed from: a */
    public final Locale mo70129a(String str) {
        C35834e eVar = (C35834e) this.f85923b.get(str);
        if (eVar != null) {
            return eVar.mo70123c();
        }
        return null;
    }

    /* renamed from: a */
    public static String m76081a(Locale locale) {
        if (C33102c.m76094a(locale, Locale.TRADITIONAL_CHINESE)) {
            return "zh-Hant";
        }
        if (C33102c.m76094a(locale, Locale.CHINESE) || C33102c.m76094a(locale, Locale.SIMPLIFIED_CHINESE)) {
            return "zh-Hans";
        }
        if ("iw".equals(locale.getLanguage())) {
            return "he";
        }
        if ("in".equals(locale.getLanguage())) {
            return "id";
        }
        return locale.getLanguage();
    }

    /* renamed from: a */
    public final void mo70130a(final String str, final String str2, final Context context) {
        C330991 r0 = new C33104d() {

            /* renamed from: a */
            WeakReference<Context> f85925a = new WeakReference<>(context);

            /* renamed from: a */
            public final void mo70132a() {
                C33106b.m76107a("pref_language_key", str2);
                C33106b.m76107a("key_current_locale", str);
                Context context = (Context) this.f85925a.get();
                if (context != null) {
                    if (context instanceof Activity) {
                        ((Activity) context).finish();
                    }
                    C33115h.m76117a().f85949a = false;
                    C33121l.m76125b(2);
                    if (C11010c.m22292m() == 5) {
                        SmartRouter.buildRoute(context, "aweme://main").addFlags(268468224).open();
                    } else {
                        Intent intent = new Intent();
                        intent.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
                        intent.setFlags(268468224);
                        context.startActivity(intent);
                    }
                    C48107j.m104193f().mo95350c();
                    Keva.getRepo("TTSettingData").erase("last_get_setting_time");
                    C23794bh.m58386a().getSettingManagerService().syncSetting(2);
                    C10683a.m21510a();
                    C23566n.m57766a().mo48750a(null, new Callable() {
                        public final Object call() throws Exception {
                            if (C33098b.this.f85924c == null) {
                                C33098b.this.f85924c = (CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(CommonApi.class);
                            }
                            Api.m56468a((String) C33098b.this.f85924c.doGet(C33098b.f85922a).execute().f33552b, C33098b.f85922a);
                            return null;
                        }
                    }, 0);
                    BusinessComponentServiceUtils.getLiveAllService().mo74808b();
                    IAccountUserService g = C20854a.m53167g();
                    if (g.isLogin()) {
                        g.updateLanguage(null, I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage(), 0);
                    }
                    C36983a.m83185b().mo76294a().notifyLocaleChange(C33106b.m76104a(context));
                }
            }
        };
        if (context == null) {
            context = C11010c.m22280a();
        }
        C33102c.m76090a(context, C33106b.m76105a(str, str2, context), true, r0);
    }
}
