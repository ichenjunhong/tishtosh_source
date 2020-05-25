package com.p683ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.ao */
final /* synthetic */ class C30027ao implements OnClickListener {

    /* renamed from: a */
    private final LocationCellBViewHolder f78379a;

    /* renamed from: b */
    private final View f78380b;

    /* renamed from: c */
    private final C24579d f78381c;

    C30027ao(LocationCellBViewHolder locationCellBViewHolder, View view, C24579d dVar) {
        this.f78379a = locationCellBViewHolder;
        this.f78380b = view;
        this.f78381c = dVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        LocationCellBViewHolder locationCellBViewHolder = this.f78379a;
        View view2 = this.f78380b;
        C24579d dVar = this.f78381c;
        if (((Aweme) locationCellBViewHolder.f70665k).getStatus() == null || !((Aweme) locationCellBViewHolder.f70665k).getStatus().isDelete()) {
            if (dVar != null) {
                dVar.mo50347a(view2, (Aweme) locationCellBViewHolder.f70665k, locationCellBViewHolder.f78253a);
            }
            return;
        }
        C10691a.m21548c(view2.getContext(), (int) R.string.fax).mo19066a();
    }
}
