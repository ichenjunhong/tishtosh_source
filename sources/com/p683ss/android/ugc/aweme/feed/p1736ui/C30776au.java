package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.feed.adapter.C30106p;
import com.p683ss.android.ugc.aweme.feed.api.C30151i;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.au */
public final class C30776au extends LinearLayout {

    /* renamed from: a */
    public boolean f80656a;

    /* renamed from: b */
    C30106p f80657b;

    /* renamed from: c */
    private RecyclerView f80658c = ((RecyclerView) LayoutInflater.from(getContext()).inflate(R.layout.bae, this, true).findViewById(R.id.caf));

    /* renamed from: d */
    private LinearLayoutManager f80659d;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.au$a */
    static final class C30777a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C30776au f80660a;

        C30777a(C30776au auVar) {
            this.f80660a = auVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            this.f80660a.f80656a = true;
            return C52860x.f131107a;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo63487a(int i) {
        RecyclerView recyclerView = this.f80658c;
        if (recyclerView != null) {
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
                ((LinearLayoutManager) layoutManager).mo4721a(i, 0);
            }
        }
    }

    public final void setData(List<C30151i> list) {
        C52711k.m112240b(list, "users");
        C30106p pVar = this.f80657b;
        if (pVar == null) {
            C52711k.m112237a("mAdapter");
        }
        pVar.mo50303a(list);
        RecyclerView recyclerView = this.f80658c;
        if (recyclerView != null) {
            recyclerView.mo4814b(0);
        }
    }

    public C30776au(Context context) {
        C52711k.m112240b(context, "context");
        super(context);
        setLayoutParams(new LayoutParams(-1, -2));
        Context context2 = getContext();
        C52711k.m112236a((Object) context2, "context");
        this.f80659d = new CallBackLinearLayoutManager(context2, 0, false, new C30777a(this));
        RecyclerView recyclerView = this.f80658c;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(this.f80659d);
        }
        this.f80657b = new C30106p();
        RecyclerView recyclerView2 = this.f80658c;
        if (recyclerView2 != null) {
            C30106p pVar = this.f80657b;
            if (pVar == null) {
                C52711k.m112237a("mAdapter");
            }
            recyclerView2.setAdapter(pVar);
        }
    }
}
