package com.p683ss.android.ugc.aweme.discover.adapter.viewholder;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28524b;
import com.p683ss.android.ugc.aweme.widget.flowlayout.C48393a;
import com.p683ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.p683ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c */
public final class C27998c extends C1352v {

    /* renamed from: d */
    public static final C27999a f73550d = new C27999a(null);

    /* renamed from: a */
    public final View f73551a;

    /* renamed from: b */
    public final TagFlowLayout f73552b;

    /* renamed from: c */
    public C28524b f73553c;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c$a */
    public static final class C27999a {
        private C27999a() {
        }

        public /* synthetic */ C27999a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c$b */
    public static final class C28000b extends C48393a<SearchHistory> {

        /* renamed from: a */
        final /* synthetic */ C27998c f73554a;

        /* renamed from: b */
        final /* synthetic */ List f73555b;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c$b$a */
        public static final class C28001a extends C28515aw {

            /* renamed from: a */
            final /* synthetic */ C28000b f73556a;

            /* renamed from: b */
            final /* synthetic */ SearchHistory f73557b;

            /* renamed from: c */
            final /* synthetic */ int f73558c;

            /* renamed from: b */
            public final void mo55272b(View view, MotionEvent motionEvent) {
                C52711k.m112240b(view, "view");
                C52711k.m112240b(motionEvent, "event");
                C28524b bVar = this.f73556a.f73554a.f73553c;
                if (bVar != null) {
                    bVar.mo58188a(this.f73557b, this.f73558c);
                }
            }

            C28001a(C28000b bVar, SearchHistory searchHistory, int i) {
                this.f73556a = bVar;
                this.f73557b = searchHistory;
                this.f73558c = i;
            }
        }

        public C28000b(C27998c cVar, List list, List list2) {
            this.f73554a = cVar;
            this.f73555b = list;
            super(list2);
        }

        /* renamed from: a */
        public final /* synthetic */ View mo56339a(FlowLayout flowLayout, int i, Object obj) {
            SearchHistory searchHistory = (SearchHistory) obj;
            C52711k.m112240b(flowLayout, "parent");
            C52711k.m112240b(searchHistory, "item");
            View view = this.f73554a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.bs3, flowLayout, false);
            TextView textView = (TextView) inflate.findViewById(R.id.dac);
            C52711k.m112236a((Object) textView, "word");
            textView.setText(searchHistory.keyword);
            inflate.setOnTouchListener(new C28001a(this, searchHistory, i));
            C52711k.m112236a((Object) inflate, "root");
            return inflate;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.viewholder.c$c */
    public static final class C28002c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C27998c f73559a;

        public C28002c(C27998c cVar) {
            this.f73559a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C28524b bVar = this.f73559a.f73553c;
            if (bVar != null) {
                bVar.mo58191e();
            }
        }
    }

    public C27998c(View view, C28524b bVar) {
        C52711k.m112240b(view, "itemView");
        super(view);
        this.f73553c = bVar;
        View findViewById = view.findViewById(R.id.tw);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.clear_history)");
        this.f73551a = findViewById;
        View findViewById2 = view.findViewById(R.id.cxb);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.tag_history)");
        this.f73552b = (TagFlowLayout) findViewById2;
    }
}
