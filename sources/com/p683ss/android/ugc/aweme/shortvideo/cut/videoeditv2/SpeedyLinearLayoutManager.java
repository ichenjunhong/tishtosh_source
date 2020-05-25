package com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1346r;
import android.support.p043v7.widget.RecyclerView.C1346r.C1347a;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.DisplayMetrics;
import android.view.View;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager */
public final class SpeedyLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public static final C43137a f108979a = new C43137a(null);

    /* renamed from: b */
    private C1415af f108980b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager$a */
    public static final class C43137a {
        private C43137a() {
        }

        public /* synthetic */ C43137a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.SpeedyLinearLayoutManager$b */
    public static final class C43138b extends C1415af {

        /* renamed from: f */
        final /* synthetic */ RecyclerView f108981f;

        /* renamed from: b */
        public final int mo5494b() {
            return -1;
        }

        /* renamed from: a */
        public final float mo5490a(DisplayMetrics displayMetrics) {
            C52711k.m112240b(displayMetrics, "displayMetrics");
            return 440.0f / ((float) displayMetrics.densityDpi);
        }

        C43138b(RecyclerView recyclerView, Context context) {
            this.f108981f = recyclerView;
            super(context);
        }

        /* renamed from: a */
        public final void mo5110a(View view, C1349s sVar, C1347a aVar) {
            C52711k.m112240b(view, "targetView");
            C52711k.m112240b(sVar, "state");
            C52711k.m112240b(aVar, "action");
            int a = mo5493a(view, mo5494b());
            int b = mo5495b(a);
            if (b > 0) {
                aVar.mo5113a(-a, 0, b, this.f5104a);
            }
        }
    }

    public SpeedyLinearLayoutManager(Context context, int i, boolean z) {
        C52711k.m112240b(context, "context");
        super(context, 0, false);
    }

    /* renamed from: a */
    public final void mo4726a(RecyclerView recyclerView, C1349s sVar, int i) {
        C52711k.m112240b(recyclerView, "recyclerView");
        if (this.f108980b == null) {
            this.f108980b = new C43138b(recyclerView, recyclerView.getContext());
        }
        C1415af afVar = this.f108980b;
        if (afVar == null) {
            C52711k.m112234a();
        }
        afVar.f4778g = i;
        mo5022a((C1346r) this.f108980b);
    }
}
