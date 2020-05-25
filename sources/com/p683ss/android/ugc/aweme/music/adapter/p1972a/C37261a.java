package com.p683ss.android.ugc.aweme.music.adapter.p1972a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
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

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.a */
public final class C37261a extends C26835b<List<C37283j>> {

    /* renamed from: a */
    public String f95147a;

    /* renamed from: b */
    public C37306l<C37353f> f95148b;

    /* renamed from: c */
    public int f95149c = -1;

    /* renamed from: d */
    private MusicUnitViewHolder f95150d;

    /* renamed from: e */
    private C37289e f95151e;

    /* renamed from: f */
    private int f95152f;

    /* renamed from: g */
    private C37299a f95153g;

    /* renamed from: h */
    private int f95154h;

    /* renamed from: a */
    public final C37261a mo76590a(int i) {
        this.f95152f = i;
        return this;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        MusicUnitViewHolder musicUnitViewHolder = new MusicUnitViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vl, viewGroup, false), this.f95151e, this.f95154h, this.f95153g, this.f95148b);
        return musicUnitViewHolder;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        C37283j jVar = (C37283j) ((List) obj).get(i);
        if (!(jVar instanceof MusicModel) || ((MusicModel) jVar).getDataType() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        boolean z;
        List list2 = (List) obj;
        this.f95150d = (MusicUnitViewHolder) vVar;
        MusicUnitViewHolder musicUnitViewHolder = this.f95150d;
        MusicModel musicModel = (MusicModel) list2.get(i);
        String str = this.f95147a;
        if (this.f95149c == i) {
            z = true;
        } else {
            z = false;
        }
        musicUnitViewHolder.mo76584a(musicModel, str, z, this.f95152f);
        C26890h.m65011a("show_music", C23089d.m56640a().mo47829a("music_id", ((MusicModel) list2.get(i)).getMusicId()).mo47829a("enter_from", "challenge_bonding").f61491a);
    }

    public C37261a(C37289e eVar, int i, C37299a aVar, C37306l<C37353f> lVar, int i2) {
        this.f95151e = eVar;
        this.f95152f = i;
        this.f95153g = aVar;
        this.f95148b = lVar;
        this.f95154h = i2;
    }
}
