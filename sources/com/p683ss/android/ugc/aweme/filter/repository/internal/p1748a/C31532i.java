package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.LiveData;
import com.bytedance.jedi.arch.C11939z;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31593i;
import com.p683ss.android.ugc.aweme.filter.repository.internal.p1749b.C31547a;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31490c;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31491d;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31493f;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31494g;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.tools.p2354c.C46936c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p064c.p065a.C2201v;
import p064c.p065a.C2206z;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52847n;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.i */
public final class C31532i implements C31593i {

    /* renamed from: a */
    final C0198r<List<C31459g>> f82480a = new C0198r<>();

    /* renamed from: b */
    final C0198r<List<EffectCategoryResponse>> f82481b = new C0198r<>();

    /* renamed from: c */
    final C0198r<List<C52847n<EffectCategoryResponse, List<C31459g>>>> f82482c = new C0198r<>();

    /* renamed from: d */
    final C0198r<Map<String, Effect>> f82483d = new C0198r<>();

    /* renamed from: e */
    final C0198r<List<C31459g>> f82484e = new C0198r<>();

    /* renamed from: f */
    public final Map<Integer, C31491d> f82485f = new LinkedHashMap();

    /* renamed from: g */
    public final List<C11939z<C31493f, C31491d, C31459g>> f82486g = new ArrayList();

    /* renamed from: h */
    private C1689b f82487h = new C1689b();

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.i$a */
    static final class C31533a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C31532i f82488a;

        /* renamed from: b */
        final /* synthetic */ C31490c f82489b;

        C31533a(C31532i iVar, C31490c cVar) {
            this.f82488a = iVar;
            this.f82489b = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C31545m call() {
            boolean z;
            Object obj;
            C31459g gVar;
            boolean z2;
            List arrayList = new ArrayList();
            synchronized (this.f82488a) {
                List<C11939z<C31493f, C31491d, C31459g>> list = this.f82488a.f82486g;
                for (C31493f fVar : this.f82489b.f82395a) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((C31493f) ((C11939z) obj).f31624a).f82404a == fVar.f82404a) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (z2) {
                            break;
                        }
                    }
                    C11939z zVar = (C11939z) obj;
                    C31491d dVar = (C31491d) this.f82488a.f82485f.get(Integer.valueOf(fVar.f82404a));
                    if (dVar == null) {
                        dVar = C31547a.m73406a(fVar.f82404a);
                    }
                    if (zVar != null) {
                        gVar = (C31459g) zVar.f31626c;
                        if (gVar != null) {
                            C52711k.m112240b(fVar, "filterMeta");
                            C52711k.m112240b(gVar, "filterBean");
                            gVar.f82324a = fVar.f82404a;
                            gVar.f82325b = fVar.f82405b;
                            gVar.f82326c = fVar.f82406c;
                            gVar.f82327d = fVar.f82407d;
                            gVar.f82333j = fVar.f82408e;
                            gVar.f82329f = fVar.f82409f;
                            C31547a.m73409a(dVar, gVar);
                            arrayList.add(new C11939z(fVar, dVar, gVar));
                        }
                    }
                    gVar = new C31459g();
                    C52711k.m112240b(fVar, "filterMeta");
                    C52711k.m112240b(gVar, "filterBean");
                    gVar.f82324a = fVar.f82404a;
                    gVar.f82325b = fVar.f82405b;
                    gVar.f82326c = fVar.f82406c;
                    gVar.f82327d = fVar.f82407d;
                    gVar.f82333j = fVar.f82408e;
                    gVar.f82329f = fVar.f82409f;
                    C31547a.m73409a(dVar, gVar);
                    arrayList.add(new C11939z(fVar, dVar, gVar));
                }
                this.f82488a.f82486g.clear();
                this.f82488a.f82486g.addAll(arrayList);
            }
            Iterable<C11939z> iterable = arrayList;
            Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
            for (C11939z zVar2 : iterable) {
                arrayList2.add((C31459g) zVar2.f31626c);
            }
            List list2 = (List) arrayList2;
            Collection arrayList3 = new ArrayList();
            for (Object next : iterable) {
                if (((C31491d) ((C11939z) next).f31625b).f82398b == C31494g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList3.add(next);
                }
            }
            Iterable<C11939z> iterable2 = (List) arrayList3;
            Collection arrayList4 = new ArrayList(C52575l.m112104a(iterable2, 10));
            for (C11939z zVar3 : iterable2) {
                arrayList4.add((C31459g) zVar3.f31626c);
            }
            List list3 = (List) arrayList4;
            List a = C31539j.m73400a(this.f82489b.f82396b, list2);
            Iterable<C52847n> iterable3 = this.f82489b.f82396b;
            Collection arrayList5 = new ArrayList(C52575l.m112104a(iterable3, 10));
            for (C52847n first : iterable3) {
                arrayList5.add((EffectCategoryResponse) first.getFirst());
            }
            List list4 = (List) arrayList5;
            C31545m mVar = new C31545m(list2, list4, a, C31539j.m73401a(list4), list3);
            return mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.i$b */
    static final class C31534b<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C31532i f82490a;

        /* renamed from: b */
        final /* synthetic */ Map f82491b;

        C31534b(C31532i iVar, Map map) {
            this.f82490a = iVar;
            this.f82491b = map;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public List<C31459g> call() {
            List list;
            boolean z;
            synchronized (this.f82490a) {
                Iterable<C11939z> iterable = this.f82490a.f82486g;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (C11939z zVar : iterable) {
                    C31491d dVar = (C31491d) this.f82491b.get(Integer.valueOf(((C31493f) zVar.f31624a).f82404a));
                    if (dVar == null) {
                        dVar = C31547a.m73406a(((C31493f) zVar.f31624a).f82404a);
                    }
                    A a = zVar.f31624a;
                    C c = zVar.f31626c;
                    C31547a.m73409a(dVar, (C31459g) c);
                    arrayList.add(new C11939z(a, dVar, c));
                }
                list = (List) arrayList;
                this.f82490a.f82486g.clear();
                this.f82490a.f82486g.addAll(list);
                this.f82490a.f82485f.clear();
                this.f82490a.f82485f.putAll(this.f82491b);
            }
            List<C31459g> arrayList2 = new ArrayList<>();
            Iterable iterable2 = list;
            Collection arrayList3 = new ArrayList();
            for (Object next : iterable2) {
                if (((C31491d) ((C11939z) next).f31625b).f82398b == C31494g.FILTER_STATE_DOWNLOAD_SUCCESS) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList3.add(next);
                }
            }
            Iterable<C11939z> iterable3 = (List) arrayList3;
            Collection arrayList4 = new ArrayList(C52575l.m112104a(iterable3, 10));
            for (C11939z zVar2 : iterable3) {
                arrayList4.add((C31459g) zVar2.f31626c);
            }
            arrayList2.addAll((List) arrayList4);
            return arrayList2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.i$c */
    static final class C31535c<T, R> implements C1711f<T, C2206z<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C31532i f82492a;

        C31535c(C31532i iVar) {
            this.f82492a = iVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C31490c cVar = (C31490c) obj;
            C52711k.m112240b(cVar, "it");
            C2201v a = C2201v.m6607a((Callable<? extends T>) new C31533a<Object>(this.f82492a, cVar));
            C52711k.m112236a((Object) a, "Observable.fromCallable …vailableFilterList)\n    }");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.i$d */
    static final class C31536d<T> implements C1710e<C31545m> {

        /* renamed from: a */
        final /* synthetic */ C31532i f82493a;

        C31536d(C31532i iVar) {
            this.f82493a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C31545m mVar = (C31545m) obj;
            C31532i iVar = this.f82493a;
            C52711k.m112236a((Object) mVar, "it");
            iVar.f82480a.setValue(mVar.f82502a);
            iVar.f82482c.setValue(mVar.f82504c);
            iVar.f82484e.setValue(mVar.f82506e);
            iVar.f82481b.setValue(mVar.f82503b);
            iVar.f82483d.setValue(mVar.f82505d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.i$e */
    static final class C31537e<T, R> implements C1711f<T, C2206z<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C31532i f82494a;

        C31537e(C31532i iVar) {
            this.f82494a = iVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            C52711k.m112240b(map, "it");
            C2201v a = C2201v.m6607a((Callable<? extends T>) new C31534b<Object>(this.f82494a, map));
            C52711k.m112236a((Object) a, "Observable.fromCallable …{ it.c })\n        }\n    }");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.i$f */
    static final class C31538f<T> implements C1710e<List<? extends C31459g>> {

        /* renamed from: a */
        final /* synthetic */ C31532i f82495a;

        C31538f(C31532i iVar) {
            this.f82495a = iVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            List list = (List) obj;
            C31532i iVar = this.f82495a;
            C52711k.m112236a((Object) list, "it");
            iVar.f82484e.setValue(list);
        }
    }

    /* renamed from: a */
    public final LiveData<List<C31459g>> mo64418a() {
        return this.f82484e;
    }

    /* renamed from: b */
    public final LiveData<List<C52847n<EffectCategoryResponse, List<C31459g>>>> mo64419b() {
        return this.f82482c;
    }

    /* renamed from: c */
    public final LiveData<Map<String, Effect>> mo64420c() {
        return this.f82483d;
    }

    /* renamed from: d */
    private final C1689b m73393d() {
        C1689b bVar = new C1689b();
        synchronized (this) {
            this.f82487h.dispose();
            this.f82487h.mo6180a();
            this.f82487h = bVar;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo64442a(C31499l lVar) {
        C52711k.m112240b(lVar, "repository");
        C1689b d = m73393d();
        d.mo6181a(lVar.mo64412b().mo6529b(C2168a.m6521b()).mo6514a(C2168a.m6521b()).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C31535c<Object,Object>(this)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C31536d<Object>(this), C46936c.m101974a()));
        d.mo6181a(lVar.mo64413c().mo6529b(C2168a.m6521b()).mo6514a(C2168a.m6521b()).mo6520a((C1711f<? super T, ? extends C2206z<? extends R>>) new C31537e<Object,Object>(this)).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C31538f<Object>(this), C46936c.m101974a()));
    }
}
