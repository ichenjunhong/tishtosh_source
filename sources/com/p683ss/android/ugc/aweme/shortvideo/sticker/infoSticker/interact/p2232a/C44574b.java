package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.p2232a;

import android.app.Activity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.poi.IPOIService.C38951b;
import com.p683ss.android.ugc.aweme.poi.IPOIService.C38952c;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.a.b */
final /* synthetic */ class C44574b implements C38951b {

    /* renamed from: a */
    private final C44572a f112772a;

    /* renamed from: b */
    private final Activity f112773b;

    C44574b(C44572a aVar, Activity activity) {
        this.f112772a = aVar;
        this.f112773b = activity;
    }

    /* renamed from: a */
    public final void mo79003a(C38952c cVar, PoiStruct poiStruct, String str) {
        C44572a aVar = this.f112772a;
        Activity activity = this.f112773b;
        if (aVar.f112768a != null) {
            aVar.f112768a.mo74233a(cVar, poiStruct, str);
            if (activity != null && !activity.isFinishing()) {
                String a = C44572a.m97512a("enter_from", activity);
                String valueFromPoiStruct = PoiServiceImpl.createIPoiServicebyMonsterPlugin().getValueFromPoiStruct(poiStruct, "keyword");
                String str2 = TextUtils.isEmpty(valueFromPoiStruct) ? "default_search_poi" : "search_poi";
                if (("NULL".equalsIgnoreCase(poiStruct.getPoiId()) ? null : poiStruct) != null) {
                    String valueFromPoiStruct2 = PoiServiceImpl.createIPoiServicebyMonsterPlugin().getValueFromPoiStruct(poiStruct, "order");
                    String a2 = C44572a.m97512a("creation_id", activity);
                    if (TextUtils.isEmpty(valueFromPoiStruct2)) {
                        valueFromPoiStruct2 = "-1";
                    }
                    C23089d a3 = C23089d.m56640a();
                    a3.mo47829a("enter_from", a).mo47829a("creation_id", a2).mo47829a("poi_type", String.valueOf(poiStruct.iconType)).mo47829a("poi_id", poiStruct.poiId).mo47829a("enter_method", str2).mo47829a("content_type", "video").mo47829a("log_pb", PoiServiceImpl.createIPoiServicebyMonsterPlugin().getValueFromPoiStruct(poiStruct, "logpb")).mo47829a("order", valueFromPoiStruct2).mo47829a("key_word", valueFromPoiStruct).mo47829a("is_media_location", poiStruct.isCandidate()).mo47829a("distance_info", poiStruct.getDistance()).mo47829a("search_region_type", str);
                    PoiServiceImpl.createIPoiServicebyMonsterPlugin().onEventV3IncludingPoiParams(poiStruct, "choose_poi", a3);
                }
            }
        }
    }
}
