package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.as */
final /* synthetic */ class C30031as implements OnClickListener {

    /* renamed from: a */
    private final PoiDetailViewHolder f78388a;

    /* renamed from: b */
    private final View f78389b;

    /* renamed from: c */
    private final C24579d f78390c;

    C30031as(PoiDetailViewHolder poiDetailViewHolder, View view, C24579d dVar) {
        this.f78388a = poiDetailViewHolder;
        this.f78389b = view;
        this.f78390c = dVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiDetailViewHolder poiDetailViewHolder = this.f78388a;
        View view2 = this.f78389b;
        C24579d dVar = this.f78390c;
        if (((Aweme) poiDetailViewHolder.f70665k).getStatus() == null || !((Aweme) poiDetailViewHolder.f70665k).getStatus().isDelete()) {
            if (dVar != null) {
                dVar.mo50347a(view2, (Aweme) poiDetailViewHolder.f70665k, poiDetailViewHolder.f78256a);
            }
            return;
        }
        C10691a.m21548c(view2.getContext(), (int) R.string.fax).mo19066a();
    }
}
