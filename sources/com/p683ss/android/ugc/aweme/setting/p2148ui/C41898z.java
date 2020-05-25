package com.p683ss.android.ugc.aweme.setting.p2148ui;

import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.shortvideo.AVApiImpl;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.z */
final /* synthetic */ class C41898z implements Callable {

    /* renamed from: a */
    private final PrivacySettingActivity f106045a;

    C41898z(PrivacySettingActivity privacySettingActivity) {
        this.f106045a = privacySettingActivity;
    }

    public final Object call() {
        PrivacySettingActivity privacySettingActivity = this.f106045a;
        String aid = privacySettingActivity.f105742e.getAid();
        int i = 0;
        String valueOf = String.valueOf((privacySettingActivity.f105742e.getDuetSetting() == 0 || privacySettingActivity.f105742e.getReactSetting() == 0) ? 1 : 0);
        if (privacySettingActivity.f105742e.getDuetSetting() == 0 || privacySettingActivity.f105742e.getReactSetting() == 0) {
            i = 1;
        }
        String valueOf2 = String.valueOf(i);
        C18922i iVar = new C18922i(PrivacySettingActivity.f105735j);
        iVar.mo38778a("aweme_id", aid);
        iVar.mo38778a("item_duet", valueOf2);
        iVar.mo38778a("item_react", valueOf);
        AVApiImpl.createAVApibyMonsterPlugin().executeGetJSONObject(iVar.toString(), BaseResponse.class, null);
        return null;
    }
}
