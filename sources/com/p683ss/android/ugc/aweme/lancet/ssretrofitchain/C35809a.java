package com.p683ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.IAccountService.C20837d;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;
import com.p683ss.android.ugc.aweme.secapi.C41483a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.atomic.AtomicBoolean;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a */
public final class C35809a extends C35818c {

    /* renamed from: a */
    public final AtomicBoolean f91976a = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$a */
    static final class C35810a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35809a f91977a;

        /* renamed from: b */
        final /* synthetic */ int f91978b;

        /* renamed from: c */
        final /* synthetic */ String f91979c;

        C35810a(C35809a aVar, int i, String str) {
            this.f91977a = aVar;
            this.f91978b = i;
            this.f91979c = str;
        }

        public final void run() {
            Activity g = C11016e.m22312g();
            if (g != null) {
                this.f91977a.mo74477a(g, this.f91978b, this.f91979c);
            } else {
                new Handler().postDelayed(new Runnable(this) {

                    /* renamed from: a */
                    final /* synthetic */ C35810a f91980a;

                    {
                        this.f91980a = r1;
                    }

                    public final void run() {
                        Activity g = C11016e.m22312g();
                        if (g != null) {
                            this.f91980a.f91977a.mo74477a(g, this.f91980a.f91978b, this.f91980a.f91979c);
                        } else {
                            this.f91980a.f91977a.f91976a.set(false);
                        }
                    }
                }, 1000);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$b */
    public static final class C35812b extends C41483a {

        /* renamed from: a */
        final /* synthetic */ C35809a f91981a;

        /* renamed from: b */
        final /* synthetic */ String f91982b;

        /* renamed from: a */
        public final void mo70445a() {
            this.f91981a.f91976a.set(false);
        }

        C35812b(C35809a aVar, String str) {
            this.f91981a = aVar;
            this.f91982b = str;
        }

        /* renamed from: a */
        public final void mo70446a(boolean z, int i) {
            if (z) {
                C47718bf.m103288a(new C23481a(this.f91982b));
            }
            this.f91981a.f91976a.set(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$c */
    static final class C35813c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35809a f91983a;

        C35813c(C35809a aVar) {
            this.f91983a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C20854a.m53162b().logout("expired_logout", "sdk_expired_logout");
            this.f91983a.f91976a.set(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$d */
    static final class C35814d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35809a f91984a;

        C35814d(C35809a aVar) {
            this.f91984a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f91984a.f91976a.set(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$e */
    static final class C35815e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35809a f91985a;

        /* renamed from: b */
        final /* synthetic */ Activity f91986b;

        /* renamed from: c */
        final /* synthetic */ String f91987c;

        C35815e(C35809a aVar, Activity activity, String str) {
            this.f91985a = aVar;
            this.f91986b = activity;
            this.f91987c = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C20854a.m53162b().showLoginAndRegisterView(new C20837d().mo44381a(this.f91986b).mo44384a((C20840g) new C20840g(this) {

                /* renamed from: a */
                final /* synthetic */ C35815e f91988a;

                {
                    this.f91988a = r1;
                }

                public final void onResult(int i, int i2, Object obj) {
                    C35809a aVar = this.f91988a.f91985a;
                    if (i == 1 && i2 == 1) {
                        C47718bf.m103288a(new C23481a(this.f91988a.f91987c));
                    }
                    aVar.f91976a.set(false);
                }
            }).mo44380a());
        }
    }

    public C35809a(C35818c cVar) {
        C52711k.m112240b(cVar, "next");
        super(cVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (r6.f91998a == 3072) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r3.f91976a.compareAndSet(false, true) == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
        r4 = r4.f91996a.f91998a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r5 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r5 = r5.f33321b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35809a.C35810a(r3, r4, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        return new com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35818c.C35819a(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (r6.f91998a == 3070) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r6.f91998a == 3071) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35818c.C35819a mo74476a(com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35823f r4, com.bytedance.retrofit2.p830a.C12686c r5, com.bytedance.retrofit2.C12799u<?> r6) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.f$a r6 = r4.f91996a
            if (r6 == 0) goto L_0x000c
            int r6 = r6.f91998a
            r0 = 3070(0xbfe, float:4.302E-42)
            if (r6 == r0) goto L_0x0024
        L_0x000c:
            if (r4 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.f$a r6 = r4.f91996a
            if (r6 == 0) goto L_0x0018
            int r6 = r6.f91998a
            r0 = 3071(0xbff, float:4.303E-42)
            if (r6 == r0) goto L_0x0024
        L_0x0018:
            if (r4 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.f$a r6 = r4.f91996a
            if (r6 == 0) goto L_0x0051
            int r6 = r6.f91998a
            r0 = 3072(0xc00, float:4.305E-42)
            if (r6 != r0) goto L_0x0051
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r6 = r3.f91976a
            r0 = 1
            r1 = 0
            boolean r6 = r6.compareAndSet(r1, r0)
            if (r6 == 0) goto L_0x0051
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.f$a r4 = r4.f91996a
            int r4 = r4.f91998a
            if (r5 == 0) goto L_0x0037
            java.lang.String r5 = r5.f33321b
            goto L_0x0038
        L_0x0037:
            r5 = 0
        L_0x0038:
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r6.<init>(r2)
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$a r2 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.a$a
            r2.<init>(r3, r4, r5)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r6.post(r2)
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a r4 = new com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a
            r4.<init>(r0, r1)
            return r4
        L_0x0051:
            com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a r4 = com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35817b.f91989a
            java.lang.String r5 = "ChainManager.IGNORE_RESULT"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35809a.mo74476a(com.ss.android.ugc.aweme.lancet.ssretrofitchain.f, com.bytedance.retrofit2.a.c, com.bytedance.retrofit2.u):com.ss.android.ugc.aweme.lancet.ssretrofitchain.c$a");
    }

    /* renamed from: a */
    public final void mo74477a(Activity activity, int i, String str) {
        C52711k.m112240b(activity, "activity");
        if (i == 3070 || i == 3072) {
            SecApiImpl.createISecApibyMonsterPlugin().popCaptcha(activity, i, new C35812b(this, str));
            return;
        }
        if (i == 3071) {
            C10643a aVar = new C10643a(activity);
            IAccountUserService g = C20854a.m53167g();
            C52711k.m112236a((Object) g, "AccountProxyService.userService()");
            if (g.isLogin()) {
                aVar.mo18885a((int) R.string.c1t).mo18899b((int) R.string.c1s).mo18886a((int) R.string.apf, (OnClickListener) new C35813c(this));
            } else {
                aVar.mo18899b((int) R.string.ag1).mo18900b((int) R.string.vj, (OnClickListener) new C35814d(this)).mo18886a((int) R.string.acv, (OnClickListener) new C35815e(this, activity, str));
            }
            aVar.mo18897a().mo18882b().setCancelable(false);
        }
    }
}
