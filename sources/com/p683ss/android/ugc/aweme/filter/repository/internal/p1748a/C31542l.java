package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import com.bytedance.jedi.p725a.p738h.C11680e;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31502a;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31592h;
import com.p683ss.android.ugc.aweme.filter.repository.internal.p1749b.C31547a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31490c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p081d.C1994h;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p094l.C2178a;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.l */
public final class C31542l extends C11680e<C31502a> implements C31592h {

    /* renamed from: a */
    final C17432q<C29252f> f82498a;

    /* renamed from: b */
    final C17432q<String> f82499b;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.l$a */
    static final class C31543a<V> implements Callable<C2206z<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ C31542l f82500a;

        C31543a(C31542l lVar) {
            this.f82500a = lVar;
        }

        public final /* synthetic */ Object call() {
            C31542l lVar = this.f82500a;
            C2178a l = C2178a.m6527l();
            C52711k.m112236a((Object) l, "BehaviorSubject.create<FilterDataResponse>()");
            ((C29252f) lVar.f82498a.get()).mo59143b((String) lVar.f82499b.get(), false, (C48702g) new C31544b(l));
            C2201v e = l.mo6542e();
            C52711k.m112236a((Object) e, "subject.hide()");
            return e;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.l$b */
    public static final class C31544b implements C48702g {

        /* renamed from: a */
        final /* synthetic */ C2178a f82501a;

        C31544b(C2178a aVar) {
            this.f82501a = aVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
            if (r1 != null) goto L_0x0032;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo8637a(com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d r5) {
            /*
                r4 = this;
                if (r5 == 0) goto L_0x0009
                java.lang.Exception r0 = r5.f122281c
                if (r0 == 0) goto L_0x0009
                com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a.m43754b(r0)
            L_0x0009:
                c.a.l.a r0 = r4.f82501a
                if (r5 == 0) goto L_0x0012
                java.lang.Exception r1 = r5.f122281c
                if (r1 == 0) goto L_0x0012
                goto L_0x0032
            L_0x0012:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "failed on fetch remove filters, msg : "
                r2.<init>(r3)
                r2.append(r5)
                java.lang.String r3 = "?.msg, code : "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r5 = "?.errorCode"
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                r1.<init>(r5)
            L_0x0032:
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.onError(r1)
                c.a.l.a r5 = r4.f82501a
                r5.onComplete()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a.C31542l.C31544b.mo8637a(com.ss.android.ugc.effectmanager.common.g.d):void");
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            if (effectChannelResponse != null) {
                List categoryResponseList = effectChannelResponse.getCategoryResponseList();
                if (categoryResponseList != null) {
                    Iterable<EffectCategoryResponse> iterable = categoryResponseList;
                    Collection arrayList3 = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (EffectCategoryResponse effectCategoryResponse : iterable) {
                        C52711k.m112236a((Object) effectCategoryResponse, "response");
                        List totalEffects = effectCategoryResponse.getTotalEffects();
                        C52711k.m112236a((Object) totalEffects, "response.totalEffects");
                        Iterable<Effect> iterable2 = totalEffects;
                        Collection arrayList4 = new ArrayList(C52575l.m112104a(iterable2, 10));
                        for (Effect effect : iterable2) {
                            C52711k.m112236a((Object) effect, "it");
                            arrayList4.add(C31547a.m73407a(effect));
                        }
                        arrayList3.add(C52856t.m112465a(effectCategoryResponse, (List) arrayList4));
                    }
                    arrayList.addAll((List) arrayList3);
                    Iterable<C52847n> iterable3 = arrayList;
                    Collection arrayList5 = new ArrayList();
                    for (C52847n second : iterable3) {
                        C52575l.m112108a(arrayList5, (Iterable) (List) second.getSecond());
                    }
                    arrayList2.addAll((List) arrayList5);
                }
            }
            this.f82501a.onNext(new C31502a(new C31490c(arrayList2, arrayList), false, 2, null));
            this.f82501a.onComplete();
        }
    }

    /* renamed from: b */
    public final C2201v<C31502a> mo22471b() {
        Callable aVar = new C31543a(this);
        C1745b.m6050a(aVar, "supplier is null");
        C2201v<C31502a> a = C2150a.m6486a((C2201v<T>) new C1994h<T>(aVar));
        C52711k.m112236a((Object) a, "Observable.defer { requestEffectPlatform() }");
        return a;
    }

    public C31542l(C17432q<C29252f> qVar, C17432q<String> qVar2) {
        C52711k.m112240b(qVar, "effectPlatform");
        C52711k.m112240b(qVar2, "panelSupplier");
        this.f82498a = qVar;
        this.f82499b = qVar2;
    }
}
