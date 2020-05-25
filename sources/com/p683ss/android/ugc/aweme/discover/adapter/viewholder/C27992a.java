package com.p683ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.adapter.C27824as;
import com.p683ss.android.ugc.aweme.discover.adapter.C27824as.C27825a;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28523a;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.a */
public final class C27992a extends C1352v {

    /* renamed from: f */
    public static final C27994a f73533f = new C27994a(null);

    /* renamed from: a */
    public RecyclerView f73534a;

    /* renamed from: b */
    public final C1322a<C27824as> f73535b;

    /* renamed from: c */
    public List<Word> f73536c = C52575l.m112097a();

    /* renamed from: d */
    public ViewGroup f73537d;

    /* renamed from: e */
    public View f73538e;

    /* renamed from: g */
    private DmtTextView f73539g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.a$a */
    public static final class C27994a {
        private C27994a() {
        }

        public /* synthetic */ C27994a(C52707g gVar) {
            this();
        }
    }

    public C27992a(View view, final C28523a aVar) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73535b = new C1322a<C27824as>(this) {

            /* renamed from: a */
            final /* synthetic */ C27992a f73540a;

            public final int getItemCount() {
                return this.f73540a.f73536c.size();
            }

            {
                this.f73540a = r1;
            }

            public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
                C52711k.m112240b(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bso, viewGroup, false);
                C52711k.m112236a((Object) inflate, "v");
                return new C27824as(inflate, aVar);
            }

            public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
                C27824as asVar = (C27824as) vVar;
                C52711k.m112240b(asVar, "viewholder");
                Word word = (Word) this.f73540a.f73536c.get(i);
                C52711k.m112240b(word, "item");
                asVar.f73101a.setText(word.getWord());
                if (!word.isShowed()) {
                    word.setShowed(true);
                    C26890h.m65011a("trending_words_show", C23089d.m56640a().mo47826a("words_position", asVar.getPosition()).mo47829a("words_source", "recom_search").mo47829a("words_content", word.getWord()).mo47829a("group_id", word.getId()).f61491a);
                }
                asVar.itemView.setOnClickListener(new C27825a(asVar, i, word));
            }
        };
        View findViewById = view.findViewById(R.id.bc3);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.listview)");
        this.f73534a = (RecyclerView) findViewById;
        this.f73534a.setAdapter(this.f73535b);
        View findViewById2 = view.findViewById(R.id.dr2);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.view_decoration)");
        this.f73538e = findViewById2;
        this.f73534a.setLayoutManager(new GuessWordLineViewHolder$2(view, view.getContext()));
        View findViewById3 = view.findViewById(R.id.dr4);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.view_decoration_text)");
        this.f73539g = (DmtTextView) findViewById3;
        this.f73539g.setText(this.f73539g.getResources().getString(R.string.aqr));
        View findViewById4 = view.findViewById(R.id.dr3);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.view_decoration_ll)");
        this.f73537d = (ViewGroup) findViewById4;
    }
}
