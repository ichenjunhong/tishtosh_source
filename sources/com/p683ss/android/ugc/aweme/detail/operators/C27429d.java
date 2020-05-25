package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import android.view.View;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.ext.list.C11853b;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.widget.C13376b;
import com.bytedance.widget.C13376b.C13378a;
import com.bytedance.widget.Widget;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListState;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.BiColAwemeListViewModel;
import com.p683ss.android.ugc.aweme.challenge.viewmodel.C24786a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.d */
public final class C27429d implements C27419al {

    /* renamed from: a */
    public boolean f72188a;

    /* renamed from: b */
    public final BiColAwemeListViewModel f72189b;

    /* renamed from: c */
    private C11872h f72190c;

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.d$a */
    public static final class C27430a extends C52712l implements C52671b<C11866f, C52860x> {
        public static final C27430a INSTANCE = new C27430a();

        public C27430a() {
            super(1);
        }

        public final void invoke(C11866f fVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.d$b */
    public static final class C27431b extends C52712l implements C52682m<C11866f, Throwable, C52860x> {
        public static final C27431b INSTANCE = new C27431b();

        public C27431b() {
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

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.d$c */
    public static final class C27432c implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f72191a;

        /* renamed from: b */
        final /* synthetic */ C52682m f72192b;

        /* renamed from: c */
        final /* synthetic */ C52682m f72193c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f72194d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f72195e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f72196f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f72194d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f72195e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f72196f;
        }

        public C27432c(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f72191a = bVar;
            this.f72192b = mVar;
            this.f72193c = mVar2;
            this.f72194d = bVar;
            this.f72195e = mVar;
            this.f72196f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.d$d */
    public static final class C27433d implements C11854c<Object, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f72197a;

        /* renamed from: b */
        final /* synthetic */ C52682m f72198b;

        /* renamed from: c */
        final /* synthetic */ C52682m f72199c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f72200d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f72201e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Object>, C52860x> f72202f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f72200d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f72201e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Object>, C52860x> mo22603c() {
            return this.f72202f;
        }

        public C27433d(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f72197a = bVar;
            this.f72198b = mVar;
            this.f72199c = mVar2;
            this.f72200d = bVar;
            this.f72201e = mVar;
            this.f72202f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.d$e */
    static final class C27434e extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C27429d f72203a;

        /* renamed from: b */
        final /* synthetic */ C26877c f72204b;

        C27434e(C27429d dVar, C26877c cVar) {
            this.f72203a = dVar;
            this.f72204b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            fVar.mo22552a(this.f72203a.f72189b, new C52671b<BiColAwemeListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C27434e f72205a;

                {
                    this.f72205a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    BiColAwemeListState biColAwemeListState = (BiColAwemeListState) obj;
                    C52711k.m112240b(biColAwemeListState, "it");
                    C11853b bVar = ((C24786a) biColAwemeListState.getListState().getPayload()).f31449a;
                    List list = biColAwemeListState.getListState().getList();
                    if (list != null) {
                        this.f72205a.f72204b.mo47018a(list, bVar.f31440a);
                        return C52860x.f131107a;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.feed.model.Aweme>");
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.d$f */
    static final class C27436f extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C27429d f72206a;

        /* renamed from: b */
        final /* synthetic */ C26877c f72207b;

        C27436f(C27429d dVar, C26877c cVar) {
            this.f72206a = dVar;
            this.f72207b = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11866f fVar = (C11866f) obj;
            C52711k.m112240b(fVar, "$receiver");
            fVar.mo22552a(this.f72206a.f72189b, new C52671b<BiColAwemeListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C27436f f72208a;

                {
                    this.f72208a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    C52711k.m112240b((BiColAwemeListState) obj, "it");
                    this.f72208a.f72207b.mo47031e();
                    this.f72208a.f72206a.f72188a = true;
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.d$g */
    static final class C27438g extends C52712l implements C52682m<C11866f, List<? extends Object>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C27429d f72209a;

        /* renamed from: b */
        final /* synthetic */ C26877c f72210b;

        C27438g(C27429d dVar, C26877c cVar) {
            this.f72209a = dVar;
            this.f72210b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "list");
            fVar.mo22552a(this.f72209a.f72189b, new C52671b<BiColAwemeListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C27438g f72211a;

                {
                    this.f72211a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    BiColAwemeListState biColAwemeListState = (BiColAwemeListState) obj;
                    C52711k.m112240b(biColAwemeListState, "it");
                    C11853b bVar = ((C24786a) biColAwemeListState.getListState().getPayload()).f31449a;
                    List list = biColAwemeListState.getListState().getList();
                    if (list != null) {
                        this.f72211a.f72210b.mo47026b(list, bVar.f31440a);
                        return C52860x.f131107a;
                    }
                    throw new C52857u("null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.feed.model.Aweme>");
                }
            });
            this.f72209a.f72188a = false;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.d$h */
    static final class C27440h extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C27429d f72212a;

        /* renamed from: b */
        final /* synthetic */ C26877c f72213b;

        C27440h(C27429d dVar, C26877c cVar) {
            this.f72212a = dVar;
            this.f72213b = cVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "throwable");
            this.f72213b.mo47028c(new Exception(th));
            this.f72212a.f72188a = false;
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
        return 3000;
    }

    public final /* bridge */ /* synthetic */ Object getViewModel() {
        return this.f72189b;
    }

    public final boolean isDataEmpty() {
        return false;
    }

    public final boolean isLoading() {
        return this.f72188a;
    }

    public final void unInit() {
    }

    public C27429d(BiColAwemeListViewModel biColAwemeListViewModel) {
        this.f72189b = biColAwemeListViewModel;
    }

    public final boolean init(Fragment fragment) {
        C52711k.m112240b(fragment, "owner");
        if (this.f72189b == null) {
            return false;
        }
        this.f72190c = new JediWidget();
        C13378a aVar = C13376b.f34879h;
        View view = fragment.getView();
        if (view == null) {
            C52711k.m112234a();
        }
        C13376b a = aVar.mo25076a(fragment, view);
        C11872h hVar = this.f72190c;
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
        BiColAwemeListViewModel biColAwemeListViewModel = this.f72189b;
        if (biColAwemeListViewModel != null) {
            ListMiddleware<BiColAwemeListState, Object, C24786a> listMiddleware = biColAwemeListViewModel.f65589f;
            if (listMiddleware != null) {
                C11872h hVar = this.f72190c;
                if (hVar == null) {
                    C52711k.m112237a("jediView");
                }
                ListMiddleware.m24163a(listMiddleware, hVar, null, false, false, new C27432c(C27430a.INSTANCE, C27431b.INSTANCE, new C27434e(this, cVar)), new C27433d(new C27436f(this, cVar), new C27440h(this, cVar), new C27438g(this, cVar)), null, null, null, null, 974, null);
            }
        }
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        if (i == 1) {
            BiColAwemeListViewModel biColAwemeListViewModel = this.f72189b;
            if (biColAwemeListViewModel != null) {
                ListMiddleware<BiColAwemeListState, Object, C24786a> listMiddleware = biColAwemeListViewModel.f65589f;
                if (listMiddleware != null) {
                    listMiddleware.mo22565b();
                }
            }
        } else if (i == 4) {
            BiColAwemeListViewModel biColAwemeListViewModel2 = this.f72189b;
            if (biColAwemeListViewModel2 != null) {
                ListMiddleware<BiColAwemeListState, Object, C24786a> listMiddleware2 = biColAwemeListViewModel2.f65589f;
                if (listMiddleware2 != null) {
                    listMiddleware2.mo22567c();
                }
            }
        }
    }
}
