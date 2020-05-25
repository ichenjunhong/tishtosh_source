package com.p683ss.android.ugc.aweme.shortvideo.p2202f;

import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.f.a */
public final class C43805a {

    /* renamed from: a */
    public static final C43805a f110938a = new C43805a();

    private C43805a() {
    }

    /* renamed from: a */
    public static final boolean m96244a() {
        I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
        C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin, "ServiceManager.get()\n   …nagerService::class.java)");
        return !C52711k.m112239a((Object) "en", (Object) createI18nManagerServicebyMonsterPlugin.getAppLanguage());
    }
}
