package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.poi.model.C39101ag;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder */
public class PoiBannerViewHolder extends C1352v {

    /* renamed from: a */
    public C39101ag f99330a;

    /* renamed from: b */
    C38992a f99331b;
    public RemoteImageView mSdCover;
    public DmtTextView mWaterMark;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.PoiBannerViewHolder$a */
    public interface C38992a {
        /* renamed from: a */
        void mo79138a();
    }

    public PoiBannerViewHolder(View view, C38992a aVar) {
        super(view);
        ButterKnife.bind((Object) this, view);
        this.f99331b = aVar;
    }
}
