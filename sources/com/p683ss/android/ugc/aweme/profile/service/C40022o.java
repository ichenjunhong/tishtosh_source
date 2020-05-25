package com.p683ss.android.ugc.aweme.profile.service;

import android.content.Context;
import android.view.View;
import com.p683ss.android.ugc.aweme.p1336ak.C22565c;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceImpl;
import com.p683ss.android.ugc.aweme.services.IBusinessComponentService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.service.o */
public final class C40022o implements C22565c {

    /* renamed from: a */
    public static final C40022o f101958a = new C40022o();

    /* renamed from: b */
    private final /* synthetic */ C22565c f101959b;

    /* renamed from: a */
    public final void mo46903a() {
        this.f101959b.mo46903a();
    }

    /* renamed from: a */
    public final void mo46904a(String str, String str2, View view, View view2, Context context) {
        this.f101959b.mo46904a(str, str2, view, view2, context);
    }

    private C40022o() {
        IBusinessComponentService createIBusinessComponentServicebyMonsterPlugin = BusinessComponentServiceImpl.createIBusinessComponentServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIBusinessComponentServicebyMonsterPlugin, "ServiceManager.get().get…onentService::class.java)");
        C22565c labService = createIBusinessComponentServicebyMonsterPlugin.getLabService();
        C52711k.m112236a((Object) labService, "ServiceManager.get().get…e::class.java).labService");
        this.f101959b = labService;
    }
}
