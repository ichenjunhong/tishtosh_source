package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout;
import com.p683ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout.C28023b;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.a */
public abstract class C39010a<ITEM> extends C1352v implements C28023b {

    /* renamed from: f */
    public static final C39011a f99411f = new C39011a(null);

    /* renamed from: a */
    public RecyclerView f99412a;

    /* renamed from: b */
    public final Context f99413b;

    /* renamed from: c */
    public ScrollToOpenLayout f99414c;

    /* renamed from: d */
    public DmtTextView f99415d;

    /* renamed from: e */
    public List<? extends ITEM> f99416e;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.a$a */
    public static final class C39011a {
        private C39011a() {
        }

        public /* synthetic */ C39011a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final int mo79160b() {
        List<? extends ITEM> list = this.f99416e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public C39010a(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.qx);
        C52711k.m112236a((Object) recyclerView, "itemView.card_list");
        this.f99412a = recyclerView;
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f99413b = context;
        ScrollToOpenLayout scrollToOpenLayout = (ScrollToOpenLayout) view.findViewById(R.id.chw);
        C52711k.m112236a((Object) scrollToOpenLayout, "itemView.scroll_to_open");
        this.f99414c = scrollToOpenLayout;
        DmtTextView dmtTextView = (DmtTextView) view.findViewById(R.id.cyg);
        C52711k.m112236a((Object) dmtTextView, "itemView.textView3");
        this.f99415d = dmtTextView;
        this.f99412a.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
    }
}
