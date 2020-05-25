package com.p683ss.android.ugc.aweme.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.p1632di.C27658cr;
import com.p683ss.android.ugc.aweme.sdk.IWalletService.C41320a;
import com.p683ss.android.ugc.aweme.sdk.bean.C41338c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.sdk.Wallet */
public final class Wallet {

    /* renamed from: com.ss.android.ugc.aweme.sdk.Wallet$DEFAULT */
    public static final class DEFAULT implements IWalletService {
        private DEFAULT() {
        }

        public static IWalletService provideWalletService_Monster() {
            if (C27991b.f73520p == null) {
                synchronized (IWalletService.class) {
                    if (C27991b.f73520p == null) {
                        C27991b.f73520p = C27658cr.m66329c();
                    }
                }
            }
            return (IWalletService) C27991b.f73520p;
        }

        public final void auth(Context context, String str, String str2, C41320a aVar) {
        }

        public final Map<String, C10762d> buildJavaMethods(WeakReference<Context> weakReference, C10757a aVar) {
            return null;
        }

        public final void cashOut(Context context, String str) {
        }

        public final void clearWallet() {
        }

        public final long getAvailableCurrency() {
            return 0;
        }

        public final void init(WeakReference<Context> weakReference, C10757a aVar) {
        }

        public final void onWxIntent(Context context, Intent intent) {
        }

        public final void openWallet(Activity activity) {
        }

        public final void openWallet(Activity activity, String str) {
        }

        public final boolean pay(String str, JSONObject jSONObject, C41320a aVar) {
            return false;
        }

        public final void setSetting(C41338c cVar) {
        }

        public final C0013i<Long> syncWallet() {
            return null;
        }

        public final void syncWallet(long j) {
        }
    }
}
