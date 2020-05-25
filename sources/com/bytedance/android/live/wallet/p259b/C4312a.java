package com.bytedance.android.live.wallet.p259b;

import android.app.Activity;
import android.os.Message;
import android.os.SystemClock;
import android.support.p030v4.p038f.C0779b;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.wallet.C4285a;
import com.bytedance.android.live.wallet.api.C4295a;
import com.bytedance.android.live.wallet.api.C4296b;
import com.bytedance.android.live.wallet.api.C4298d;
import com.bytedance.android.live.wallet.api.C4303i;
import com.bytedance.android.live.wallet.api.C4303i.C4305b;
import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;
import com.bytedance.android.live.wallet.p259b.C4327c.C4330a;
import com.bytedance.android.live.wallet.p259b.C4327c.C4331b;
import com.bytedance.android.live.wallet.p263f.C4423a;
import com.bytedance.android.live.wallet.p263f.C4423a.C4424a;
import com.bytedance.android.live.wallet.p264g.p266b.C4450a;
import com.bytedance.android.livesdk.p282ag.p283a.C4627a;
import com.bytedance.android.livesdkapi.depend.model.C8685b;
import com.bytedance.android.livesdkapi.host.C8807k;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8770a;
import com.bytedance.android.livesdkapi.host.IHostWallet.C8771b;
import com.bytedance.android.livesdkapi.p455i.C8814d;
import com.bytedance.android.livesdkapi.p455i.C8825n;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.wallet.b.a */
public class C4312a implements C9382a {

    /* renamed from: p */
    private static final String f11804p = "a";

    /* renamed from: a */
    public final Set<String> f11805a = new C0779b();

    /* renamed from: b */
    public final LinkedList<C4325b> f11806b = new LinkedList<>();

    /* renamed from: c */
    public final Queue<C4325b> f11807c = new LinkedList();

    /* renamed from: d */
    public final C9381g f11808d;

    /* renamed from: e */
    public C4450a f11809e;

    /* renamed from: f */
    public final C4296b f11810f;

    /* renamed from: g */
    public final C4327c f11811g;

    /* renamed from: h */
    public JSONObject f11812h;

    /* renamed from: i */
    public boolean f11813i = false;

    /* renamed from: j */
    public boolean f11814j = false;

    /* renamed from: k */
    public boolean f11815k = false;

    /* renamed from: l */
    public long f11816l;

    /* renamed from: m */
    public String f11817m = null;

    /* renamed from: n */
    public final C4324a f11818n = new C4324a();

    /* renamed from: o */
    public final C4330a f11819o = new C4330a() {
        /* renamed from: a */
        public final void mo10105a() {
            C4312a.this.mo10100a();
        }
    };

    /* renamed from: q */
    private final Set<String> f11820q = new C0779b();

    /* renamed from: r */
    private final Set<String> f11821r = new C0779b();

    /* renamed from: s */
    private final C4298d f11822s;

    /* renamed from: t */
    private final C4295a f11823t;

    /* renamed from: com.bytedance.android.live.wallet.b.a$a */
    public static class C4324a {

        /* renamed from: a */
        public Activity f11844a;

        /* renamed from: b */
        public long f11845b;

        /* renamed from: c */
        public String f11846c;

        /* renamed from: d */
        public boolean f11847d;

        /* renamed from: e */
        public boolean f11848e;

        /* renamed from: f */
        public boolean f11849f;

        /* renamed from: g */
        public int f11850g;

        private C4324a() {
        }

        /* renamed from: a */
        public final void mo10109a() {
            this.f11844a = null;
            this.f11845b = 0;
            this.f11846c = null;
            this.f11847d = false;
            this.f11848e = false;
            this.f11849f = false;
            this.f11850g = 0;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.b.a$b */
    static class C4325b {

        /* renamed from: a */
        public final C8825n f11851a;

        /* renamed from: b */
        public int f11852b;

        /* renamed from: c */
        public String f11853c;

        public final String toString() {
            return super.toString();
        }

        private C4325b(C8825n nVar) {
            this.f11851a = nVar;
        }
    }

    /* renamed from: a */
    public final void mo10102a(String str) {
        if (TextUtils.equals(str, this.f11817m)) {
            this.f11818n.f11849f = true;
            if (this.f11818n.f11848e) {
                this.f11817m = null;
                int i = this.f11818n.f11850g;
                this.f11818n.mo10109a();
                if (this.f11809e != null) {
                    this.f11809e.mo10131c();
                }
                this.f11809e.mo10123a(i, (CheckOrderOriginalResult) null);
                C18898c.m46011a(C3922z.m9915e(), "recharge_pay_result", "google_pay_success", -1, -1, this.f11812h);
                C4423a.m10738a();
            }
        }
    }

    /* renamed from: b */
    public final void mo10103b() {
        if (!this.f11815k && !this.f11806b.isEmpty()) {
            final C4325b bVar = null;
            while (bVar == null && !this.f11806b.isEmpty()) {
                bVar = (C4325b) this.f11806b.poll();
            }
            if (bVar != null) {
                this.f11815k = true;
                if (this.f11820q.contains(bVar.f11851a.f24100d)) {
                    m10592a(Message.obtain(this.f11808d, BaseNotice.CHECK_PROFILE, Pair.create(bVar, Boolean.valueOf(true))));
                    return;
                }
                if (bVar.f11853c == null && this.f11817m != null && TextUtils.equals(bVar.f11851a.f24097a, this.f11817m)) {
                    bVar.f11853c = this.f11818n.f11846c;
                }
                this.f11822s.mo10071a(bVar.f11851a.f24101e, bVar.f11851a.f24102f, bVar.f11853c).mo6505a((C1710e<? super T>) new C1710e<C4177d<C8814d>>() {
                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        C4177d dVar = (C4177d) obj;
                        if (C4312a.this.f11808d != null) {
                            Message obtain = Message.obtain();
                            obtain.what = BaseNotice.CHECK_PROFILE;
                            obtain.obj = Pair.create(bVar, Boolean.valueOf(((C8814d) dVar.data).f24061a));
                            C4312a.this.f11808d.handleMessage(obtain);
                        }
                    }
                }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
                    public final /* synthetic */ void accept(Object obj) throws Exception {
                        Object obj2 = (Throwable) obj;
                        if (C4312a.this.f11808d != null) {
                            Message obtain = Message.obtain();
                            obtain.what = BaseNotice.CHECK_PROFILE;
                            C4325b bVar = bVar;
                            if (!(obj2 instanceof Exception)) {
                                obj2 = new Exception();
                            }
                            obtain.obj = Pair.create(bVar, obj2);
                            C4312a.this.f11808d.handleMessage(obtain);
                        }
                    }
                });
            }
        }
    }

    /* renamed from: c */
    public final void mo10104c() {
        if (!this.f11814j && !this.f11807c.isEmpty()) {
            final C4325b bVar = null;
            while (bVar == null && !this.f11807c.isEmpty()) {
                bVar = (C4325b) this.f11807c.poll();
            }
            if (bVar != null) {
                this.f11814j = true;
                final JSONObject jSONObject = this.f11812h;
                C43229 r2 = new C8771b() {
                    /* renamed from: a */
                    public final void mo10107a(int i, String str) {
                        C4312a.this.f11814j = false;
                        if (i == 0) {
                            C4312a.this.f11805a.add(str);
                            C4312a.this.mo10102a(bVar.f11851a.f24097a);
                        } else {
                            C4325b bVar = bVar;
                            int i2 = bVar.f11852b + 1;
                            bVar.f11852b = i2;
                            if (i2 < 3) {
                                C4312a.this.f11807c.offer(bVar);
                            } else {
                                C18898c.m46011a(C3922z.m9915e(), "recharge_pay_result", "fail_google_consume_fail", -1, -1, jSONObject);
                                C4423a.m10742a(C4424a.CONSUME, String.valueOf(i), (String) null, (JSONObject) null);
                                C4312a.this.f11808d.postDelayed(new Runnable() {
                                    public final void run() {
                                        bVar.f11852b = 0;
                                        C4312a.this.f11807c.offer(bVar);
                                        C4312a.this.mo10104c();
                                    }
                                }, 60000);
                                C4312a.this.mo10102a(bVar.f11851a.f24097a);
                            }
                        }
                        C4312a.this.mo10104c();
                    }
                };
                if (this.f11805a.contains(bVar.f11851a.f24100d)) {
                    r2.mo10107a(0, bVar.f11851a.f24100d);
                } else {
                    this.f11811g.mo10114a(bVar.f11851a.f24100d, (C8771b) r2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10100a() {
        /*
            r6 = this;
            boolean r0 = r6.f11813i
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            java.util.Queue<com.bytedance.android.live.wallet.b.a$b> r0 = r6.f11807c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0010
            r6.mo10104c()
        L_0x0010:
            com.bytedance.android.live.wallet.b.c r0 = r6.f11811g
            com.bytedance.android.live.wallet.b.c$b r1 = r0.f11857b
            com.bytedance.android.live.wallet.b.c$b r2 = com.bytedance.android.live.wallet.p259b.C4327c.C4331b.CONNECTED
            r3 = 0
            if (r1 != r2) goto L_0x0024
            com.bytedance.android.livesdkapi.host.IHostWallet$a r0 = r0.mo10112a()
            if (r0 == 0) goto L_0x0024
            com.bytedance.android.livesdkapi.host.IHostWallet$e r0 = r0.mo15485a()
            goto L_0x0025
        L_0x0024:
            r0 = r3
        L_0x0025:
            int r1 = r0.mo15486a()
            if (r1 != 0) goto L_0x0064
            java.util.LinkedList<com.bytedance.android.live.wallet.b.a$b> r1 = r6.f11806b
            r1.clear()
            java.util.List r1 = r0.mo15487b()
            if (r1 == 0) goto L_0x0064
            java.util.LinkedList<com.bytedance.android.live.wallet.b.a$b> r1 = r6.f11806b
            java.util.List r0 = r0.mo15487b()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r0.size()
            r2.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0049:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x005e
            java.lang.Object r4 = r0.next()
            com.bytedance.android.livesdkapi.i.n r4 = (com.bytedance.android.livesdkapi.p455i.C8825n) r4
            com.bytedance.android.live.wallet.b.a$b r5 = new com.bytedance.android.live.wallet.b.a$b
            r5.<init>(r4)
            r2.add(r5)
            goto L_0x0049
        L_0x005e:
            r1.addAll(r2)
            r6.mo10103b()
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.wallet.p259b.C4312a.mo10100a():void");
    }

    /* renamed from: b */
    private void m10594b(Message message) {
        String str;
        CheckOrderOriginalResult checkOrderOriginalResult = (CheckOrderOriginalResult) message.obj;
        if (this.f11817m != null && TextUtils.equals(checkOrderOriginalResult.getOrderId(), this.f11818n.f11846c)) {
            if (checkOrderOriginalResult.getException() == null && checkOrderOriginalResult.getStatus() == 1) {
                this.f11821r.add(checkOrderOriginalResult.getOrderId());
                this.f11818n.f11848e = true;
                if (this.f11818n.f11849f) {
                    m10589a(0, this.f11818n.f11846c, checkOrderOriginalResult.getRetry(), 0, "");
                    mo10102a(this.f11817m);
                }
            } else if (checkOrderOriginalResult.getRetry() < 5) {
                this.f11808d.postDelayed(new C4326b(this, checkOrderOriginalResult), 2000);
            } else {
                C18898c.m46011a(C3922z.m9915e(), "recharge_pay_result", "fail_google_check_fail", -1, -1, this.f11812h);
                int i = -11;
                if (checkOrderOriginalResult.getException() != null) {
                    C4423a.m10740a(C4424a.CHECK_ORDER, checkOrderOriginalResult.getException());
                    if (checkOrderOriginalResult.getException() instanceof C2949a) {
                        i = ((C2949a) checkOrderOriginalResult.getException()).getErrorCode();
                    }
                    str = checkOrderOriginalResult.getException().getMessage();
                } else {
                    C4423a.m10742a(C4424a.CHECK_ORDER, String.valueOf(checkOrderOriginalResult.getStatus()), (String) null, (JSONObject) null);
                    str = "check order failed";
                }
                m10589a(1, this.f11818n.f11846c, checkOrderOriginalResult.getRetry(), i, str);
                m10593a(this.f11817m, checkOrderOriginalResult.getException(), R.string.e_t);
            }
        }
    }

    /* renamed from: a */
    private void m10592a(Message message) {
        String str;
        int i;
        this.f11815k = false;
        Pair pair = (Pair) message.obj;
        final C4325b bVar = (C4325b) pair.first;
        if ((pair.second instanceof Exception) || pair.second == null || !((Boolean) pair.second).booleanValue()) {
            int i2 = bVar.f11852b + 1;
            bVar.f11852b = i2;
            if (i2 < 3) {
                this.f11806b.offer(bVar);
            } else {
                C18898c.m46011a(C3922z.m9915e(), "recharge_pay_result", "fail_google_verify_fail", -1, -1, this.f11812h);
                int i3 = -13;
                Exception exc = null;
                if (pair.second instanceof Exception) {
                    if (pair.second instanceof C2949a) {
                        i3 = ((C2949a) pair.second).getErrorCode();
                    }
                    String message2 = ((Exception) pair.second).getMessage();
                    C4423a.m10740a(C4424a.VERIFY, (Exception) pair.second);
                    i = i3;
                    str = message2;
                } else {
                    C4423a.m10742a(C4424a.VERIFY, "0", "verify false", (JSONObject) null);
                    str = "verify false";
                    i = -13;
                }
                m10590a(1, this.f11818n.f11846c, this.f11818n.f11845b, i, str, C4424a.VERIFY);
                this.f11808d.postDelayed(new Runnable() {
                    public final void run() {
                        bVar.f11852b = 0;
                        C4312a.this.f11806b.offer(bVar);
                        C4312a.this.mo10103b();
                    }
                }, 60000);
                String str2 = bVar.f11851a.f24097a;
                if (pair.second instanceof Exception) {
                    exc = (Exception) pair.second;
                }
                m10593a(str2, exc, R.string.e_u);
            }
        } else {
            bVar.f11852b = 0;
            this.f11807c.offer(bVar);
            if (this.f11811g.f11857b == C4331b.CONNECTED) {
                mo10104c();
            } else {
                this.f11811g.mo10116b(this.f11819o);
            }
            this.f11820q.add(bVar.f11851a.f24100d);
            if (this.f11817m != null) {
                this.f11818n.f11847d = TextUtils.equals(this.f11817m, bVar.f11851a.f24097a);
                if (this.f11818n.f11847d) {
                    m10590a(0, this.f11818n.f11846c, this.f11818n.f11845b, 0, "", C4424a.VERIFY);
                    mo10101a(0);
                }
            }
        }
        mo10103b();
    }

    public void handleMsg(Message message) {
        String str;
        int i;
        if (!this.f11813i) {
            switch (message.what) {
                case BaseNotice.CHECK_PROFILE /*1002*/:
                    m10592a(message);
                    return;
                case BaseNotice.COMMENT_REPLY_WITH_VIDEO /*1003*/:
                    if (message.obj instanceof Exception) {
                        C18898c.m46011a(C3922z.m9915e(), "recharge_pay_result", "fail_google_create_order_fail", -1, -1, this.f11812h);
                        C4423a.m10740a(C4424a.CREATE_ORDER, (Exception) message.obj);
                        C4423a.m10744a(C8807k.GOOGLE, (Exception) message.obj);
                        m10591a(this.f11816l, 1, C8807k.GOOGLE, this.f11818n.f11845b, (Throwable) message.obj);
                        m10593a(this.f11817m, (Exception) message.obj, 0);
                        break;
                    } else {
                        C8685b bVar = (C8685b) message.obj;
                        if (bVar == null || TextUtils.isEmpty(bVar.f23718a)) {
                            C18898c.m46011a(C3922z.m9915e(), "recharge_pay_result", "fail_google_create_order_fail", -1, -1, this.f11812h);
                            C4423a.m10742a(C4424a.CREATE_ORDER, "0", "invalid order", (JSONObject) null);
                            C4423a.m10743a(C8807k.GOOGLE, 0, "invalide order", (JSONObject) null);
                            long j = this.f11816l;
                            C8807k kVar = C8807k.GOOGLE;
                            long j2 = this.f11818n.f11845b;
                            StringBuilder sb = new StringBuilder();
                            if (bVar == null) {
                                str = "orderInfo";
                            } else {
                                str = "orderId";
                            }
                            sb.append(str);
                            sb.append("was null");
                            m10591a(j, 1, kVar, j2, (Throwable) new RuntimeException(sb.toString()));
                            m10593a(this.f11817m, null, R.string.e_s);
                            break;
                        } else {
                            C4423a.m10745a(C8807k.GOOGLE, (JSONObject) null);
                            m10591a(this.f11816l, 0, C8807k.GOOGLE, this.f11818n.f11845b, (Throwable) null);
                            this.f11818n.f11846c = bVar.f23718a;
                            if (!(this.f11818n.f11844a == null || this.f11817m == null)) {
                                C4327c cVar = this.f11811g;
                                Activity activity = this.f11818n.f11844a;
                                String str2 = this.f11817m;
                                if (cVar.f11857b != C4331b.CONNECTED) {
                                    i = -1;
                                } else {
                                    C8770a a = cVar.mo10112a();
                                    if (a != null) {
                                        i = a.mo15484a(activity, str2);
                                    } else {
                                        i = 6;
                                    }
                                }
                                if (i != 0) {
                                    C18898c.m46011a(C3922z.m9915e(), "recharge_pay_result", "fail_google_pay_fail", -1, (long) i, this.f11812h);
                                    C4423a.m10742a(C4424a.GOOGLE_PAY, String.valueOf(i), "launchFailed", (JSONObject) null);
                                    m10590a(1, this.f11818n.f11846c, this.f11818n.f11845b, i, "launchFailed", C4424a.GOOGLE_PAY);
                                    m10593a(this.f11817m, null, R.string.e_q);
                                    break;
                                } else {
                                    this.f11818n.f11844a = null;
                                    if (this.f11809e != null) {
                                        this.f11809e.mo10131c();
                                    }
                                    return;
                                }
                            }
                        }
                    }
                    break;
                case 1004:
                    m10594b(message);
                    break;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10101a(final int i) {
        if (this.f11817m != null && this.f11818n.f11847d) {
            final String str = this.f11818n.f11846c;
            if (this.f11821r.contains(this.f11818n.f11846c)) {
                m10594b(Message.obtain(this.f11808d, 1004, new CheckOrderOriginalResult().setRetry(i).setOrderId(str).setStatus(1)));
                return;
            }
            this.f11823t.mo10069a(str).mo6505a((C1710e<? super T>) new C1710e<CheckOrderOriginalResult>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    CheckOrderOriginalResult checkOrderOriginalResult = (CheckOrderOriginalResult) obj;
                    if (C4312a.this.f11808d != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 1004;
                        obtain.obj = checkOrderOriginalResult.setOrderId(str).setRetry(i);
                        C4312a.this.f11808d.handleMessage(obtain);
                    }
                }
            }, (C1710e<? super Throwable>) new C1710e<Throwable>() {
                public final /* synthetic */ void accept(Object obj) throws Exception {
                    Exception exc;
                    Throwable th = (Throwable) obj;
                    CheckOrderOriginalResult orderId = new CheckOrderOriginalResult().setRetry(i).setOrderId(str);
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = new Exception();
                    }
                    orderId.setException(exc).setStatus(-1);
                }
            });
        }
    }

    /* renamed from: a */
    private void m10593a(String str, Exception exc, int i) {
        if (TextUtils.equals(str, this.f11817m)) {
            this.f11817m = null;
            this.f11818n.mo10109a();
            if (this.f11809e != null) {
                this.f11809e.mo10131c();
                this.f11809e.mo10128a(exc, i);
            }
        }
    }

    public C4312a(C4298d dVar, C4296b bVar, C4295a aVar, C4327c cVar) {
        this.f11810f = bVar;
        this.f11822s = dVar;
        this.f11823t = aVar;
        this.f11811g = cVar;
        this.f11808d = new C9381g(this);
        C4303i iVar = (C4303i) C4285a.m10552a(C4303i.class);
        if (iVar != null) {
            iVar.mo10080a((C4305b) new C4305b() {
                /* renamed from: a */
                public final void mo10087a(String str, String str2) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        String optString = jSONObject.optString("productId");
                        String optString2 = jSONObject.optString("orderId");
                        long optLong = jSONObject.optLong("purchaseTime");
                        String optString3 = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                        LinkedList<C4325b> linkedList = C4312a.this.f11806b;
                        C8825n nVar = new C8825n(optString, optString2, optLong, optString3, str, str2);
                        linkedList.offer(new C4325b(nVar));
                        C4312a.this.mo10103b();
                    } catch (JSONException unused) {
                    }
                }
            });
        }
    }

    /* renamed from: a */
    private static void m10589a(int i, String str, int i2, int i3, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("error_code", Integer.valueOf(i3));
        hashMap.put("error_msg", str2);
        hashMap.put("times", Integer.valueOf(i2));
        if (i == 0) {
            C4627a.m11091a(20, i, 0, hashMap);
            return;
        }
        C4627a.m11091a(20, i, 0, hashMap);
        C4627a.m11093b(20, i, 0, hashMap);
    }

    /* renamed from: a */
    private static void m10591a(long j, int i, C8807k kVar, long j2, Throwable th) {
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", Long.valueOf(j2));
        hashMap.put("channel", kVar.getValue());
        if (i == 0) {
            C4627a.m11096d(i, uptimeMillis, hashMap);
            C4627a.m11091a(0, i, uptimeMillis, hashMap);
            return;
        }
        int i2 = -1;
        String str = "";
        if (th != null) {
            str = th.getMessage();
        }
        if (th instanceof C2949a) {
            i2 = ((C2949a) th).getErrorCode();
        }
        hashMap.put("error_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str);
        C4627a.m11096d(i, uptimeMillis, hashMap);
        C4627a.m11097e(i, uptimeMillis, hashMap);
    }

    /* renamed from: a */
    private static void m10590a(int i, String str, long j, int i2, String str2, C4424a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("product_id", Long.valueOf(j));
        hashMap.put("order_id", str);
        hashMap.put("error_code", Integer.valueOf(i2));
        hashMap.put("error_msg", str2);
        hashMap.put("errorDomain", aVar.getDomain());
        if (i == 0) {
            C4627a.m11091a(10, i, 0, hashMap);
            return;
        }
        C4627a.m11091a(10, i, 0, hashMap);
        C4627a.m11093b(10, i, 0, hashMap);
    }
}
