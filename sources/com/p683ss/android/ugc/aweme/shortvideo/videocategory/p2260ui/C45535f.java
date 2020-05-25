package com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2256a.C45490b;
import com.p683ss.android.ugc.aweme.utils.C47755ca;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.f */
public final class C45535f extends C1352v {

    /* renamed from: a */
    final DmtTextView f115054a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.f$a */
    public static final class C45536a extends C47755ca {

        /* renamed from: a */
        final /* synthetic */ C45535f f115055a;

        /* renamed from: b */
        final /* synthetic */ C52682m f115056b;

        /* renamed from: c */
        final /* synthetic */ C45490b f115057c;

        /* renamed from: a */
        public final void mo58980a(View view) {
            C52711k.m112240b(view, "v");
            this.f115056b.invoke(Integer.valueOf(this.f115055a.getAdapterPosition()), this.f115057c.f114946c);
        }

        C45536a(C45535f fVar, C52682m mVar, C45490b bVar, int i) {
            this.f115055a = fVar;
            this.f115056b = mVar;
            this.f115057c = bVar;
            super(600, false, 2, null);
        }
    }

    public C45535f(View view) {
        C52711k.m112240b(view, "itemView");
        super(view);
        View findViewById = view.findViewById(R.id.f1c);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.tvVideoCategory)");
        this.f115054a = (DmtTextView) findViewById;
    }
}
