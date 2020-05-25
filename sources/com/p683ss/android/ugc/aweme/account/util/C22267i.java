package com.p683ss.android.ugc.aweme.account.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.p1307ui.RecoverAccountActivity;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.utils.C47915gg;

/* renamed from: com.ss.android.ugc.aweme.account.util.i */
public final class C22267i {
    /* renamed from: a */
    public static boolean m55117a() {
        return m55118a((String) null);
    }

    /* renamed from: a */
    public static boolean m55118a(String str) {
        if (!C20902b.m53242a().getCurUser().isUserCancelled()) {
            return false;
        }
        RecoverAccountActivity.m55026a(AwemeApplication.m56199a(), str);
        return true;
    }

    /* renamed from: a */
    public static void m55116a(Context context) {
        String str;
        if (C47915gg.m103651b()) {
            str = "https://www.tiktok.com/account/confirm";
        } else {
            str = "https://www.tiktok.com/account/check";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("?locale=");
        sb.append(I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage());
        String sb2 = sb.toString();
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.putExtra("hide_status_bar", true);
        intent.putExtra("hide_nav_bar", true);
        intent.setData(Uri.parse(sb2));
        context.startActivity(intent);
    }
}
