package com.p683ss.android.ugc.aweme.music.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.MusicCollectionViewHolder */
public class MusicCollectionViewHolder extends C1352v {

    /* renamed from: a */
    public MusicCollectionItem f95103a;

    /* renamed from: b */
    public boolean f95104b;

    /* renamed from: c */
    private Context f95105c;
    public RemoteImageView mCoverView;
    public TextView mNameView;

    public MusicCollectionViewHolder(View view, final C37273b bVar) {
        super(view);
        this.f95105c = view.getContext();
        ButterKnife.bind((Object) this, view);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!C32800a.m75679a(view) && bVar != null) {
                    if (MusicCollectionViewHolder.this.f95104b) {
                        bVar.mo76593a(MusicCollectionViewHolder.this);
                        return;
                    }
                    bVar.mo76594a(MusicCollectionViewHolder.this, MusicCollectionViewHolder.this.f95103a);
                }
            }
        });
    }
}
