package com.p683ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchIntermediateStyleExperiment;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28524b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d */
public final class C28003d extends C1352v implements OnClickListener {

    /* renamed from: a */
    public static final int f73560a;

    /* renamed from: b */
    public static final C28004a f73561b = new C28004a(null);

    /* renamed from: c */
    private final RecyclerView f73562c;

    /* renamed from: d */
    private final DmtTextView f73563d;

    /* renamed from: e */
    private final DmtTextView f73564e;

    /* renamed from: f */
    private final ImageView f73565f;

    /* renamed from: g */
    private final ImageView f73566g;

    /* renamed from: h */
    private final DmtTextView f73567h;

    /* renamed from: i */
    private final C28005b f73568i = new C28005b();

    /* renamed from: j */
    private List<? extends SearchHistory> f73569j;

    /* renamed from: k */
    private final C28524b f73570k;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$a */
    public static final class C28004a {
        private C28004a() {
        }

        /* renamed from: a */
        public static int m66763a() {
            return C28003d.f73560a;
        }

        public /* synthetic */ C28004a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$b */
    static final class C28005b extends C1322a<C28007c> {

        /* renamed from: f */
        public static final C28006a f73571f = new C28006a(null);

        /* renamed from: a */
        public C28524b f73572a;

        /* renamed from: b */
        int f73573b;

        /* renamed from: c */
        public int f73574c;

        /* renamed from: d */
        public final List<SearchHistory> f73575d = new ArrayList();

        /* renamed from: e */
        public final List<SearchHistory> f73576e = new ArrayList();

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$b$a */
        public static final class C28006a {
            private C28006a() {
            }

            public /* synthetic */ C28006a(C52707g gVar) {
                this();
            }
        }

        public final int getItemCount() {
            return this.f73575d.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo56390a(List<? extends SearchHistory> list) {
            this.f73575d.clear();
            switch (this.f73574c) {
                case 0:
                    if (list != null) {
                        if (list.size() <= C28004a.m66763a()) {
                            this.f73575d.addAll(list);
                            break;
                        } else {
                            this.f73575d.addAll(list.subList(0, C28004a.m66763a()));
                            break;
                        }
                    }
                    break;
                case 1:
                    if (list != null) {
                        this.f73575d.addAll(list);
                        break;
                    }
                    break;
                default:
                    if (list != null) {
                        this.f73575d.addAll(list);
                        break;
                    }
                    break;
            }
            notifyDataSetChanged();
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "parent");
            C28524b bVar = this.f73572a;
            C52711k.m112240b(viewGroup, "parent");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsd, viewGroup, false);
            C52711k.m112236a((Object) inflate, "view");
            return new C28007c(inflate, viewGroup, bVar);
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            boolean z;
            int i2;
            C28007c cVar = (C28007c) vVar;
            C52711k.m112240b(cVar, "holder");
            SearchHistory searchHistory = (SearchHistory) this.f73575d.get(i);
            int i3 = 0;
            if (this.f73574c == 2) {
                z = true;
            } else {
                z = false;
            }
            C52711k.m112240b(searchHistory, "item");
            ViewGroup viewGroup = cVar.f73580c;
            if (viewGroup != null) {
                C1332i layoutManager = ((RecyclerView) viewGroup).getLayoutManager();
                if (layoutManager != null) {
                    int a = ((GridLayoutManager) layoutManager).f4526g.mo4691a(cVar.getAdapterPosition(), 2);
                    View view = cVar.itemView;
                    C52711k.m112236a((Object) view, "itemView");
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        if (C10181b.m20511a().mo18168a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", 31744, 0) == 3) {
                            i2 = C23728o.m58241a(8.0d);
                        } else {
                            i2 = C23728o.m58241a(16.0d);
                        }
                        if (a % 2 == 0) {
                            marginLayoutParams.leftMargin = 0;
                            marginLayoutParams.rightMargin = i2;
                        } else {
                            marginLayoutParams.leftMargin = i2;
                            marginLayoutParams.rightMargin = 0;
                        }
                        View view2 = cVar.itemView;
                        C52711k.m112236a((Object) view2, "itemView");
                        view2.setLayoutParams(marginLayoutParams);
                        ImageView imageView = cVar.f73579b;
                        C52711k.m112236a((Object) imageView, "deleteView");
                        if (!z) {
                            i3 = 8;
                        }
                        imageView.setVisibility(i3);
                        DmtTextView dmtTextView = cVar.f73578a;
                        C52711k.m112236a((Object) dmtTextView, "textView");
                        dmtTextView.setText(searchHistory.keyword);
                        cVar.itemView.setOnClickListener(new C28009b(cVar, z, searchHistory, i));
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$c */
    static final class C28007c extends C1352v {

        /* renamed from: e */
        public static final C28008a f73577e = new C28008a(null);

        /* renamed from: a */
        final DmtTextView f73578a;

        /* renamed from: b */
        final ImageView f73579b;

        /* renamed from: c */
        final ViewGroup f73580c;

        /* renamed from: d */
        public final C28524b f73581d;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$c$a */
        public static final class C28008a {
            private C28008a() {
            }

            public /* synthetic */ C28008a(C52707g gVar) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.d$c$b */
        static final class C28009b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C28007c f73582a;

            /* renamed from: b */
            final /* synthetic */ boolean f73583b;

            /* renamed from: c */
            final /* synthetic */ SearchHistory f73584c;

            /* renamed from: d */
            final /* synthetic */ int f73585d;

            C28009b(C28007c cVar, boolean z, SearchHistory searchHistory, int i) {
                this.f73582a = cVar;
                this.f73583b = z;
                this.f73584c = searchHistory;
                this.f73585d = i;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (this.f73583b) {
                    C28524b bVar = this.f73582a.f73581d;
                    if (bVar != null) {
                        bVar.mo58189b(this.f73584c, this.f73585d);
                    }
                } else {
                    C28524b bVar2 = this.f73582a.f73581d;
                    if (bVar2 != null) {
                        bVar2.mo58188a(this.f73584c, this.f73585d);
                    }
                }
            }
        }

        public C28007c(View view, ViewGroup viewGroup, C28524b bVar) {
            C52711k.m112240b(view, "itemView");
            C52711k.m112240b(viewGroup, "parent");
            super(view);
            this.f73580c = viewGroup;
            this.f73581d = bVar;
            this.f73578a = (DmtTextView) view.findViewById(R.id.dh5);
            this.f73579b = (ImageView) view.findViewById(R.id.azu);
            if (C41424g.m91245e()) {
                this.f73578a.setTextColor(view.getResources().getColor(R.color.gf));
            }
        }
    }

    static {
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        Integer searchHistoryCollapseNum = b.getSearchHistoryCollapseNum();
        C52711k.m112236a((Object) searchHistoryCollapseNum, "SettingsReader.get().searchHistoryCollapseNum");
        f73560a = searchHistoryCollapseNum.intValue();
    }

    /* renamed from: a */
    private final void m66761a() {
        int i;
        List<? extends SearchHistory> list = this.f73569j;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i <= f73560a || this.f73568i.f73574c == 2) {
            this.f73566g.setVisibility(8);
        } else {
            this.f73566g.setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo56388a(List<? extends SearchHistory> list) {
        this.f73569j = list;
        C28005b bVar = this.f73568i;
        bVar.f73576e.clear();
        if (list != null) {
            bVar.f73576e.addAll(list);
        }
        bVar.mo56390a(bVar.f73576e);
        m66761a();
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        int id = view.getId();
        if (id == R.id.azu) {
            this.f73565f.setVisibility(4);
            this.f73563d.setVisibility(0);
            this.f73564e.setVisibility(0);
            this.f73566g.setVisibility(8);
            C28005b bVar = this.f73568i;
            bVar.f73573b = bVar.f73574c;
            bVar.f73574c = 2;
            bVar.mo56390a(bVar.f73576e);
            return;
        }
        if (id == R.id.d95) {
            C28524b bVar2 = this.f73570k;
            if (bVar2 != null) {
                bVar2.mo58191e();
            }
        } else if (id == R.id.d9j) {
            this.f73565f.setVisibility(0);
            this.f73563d.setVisibility(8);
            this.f73564e.setVisibility(8);
            C28005b bVar3 = this.f73568i;
            bVar3.f73574c = bVar3.f73573b;
            bVar3.mo56390a(bVar3.f73576e);
            m66761a();
        } else if (id == R.id.axz || id == R.id.dhb) {
            if (this.f73568i.f73574c == 0) {
                C28005b bVar4 = this.f73568i;
                bVar4.f73574c = 1;
                bVar4.mo56390a(bVar4.f73576e);
                this.f73566g.setImageResource(R.drawable.dtj);
                if (this.f73566g.getVisibility() == 0) {
                    C26890h.m65011a("search_history", C23089d.m56640a().mo47829a("action_type", "show_all").f61491a);
                }
            } else if (this.f73568i.f73574c == 1) {
                C28005b bVar5 = this.f73568i;
                bVar5.f73574c = 0;
                bVar5.mo56390a(bVar5.f73576e);
                this.f73566g.setImageResource(R.drawable.dti);
            }
        }
    }

    public C28003d(View view, C28524b bVar) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73570k = bVar;
        View findViewById = view.findViewById(R.id.caf);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.recycler_view)");
        this.f73562c = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.d9j);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tv_done)");
        this.f73563d = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.d95);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.tv_delete_all)");
        this.f73564e = (DmtTextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.azu);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.iv_delete)");
        this.f73565f = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.axz);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.iv_arrow)");
        this.f73566g = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dhb);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.tv_title)");
        this.f73567h = (DmtTextView) findViewById6;
        this.f73562c.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
        this.f73562c.setAdapter(this.f73568i);
        this.f73568i.f73572a = this.f73570k;
        OnClickListener onClickListener = this;
        this.f73565f.setOnClickListener(onClickListener);
        this.f73564e.setOnClickListener(onClickListener);
        this.f73563d.setOnClickListener(onClickListener);
        this.f73567h.setOnClickListener(onClickListener);
        this.f73566g.setOnClickListener(onClickListener);
        if (C10181b.m20511a().mo18168a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", 31744, 0) != 0 || C41424g.m91245e()) {
            this.f73567h.setTextSize(15.0f);
            this.f73567h.setTypeface(null, 1);
            this.f73567h.setTextColor(view.getResources().getColor(R.color.as1));
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((MarginLayoutParams) layoutParams).bottomMargin = (int) C20141b.m49696a(view.getContext(), 3.0f);
                View findViewById7 = view.findViewById(R.id.cjn);
                C52711k.m112236a((Object) findViewById7, "itemView.findViewById<Vi…(R.id.search_nav_divider)");
                findViewById7.setVisibility(0);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
