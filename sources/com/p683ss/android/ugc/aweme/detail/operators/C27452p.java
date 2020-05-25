package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.ext.list.C11837a;
import com.bytedance.jedi.arch.ext.list.C11837a.C11838a;
import com.bytedance.jedi.arch.ext.list.C11853b;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.p744a.C11841b;
import com.bytedance.widget.C13376b;
import com.bytedance.widget.C13376b.C13378a;
import com.bytedance.widget.Widget;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.jedi.p1653a.C28242a;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28291c;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.C28294f;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchJediViewModel;
import com.p683ss.android.ugc.aweme.discover.jedi.viewmodel.SearchState;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28333l;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.p */
public final class C27452p implements C27419al {

    /* renamed from: a */
    public boolean f72225a;

    /* renamed from: b */
    public final SearchJediViewModel f72226b;

    /* renamed from: c */
    private C11872h f72227c;

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$a */
    public static final class C27453a extends C52712l implements C52671b<C11866f, C52860x> {
        public static final C27453a INSTANCE = new C27453a();

        public C27453a() {
            super(1);
        }

        public final void invoke(C11866f fVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$b */
    public static final class C27454b extends C52712l implements C52682m<C11866f, Throwable, C52860x> {
        public static final C27454b INSTANCE = new C27454b();

        public C27454b() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C11866f) obj, (Throwable) obj2);
            return C52860x.f131107a;
        }

        public final void invoke(C11866f fVar, Throwable th) {
            C52711k.m112240b(th, "it");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$c */
    public static final class C27455c implements C11854c<C28333l, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f72228a;

        /* renamed from: b */
        final /* synthetic */ C52682m f72229b;

        /* renamed from: c */
        final /* synthetic */ C52682m f72230c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f72231d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f72232e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends C28333l>, C52860x> f72233f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f72231d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f72232e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends C28333l>, C52860x> mo22603c() {
            return this.f72233f;
        }

        public C27455c(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f72228a = bVar;
            this.f72229b = mVar;
            this.f72230c = mVar2;
            this.f72231d = bVar;
            this.f72232e = mVar;
            this.f72233f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$d */
    public static final class C27456d implements C11854c<C28333l, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f72234a;

        /* renamed from: b */
        final /* synthetic */ C52682m f72235b;

        /* renamed from: c */
        final /* synthetic */ C52682m f72236c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f72237d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f72238e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends C28333l>, C52860x> f72239f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f72237d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f72238e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends C28333l>, C52860x> mo22603c() {
            return this.f72239f;
        }

        public C27456d(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f72234a = bVar;
            this.f72235b = mVar;
            this.f72236c = mVar2;
            this.f72237d = bVar;
            this.f72238e = mVar;
            this.f72239f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$e */
    public static final class C27457e implements C11837a<C28333l> {

        /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$e$a */
        public static final class C27458a extends C1322a<C1352v> {

            /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$e$a$a */
            public static final class C27459a extends C1352v {

                /* renamed from: a */
                final /* synthetic */ ViewGroup f72240a;

                C27459a(ViewGroup viewGroup, View view) {
                    this.f72240a = viewGroup;
                    super(view);
                }
            }

            C27458a() {
            }

            public final int getItemCount() {
                return 0;
            }

            public final void onBindViewHolder(C1352v vVar, int i) {
                C52711k.m112240b(vVar, "p0");
            }

            public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
                C52711k.m112240b(viewGroup, "p0");
                return new C27459a(viewGroup, new View(viewGroup.getContext()));
            }
        }

        C27457e() {
        }

        /* renamed from: a */
        public final void mo22590a(List<? extends C28333l> list, C52670a<C52860x> aVar) {
            C52711k.m112240b(list, "list");
        }

        public final C11841b<C28333l> aH_() {
            C11841b bVar = new C11841b(new C27458a(), new C28242a(), null, 4, null);
            return bVar;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo22589a(int i, boolean z) {
            return (C28333l) C11838a.m24186a((C11837a<T>) this, i, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$f */
    static final class C27460f extends C52712l implements C52682m<C11866f, List<? extends C28333l>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C27452p f72241a;

        /* renamed from: b */
        final /* synthetic */ C26877c f72242b;

        C27460f(C27452p pVar, C26877c cVar) {
            this.f72241a = pVar;
            this.f72242b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "list");
            fVar.mo22552a(this.f72241a.f72226b, new C52671b<SearchState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C27460f f72243a;

                {
                    this.f72243a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    boolean z;
                    SearchState searchState = (SearchState) obj;
                    C52711k.m112240b(searchState, "it");
                    C11853b bVar = ((C28294f) searchState.getListState().getPayload()).f31449a;
                    Iterable list = searchState.getListState().getList();
                    Collection arrayList = new ArrayList();
                    for (Object next : list) {
                        if (((C28333l) next).getFeedType() == 65280) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<C28333l> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (C28333l aweme : iterable) {
                        arrayList2.add(aweme.getAweme());
                    }
                    this.f72243a.f72242b.mo47018a((List) arrayList2, bVar.f31440a);
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$g */
    static final class C27462g extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C27452p f72244a;

        /* renamed from: b */
        final /* synthetic */ C26877c f72245b;

        C27462g(C27452p pVar, C26877c cVar) {
            this.f72244a = pVar;
            this.f72245b = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            this.f72245b.mo47031e();
            this.f72244a.f72225a = true;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$h */
    static final class C27463h extends C52712l implements C52682m<C11866f, List<? extends C28333l>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C27452p f72246a;

        /* renamed from: b */
        final /* synthetic */ C26877c f72247b;

        C27463h(C27452p pVar, C26877c cVar) {
            this.f72246a = pVar;
            this.f72247b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "list");
            SearchJediViewModel searchJediViewModel = this.f72246a.f72226b;
            if (searchJediViewModel == null) {
                C52711k.m112234a();
            }
            fVar.mo22552a(searchJediViewModel, new C52671b<SearchState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C27463h f72248a;

                {
                    this.f72248a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    boolean z;
                    SearchState searchState = (SearchState) obj;
                    C52711k.m112240b(searchState, "it");
                    C11853b bVar = ((C28294f) searchState.getListState().getPayload()).f31449a;
                    Iterable list = searchState.getListState().getList();
                    Collection arrayList = new ArrayList();
                    for (Object next : list) {
                        if (((C28333l) next).getFeedType() == 65280) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    Iterable<C28333l> iterable = (List) arrayList;
                    Collection arrayList2 = new ArrayList(C52575l.m112104a(iterable, 10));
                    for (C28333l aweme : iterable) {
                        arrayList2.add(aweme.getAweme());
                    }
                    this.f72248a.f72247b.mo47026b((List) arrayList2, bVar.f31440a);
                    return C52860x.f131107a;
                }
            });
            this.f72246a.f72225a = false;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.p$i */
    static final class C27465i extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C27452p f72249a;

        /* renamed from: b */
        final /* synthetic */ C26877c f72250b;

        C27465i(C27452p pVar, C26877c cVar) {
            this.f72249a = pVar;
            this.f72250b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "throwable");
            this.f72250b.mo47028c(new Exception(th));
            this.f72249a.f72225a = false;
            return C52860x.f131107a;
        }
    }

    public final boolean cannotLoadLatest() {
        return false;
    }

    public final boolean cannotLoadMore() {
        return false;
    }

    public final boolean deleteItem(String str) {
        C52711k.m112240b(str, "aid");
        return false;
    }

    public final int getPageType(int i) {
        return 9;
    }

    public final Object getViewModel() {
        return this.f72226b;
    }

    public final boolean isDataEmpty() {
        return false;
    }

    public final boolean isLoading() {
        return this.f72225a;
    }

    public final void unInit() {
    }

    public C27452p(SearchJediViewModel searchJediViewModel) {
        this.f72226b = searchJediViewModel;
    }

    public final boolean init(Fragment fragment) {
        C52711k.m112240b(fragment, "owner");
        if (this.f72226b == null) {
            return false;
        }
        this.f72227c = new JediWidget();
        C13378a aVar = C13376b.f34879h;
        View view = fragment.getView();
        if (view == null) {
            C52711k.m112234a();
        }
        C13376b a = aVar.mo25076a(fragment, view);
        C11872h hVar = this.f72227c;
        if (hVar == null) {
            C52711k.m112237a("jediView");
        }
        if (hVar != null) {
            a.mo25074a((Widget) hVar);
            return true;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.widget.Widget");
    }

    public final void bindView(C27424ao aoVar) {
        C52711k.m112240b(aoVar, "panel");
        C26877c cVar = aoVar;
        SearchJediViewModel searchJediViewModel = this.f72226b;
        if (searchJediViewModel == null) {
            C52711k.m112234a();
        }
        C11872h hVar = this.f72227c;
        if (hVar == null) {
            C52711k.m112237a("jediView");
        }
        C28291c.m67205a(searchJediViewModel, hVar, new C27457e(), new C27455c(C27453a.INSTANCE, C27454b.INSTANCE, new C27460f(this, cVar)), new C27456d(new C27462g(this, cVar), new C27465i(this, cVar), new C27463h(this, cVar)), null);
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        if (i == 1) {
            SearchJediViewModel searchJediViewModel = this.f72226b;
            if (searchJediViewModel == null) {
                C52711k.m112234a();
            }
            searchJediViewModel.mo56673e();
        } else if (i == 4) {
            SearchJediViewModel searchJediViewModel2 = this.f72226b;
            if (searchJediViewModel2 == null) {
                C52711k.m112234a();
            }
            searchJediViewModel2.mo56674f();
        }
    }
}
