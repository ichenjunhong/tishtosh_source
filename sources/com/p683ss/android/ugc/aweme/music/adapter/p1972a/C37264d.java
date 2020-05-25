package com.p683ss.android.ugc.aweme.music.adapter.p1972a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.music.adapter.C37273b;
import com.p683ss.android.ugc.aweme.music.adapter.MusicCollectionViewHolder;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37284k;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.d */
public final class C37264d extends C26835b<List<C37283j>> {

    /* renamed from: a */
    private C37273b f95157a;

    public C37264d(C37273b bVar) {
        this.f95157a = bVar;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        return new MusicCollectionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xa, viewGroup, false), this.f95157a);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        return ((List) obj).get(i) instanceof C37284k;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        MusicCollectionViewHolder musicCollectionViewHolder = (MusicCollectionViewHolder) vVar;
        if (((C37284k) ((List) obj).get(i)).f95170a <= 0) {
            musicCollectionViewHolder.itemView.setVisibility(8);
            return;
        }
        musicCollectionViewHolder.itemView.setVisibility(0);
        musicCollectionViewHolder.f95103a = null;
        musicCollectionViewHolder.f95104b = true;
        musicCollectionViewHolder.mNameView.setTextColor(musicCollectionViewHolder.itemView.getResources().getColor(R.color.as3));
        musicCollectionViewHolder.mNameView.setText(musicCollectionViewHolder.itemView.getResources().getString(R.string.c7h));
        musicCollectionViewHolder.itemView.setBackgroundColor(musicCollectionViewHolder.itemView.getResources().getColor(R.color.as0));
        ((C13833a) musicCollectionViewHolder.mCoverView.getHierarchy()).mo25898a(C13818b.f36063c);
        C23515d.m57668a(musicCollectionViewHolder.mCoverView, (int) R.drawable.aqp);
    }
}
