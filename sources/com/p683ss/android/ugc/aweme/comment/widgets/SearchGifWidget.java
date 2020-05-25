package com.p683ss.android.ugc.aweme.comment.widgets;

import android.arch.lifecycle.C0210y.C0212b;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.view.C1221d;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.jedi.arch.C11791ad;
import com.bytedance.jedi.arch.C11866f;
import com.bytedance.jedi.arch.ext.list.C11854c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.widget.Widget;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.comment.adapter.C25132s;
import com.p683ss.android.ugc.aweme.comment.adapter.C25134u;
import com.p683ss.android.ugc.aweme.comment.model.GifEmoji;
import com.p683ss.android.ugc.aweme.comment.p1528ui.C25334ad;
import com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState;
import com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel;
import com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel.C25401f;
import com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel.C25402g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52860x;
import p2628d.p2639f.C52669a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52760c;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget */
public final class SearchGifWidget extends BaseCommentJediWidget implements TextWatcher, OnClickListener, OnEditorActionListener, C11791ad<C25461a> {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f67333g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchGifWidget.class), "mResultLayout", "getMResultLayout()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchGifWidget.class), "mRecyclerView", "getMRecyclerView()Landroid/support/v7/widget/RecyclerView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchGifWidget.class), "mStatusView", "getMStatusView()Lcom/bytedance/ies/dmt/ui/widget/DmtStatusView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchGifWidget.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/comment/adapter/GifEmojiAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchGifWidget.class), "mEditText", "getMEditText()Landroid/widget/EditText;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchGifWidget.class), "mClear", "getMClear()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(SearchGifWidget.class), "mViewModel", "getMViewModel()Lcom/ss/android/ugc/aweme/comment/viewmodel/GifEmojiListViewModel;"))};

    /* renamed from: j */
    public static final C25446d f67334j = new C25446d(null);

    /* renamed from: h */
    public boolean f67335h;

    /* renamed from: i */
    public final C25134u f67336i;

    /* renamed from: k */
    private final C25428a f67337k = m61836a((int) R.id.b9c);

    /* renamed from: l */
    private final C25428a f67338l = m61836a((int) R.id.ca6);

    /* renamed from: m */
    private final C25428a f67339m = m61836a((int) R.id.csv);

    /* renamed from: n */
    private final C52668f f67340n = C52732g.m112286a(C52757k.NONE, new C25459o(this));

    /* renamed from: o */
    private final C25428a f67341o = m61836a((int) R.id.cj8);

    /* renamed from: p */
    private final C25428a f67342p = m61836a((int) R.id.cj7);

    /* renamed from: q */
    private final WidgetLifecycleAwareLazy f67343q;

    /* renamed from: r */
    private final int f67344r;

    /* renamed from: s */
    private final C52670a<C52860x> f67345s;

    /* renamed from: t */
    private final C52670a<C52860x> f67346t;

    /* renamed from: u */
    private final String f67347u;

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$a */
    public static final class C25443a extends C52712l implements C52670a<String> {

        /* renamed from: a */
        final /* synthetic */ Widget f67348a;

        /* renamed from: b */
        final /* synthetic */ C52760c f67349b;

        public C25443a(Widget widget, C52760c cVar) {
            this.f67348a = widget;
            this.f67349b = cVar;
            super(0);
        }

        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f67348a.getClass().getName());
            sb.append('_');
            sb.append(C52669a.m112219a(this.f67349b).getName());
            return sb.toString();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$b */
    public static final class C25444b extends C52712l implements C52671b<GifEmojiListState, GifEmojiListState> {
        public static final C25444b INSTANCE = new C25444b();

        public C25444b() {
            super(1);
        }

        public final GifEmojiListState invoke(GifEmojiListState gifEmojiListState) {
            C52711k.m112240b(gifEmojiListState, "$receiver");
            return gifEmojiListState;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$c */
    public static final class C25445c extends C52712l implements C52670a<GifEmojiListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f67350a;

        /* renamed from: b */
        final /* synthetic */ C52670a f67351b;

        /* renamed from: c */
        final /* synthetic */ C52760c f67352c;

        /* renamed from: d */
        final /* synthetic */ C52671b f67353d;

        public C25445c(Widget widget, C52670a aVar, C52760c cVar, C52671b bVar) {
            this.f67350a = widget;
            this.f67351b = aVar;
            this.f67352c = cVar;
            this.f67353d = bVar;
            super(0);
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v4, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel, com.bytedance.jedi.arch.JediViewModel]
          assigns: [com.bytedance.jedi.arch.JediViewModel]
          uses: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel, java.lang.Object]
          mth insns count: 36
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel invoke() {
            /*
                r3 = this;
                com.bytedance.widget.Widget r0 = r3.f67350a
                java.lang.Object r0 = r0.mo25062n()
                boolean r1 = r0 instanceof android.support.p030v4.app.Fragment
                if (r1 == 0) goto L_0x0019
                android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0
                com.bytedance.widget.Widget r1 = r3.f67350a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m439a(r0, r1)
                goto L_0x002b
            L_0x0019:
                boolean r1 = r0 instanceof android.support.p030v4.app.FragmentActivity
                if (r1 == 0) goto L_0x0057
                android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                com.bytedance.widget.Widget r1 = r3.f67350a
                com.bytedance.jedi.arch.ad r1 = (com.bytedance.jedi.arch.C11791ad) r1
                android.arch.lifecycle.y$b r1 = r1.mo22542a()
                android.arch.lifecycle.y r0 = android.arch.lifecycle.C0214z.m441a(r0, r1)
            L_0x002b:
                d.f.a.a r1 = r3.f67351b
                java.lang.Object r1 = r1.invoke()
                java.lang.String r1 = (java.lang.String) r1
                d.k.c r2 = r3.f67352c
                java.lang.Class r2 = p2628d.p2639f.C52669a.m112219a(r2)
                android.arch.lifecycle.x r0 = r0.mo360a(r1, r2)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                com.bytedance.jedi.arch.n r1 = r0.f31279c
                java.lang.Class<com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel> r2 = com.p683ss.android.ugc.aweme.comment.viewmodel.GifEmojiListViewModel.class
                com.bytedance.jedi.arch.m r1 = r1.mo22643a(r2)
                if (r1 == 0) goto L_0x0051
                java.lang.String r2 = "this"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
                r1.binding(r0)
            L_0x0051:
                d.f.a.b r1 = r3.f67353d
                r0.mo22526a(r1)
                return r0
            L_0x0057:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.comment.widgets.SearchGifWidget.C25445c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$d */
    static final class C25446d {
        private C25446d() {
        }

        public /* synthetic */ C25446d(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$e */
    public static final class C25447e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f67354a;

        public C25447e(SearchGifWidget searchGifWidget) {
            this.f67354a = searchGifWidget;
        }

        public final void run() {
            KeyboardUtils.m58183b(this.f67354a.mo52049t());
            this.f67354a.f67335h = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$f */
    public static final class C25448f implements C11854c<GifEmoji, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f67355a;

        /* renamed from: b */
        final /* synthetic */ C52682m f67356b;

        /* renamed from: c */
        final /* synthetic */ C52682m f67357c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f67358d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f67359e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends GifEmoji>, C52860x> f67360f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f67358d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f67359e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends GifEmoji>, C52860x> mo22603c() {
            return this.f67360f;
        }

        public C25448f(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f67355a = bVar;
            this.f67356b = mVar;
            this.f67357c = mVar2;
            this.f67358d = bVar;
            this.f67359e = mVar;
            this.f67360f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$g */
    public static final class C25449g extends C52712l implements C52682m<C11866f, List<? extends GifEmoji>, C52860x> {
        public static final C25449g INSTANCE = new C25449g();

        public C25449g() {
            super(2);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C11866f) obj, (List) obj2);
            return C52860x.f131107a;
        }

        public final void invoke(C11866f fVar, List<? extends GifEmoji> list) {
            C52711k.m112240b(list, "it");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$h */
    public static final class C25450h implements C11854c<GifEmoji, C11866f> {

        /* renamed from: a */
        final /* synthetic */ C52671b f67361a;

        /* renamed from: b */
        final /* synthetic */ C52682m f67362b;

        /* renamed from: c */
        final /* synthetic */ C52682m f67363c;

        /* renamed from: d */
        private final C52671b<C11866f, C52860x> f67364d;

        /* renamed from: e */
        private final C52682m<C11866f, Throwable, C52860x> f67365e;

        /* renamed from: f */
        private final C52682m<C11866f, List<? extends GifEmoji>, C52860x> f67366f;

        /* renamed from: a */
        public final C52671b<C11866f, C52860x> mo22601a() {
            return this.f67364d;
        }

        /* renamed from: b */
        public final C52682m<C11866f, Throwable, C52860x> mo22602b() {
            return this.f67365e;
        }

        /* renamed from: c */
        public final C52682m<C11866f, List<? extends GifEmoji>, C52860x> mo22603c() {
            return this.f67366f;
        }

        public C25450h(C52671b bVar, C52682m mVar, C52682m mVar2) {
            this.f67361a = bVar;
            this.f67362b = mVar;
            this.f67363c = mVar2;
            this.f67364d = bVar;
            this.f67365e = mVar;
            this.f67366f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$i */
    static final class C25451i extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f67367a;

        C25451i(SearchGifWidget searchGifWidget) {
            this.f67367a = searchGifWidget;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            this.f67367a.mo52047r().mo19212f();
            if (this.f67367a.mo52046q().getVisibility() != 0) {
                this.f67367a.mo52046q().setVisibility(0);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$j */
    static final class C25452j extends C52712l implements C52682m<C11866f, List<? extends GifEmoji>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f67368a;

        C25452j(SearchGifWidget searchGifWidget) {
            this.f67368a = searchGifWidget;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            final List list = (List) obj2;
            C52711k.m112240b(fVar, "$receiver");
            C52711k.m112240b(list, "result");
            fVar.mo22552a(this.f67368a.mo52050u(), new C52671b<GifEmojiListState, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C25452j f67369a;

                {
                    this.f67369a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    C52711k.m112240b((GifEmojiListState) obj, "it");
                    if (list.isEmpty()) {
                        this.f67369a.f67368a.mo52055z();
                    } else {
                        this.f67369a.f67368a.mo52047r().mo19209d();
                    }
                    return C52860x.f131107a;
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$k */
    static final class C25454k extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f67371a;

        C25454k(SearchGifWidget searchGifWidget) {
            this.f67371a = searchGifWidget;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            this.f67371a.mo52050u().mo51980e();
            this.f67371a.mo52047r().mo19214h();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$l */
    static final class C25455l extends C52712l implements C52671b<C11866f, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f67372a;

        C25455l(SearchGifWidget searchGifWidget) {
            this.f67372a = searchGifWidget;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C11866f) obj, "$receiver");
            this.f67372a.mo52048s().am_();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$m */
    static final class C25456m extends C52712l implements C52682m<C11866f, Throwable, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f67373a;

        C25456m(SearchGifWidget searchGifWidget) {
            this.f67373a = searchGifWidget;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            Throwable th = (Throwable) obj2;
            C52711k.m112240b((C11866f) obj, "$receiver");
            C52711k.m112240b(th, "it");
            this.f67373a.mo52048s().mo54793i();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$n */
    static final class C25457n extends C52712l implements C52682m<C11866f, Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f67374a;

        C25457n(SearchGifWidget searchGifWidget) {
            this.f67374a = searchGifWidget;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            C11866f fVar = (C11866f) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            C52711k.m112240b(fVar, "$receiver");
            if (booleanValue) {
                this.f67374a.mo52048s().ao_();
                this.f67374a.mo52048s().mo54788a((C26846a) new C25463c(new C52670a<C52860x>(this.f67374a) {
                    public final String getName() {
                        return "loadMore";
                    }

                    public final C52761d getOwner() {
                        return C52728w.m112245a(SearchGifWidget.class);
                    }

                    public final String getSignature() {
                        return "loadMore()V";
                    }

                    public final /* synthetic */ Object invoke() {
                        ((SearchGifWidget) this.receiver).mo52053x();
                        return C52860x.f131107a;
                    }
                }));
            } else {
                this.f67374a.mo52048s().an_();
                this.f67374a.mo52048s().mo54788a((C26846a) null);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$o */
    static final class C25459o extends C52712l implements C52670a<C25132s> {

        /* renamed from: a */
        final /* synthetic */ SearchGifWidget f67375a;

        /* renamed from: com.ss.android.ugc.aweme.comment.widgets.SearchGifWidget$o$a */
        static final /* synthetic */ class C25460a extends C52710j implements C52670a<C52860x> {
            C25460a(SearchGifWidget searchGifWidget) {
                super(0, searchGifWidget);
            }

            public final String getName() {
                return "loadMore";
            }

            public final C52761d getOwner() {
                return C52728w.m112245a(SearchGifWidget.class);
            }

            public final String getSignature() {
                return "loadMore()V";
            }

            public final /* synthetic */ Object invoke() {
                ((SearchGifWidget) this.receiver).mo52053x();
                return C52860x.f131107a;
            }
        }

        C25459o(SearchGifWidget searchGifWidget) {
            this.f67375a = searchGifWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C25132s sVar = new C25132s(this.f67375a, this.f67375a.f67336i, null, 4, null);
            sVar.mo54788a((C26846a) new C25464d(new C25460a(this.f67375a)));
            return sVar;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: e */
    public final int mo25056e() {
        return this.f67344r;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* renamed from: q */
    public final View mo52046q() {
        return this.f67337k.mo52027a(this, f67333g[0]);
    }

    /* renamed from: r */
    public final DmtStatusView mo52047r() {
        return (DmtStatusView) this.f67339m.mo52027a(this, f67333g[2]);
    }

    /* renamed from: s */
    public final C25132s mo52048s() {
        return (C25132s) this.f67340n.getValue();
    }

    /* renamed from: t */
    public final EditText mo52049t() {
        return (EditText) this.f67341o.mo52027a(this, f67333g[4]);
    }

    /* renamed from: u */
    public final GifEmojiListViewModel mo52050u() {
        return (GifEmojiListViewModel) this.f67343q.getValue();
    }

    /* renamed from: a */
    public final /* synthetic */ C0212b mo22542a() {
        return new C25461a();
    }

    /* renamed from: w */
    public final void mo52052w() {
        KeyboardUtils.m58184c(mo52049t());
    }

    /* renamed from: x */
    public final void mo52053x() {
        mo52050u().f67181h.mo22567c();
    }

    /* renamed from: y */
    public final CharSequence mo52054y() {
        return mo52049t().getText();
    }

    /* renamed from: z */
    public final void mo52055z() {
        mo52047r().mo19213g();
        mo52050u().mo51980e();
    }

    /* renamed from: v */
    public final void mo52051v() {
        Editable text = mo52049t().getText();
        if (text != null) {
            text.clear();
        }
        m61837a(mo52046q());
        mo52049t().clearFocus();
        this.f67335h = false;
        mo52052w();
    }

    /* renamed from: g */
    public final void mo25057g() {
        super.mo25057g();
        mo52049t().addTextChangedListener(this);
        mo52049t().setOnEditorActionListener(this);
        BaseCommentJediWidget baseCommentJediWidget = this;
        this.f67342p.mo52027a(baseCommentJediWidget, f67333g[5]).setOnClickListener(this);
        RecyclerView recyclerView = (RecyclerView) this.f67338l.mo52027a(baseCommentJediWidget, f67333g[1]);
        recyclerView.mo4798a((C1331h) new C25334ad());
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setAdapter(mo52048s());
        int c = C0726c.m2098c(mo52026p(), R.color.a8g);
        DmtTextView dmtTextView = new DmtTextView(new C1221d(mo52026p(), R.style.tf));
        dmtTextView.setTextColor(c);
        dmtTextView.setText(R.string.axj);
        DmtTextView dmtTextView2 = new DmtTextView(new C1221d(mo52026p(), R.style.tf));
        dmtTextView2.setTextColor(c);
        dmtTextView2.setText(R.string.axo);
        mo52047r().setBuilder(C10719a.m21676a(mo52026p()).mo19231b((View) dmtTextView2).mo19234c((View) dmtTextView));
        GifEmojiListViewModel u = mo52050u();
        String str = this.f67347u;
        C52711k.m112240b(str, "awemeId");
        u.mo22530c(new C25401f(str));
        ListMiddleware.m24163a(mo52050u().f67181h, this, mo52048s(), false, false, new C25448f(new C25451i(this), new C25454k(this), new C25452j(this)), new C25450h(new C25455l(this), new C25456m(this), C25449g.INSTANCE), new C25457n(this), null, null, null, 908, null);
    }

    public final void afterTextChanged(Editable editable) {
        m61922a(editable);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        Editable editableText = mo52049t().getEditableText();
        if (editableText != null) {
            editableText.clear();
        }
        m61837a(mo52046q());
        this.f67345s.invoke();
    }

    /* renamed from: a */
    private final void m61922a(Editable editable) {
        boolean z;
        if (!C25462b.m61943a(mo52026p())) {
            mo52050u().mo51980e();
            mo52047r().mo19214h();
            return;
        }
        CharSequence charSequence = editable;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo52055z();
            m61837a(mo52046q());
        } else if (editable.length() > 8) {
            mo52055z();
        } else {
            mo52047r().mo19212f();
            GifEmojiListViewModel u = mo52050u();
            u.mo22527b(new C25402g(u, charSequence));
        }
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Editable editable;
        if (i != 3 || (!mo52047r().mo19217k() && !mo52047r().mo19218l() && !mo52047r().mo19219m())) {
            return false;
        }
        if (textView != null) {
            editable = textView.getEditableText();
        } else {
            editable = null;
        }
        m61922a(editable);
        return true;
    }

    public SearchGifWidget(C52670a<C52860x> aVar, C25134u uVar, C52670a<C52860x> aVar2, String str) {
        C52711k.m112240b(aVar, "exitSearchGifMode");
        C52711k.m112240b(uVar, "gifEmojiActionListener");
        C52711k.m112240b(aVar2, "dismiss");
        C52711k.m112240b(str, "awemeId");
        this.f67345s = aVar;
        this.f67336i = uVar;
        this.f67346t = aVar2;
        this.f67347u = str;
        C52760c a = C52728w.m112245a(GifEmojiListViewModel.class);
        C52670a aVar3 = new C25443a(this, a);
        this.f67343q = new WidgetLifecycleAwareLazy(this, aVar3, new C25445c(this, aVar3, a, C25444b.INSTANCE));
        this.f67344r = R.layout.b1y;
    }
}
