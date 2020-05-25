package com.bytedance.jedi.arch.ext.list;

import com.bytedance.jedi.arch.ext.list.IListState;
import java.util.List;
import p064c.p065a.C2201v;
import p2628d.C52847n;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

public abstract class CommonListViewModel<T, S extends IListState<T, C11865l>> extends ListViewModel<T, C11865l, S> {

    /* renamed from: e */
    private final C52671b<S, C2201v<C52847n<List<T>, C11865l>>> f31345e;

    /* renamed from: com.bytedance.jedi.arch.ext.list.CommonListViewModel$a */
    static final class C11805a extends C52712l implements C52671b<S, C2201v<C52847n<? extends List<? extends T>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ C52671b f31346a;

        C11805a(C52671b bVar) {
            this.f31346a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IListState iListState = (IListState) obj;
            C52711k.m112240b(iListState, "state");
            return (C2201v) this.f31346a.invoke(iListState);
        }
    }

    /* renamed from: com.bytedance.jedi.arch.ext.list.CommonListViewModel$b */
    static final class C11806b extends C52712l implements C52671b<S, C2201v<C52847n<? extends List<? extends T>, ? extends C11865l>>> {

        /* renamed from: a */
        final /* synthetic */ CommonListViewModel f31347a;

        C11806b(CommonListViewModel commonListViewModel) {
            this.f31347a = commonListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IListState iListState = (IListState) obj;
            C52711k.m112240b(iListState, "state");
            return (C2201v) this.f31347a.mo22556e().invoke(iListState);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract C52671b<S, C2201v<C52847n<List<T>, C11865l>>> mo22556e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C52671b<S, C2201v<C52847n<List<T>, C11865l>>> mo22557f() {
        return this.f31345e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final C52671b<S, C2201v<C52847n<List<T>, C11865l>>> mo22558g() {
        return new C11806b<>(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C52671b<S, C2201v<C52847n<List<T>, C11865l>>> mo22559h() {
        C52671b f = mo22557f();
        if (f != null) {
            return new C11805a<>(f);
        }
        return null;
    }
}
