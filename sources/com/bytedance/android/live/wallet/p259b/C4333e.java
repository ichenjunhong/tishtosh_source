package com.bytedance.android.live.wallet.p259b;

import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.p180b.p181a.C2944a;
import com.bytedance.android.live.wallet.p259b.C4327c.C4330a;
import com.bytedance.android.live.wallet.p259b.C4327c.C4331b;
import com.bytedance.android.livesdk.p282ag.p283a.C4627a;
import com.bytedance.android.livesdk.p399o.C8069h;
import com.bytedance.android.livesdkapi.depend.model.C8675a;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal.HsSkuDetail;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8776g;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.live.wallet.b.e */
public final class C4333e implements C9382a {

    /* renamed from: a */
    public final C9381g f11869a;

    /* renamed from: b */
    public final C4327c f11870b;

    /* renamed from: c */
    public boolean f11871c;

    /* renamed from: d */
    public C8675a f11872d;

    /* renamed from: e */
    public C4330a f11873e;

    /* renamed from: f */
    public String f11874f;

    /* renamed from: a */
    public void mo10118a() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final C8675a aVar = new C8675a(this.f11872d);
        this.f11872d = null;
        ArrayList arrayList = new ArrayList();
        for (ChargeDeal chargeDeal : aVar.f23711a) {
            if (chargeDeal.f23693g != null) {
                arrayList.add(chargeDeal.f23693g);
            }
        }
        this.f11870b.mo10115a((List<String>) arrayList, (C8776g) new C8776g() {
            /* renamed from: a */
            public final void mo10119a(int i, List<HsSkuDetail> list) {
                long uptimeMillis = SystemClock.uptimeMillis() - uptimeMillis;
                HashMap hashMap = new HashMap();
                hashMap.put("error_code", Integer.valueOf(-1));
                hashMap.put("error_msg", "");
                C4627a.m11094b(1, uptimeMillis, hashMap);
                C4627a.m11095c(1, uptimeMillis, hashMap);
                C4333e eVar = C4333e.this;
                StringBuilder sb = new StringBuilder("queryFailed: ");
                sb.append(-1);
                new C8069h().mo14225a("errorCode", (Object) Integer.valueOf(-2)).mo14225a("errorDesc", (Object) sb.toString()).mo14228a("hotsoon_iap_productslist_failure_rate", 1);
                eVar.f11871c = false;
            }
        });
    }

    public final void handleMsg(Message message) {
        String str;
        String str2;
        C8069h hVar;
        if (this.f11871c && message.what == 1001) {
            if (message.obj instanceof Exception) {
                Exception exc = (Exception) message.obj;
                if (exc instanceof C2944a) {
                    hVar = new C8069h().mo14225a("errorCode", (Object) Integer.valueOf(((C2944a) exc).getErrorCode()));
                    str2 = "errorDesc";
                } else {
                    hVar = new C8069h().mo14225a("errorCode", (Object) Integer.valueOf(-1));
                    str2 = "errorDesc";
                    if (exc == null) {
                        str = "";
                        hVar.mo14225a(str2, (Object) str).mo14228a("hotsoon_iap_productslist_failure_rate", 1);
                        this.f11871c = false;
                        return;
                    }
                }
                str = exc.getMessage();
                hVar.mo14225a(str2, (Object) str).mo14228a("hotsoon_iap_productslist_failure_rate", 1);
                this.f11871c = false;
                return;
            }
            C8675a aVar = (C8675a) message.obj;
            if (aVar == null || C9414h.m18630a(aVar.f23711a)) {
                new C8069h().mo14228a("hotsoon_iap_productslist_failure_rate", 0);
                this.f11871c = false;
                if (!(aVar == null || aVar.f23711a == null || aVar.f23711a.size() <= 0 || aVar.f23711a.get(0) == null || ((ChargeDeal) aVar.f23711a.get(0)).f23697k == null)) {
                    this.f11874f = ((ChargeDeal) aVar.f23711a.get(0)).f23697k.f23706f;
                }
                return;
            }
            this.f11872d = aVar;
            if (this.f11870b.f11857b == C4331b.CONNECTED) {
                mo10118a();
                return;
            }
            this.f11870b.mo10116b(this.f11873e);
        }
    }
}
