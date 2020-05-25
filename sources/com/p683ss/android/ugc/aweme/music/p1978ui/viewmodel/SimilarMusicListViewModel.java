package com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1983e.C37608c;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel */
public final class SimilarMusicListViewModel extends JediViewModel<SimilarMusicListState> {

    /* renamed from: d */
    public boolean f96071d = true;

    /* renamed from: e */
    public final C37608c f96072e = new C37608c();

    /* renamed from: f */
    public final ListMiddleware<SimilarMusicListState, C37682d, C37679a> f96073f = new ListMiddleware<>(new C37672a(this), new C37674b(this), C37676c.f96080a, C37677d.f96081a);

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel$a */
    static final class C37672a extends C52712l implements C52671b<SimilarMusicListState, C2201v<C52847n<? extends List<? extends C37682d>, ? extends C37679a>>> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewModel f96074a;

        C37672a(SimilarMusicListViewModel similarMusicListViewModel) {
            this.f96074a = similarMusicListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final SimilarMusicListState similarMusicListState = (SimilarMusicListState) obj;
            C52711k.m112240b(similarMusicListState, "state");
            this.f96074a.f96071d = true;
            C2201v d = C37608c.m84054a(this.f96074a.f96072e, similarMusicListState.getMusicId(), 0, 0, 0, 14, null).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C37672a f96075a;

                {
                    this.f96075a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    C37680b bVar = (C37680b) obj;
                    C52711k.m112240b(bVar, "it");
                    List<C37682d> list = bVar.f96087c;
                    if (list == null) {
                        list = C52575l.m112097a();
                    }
                    boolean z = bVar.f96086b;
                    int i2 = bVar.f96085a;
                    int i3 = 1;
                    if (!this.f96075a.f96074a.f96071d) {
                        i3 = 1 + ((C37679a) similarMusicListState.getListState().getPayload()).f96083c;
                    }
                    List<C37682d> list2 = bVar.f96087c;
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    return C52856t.m112465a(list, new C37679a(z, i2, i3, i));
                }
            });
            C52711k.m112236a((Object) d, "mRepo.getRecommendMusicA…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel$b */
    static final class C37674b extends C52712l implements C52671b<SimilarMusicListState, C2201v<C52847n<? extends List<? extends C37682d>, ? extends C37679a>>> {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicListViewModel f96077a;

        C37674b(SimilarMusicListViewModel similarMusicListViewModel) {
            this.f96077a = similarMusicListViewModel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final SimilarMusicListState similarMusicListState = (SimilarMusicListState) obj;
            C52711k.m112240b(similarMusicListState, "state");
            this.f96077a.f96071d = false;
            C2201v d = C37608c.m84054a(this.f96077a.f96072e, similarMusicListState.getMusicId(), (long) ((C37679a) similarMusicListState.getListState().getPayload()).f31450b, 0, 0, 12, null).mo6541d((C1711f<? super T, ? extends R>) new C1711f<T, R>(this) {

                /* renamed from: a */
                final /* synthetic */ C37674b f96078a;

                {
                    this.f96078a = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    int i;
                    C37680b bVar = (C37680b) obj;
                    C52711k.m112240b(bVar, "it");
                    List<C37682d> list = bVar.f96087c;
                    if (list == null) {
                        list = C52575l.m112097a();
                    }
                    boolean z = bVar.f96086b;
                    int i2 = bVar.f96085a;
                    int i3 = 1;
                    if (!this.f96078a.f96077a.f96071d) {
                        i3 = 1 + ((C37679a) similarMusicListState.getListState().getPayload()).f96083c;
                    }
                    List<C37682d> list2 = bVar.f96087c;
                    if (list2 != null) {
                        i = list2.size();
                    } else {
                        i = 0;
                    }
                    return C52856t.m112465a(list, new C37679a(z, i2, i3, i));
                }
            });
            C52711k.m112236a((Object) d, "mRepo.getRecommendMusicA…                        }");
            return d;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel$c */
    static final class C37676c extends C52712l implements C52682m<List<? extends C37682d>, List<? extends C37682d>, List<? extends C37682d>> {

        /* renamed from: a */
        public static final C37676c f96080a = new C37676c();

        C37676c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            List list = (List) obj2;
            C52711k.m112240b((List) obj, "list");
            C52711k.m112240b(list, "refresh");
            return C52575l.m112143g((Iterable<? extends T>) list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel$d */
    static final class C37677d extends C52712l implements C52682m<List<? extends C37682d>, List<? extends C37682d>, List<? extends C37682d>> {

        /* renamed from: a */
        public static final C37677d f96081a = new C37677d();

        C37677d() {
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

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewmodel.SimilarMusicListViewModel$e */
    static final class C37678e extends C52712l implements C52682m<SimilarMusicListState, ListState<C37682d, C37679a>, SimilarMusicListState> {

        /* renamed from: a */
        public static final C37678e f96082a = new C37678e();

        C37678e() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            SimilarMusicListState similarMusicListState = (SimilarMusicListState) obj;
            ListState listState = (ListState) obj2;
            C52711k.m112240b(similarMusicListState, "$receiver");
            C52711k.m112240b(listState, "it");
            return SimilarMusicListState.copy$default(similarMusicListState, null, listState, 1, null);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ C11932s mo22529c() {
        return new SimilarMusicListState(null, null, 3, null);
    }

    public final void onCleared() {
        super.onCleared();
        this.f96072e.aZ_();
    }

    /* renamed from: d */
    public final void mo22532d() {
        super.mo22532d();
        ListMiddleware<SimilarMusicListState, C37682d, C37679a> listMiddleware = this.f96073f;
        listMiddleware.mo22635a(C37681c.f96089a, (C52682m<? super S, ? super PROP, ? extends S>) C37678e.f96082a);
        mo22525a(listMiddleware);
        this.f96073f.mo22565b();
    }

    /* renamed from: a */
    public final boolean mo77181a(boolean z, int i, int i2) {
        if (!z || i != 1 || i2 >= 10) {
            return false;
        }
        this.f96073f.mo22567c();
        return true;
    }
}
