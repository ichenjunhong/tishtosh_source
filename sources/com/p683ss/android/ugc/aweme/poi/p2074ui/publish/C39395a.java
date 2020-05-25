package com.p683ss.android.ugc.aweme.poi.p2074ui.publish;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44370d;
import com.p683ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.a */
public final class C39395a implements C44370d {

    /* renamed from: a */
    private final String f100773a = "PoiPublishServiceExtension";

    /* renamed from: a */
    public final void mo52804a(PhotoContext photoContext, LinkedHashMap<String, String> linkedHashMap) {
        PoiContext poiContext;
        C52711k.m112240b(photoContext, "photoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        String str = photoContext.mPoiId;
        if (str != null) {
            poiContext = PoiContext.unserializeFromJson(str);
        } else {
            poiContext = null;
        }
        if (poiContext != null) {
            m87625a(poiContext, linkedHashMap);
            return;
        }
        if (!TextUtils.isEmpty(photoContext.mPoiId)) {
            String str2 = photoContext.mPoiId;
            C52711k.m112236a((Object) str2, "photoContext.mPoiId");
            linkedHashMap.put("poi_id", str2);
        }
        if (!TextUtils.isEmpty(photoContext.mPoiName)) {
            String str3 = photoContext.mPoiName;
            C52711k.m112236a((Object) str3, "photoContext.mPoiName");
            linkedHashMap.put("poi_name", str3);
        }
    }

    /* renamed from: a */
    private static void m87625a(PoiContext poiContext, LinkedHashMap<String, String> linkedHashMap) {
        if (!TextUtils.isEmpty(poiContext.mPoiRateId)) {
            String str = poiContext.mPoiRateId;
            C52711k.m112236a((Object) str, "poiContext.mPoiRateId");
            linkedHashMap.put("poi_rate_id", str);
        }
        if (poiContext.mPoiActivity != null) {
            Map map = linkedHashMap;
            map.put("activity_id", poiContext.mPoiActivity.getId());
            if (!TextUtils.isEmpty(poiContext.mShootPoiId)) {
                String str2 = poiContext.mShootPoiId;
                C52711k.m112236a((Object) str2, "poiContext.mShootPoiId");
                map.put("poi_id", str2);
            }
            if (!TextUtils.isEmpty(poiContext.mShootPoiName)) {
                String str3 = poiContext.mShootPoiName;
                C52711k.m112236a((Object) str3, "poiContext.mShootPoiName");
                map.put("poi_name", str3);
            }
        } else {
            if (!TextUtils.isEmpty(poiContext.mSelectPoiId)) {
                String str4 = poiContext.mSelectPoiId;
                C52711k.m112236a((Object) str4, "poiContext.mSelectPoiId");
                linkedHashMap.put("poi_id", str4);
            }
            if (!TextUtils.isEmpty(poiContext.mSelectPoiName)) {
                String str5 = poiContext.mSelectPoiName;
                C52711k.m112236a((Object) str5, "poiContext.mSelectPoiName");
                linkedHashMap.put("poi_name", str5);
            }
        }
    }

    /* renamed from: a */
    public final void mo52805a(BaseShortVideoContext baseShortVideoContext, LinkedHashMap<String, String> linkedHashMap, List<CreateAnchorInfo> list) {
        PoiContext poiContext;
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        C52711k.m112240b(baseShortVideoContext, "videoContext");
        C52711k.m112240b(linkedHashMap, "fieldMap");
        String str = baseShortVideoContext.poiId;
        if (str != null) {
            poiContext = PoiContext.unserializeFromJson(str);
        } else {
            poiContext = null;
        }
        if (poiContext != null) {
            m87625a(poiContext, linkedHashMap);
            return;
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.poiId)) {
            String str2 = baseShortVideoContext.poiId;
            C52711k.m112236a((Object) str2, "videoContext.poiId");
            linkedHashMap.put("poi_id", str2);
        }
        if (!TextUtils.isEmpty(baseShortVideoContext.poiName)) {
            String str3 = baseShortVideoContext.poiName;
            C52711k.m112236a((Object) str3, "videoContext.poiName");
            linkedHashMap.put("poi_name", str3);
        }
    }
}
