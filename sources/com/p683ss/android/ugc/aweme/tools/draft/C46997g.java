package com.p683ss.android.ugc.aweme.tools.draft;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.g */
final /* synthetic */ class C46997g implements OnClickListener {

    /* renamed from: a */
    private final AwemeDraftViewHolder f118707a;

    C46997g(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f118707a = awemeDraftViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        AwemeDraftViewHolder awemeDraftViewHolder = this.f118707a;
        if (awemeDraftViewHolder.f118612e) {
            awemeDraftViewHolder.f118611d.setChecked(!((C29059c) awemeDraftViewHolder.f70665k).f76165w);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - awemeDraftViewHolder.f118615h >= 500) {
            awemeDraftViewHolder.f118615h = currentTimeMillis;
            awemeDraftViewHolder.f118614g.mo94251a(awemeDraftViewHolder.getAdapterPosition(), (C29059c) awemeDraftViewHolder.f70665k);
        }
    }
}
