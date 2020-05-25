package com.p683ss.android.ugc.aweme.poi.adapter;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39014d;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.C39015e;
import com.p683ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductViewHolder;
import com.p683ss.android.ugc.aweme.poi.model.C39102ah;
import com.p683ss.android.ugc.aweme.poi.model.C39103ai;
import com.p683ss.android.ugc.aweme.poi.utils.C39452l;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.h */
public final class C38977h extends C1322a {

    /* renamed from: a */
    private C39103ai f99274a;

    /* renamed from: b */
    private List<C39102ah> f99275b;

    /* renamed from: c */
    private C39067g f99276c;

    public final int getItemCount() {
        return this.f99275b.size();
    }

    public C38977h(C39103ai aiVar, C39067g gVar) {
        this.f99274a = aiVar;
        this.f99275b = aiVar.products;
        this.f99276c = gVar;
    }

    public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (this.f99274a.isDcd()) {
            i2 = R.layout.bni;
        } else {
            i2 = R.layout.bnj;
        }
        return new PoiDcdProductViewHolder(from.inflate(i2, viewGroup, false));
    }

    public final void onBindViewHolder(C1352v vVar, int i) {
        String str;
        if (vVar instanceof PoiDcdProductViewHolder) {
            PoiDcdProductViewHolder poiDcdProductViewHolder = (PoiDcdProductViewHolder) vVar;
            C39102ah ahVar = (C39102ah) this.f99275b.get(i);
            String str2 = this.f99274a.supplierSource;
            C39067g gVar = this.f99276c;
            String str3 = this.f99274a.supplierId;
            if (ahVar != null) {
                if (ahVar.imageUrl != null) {
                    C23515d.m57669a(poiDcdProductViewHolder.mImage, ahVar.imageUrl);
                }
                poiDcdProductViewHolder.mName.setText(ahVar.name);
                poiDcdProductViewHolder.mPrice.setText(ahVar.price);
                if (!TextUtils.isEmpty(ahVar.onSale)) {
                    poiDcdProductViewHolder.mSalesPromotion.setVisibility(0);
                    poiDcdProductViewHolder.mSalesPromotion.setText(ahVar.onSale);
                } else {
                    poiDcdProductViewHolder.mSalesPromotion.setVisibility(4);
                }
                TextView textView = poiDcdProductViewHolder.mSubmitButton;
                if (ahVar.buttonInfo != null) {
                    str = ahVar.buttonInfo.getTitle();
                } else {
                    str = "";
                }
                textView.setText(str);
                TextView textView2 = poiDcdProductViewHolder.mSubmitButton;
                C39014d dVar = new C39014d(poiDcdProductViewHolder, ahVar, gVar, str3, str2);
                textView2.setOnClickListener(dVar);
                poiDcdProductViewHolder.itemView.setOnClickListener(new C39015e(poiDcdProductViewHolder, ahVar, gVar, str2));
            }
            if (this.f99276c.isFromLive().booleanValue()) {
                C39452l.m87730a(this.f99276c, "project_card_show", C23089d.m56640a().mo47829a("page_type", "half_screen").mo47829a("anchor_id", this.f99276c.getAnchorId()).mo47829a("room_id", this.f99276c.getRoomId()).mo47829a("supplier_id", this.f99274a.supplierId).mo47829a("enter_from", CustomActionPushReceiver.f104061f).mo47829a("product_id", ahVar.extId).mo47829a("poi_id", this.f99276c.getPoiId()).mo47829a("content_type", "home_stay").mo47829a("video_id", this.f99276c.getAwemeId()));
                return;
            }
            C39452l.m87730a(this.f99276c, "project_card_show", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("product_id", ahVar.extId).mo47829a("poi_id", this.f99276c.getPoiId()).mo47829a("content_type", this.f99274a.supplierSource).mo47829a("video_id", this.f99276c.getAwemeId()));
        }
    }
}
