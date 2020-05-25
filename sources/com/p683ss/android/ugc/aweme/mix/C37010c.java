package com.p683ss.android.ugc.aweme.mix;

import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.C11872h;
import com.bytedance.jedi.arch.ext.list.C11853b;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.widget.C13376b;
import com.bytedance.widget.Widget;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27420a;
import com.p683ss.android.ugc.aweme.detail.operators.C27424ao;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailLoadStateManager.C27479a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider.C30666a;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.mix.c */
public final class C37010c implements C27419al, C27420a {

    /* renamed from: a */
    public FragmentActivity f94527a;

    /* renamed from: b */
    public boolean f94528b;

    /* renamed from: c */
    public final MixDetailViewModel f94529c;

    /* renamed from: d */
    private C11872h f94530d;

    /* renamed from: com.ss.android.ugc.aweme.mix.c$a */
    public static final class C37011a extends C52712l implements C52671b<C11866f, C52860x> {
        public static final C37011a INSTANCE = new C37011a();

        public C37011a() {
            super(1);
        }

        public final void invoke(C11866f fVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.c$b */
    public static final class C37012b extends C52712l implements C52682m<C11866f, Throwable, C52860x> {
        public static final C37012b INSTANCE = new C37012b();

        public C37012b() {
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

    /* renamed from: com.ss.android.ugc.aweme.mix.c$c */
    public static final class C37013c implements C11854c<Aweme, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f94531a;

        /* renamed from: b */
        final /* synthetic */ C52682m f94532b;

        /* renamed from: c */
        final /* synthetic */ C52682m f94533c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f94534d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f94535e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Aweme>, C52860x> f94536f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f94534d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f94535e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Aweme>, C52860x> mo22603c() {
            return this.f94536f;
        }

        public C37013c(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f94531a = bVar;
            this.f94532b = mVar;
            this.f94533c = mVar2;
            this.f94534d = bVar;
            this.f94535e = mVar;
            this.f94536f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.c$d */
    public static final class C37014d implements C11854c<Aweme, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f94537a;

        /* renamed from: b */
        final /* synthetic */ C52682m f94538b;

        /* renamed from: c */
        final /* synthetic */ C52682m f94539c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f94540d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f94541e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends Aweme>, C52860x> f94542f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f94540d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f94541e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends Aweme>, C52860x> mo22603c() {
            return this.f94542f;
        }

        public C37014d(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f94537a = bVar;
            this.f94538b = mVar;
            this.f94539c = mVar2;
            this.f94540d = bVar;
            this.f94541e = mVar;
            this.f94542f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.c$e */
    static final class C37015e extends C52712l implements C52682m<C11866f, List<? extends Aweme>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37010c f94543a;

        /* renamed from: b */
        final /* synthetic */ C26877c f94544b;

        C37015e(C37010c cVar, C26877c cVar2) {
            this.f94543a = cVar;
            this.f94544b = cVar2;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            fVar.mo22552a(this.f94543a.f94529c, new C52671b<MixDetailState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37015e f94545a;

                {
                    this.f94545a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    MixDetailState mixDetailState = (MixDetailState) obj;
                    C52711k.m112240b(mixDetailState, "it");
                    C11853b bVar = ((C37094w) mixDetailState.getListState().getPayload()).f31449a;
                    List<Aweme> list = mixDetailState.getListState().getList();
                    ArrayList arrayList = new ArrayList();
                    for (Aweme updateAweme : list) {
                        arrayList.add(C23324d.m57378a().updateAweme(updateAweme));
                    }
                    this.f94545a.f94544b.mo47018a(arrayList, bVar.f31440a);
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.c$f */
    static final class C37017f extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37010c f94546a;

        /* renamed from: b */
        final /* synthetic */ C26877c f94547b;

        C37017f(C37010c cVar, C26877c cVar2) {
            this.f94546a = cVar;
            this.f94547b = cVar2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11866f fVar = (C11866f) obj;
            C52711k.m112240b(fVar, "$receiver");
            fVar.mo22552a(this.f94546a.f94529c, new C52671b<MixDetailState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37017f f94548a;

                {
                    this.f94548a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    MixDetailState mixDetailState = (MixDetailState) obj;
                    C52711k.m112240b(mixDetailState, "it");
                    if (mixDetailState.getPullType() == 2) {
                        this.f94548a.f94547b.mo47031e();
                    }
                    return C52860x.f131107a;
                }
            });
            this.f94546a.f94528b = true;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.c$g */
    static final class C37019g extends C52712l implements C52682m<C11866f, List<? extends Aweme>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37010c f94549a;

        /* renamed from: b */
        final /* synthetic */ C26877c f94550b;

        C37019g(C37010c cVar, C26877c cVar2) {
            this.f94549a = cVar;
            this.f94550b = cVar2;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "it");
            fVar.mo22552a(this.f94549a.f94529c, new C52671b<MixDetailState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C37019g f94551a;

                {
                    this.f94551a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    MixDetailState mixDetailState = (MixDetailState) obj;
                    C52711k.m112240b(mixDetailState, "it");
                    StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                    C52711k.m112236a((Object) stackTrace, "Throwable().stackTrace");
                    int length = stackTrace.length;
                    boolean z = false;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            StackTraceElement stackTraceElement = stackTrace[i];
                            C52711k.m112236a((Object) stackTraceElement, "it");
                            if (TextUtils.equals(stackTraceElement.getClassName(), "android.arch.lifecycle.SingleGeneratedAdapterObserver") && TextUtils.equals(stackTraceElement.getMethodName(), "onStateChanged")) {
                                break;
                            }
                            i++;
                        } else {
                            List<Aweme> list = mixDetailState.getListState().getList();
                            ArrayList arrayList = new ArrayList();
                            for (Aweme updateAweme : list) {
                                arrayList.add(C23324d.m57378a().updateAweme(updateAweme));
                            }
                            if (mixDetailState.getPullType() != 2) {
                                if (((C37094w) mixDetailState.getListState().getPayload()).f94745c != 0) {
                                    z = true;
                                }
                                this.f94551a.f94550b.mo47029c(arrayList, z);
                            } else {
                                this.f94551a.f94550b.mo47026b(arrayList, ((C37094w) mixDetailState.getListState().getPayload()).f94746d);
                            }
                            FragmentActivity fragmentActivity = this.f94551a.f94549a.f94527a;
                            if (fragmentActivity != null) {
                                C27479a.m66087a(fragmentActivity).f72276a.setValue(Boolean.valueOf(this.f94551a.f94549a.f94529c.f94495n));
                            }
                        }
                    }
                    return C52860x.f131107a;
                }
            });
            this.f94549a.f94528b = false;
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.c$h */
    static final class C37021h extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37010c f94552a;

        /* renamed from: b */
        final /* synthetic */ C26877c f94553b;

        C37021h(C37010c cVar, C26877c cVar2) {
            this.f94552a = cVar;
            this.f94553b = cVar2;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "throwable");
            this.f94553b.mo47028c(new Exception(th));
            this.f94552a.f94528b = false;
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final boolean mo55879a() {
        return true;
    }

    public final boolean deleteItem(String str) {
        C52711k.m112240b(str, "aid");
        return false;
    }

    public final int getPageType(int i) {
        return 19;
    }

    public final Object getViewModel() {
        return this.f94529c;
    }

    public final boolean isDataEmpty() {
        return false;
    }

    public final boolean isLoading() {
        return this.f94528b;
    }

    public final void unInit() {
    }

    public final boolean cannotLoadLatest() {
        boolean z;
        MixDetailViewModel mixDetailViewModel = this.f94529c;
        if (mixDetailViewModel != null) {
            z = mixDetailViewModel.f94495n;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public final boolean cannotLoadMore() {
        boolean z;
        MixDetailViewModel mixDetailViewModel = this.f94529c;
        if (mixDetailViewModel != null) {
            z = mixDetailViewModel.f94494m;
        } else {
            z = true;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    public C37010c(MixDetailViewModel mixDetailViewModel) {
        this.f94529c = mixDetailViewModel;
    }

    public final void bindView(C27424ao aoVar) {
        C52711k.m112240b(aoVar, "panel");
        C26877c cVar = aoVar;
        FragmentActivity fragmentActivity = this.f94527a;
        if (fragmentActivity != null) {
            C30666a.m71942a(fragmentActivity);
        }
        MixDetailViewModel mixDetailViewModel = this.f94529c;
        if (mixDetailViewModel != null) {
            ListMiddleware<MixDetailState, Aweme, C37094w> listMiddleware = mixDetailViewModel.f94489h;
            if (listMiddleware != null) {
                C11872h hVar = this.f94530d;
                if (hVar == null) {
                    C52711k.m112237a("jediView");
                }
                ListMiddleware.m24163a(listMiddleware, hVar, null, false, false, new C37013c(C37011a.INSTANCE, C37012b.INSTANCE, new C37015e(this, cVar)), new C37014d(new C37017f(this, cVar), new C37021h(this, cVar), new C37019g(this, cVar)), null, null, null, null, 974, null);
            }
        }
    }

    public final boolean init(Fragment fragment) {
        C52711k.m112240b(fragment, "owner");
        if (this.f94529c == null) {
            return false;
        }
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        this.f94527a = activity;
        FragmentActivity fragmentActivity = this.f94527a;
        if (fragmentActivity != null) {
            C27479a.m66087a(fragmentActivity).f72276a.setValue(Boolean.valueOf(this.f94529c.f94495n));
        }
        this.f94530d = new JediWidget();
        C13376b a = C13376b.f34879h.mo25076a(fragment, fragment.getView());
        C11872h hVar = this.f94530d;
        if (hVar == null) {
            C52711k.m112237a("jediView");
        }
        if (hVar != null) {
            a.mo25074a((Widget) hVar);
            return true;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.widget.Widget");
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        C52711k.m112240b(bVar, "feedParam");
        if (i != 4) {
            switch (i) {
                case 1:
                    MixDetailViewModel mixDetailViewModel = this.f94529c;
                    if (mixDetailViewModel != null) {
                        ListMiddleware<MixDetailState, Aweme, C37094w> listMiddleware = mixDetailViewModel.f94489h;
                        if (listMiddleware != null) {
                            listMiddleware.mo22565b();
                            break;
                        }
                    }
                    return;
                case 2:
                    MixDetailViewModel mixDetailViewModel2 = this.f94529c;
                    if (mixDetailViewModel2 != null) {
                        mixDetailViewModel2.mo76319a(1);
                        return;
                    }
                    break;
            }
        } else {
            MixDetailViewModel mixDetailViewModel3 = this.f94529c;
            if (mixDetailViewModel3 != null) {
                mixDetailViewModel3.mo76319a(2);
            }
        }
    }
}
