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
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.viewholder.d */
public final /* synthetic */ class C39014d implements OnClickListener {

    /* renamed from: a */
    private final PoiDcdProductViewHolder f99420a;

    /* renamed from: b */
    private final C39102ah f99421b;

    /* renamed from: c */
    private final C39067g f99422c;

    /* renamed from: d */
    private final String f99423d;

    /* renamed from: e */
    private final String f99424e;

    public C39014d(PoiDcdProductViewHolder poiDcdProductViewHolder, C39102ah ahVar, C39067g gVar, String str, String str2) {
        this.f99420a = poiDcdProductViewHolder;
        this.f99421b = ahVar;
        this.f99422c = gVar;
        this.f99423d = str;
        this.f99424e = str2;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PoiDcdProductViewHolder poiDcdProductViewHolder = this.f99420a;
        C39102ah ahVar = this.f99421b;
        C39067g gVar = this.f99422c;
        String str = this.f99423d;
        String str2 = this.f99424e;
        if (ahVar.buttonInfo != null && !TextUtils.isEmpty(ahVar.buttonInfo.getUrl())) {
            C39460p.m87760a(poiDcdProductViewHolder.itemView.getContext(), ahVar.buttonInfo.getSchemaType(), ahVar.buttonInfo.getUrl(), gVar.isFromLive().booleanValue() ? CustomActionPushReceiver.f104061f : "poi_page", "click_button");
            if (gVar.isFromLive().booleanValue()) {
                C39452l.m87730a(gVar, "project_click_price", C23089d.m56640a().mo47829a("page_type", "half_screen").mo47829a("anchor_id", gVar.getAnchorId()).mo47829a("room_id", gVar.getRoomId()).mo47829a("supplier_id", str).mo47829a("enter_from", CustomActionPushReceiver.f104061f).mo47829a("product_id", ahVar.extId).mo47829a("poi_id", gVar.getPoiId()).mo47829a("content_type", "home_stay").mo47829a("video_id", gVar.getAwemeId()));
            } else {
                C39452l.m87730a(gVar, "project_click_price", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("product_id", ahVar.extId).mo47829a("poi_id", gVar.getPoiId()).mo47829a("content_type", str2).mo47829a("video_id", gVar.getAwemeId()));
            }
        }
    }
}
