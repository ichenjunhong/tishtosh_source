package com.p683ss.android.ugc.aweme.setting.services;

import android.view.View;
import com.p683ss.android.ugc.aweme.setting.SettingDependService;
import com.p683ss.android.ugc.aweme.setting.p2148ui.SettingNewVersionActivity;
import java.util.HashSet;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.services.a */
public final class C41712a implements ISettingDependService {

    /* renamed from: a */
    public static final C41712a f105567a = new C41712a();

    /* renamed from: b */
    private final /* synthetic */ ISettingDependService f105568b;

    public final void handleUnloginForSetting(SettingNewVersionActivity settingNewVersionActivity, HashSet<View> hashSet) {
        C52711k.m112240b(settingNewVersionActivity, "activity");
        C52711k.m112240b(hashSet, "unloginGoneView");
        this.f105568b.handleUnloginForSetting(settingNewVersionActivity, hashSet);
    }

    public final List<String> itemListForPushSetting() {
        return this.f105568b.itemListForPushSetting();
    }

    public final List<String> itmeListForPrivacySetting() {
        return this.f105568b.itmeListForPrivacySetting();
    }

    public final List<String> itmeListForSetting() {
        return this.f105568b.itmeListForSetting();
    }

    private C41712a() {
        ISettingDependService createISettingDependServicebyMonsterPlugin = SettingDependService.createISettingDependServicebyMonsterPlugin();
        C52711k.m112236a((Object) createISettingDependServicebyMonsterPlugin, "ServiceManager.get().get…ependService::class.java)");
        this.f105568b = createISettingDependServicebyMonsterPlugin;
    }
}
