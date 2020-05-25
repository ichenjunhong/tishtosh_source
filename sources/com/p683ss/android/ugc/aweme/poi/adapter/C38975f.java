package com.p683ss.android.ugc.aweme.poi.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.uikit.viewpager.C11159a;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39012b;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder.C38992a;
import com.p683ss.android.ugc.aweme.poi.model.C39101ag;
import com.p683ss.android.ugc.aweme.poi.preview.C39159b;
import com.p683ss.android.ugc.aweme.poi.utils.C39467w;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.f */
public final class C38975f extends C11159a {

    /* renamed from: d */
    public List<C39101ag> f99267d;

    /* renamed from: e */
    private C38992a f99268e;

    /* renamed from: f */
    private String f99269f;

    public final int getCount() {
        if (this.f99267d == null) {
            return 0;
        }
        return this.f99267d.size();
    }

    /* renamed from: a */
    public final View mo20489a(int i, View view, ViewGroup viewGroup) {
        PoiBannerViewHolder poiBannerViewHolder;
        String str;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bnc, viewGroup, false);
            poiBannerViewHolder = new PoiBannerViewHolder(view, this.f99268e);
            view.setTag(poiBannerViewHolder);
        } else {
            poiBannerViewHolder = (PoiBannerViewHolder) view.getTag();
        }
        if (getCount() > 0) {
            C39101ag agVar = (C39101ag) this.f99267d.get(i);
            String str2 = this.f99269f;
            if (agVar != null) {
                poiBannerViewHolder.f99330a = agVar;
                UrlModel picMedium = poiBannerViewHolder.f99330a.getPicMedium();
                if (picMedium == null || C9376b.m18558a((Collection<T>) picMedium.getUrlList())) {
                    str = null;
                } else {
                    str = (String) picMedium.getUrlList().get(0);
                }
                C23515d.m57675a(poiBannerViewHolder.mSdCover, picMedium, (C14234d) new C39467w(str2, str, C39159b.m87006b()));
                if (!TextUtils.isEmpty(agVar.uploadImageWaterMark)) {
                    poiBannerViewHolder.mWaterMark.setVisibility(0);
                    poiBannerViewHolder.mWaterMark.setText(agVar.uploadImageWaterMark);
                } else {
                    poiBannerViewHolder.mWaterMark.setVisibility(8);
                }
                poiBannerViewHolder.itemView.setOnClickListener(new C39012b(poiBannerViewHolder));
            }
        }
        return view;
    }

    public C38975f(Context context, LayoutInflater layoutInflater, String str, C38992a aVar) {
        super(context, layoutInflater);
        this.f99268e = aVar;
        this.f99269f = str;
    }
}
