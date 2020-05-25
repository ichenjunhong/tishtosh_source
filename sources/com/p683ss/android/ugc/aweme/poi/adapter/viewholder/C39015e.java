package com.p683ss.android.ugc.aweme.poi.adapter.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.C39102ah;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.poi.utils.C39460p;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.e */
public final /* synthetic */ class C39015e implements OnClickListener {

    /* renamed from: a */
    private final PoiDcdProductViewHolder f99425a;

    /* renamed from: b */
    private final C39102ah f99426b;

    /* renamed from: c */
    private final C39067g f99427c;

    /* renamed from: d */
    private final String f99428d;

    public C39015e(PoiDcdProductViewHolder poiDcdProductViewHolder, C39102ah ahVar, C39067g gVar, String str) {
        this.f99425a = poiDcdProductViewHolder;
        this.f99426b = ahVar;
        this.f99427c = gVar;
        this.f99428d = str;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiDcdProductViewHolder poiDcdProductViewHolder = this.f99425a;
        C39102ah ahVar = this.f99426b;
        C39067g gVar = this.f99427c;
        String str = this.f99428d;
        if (ahVar.detailInfo != null && !TextUtils.isEmpty(ahVar.detailInfo.getUrl())) {
            C39460p.m87760a(poiDcdProductViewHolder.itemView.getContext(), ahVar.detailInfo.getSchemaType(), ahVar.detailInfo.getUrl(), "poi_page", "click_card");
            C39452l.m87730a(gVar, "project_click_card", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("product_id", ahVar.extId).mo47829a("poi_id", gVar.getPoiId()).mo47829a("content_type", str).mo47829a("video_id", gVar.getAwemeId()));
        }
    }
}
