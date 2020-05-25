package com.p683ss.android.ugc.aweme.setting;

import android.content.DialogInterface;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;

/* renamed from: com.ss.android.ugc.aweme.setting.q */
final /* synthetic */ class C41678q implements C20840g {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f105447a;

    /* renamed from: b */
    private final DialogInterface f105448b;

    C41678q(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, DialogInterface dialogInterface) {
        this.f105447a = i18nSettingManageMyAccountActivity;
        this.f105448b = dialogInterface;
    }

    public final void onResult(int i, int i2, Object obj) {
        this.f105447a.mo85274a(this.f105448b, i, i2, obj);
    }
}
