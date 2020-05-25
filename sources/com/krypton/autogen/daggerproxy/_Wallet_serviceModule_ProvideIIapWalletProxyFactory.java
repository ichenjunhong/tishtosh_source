package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.sdk.IIapWalletProxy;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Wallet_serviceModule_ProvideIIapWalletProxyFactory implements C52867d<IIapWalletProxy> {

    /* renamed from: a */
    private final _Wallet_serviceModule f50205a;

    public final IIapWalletProxy get() {
        return provideInstance(this.f50205a);
    }

    public _Wallet_serviceModule_ProvideIIapWalletProxyFactory(_Wallet_serviceModule _wallet_servicemodule) {
        this.f50205a = _wallet_servicemodule;
    }

    public static _Wallet_serviceModule_ProvideIIapWalletProxyFactory create(_Wallet_serviceModule _wallet_servicemodule) {
        return new _Wallet_serviceModule_ProvideIIapWalletProxyFactory(_wallet_servicemodule);
    }

    public static IIapWalletProxy provideInstance(_Wallet_serviceModule _wallet_servicemodule) {
        return proxyProvideIIapWalletProxy(_wallet_servicemodule);
    }

    public static IIapWalletProxy proxyProvideIIapWalletProxy(_Wallet_serviceModule _wallet_servicemodule) {
        return (IIapWalletProxy) C52869f.m112471a(_wallet_servicemodule.provideIIapWalletProxy(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
