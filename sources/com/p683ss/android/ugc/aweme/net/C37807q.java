package com.p683ss.android.ugc.aweme.net;

import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.net.q */
final class C37807q {
    /* renamed from: a */
    public static String m84407a() {
        try {
            return I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage();
        } catch (Exception unused) {
            return "en";
        }
    }
}
