package com.p683ss.android.ugc.aweme.setting.services;

import com.p683ss.android.ugc.aweme.familiar.service.FamiliarUpdateSettingService;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.services.c */
public final class C41714c implements IUpdateSettingService {

    /* renamed from: a */
    public static final C41714c f105571a = new C41714c();

    /* renamed from: b */
    private final /* synthetic */ IUpdateSettingService f105572b;

    public final void updateCurrentSetting(C41686c cVar) {
        C52711k.m112240b(cVar, "settings");
        this.f105572b.updateCurrentSetting(cVar);
    }

    private C41714c() {
        IUpdateSettingService createIUpdateSettingServicebyMonsterPlugin = FamiliarUpdateSettingService.createIUpdateSettingServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIUpdateSettingServicebyMonsterPlugin, "ServiceManager.get().get…ttingService::class.java)");
        this.f105572b = createIUpdateSettingServicebyMonsterPlugin;
    }
}
