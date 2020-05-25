package com.p683ss.android.ugc.aweme.favorites.viewholder;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29677g;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29660c;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29663e;
import com.p683ss.android.ugc.aweme.favorites.p1704d.C29692a;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.poi.C39040b;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.service.IPoiService;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListItemViewHolder */
public final class PoiCollectListItemViewHolder extends JediSimpleViewHolder<C29677g> {

    /* renamed from: f */
    public final View f77735f;

    /* renamed from: g */
    private SimplePoiInfoStruct f77736g;

    /* renamed from: j */
    private C29663e f77737j;

    /* renamed from: k */
    private C39040b f77738k;

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListItemViewHolder$a */
    static final class C29761a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SimplePoiInfoStruct f77739a;

        /* renamed from: b */
        final /* synthetic */ PoiCollectListItemViewHolder f77740b;

        C29761a(SimplePoiInfoStruct simplePoiInfoStruct, PoiCollectListItemViewHolder poiCollectListItemViewHolder) {
            this.f77739a = simplePoiInfoStruct;
            this.f77740b = poiCollectListItemViewHolder;
        }

        public final void onClick(View view) {
            boolean z;
            ClickInstrumentation.onClick(view);
            C39128l lVar = new C39128l();
            lVar.poiId = this.f77739a.getPoiId();
            lVar.poiName = this.f77739a.getPoiName();
            lVar.from = "collection_poi";
            lVar.clickMethod = "click_collection_poi";
            lVar.isCoupon = "0";
            View view2 = this.f77740b.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            SmartRouter.buildRoute(view2.getContext(), "//poi/detail").withParam("poi_bundle", (Serializable) lVar).open();
            String poiId = this.f77739a.getPoiId();
            String str = "collection_poi";
            String str2 = "";
            if (((C29677g) this.f77740b.mo22689o()).f77570a == 0) {
                z = true;
            } else {
                z = false;
            }
            C29692a.m69738a(poiId, str, str2, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.viewholder.PoiCollectListItemViewHolder$b */
    static final class C29762b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C29663e f77741a;

        /* renamed from: b */
        final /* synthetic */ PoiCollectListItemViewHolder f77742b;

        C29762b(C29663e eVar, PoiCollectListItemViewHolder poiCollectListItemViewHolder) {
            this.f77741a = eVar;
            this.f77742b = poiCollectListItemViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            IPoiService createIPoiServicebyMonsterPlugin = PoiServiceImpl.createIPoiServicebyMonsterPlugin();
            View view2 = this.f77742b.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            Context context = view2.getContext();
            C52711k.m112236a((Object) context, "itemView.context");
            createIPoiServicebyMonsterPlugin.openUrl(context, this.f77741a.f77540b, "collection_poi", "");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo22662a(Object obj) {
        C29677g gVar = (C29677g) obj;
        C52711k.m112240b(gVar, "item");
        if (gVar.f77571b instanceof C29660c) {
            boolean z = false;
            if (((C29660c) gVar.f77571b).f77535a == 1) {
                this.f77736g = ((C29660c) gVar.f77571b).f77536b;
                SimplePoiInfoStruct simplePoiInfoStruct = this.f77736g;
                if (simplePoiInfoStruct != null) {
                    this.f77738k.mo56196a(-1, simplePoiInfoStruct);
                    String poiId = simplePoiInfoStruct.getPoiId();
                    if (((C29677g) mo22689o()).f77570a == 0) {
                        z = true;
                    }
                    C29692a.m69735a(1, poiId, z);
                    this.f77735f.setOnClickListener(new C29761a(simplePoiInfoStruct, this));
                }
            } else {
                this.f77737j = ((C29660c) gVar.f77571b).f77537c;
                C29663e eVar = this.f77737j;
                if (eVar != null) {
                    this.f77738k.mo56195a(-1, eVar);
                    String str = eVar.f77545g;
                    if (((C29677g) mo22689o()).f77570a == 0) {
                        z = true;
                    }
                    C29692a.m69736a(1, str, z, eVar.f77541c, eVar.f77542d);
                    this.f77735f.setOnClickListener(new C29762b(eVar, this));
                }
            }
        }
    }
}
