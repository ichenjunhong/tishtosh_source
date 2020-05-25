package com.p683ss.android.ugc.aweme.choosemusic.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.viewpager.C11159a;
import com.p683ss.android.ugc.aweme.choosemusic.viewholder.MusicBannerViewHolder;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.j */
public final class C24827j extends C11159a {

    /* renamed from: d */
    protected List<Banner> f65724d;

    /* renamed from: e */
    private int f65725e;

    public final int getCount() {
        if (this.f65724d == null) {
            return 0;
        }
        return this.f65724d.size();
    }

    /* renamed from: a */
    public final void mo50710a(List<Banner> list) {
        if (this.f65724d != list) {
            this.f65724d = list;
            notifyDataSetChanged();
        }
    }

    public C24827j(Context context, LayoutInflater layoutInflater, int i) {
        super(context, layoutInflater);
        this.f65725e = i;
    }

    /* renamed from: a */
    public final View mo20489a(int i, View view, ViewGroup viewGroup) {
        MusicBannerViewHolder musicBannerViewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.x8, viewGroup, false);
            musicBannerViewHolder = new MusicBannerViewHolder(view, this.f65725e);
            view.setTag(musicBannerViewHolder);
        } else {
            musicBannerViewHolder = (MusicBannerViewHolder) view.getTag();
        }
        if (getCount() > 0) {
            musicBannerViewHolder.mo50991a((Banner) this.f65724d.get(i), i);
        }
        return view;
    }
}
