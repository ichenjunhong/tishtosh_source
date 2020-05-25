package com.p683ss.android.ugc.aweme.wallet;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.crossplatform.base.C27148b;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.p1632di.C27658cr;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p683ss.android.ugc.aweme.sdk.bean.C41338c;

/* renamed from: com.ss.android.ugc.aweme.wallet.WalletMainProxy */
public class WalletMainProxy implements IWalletMainProxy {
    private C41338c walletSetting;

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

    public String getIapKey() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqd6WT9zqz6boFUWCNb8hXcqWD+Ya5iCZdsBpqQbCrCATK5TY8vC0Qmemj8khX0LVtnQ9H7S9iPR9RquroRhShnoY0FgQWC9VqQj5zYD5WQfsWW4GAzArMJyr2XeWapOkUjlR/9xrlF3pxj3d+OSFgomF8CAy7I59SbJ8HO08APFpXOjv/bCGXD5MrA0/Zmgeqml7+RvCyMtlvV+7dHlvQ2nmwjcxS021zmwI2ArXTi3XEaXerIuE1vF0GJuIKoxxKqRvMStJShgEzjjAmOtGNaS04nw7VBctpYjEw8giftMjR3L43QyL/PNlD98w0SCx/1kkDEN4HuuRxCByVtdH0QIDAQAB";
    }

    public int getDiamondType() {
        if (C35837h.m80977b()) {
            return 3;
        }
        return 1;
    }

    public String getHost() {
        if (C35837h.m80977b()) {
            return "api.tiktokv.com";
        }
        return "m.tiktok.com";
    }

    public boolean enableShoppingTotal() {
        if (C35837h.m80977b()) {
            return false;
        }
        return ((Boolean) C23183v.m56778a().mo47891B().mo47782d()).booleanValue();
    }

    public static IWalletMainProxy createIWalletMainProxybyMonsterPlugin() {
        Object a = C27991b.m66756a(IWalletMainProxy.class);
        if (a != null) {
            return (IWalletMainProxy) a;
        }
        if (C27991b.f73482am == null) {
            synchronized (IWalletMainProxy.class) {
                if (C27991b.f73482am == null) {
                    C27991b.f73482am = new WalletMainProxy();
                }
            }
        }
        return (WalletMainProxy) C27991b.f73482am;
    }

    public String getSchema(String str) {
        String str2;
        if (C48223a.f121356a == null) {
            str2 = SharePrefCache.inst().getSharePref().getString(str, "");
        } else if (TextUtils.equals(str, IWalletMainProxy.KEY_PAGE_CHARGE) && !TextUtils.isEmpty(C48223a.f121356a.mo95717a())) {
            str2 = C48223a.f121356a.mo95717a();
        } else if (!TextUtils.equals(str, IWalletMainProxy.KEY_PAGE_INDEX) || TextUtils.isEmpty(C48223a.f121356a.mo95718b())) {
            str2 = "";
        } else {
            str2 = C48223a.f121356a.mo95718b();
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (C35837h.m80977b()) {
            if (TextUtils.equals(str, IWalletMainProxy.KEY_PAGE_INDEX)) {
                return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
            }
            if (TextUtils.equals(str, IWalletMainProxy.KEY_PAGE_CHARGE)) {
                return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fwallet%2Frecharge%3Fhide_nav_bar%3D1";
            }
            return "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
        } else if (TextUtils.equals(str, IWalletMainProxy.KEY_PAGE_INDEX)) {
            return "aweme://webview/?url=https%3A%2F%2Fm.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
        } else {
            if (TextUtils.equals(str, IWalletMainProxy.KEY_PAGE_CHARGE)) {
                return "aweme://webview/?url=https%3A%2F%2Fm.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
            }
            return "aweme://webview/?url=https%3A%2F%2Fm.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
        }
    }

    public void openSchema(Context context, String str) {
        if (C35837h.m80977b() || !TextUtils.equals("amazon", C11010c.m22295p())) {
            context.startActivity(C27148b.m65481a(context, Uri.parse(str)));
        }
    }
}
