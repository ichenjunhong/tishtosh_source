package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Wallet_serviceModule_ProvideIWalletServiceFactory implements C52867d<IWalletService> {

    /* renamed from: a */
    private final _Wallet_serviceModule f50207a;

    public final IWalletService get() {
        return provideInstance(this.f50207a);
    }

    public _Wallet_serviceModule_ProvideIWalletServiceFactory(_Wallet_serviceModule _wallet_servicemodule) {
        this.f50207a = _wallet_servicemodule;
    }

    public static _Wallet_serviceModule_ProvideIWalletServiceFactory create(_Wallet_serviceModule _wallet_servicemodule) {
        return new _Wallet_serviceModule_ProvideIWalletServiceFactory(_wallet_servicemodule);
    }

    public static IWalletService provideInstance(_Wallet_serviceModule _wallet_servicemodule) {
        return proxyProvideIWalletService(_wallet_servicemodule);
    }

    public static IWalletService proxyProvideIWalletService(_Wallet_serviceModule _wallet_servicemodule) {
        return (IWalletService) C52869f.m112471a(_wallet_servicemodule.provideIWalletService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
