package com.p683ss.android.ugc.aweme.music.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.ChallengeTitleViewHolder */
public class ChallengeTitleViewHolder extends C1352v {

    /* renamed from: a */
    private Context f95101a;
    public LinearLayout rootLayout;
    public TextView title;

    public ChallengeTitleViewHolder(View view) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f95101a = view.getContext();
    }

    /* renamed from: a */
    public final void mo76580a(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.itemView.getLayoutParams();
        if (z) {
            layoutParams.height = -2;
            layoutParams.width = -1;
            this.itemView.setVisibility(0);
        } else {
            this.itemView.setVisibility(8);
            layoutParams.height = 0;
            layoutParams.width = 0;
        }
        this.itemView.setLayoutParams(layoutParams);
    }
}
