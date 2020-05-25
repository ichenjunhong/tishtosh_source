package com.p683ss.android.ugc.aweme.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.account.C20854a;

/* renamed from: com.ss.android.ugc.aweme.setting.m */
final /* synthetic */ class C41633m implements OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f105365a;

    C41633m(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f105365a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C20854a.m53169i().switchProAccount(0, null, null, 0, new C41678q(this.f105365a, dialogInterface));
    }
}
