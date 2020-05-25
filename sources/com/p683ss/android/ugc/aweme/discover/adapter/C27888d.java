package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.viewpager.C11159a;
import com.p683ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.d */
public final class C27888d extends C11159a {

    /* renamed from: d */
    protected List<Banner> f73259d;

    public final int getCount() {
        if (this.f73259d == null) {
            return 0;
        }
        return this.f73259d.size();
    }

    /* renamed from: a */
    public final void mo56303a(List<Banner> list) {
        if (this.f73259d != list) {
            this.f73259d = list;
            notifyDataSetChanged();
        }
    }

    public C27888d(Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
    }

    /* renamed from: a */
    public final View mo20489a(int i, View view, ViewGroup viewGroup) {
        BannerViewHolder bannerViewHolder;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bth, viewGroup, false);
            bannerViewHolder = new BannerViewHolder(view);
            view.setTag(bannerViewHolder);
        } else {
            bannerViewHolder = (BannerViewHolder) view.getTag();
        }
        if (getCount() > 0) {
            bannerViewHolder.mo56171a((Banner) this.f73259d.get(i), i);
            C27889e.m66642a(viewGroup, bannerViewHolder);
        }
        return view;
    }
}
