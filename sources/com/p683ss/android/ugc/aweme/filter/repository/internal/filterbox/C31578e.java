package com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox;

import com.bytedance.jedi.p725a.p738h.C11680e;
import com.google.p1057b.p1058a.C17432q;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31591g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31482a;
import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import p064c.p065a.C1680ad;
import p064c.p065a.C1683ag;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p064c.p065a.p094l.C2187e;
import p2628d.C52668f;
import p2628d.p2629a.C52575l;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e */
public final class C31578e extends C11680e<C31482a> implements C31591g {

    /* renamed from: a */
    private final C52668f<FilterBoxApi> f82581a;

    /* renamed from: b */
    private final C31577d f82582b;

    /* renamed from: f */
    private final C17432q<C29252f> f82583f;

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$a */
    static final class C31579a<T> implements C1710e<BaseNetResponse> {

        /* renamed from: a */
        final /* synthetic */ C31578e f82584a;

        C31579a(C31578e eVar) {
            this.f82584a = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            BaseNetResponse baseNetResponse = (BaseNetResponse) obj;
            this.f82584a.mo64473c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$b */
    static final class C31580b<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C31580b f82585a = new C31580b();

        C31580b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseNetResponse baseNetResponse = (BaseNetResponse) obj;
            C52711k.m112240b(baseNetResponse, "it");
            return baseNetResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$c */
    static final class C31581c<T> implements C1710e<BaseNetResponse> {

        /* renamed from: a */
        final /* synthetic */ C31578e f82586a;

        C31581c(C31578e eVar) {
            this.f82586a = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            BaseNetResponse baseNetResponse = (BaseNetResponse) obj;
            this.f82586a.mo64473c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$d */
    static final class C31582d<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C31582d f82587a = new C31582d();

        C31582d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseNetResponse baseNetResponse = (BaseNetResponse) obj;
            C52711k.m112240b(baseNetResponse, "it");
            return baseNetResponse;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$e */
    static final class C31583e<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C31583e f82588a = new C31583e();

        /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$e$a */
        public static final class C31584a<T> implements Comparator<T> {

            /* renamed from: a */
            final /* synthetic */ EffectCategoryModel f82589a;

            public C31584a(EffectCategoryModel effectCategoryModel) {
                this.f82589a = effectCategoryModel;
            }

            public final int compare(T t, T t2) {
                Effect effect = (Effect) t;
                EffectCategoryModel effectCategoryModel = this.f82589a;
                C52711k.m112236a((Object) effectCategoryModel, "model");
                List effects = effectCategoryModel.getEffects();
                C52711k.m112236a((Object) effect, "it");
                Comparable valueOf = Integer.valueOf(effects.indexOf(effect.getEffectId()));
                Effect effect2 = (Effect) t2;
                EffectCategoryModel effectCategoryModel2 = this.f82589a;
                C52711k.m112236a((Object) effectCategoryModel2, "model");
                List effects2 = effectCategoryModel2.getEffects();
                C52711k.m112236a((Object) effect2, "it");
                return C52594a.m112153a(valueOf, Integer.valueOf(effects2.indexOf(effect2.getEffectId())));
            }
        }

        C31583e() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0051 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r10) {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.filter.repository.internal.filterbox.g r10 = (com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox.C31587g) r10
                java.lang.String r0 = "resp"
                p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.List r0 = (java.util.List) r0
                com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel r1 = r10.getData()
                java.lang.String r2 = "resp.data"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.util.List r1 = r1.getCategory()
                java.lang.String r2 = "resp.data.category"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.Iterator r1 = r1.iterator()
            L_0x0026:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00e2
                java.lang.Object r2 = r1.next()
                com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel r2 = (com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryModel) r2
                com.ss.android.ugc.effectmanager.effect.model.EffectChannelModel r3 = r10.getData()
                java.lang.String r4 = "resp.data"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.util.List r3 = r3.getEffects()
                java.lang.String r4 = "resp.data.effects"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Collection r4 = (java.util.Collection) r4
                java.util.Iterator r3 = r3.iterator()
            L_0x0051:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x0080
                java.lang.Object r5 = r3.next()
                r6 = r5
                com.ss.android.ugc.effectmanager.effect.model.Effect r6 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r6
                boolean r7 = r6 instanceof com.p683ss.android.ugc.aweme.effectplatform.FilterEffect
                if (r7 == 0) goto L_0x0079
                java.lang.String r7 = "model"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r7)
                java.util.List r7 = r2.getEffects()
                com.ss.android.ugc.aweme.effectplatform.FilterEffect r6 = (com.p683ss.android.ugc.aweme.effectplatform.FilterEffect) r6
                java.lang.String r6 = r6.getEffectId()
                boolean r6 = r7.contains(r6)
                if (r6 == 0) goto L_0x0079
                r6 = 1
                goto L_0x007a
            L_0x0079:
                r6 = 0
            L_0x007a:
                if (r6 == 0) goto L_0x0051
                r4.add(r5)
                goto L_0x0051
            L_0x0080:
                java.util.List r4 = (java.util.List) r4
                java.lang.Iterable r4 = (java.lang.Iterable) r4
                com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$e$a r3 = new com.ss.android.ugc.aweme.filter.repository.internal.filterbox.e$e$a
                r3.<init>(r2)
                java.util.Comparator r3 = (java.util.Comparator) r3
                java.util.List r3 = p2628d.p2629a.C52575l.m112122a(r4, r3)
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                java.util.ArrayList r4 = new java.util.ArrayList
                r5 = 10
                int r5 = p2628d.p2629a.C52575l.m112104a(r3, r5)
                r4.<init>(r5)
                java.util.Collection r4 = (java.util.Collection) r4
                java.util.Iterator r3 = r3.iterator()
            L_0x00a2:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L_0x00d7
                java.lang.Object r5 = r3.next()
                com.ss.android.ugc.effectmanager.effect.model.Effect r5 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r5
                if (r5 == 0) goto L_0x00cf
                com.ss.android.ugc.aweme.effectplatform.FilterEffect r5 = (com.p683ss.android.ugc.aweme.effectplatform.FilterEffect) r5
                java.lang.String r6 = "filterEffect"
                p2628d.p2639f.p2641b.C52711k.m112240b(r5, r6)
                com.ss.android.ugc.aweme.filter.repository.a.b r6 = new com.ss.android.ugc.aweme.filter.repository.a.b
                r7 = r5
                com.ss.android.ugc.effectmanager.effect.model.Effect r7 = (com.p683ss.android.ugc.effectmanager.effect.model.Effect) r7
                com.ss.android.ugc.aweme.filter.repository.a.f r7 = com.p683ss.android.ugc.aweme.filter.repository.internal.p1749b.C31547a.m73407a(r7)
                boolean r8 = r5.getChecked()
                boolean r5 = r5.getBuildIn()
                r6.<init>(r7, r8, r5)
                r4.add(r6)
                goto L_0x00a2
            L_0x00cf:
                d.u r10 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.effectplatform.FilterEffect"
                r10.<init>(r0)
                throw r10
            L_0x00d7:
                java.util.List r4 = (java.util.List) r4
                d.n r2 = p2628d.C52856t.m112465a(r2, r4)
                r0.add(r2)
                goto L_0x0026
            L_0x00e2:
                r10 = r0
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Collection r1 = (java.util.Collection) r1
                java.util.Iterator r10 = r10.iterator()
            L_0x00f0:
                boolean r2 = r10.hasNext()
                if (r2 == 0) goto L_0x0108
                java.lang.Object r2 = r10.next()
                d.n r2 = (p2628d.C52847n) r2
                java.lang.Object r2 = r2.getSecond()
                java.util.List r2 = (java.util.List) r2
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                p2628d.p2629a.C52575l.m112108a(r1, r2)
                goto L_0x00f0
            L_0x0108:
                java.util.List r1 = (java.util.List) r1
                com.ss.android.ugc.aweme.filter.repository.a.a r10 = new com.ss.android.ugc.aweme.filter.repository.a.a
                r10.<init>(r1, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.filter.repository.internal.filterbox.C31578e.C31583e.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: c */
    public final void mo64473c() {
        ((C29252f) this.f82583f.get()).mo59138a((String) this.f82582b.f82577e.get(), false, C31585f.f82590a);
    }

    /* renamed from: b */
    public final C2201v<C31482a> mo22471b() {
        FilterBoxApi filterBoxApi = (FilterBoxApi) this.f82581a.getValue();
        Object obj = this.f82582b.f82580h.get();
        C52711k.m112236a(obj, "effectParams.effectAccessKeyProvider.get()");
        String str = (String) obj;
        Object obj2 = this.f82582b.f82578f.get();
        C52711k.m112236a(obj2, "effectParams.effectSdkVersionProvider.get()");
        String str2 = (String) obj2;
        Object obj3 = this.f82582b.f82576d.get();
        C52711k.m112236a(obj3, "effectParams.appVersionProvider.get()");
        String str3 = (String) obj3;
        Object obj4 = this.f82582b.f82575c.get();
        C52711k.m112236a(obj4, "effectParams.regionProvider.get()");
        String str4 = (String) obj4;
        Object obj5 = this.f82582b.f82577e.get();
        C52711k.m112236a(obj5, "effectParams.panelProvider.get()");
        C2201v<C31482a> c = filterBoxApi.listFilterBox(str, str2, str3, str4, (String) obj5).mo6157b((C1711f<? super T, ? extends R>) C31583e.f82588a).mo6161c();
        C52711k.m112236a((Object) c, "filterBoxApi.value.listF…         }.toObservable()");
        return c;
    }

    /* renamed from: a */
    public final C1680ad<Object> mo64471a(Set<Integer> set) {
        C52711k.m112240b(set, "filterIdSet");
        if (set.isEmpty()) {
            C1680ad<Object> a = C1680ad.m5960a((C2206z<? extends T>) C2201v.m6610b());
            C52711k.m112236a((Object) a, "Single.fromObservable(Observable.empty<Any>())");
            return a;
        }
        C2187e d = C2187e.m6550d();
        C52711k.m112236a((Object) d, "SingleSubject.create<Any>()");
        ((FilterBoxApi) this.f82581a.getValue()).updateFilterBox(m73441a(set, C31590j.INSERT)).mo6156b((C1710e<? super T>) new C31579a<Object>(this)).mo6157b((C1711f<? super T, ? extends R>) C31580b.f82585a).mo6155b(C2168a.m6521b()).mo6159b((C1683ag<? super T>) d);
        C1680ad<Object> a2 = d.mo6147a();
        C52711k.m112236a((Object) a2, "subject.hide()");
        return a2;
    }

    /* renamed from: b */
    public final C1680ad<Object> mo64472b(Set<Integer> set) {
        C52711k.m112240b(set, "filterIdSet");
        if (set.isEmpty()) {
            C1680ad<Object> a = C1680ad.m5960a((C2206z<? extends T>) C2201v.m6610b());
            C52711k.m112236a((Object) a, "Single.fromObservable(Observable.empty<Any>())");
            return a;
        }
        C2187e d = C2187e.m6550d();
        C52711k.m112236a((Object) d, "SingleSubject.create<Any>()");
        ((FilterBoxApi) this.f82581a.getValue()).updateFilterBox(m73441a(set, C31590j.REMOVE)).mo6156b((C1710e<? super T>) new C31581c<Object>(this)).mo6157b((C1711f<? super T, ? extends R>) C31582d.f82587a).mo6155b(C2168a.m6521b()).mo6159b((C1683ag<? super T>) d);
        C1680ad<Object> a2 = d.mo6147a();
        C52711k.m112236a((Object) a2, "subject.hide()");
        return a2;
    }

    /* renamed from: a */
    private final C31589i m73441a(Set<Integer> set, C31590j jVar) {
        String a = C52575l.m112120a(set, ",", null, null, 0, null, null, 62, null);
        int a2 = jVar.mo64475a();
        Object obj = this.f82582b.f82573a.get();
        C52711k.m112236a(obj, "effectParams.deviceIdProvider.get()");
        String str = (String) obj;
        Object obj2 = this.f82582b.f82574b.get();
        C52711k.m112236a(obj2, "effectParams.appIdProvider.get()");
        int parseInt = Integer.parseInt((String) obj2);
        Object obj3 = this.f82582b.f82577e.get();
        C52711k.m112236a(obj3, "effectParams.panelProvider.get()");
        String str2 = (String) obj3;
        Object obj4 = this.f82582b.f82578f.get();
        C52711k.m112236a(obj4, "effectParams.effectSdkVersionProvider.get()");
        String str3 = (String) obj4;
        Object obj5 = this.f82582b.f82579g.get();
        C52711k.m112236a(obj5, "effectParams.effectChannelProvider.get()");
        String str4 = (String) obj5;
        Object obj6 = this.f82582b.f82575c.get();
        C52711k.m112236a(obj6, "effectParams.regionProvider.get()");
        String str5 = (String) obj6;
        Object obj7 = this.f82582b.f82580h.get();
        C52711k.m112236a(obj7, "effectParams.effectAccessKeyProvider.get()");
        String str6 = (String) obj7;
        Object obj8 = this.f82582b.f82576d.get();
        C52711k.m112236a(obj8, "effectParams.appVersionProvider.get()");
        C31589i iVar = new C31589i(a, a2, str, parseInt, str2, str3, str4, str5, str6, (String) obj8);
        return iVar;
    }

    public C31578e(C52668f<? extends FilterBoxApi> fVar, C31577d dVar, C17432q<C29252f> qVar) {
        C52711k.m112240b(fVar, "filterBoxApi");
        C52711k.m112240b(dVar, "effectParams");
        C52711k.m112240b(qVar, "effectPlatform");
        this.f82581a = fVar;
        this.f82582b = dVar;
        this.f82583f = qVar;
    }
}
