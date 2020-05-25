package com.p683ss.android.ugc.aweme.poi;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.poi.c */
public final class C39050c {

    /* renamed from: a */
    public static final C39050c f99549a = new C39050c();

    private C39050c() {
    }

    /* renamed from: a */
    public static final void m86874a(Context context, Aweme aweme, int i, C30669b bVar, int i2) {
        if (aweme != null) {
            SimplePoiInfoStruct simplePoiInfoStruct = aweme.getSimplePoiInfoStruct();
            if (simplePoiInfoStruct != null) {
                C39129m a = new C39129m().mo79718a(simplePoiInfoStruct.getPoiId()).mo79724f(simplePoiInfoStruct.getPoiName()).mo79715a(simplePoiInfoStruct);
                switch (i) {
                    case 1:
                        a.mo79729k("click_poi_picture");
                        break;
                    case 2:
                        a.mo79729k("click_check_more");
                        break;
                    case 3:
                        a.mo79729k("slide_left");
                        break;
                }
                if (bVar != null) {
                    a.mo79726h("poi_video_leaderboard").mo79737s(bVar.getEventType()).mo79730l(bVar.getBackendType()).mo79738t(bVar.getCityCode()).mo79722d(bVar.getDistrictCode()).mo79721c(bVar.getSubClass()).mo79720b(String.valueOf(i2));
                }
                if (context != null) {
                    SmartRouter.buildRoute(context, "aweme://poi/detail/").withParam("poi_bundle", (Serializable) a.mo79713a()).open();
                }
            }
        }
    }
}
