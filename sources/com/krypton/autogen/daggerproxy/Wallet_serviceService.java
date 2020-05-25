package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;

public interface Wallet_serviceService {
    IIapWalletProxy provideIIapWalletProxy();

    IWalletMainProxy provideIWalletMainProxy();

    IWalletService provideIWalletService();
}
