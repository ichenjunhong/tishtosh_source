package com.bytedance.ies.bullet.p628b.p637g.p640c;

import java.util.Iterator;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.ies.bullet.b.g.c.f */
public abstract class C10335f<T> implements C10332c<T>, C10333d<T> {

    /* renamed from: a */
    public final Iterator<C10333d<T>> f27739a;

    /* renamed from: b */
    public final C10332c<T> f27740b;

    /* renamed from: c */
    public final C10334e<T> f27741c;

    /* renamed from: com.bytedance.ies.bullet.b.g.c.f$a */
    static final class C10336a extends C52712l implements C52686q<C10342h, T, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10335f f27742a;

        /* renamed from: b */
        final /* synthetic */ C52671b f27743b;

        /* renamed from: c */
        final /* synthetic */ C52671b f27744c;

        /* renamed from: d */
        final /* synthetic */ Object f27745d;

        C10336a(C10335f fVar, C52671b bVar, C52671b bVar2, Object obj) {
            this.f27742a = fVar;
            this.f27743b = bVar;
            this.f27744c = bVar2;
            this.f27745d = obj;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            C10342h hVar = (C10342h) obj;
            Throwable th = (Throwable) obj3;
            C52711k.m112240b(hVar, "policy");
            C10334e<T> eVar = this.f27742a.f27741c;
            if (eVar != null) {
                Object a = eVar.mo18383a(hVar, obj2, th);
                if (a != null) {
                    obj2 = a;
                }
            }
            switch (C10341g.f27765a[hVar.ordinal()]) {
                case 1:
                    this.f27742a.mo18267a(obj2, this.f27743b, this.f27744c);
                    break;
                case 2:
                    this.f27743b.invoke(obj2);
                    break;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.g.c.f$b */
    static final class C10337b extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10335f f27746a;

        /* renamed from: b */
        final /* synthetic */ C52671b f27747b;

        /* renamed from: c */
        final /* synthetic */ C52671b f27748c;

        /* renamed from: d */
        final /* synthetic */ Object f27749d;

        C10337b(C10335f fVar, C52671b bVar, C52671b bVar2, Object obj) {
            this.f27746a = fVar;
            this.f27747b = bVar;
            this.f27748c = bVar2;
            this.f27749d = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "it");
            this.f27748c.invoke(th);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.g.c.f$c */
    static final class C10338c extends C52712l implements C52671b<T, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10333d f27750a;

        /* renamed from: b */
        final /* synthetic */ C52686q f27751b;

        /* renamed from: c */
        final /* synthetic */ C52671b f27752c;

        /* renamed from: d */
        final /* synthetic */ C10335f f27753d;

        /* renamed from: e */
        final /* synthetic */ C52671b f27754e;

        /* renamed from: f */
        final /* synthetic */ C52671b f27755f;

        /* renamed from: g */
        final /* synthetic */ Object f27756g;

        C10338c(C10333d dVar, C52686q qVar, C52671b bVar, C10335f fVar, C52671b bVar2, C52671b bVar3, Object obj) {
            this.f27750a = dVar;
            this.f27751b = qVar;
            this.f27752c = bVar;
            this.f27753d = fVar;
            this.f27754e = bVar2;
            this.f27755f = bVar3;
            this.f27756g = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f27753d.mo18403a(this.f27753d.f27739a.hasNext(), this.f27750a, obj, new C52682m<C10342h, T, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C10338c f27757a;

                {
                    this.f27757a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                    C10342h hVar = (C10342h) obj;
                    C52711k.m112240b(hVar, "policy");
                    this.f27757a.f27751b.invoke(hVar, obj2, null);
                    return C52860x.f131107a;
                }
            }, this.f27752c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.b.g.c.f$d */
    static final class C10340d extends C52712l implements C52671b<Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C10333d f27758a;

        /* renamed from: b */
        final /* synthetic */ C52686q f27759b;

        /* renamed from: c */
        final /* synthetic */ C52671b f27760c;

        /* renamed from: d */
        final /* synthetic */ C10335f f27761d;

        /* renamed from: e */
        final /* synthetic */ C52671b f27762e;

        /* renamed from: f */
        final /* synthetic */ C52671b f27763f;

        /* renamed from: g */
        final /* synthetic */ Object f27764g;

        C10340d(C10333d dVar, C52686q qVar, C52671b bVar, C10335f fVar, C52671b bVar2, C52671b bVar3, Object obj) {
            this.f27758a = dVar;
            this.f27759b = qVar;
            this.f27760c = bVar;
            this.f27761d = fVar;
            this.f27762e = bVar2;
            this.f27763f = bVar3;
            this.f27764g = obj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            C52711k.m112240b(th, "t");
            this.f27761d.mo18404a(this.f27761d.f27739a.hasNext(), this.f27758a, this.f27764g, th, this.f27759b, this.f27760c);
            return C52860x.f131107a;
        }
    }

    public C10335f(Iterable<? extends C10333d<T>> iterable, C10332c<T> cVar, C10334e<T> eVar) {
        C52711k.m112240b(iterable, "processors");
        C52711k.m112240b(cVar, "connector");
        this.f27740b = cVar;
        this.f27741c = eVar;
        this.f27739a = iterable.iterator();
    }

    /* renamed from: a */
    public final void mo18267a(T t, C52671b<? super T, C52860x> bVar, C52671b<? super Throwable, C52860x> bVar2) {
        T t2 = t;
        C52671b<? super T, C52860x> bVar3 = bVar;
        C52671b<? super Throwable, C52860x> bVar4 = bVar2;
        C52711k.m112240b(bVar3, "resolve");
        C52711k.m112240b(bVar4, "reject");
        if (this.f27739a.hasNext()) {
            C10333d dVar = (C10333d) this.f27739a.next();
            C10333d dVar2 = dVar;
            C52686q aVar = new C10336a(this, bVar3, bVar4, t2);
            C52671b bVar5 = new C10337b(this, bVar3, bVar4, t2);
            C52671b<? super T, C52860x> bVar6 = bVar;
            C52671b<? super Throwable, C52860x> bVar7 = bVar2;
            T t3 = t;
            C10338c cVar = new C10338c(dVar2, aVar, bVar5, this, bVar6, bVar7, t3);
            C52671b bVar8 = cVar;
            C10340d dVar3 = new C10340d(dVar2, aVar, bVar5, this, bVar6, bVar7, t3);
            dVar.mo18267a(t2, bVar8, dVar3);
            return;
        }
        bVar3.invoke(t2);
    }

    /* renamed from: a */
    public final void mo18403a(boolean z, C10333d<T> dVar, T t, C52682m<? super C10342h, ? super T, C52860x> mVar, C52671b<? super Throwable, C52860x> bVar) {
        C52711k.m112240b(dVar, "processor");
        C52711k.m112240b(mVar, "resolve");
        C52711k.m112240b(bVar, "reject");
        this.f27740b.mo18403a(z, dVar, t, mVar, bVar);
    }

    /* renamed from: a */
    public final void mo18404a(boolean z, C10333d<T> dVar, T t, Throwable th, C52686q<? super C10342h, ? super T, ? super Throwable, C52860x> qVar, C52671b<? super Throwable, C52860x> bVar) {
        C52711k.m112240b(dVar, "processor");
        C52711k.m112240b(th, "t");
        C52711k.m112240b(qVar, "resolve");
        C52711k.m112240b(bVar, "reject");
        this.f27740b.mo18404a(z, dVar, t, th, qVar, bVar);
    }
}
