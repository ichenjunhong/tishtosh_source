package com.p683ss.android.ugc.aweme.sdk;

import android.content.Context;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.p1632di.C27658cr;

/* renamed from: com.ss.android.ugc.aweme.sdk.DefaultWalletMainProxy */
public class DefaultWalletMainProxy implements IWalletMainProxy {
    public static IWalletMainProxy provideWalletProxy_Monster() {
        if (C27991b.f73517m == null) {
            synchronized (IWalletMainProxy.class) {
                if (C27991b.f73517m == null) {
                    C27991b.f73517m = C27658cr.m66327a();
                }
            }
        }
        return (IWalletMainProxy) C27991b.f73517m;
    }

    public boolean enableShoppingTotal() {
        return false;
    }

    public int getDiamondType() {
        return 0;
    }

    public String getHost() {
        return "aweme.snssdk.com";
    }

    public String getIapKey() {
        return "";
    }

    public String getSchema(String str) {
        return "";
    }

    public void openSchema(Context context, String str) {
    }
}
