package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.b */
public final /* synthetic */ class C39012b implements OnClickListener {

    /* renamed from: a */
    private final PoiBannerViewHolder f99417a;

    public C39012b(PoiBannerViewHolder poiBannerViewHolder) {
        this.f99417a = poiBannerViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiBannerViewHolder poiBannerViewHolder = this.f99417a;
        if (poiBannerViewHolder.f99331b != null) {
            poiBannerViewHolder.f99331b.mo79138a();
        }
    }
}
