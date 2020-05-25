package com.p683ss.android.ugc.aweme.sdk.iap;

import android.os.Message;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.sdk.iap.api.C41350a;
import com.p683ss.android.ugc.aweme.sdk.iap.model.request.IapPayBody;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.PayOrderResultResponse;
import com.p683ss.android.ugc.aweme.sdk.iap.model.response.PayOrderResultStruct;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.C41383a;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41376b.C41384b;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.C41389c;
import com.p683ss.android.ugc.aweme.sdk.iap.utils.Purchase;
import com.p683ss.android.ugc.aweme.sdk.p2119b.C41334b;
import com.p683ss.android.ugc.aweme.sdk.p2119b.C41335c;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sdk.iap.d */
public final class C41358d implements C9382a {

    /* renamed from: a */
    public Purchase f104871a;

    /* renamed from: b */
    public C41351b f104872b;

    /* renamed from: c */
    public C41376b f104873c;

    /* renamed from: b */
    private void m91143b(final boolean z) {
        try {
            if (this.f104873c != null) {
                this.f104873c.mo83987a(this.f104871a, (C41384b) new C41384b() {
                    /* renamed from: a */
                    public final void mo83940a(Purchase purchase, C41389c cVar) {
                        if (C41358d.this.f104873c == null) {
                            C41358d.this.mo83938a(z, new Exception("mHelper is null"));
                        } else if (cVar.mo84000a()) {
                            C41358d.this.f104871a.setPendingCount(0);
                            C41358d.this.f104871a.setRetryCount(0);
                            if (!z) {
                                C41358d.this.f104872b.mo83903a(2, (Object) C41358d.this.f104871a);
                            } else {
                                C41358d.this.f104872b.mo83903a(3, (Object) C41358d.this.f104871a);
                            }
                            StringBuilder sb = new StringBuilder("isRetry:");
                            sb.append(z);
                            C41335c.m91106a().mo83906a("aweme_wallet_purchase_status", 0, new C26898j().mo54849a("msg", sb.toString()).mo54850a());
                        } else {
                            C41358d.this.mo83938a(z, new Exception(C2240a.m6772a("consumeAsync Error while consuming: %s, isRetry=%s, orderId=%s, product=%s", new Object[]{cVar, Boolean.valueOf(z), C41358d.this.f104871a.getInnerOrderId(), C41358d.this.f104871a.getSku()})));
                        }
                    }
                });
            }
        } catch (C41383a e) {
            mo83938a(z, (Exception) e);
        }
    }

    /* renamed from: c */
    private void m91144c(final boolean z) {
        int i;
        C23566n a = C23566n.m57766a();
        C9381g weakHandler = this.f104871a.getWeakHandler();
        C413613 r2 = new Callable() {
            public final Object call() throws Exception {
                return C41350a.m91126a(C41358d.this.f104871a.getInnerOrderId());
            }
        };
        if (z) {
            i = 97;
        } else {
            i = 96;
        }
        a.mo48750a(weakHandler, r2, i);
    }

    /* renamed from: d */
    private void m91145d(final boolean z) {
        this.f104871a.getWeakHandler().postDelayed(new Runnable() {
            public final void run() {
                int i;
                C23566n a = C23566n.m57766a();
                C9381g weakHandler = C41358d.this.f104871a.getWeakHandler();
                C413631 r2 = new Callable() {
                    public final Object call() throws Exception {
                        return C41350a.m91126a(C41358d.this.f104871a.getInnerOrderId());
                    }
                };
                if (z) {
                    i = 97;
                } else {
                    i = 96;
                }
                a.mo48750a(weakHandler, r2, i);
            }
        }, (long) (Math.pow(2.0d, (double) this.f104871a.getPendingCount()) * 500.0d));
        this.f104871a.setPendingCount(this.f104871a.getPendingCount() + 1);
    }

    /* renamed from: a */
    public final void mo83937a(final boolean z) {
        if (this.f104873c.f104909h) {
            this.f104871a.getWeakHandler().postDelayed(new Runnable() {
                public final void run() {
                    C41358d.this.mo83937a(z);
                }
            }, 500);
        } else {
            m91143b(z);
        }
    }

    public final void handleMsg(Message message) {
        if (this.f104871a.getWeakHandler() != null) {
            switch (message.what) {
                case 49:
                    m91146e(false);
                    return;
                case 50:
                    m91146e(true);
                    return;
                case UnReadVideoExperiment.RELATION_LIST /*64*/:
                    m91141a(message, false);
                    return;
                case 65:
                    m91141a(message, true);
                    return;
                case 96:
                    m91142b(message, false);
                    return;
                case 97:
                    m91142b(message, true);
                    break;
            }
        }
    }

    /* renamed from: e */
    private void m91146e(boolean z) {
        long j;
        if (TextUtils.isEmpty(this.f104871a.getInnerOrderId())) {
            mo83938a(z, new Exception("innerOrderId is empty"));
            return;
        }
        final IapPayBody iapPayBody = new IapPayBody();
        iapPayBody.packageName = this.f104871a.getPackageName();
        iapPayBody.productId = this.f104871a.getSku();
        iapPayBody.purchaseToken = this.f104871a.getPurchaseToken();
        if (!z) {
            C23566n.m57766a().mo48750a(this.f104871a.getWeakHandler(), new Callable() {
                public final Object call() throws Exception {
                    return C41350a.m91124a(C41358d.this.f104871a.getInnerOrderId(), iapPayBody);
                }
            }, 64);
            return;
        }
        if (this.f104871a.getRetryCount() == 0) {
            j = 0;
        } else {
            j = (long) (Math.pow(2.0d, (double) this.f104871a.getRetryCount()) * 500.0d);
        }
        this.f104871a.getWeakHandler().postDelayed(new Runnable() {
            public final void run() {
                C23566n.m57766a().mo48750a(C41358d.this.f104871a.getWeakHandler(), new Callable() {
                    public final Object call() throws Exception {
                        return C41350a.m91124a(C41358d.this.f104871a.getInnerOrderId(), iapPayBody);
                    }
                }, 65);
            }
        }, j);
        this.f104871a.setRetryCount(this.f104871a.getRetryCount() + 1);
    }

    /* renamed from: a */
    private void m91141a(Message message, boolean z) {
        if (message.obj instanceof Exception) {
            mo83938a(z, (Exception) message.obj);
            m91146e(true);
            return;
        }
        m91144c(z);
    }

    /* renamed from: b */
    private void m91142b(Message message, boolean z) {
        if (message.obj instanceof Exception) {
            mo83938a(z, (Exception) message.obj);
            m91145d(true);
            return;
        }
        PayOrderResultStruct payOrderResultStruct = ((PayOrderResultResponse) message.obj).data;
        if (payOrderResultStruct != null) {
            if (payOrderResultStruct.result == 0) {
                m91145d(z);
            } else if (payOrderResultStruct.result == 1) {
                mo83937a(z);
            } else {
                mo83938a(z, new Exception("all is fail"));
            }
        }
    }

    /* renamed from: a */
    public final void mo83938a(boolean z, Exception exc) {
        String str;
        if (!z) {
            this.f104872b.mo83902a(2, exc);
            C41334b a = C41335c.m91106a();
            String str2 = "aweme_wallet_purchase_status";
            C26898j jVar = new C26898j();
            String str3 = "msg";
            StringBuilder sb = new StringBuilder("buy_coins IapVerifyHandler  failed, purchase originalJson: ");
            sb.append(this.f104871a.getOriginalJson());
            sb.append("innerOrderId");
            sb.append(this.f104871a.getInnerOrderId());
            if (exc == null) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder("  exception:");
                sb2.append(exc.getClass().getSimpleName());
                sb2.append("  errMsg:");
                sb2.append(exc.getMessage());
                str = sb2.toString();
            }
            sb.append(str);
            a.mo83906a(str2, -6007, jVar.mo54849a(str3, sb.toString()).mo54850a());
        }
    }

    C41358d(Purchase purchase, C41351b bVar, C41376b bVar2) {
        this.f104871a = purchase;
        this.f104872b = bVar;
        this.f104873c = bVar2;
    }
}
