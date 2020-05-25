package com.p683ss.android.ugc.aweme.sdk.iap;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.sdk.C41339c;
import com.p683ss.android.ugc.aweme.sdk.DefaultWalletMainProxy;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import com.p683ss.android.ugc.aweme.sdk.bean.C41336a;
import com.p683ss.android.ugc.aweme.sdk.bean.DiamondStruct;
import com.p683ss.android.ugc.aweme.sdk.iap.C41367e.C41368a;
import com.p683ss.android.ugc.aweme.sdk.iap.C41367e.C41369b;
import com.p683ss.android.ugc.aweme.sdk.iap.C41367e.C41370c;
import com.p683ss.android.ugc.aweme.sdk.iap.api.C41350a;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.C41374a;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.DiamondOrderResponse;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.TokenResponse;
import com.p683ss.android.ugc.aweme.sdk.iap.p2120a.C41349b;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.C41383a;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41392f;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.Purchase;
import com.p683ss.android.ugc.aweme.sdk.p2119b.C41333a;
import com.p683ss.android.ugc.aweme.sdk.p2119b.C41335c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.f */
public final class C41371f implements C9382a, C41351b, C41369b {

    /* renamed from: a */
    private boolean f104888a = true;

    /* renamed from: b */
    private boolean f104889b;

    /* renamed from: c */
    private boolean f104890c;

    /* renamed from: d */
    private C41370c f104891d;

    /* renamed from: e */
    private C41352c f104892e = new C41352c();

    /* renamed from: f */
    private C9381g f104893f = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: g */
    private IWalletService f104894g;

    /* renamed from: h */
    private List<C41351b> f104895h = new ArrayList();

    /* renamed from: i */
    private C41339c f104896i = C41339c.m91108a();

    /* renamed from: f */
    private void m91173f() {
        this.f104891d.mo83910a(C41345a.m91118a().mo83920a(R.string.bxc).mo83921b(R.string.d6e));
    }

    /* renamed from: d */
    public final void mo83952d() {
        if (!this.f104888a && !this.f104889b) {
            m91171a(16);
        }
        this.f104888a = false;
    }

    /* renamed from: a */
    public final void mo83947a() {
        this.f104891d.mo83914c();
        m91171a(17);
    }

    /* renamed from: b */
    public final void mo83950b() {
        this.f104894g = DEFAULT.provideWalletService_Monster();
        if (this.f104894g == null) {
            m91173f();
            return;
        }
        this.f104891d.mo83914c();
        C23566n.m57766a().mo48750a(this.f104893f, new Callable() {
            public final Object call() throws Exception {
                return ((TokenResponse) C41350a.m91125a().getToken().get()).token;
            }
        }, 32);
    }

    /* renamed from: c */
    public final void mo83951c() {
        this.f104894g = DEFAULT.provideWalletService_Monster();
        if (this.f104894g == null) {
            m91173f();
            return;
        }
        try {
            Uri parse = Uri.parse("aweme://webview/?url=https://www.musical.ly/wallet/transactions/");
            Activity b = this.f104891d.mo83913b();
            Intent a = C41333a.m91103a(b, parse);
            a.putExtra("show_load_dialog", true);
            a.putExtra("hide_nav_bar", true);
            a.putExtra("hide_status_bar", true);
            b.startActivity(a);
        } catch (Exception unused) {
            m91173f();
        }
    }

    /* renamed from: e */
    public final void mo83953e() {
        C41352c cVar = this.f104892e;
        cVar.f104859j.clear();
        cVar.f104856g.clear();
        cVar.f104855f.clear();
        cVar.f104858i = cVar.f104857h;
        cVar.f104854e = false;
        cVar.f104860k = 0;
        cVar.f104861l.removeCallbacksAndMessages(null);
        for (Purchase purchase : cVar.f104850a) {
            if (purchase.getWeakHandler() != null) {
                purchase.getWeakHandler().removeCallbacksAndMessages(null);
            }
            purchase.setWeakHandler(null);
        }
        cVar.f104850a.clear();
        try {
            cVar.f104852c.mo83985a();
        } catch (C41383a unused) {
        }
        this.f104893f.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    public final void mo83954a(C41351b bVar) {
        this.f104895h.add(bVar);
    }

    /* renamed from: a */
    private void m91171a(int i) {
        C23566n.m57766a().mo48750a(this.f104893f, new Callable() {
            public final Object call() throws Exception {
                return (C41374a) C41350a.m91125a().queryMyWallet(DefaultWalletMainProxy.provideWalletProxy_Monster().getDiamondType()).get();
            }
        }, i);
    }

    /* renamed from: a */
    private void m91172a(C41336a aVar) {
        if (aVar != null && aVar.f104808a != null) {
            this.f104890c = aVar.f104808a.isPhoneBinded();
        }
    }

    public final void handleMsg(Message message) {
        if (this.f104891d.mo83912a()) {
            Activity b = this.f104891d.mo83913b();
            Object obj = message.obj;
            if (obj != null && (obj instanceof Exception)) {
                if (obj instanceof C23459a) {
                    C9432q.m18676a((Context) b, ((C23459a) obj).getErrorMsg());
                } else {
                    C9432q.m18672a((Context) b, (int) R.string.fdk);
                }
            }
            int i = message.what;
            if (i != 32) {
                switch (i) {
                    case 16:
                        this.f104891d.mo83915d();
                        if (!(message.obj instanceof Exception)) {
                            C41374a aVar = (C41374a) message.obj;
                            if (!(aVar == null || aVar.f104899a == null)) {
                                m91172a(aVar.f104899a);
                                this.f104891d.mo83909a(aVar.f104899a.f104809b, (long) aVar.f104899a.f104810c, aVar.f104899a.f104811d, aVar.f104899a.f104812e);
                            }
                        }
                        return;
                    case 17:
                        if (message.obj instanceof Exception) {
                            mo83902a(0, (Exception) message.obj);
                            StringBuilder sb = new StringBuilder("query_wallet:");
                            sb.append(((Exception) message.obj).getMessage());
                            C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6005, new C26898j().mo54849a("msg", sb.toString()).mo54850a());
                            break;
                        } else {
                            C41374a aVar2 = (C41374a) message.obj;
                            m91172a(aVar2.f104899a);
                            if (aVar2.f104899a != null) {
                                this.f104891d.mo83909a(aVar2.f104899a.f104809b, (long) aVar2.f104899a.f104810c, aVar2.f104899a.f104811d, aVar2.f104899a.f104812e);
                            }
                            if (C9376b.m18558a((Collection<T>) aVar2.f104900b)) {
                                mo83903a(1, (Object) aVar2.f104900b);
                                break;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (DiamondStruct diamondStruct : aVar2.f104900b) {
                                    C41349b bVar = new C41349b();
                                    bVar.f104845a = diamondStruct.f104807id;
                                    bVar.f104846b = diamondStruct.iapId;
                                    bVar.f104848d = diamondStruct.diamondCount;
                                    arrayList.add(bVar);
                                }
                                this.f104892e.mo83931a((List<C41349b>) arrayList);
                                return;
                            }
                        }
                }
            } else {
                this.f104891d.mo83915d();
                if (!(message.obj instanceof Exception)) {
                    IWalletService provideWalletService_Monster = DEFAULT.provideWalletService_Monster();
                    if (provideWalletService_Monster == null) {
                        provideWalletService_Monster = new DEFAULT();
                    }
                    provideWalletService_Monster.cashOut(this.f104891d.mo83913b(), (String) message.obj);
                }
            }
        }
    }

    public C41371f(C41370c cVar, String str) {
        this.f104891d = cVar;
        this.f104892e.mo83930a(this.f104891d.mo83913b(), this, str);
    }

    public C41371f(Context context, C41351b bVar) {
        String iapKey = DefaultWalletMainProxy.provideWalletProxy_Monster().getIapKey();
        this.f104895h.add(bVar);
        this.f104891d = new C41368a();
        this.f104892e.mo83930a(context, this, iapKey);
    }

    /* renamed from: a */
    public final void mo83902a(int i, Exception exc) {
        if (this.f104891d.mo83912a()) {
            this.f104891d.mo83915d();
            C41345a a = C41345a.m91118a();
            switch (i) {
                case 0:
                case 1:
                    a.mo83920a(R.string.byl);
                    a.mo83921b(R.string.d6e);
                    this.f104891d.mo83910a(a);
                    break;
                case 2:
                    this.f104889b = false;
                    C41345a a2 = C41345a.m91118a();
                    a2.mo83920a(R.string.bz7);
                    a2.mo83921b(R.string.d6e);
                    this.f104891d.mo83910a(a2);
                    break;
            }
            if (!this.f104895h.isEmpty()) {
                for (C41351b a3 : this.f104895h) {
                    a3.mo83902a(i, exc);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo83903a(int i, Object obj) {
        if (this.f104891d.mo83912a()) {
            switch (i) {
                case 1:
                    this.f104891d.mo83915d();
                    this.f104891d.mo83911a((List) obj);
                    break;
                case 2:
                    m91171a(16);
                    this.f104889b = false;
                    break;
                case 3:
                    m91171a(16);
                    break;
            }
            if (!this.f104895h.isEmpty()) {
                for (C41351b a : this.f104895h) {
                    a.mo83903a(i, obj);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo83949a(String str, int i) {
        this.f104891d.mo83914c();
        this.f104889b = true;
        C41352c cVar = this.f104892e;
        C41392f fVar = null;
        if (cVar.f104855f.size() != 0 && !TextUtils.isEmpty(str)) {
            Iterator it = cVar.f104855f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C41392f fVar2 = (C41392f) it.next();
                if (fVar2.f104943a.equals(str)) {
                    fVar = fVar2;
                    break;
                }
            }
        }
        if (fVar == null) {
            cVar.f104858i.mo83902a(2, new Exception("Managager.charge: getSkuDetail by iapId null"));
        } else {
            C23566n.m57766a().mo48750a(cVar.f104861l, new Callable(i) {

                /* renamed from: a */
                final /* synthetic */ int f104867a;

                public final Object call() throws Exception {
                    return ((DiamondOrderResponse) C41350a.m91125a().createOrder(5, this.f104867a).get()).data;
                }

                {
                    this.f104867a = r2;
                }
            }, 48);
        }
    }

    /* renamed from: a */
    public final void mo83948a(int i, int i2, Intent intent) {
        C41352c cVar = this.f104892e;
        if (i == 10010 && cVar.f104852c != null) {
            boolean a = cVar.f104852c.mo83990a(i, i2, intent);
        }
    }
}
