package com.p683ss.android.ugc.aweme.music.adapter.p1972a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.music.adapter.C37289e;
import com.p683ss.android.ugc.aweme.music.adapter.C37292h.C37299a;
import com.p683ss.android.ugc.aweme.music.adapter.C37306l;
import com.p683ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.p683ss.android.ugc.aweme.music.p1975c.C37353f;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.k */
public final class C37271k extends C26835b<List<C37283j>> {

    /* renamed from: a */
    public String f95161a;

    /* renamed from: b */
    public C37306l<C37353f> f95162b;

    /* renamed from: c */
    public int f95163c = -1;

    /* renamed from: d */
    private C37289e f95164d;

    /* renamed from: e */
    private int f95165e;

    /* renamed from: f */
    private C37299a f95166f;

    /* renamed from: g */
    private int f95167g;

    /* renamed from: a */
    public final C37271k mo76592a(int i) {
        this.f95165e = i;
        return this;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        MusicUnitViewHolder musicUnitViewHolder = new MusicUnitViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vl, viewGroup, false), this.f95164d, this.f95167g, this.f95166f, this.f95162b);
        return musicUnitViewHolder;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        C37283j jVar = (C37283j) ((List) obj).get(i);
        if (!(jVar instanceof MusicModel) || ((MusicModel) jVar).getDataType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        boolean z;
        MusicUnitViewHolder musicUnitViewHolder = (MusicUnitViewHolder) vVar;
        MusicModel musicModel = (MusicModel) ((List) obj).get(i);
        String str = this.f95161a;
        if (i == this.f95163c) {
            z = true;
        } else {
            z = false;
        }
        musicUnitViewHolder.mo76584a(musicModel, str, z, this.f95165e);
    }

    public C37271k(C37289e eVar, int i, C37299a aVar, C37306l<C37353f> lVar, int i2) {
        this.f95164d = eVar;
        this.f95165e = i;
        this.f95166f = aVar;
        this.f95162b = lVar;
        this.f95167g = i2;
    }
}
