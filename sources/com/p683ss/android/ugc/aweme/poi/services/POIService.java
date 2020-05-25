package com.p683ss.android.ugc.aweme.poi.services;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.poi.IPOIService;
import com.p683ss.android.ugc.aweme.poi.IPOIService.C38951b;
import com.p683ss.android.ugc.aweme.poi.IPOIService.C38952c;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2059b.C39045e;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.PoiContext;
import com.p683ss.android.ugc.aweme.poi.search.C39241l;
import com.p683ss.android.ugc.aweme.utils.C47759cc;

/* renamed from: com.ss.android.ugc.aweme.poi.services.POIService */
public class POIService implements IPOIService {
    public static IPOIService createIPOIServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IPOIService.class);
        if (a != null) {
            return (IPOIService) a;
        }
        if (C27991b.f73491av == null) {
            synchronized (IPOIService.class) {
                if (C27991b.f73491av == null) {
                    C27991b.f73491av = new POIService();
                }
            }
        }
        return (POIService) C27991b.f73491av;
    }

    public PoiStruct poiContext2PoiStruct(String str) {
        PoiContext unserializeFromJson = PoiContext.unserializeFromJson(str);
        if (unserializeFromJson == null) {
            return null;
        }
        PoiStruct poiStruct = new PoiStruct();
        poiStruct.poiId = unserializeFromJson.mSelectPoiId;
        poiStruct.poiName = unserializeFromJson.mSelectPoiName;
        return poiStruct;
    }

    public String poiStruct2PoiContext(PoiStruct poiStruct) {
        PoiContext poiContext = new PoiContext();
        poiContext.mSelectPoiId = poiStruct.poiId;
        poiContext.mSelectPoiName = poiStruct.poiName;
        return C47759cc.m103382a().getGson().mo34889b(poiContext);
    }

    public Dialog getPOISearchDialog(Activity activity, Bundle bundle, C38951b bVar) {
        C39241l lVar = new C39241l(activity, bundle);
        lVar.setOwnerActivity(activity);
        lVar.f100205d = new C39251a(bVar, lVar);
        return lVar;
    }

    static final /* synthetic */ void lambda$getPOISearchDialog$0$POIService(C38951b bVar, C39241l lVar, C39045e eVar) {
        C38952c cVar;
        if (eVar.f99538a == 2) {
            cVar = C38952c.RESULT_MANUAL;
        } else {
            cVar = C38952c.RESULT_DEFAULT;
        }
        if (eVar.f99539b != null) {
            bVar.mo79003a(cVar, eVar.f99539b, lVar.mo79989b());
            return;
        }
        PoiStruct poiStruct = new PoiStruct();
        poiStruct.setPoiId("NULL");
        bVar.mo79003a(cVar, poiStruct, lVar.mo79989b());
    }
}
