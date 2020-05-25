package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.be */
final /* synthetic */ class C27858be implements OnClickListener {

    /* renamed from: a */
    private final C27857bd f73193a;

    C27858be(C27857bd bdVar) {
        this.f73193a = bdVar;
    }

    public final void onClick(View view) {
        int i;
        ClickInstrumentation.onClick(view);
        C27857bd bdVar = this.f73193a;
        if (bdVar.f73189d != null && bdVar.f73189d.poi != null) {
            SimplePoiInfoStruct simplePoiInfoStruct = bdVar.f73189d.poi;
            C39129m m = new C39129m().mo79718a(simplePoiInfoStruct.getPoiId()).mo79724f(simplePoiInfoStruct.getPoiName()).mo79715a(simplePoiInfoStruct).mo79726h(bdVar.f73191f ? "general_search" : "search_result").mo79729k("click_search_result").mo79731m(bdVar.f73189d.logPb);
            if (bdVar.f73191f) {
                i = -1;
            } else {
                i = bdVar.getAdapterPosition();
            }
            m.f99841g = i;
            m.f99840f = bdVar.f73190e;
            C39128l a = m.mo79713a();
            C28381ab.m67350a(view, simplePoiInfoStruct.getPoiId(), -1);
            SmartRouter.buildRoute(bdVar.f73188c, "//poi/detail").withParam("poi_bundle", (Serializable) a).open();
        }
    }
}
