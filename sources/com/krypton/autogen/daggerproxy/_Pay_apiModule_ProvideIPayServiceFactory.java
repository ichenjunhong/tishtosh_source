package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.pay.service.IPayService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Pay_apiModule_ProvideIPayServiceFactory implements C52867d<IPayService> {

    /* renamed from: a */
    private final _Pay_apiModule f50200a;

    public final IPayService get() {
        return provideInstance(this.f50200a);
    }

    public _Pay_apiModule_ProvideIPayServiceFactory(_Pay_apiModule _pay_apimodule) {
        this.f50200a = _pay_apimodule;
    }

    public static _Pay_apiModule_ProvideIPayServiceFactory create(_Pay_apiModule _pay_apimodule) {
        return new _Pay_apiModule_ProvideIPayServiceFactory(_pay_apimodule);
    }

    public static IPayService provideInstance(_Pay_apiModule _pay_apimodule) {
        return proxyProvideIPayService(_pay_apimodule);
    }

    public static IPayService proxyProvideIPayService(_Pay_apiModule _pay_apimodule) {
        return (IPayService) C52869f.m112471a(_pay_apimodule.provideIPayService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
