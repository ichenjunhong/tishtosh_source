package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchIntermediateStyleExperiment;
import com.p683ss.android.ugc.aweme.discover.adapter.viewholder.C28010e;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27728f;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28069a;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28071b;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28075d;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28076e;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28077f;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28077f.C28079b;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28082h;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28085i;
import com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28085i.C28086a;
import com.p683ss.android.ugc.aweme.search.C41424g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p2628d.C52668f;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bf */
public final class C27859bf<SuggestType> extends C27728f<Object> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f73194a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27859bf.class), "mDataStore", "getMDataStore()Lcom/ss/android/ugc/aweme/discover/adapter/SearchSquareAdapter$DataStore;"))};

    /* renamed from: b */
    public final C28075d f73195b;

    /* renamed from: c */
    public final C28076e f73196c;

    /* renamed from: d */
    public C28069a f73197d;

    /* renamed from: e */
    public C28071b f73198e;

    /* renamed from: f */
    public final Fragment f73199f;

    /* renamed from: g */
    public final C28077f f73200g;

    /* renamed from: h */
    private C28082h f73201h;

    /* renamed from: i */
    private C28085i f73202i;

    /* renamed from: j */
    private final C52668f f73203j;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bf$a */
    public final class C27860a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f73204a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27860a.class), "rawHistoryList", "getRawHistoryList()Ljava/util/ArrayList;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27860a.class), "viewHistoryList", "getViewHistoryList()Ljava/util/ArrayList;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27860a.class), "hotSearchList", "getHotSearchList()Ljava/util/ArrayList;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27860a.class), "guessWordList", "getGuessWordList()Ljava/util/ArrayList;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27860a.class), "suggestList", "getSuggestList()Ljava/util/ArrayList;"))};

        /* renamed from: b */
        public C28079b f73205b = C28079b.TYPE_NULL;

        /* renamed from: d */
        private final C52668f f73207d = C27868bg.m66625a(C27864d.f73215a);

        /* renamed from: e */
        private final C52668f f73208e = C27868bg.m66625a(C27866f.f73217a);

        /* renamed from: f */
        private final C52668f f73209f = C27868bg.m66625a(C27862b.f73213a);

        /* renamed from: g */
        private final C52668f f73210g = C27868bg.m66625a(C27861a.f73212a);

        /* renamed from: h */
        private final C52668f f73211h = C27868bg.m66625a(C27865e.f73216a);

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bf$a$a */
        static final class C27861a extends C52712l implements C52670a<ArrayList<Word>> {

            /* renamed from: a */
            public static final C27861a f73212a = new C27861a();

            C27861a() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new ArrayList();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bf$a$b */
        static final class C27862b extends C52712l implements C52670a<ArrayList<HotSearchItem>> {

            /* renamed from: a */
            public static final C27862b f73213a = new C27862b();

            C27862b() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new ArrayList();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bf$a$c */
        static final class C27863c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C27860a f73214a;

            C27863c(C27860a aVar) {
                this.f73214a = aVar;
            }

            public final void run() {
                C27859bf.this.notifyDataSetChanged();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bf$a$d */
        static final class C27864d extends C52712l implements C52670a<ArrayList<SearchHistory>> {

            /* renamed from: a */
            public static final C27864d f73215a = new C27864d();

            C27864d() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new ArrayList();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bf$a$e */
        static final class C27865e extends C52712l implements C52670a<ArrayList<SuggestType>> {

            /* renamed from: a */
            public static final C27865e f73216a = new C27865e();

            C27865e() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new ArrayList();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bf$a$f */
        static final class C27866f extends C52712l implements C52670a<ArrayList<SearchHistory>> {

            /* renamed from: a */
            public static final C27866f f73217a = new C27866f();

            C27866f() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new ArrayList();
            }
        }

        /* renamed from: e */
        private ArrayList<HotSearchItem> m66615e() {
            return (ArrayList) this.f73209f.getValue();
        }

        /* renamed from: f */
        private ArrayList<Word> m66616f() {
            return (ArrayList) this.f73210g.getValue();
        }

        /* renamed from: a */
        public final ArrayList<SearchHistory> mo56284a() {
            return (ArrayList) this.f73207d.getValue();
        }

        /* renamed from: b */
        public final ArrayList<SearchHistory> mo56287b() {
            return (ArrayList) this.f73208e.getValue();
        }

        /* renamed from: c */
        public final ArrayList<SuggestType> mo56289c() {
            return (ArrayList) this.f73211h.getValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo56291d() {
            ArrayList arrayList = new ArrayList();
            boolean d = C41424g.m91243d();
            if (d && !m66616f().isEmpty()) {
                arrayList.add(m66616f());
            }
            if (!mo56284a().isEmpty()) {
                arrayList.add(mo56284a());
            }
            if (!mo56287b().isEmpty()) {
                arrayList.add(mo56287b());
            }
            if (this.f73205b != C28079b.TYPE_NULL) {
                arrayList.add(this.f73205b);
            }
            if (!m66615e().isEmpty()) {
                arrayList.add(m66615e());
            }
            if (!d && !m66616f().isEmpty()) {
                arrayList.add(m66616f());
            }
            if (!mo56289c().isEmpty()) {
                arrayList.add(C28086a.TYPE_LIST);
                arrayList.addAll(mo56289c());
            }
            C27859bf.this.f72772k.clear();
            C27859bf.this.f72772k.addAll(arrayList);
            FragmentActivity activity = C27859bf.this.f73199f.getActivity();
            if (activity == null) {
                C52711k.m112234a();
            }
            activity.runOnUiThread(new C27863c(this));
        }

        /* renamed from: a */
        public final void mo56285a(C28079b bVar) {
            C52711k.m112240b(bVar, "last");
            this.f73205b = bVar;
            mo56291d();
        }

        /* renamed from: b */
        public final void mo56288b(List<HotSearchItem> list) {
            C52711k.m112240b(list, "list");
            m66615e().clear();
            m66615e().addAll(list);
            mo56291d();
        }

        /* renamed from: c */
        public final void mo56290c(List<Word> list) {
            C52711k.m112240b(list, "list");
            m66616f().clear();
            m66616f().addAll(list);
            mo56291d();
        }

        public C27860a() {
        }

        /* renamed from: a */
        public final void mo56286a(List<? extends SearchHistory> list) {
            C52711k.m112240b(list, "list");
            mo56287b().clear();
            Collection collection = list;
            mo56287b().addAll(collection);
            C28010e.m66765a(!collection.isEmpty());
            mo56291d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.bf$b */
    static final class C27867b extends C52712l implements C52670a<C27860a> {

        /* renamed from: a */
        final /* synthetic */ C27859bf f73218a;

        C27867b(C27859bf bfVar) {
            this.f73218a = bfVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C27860a();
        }
    }

    /* renamed from: a */
    public final C27860a mo56280a() {
        return (C27860a) this.f73203j.getValue();
    }

    /* renamed from: b */
    public final ArrayList<SuggestType> mo56283b() {
        return mo56280a().mo56289c();
    }

    /* renamed from: a */
    public final void mo56281a(List<Word> list) {
        C27860a aVar;
        List<Word> list2;
        this.f73197d.f73748b = true;
        if (C9376b.m18558a((Collection<T>) list)) {
            aVar = mo56280a();
            list2 = Collections.emptyList();
            C52711k.m112236a((Object) list2, "Collections.emptyList()");
        } else {
            C27860a a = mo56280a();
            if (list == null) {
                C52711k.m112234a();
            }
            C27860a aVar2 = a;
            list2 = list;
            aVar = aVar2;
        }
        aVar.mo56290c(list2);
    }

    private C27859bf(Fragment fragment, C28077f fVar) {
        C52711k.m112240b(fragment, "lifecycleOwner");
        C52711k.m112240b(fVar, "mHistoryLastDelegate");
        this.f73199f = fragment;
        this.f73200g = fVar;
        this.f73195b = new C28075d();
        this.f73196c = new C28076e();
        this.f73197d = new C28069a(this.f73199f);
        this.f73201h = new C28082h(this);
        this.f73202i = new C28085i(this);
        this.f73198e = new C28071b(this.f73199f);
        this.f73203j = C27868bg.m66625a(new C27867b(this));
        if (C10181b.m20511a().mo18168a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", 31744, 0) != 0 || C41424g.m91246f() || C41424g.m91241b()) {
            mo56159a(this.f73195b);
        }
        mo56159a(this.f73196c);
        mo56159a(this.f73200g);
        mo56159a(this.f73198e);
        mo56159a(this.f73197d);
        mo56159a(this.f73201h);
        mo56159a(this.f73202i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (r3 != false) goto L_0x0089;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56282a(java.util.List<? extends com.p683ss.android.ugc.aweme.discover.model.SearchHistory> r7, boolean r8) {
        /*
            r6 = this;
            com.bytedance.ies.abmock.b r0 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.discover.abtest.SearchIntermediateStyleExperiment> r1 = com.p683ss.android.ugc.aweme.discover.abtest.SearchIntermediateStyleExperiment.class
            java.lang.String r3 = "double_column_search_history_style"
            r2 = 1
            r4 = 31744(0x7c00, float:4.4483E-41)
            r5 = 0
            int r0 = r0.mo18168a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0046
            boolean r0 = com.p683ss.android.ugc.aweme.search.C41424g.m91246f()
            if (r0 != 0) goto L_0x0046
            boolean r0 = com.p683ss.android.ugc.aweme.search.C41424g.m91241b()
            if (r0 == 0) goto L_0x001f
            goto L_0x0046
        L_0x001f:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r8 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.discover.c.a.f$b r8 = com.p683ss.android.ugc.aweme.discover.p1640c.p1641a.C28077f.C28079b.TYPE_NONE
            goto L_0x002f
        L_0x0029:
            com.ss.android.ugc.aweme.discover.adapter.bf$a r8 = r6.mo56280a()
            com.ss.android.ugc.aweme.discover.c.a.f$b r8 = r8.f73205b
        L_0x002f:
            com.ss.android.ugc.aweme.discover.c.a.f r1 = r6.f73200g
            com.ss.android.ugc.aweme.discover.c.a.f$b r7 = r1.mo56495a(r7, r0, r8)
            com.ss.android.ugc.aweme.discover.adapter.bf$a r8 = r6.mo56280a()
            java.util.List r0 = (java.util.List) r0
            r8.mo56286a(r0)
            com.ss.android.ugc.aweme.discover.adapter.bf$a r8 = r6.mo56280a()
            r8.mo56285a(r7)
            goto L_0x009e
        L_0x0046:
            com.ss.android.ugc.aweme.discover.adapter.bf$a r8 = r6.mo56280a()
            com.ss.android.ugc.aweme.discover.adapter.bf r0 = com.p683ss.android.ugc.aweme.discover.adapter.C27859bf.this
            java.util.List<T> r0 = r0.f72772k
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x0054:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0072
            java.lang.Object r3 = r0.next()
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L_0x006b
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = p2628d.p2629a.C52575l.m112140f(r3)
            boolean r3 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.SearchHistory
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            if (r3 == 0) goto L_0x006f
            goto L_0x0073
        L_0x006f:
            int r2 = r2 + 1
            goto L_0x0054
        L_0x0072:
            r2 = -1
        L_0x0073:
            r0 = 1
            if (r2 < 0) goto L_0x0088
            r3 = r7
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x0084
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r3 = 0
            goto L_0x0085
        L_0x0084:
            r3 = 1
        L_0x0085:
            if (r3 == 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            java.util.ArrayList r1 = r8.mo56284a()
            r1.clear()
            if (r0 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.discover.adapter.bf r7 = com.p683ss.android.ugc.aweme.discover.adapter.C27859bf.this
            java.util.List<T> r7 = r7.f72772k
            r7.remove(r2)
            com.ss.android.ugc.aweme.discover.adapter.bf r7 = com.p683ss.android.ugc.aweme.discover.adapter.C27859bf.this
            r7.notifyItemRemoved(r2)
        L_0x009e:
            return
        L_0x009f:
            if (r7 == 0) goto L_0x00aa
            java.util.ArrayList r0 = r8.mo56284a()
            java.util.Collection r7 = (java.util.Collection) r7
            r0.addAll(r7)
        L_0x00aa:
            r8.mo56291d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.adapter.C27859bf.mo56282a(java.util.List, boolean):void");
    }

    public /* synthetic */ C27859bf(Fragment fragment, C28077f fVar, int i, C52707g gVar) {
        this(fragment, new C28077f(false, 1, null));
    }
}
