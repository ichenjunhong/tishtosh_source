package com;

import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.trill.app.TrillApplication;
import java.util.Locale;

/* renamed from: com.a */
public final class C2240a {
    /* renamed from: a */
    public static String m6772a(String str, Object[] objArr) {
        String str2;
        if (str == null || !str.contains("%d")) {
            return String.format(str, objArr);
        }
        try {
            AwemeApplication a = TrillApplication.m56199a();
            str2 = String.format((a == null || !I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().isArabicLang(a)) ? Locale.getDefault() : Locale.ENGLISH, str, objArr);
        } catch (Exception unused) {
            str2 = str;
        }
        return str2;
    }

    /* renamed from: a */
    public static String m6773a(Locale locale, String str, Object[] objArr) {
        try {
            AwemeApplication a = TrillApplication.m56199a();
            if (a != null && I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().isArabicLang(a)) {
                locale = Locale.ENGLISH;
            }
            return String.format(locale, str, objArr);
        } catch (Exception unused) {
            return str;
        }
    }
}
