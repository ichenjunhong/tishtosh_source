package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.poi.model.C39103ai;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.c */
final /* synthetic */ class C39013c implements OnClickListener {

    /* renamed from: a */
    private final PoiDcdProductInfoViewHolder f99418a;

    /* renamed from: b */
    private final C39103ai f99419b;

    C39013c(PoiDcdProductInfoViewHolder poiDcdProductInfoViewHolder, C39103ai aiVar) {
        this.f99418a = poiDcdProductInfoViewHolder;
        this.f99419b = aiVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f99418a.mo79146a(this.f99419b, "click_more");
    }
}
