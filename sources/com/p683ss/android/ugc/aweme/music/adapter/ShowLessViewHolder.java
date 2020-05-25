package com.p683ss.android.ugc.aweme.music.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.ShowLessViewHolder */
public class ShowLessViewHolder extends C1352v {
    LinearLayout tvShowLess;

    public ShowLessViewHolder(View view, final C37287c cVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.tvShowLess.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                cVar.mo76595a(ShowLessViewHolder.this);
            }
        });
    }
}
