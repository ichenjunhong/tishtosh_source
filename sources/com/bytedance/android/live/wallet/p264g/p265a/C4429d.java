package com.bytedance.android.live.wallet.p264g.p265a;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.p030v4.p038f.C0777a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4172a;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.p182a.C2945a;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.live.wallet.C4285a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.LiveBillingActivityProxy;
import com.bytedance.android.live.wallet.LiveBillingActivityProxy.C4284a;
import com.bytedance.android.live.wallet.api.C4303i;
import com.bytedance.android.live.wallet.api.C4303i.C4304a;
import com.bytedance.android.live.wallet.api.C4303i.C4307d;
import com.bytedance.android.live.wallet.api.C4303i.C4308e;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C4467f;
import com.bytedance.android.live.wallet.model.C4468g;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.p262e.C4406a;
import com.bytedance.android.live.wallet.p263f.C4423a;
import com.bytedance.android.live.wallet.p263f.C4423a.C4424a;
import com.bytedance.android.live.wallet.p264g.p266b.C4452c;
import com.bytedance.android.livesdk.p282ag.p283a.C4627a;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdkapi.depend.model.C8675a;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal.HsSkuDetail;
import com.bytedance.android.livesdkapi.depend.model.p444c.C8690a;
import com.bytedance.android.livesdkapi.host.C8807k;
import com.p683ss.android.common.p1146d.C18898c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.android.live.wallet.g.a.d */
public final class C4429d extends C4426b<C4452c> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f12079a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C4429d.class), "api", "getApi()Lcom/bytedance/android/live/wallet/api/WalletApi;"))};

    /* renamed from: h */
    public static final C4430a f12080h = new C4430a(null);

    /* renamed from: b */
    public C4427c f12081b;

    /* renamed from: c */
    public C1690c f12082c;

    /* renamed from: d */
    public String f12083d;

    /* renamed from: e */
    public C1690c f12084e;

    /* renamed from: f */
    public Handler f12085f;

    /* renamed from: g */
    public final Activity f12086g;

    /* renamed from: i */
    private final C52668f f12087i;

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$a */
    public static final class C4430a {
        private C4430a() {
        }

        public /* synthetic */ C4430a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$b */
    static final class C4431b extends C52712l implements C52670a<WalletApi> {

        /* renamed from: a */
        public static final C4431b f12088a = new C4431b();

        C4431b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (WalletApi) C4157e.m10322a().mo9550a(WalletApi.class);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$c */
    static final class C4432c implements C4307d {

        /* renamed from: a */
        final /* synthetic */ C4429d f12089a;

        C4432c(C4429d dVar) {
            this.f12089a = dVar;
        }

        /* renamed from: a */
        public final void mo10088a(boolean z) {
            if (!z) {
                C4452c cVar = (C4452c) this.f12089a.mo8518c();
                if (cVar != null) {
                    cVar.mo10131c();
                }
                this.f12089a.f12085f.removeMessages(111);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$d */
    static final class C4433d<T> implements C1710e<C4177d<C8690a>> {

        /* renamed from: a */
        final /* synthetic */ C4429d f12090a;

        /* renamed from: b */
        final /* synthetic */ long f12091b;

        /* renamed from: c */
        final /* synthetic */ C8807k f12092c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f12093d;

        C4433d(C4429d dVar, long j, C8807k kVar, ChargeDeal chargeDeal) {
            this.f12090a = dVar;
            this.f12091b = j;
            this.f12092c = kVar;
            this.f12093d = chargeDeal;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            C4429d.m10754a(this.f12091b, 0, this.f12092c, this.f12093d.f23687a, (Throwable) null);
            Object obj2 = dVar.data;
            C52711k.m112236a(obj2, "orderInfoResponse.data");
            final String str = ((C8690a) obj2).f23768a;
            LiveBillingActivityProxy.m10549a(new C4284a(this) {

                /* renamed from: a */
                final /* synthetic */ C4433d f12094a;

                {
                    this.f12094a = r1;
                }

                /* renamed from: a */
                public final void mo10030a(int i, int i2, String str) {
                    int i3;
                    String str2;
                    String str3;
                    Integer num;
                    int i4 = i2;
                    Integer num2 = null;
                    LiveBillingActivityProxy.m10549a(null);
                    if (i == C4308e.f11793a) {
                        String str4 = str;
                        C52711k.m112236a((Object) str4, "orderId");
                        long j = this.f12094a.f12093d.f23687a;
                        if (str == null) {
                            str3 = "";
                        } else {
                            str3 = str;
                        }
                        C4429d.m10752a(0, str4, j, i2, str3);
                        C4452c cVar = (C4452c) this.f12094a.f12090a.mo8518c();
                        if (cVar != null) {
                            cVar.mo10122a(0);
                        }
                        C4429d dVar = this.f12094a.f12090a;
                        String str5 = str;
                        C52711k.m112236a((Object) str5, "orderId");
                        ChargeDeal chargeDeal = this.f12094a.f12093d;
                        if (chargeDeal != null) {
                            num = Integer.valueOf(chargeDeal.f23691e);
                        } else {
                            num = null;
                        }
                        int intValue = num.intValue();
                        ChargeDeal chargeDeal2 = this.f12094a.f12093d;
                        if (chargeDeal2 != null) {
                            num2 = Integer.valueOf(chargeDeal2.f23692f);
                        }
                        dVar.mo10227a(0, str5, intValue + num2.intValue());
                        return;
                    }
                    if (i4 == C4308e.f11795c) {
                        i3 = 2;
                    } else {
                        i3 = 1;
                    }
                    if (i4 == C4308e.f11795c) {
                        C18898c.m46010a(C3922z.m9915e(), "recharge_pay_result", "cancel", -1, 1);
                        StringBuilder sb = new StringBuilder("response code: ");
                        sb.append(1);
                        C4423a.m10742a(C4424a.GOOGLE_PAY, "1", (String) null, C4423a.m10737a(1, this.f12094a.f12093d.f23687a, this.f12094a.f12093d.f23693g, str, "", 0, sb.toString()));
                        C4452c cVar2 = (C4452c) this.f12094a.f12090a.mo8518c();
                        if (cVar2 != null) {
                            cVar2.mo10132d();
                        }
                    } else {
                        C18898c.m46010a(C3922z.m9915e(), "recharge_pay_result", "fail_google_pay_fail", -1, (long) i4);
                        StringBuilder sb2 = new StringBuilder("response code: ");
                        sb2.append(i4);
                        C4423a.m10742a(C4424a.GOOGLE_PAY, String.valueOf(i2), (String) null, C4423a.m10737a(2, this.f12094a.f12093d.f23687a, this.f12094a.f12093d.f23693g, str, "", 0, sb2.toString()));
                        C4452c cVar3 = (C4452c) this.f12094a.f12090a.mo8518c();
                        if (cVar3 != null) {
                            cVar3.mo10128a((Exception) null, (int) R.string.e_t);
                        }
                    }
                    String str6 = str;
                    C52711k.m112236a((Object) str6, "orderId");
                    long j2 = this.f12094a.f12093d.f23687a;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    C4429d.m10752a(i3, str6, j2, i2, str2);
                }
            });
            Object obj3 = dVar.data;
            C52711k.m112236a(obj3, "orderInfoResponse.data");
            JSONObject jSONObject = new JSONObject(((C8690a) obj3).f23769b);
            Bundle bundle = new Bundle();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                bundle.putString(str2, jSONObject.optString(str2));
            }
            ((IWalletService) C4116c.m10249a(IWalletService.class)).openBillingProxyActivity(this.f12090a.f12086g, bundle);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$e */
    static final class C4435e<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C4429d f12096a;

        /* renamed from: b */
        final /* synthetic */ long f12097b;

        /* renamed from: c */
        final /* synthetic */ C8807k f12098c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f12099d;

        C4435e(C4429d dVar, long j, C8807k kVar, ChargeDeal chargeDeal) {
            this.f12096a = dVar;
            this.f12097b = j;
            this.f12098c = kVar;
            this.f12099d = chargeDeal;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4429d.m10754a(this.f12097b, 1, this.f12098c, this.f12099d.f23687a, th);
            C4452c cVar = (C4452c) this.f12096a.mo8518c();
            if (cVar != null) {
                cVar.mo10131c();
            }
            C18898c.m46010a(C3922z.m9915e(), "recharge_pay_result", "fail_google_create_order_fail", -1, -1);
            if (!(th instanceof Exception)) {
                th = null;
            }
            Exception exc = (Exception) th;
            if (exc == null) {
                exc = new Exception();
            }
            C4423a.m10740a(C4424a.CREATE_ORDER, exc);
            C4423a.m10744a(C8807k.GOOGLE, exc);
            C4452c cVar2 = (C4452c) this.f12096a.mo8518c();
            if (cVar2 != null) {
                cVar2.mo10128a(exc, 0);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$f */
    static final class C4436f<T> implements C1710e<C4177d<C8685b>> {

        /* renamed from: a */
        final /* synthetic */ C4429d f12100a;

        /* renamed from: b */
        final /* synthetic */ long f12101b;

        /* renamed from: c */
        final /* synthetic */ C8807k f12102c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f12103d;

        C4436f(C4429d dVar, long j, C8807k kVar, ChargeDeal chargeDeal) {
            this.f12100a = dVar;
            this.f12101b = j;
            this.f12102c = kVar;
            this.f12103d = chargeDeal;
        }

        public final /* synthetic */ void accept(Object obj) {
            C8685b bVar;
            CharSequence charSequence;
            boolean z;
            CharSequence charSequence2;
            C4177d dVar = (C4177d) obj;
            C4429d.m10754a(this.f12101b, 0, this.f12102c, this.f12103d.f23687a, (Throwable) null);
            C4452c cVar = (C4452c) this.f12100a.mo8518c();
            if (cVar != null) {
                cVar.mo10131c();
            }
            if (dVar != null) {
                bVar = (C8685b) dVar.data;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                C8685b bVar2 = (C8685b) dVar.data;
                if (bVar2 != null) {
                    charSequence = bVar2.f23718a;
                } else {
                    charSequence = null;
                }
                CharSequence charSequence3 = charSequence;
                boolean z2 = true;
                if (charSequence3 == null || C52830p.m112402a(charSequence3)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C8685b bVar3 = (C8685b) dVar.data;
                    if (bVar3 != null) {
                        charSequence2 = bVar3.f23719b;
                    } else {
                        charSequence2 = null;
                    }
                    CharSequence charSequence4 = charSequence2;
                    if (charSequence4 != null && !C52830p.m112402a(charSequence4)) {
                        z2 = false;
                    }
                    if (!z2) {
                        C4423a.m10745a(this.f12102c, (JSONObject) null);
                        C8685b bVar4 = (C8685b) dVar.data;
                        if (bVar4 != null) {
                            bVar4.f23720c = this.f12102c;
                        }
                        C4452c cVar2 = (C4452c) this.f12100a.mo8518c();
                        if (cVar2 != null) {
                            cVar2.mo10126a((C8685b) dVar.data);
                            return;
                        }
                    }
                }
            }
            C4423a.m10743a(this.f12102c, 0, "invalid order", (JSONObject) null);
            C4452c cVar3 = (C4452c) this.f12100a.mo8518c();
            if (cVar3 != null) {
                cVar3.mo10127a(new Exception(C3922z.m9903a((int) R.string.e_s)));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$g */
    static final class C4437g<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C4429d f12104a;

        /* renamed from: b */
        final /* synthetic */ long f12105b;

        /* renamed from: c */
        final /* synthetic */ C8807k f12106c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f12107d;

        /* renamed from: e */
        final /* synthetic */ C52727e f12108e;

        C4437g(C4429d dVar, long j, C8807k kVar, ChargeDeal chargeDeal, C52727e eVar) {
            this.f12104a = dVar;
            this.f12105b = j;
            this.f12106c = kVar;
            this.f12107d = chargeDeal;
            this.f12108e = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            int i;
            String str;
            C8807k kVar;
            Throwable th = (Throwable) obj;
            C4429d.m10754a(this.f12105b, 1, this.f12106c, this.f12107d.f23687a, th);
            if (th != null) {
                C3831a.m9709a((String) this.f12108e.element, th);
            }
            if (th instanceof C2949a) {
                kVar = this.f12106c;
                C2949a aVar = (C2949a) th;
                i = aVar.getErrorCode();
                str = aVar.getErrorMsg();
            } else {
                kVar = this.f12106c;
                i = 0;
                if (th != null) {
                    str = th.toString();
                } else {
                    str = null;
                }
            }
            C4423a.m10743a(kVar, i, str, (JSONObject) null);
            C4452c cVar = (C4452c) this.f12104a.mo8518c();
            if (cVar != null) {
                cVar.mo10131c();
            }
            C4452c cVar2 = (C4452c) this.f12104a.mo8518c();
            if (cVar2 != null) {
                if (!(th instanceof Exception)) {
                    th = null;
                }
                Exception exc = (Exception) th;
                if (exc == null) {
                    exc = new Exception();
                }
                cVar2.mo10127a(exc);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$h */
    static final class C4438h<T> implements C1710e<C4177d<Object>> {

        /* renamed from: a */
        final /* synthetic */ C4429d f12109a;

        /* renamed from: b */
        final /* synthetic */ long f12110b;

        /* renamed from: c */
        final /* synthetic */ C8807k f12111c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f12112d;

        C4438h(C4429d dVar, long j, C8807k kVar, ChargeDeal chargeDeal) {
            this.f12109a = dVar;
            this.f12110b = j;
            this.f12111c = kVar;
            this.f12112d = chargeDeal;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            C4429d.m10754a(this.f12110b, 0, this.f12111c, this.f12112d.f23687a, (Throwable) null);
            C4452c cVar = (C4452c) this.f12109a.mo8518c();
            if (cVar != null) {
                cVar.mo10131c();
            }
            C4452c cVar2 = (C4452c) this.f12109a.mo8518c();
            if (cVar2 != null) {
                cVar2.mo10123a(this.f12112d.f23691e, (CheckOrderOriginalResult) null);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$i */
    static final class C4439i<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C4429d f12113a;

        /* renamed from: b */
        final /* synthetic */ long f12114b;

        /* renamed from: c */
        final /* synthetic */ C8807k f12115c;

        /* renamed from: d */
        final /* synthetic */ ChargeDeal f12116d;

        C4439i(C4429d dVar, long j, C8807k kVar, ChargeDeal chargeDeal) {
            this.f12113a = dVar;
            this.f12114b = j;
            this.f12115c = kVar;
            this.f12116d = chargeDeal;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C4429d.m10754a(this.f12114b, 1, this.f12115c, this.f12116d.f23687a, th);
            C4452c cVar = (C4452c) this.f12113a.mo8518c();
            if (cVar != null) {
                cVar.mo10131c();
            }
            C4452c cVar2 = (C4452c) this.f12113a.mo8518c();
            if (cVar2 != null) {
                if (!(th instanceof Exception)) {
                    th = null;
                }
                Exception exc = (Exception) th;
                if (exc == null) {
                    exc = new Exception();
                }
                cVar2.mo10128a(exc, 0);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$j */
    static final class C4440j<T> implements C1710e<C4172a<C4467f, C4468g>> {

        /* renamed from: a */
        public static final C4440j f12117a = new C4440j();

        C4440j() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Object obj2;
            List<T> list = ((C4172a) obj).f11365b;
            C52711k.m112236a((Object) list, "res.data");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                C4467f fVar = (C4467f) obj2;
                C52711k.m112236a((Object) fVar, "rechargeBean");
                if (C52711k.m112239a((Object) fVar.f12197a, (Object) "GooglePay")) {
                    break;
                }
            }
            if (((C4467f) obj2) == null) {
                new C2945a(-18, new RuntimeException("no google deals"));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$k */
    static final class C4441k<T> implements C1710e<C4172a<C4467f, C4468g>> {

        /* renamed from: a */
        final /* synthetic */ C4429d f12118a;

        /* renamed from: b */
        final /* synthetic */ long f12119b;

        /* renamed from: com.bytedance.android.live.wallet.g.a.d$k$a */
        public static final class C4442a implements C4304a {

            /* renamed from: a */
            final /* synthetic */ C8675a f12120a;

            /* renamed from: b */
            final /* synthetic */ long f12121b;

            /* renamed from: c */
            final /* synthetic */ C4441k f12122c;

            /* renamed from: d */
            final /* synthetic */ C4172a f12123d;

            /* renamed from: a */
            public final void mo10085a() {
                C4429d.m10753a(this.f12121b, 1, -10, "onFailed");
                List a = this.f12122c.f12118a.mo10226a(this.f12123d, (C8675a) null);
                C4452c cVar = (C4452c) this.f12122c.f12118a.mo8518c();
                if (cVar != null) {
                    cVar.mo10156f();
                }
                C4452c cVar2 = (C4452c) this.f12122c.f12118a.mo8518c();
                if (cVar2 != null) {
                    String str = this.f12122c.f12118a.f12083d;
                    if (str == null) {
                        str = "";
                    }
                    cVar2.mo10152a(str, a);
                }
            }

            /* renamed from: a */
            public final void mo10086a(Bundle bundle) {
                Integer num;
                int i;
                if (bundle != null) {
                    num = Integer.valueOf(bundle.getInt("RESPONSE_CODE"));
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 0) {
                    C8675a a = C4429d.m10750a(this.f12120a, bundle);
                    C4429d.m10753a(this.f12121b, 0, num.intValue(), null);
                    List a2 = this.f12122c.f12118a.mo10226a(this.f12123d, a);
                    C4452c cVar = (C4452c) this.f12122c.f12118a.mo8518c();
                    if (cVar != null) {
                        cVar.mo10156f();
                    }
                    C4452c cVar2 = (C4452c) this.f12122c.f12118a.mo8518c();
                    if (cVar2 != null) {
                        String str = this.f12122c.f12118a.f12083d;
                        if (str == null) {
                            str = "";
                        }
                        cVar2.mo10152a(str, a2);
                    }
                    return;
                }
                C4429d dVar = this.f12122c.f12118a;
                long j = this.f12121b;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = -10;
                }
                C4429d.m10753a(j, 1, i, null);
                List a3 = this.f12122c.f12118a.mo10226a(this.f12123d, (C8675a) null);
                C4452c cVar3 = (C4452c) this.f12122c.f12118a.mo8518c();
                if (cVar3 != null) {
                    cVar3.mo10156f();
                }
                C4452c cVar4 = (C4452c) this.f12122c.f12118a.mo8518c();
                if (cVar4 != null) {
                    String str2 = this.f12122c.f12118a.f12083d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    cVar4.mo10152a(str2, a3);
                }
            }

            C4442a(C8675a aVar, long j, C4441k kVar, C4172a aVar2) {
                this.f12120a = aVar;
                this.f12121b = j;
                this.f12122c = kVar;
                this.f12123d = aVar2;
            }
        }

        C4441k(C4429d dVar, long j) {
            this.f12118a = dVar;
            this.f12119b = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            C4172a aVar = (C4172a) obj;
            C52711k.m112240b(aVar, "allList");
            C4429d dVar = this.f12118a;
            Object obj2 = null;
            C4429d.m10755a(this.f12119b, 0, (Throwable) null);
            List<T> list = aVar.f11365b;
            C52711k.m112236a((Object) list, "allList.data");
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C4467f fVar = (C4467f) next;
                C52711k.m112236a((Object) fVar, "rechargeBean");
                if (C52711k.m112239a((Object) fVar.f12197a, (Object) "GooglePay")) {
                    obj2 = next;
                    break;
                }
            }
            C4467f fVar2 = (C4467f) obj2;
            if (fVar2 != null) {
                C8675a aVar2 = new C8675a();
                aVar2.f23711a = fVar2.f12206j;
                C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
                List<ChargeDeal> list2 = aVar2.f23711a;
                C52711k.m112236a((Object) list2, "this.chargeDeals");
                Iterable<ChargeDeal> iterable = list2;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (ChargeDeal chargeDeal : iterable) {
                    C52711k.m112236a((Object) chargeDeal, "it");
                    arrayList.add(chargeDeal.f23693g);
                }
                List e = C52575l.m112138e((Iterable) (List) arrayList);
                long uptimeMillis = SystemClock.uptimeMillis();
                if (iVar != null) {
                    C4442a aVar3 = new C4442a(aVar2, uptimeMillis, this, aVar);
                    iVar.mo10079a(this.f12118a.f12086g, e, "inapp", aVar3);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$l */
    static final class C4443l<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C4429d f12124a;

        /* renamed from: b */
        final /* synthetic */ long f12125b;

        C4443l(C4429d dVar, long j) {
            this.f12124a = dVar;
            this.f12125b = j;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x003b, code lost:
            if (r2 == null) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                boolean r0 = r4 instanceof com.bytedance.android.live.p180b.p181a.C2944a
                if (r0 == 0) goto L_0x0023
                com.bytedance.android.livesdk.o.h r0 = new com.bytedance.android.livesdk.o.h
                r0.<init>()
                java.lang.String r1 = "errorCode"
                r2 = r4
                com.bytedance.android.live.b.a.a r2 = (com.bytedance.android.live.p180b.p181a.C2944a) r2
                int r2 = r2.getErrorCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                com.bytedance.android.livesdk.o.h r0 = r0.mo14225a(r1, r2)
                java.lang.String r1 = "errorDesc"
                java.lang.String r2 = r4.getMessage()
                goto L_0x003f
            L_0x0023:
                com.bytedance.android.livesdk.o.h r0 = new com.bytedance.android.livesdk.o.h
                r0.<init>()
                java.lang.String r1 = "errorCode"
                r2 = -1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                com.bytedance.android.livesdk.o.h r0 = r0.mo14225a(r1, r2)
                java.lang.String r1 = "errorDesc"
                if (r4 == 0) goto L_0x003d
                java.lang.String r2 = r4.getMessage()
                if (r2 != 0) goto L_0x003f
            L_0x003d:
                java.lang.String r2 = ""
            L_0x003f:
                com.bytedance.android.livesdk.o.h r0 = r0.mo14225a(r1, r2)
                java.lang.String r1 = "hotsoon_iap_productslist_failure_rate"
                r2 = 1
                r0.mo14228a(r1, r2)
                long r0 = r3.f12125b
                com.bytedance.android.live.wallet.p264g.p265a.C4429d.m10755a(r0, r2, r4)
                com.bytedance.android.live.wallet.g.a.d r0 = r3.f12124a
                com.bytedance.ies.a.a r0 = r0.mo8518c()
                com.bytedance.android.live.wallet.g.b.c r0 = (com.bytedance.android.live.wallet.p264g.p266b.C4452c) r0
                if (r0 == 0) goto L_0x005b
                r0.mo10156f()
            L_0x005b:
                boolean r0 = r4 instanceof java.lang.Exception
                if (r0 == 0) goto L_0x0070
                com.bytedance.android.live.wallet.g.a.d r0 = r3.f12124a
                com.bytedance.ies.a.a r0 = r0.mo8518c()
                com.bytedance.android.live.wallet.g.b.c r0 = (com.bytedance.android.live.wallet.p264g.p266b.C4452c) r0
                if (r0 == 0) goto L_0x0070
                java.lang.Exception r4 = (java.lang.Exception) r4
                r1 = 0
                r0.mo10154b(r4, r1)
                return
            L_0x0070:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p264g.p265a.C4429d.C4443l.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$m */
    public static final class C4444m extends Handler {

        /* renamed from: a */
        final /* synthetic */ C4429d f12126a;

        C4444m(C4429d dVar) {
            this.f12126a = dVar;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null && message.what == 111) {
                C4452c cVar = (C4452c) this.f12126a.mo8518c();
                if (cVar != null) {
                    cVar.mo10131c();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$n */
    static final class C4445n<T> implements C1710e<CheckOrderOriginalResult> {

        /* renamed from: a */
        final /* synthetic */ C4429d f12127a;

        /* renamed from: b */
        final /* synthetic */ C52682m f12128b;

        /* renamed from: c */
        final /* synthetic */ int f12129c;

        /* renamed from: d */
        final /* synthetic */ String f12130d;

        /* renamed from: e */
        final /* synthetic */ int f12131e;

        C4445n(C4429d dVar, C52682m mVar, int i, String str, int i2) {
            this.f12127a = dVar;
            this.f12128b = mVar;
            this.f12129c = i;
            this.f12130d = str;
            this.f12131e = i2;
        }

        public final /* synthetic */ void accept(Object obj) {
            CheckOrderOriginalResult checkOrderOriginalResult = (CheckOrderOriginalResult) obj;
            if (checkOrderOriginalResult.getData().f12140a != 1) {
                this.f12128b.invoke(new RuntimeException("query status was fail"), Integer.valueOf(checkOrderOriginalResult.getData().f12140a));
                return;
            }
            C4452c cVar = (C4452c) this.f12127a.mo8518c();
            if (cVar != null) {
                cVar.mo10131c();
            }
            C4452c cVar2 = (C4452c) this.f12127a.mo8518c();
            if (cVar2 != null) {
                cVar2.mo10123a(this.f12129c, (CheckOrderOriginalResult) null);
            }
            C18898c.m46010a(C3922z.m9915e(), "recharge_pay_result", "google_pay_success", -1, -1);
            C4429d.m10751a(0, this.f12130d, this.f12131e, 0, "");
            C4423a.m10738a();
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$o */
    static final class C4446o<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C52682m f12132a;

        C4446o(C52682m mVar) {
            this.f12132a = mVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th;
            Throwable th2 = (Throwable) obj;
            C52682m mVar = this.f12132a;
            if (!(th2 instanceof Exception)) {
                th = null;
            } else {
                th = th2;
            }
            Exception exc = (Exception) th;
            if (exc == null) {
                exc = new Exception(th2);
            }
            mVar.invoke(exc, Integer.valueOf(0));
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.g.a.d$p */
    static final class C4447p extends C52712l implements C52682m<Exception, Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C4429d f12133a;

        /* renamed from: b */
        final /* synthetic */ int f12134b;

        /* renamed from: c */
        final /* synthetic */ String f12135c;

        /* renamed from: d */
        final /* synthetic */ int f12136d;

        C4447p(C4429d dVar, int i, String str, int i2) {
            this.f12133a = dVar;
            this.f12134b = i;
            this.f12135c = str;
            this.f12136d = i2;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
            if (r4 == null) goto L_0x0063;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.Exception r8 = (java.lang.Exception) r8
                java.lang.Number r9 = (java.lang.Number) r9
                int r9 = r9.intValue()
                int r0 = r7.f12134b
                r1 = 5
                if (r0 >= r1) goto L_0x0023
                com.bytedance.android.live.wallet.g.a.d r8 = r7.f12133a
                android.os.Handler r8 = r8.f12085f
                com.bytedance.android.live.wallet.g.a.d$p$1 r9 = new com.bytedance.android.live.wallet.g.a.d$p$1
                r9.<init>(r7)
                java.lang.Runnable r9 = (java.lang.Runnable) r9
                r0 = 2000(0x7d0, double:9.88E-321)
                boolean r8 = r8.postDelayed(r9, r0)
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
                return r8
            L_0x0023:
                android.content.Context r0 = com.bytedance.android.live.core.p230g.C3922z.m9915e()
                java.lang.String r1 = "recharge_pay_result"
                java.lang.String r2 = "fail_google_check_fail"
                r3 = -1
                r5 = -1
                com.p683ss.android.common.p1146d.C18898c.m46010a(r0, r1, r2, r3, r5)
                r0 = 0
                if (r8 == 0) goto L_0x003b
                com.bytedance.android.live.wallet.f.a$a r9 = com.bytedance.android.live.wallet.p263f.C4423a.C4424a.CHECK_ORDER
                com.bytedance.android.live.wallet.p263f.C4423a.m10740a(r9, r8)
                goto L_0x0044
            L_0x003b:
                com.bytedance.android.live.wallet.f.a$a r1 = com.bytedance.android.live.wallet.p263f.C4423a.C4424a.CHECK_ORDER
                java.lang.String r9 = java.lang.String.valueOf(r9)
                com.bytedance.android.live.wallet.p263f.C4423a.m10742a(r1, r9, r0, r0)
            L_0x0044:
                r9 = 1
                java.lang.String r1 = r7.f12135c
                int r2 = r7.f12134b
                boolean r3 = r8 instanceof com.bytedance.android.live.p180b.p181a.p183b.C2949a
                if (r3 != 0) goto L_0x004f
                r3 = r0
                goto L_0x0050
            L_0x004f:
                r3 = r8
            L_0x0050:
                com.bytedance.android.live.b.a.b.a r3 = (com.bytedance.android.live.p180b.p181a.p183b.C2949a) r3
                if (r3 == 0) goto L_0x0059
                int r3 = r3.getErrorCode()
                goto L_0x005b
            L_0x0059:
                r3 = -11
            L_0x005b:
                if (r8 == 0) goto L_0x0063
                java.lang.String r4 = r8.getMessage()
                if (r4 != 0) goto L_0x0065
            L_0x0063:
                java.lang.String r4 = "check order failed"
            L_0x0065:
                com.bytedance.android.live.wallet.p264g.p265a.C4429d.m10751a(r9, r1, r2, r3, r4)
                com.bytedance.android.live.wallet.g.a.d r9 = r7.f12133a
                com.bytedance.ies.a.a r9 = r9.mo8518c()
                com.bytedance.android.live.wallet.g.b.c r9 = (com.bytedance.android.live.wallet.p264g.p266b.C4452c) r9
                if (r9 == 0) goto L_0x0075
                r9.mo10131c()
            L_0x0075:
                com.bytedance.android.live.wallet.g.a.d r9 = r7.f12133a
                com.bytedance.ies.a.a r9 = r9.mo8518c()
                com.bytedance.android.live.wallet.g.b.c r9 = (com.bytedance.android.live.wallet.p264g.p266b.C4452c) r9
                if (r9 == 0) goto L_0x0088
                r0 = 2132550282(0x7f1c228a, float:2.075389E38)
                r9.mo10128a(r8, r0)
                d.x r8 = p2628d.C52860x.f131107a
                return r8
            L_0x0088:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p264g.p265a.C4429d.C4447p.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: d */
    private WalletApi m10758d() {
        return (WalletApi) this.f12087i.getValue();
    }

    /* renamed from: a */
    public final void mo8247a() {
        super.mo8247a();
        C4427c cVar = this.f12081b;
        if (cVar != null) {
            cVar.mo8247a();
        }
        C1690c cVar2 = this.f12082c;
        if (cVar2 != null && !cVar2.isDisposed()) {
            C1690c cVar3 = this.f12082c;
            if (cVar3 != null) {
                cVar3.dispose();
            }
        }
        this.f12085f.removeCallbacksAndMessages(null);
        C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
        if (iVar != null) {
            iVar.mo10084c();
        }
    }

    /* renamed from: a */
    public final void mo10228a(ChargeDeal chargeDeal, C8807k kVar, String str) {
        ChargeDeal chargeDeal2 = chargeDeal;
        C8807k kVar2 = kVar;
        C52711k.m112240b(chargeDeal2, "deal");
        C52711k.m112240b(kVar2, "channel");
        C52711k.m112240b(str, "email");
        if (kVar2 != C8807k.GOOGLE) {
            C4452c cVar = (C4452c) mo8518c();
            if (cVar != null) {
                cVar.mo10122a((int) R.string.e8w);
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        switch (C4449e.f12139b[kVar.ordinal()]) {
            case 1:
                C4452c cVar2 = (C4452c) mo8518c();
                if (cVar2 != null) {
                    cVar2.mo10122a((int) R.string.e8w);
                }
                this.f12085f.sendEmptyMessageDelayed(111, 5000);
                C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
                if (iVar != null) {
                    iVar.mo10081a((C4307d) new C4432c(this));
                }
                WalletApi walletApi = (WalletApi) C4157e.m10322a().mo9550a(WalletApi.class);
                long j = chargeDeal2.f23687a;
                String str2 = this.f12083d;
                if (str2 == null) {
                    str2 = "";
                }
                C2201v a = walletApi.createPreOrder(j, 2, 0, str2).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
                long j2 = uptimeMillis;
                C8807k kVar3 = kVar;
                ChargeDeal chargeDeal3 = chargeDeal;
                C4433d dVar = new C4433d(this, j2, kVar3, chargeDeal3);
                C1710e eVar = dVar;
                C4435e eVar2 = new C4435e(this, j2, kVar3, chargeDeal3);
                a.mo6505a(eVar, (C1710e<? super Throwable>) eVar2);
                return;
            case 2:
            case 3:
            case 4:
            case 5:
                C52727e eVar3 = new C52727e();
                eVar3.element = "";
                String str3 = "";
                switch (C4449e.f12138a[kVar.ordinal()]) {
                    case 1:
                        eVar3.element = "onecard";
                        str3 = "12";
                        break;
                    case 2:
                        eVar3.element = "mastercard";
                        str3 = "11";
                        break;
                    case 3:
                        eVar3.element = "visa";
                        str3 = "11";
                        break;
                    case 4:
                        eVar3.element = "paybymobile";
                        str3 = "14";
                        break;
                }
                C2201v a2 = m10758d().createOrder(chargeDeal2.f23687a, str3, str, this.f12083d, (String) eVar3.element).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
                long j3 = uptimeMillis;
                C8807k kVar4 = kVar;
                C52727e eVar4 = eVar3;
                ChargeDeal chargeDeal4 = chargeDeal;
                C4436f fVar = new C4436f(this, j3, kVar4, chargeDeal4);
                C1710e eVar5 = fVar;
                C4437g gVar = new C4437g(this, j3, kVar4, chargeDeal4, eVar4);
                a2.mo6505a(eVar5, (C1710e<? super Throwable>) gVar);
                return;
            case 6:
                C2201v a3 = m10758d().flameChangeDiamond(String.valueOf(chargeDeal2.f23687a), "9").mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
                long j4 = uptimeMillis;
                C8807k kVar5 = kVar;
                ChargeDeal chargeDeal5 = chargeDeal;
                C4438h hVar = new C4438h(this, j4, kVar5, chargeDeal5);
                C1710e eVar6 = hVar;
                C4439i iVar2 = new C4439i(this, j4, kVar5, chargeDeal5);
                a3.mo6505a(eVar6, (C1710e<? super Throwable>) iVar2);
                break;
        }
    }

    /* renamed from: a */
    public final void mo10227a(int i, String str, int i2) {
        C1690c cVar = this.f12084e;
        if (cVar != null && !cVar.isDisposed()) {
            C1690c cVar2 = this.f12084e;
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
        C52682m pVar = new C4447p(this, i, str, i2);
        C2201v a = new C4406a().mo10069a(str).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a());
        C4445n nVar = new C4445n(this, pVar, i2, str, i);
        this.f12084e = a.mo6505a((C1710e<? super T>) nVar, (C1710e<? super Throwable>) new C4446o<Object>(pVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0060, code lost:
        if (r10 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        if (r4 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0083 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bytedance.android.live.wallet.model.C4467f> mo10226a(com.bytedance.android.live.network.response.C4172a<com.bytedance.android.live.wallet.model.C4467f, com.bytedance.android.live.wallet.model.C4468g> r9, com.bytedance.android.livesdkapi.depend.model.C8675a r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r10 == 0) goto L_0x0013
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r2 = r10.f23711a
            if (r2 == 0) goto L_0x0013
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r1
            if (r2 != r1) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r2 == 0) goto L_0x0062
            java.util.List<T> r3 = r9.f11365b
            java.lang.String r4 = "allList.data"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0023:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0041
            java.lang.Object r4 = r3.next()
            r6 = r4
            com.bytedance.android.live.wallet.model.f r6 = (com.bytedance.android.live.wallet.model.C4467f) r6
            java.lang.String r7 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.String r6 = r6.f12197a
            java.lang.String r7 = "GooglePay"
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r7)
            if (r6 == 0) goto L_0x0023
            goto L_0x0042
        L_0x0041:
            r4 = r5
        L_0x0042:
            com.bytedance.android.live.wallet.model.f r4 = (com.bytedance.android.live.wallet.model.C4467f) r4
            if (r4 == 0) goto L_0x004c
            if (r10 == 0) goto L_0x004a
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r5 = r10.f23711a
        L_0x004a:
            r4.f12206j = r5
        L_0x004c:
            if (r10 == 0) goto L_0x0062
            java.util.List<com.bytedance.android.livesdkapi.depend.model.ChargeDeal> r10 = r10.f23711a
            if (r10 == 0) goto L_0x0062
            java.lang.Object r10 = r10.get(r0)
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r10 = (com.bytedance.android.livesdkapi.depend.model.ChargeDeal) r10
            if (r10 == 0) goto L_0x0062
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal$HsSkuDetail r10 = r10.f23697k
            if (r10 == 0) goto L_0x0062
            java.lang.String r10 = r10.f23706f
            if (r10 != 0) goto L_0x006d
        L_0x0062:
            R r10 = r9.f11366c
            java.lang.String r3 = "allList.extra"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r3)
            com.bytedance.android.live.wallet.model.g r10 = (com.bytedance.android.live.wallet.model.C4468g) r10
            java.lang.String r10 = r10.f12210a
        L_0x006d:
            r8.f12083d = r10
            java.util.List<T> r9 = r9.f11365b
            java.lang.String r10 = "allList.data"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Collection r10 = (java.util.Collection) r10
            java.util.Iterator r9 = r9.iterator()
        L_0x0083:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x00e5
            java.lang.Object r3 = r9.next()
            r4 = r3
            com.bytedance.android.live.wallet.model.f r4 = (com.bytedance.android.live.wallet.model.C4467f) r4
            java.lang.String r5 = "it"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r5 = r4.f12197a
            java.lang.String r6 = "Huoli"
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
            if (r5 == 0) goto L_0x00c4
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r4 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.p245d.C4116c.m10249a(r4)
            java.lang.String r5 = "ServiceManager.getServic…alletService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.bytedance.android.live.wallet.IWalletService r4 = (com.bytedance.android.live.wallet.IWalletService) r4
            java.util.Map r4 = r4.getHostWalletSetting()
            if (r4 == 0) goto L_0x00bc
            java.lang.String r5 = "show_exchange_score"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x00be
        L_0x00bc:
            java.lang.String r4 = "0"
        L_0x00be:
            java.lang.String r5 = "1"
            p2628d.p2639f.p2641b.C52711k.m112239a(r4, r5)
            goto L_0x00de
        L_0x00c4:
            java.lang.String r5 = r4.f12197a
            java.lang.String r6 = "GooglePay"
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
            if (r5 == 0) goto L_0x00d0
            r4 = r2
            goto L_0x00df
        L_0x00d0:
            java.util.List<java.lang.String> r4 = r4.f12203g
            if (r4 == 0) goto L_0x00de
            java.lang.String r5 = r8.f12083d
            boolean r4 = r4.contains(r5)
            if (r4 != r1) goto L_0x00de
            r4 = 1
            goto L_0x00df
        L_0x00de:
            r4 = 0
        L_0x00df:
            if (r4 == 0) goto L_0x0083
            r10.add(r3)
            goto L_0x0083
        L_0x00e5:
            java.util.List r10 = (java.util.List) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p264g.p265a.C4429d.mo10226a(com.bytedance.android.live.network.response.a, com.bytedance.android.livesdkapi.depend.model.a):java.util.List");
    }

    /* renamed from: b */
    public final void mo10229b() {
        C4452c cVar = (C4452c) mo8518c();
        if (cVar != null) {
            cVar.mo10155e();
        }
        C1690c cVar2 = this.f12082c;
        if (cVar2 != null && !cVar2.isDisposed()) {
            C1690c cVar3 = this.f12082c;
            if (cVar3 != null) {
                cVar3.dispose();
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f12082c = m10758d().vigoChargeDeals().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6540d((C1710e<? super T>) C4440j.f12117a).mo6505a((C1710e<? super T>) new C4441k<Object>(this, uptimeMillis), (C1710e<? super Throwable>) new C4443l<Object>(this, uptimeMillis));
    }

    public C4429d(Activity activity) {
        C52711k.m112240b(activity, "activity");
        this.f12086g = activity;
        C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
        C8333e user = ((C4282a) C4116c.m10249a(C4282a.class)).user();
        C52711k.m112236a((Object) user, "ServiceManager.getServic…rvice::class.java).user()");
        if (user.mo14532c()) {
            C8333e user2 = ((C4282a) C4116c.m10249a(C4282a.class)).user();
            C52711k.m112236a((Object) user2, "ServiceManager.getServic…rvice::class.java).user()");
            long b = user2.mo14529b();
            if (iVar != null) {
                iVar.mo10083b(this.f12086g, String.valueOf(b));
            }
        }
        this.f12085f = new C4444m(this);
        this.f12087i = C52732g.m112285a(C4431b.f12088a);
    }

    /* renamed from: a */
    public static C8675a m10750a(C8675a aVar, Bundle bundle) {
        Iterable iterable;
        HsSkuDetail hsSkuDetail;
        List<ChargeDeal> list = aVar.f23711a;
        C8675a aVar2 = new C8675a();
        List<HsSkuDetail> list2 = null;
        if (bundle != null) {
            iterable = bundle.getStringArrayList("DETAILS_LIST");
        } else {
            iterable = null;
        }
        if (iterable != null) {
            Iterable<String> iterable2 = iterable;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable2, 10));
            for (String jSONObject : iterable2) {
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObject);
                    hsSkuDetail = new HsSkuDetail(jSONObject2.optString("productId"), jSONObject2.optString("type"), jSONObject2.optString("price"), jSONObject2.optString("title"), jSONObject2.optString("description"), jSONObject2.optString("price_currency_code"));
                } catch (Exception unused) {
                    hsSkuDetail = null;
                }
                arrayList.add(hsSkuDetail);
            }
            List b = C52575l.m112128b((Iterable) (List) arrayList);
            if (b != null) {
                list2 = C52575l.m112138e((Iterable) b);
            }
        }
        C0777a aVar3 = new C0777a();
        if (list2 != null && !list2.isEmpty()) {
            for (HsSkuDetail hsSkuDetail2 : list2) {
                aVar3.put(hsSkuDetail2.f23701a, hsSkuDetail2);
            }
        }
        List<ChargeDeal> arrayList2 = new ArrayList<>();
        C52711k.m112236a((Object) list, "remoteList");
        Iterable<ChargeDeal> iterable3 = list;
        Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable3, 10));
        for (ChargeDeal chargeDeal : iterable3) {
            C52711k.m112236a((Object) chargeDeal, "chargeDeal");
            HsSkuDetail hsSkuDetail3 = (HsSkuDetail) aVar3.get(chargeDeal.f23693g);
            if (hsSkuDetail3 != null) {
                chargeDeal.f23697k = hsSkuDetail3;
                arrayList2.add(chargeDeal);
            }
            arrayList3.add(C52860x.f131107a);
        }
        aVar2.f23711a = arrayList2;
        return aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0039, code lost:
        if (r7 == null) goto L_0x003b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10755a(long r4, int r6, java.lang.Throwable r7) {
        /*
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r4
            if (r6 != 0) goto L_0x000f
            java.util.Map r4 = p2628d.p2629a.C52550ab.m112045a()
            com.bytedance.android.livesdk.p282ag.p283a.C4627a.m11092a(r6, r0, r4)
            return
        L_0x000f:
            r4 = 2
            d.n[] r4 = new p2628d.C52847n[r4]
            r5 = 0
            java.lang.String r2 = "error_code"
            boolean r3 = r7 instanceof com.bytedance.android.live.p180b.p181a.p183b.C2949a
            if (r3 != 0) goto L_0x001b
            r3 = 0
            goto L_0x001c
        L_0x001b:
            r3 = r7
        L_0x001c:
            com.bytedance.android.live.b.a.b.a r3 = (com.bytedance.android.live.p180b.p181a.p183b.C2949a) r3
            if (r3 == 0) goto L_0x0025
            int r3 = r3.getErrorCode()
            goto L_0x0026
        L_0x0025:
            r3 = -1
        L_0x0026:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            d.n r2 = p2628d.C52856t.m112465a(r2, r3)
            r4[r5] = r2
            r5 = 1
            java.lang.String r2 = "error_msg"
            if (r7 == 0) goto L_0x003b
            java.lang.String r7 = r7.getMessage()
            if (r7 != 0) goto L_0x003d
        L_0x003b:
            java.lang.String r7 = ""
        L_0x003d:
            d.n r7 = p2628d.C52856t.m112465a(r2, r7)
            r4[r5] = r7
            java.util.Map r4 = p2628d.p2629a.C52550ab.m112050a(r4)
            com.bytedance.android.livesdk.p282ag.p283a.C4627a.m11092a(r6, r0, r4)
            java.lang.String r5 = "ttlive_charge_package_list_status"
            java.lang.String r5 = com.bytedance.android.live.core.p225d.C3836d.m9735b(r5)
            com.bytedance.android.live.core.p225d.C3837e.m9741a(r5, r6, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p264g.p265a.C4429d.m10755a(long, int, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public static void m10753a(long j, int i, int i2, String str) {
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (i == 0) {
            C4627a.m11094b(i, uptimeMillis, C52550ab.m112045a());
            return;
        }
        C52847n[] nVarArr = new C52847n[2];
        nVarArr[0] = C52856t.m112465a("error_code", Integer.valueOf(i2));
        String str2 = "error_msg";
        if (str == null) {
            str = "";
        }
        nVarArr[1] = C52856t.m112465a(str2, str);
        Map a = C52550ab.m112050a(nVarArr);
        C4627a.m11094b(i, uptimeMillis, a);
        C4627a.m11095c(i, uptimeMillis, a);
    }

    /* renamed from: a */
    public static void m10751a(int i, String str, int i2, int i3, String str2) {
        Map a = C52550ab.m112050a(C52856t.m112465a("times", Integer.valueOf(i2)), C52856t.m112465a("order_id", str), C52856t.m112465a("error_code", Integer.valueOf(i3)), C52856t.m112465a("error_msg", str2));
        if (i == 0) {
            C4627a.m11091a(20, i, 0, a);
            return;
        }
        C4627a.m11091a(20, i, 0, a);
        C4627a.m11093b(20, i, 0, a);
    }

    /* renamed from: a */
    public static void m10752a(int i, String str, long j, int i2, String str2) {
        Map a = C52550ab.m112050a(C52856t.m112465a("product_id", Long.valueOf(j)), C52856t.m112465a("order_id", str), C52856t.m112465a("error_code", Integer.valueOf(i2)), C52856t.m112465a("error_msg", str2));
        if (i == 0) {
            C4627a.m11091a(10, i, 0, a);
            return;
        }
        C4627a.m11091a(10, i, 0, a);
        C4627a.m11093b(10, i, 0, a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008f, code lost:
        if (r8 == null) goto L_0x0091;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m10754a(long r5, int r7, com.bytedance.android.livesdkapi.host.C8807k r8, long r9, java.lang.Throwable r11) {
        /*
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r5
            r5 = 1
            r6 = 2
            r2 = 0
            if (r7 != 0) goto L_0x004d
            d.n[] r11 = new p2628d.C52847n[r6]
            java.lang.String r3 = "product_id"
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            d.n r3 = p2628d.C52856t.m112465a(r3, r4)
            r11[r2] = r3
            java.lang.String r3 = "channel"
            java.lang.String r4 = r8.getValue()
            d.n r3 = p2628d.C52856t.m112465a(r3, r4)
            r11[r5] = r3
            java.util.Map r11 = p2628d.p2629a.C52550ab.m112050a(r11)
            com.bytedance.android.livesdk.p282ag.p283a.C4627a.m11096d(r7, r0, r11)
            d.n[] r6 = new p2628d.C52847n[r6]
            java.lang.String r11 = "product_id"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            d.n r9 = p2628d.C52856t.m112465a(r11, r9)
            r6[r2] = r9
            java.lang.String r9 = "channel"
            java.lang.String r8 = r8.getValue()
            d.n r8 = p2628d.C52856t.m112465a(r9, r8)
            r6[r5] = r8
            java.util.Map r5 = p2628d.p2629a.C52550ab.m112050a(r6)
            com.bytedance.android.livesdk.p282ag.p283a.C4627a.m11091a(r2, r7, r0, r5)
            return
        L_0x004d:
            r3 = 4
            d.n[] r3 = new p2628d.C52847n[r3]
            java.lang.String r4 = "product_id"
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            d.n r9 = p2628d.C52856t.m112465a(r4, r9)
            r3[r2] = r9
            java.lang.String r9 = "channel"
            java.lang.String r8 = r8.getValue()
            d.n r8 = p2628d.C52856t.m112465a(r9, r8)
            r3[r5] = r8
            java.lang.String r5 = "error_code"
            boolean r8 = r11 instanceof com.bytedance.android.live.p180b.p181a.p183b.C2949a
            if (r8 != 0) goto L_0x0070
            r8 = 0
            goto L_0x0071
        L_0x0070:
            r8 = r11
        L_0x0071:
            com.bytedance.android.live.b.a.b.a r8 = (com.bytedance.android.live.p180b.p181a.p183b.C2949a) r8
            if (r8 == 0) goto L_0x007a
            int r8 = r8.getErrorCode()
            goto L_0x007c
        L_0x007a:
            r8 = -14
        L_0x007c:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            d.n r5 = p2628d.C52856t.m112465a(r5, r8)
            r3[r6] = r5
            r5 = 3
            java.lang.String r6 = "error_msg"
            if (r11 == 0) goto L_0x0091
            java.lang.String r8 = r11.getMessage()
            if (r8 != 0) goto L_0x0093
        L_0x0091:
            java.lang.String r8 = ""
        L_0x0093:
            d.n r6 = p2628d.C52856t.m112465a(r6, r8)
            r3[r5] = r6
            java.util.Map r5 = p2628d.p2629a.C52550ab.m112050a(r3)
            com.bytedance.android.livesdk.p282ag.p283a.C4627a.m11096d(r7, r0, r5)
            com.bytedance.android.livesdk.p282ag.p283a.C4627a.m11097e(r7, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p264g.p265a.C4429d.m10754a(long, int, com.bytedance.android.livesdkapi.host.k, long, java.lang.Throwable):void");
    }
}
