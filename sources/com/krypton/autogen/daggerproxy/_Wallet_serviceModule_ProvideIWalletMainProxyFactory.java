package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Wallet_serviceModule_ProvideIWalletMainProxyFactory implements C52867d<IWalletMainProxy> {

    /* renamed from: a */
    private final _Wallet_serviceModule f50206a;

    public final IWalletMainProxy get() {
        return provideInstance(this.f50206a);
    }

    public _Wallet_serviceModule_ProvideIWalletMainProxyFactory(_Wallet_serviceModule _wallet_servicemodule) {
        this.f50206a = _wallet_servicemodule;
    }

    public static _Wallet_serviceModule_ProvideIWalletMainProxyFactory create(_Wallet_serviceModule _wallet_servicemodule) {
        return new _Wallet_serviceModule_ProvideIWalletMainProxyFactory(_wallet_servicemodule);
    }

    public static IWalletMainProxy provideInstance(_Wallet_serviceModule _wallet_servicemodule) {
        return proxyProvideIWalletMainProxy(_wallet_servicemodule);
    }

    public static IWalletMainProxy proxyProvideIWalletMainProxy(_Wallet_serviceModule _wallet_servicemodule) {
        return (IWalletMainProxy) C52869f.m112471a(_wallet_servicemodule.provideIWalletMainProxy(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
