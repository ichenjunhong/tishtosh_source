package com.p683ss.android.ugc.aweme.music.adapter.p1972a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.music.adapter.C37273b;
import com.p683ss.android.ugc.aweme.music.adapter.MusicCollectionViewHolder;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.p683ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.c */
public final class C37263c extends C26835b<List<C37283j>> {

    /* renamed from: a */
    private C37273b f95156a;

    public C37263c(C37273b bVar) {
        this.f95156a = bVar;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        return new MusicCollectionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xa, viewGroup, false), this.f95156a);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        return ((List) obj).get(i) instanceof MusicCollectionItem;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        MusicCollectionViewHolder musicCollectionViewHolder = (MusicCollectionViewHolder) vVar;
        MusicCollectionItem musicCollectionItem = (MusicCollectionItem) ((List) obj).get(i);
        musicCollectionViewHolder.f95104b = false;
        musicCollectionViewHolder.f95103a = musicCollectionItem;
        if (musicCollectionViewHolder.f95103a != null) {
            musicCollectionViewHolder.mNameView.setTextColor(musicCollectionViewHolder.itemView.getResources().getColor(R.color.py));
            musicCollectionViewHolder.mNameView.setText(musicCollectionViewHolder.f95103a.mcName);
            musicCollectionViewHolder.itemView.setBackgroundColor(musicCollectionViewHolder.itemView.getResources().getColor(R.color.as0));
            C23515d.m57669a(musicCollectionViewHolder.mCoverView, musicCollectionViewHolder.f95103a.awemeCover);
            musicCollectionViewHolder.mCoverView.setRotation(0.0f);
        }
    }
}
