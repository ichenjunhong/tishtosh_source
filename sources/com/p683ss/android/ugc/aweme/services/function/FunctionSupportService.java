package com.p683ss.android.ugc.aweme.services.function;

import com.p683ss.android.ugc.aweme.services.FunctionSupportServiceImpl;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.function.FunctionSupportService */
public final class FunctionSupportService implements IFunctionSupportService {
    public static final FunctionSupportService INSTANCE = new FunctionSupportService();
    private final /* synthetic */ IFunctionSupportService $$delegate_0;

    public final boolean notSupport(IFunctionKey iFunctionKey) {
        return this.$$delegate_0.notSupport(iFunctionKey);
    }

    private FunctionSupportService() {
        IFunctionSupportService createIFunctionSupportServicebyMonsterPlugin = FunctionSupportServiceImpl.createIFunctionSupportServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIFunctionSupportServicebyMonsterPlugin, "ServiceManager.get().get…pportService::class.java)");
        this.$$delegate_0 = createIFunctionSupportServicebyMonsterPlugin;
    }
}
