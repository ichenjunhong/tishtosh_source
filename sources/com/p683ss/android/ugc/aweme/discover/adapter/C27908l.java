package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.l */
final /* synthetic */ class C27908l implements OnClickListener {

    /* renamed from: a */
    private final CoverViewHolder f73302a;

    /* renamed from: b */
    private final C24579d f73303b;

    C27908l(CoverViewHolder coverViewHolder, C24579d dVar) {
        this.f73302a = coverViewHolder;
        this.f73303b = dVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CoverViewHolder coverViewHolder = this.f73302a;
        C24579d dVar = this.f73303b;
        if (dVar != null) {
            dVar.mo50347a(view, (Aweme) coverViewHolder.f70665k, null);
        }
    }
}
