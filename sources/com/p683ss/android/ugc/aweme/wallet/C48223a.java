package com.p683ss.android.ugc.aweme.wallet;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;

/* renamed from: com.ss.android.ugc.aweme.wallet.a */
public final class C48223a {

    /* renamed from: a */
    public static C48224b f121356a;

    /* renamed from: a */
    public static void m104473a(Activity activity, String str) {
        IWalletService provideWalletService_Monster = DEFAULT.provideWalletService_Monster();
        if (provideWalletService_Monster != null && !TextUtils.equals("amazon", C11010c.m22295p())) {
            provideWalletService_Monster.openWallet(activity, str);
        }
    }
}
