package com.p683ss.android.ugc.aweme.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.p1632di.C27658cr;
import com.p683ss.android.ugc.aweme.sdk.IWalletService.C41320a;
import com.p683ss.android.ugc.aweme.sdk.api.C41331a;
import com.p683ss.android.ugc.aweme.sdk.api.WalletApi;
import com.p683ss.android.ugc.aweme.sdk.bean.C41336a;
import com.p683ss.android.ugc.aweme.sdk.bean.C41337b;
import com.p683ss.android.ugc.aweme.sdk.bean.C41338c;
import com.p683ss.android.ugc.aweme.sdk.p2118a.C41325b;
import com.p683ss.android.ugc.aweme.sdk.p2118a.C41327c;
import com.p683ss.android.ugc.aweme.sdk.p2118a.C41329d;
import com.p683ss.android.ugc.aweme.sdk.p2118a.C41330e;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.sdk.WalletService */
public class WalletService implements IWalletService {
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

    public void auth(Context context, String str, String str2, C41320a aVar) {
    }

    public void onWxIntent(Context context, Intent intent) {
    }

    public boolean pay(String str, JSONObject jSONObject, C41320a aVar) {
        return false;
    }

    public void setSetting(C41338c cVar) {
    }

    public void clearWallet() {
        C41340d a = C41340d.m91109a();
        if (a.f104817a != null) {
            a.f104817a.f104809b = 0;
        }
    }

    public long getAvailableCurrency() {
        C41340d a = C41340d.m91109a();
        if (a.f104817a == null) {
            return 0;
        }
        return a.f104817a.f104809b;
    }

    public C0013i<Long> syncWallet() {
        C41340d a = C41340d.m91109a();
        return C0013i.m16a((Callable<TResult>) new Callable<C41337b>() {
            public final /* synthetic */ Object call() throws Exception {
                WalletApi walletApi;
                if (C41331a.f104806a.get() == null) {
                    IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
                    IWalletMainProxy provideWalletProxy_Monster = DefaultWalletMainProxy.provideWalletProxy_Monster();
                    if (createIRetrofitServicebyMonsterPlugin != null) {
                        walletApi = (WalletApi) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(C41332b.m91102a(provideWalletProxy_Monster.getHost())).create(WalletApi.class);
                        C41331a.f104806a = new WeakReference<>(walletApi);
                    } else {
                        walletApi = null;
                    }
                } else {
                    walletApi = (WalletApi) C41331a.f104806a.get();
                }
                return (C41337b) walletApi.getMyWallet(1).get();
            }
        }).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<C41337b, Long>() {
            public final /* synthetic */ Object then(C0013i iVar) throws Exception {
                if (iVar.mo33d() || iVar.mo31c()) {
                    return Long.valueOf(-1);
                }
                C41337b bVar = (C41337b) iVar.mo34e();
                C41340d.this.f104817a = bVar.f104813a;
                return Long.valueOf(bVar.f104813a.f104809b);
            }
        }, C0013i.f25b);
    }

    public static IWalletService createIWalletServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IWalletService.class);
        if (a != null) {
            return (IWalletService) a;
        }
        if (C27991b.f73486aq == null) {
            synchronized (IWalletService.class) {
                if (C27991b.f73486aq == null) {
                    C27991b.f73486aq = new WalletService();
                }
            }
        }
        return (WalletService) C27991b.f73486aq;
    }

    public void openWallet(Activity activity) {
        IIapWalletProxy provideIapWalletProxy_Monster = IapWalletProxy.provideIapWalletProxy_Monster();
        if (provideIapWalletProxy_Monster != null) {
            provideIapWalletProxy_Monster.openWallet(activity);
        }
    }

    public void syncWallet(long j) {
        C41336a aVar = C41340d.m91109a().f104817a;
        if (aVar != null) {
            aVar.f104809b = j;
        }
    }

    public void cashOut(Context context, String str) {
        IIapWalletProxy provideIapWalletProxy_Monster = IapWalletProxy.provideIapWalletProxy_Monster();
        if (provideIapWalletProxy_Monster != null) {
            provideIapWalletProxy_Monster.cashOut(context, str);
        }
    }

    public void openWallet(Activity activity, String str) {
        IIapWalletProxy provideIapWalletProxy_Monster = IapWalletProxy.provideIapWalletProxy_Monster();
        if (provideIapWalletProxy_Monster != null) {
            provideIapWalletProxy_Monster.openWallet(activity, str);
        }
    }

    public Map<String, C10762d> buildJavaMethods(WeakReference<Context> weakReference, C10757a aVar) {
        Context context = (Context) weakReference.get();
        C41329d dVar = new C41329d();
        C41322a a = C41322a.m91092a().mo83898a(aVar).mo83899a("charge", new C41325b(context, aVar, dVar)).mo83899a("getPurchaseItemList", new C41327c(context, aVar, dVar)).mo83900a();
        C41330e.m91101a();
        HashMap hashMap = new HashMap();
        hashMap.put(a.f104786d.first, a.f104786d.second);
        hashMap.put(a.f104787e.first, a.f104787e.second);
        if (a.f104788f != null && !a.f104788f.isEmpty()) {
            hashMap.putAll(a.f104788f);
        }
        return hashMap;
    }

    public void init(WeakReference<Context> weakReference, C10757a aVar) {
        Context context = (Context) weakReference.get();
        C41329d dVar = new C41329d();
        C41322a a = C41322a.m91092a().mo83898a(aVar).mo83899a("charge", new C41325b(context, aVar, dVar)).mo83899a("getPurchaseItemList", new C41327c(context, aVar, dVar)).mo83900a();
        C41330e.m91101a();
        a.f104783a.mo19450a((String) a.f104786d.first, (C10762d) a.f104786d.second);
        a.f104783a.mo19450a((String) a.f104787e.first, (C10762d) a.f104787e.second);
        if (a.f104788f != null && !a.f104788f.isEmpty()) {
            for (String str : a.f104788f.keySet()) {
                a.f104783a.mo19450a(str, (C10762d) a.f104788f.get(str));
            }
        }
    }
}
