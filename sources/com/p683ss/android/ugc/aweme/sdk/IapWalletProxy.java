package com.p683ss.android.ugc.aweme.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.C2240a;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.p1632di.C27658cr;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.sdk.IapWalletProxy */
public class IapWalletProxy implements IIapWalletProxy {
    private static final String CASH_OUT_URL = "https://www.musical.ly/wallet/withdraw/";
    private static final String TAG = "CashOutService";

    public static IIapWalletProxy provideIapWalletProxy_Monster() {
        if (C27991b.f73521q == null) {
            synchronized (IIapWalletProxy.class) {
                if (C27991b.f73521q == null) {
                    C27991b.f73521q = C27658cr.m66328b();
                }
            }
        }
        return (IIapWalletProxy) C27991b.f73521q;
    }

    public static IIapWalletProxy createIIapWalletProxybyMonsterPlugin() {
        Object a = C27991b.m66756a(IIapWalletProxy.class);
        if (a != null) {
            return (IIapWalletProxy) a;
        }
        if (C27991b.f73488as == null) {
            synchronized (IIapWalletProxy.class) {
                if (C27991b.f73488as == null) {
                    C27991b.f73488as = new IapWalletProxy();
                }
            }
        }
        return (IapWalletProxy) C27991b.f73488as;
    }

    public void openWallet(Context context) {
        IWalletMainProxy provideWalletProxy_Monster = DefaultWalletMainProxy.provideWalletProxy_Monster();
        String str = "";
        if (provideWalletProxy_Monster != null) {
            str = provideWalletProxy_Monster.getSchema(IWalletMainProxy.KEY_PAGE_INDEX);
        }
        openWallet(context, str);
    }

    public void openWallet(Context context, String str) {
        IWalletMainProxy provideWalletProxy_Monster = DefaultWalletMainProxy.provideWalletProxy_Monster();
        provideWalletProxy_Monster.openSchema(context, provideWalletProxy_Monster.getSchema(str));
    }

    public void cashOut(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C2240a.m6773a(Locale.US, "%s?token=%s&diamond_type=%d", new Object[]{CASH_OUT_URL, str, Integer.valueOf(DefaultWalletMainProxy.provideWalletProxy_Monster().getDiamondType())}))));
        } catch (Exception unused) {
        }
    }
}
