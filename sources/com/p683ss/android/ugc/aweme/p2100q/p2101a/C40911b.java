package com.p683ss.android.ugc.aweme.p2100q.p2101a;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.q.a.b */
final /* synthetic */ class C40911b implements OnClickListener {

    /* renamed from: a */
    private final C40909a f104118a;

    /* renamed from: b */
    private final View f104119b;

    /* renamed from: c */
    private final C24579d f104120c;

    C40911b(C40909a aVar, View view, C24579d dVar) {
        this.f104118a = aVar;
        this.f104119b = view;
        this.f104120c = dVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40909a aVar = this.f104118a;
        View view2 = this.f104119b;
        C24579d dVar = this.f104120c;
        if (((Aweme) aVar.f70665k).getStatus() == null || !((Aweme) aVar.f70665k).getStatus().isDelete()) {
            if (dVar != null) {
                dVar.mo50347a(view2, (Aweme) aVar.f70665k, aVar.f104110a);
            }
            return;
        }
        C10691a.m21548c(view2.getContext(), (int) R.string.fax).mo19066a();
    }
}
