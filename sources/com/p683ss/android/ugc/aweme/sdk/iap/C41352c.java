package com.p683ss.android.ugc.aweme.sdk.iap;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.vending.billing.IInAppBillingService.Stub;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.push.downgrade.C40895d;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.DiamondOrderStruct;
import com.p683ss.android.ugc.aweme.sdk.iap.p2120a.C41349b;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.C41383a;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.C41386d;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.C41387e;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.C41388f;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41389c;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41390d;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41392f;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.Purchase;
import com.p683ss.android.ugc.aweme.sdk.p2119b.C41335c;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.c */
public final class C41352c implements C9382a {

    /* renamed from: a */
    public Set<Purchase> f104850a = new LinkedHashSet();

    /* renamed from: b */
    public List<String> f104851b = new ArrayList();

    /* renamed from: c */
    public C41376b f104852c;

    /* renamed from: d */
    public String f104853d;

    /* renamed from: e */
    boolean f104854e;

    /* renamed from: f */
    public List<C41392f> f104855f = new ArrayList();

    /* renamed from: g */
    WeakReference<Context> f104856g;

    /* renamed from: h */
    C41351b f104857h = new C41351b() {
        /* renamed from: a */
        public final void mo83902a(int i, Exception exc) {
        }

        /* renamed from: a */
        public final void mo83903a(int i, Object obj) {
        }
    };

    /* renamed from: i */
    public C41351b f104858i = this.f104857h;

    /* renamed from: j */
    public List<C41358d> f104859j = new ArrayList();

    /* renamed from: k */
    public int f104860k = 0;

    /* renamed from: l */
    C9381g f104861l = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: m */
    private List<C41349b> f104862m;

    /* renamed from: n */
    private C41388f f104863n = new C41388f() {
        /* renamed from: a */
        public final void mo83935a(C41389c cVar, C41390d dVar) {
            if (C41352c.this.f104852c == null || cVar.mo84001b()) {
                StringBuilder sb = new StringBuilder("query_product:");
                sb.append(cVar.f104940b);
                C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6006, new C26898j().mo54849a("msg", sb.toString()).mo54850a());
                C41351b bVar = C41352c.this.f104858i;
                StringBuilder sb2 = new StringBuilder("Manager.mGotInventoryListener mHelper:");
                sb2.append(C41352c.this.f104852c);
                sb2.append(" result.isFailure");
                bVar.mo83902a(1, new Exception(sb2.toString()));
                return;
            }
            C41352c.this.f104855f.clear();
            C41352c.this.f104850a.clear();
            for (String str : C41352c.this.f104851b) {
                C41392f fVar = (C41392f) dVar.f104941a.get(str);
                if (fVar != null) {
                    C41352c.this.f104855f.add(fVar);
                }
            }
            for (int i = 0; i < C41352c.this.f104851b.size(); i++) {
                Purchase purchase = (Purchase) dVar.f104942b.get((String) C41352c.this.f104851b.get(i));
                if (purchase != null && C41352c.this.mo83932a(purchase)) {
                    C41358d dVar2 = new C41358d(purchase, C41352c.this.f104858i, C41352c.this.f104852c);
                    C41352c.this.f104859j.add(dVar2);
                    purchase.setWeakHandler(new C9381g(Looper.getMainLooper(), dVar2));
                    C41352c.this.f104850a.add(purchase);
                    Message message = new Message();
                    message.what = 50;
                    purchase.getWeakHandler().sendMessageDelayed(message, (long) (i * 500));
                }
            }
            if (C41352c.this.f104855f.size() == 0) {
                C41352c.this.f104858i.mo83902a(1, new Exception("Manager.mGotInventoryListener mOnShelfProducts.size() == 0"));
            } else {
                C41352c.this.mo83929a();
            }
        }
    };

    /* renamed from: o */
    private C41386d f104864o = new C41386d() {
        /* renamed from: a */
        public final void mo83936a(C41389c cVar, Purchase purchase) {
            if (C41352c.this.f104852c == null) {
                C41352c.this.f104858i.mo83902a(2, new Exception("Manager.mPurchaseFinishedListener mHelper null"));
            } else if (cVar.mo84001b()) {
                C41352c.this.f104858i.mo83902a(2, new Exception("Manager.mPurchaseFinishedListener result isFailure"));
                int i = cVar.f104939a;
                StringBuilder sb = new StringBuilder("buy_coins onIabPurchaseFinished result isFailure:");
                sb.append(cVar.f104940b);
                C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", i, new C26898j().mo54849a("msg", sb.toString()).mo54850a());
            } else if (!C41352c.this.mo83932a(purchase)) {
                C41351b bVar = C41352c.this.f104858i;
                StringBuilder sb2 = new StringBuilder("Manager.mPurchaseFinishedListener verifyDeveloperPayload false, payload:");
                sb2.append(purchase.getDeveloperPayload());
                bVar.mo83902a(2, new Exception(sb2.toString()));
                StringBuilder sb3 = new StringBuilder("buy_coins verifyDeveloperPayload  failed, purchase originalJson: ");
                sb3.append(purchase.getOriginalJson());
                sb3.append("  basePayLoad:");
                sb3.append(C41352c.this.f104853d);
                C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6007, new C26898j().mo54849a("msg", sb3.toString()).mo54850a());
            } else {
                C41358d dVar = new C41358d(purchase, C41352c.this.f104858i, C41352c.this.f104852c);
                C41352c.this.f104859j.add(dVar);
                purchase.setWeakHandler(new C9381g(Looper.getMainLooper(), dVar));
                C41352c.this.f104850a.add(purchase);
                Message message = new Message();
                message.what = 49;
                purchase.getWeakHandler().sendMessage(message);
            }
        }
    };

    /* renamed from: b */
    private void m91129b() {
        Message message = new Message();
        message.what = 32;
        this.f104861l.sendMessageDelayed(message, 500);
    }

    /* renamed from: c */
    private void m91130c() {
        if (this.f104860k == 1) {
            m91131d();
        } else if (this.f104860k == 3) {
            m91129b();
        } else {
            C41351b bVar = this.f104858i;
            StringBuilder sb = new StringBuilder("Manager.checkSetupStatus status:");
            sb.append(this.f104860k);
            bVar.mo83902a(1, new Exception(sb.toString()));
        }
    }

    /* renamed from: d */
    private void m91131d() {
        try {
            if (this.f104852c == null) {
                this.f104858i.mo83902a(1, new Exception("Presenter.queryInventory mHelper null"));
            } else {
                this.f104852c.mo83989a(true, this.f104851b, null, this.f104863n);
            }
        } catch (Exception e) {
            this.f104858i.mo83902a(1, e);
        }
    }

    /* renamed from: a */
    public final void mo83929a() {
        ArrayList arrayList = new ArrayList();
        for (C41392f fVar : this.f104855f) {
            C41349b bVar = new C41349b();
            bVar.f104846b = fVar.f104943a;
            bVar.f104847c = fVar.f104945c;
            Iterator it = this.f104862m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C41349b bVar2 = (C41349b) it.next();
                if (bVar2.f104846b.equals(bVar.f104846b)) {
                    bVar.f104845a = bVar2.f104845a;
                    bVar.f104848d = bVar2.f104848d;
                    break;
                }
            }
            arrayList.add(bVar);
        }
        this.f104858i.mo83903a(1, (Object) arrayList);
    }

    /* renamed from: a */
    public final boolean mo83932a(Purchase purchase) {
        String[] split = purchase.getDeveloperPayload().split(",");
        if (split.length <= 0 || !split[0].equals(this.f104853d)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83931a(List<C41349b> list) {
        this.f104862m = list;
        for (C41349b bVar : this.f104862m) {
            if (!TextUtils.isEmpty(bVar.f104846b)) {
                this.f104851b.add(bVar.f104846b);
            }
        }
        if (this.f104851b.size() == 0) {
            this.f104858i.mo83902a(1, new Exception("Manager.fetchProductsFromGooglePay mIapIds size==0"));
        } else {
            m91130c();
        }
    }

    public final void handleMsg(Message message) {
        int i = message.what;
        if (i != 32) {
            if (i == 48) {
                if (message.obj instanceof Exception) {
                    this.f104858i.mo83902a(2, (Exception) message.obj);
                    StringBuilder sb = new StringBuilder("buy_coins:");
                    sb.append(((Exception) message.obj).getMessage());
                    C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6007, new C26898j().mo54849a("msg", sb.toString()).mo54850a());
                    return;
                }
                DiamondOrderStruct diamondOrderStruct = (DiamondOrderStruct) message.obj;
                if (diamondOrderStruct != null) {
                    if (this.f104852c == null) {
                        this.f104858i.mo83902a(2, new Exception("Manager.launchPurchaseFlow mHelper: null"));
                        StringBuilder sb2 = new StringBuilder("buy_coinsmHelper: ");
                        sb2.append(this.f104852c);
                        C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6007, new C26898j().mo54849a("msg", sb2.toString()).mo54850a());
                        return;
                    } else if (this.f104852c.f104905d) {
                        C41351b bVar = this.f104858i;
                        StringBuilder sb3 = new StringBuilder("Manager.launchPurchaseFlow:  mHelpoer isDisposed:");
                        sb3.append(this.f104852c.f104905d);
                        bVar.mo83902a(2, new Exception(sb3.toString()));
                        StringBuilder sb4 = new StringBuilder("buy_coins mHelper isDisposed:");
                        sb4.append(this.f104852c.f104905d);
                        C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6007, new C26898j().mo54849a("msg", sb4.toString()).mo54850a());
                        return;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(this.f104853d);
                        sb5.append(",");
                        sb5.append(UUID.randomUUID().toString());
                        sb5.append(",");
                        sb5.append(diamondOrderStruct.orderId);
                        try {
                            this.f104852c.mo83986a((Activity) this.f104856g.get(), diamondOrderStruct.productId, "inapp", null, 10010, this.f104864o, sb5.toString());
                            return;
                        } catch (C41383a e) {
                            this.f104858i.mo83902a(2, (Exception) e);
                            StringBuilder sb6 = new StringBuilder("buy_coins IabAsyncInProgressException:");
                            sb6.append(e.getMessage());
                            C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6007, new C26898j().mo54849a("msg", sb6.toString()).mo54850a());
                        }
                    }
                }
            }
            return;
        }
        m91130c();
    }

    /* renamed from: a */
    public final void mo83930a(Context context, C41351b bVar, String str) {
        if (!this.f104854e) {
            boolean z = true;
            this.f104854e = true;
            this.f104858i = bVar;
            this.f104856g = new WeakReference<>(context);
            String packageName = context.getPackageName();
            IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
            if (baseUserService_Monster != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(baseUserService_Monster.getCurrentUserID());
                sb.append(packageName);
                packageName = sb.toString();
            }
            this.f104853d = String.valueOf(packageName.hashCode());
            this.f104852c = new C41376b(context, str);
            C41376b bVar2 = this.f104852c;
            bVar2.mo83991b();
            bVar2.f104902a = true;
            this.f104860k = 3;
            C41376b bVar3 = this.f104852c;
            C413542 r8 = new C41387e() {
                /* renamed from: a */
                public final void mo83933a(C41389c cVar) {
                    if (cVar.mo84001b()) {
                        C41352c.this.f104860k = 2;
                    } else if (C41352c.this.f104852c != null) {
                        C41352c.this.f104860k = 1;
                    }
                }
            };
            bVar3.mo83991b();
            if (!bVar3.f104904c) {
                bVar3.f104913l = new ServiceConnection(r8) {

                    /* renamed from: a */
                    final /* synthetic */ C41387e f104919a;

                    public final void onServiceDisconnected(ComponentName componentName) {
                        C41376b.this.f104912k = null;
                    }

                    {
                        this.f104919a = r2;
                    }

                    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        if (!C41376b.this.f104905d) {
                            C41376b.this.f104912k = Stub.asInterface(iBinder);
                            String packageName = C41376b.this.f104911j.getPackageName();
                            try {
                                int isBillingSupported = C41376b.this.f104912k.isBillingSupported(3, packageName, "inapp");
                                if (isBillingSupported != 0) {
                                    C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6002, new C26898j().mo54849a("msg", "iabhelper_error_billing_not_supported").mo54850a());
                                    if (this.f104919a != null) {
                                        this.f104919a.mo83933a(new C41389c(isBillingSupported, "Error checking for billing v3 support."));
                                    }
                                    C41376b.this.f104907f = false;
                                    C41376b.this.f104908g = false;
                                    return;
                                }
                                new StringBuilder("In-app billing version 3 supported for ").append(packageName);
                                if (C41376b.this.f104912k.isBillingSupported(5, packageName, "subs") == 0) {
                                    C41376b.this.f104908g = true;
                                } else {
                                    C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6003, new C26898j().mo54849a("msg", "iabhelper_error_billing_not_supported_subs").mo54850a());
                                    C41376b.this.f104908g = false;
                                }
                                if (C41376b.this.f104908g) {
                                    C41376b.this.f104907f = true;
                                } else {
                                    int isBillingSupported2 = C41376b.this.f104912k.isBillingSupported(3, packageName, "subs");
                                    if (isBillingSupported2 == 0) {
                                        C41376b.this.f104907f = true;
                                    } else {
                                        new StringBuilder("Subscriptions NOT AVAILABLE. Response: ").append(isBillingSupported2);
                                        C41376b.this.f104907f = false;
                                        C41376b.this.f104908g = false;
                                    }
                                }
                                C41376b.this.f104904c = true;
                                if (this.f104919a != null) {
                                    this.f104919a.mo83933a(new C41389c(0, "Setup successful."));
                                }
                            } catch (RemoteException e) {
                                StringBuilder sb = new StringBuilder("iabhelper_remote_exception:");
                                sb.append(e.getMessage());
                                C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6004, new C26898j().mo54849a("msg", sb.toString()).mo54850a());
                                if (this.f104919a != null) {
                                    this.f104919a.mo83933a(new C41389c(-6004, "RemoteException while setting up in-app billing."));
                                }
                            }
                        }
                    }
                };
                Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
                intent.setPackage("com.android.vending");
                List queryIntentServices = bVar3.f104911j.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                    C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6000, new C26898j().mo54849a("msg", "query_google_service_error").mo54850a());
                    r8.mo83933a(new C41389c(3, "Billing service unavailable on device."));
                    return;
                }
                Context context2 = bVar3.f104911j;
                ServiceConnection serviceConnection = bVar3.f104913l;
                if (context2 == null || !(context2 instanceof Context) || !C40895d.m90464a(context2, intent)) {
                    z = context2.bindService(intent, serviceConnection, 1);
                }
                if (!z) {
                    C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", -6001, new C26898j().mo54849a("msg", "bind_google_service_error").mo54850a());
                    r8.mo83933a(new C41389c(3, "Billing service unavailable on device."));
                }
                return;
            }
            throw new IllegalStateException("IAB helper is already set up.");
        }
    }
}
