package com.p683ss.android.ugc.aweme.utils;

import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.ec */
public final class C47841ec {

    /* renamed from: a */
    public static final C47841ec f120406a = new C47841ec();

    private C47841ec() {
    }

    /* renamed from: a */
    public static String m103484a(String str) {
        C52711k.m112240b(str, "projectKey");
        I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
        C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin, "service");
        String appLanguage = createI18nManagerServicebyMonsterPlugin.getAppLanguage();
        String e = C35837h.m80980e();
        StringBuilder sb = new StringBuilder("https://www.tiktok.com/in_app/redirect?region=");
        sb.append(e);
        sb.append("&language=");
        sb.append(appLanguage);
        sb.append("&projectKey=");
        sb.append(str);
        return sb.toString();
    }
}
