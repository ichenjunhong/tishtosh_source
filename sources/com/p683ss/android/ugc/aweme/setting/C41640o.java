package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.o */
final /* synthetic */ class C41640o implements Callable {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f105373a;

    /* renamed from: b */
    private final User f105374b;

    C41640o(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, User user) {
        this.f105373a = i18nSettingManageMyAccountActivity;
        this.f105374b = user;
    }

    public final Object call() {
        return this.f105373a.mo85271a(this.f105374b);
    }
}
