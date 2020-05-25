package com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1565d;

import android.net.Uri;
import android.text.TextUtils;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.C2442f;
import com.airbnb.lottie.C2475k;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.commercialize.C25649b;
import com.p683ss.android.ugc.aweme.commercialize.C25649b.C25651a;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25789i.C25790a;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.p1564c.C25815a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25773a;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25777c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.d.a */
public final class C25816a {

    /* renamed from: a */
    public static final C25816a f68258a = new C25816a();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.d.a$a */
    static final class C25817a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C25773a f68259a;

        C25817a(C25773a aVar) {
            this.f68259a = aVar;
        }

        public final /* synthetic */ Object call() {
            if (TextUtils.isEmpty(this.f68259a.f68153a)) {
                this.f68259a.f68162j.set(false);
                C25816a.f68258a.mo53015c(this.f68259a);
            } else if (C25649b.m62171a(Uri.parse(this.f68259a.f68153a))) {
                this.f68259a.f68162j.set(true);
                C25816a.f68258a.mo53014b(this.f68259a);
            } else {
                C25649b.m62170a(this.f68259a.f68153a, (C25651a) new C25651a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C25817a f68260a;

                    /* renamed from: a */
                    public final void mo52802a() {
                        this.f68260a.f68259a.f68162j.set(true);
                        C25816a.f68258a.mo53014b(this.f68260a.f68259a);
                    }

                    /* renamed from: b */
                    public final void mo52803b() {
                        this.f68260a.f68259a.f68162j.set(false);
                        C25816a.f68258a.mo53015c(this.f68260a.f68259a);
                    }

                    {
                        this.f68260a = r1;
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.impl.d.a$b */
    static final class C25819b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C25773a f68261a;

        C25819b(C25773a aVar) {
            this.f68261a = aVar;
        }

        public final void run() {
            try {
                StringBuilder sb = new StringBuilder("CommerceLikeLayout:setCommerceDigg url = ");
                sb.append(this.f68261a.f68153a);
                C32458a.m75144a(sb.toString());
                final C2475k b = C2442f.m7139b(C11010c.m22280a(), this.f68261a.f68153a);
                C52711k.m112236a((Object) b, "task");
                if (b.f7661b != null || b.f7660a == null) {
                    C18842a.m45934b(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C25819b f68264a;

                        {
                            this.f68264a = r1;
                        }

                        public final void run() {
                            this.f68264a.f68261a.f68162j.set(false);
                            C25816a.f68258a.mo53015c(this.f68264a.f68261a);
                        }
                    });
                } else {
                    C18842a.m45934b(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C25819b f68262a;

                        {
                            this.f68262a = r1;
                        }

                        public final void run() {
                            this.f68262a.f68261a.f68162j.set(true);
                            C25773a aVar = this.f68262a.f68261a;
                            C2475k kVar = b;
                            C52711k.m112236a((Object) kVar, "task");
                            aVar.f68163k = new C25777c((C2408e) kVar.f7660a);
                            C25816a.f68258a.mo53014b(this.f68262a.f68261a);
                        }
                    });
                }
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                C25816a.f68258a.mo53015c(this.f68261a);
            }
        }
    }

    private C25816a() {
    }

    /* renamed from: b */
    public final void mo53014b(C25773a aVar) {
        m62457a(aVar, true);
    }

    /* renamed from: c */
    public final void mo53015c(C25773a aVar) {
        m62457a(aVar, false);
    }

    /* renamed from: d */
    private static void m62458d(C25773a aVar) {
        C0013i.m16a((Callable<TResult>) new C25817a<TResult>(aVar));
    }

    /* renamed from: e */
    private static void m62459e(C25773a aVar) {
        C18842a.m45932a(new C25819b(aVar));
    }

    /* renamed from: a */
    public static void m62456a(C25773a aVar) {
        C25815a.m62455a().mo52806a().mo52962a(aVar);
        if (aVar != null) {
            if (C52711k.m112239a((Object) aVar.f68154b, (Object) C25790a.m62413a())) {
                m62459e(aVar);
            } else {
                m62458d(aVar);
            }
        }
    }

    /* renamed from: a */
    private static void m62457a(C25773a aVar, boolean z) {
        C25815a.m62455a().mo52806a().mo52963a(aVar, z);
    }
}
