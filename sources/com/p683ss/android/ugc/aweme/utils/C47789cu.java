package com.p683ss.android.ugc.aweme.utils;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.utils.cu */
public final class C47789cu {
    /* renamed from: a */
    public static boolean m103418a() {
        String appLanguage = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage();
        if (TextUtils.isEmpty(appLanguage) || !appLanguage.startsWith("zh")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Locale m103419b() {
        if (VERSION.SDK_INT >= 24) {
            return C11010c.m22280a().getResources().getConfiguration().getLocales().get(0);
        }
        return C11010c.m22280a().getResources().getConfiguration().locale;
    }
}
