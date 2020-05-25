package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.p2416c.C48514f;

public class _Wallet_serviceModule {
    public IIapWalletProxy provideIIapWalletProxy() {
        return ((Wallet_serviceService) C48514f.m104950a(Wallet_serviceService.class)).provideIIapWalletProxy();
    }

    public IWalletMainProxy provideIWalletMainProxy() {
        return ((Wallet_serviceService) C48514f.m104950a(Wallet_serviceService.class)).provideIWalletMainProxy();
    }

    public IWalletService provideIWalletService() {
        return ((Wallet_serviceService) C48514f.m104950a(Wallet_serviceService.class)).provideIWalletService();
    }
}
