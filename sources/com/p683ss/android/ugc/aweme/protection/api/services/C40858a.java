package com.p683ss.android.ugc.aweme.protection.api.services;

import com.p683ss.android.ugc.aweme.compliance.AwemeProtectionDependServiceImpl;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.api.services.a */
public final class C40858a implements IAwemeProtectionDependService {

    /* renamed from: a */
    public static final C40858a f104020a = new C40858a();

    /* renamed from: b */
    private final /* synthetic */ IAwemeProtectionDependService f104021b;

    public final String getTimeLockHelperEnterFrom() {
        return this.f104021b.getTimeLockHelperEnterFrom();
    }

    private C40858a() {
        IAwemeProtectionDependService createIAwemeProtectionDependServicebyMonsterPlugin = AwemeProtectionDependServiceImpl.createIAwemeProtectionDependServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIAwemeProtectionDependServicebyMonsterPlugin, "ServiceManager.get().get…ependService::class.java)");
        this.f104021b = createIAwemeProtectionDependServicebyMonsterPlugin;
    }
}
