package com.p683ss.android.ugc.aweme.choosemusic.viewholder;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.choosemusic.p1503b.C24834c;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicClassItemViewHolder */
public class MusicClassItemViewHolder extends C1352v implements OnClickListener {

    /* renamed from: a */
    MusicCollectionItem f66208a;

    /* renamed from: b */
    private int f66209b;

    /* renamed from: c */
    private C24834c f66210c;
    RemoteImageView mIvClassCover;
    TextView mTvClassName;

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!(C32800a.m75679a(view) || this.f66208a == null || this.itemView == null || this.f66210c == null)) {
            this.f66210c.mo50735a(this.f66208a, this.f66209b);
        }
    }

    public MusicClassItemViewHolder(View view, int i, C24834c cVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f66209b = i;
        this.itemView.setOnClickListener(this);
        this.f66210c = cVar;
    }
}
