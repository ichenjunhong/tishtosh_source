package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.av */
final /* synthetic */ class C30034av implements OnClickListener {

    /* renamed from: a */
    private final RecommendCellCViewHolder f78399a;

    /* renamed from: b */
    private final View f78400b;

    /* renamed from: c */
    private final C24579d f78401c;

    C30034av(RecommendCellCViewHolder recommendCellCViewHolder, View view, C24579d dVar) {
        this.f78399a = recommendCellCViewHolder;
        this.f78400b = view;
        this.f78401c = dVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        RecommendCellCViewHolder recommendCellCViewHolder = this.f78399a;
        View view2 = this.f78400b;
        C24579d dVar = this.f78401c;
        if (((Aweme) recommendCellCViewHolder.f70665k).getStatus() == null || !((Aweme) recommendCellCViewHolder.f70665k).getStatus().isDelete()) {
            if (dVar != null) {
                dVar.mo50347a(view2, (Aweme) recommendCellCViewHolder.f70665k, recommendCellCViewHolder.f78259a);
            }
            return;
        }
        C10691a.m21548c(view2.getContext(), (int) R.string.fax).mo19066a();
    }
}
