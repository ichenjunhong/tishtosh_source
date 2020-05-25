package com.p683ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.abtest.GuideSearchItemLenSettings;
import com.p683ss.android.ugc.aweme.discover.abtest.GuideSearchUIOptimization;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.C28420y.C28421a;
import com.p683ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p683ss.android.ugc.aweme.discover.model.GuideSearchWordKt;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28097e;
import com.p683ss.android.ugc.aweme.search.performance.C41457i;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView */
public final class GuideSearchHeadView extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f75806a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GuideSearchHeadView.class), "listView", "getListView()Landroid/support/v7/widget/RecyclerView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GuideSearchHeadView.class), "adapter", "getAdapter()Lcom/ss/android/ugc/aweme/discover/widget/GuideSearchHeadView$GuideSearchAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GuideSearchHeadView.class), "layoutManager", "getLayoutManager()Landroid/support/v7/widget/LinearLayoutManager;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GuideSearchHeadView.class), "alreadyMobWords", "getAlreadyMobWords()Ljava/util/HashSet;"))};

    /* renamed from: b */
    public String f75807b;

    /* renamed from: c */
    public String f75808c;

    /* renamed from: d */
    HashMap f75809d;

    /* renamed from: e */
    private final C52668f f75810e;

    /* renamed from: f */
    private final C52668f f75811f;

    /* renamed from: g */
    private final C52668f f75812g;

    /* renamed from: h */
    private final C52668f f75813h;

    /* renamed from: i */
    private int f75814i;

    /* renamed from: j */
    private C28980c f75815j;

    /* renamed from: k */
    private boolean f75816k;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$a */
    public final class C28959a extends C1322a<C1352v> {

        /* renamed from: a */
        public List<GuideSearchWord> f75817a;

        /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$a$a */
        static final class C28960a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C28959a f75819a;

            /* renamed from: b */
            final /* synthetic */ int f75820b;

            C28960a(C28959a aVar, int i) {
                this.f75819a = aVar;
                this.f75820b = i;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                GuideSearchHeadView guideSearchHeadView = GuideSearchHeadView.this;
                String str = "trending_words_click";
                List<GuideSearchWord> list = this.f75819a.f75817a;
                if (list == null) {
                    C52711k.m112234a();
                }
                guideSearchHeadView.mo58524a(str, (GuideSearchWord) list.get(this.f75820b), this.f75820b);
                if (!GuideSearchHeadView.this.getNewStyle()) {
                    List<GuideSearchWord> list2 = this.f75819a.f75817a;
                    if (list2 == null) {
                        C52711k.m112234a();
                    }
                    String word = ((GuideSearchWord) list2.get(this.f75820b)).getWord();
                    if (word == null) {
                        C52711k.m112234a();
                    }
                    C47718bf.m103288a(new C28097e(word));
                    return;
                }
                List<GuideSearchWord> list3 = this.f75819a.f75817a;
                if (list3 == null) {
                    C52711k.m112234a();
                }
                int i = 0;
                for (Object next : list3) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C52575l.m112100b();
                    }
                    GuideSearchWord guideSearchWord = (GuideSearchWord) next;
                    if (guideSearchWord.getSelected() && i != this.f75820b) {
                        guideSearchWord.setSelected(false);
                        this.f75819a.notifyItemChanged(i);
                    } else if (i == this.f75820b) {
                        guideSearchWord.setSelected(true);
                        this.f75819a.notifyItemChanged(i);
                    }
                    i = i2;
                }
                C28959a aVar = this.f75819a;
                C52711k.m112236a((Object) view, "it");
                RecyclerView listView = GuideSearchHeadView.this.getListView();
                C52711k.m112236a((Object) listView, "listView");
                GuideSearchHeadView.this.getListView().mo4795a((int) ((view.getX() + (((float) view.getWidth()) * 0.5f)) - (((float) listView.getWidth()) * 0.5f)), 0);
                List<GuideSearchWord> list4 = this.f75819a.f75817a;
                if (list4 == null) {
                    C52711k.m112234a();
                }
                GuideSearchWord guideSearchWord2 = (GuideSearchWord) list4.get(this.f75820b);
                C28980c itemClickListener = GuideSearchHeadView.this.getItemClickListener();
                if (itemClickListener != null) {
                    itemClickListener.mo58241a(guideSearchWord2);
                }
            }
        }

        public final int getItemCount() {
            if (this.f75817a == null) {
                return 0;
            }
            List<GuideSearchWord> list = this.f75817a;
            if (list == null) {
                C52711k.m112234a();
            }
            return list.size();
        }

        public C28959a() {
        }

        /* renamed from: a */
        public final void mo58532a(List<GuideSearchWord> list) {
            this.f75817a = list;
            notifyDataSetChanged();
        }

        public final void onViewAttachedToWindow(C1352v vVar) {
            C52711k.m112240b(vVar, "holder");
            GuideSearchWord guideSearchWord = ((C28961b) vVar).f75822b;
            if (guideSearchWord != null) {
                List<GuideSearchWord> list = this.f75817a;
                if (list != null) {
                    int indexOf = list.indexOf(guideSearchWord);
                    if (!GuideSearchHeadView.this.getAlreadyMobWords().contains(guideSearchWord)) {
                        GuideSearchHeadView.this.getAlreadyMobWords().add(guideSearchWord);
                        GuideSearchHeadView.this.mo58524a("trending_words_show", guideSearchWord, indexOf);
                    }
                }
            }
        }

        public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "parent");
            return new C28961b(C41457i.f105090b.mo84196a(viewGroup, R.layout.bs1));
        }

        public final void onBindViewHolder(C1352v vVar, int i) {
            C52711k.m112240b(vVar, "holder");
            C28961b bVar = (C28961b) vVar;
            List<GuideSearchWord> list = this.f75817a;
            if (list == null) {
                C52711k.m112234a();
            }
            GuideSearchWord guideSearchWord = (GuideSearchWord) list.get(i);
            boolean newStyle = GuideSearchHeadView.this.getNewStyle();
            C52711k.m112240b(guideSearchWord, "word");
            bVar.f75822b = guideSearchWord;
            View view = bVar.itemView;
            if (view != null) {
                ((DmtTextView) view).setText(guideSearchWord.getWord());
                if (newStyle) {
                    if (guideSearchWord.getSelected()) {
                        ((DmtTextView) bVar.itemView).setTextColor(((Number) bVar.f75823c.getValue()).intValue());
                        bVar.itemView.setBackground((Drawable) bVar.f75826f.getValue());
                    } else {
                        ((DmtTextView) bVar.itemView).setTextColor(((Number) bVar.f75824d.getValue()).intValue());
                        bVar.itemView.setBackground((Drawable) bVar.f75825e.getValue());
                    }
                }
                vVar.itemView.setOnClickListener(new C28960a(this, i));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtTextView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$b */
    public static final class C28961b extends C1352v {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f75821a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28961b.class), "selectedTextColor", "getSelectedTextColor()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28961b.class), "unselectedTextColor", "getUnselectedTextColor()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28961b.class), "unselectedBackground", "getUnselectedBackground()Landroid/graphics/drawable/Drawable;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28961b.class), "selectedBackground", "getSelectedBackground()Landroid/graphics/drawable/Drawable;"))};

        /* renamed from: b */
        public GuideSearchWord f75822b;

        /* renamed from: c */
        final C52668f f75823c;

        /* renamed from: d */
        final C52668f f75824d;

        /* renamed from: e */
        final C52668f f75825e;

        /* renamed from: f */
        final C52668f f75826f;

        /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$b$a */
        static final class C28962a extends C52712l implements C52670a<Drawable> {

            /* renamed from: a */
            final /* synthetic */ View f75827a;

            C28962a(View view) {
                this.f75827a = view;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Context context = this.f75827a.getContext();
                C52711k.m112236a((Object) context, "itemView.context");
                return context.getResources().getDrawable(R.drawable.dsy);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$b$b */
        static final class C28963b extends C52712l implements C52670a<Integer> {

            /* renamed from: a */
            final /* synthetic */ View f75828a;

            C28963b(View view) {
                this.f75828a = view;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Context context = this.f75828a.getContext();
                C52711k.m112236a((Object) context, "itemView.context");
                return Integer.valueOf(context.getResources().getColor(R.color.ph));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$b$c */
        static final class C28964c extends C52712l implements C52670a<Drawable> {

            /* renamed from: a */
            final /* synthetic */ View f75829a;

            C28964c(View view) {
                this.f75829a = view;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Context context = this.f75829a.getContext();
                C52711k.m112236a((Object) context, "itemView.context");
                return context.getResources().getDrawable(R.drawable.dsx);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$b$d */
        static final class C28965d extends C52712l implements C52670a<Integer> {

            /* renamed from: a */
            final /* synthetic */ View f75830a;

            C28965d(View view) {
                this.f75830a = view;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Context context = this.f75830a.getContext();
                C52711k.m112236a((Object) context, "itemView.context");
                return Integer.valueOf(context.getResources().getColor(R.color.b0k));
            }
        }

        public C28961b(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
            this.f75823c = C28979b.m68291a(new C28963b(view));
            this.f75824d = C28979b.m68291a(new C28965d(view));
            this.f75825e = C28979b.m68291a(new C28964c(view));
            this.f75826f = C28979b.m68291a(new C28962a(view));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$c */
    public static final class C28966c extends C1331h {

        /* renamed from: a */
        private final int f75831a;

        public C28966c(int i) {
            this.f75831a = i;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
            C52711k.m112240b(rect, "outRect");
            C52711k.m112240b(view, "view");
            C52711k.m112240b(recyclerView, "parent");
            C52711k.m112240b(sVar, "state");
            if (RecyclerView.m4275f(view) == 0) {
                rect.left = this.f75831a;
            }
            rect.right = this.f75831a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$d */
    static final class C28967d extends C52712l implements C52670a<C28959a> {

        /* renamed from: a */
        final /* synthetic */ GuideSearchHeadView f75832a;

        C28967d(GuideSearchHeadView guideSearchHeadView) {
            this.f75832a = guideSearchHeadView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C28959a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$e */
    static final class C28968e extends C52712l implements C52670a<HashSet<GuideSearchWord>> {

        /* renamed from: a */
        public static final C28968e f75833a = new C28968e();

        C28968e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new HashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$f */
    static final class C28969f extends C52712l implements C52670a<LinearLayoutManager> {

        /* renamed from: a */
        final /* synthetic */ Context f75834a;

        C28969f(Context context) {
            this.f75834a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new LinearLayoutManager(this.f75834a, 0, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$g */
    static final class C28970g extends C52712l implements C52670a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ GuideSearchHeadView f75835a;

        C28970g(GuideSearchHeadView guideSearchHeadView) {
            this.f75835a = guideSearchHeadView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            GuideSearchHeadView guideSearchHeadView = this.f75835a;
            if (guideSearchHeadView.f75809d == null) {
                guideSearchHeadView.f75809d = new HashMap();
            }
            View view = (View) guideSearchHeadView.f75809d.get(Integer.valueOf(R.id.caf));
            if (view == null) {
                view = guideSearchHeadView.findViewById(R.id.caf);
                guideSearchHeadView.f75809d.put(Integer.valueOf(R.id.caf), view);
            }
            return (RecyclerView) view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$h */
    static final class C28971h<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ GuideSearchHeadView f75836a;

        /* renamed from: b */
        final /* synthetic */ String f75837b;

        /* renamed from: c */
        final /* synthetic */ GuideSearchWord f75838c;

        /* renamed from: d */
        final /* synthetic */ int f75839d;

        C28971h(GuideSearchHeadView guideSearchHeadView, String str, GuideSearchWord guideSearchWord, int i) {
            this.f75836a = guideSearchHeadView;
            this.f75837b = str;
            this.f75838c = guideSearchWord;
            this.f75839d = i;
        }

        public final /* synthetic */ Object call() {
            C26890h.m65011a(this.f75837b, C23089d.m56640a().mo47829a("group_id", this.f75838c.getId()).mo47829a("query_id", this.f75838c.getQueryId()).mo47829a("words_source", "guide_search").mo47826a("words_position", this.f75839d).mo47829a("words_content", this.f75838c.getWord()).mo47829a("query", this.f75836a.f75808c).mo47829a("search_id", C28381ab.m67359d().mo56813a(C28421a.m67432a(this.f75836a.f75807b))).mo47829a("search_subtab_name", this.f75836a.f75807b).f61491a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.GuideSearchHeadView$i */
    static final class C28972i<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ GuideSearchHeadView f75840a;

        /* renamed from: b */
        final /* synthetic */ List f75841b;

        C28972i(GuideSearchHeadView guideSearchHeadView, List list) {
            this.f75840a = guideSearchHeadView;
            this.f75841b = list;
        }

        public final /* synthetic */ Object call() {
            String str;
            String str2 = "trending_show";
            C23089d a = C23089d.m56640a().mo47826a("words_num", this.f75841b.size());
            String str3 = "query_id";
            GuideSearchWord guideSearchWord = (GuideSearchWord) C52575l.m112140f(this.f75841b);
            if (guideSearchWord != null) {
                str = guideSearchWord.getQueryId();
            } else {
                str = null;
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("words_source", "guide_search").mo47829a("query", this.f75840a.f75808c).mo47829a("search_id", C28381ab.m67359d().mo56813a(C28421a.m67432a(this.f75840a.f75807b))).mo47829a("search_subtab_name", this.f75840a.f75807b).f61491a);
            return C52860x.f131107a;
        }
    }

    public GuideSearchHeadView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GuideSearchHeadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final C28959a getAdapter() {
        return (C28959a) this.f75811f.getValue();
    }

    private final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.f75812g.getValue();
    }

    public final HashSet<GuideSearchWord> getAlreadyMobWords() {
        return (HashSet) this.f75813h.getValue();
    }

    public final C28980c getItemClickListener() {
        return this.f75815j;
    }

    public final RecyclerView getListView() {
        return (RecyclerView) this.f75810e.getValue();
    }

    public final boolean getNewStyle() {
        return this.f75816k;
    }

    public final void setItemClickListener(C28980c cVar) {
        this.f75815j = cVar;
    }

    public final void setNewStyle(boolean z) {
        this.f75816k = z;
    }

    /* renamed from: a */
    private final void m68277a(List<GuideSearchWord> list) {
        C0013i.m16a((Callable<TResult>) new C28972i<TResult>(this, list));
    }

    /* renamed from: a */
    private final List<GuideSearchWord> m68276a(List<GuideSearchWord> list, boolean z) {
        String str;
        String str2;
        List<GuideSearchWord> e = C52575l.m112139e((Collection<? extends T>) list);
        for (GuideSearchWord guideSearchWord : e) {
            String word = guideSearchWord.getWord();
            if (word == null) {
                C52711k.m112234a();
            }
            if (word.length() <= this.f75814i - 1 || this.f75814i - 1 <= 0) {
                str2 = guideSearchWord.getWord();
            } else {
                StringBuilder sb = new StringBuilder();
                String word2 = guideSearchWord.getWord();
                if (word2 == null) {
                    C52711k.m112234a();
                }
                int i = this.f75814i - 1;
                if (word2 != null) {
                    String substring = word2.substring(0, i);
                    C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append("...");
                    str2 = sb.toString();
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            }
            guideSearchWord.setWord(str2);
        }
        if (z) {
            GuideSearchWord createTabForAll = GuideSearchWordKt.createTabForAll();
            GuideSearchWord guideSearchWord2 = (GuideSearchWord) C52575l.m112140f(list);
            if (guideSearchWord2 != null) {
                str = guideSearchWord2.getQueryId();
            } else {
                str = null;
            }
            createTabForAll.setQueryId(str);
            e.add(0, createTabForAll);
        }
        return e;
    }

    /* renamed from: a */
    public final void mo58524a(String str, GuideSearchWord guideSearchWord, int i) {
        C0013i.m16a((Callable<TResult>) new C28971h<TResult>(this, str, guideSearchWord, i));
    }

    /* renamed from: a */
    public final void mo58525a(List<GuideSearchWord> list, String str, String str2) {
        C52711k.m112240b(list, "wordList");
        C52711k.m112240b(str, "originalKeyword");
        setVisibility(0);
        boolean z = true;
        if (C10193n.m20607a().mo18200a(GuideSearchUIOptimization.class, "search_new_gs_style", C10181b.m20511a().mo18175c().getSearchNewGsStyle(), 1) != 1) {
            z = false;
        }
        this.f75816k = z;
        getAdapter().mo58532a(m68276a(list, this.f75816k));
        getListView().mo4814b(0);
        getAlreadyMobWords().clear();
        this.f75808c = str;
        this.f75807b = str2;
        if (!C9376b.m18558a((Collection<T>) list)) {
            m68277a(list);
        }
    }

    public GuideSearchHeadView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f75810e = C28979b.m68291a(new C28970g(this));
        this.f75811f = C28979b.m68291a(new C28967d(this));
        this.f75812g = C28979b.m68291a(new C28969f(context));
        this.f75813h = C28979b.m68291a(C28968e.f75833a);
        this.f75814i = C10193n.m20607a().mo18200a(GuideSearchItemLenSettings.class, "guide_search_item_len", C10181b.m20511a().mo18175c().getGuideSearchItemLen(), 7);
        LayoutInflater.from(context).inflate(R.layout.btn, this, true);
        RecyclerView listView = getListView();
        C52711k.m112236a((Object) listView, "listView");
        listView.setLayoutManager(getLayoutManager());
        RecyclerView listView2 = getListView();
        C52711k.m112236a((Object) listView2, "listView");
        listView2.setAdapter(getAdapter());
        getListView().mo4798a((C1331h) new C28966c((int) C9432q.m18687b(getContext(), 12.0f)));
        if (this.f75814i == 0) {
            this.f75814i = 7;
        }
    }

    public /* synthetic */ GuideSearchHeadView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
