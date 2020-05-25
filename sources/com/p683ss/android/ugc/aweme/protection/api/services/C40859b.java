package com.p683ss.android.ugc.aweme.protection.api.services;

import com.p683ss.android.ugc.aweme.protection.serviceimpl.AwemeProtectionServiceImpl;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.api.services.b */
public final class C40859b implements IAwemeProtectionService {

    /* renamed from: a */
    public static final C40859b f104022a = new C40859b();

    /* renamed from: b */
    private final /* synthetic */ IAwemeProtectionService f104023b;

    public final C40860c getAntiAddictionService() {
        return this.f104023b.getAntiAddictionService();
    }

    private C40859b() {
        IAwemeProtectionService createIAwemeProtectionServicebyMonsterPlugin = AwemeProtectionServiceImpl.createIAwemeProtectionServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIAwemeProtectionServicebyMonsterPlugin, "ServiceManager.get().get…ctionService::class.java)");
        this.f104023b = createIAwemeProtectionServicebyMonsterPlugin;
    }
}
