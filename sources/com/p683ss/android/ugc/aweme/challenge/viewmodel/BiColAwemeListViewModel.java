package com.p683ss.android.ugc.aweme.challenge.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.challenge.api.C24550a;
import com.p683ss.android.ugc.aweme.challenge.p1498d.C24582b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel */
public final class BiColAwemeListViewModel extends JediViewModel<BiColAwemeListState> {

    /* renamed from: d */
    public boolean f65587d = true;

    /* renamed from: e */
    public final C24582b f65588e = new C24582b();

    /* renamed from: f */
    public final ListMiddleware<BiColAwemeListState, Object, C24786a> f65589f = new ListMiddleware<>(new C24775a(this), new C24777b(this), C24779c.f65596a, C24780d.f65597a);

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel$a */
    static final class C24775a extends C52712l implements C52671b<BiColAwemeListState, C2201v<C52847n<? extends List<? extends Object>, ? extends C24786a>>> {

        /* renamed from: a */
        final /* synthetic */ BiColAwemeListViewModel f65590a;

        C24775a(BiColAwemeListViewModel biColAwemeListViewModel) {
            this.f65590a = biColAwemeListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final BiColAwemeListState biColAwemeListState = (BiColAwemeListState) obj;
            C52711k.m112240b(biColAwemeListState, "state");
            this.f65590a.f65587d = true;
            C2201v d = C24582b.m60001a(this.f65590a.f65588e, biColAwemeListState.getChId(), 0, 0, biColAwemeListState.isHashTag(), 6, null).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C24775a f65591a;

                {
                    this.f65591a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    C24550a aVar = (C24550a) obj;
                    C52711k.m112240b(aVar, "it");
                    List<Aweme> list = aVar.f65002d;
                    if (list == null) {
                        list = C52575l.m112097a();
                    }
                    boolean z = aVar.f65000b;
                    int i2 = aVar.f64999a;
                    int i3 = 1;
                    if (!this.f65591a.f65590a.f65587d) {
                        i3 = 1 + ((C24786a) biColAwemeListState.getListState().getPayload()).f65607c;
                    }
                    List<Aweme> list2 = aVar.f65002d;
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    return C52856t.m112465a(list, new C24786a(z, i2, i3, i));
                }
            });
            C52711k.m112236a((Object) d, "mRepo.getAwemeList(chid …                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel$b */
    static final class C24777b extends C52712l implements C52671b<BiColAwemeListState, C2201v<C52847n<? extends List<? extends Object>, ? extends C24786a>>> {

        /* renamed from: a */
        final /* synthetic */ BiColAwemeListViewModel f65593a;

        C24777b(BiColAwemeListViewModel biColAwemeListViewModel) {
            this.f65593a = biColAwemeListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final BiColAwemeListState biColAwemeListState = (BiColAwemeListState) obj;
            C52711k.m112240b(biColAwemeListState, "state");
            this.f65593a.f65587d = false;
            C2201v d = C24582b.m60001a(this.f65593a.f65588e, biColAwemeListState.getChId(), (long) ((C24786a) biColAwemeListState.getListState().getPayload()).f31450b, 0, biColAwemeListState.isHashTag(), 4, null).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C24777b f65594a;

                {
                    this.f65594a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    C24550a aVar = (C24550a) obj;
                    C52711k.m112240b(aVar, "it");
                    List<Aweme> list = aVar.f65002d;
                    if (list == null) {
                        list = C52575l.m112097a();
                    }
                    boolean z = aVar.f65000b;
                    int i2 = aVar.f64999a;
                    int i3 = 1;
                    if (!this.f65594a.f65593a.f65587d) {
                        i3 = 1 + ((C24786a) biColAwemeListState.getListState().getPayload()).f65607c;
                    }
                    List<Aweme> list2 = aVar.f65002d;
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    return C52856t.m112465a(list, new C24786a(z, i2, i3, i));
                }
            });
            C52711k.m112236a((Object) d, "mRepo.getAwemeList(chid …                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel$c */
    static final class C24779c extends C52712l implements C52682m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C24779c f65596a = new C24779c();

        C24779c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((List) obj, "list");
            C52711k.m112240b(list, "refresh");
            return C52575l.m112143g((Iterable<? extends T>) list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel$d */
    static final class C24780d extends C52712l implements C52682m<List<? extends Object>, List<? extends Object>, List<? extends Object>> {

        /* renamed from: a */
        public static final C24780d f65597a = new C24780d();

        C24780d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj;
            List list2 = (List) obj2;
            C52711k.m112240b(list, "list");
            C52711k.m112240b(list2, "loadMore");
            return C52575l.m112143g((Iterable<? extends T>) C52575l.m112133c(list, list2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel$e */
    static final class C24781e extends C52712l implements C52671b<BiColAwemeListState, C52860x> {

        /* renamed from: a */
        public static final C24781e f65598a = new C24781e();

        C24781e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            BiColAwemeListState biColAwemeListState = (BiColAwemeListState) obj;
            C52711k.m112240b(biColAwemeListState, "it");
            biColAwemeListState.getListState().getList();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel$f */
    static final class C24782f extends C52712l implements C52682m<BiColAwemeListState, ListState<Object, C24786a>, BiColAwemeListState> {

        /* renamed from: a */
        public static final C24782f f65599a = new C24782f();

        C24782f() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            BiColAwemeListState biColAwemeListState = (BiColAwemeListState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(biColAwemeListState, "$receiver");
            C52711k.m112240b(listState, "it");
            return BiColAwemeListState.copy$default(biColAwemeListState, null, false, listState, 3, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        BiColAwemeListState biColAwemeListState = new BiColAwemeListState(null, false, null, 7, null);
        return biColAwemeListState;
    }

    public final void onCleared() {
        super.onCleared();
        mo22527b(C24781e.f65598a);
        this.f65588e.aZ_();
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        ListMiddleware<BiColAwemeListState, Object, C24786a> listMiddleware = this.f65589f;
        listMiddleware.mo22635a(C24787b.f65609a, (C52682m<? super S, ? super PROP, ? extends S>) C24782f.f65599a);
        mo22525a(listMiddleware);
        this.f65589f.mo22565b();
    }
}
