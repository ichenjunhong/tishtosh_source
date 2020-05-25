package com.p683ss.android.ugc.aweme.p1632di;

import com.p683ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.sdk.IapWalletProxy;
import com.p683ss.android.ugc.aweme.sdk.WalletService;
import com.p683ss.android.ugc.aweme.wallet.WalletMainProxy;

/* renamed from: com.ss.android.ugc.aweme.di.cr */
public final class C27658cr {
    /* renamed from: a */
    public static IWalletMainProxy m66327a() {
        return new WalletMainProxy();
    }

    /* renamed from: b */
    public static IIapWalletProxy m66328b() {
        return new IapWalletProxy();
    }

    /* renamed from: c */
    public static IWalletService m66329c() {
        return new WalletService();
    }
}
