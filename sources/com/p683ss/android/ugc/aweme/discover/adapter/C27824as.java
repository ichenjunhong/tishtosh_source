package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28523a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.as */
public final class C27824as extends C1352v {

    /* renamed from: a */
    public TextView f73101a;

    /* renamed from: b */
    public final C28523a f73102b;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.as$a */
    public static final class C27825a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27824as f73103a;

        /* renamed from: b */
        final /* synthetic */ int f73104b;

        /* renamed from: c */
        final /* synthetic */ Word f73105c;

        public C27825a(C27824as asVar, int i, Word word) {
            this.f73103a = asVar;
            this.f73104b = i;
            this.f73105c = word;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C26890h.m65011a("trending_words_click", C23089d.m56640a().mo47826a("words_position", this.f73104b).mo47829a("words_source", "recom_search").mo47829a("words_content", this.f73105c.getWord()).mo47829a("group_id", this.f73105c.getId()).f61491a);
            C28523a aVar = this.f73103a.f73102b;
            if (aVar != null) {
                aVar.handleGuessWordItemClick(this.f73105c, this.f73104b);
            }
        }
    }

    public C27824as(View view, C28523a aVar) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73102b = aVar;
        View findViewById = view.findViewById(R.id.dgv);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tv_sug)");
        this.f73101a = (TextView) findViewById;
    }
}
