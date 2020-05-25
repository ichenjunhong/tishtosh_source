package com.p683ss.android.ugc.aweme.commercialize.egg;

import android.net.Uri;
import android.text.TextUtils;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.C2442f;
import com.airbnb.lottie.C2475k;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26515i;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26515i.C26517a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.C18974c;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.g */
public final class C25782g {

    /* renamed from: a */
    public static final C25782g f68189a = new C25782g();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.g$a */
    static final class C25783a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ C25751b f68190a;

        C25783a(C25751b bVar) {
            this.f68190a = bVar;
        }

        public final /* synthetic */ Object call() {
            if (TextUtils.isEmpty(this.f68190a.f68094a)) {
                this.f68190a.f68098e.set(false);
                C25782g.f68189a.mo52995c(this.f68190a);
            } else if (C26515i.m64159a(Uri.parse(this.f68190a.f68094a))) {
                this.f68190a.f68098e.set(true);
                C25782g.f68189a.mo52994b(this.f68190a);
            } else {
                C26515i.m64158a(this.f68190a.f68094a, (C26517a) new C26517a(this) {

                    /* renamed from: a */
                    final /* synthetic */ C25783a f68191a;

                    public final void onFailureImpl() {
                        this.f68191a.f68190a.f68098e.set(false);
                        C25782g.f68189a.mo52995c(this.f68191a.f68190a);
                    }

                    public final void onNewResultImpl() {
                        this.f68191a.f68190a.f68098e.set(true);
                        C25782g.f68189a.mo52994b(this.f68191a.f68190a);
                    }

                    {
                        this.f68191a = r1;
                    }
                });
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.g$b */
    static final class C25785b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C25751b f68192a;

        C25785b(C25751b bVar) {
            this.f68192a = bVar;
        }

        public final void run() {
            try {
                StringBuilder sb = new StringBuilder("CommerceLikeLayout:setCommerceDigg url = ");
                sb.append(this.f68192a.f68094a);
                C32458a.m75144a(sb.toString());
                final C2475k b = C2442f.m7139b(C11010c.m22280a(), this.f68192a.f68094a);
                C52711k.m112236a((Object) b, "task");
                if (b.f7661b != null || b.f7660a == null) {
                    C18842a.m45934b(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C25785b f68195a;

                        {
                            this.f68195a = r1;
                        }

                        public final void run() {
                            this.f68195a.f68192a.f68098e.set(false);
                            C25782g.f68189a.mo52995c(this.f68195a.f68192a);
                        }
                    });
                } else {
                    C18842a.m45934b(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C25785b f68193a;

                        {
                            this.f68193a = r1;
                        }

                        public final void run() {
                            this.f68193a.f68192a.f68098e.set(true);
                            C25751b bVar = this.f68193a.f68192a;
                            C2475k kVar = b;
                            C52711k.m112236a((Object) kVar, "task");
                            bVar.f68099f = new C25779f((C2408e) kVar.f7660a);
                            C25782g.f68189a.mo52994b(this.f68193a.f68192a);
                        }
                    });
                }
            } catch (Exception e) {
                C32458a.m75148a((Throwable) new C18974c(e));
                C25782g.f68189a.mo52995c(this.f68192a);
            }
        }
    }

    private C25782g() {
    }

    /* renamed from: b */
    public final void mo52994b(C25751b bVar) {
        m62405a(bVar, true);
    }

    /* renamed from: c */
    public final void mo52995c(C25751b bVar) {
        m62405a(bVar, false);
    }

    /* renamed from: d */
    private static void m62406d(C25751b bVar) {
        C52711k.m112240b(bVar, "eggData");
        C0013i.m16a((Callable<TResult>) new C25783a<TResult>(bVar));
    }

    /* renamed from: e */
    private static void m62407e(C25751b bVar) {
        C52711k.m112240b(bVar, "eggData");
        C18842a.m45932a(new C25785b(bVar));
    }

    /* renamed from: a */
    public static void m62404a(C25751b bVar) {
        C25945k.m62932w().mo53028a(bVar);
        if (bVar != null) {
            String str = bVar.f68095b;
            if (str.hashCode() == 120609 && str.equals("zip")) {
                m62407e(bVar);
            } else {
                m62406d(bVar);
            }
        }
    }

    /* renamed from: a */
    private static void m62405a(C25751b bVar, boolean z) {
        C25945k.m62932w().mo53029a(bVar, z);
    }
}
