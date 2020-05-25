package com.p683ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.discover.adapter.SearchHistoryItemViewHolder;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28524b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.b */
public final class C27995b extends C1352v {

    /* renamed from: d */
    public static final C27997a f73542d = new C27997a(null);

    /* renamed from: a */
    public final C1322a<SearchHistoryItemViewHolder> f73543a;

    /* renamed from: b */
    public List<? extends SearchHistory> f73544b = C52575l.m112097a();

    /* renamed from: c */
    public ViewGroup f73545c;

    /* renamed from: e */
    private RecyclerView f73546e;

    /* renamed from: f */
    private DmtTextView f73547f;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.b$a */
    public static final class C27997a {
        private C27997a() {
        }

        public /* synthetic */ C27997a(C52707g gVar) {
            this();
        }
    }

    public C27995b(View view, final C28524b bVar) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73543a = new C1322a<SearchHistoryItemViewHolder>(this) {

            /* renamed from: a */
            final /* synthetic */ C27995b f73548a;

            public final int getItemCount() {
                return this.f73548a.f73544b.size();
            }

            {
                this.f73548a = r1;
            }

            public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
                SearchHistoryItemViewHolder searchHistoryItemViewHolder = (SearchHistoryItemViewHolder) vVar;
                C52711k.m112240b(searchHistoryItemViewHolder, "viewholder");
                SearchHistory searchHistory = (SearchHistory) this.f73548a.f73544b.get(i);
                searchHistoryItemViewHolder.mContentView.setText(searchHistory.keyword);
                searchHistoryItemViewHolder.itemView.setOnTouchListener(new C28515aw(searchHistory, i) {

                    /* renamed from: a */
                    final /* synthetic */ SearchHistory f72963a;

                    /* renamed from: b */
                    final /* synthetic */ int f72964b;

                    /* renamed from: b */
                    public final void mo55272b(View view, MotionEvent motionEvent) {
                        if (SearchHistoryItemViewHolder.this.f72961b != null) {
                            SearchHistoryItemViewHolder.this.f72961b.mo58188a(this.f72963a, this.f72964b);
                        }
                    }

                    {
                        this.f72963a = r2;
                        this.f72964b = r3;
                    }
                });
                searchHistoryItemViewHolder.f72960a = searchHistory;
            }

            public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
                C52711k.m112240b(viewGroup, "parent");
                SearchHistoryItemViewHolder searchHistoryItemViewHolder = new SearchHistoryItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bsf, viewGroup, false), bVar);
                C52711k.m112236a((Object) searchHistoryItemViewHolder, "SearchHistoryItemViewHol…te(parent, actionHandler)");
                return searchHistoryItemViewHolder;
            }
        };
        View findViewById = view.findViewById(R.id.bc3);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.listview)");
        this.f73546e = (RecyclerView) findViewById;
        this.f73546e.setAdapter(this.f73543a);
        this.f73546e.setLayoutManager(new SearchHistoryLinesViewHolder$2(view, view.getContext()));
        View findViewById2 = view.findViewById(R.id.dr4);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.view_decoration_text)");
        this.f73547f = (DmtTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dr3);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.view_decoration_ll)");
        this.f73545c = (ViewGroup) findViewById3;
    }
}
