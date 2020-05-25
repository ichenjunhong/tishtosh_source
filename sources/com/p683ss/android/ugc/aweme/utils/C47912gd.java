package com.p683ss.android.ugc.aweme.utils;

import android.net.Uri;
import android.os.Build;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.utils.gd */
public final class C47912gd {
    /* renamed from: a */
    public static Uri m103637a() {
        Uri parse = Uri.parse("https://www.tiktokv.com/aweme/i18n/uninstall/");
        try {
            return parse.buildUpon().appendQueryParameter("app_id", String.valueOf(C11010c.m22289j())).appendQueryParameter("device_type", Build.MODEL).appendQueryParameter("device_id", AppLog.getServerDeviceId()).appendQueryParameter("language", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getSysLanguage()).build();
        } catch (Exception unused) {
            return parse;
        }
    }
}
