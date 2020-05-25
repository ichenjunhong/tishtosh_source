package com.p683ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.C39128l;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.p2058a.C38965j;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39051a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.l */
public final class C39452l {
    /* renamed from: a */
    public static void m87735a(String str, String str2, C39067g gVar) {
        m87730a(gVar, "poi_map_operation", C23089d.m56640a().mo47829a("enter_from", "poi_page").mo47829a("action_type", str2).mo47829a("enter_method", str).mo47829a("poi_type", gVar.getPoiType()).mo47829a("poi_id", gVar.getPoiId()).mo47829a("group_id", gVar.getAwemeId()).mo47829a("previous_page", gVar.getPreviousPage()));
    }

    /* renamed from: a */
    public static void m87733a(C39128l lVar, String str, C23089d dVar) {
        if (lVar != null) {
            if (!TextUtils.isEmpty(lVar.backendType)) {
                dVar.mo47829a("poi_backend_type", lVar.backendType);
            }
            m87734a(lVar.cityCode, dVar);
        }
        C26890h.m65011a(str, dVar.f61491a);
    }

    /* renamed from: a */
    public static void m87736a(HashMap<String, String> hashMap, C39067g gVar) {
        if (!TextUtils.isEmpty(gVar.getBackendType())) {
            hashMap.put("poi_backend_type", gVar.getBackendType());
        }
        if (!TextUtils.isEmpty(gVar.getPoiCity())) {
            hashMap.put("poi_city", gVar.getPoiCity());
            hashMap.put("poi_device_samecity", gVar.getPoiCity().equalsIgnoreCase(C30228f.m70982f()) ? "1" : "0");
        }
    }

    /* renamed from: a */
    public static void m87734a(String str, C23089d dVar) {
        if (!TextUtils.isEmpty(str)) {
            dVar.mo47829a("poi_city", str);
            dVar.mo47829a("poi_device_samecity", str.equalsIgnoreCase(C30228f.m70982f()) ? "1" : "0");
        }
    }

    /* renamed from: a */
    public static String m87726a(int i) {
        if (i == C38965j.Companion.getTYPE_NEARBY()) {
            return "nearby";
        }
        if (i == C38965j.Companion.getTYPE_HOTEL()) {
            return "hotel";
        }
        if (i == C38965j.Companion.getTYPE_SCENE()) {
            return "tour";
        }
        if (i == C38965j.Companion.getTYPE_FOOD()) {
            return "food";
        }
        return "explore";
    }

    /* renamed from: a */
    public static void m87729a(C39051a aVar, String str, C23089d dVar) {
        if (aVar != null) {
            if (!TextUtils.isEmpty(aVar.f99567r)) {
                dVar.mo47829a("poi_backend_type", aVar.f99567r);
            }
            m87734a(aVar.f99568s, dVar);
        }
        C26890h.m65011a(str, dVar.f61491a);
    }

    /* renamed from: a */
    public static void m87728a(Aweme aweme, String str, C23089d dVar) {
        if (aweme != null) {
            dVar.mo47829a("poi_backend_type", C23198ae.m56863f(aweme));
            if (aweme.getPoiStruct() != null) {
                m87734a(aweme.getPoiStruct().getCityCode(), dVar);
                dVar.mo47829a("poi_id", aweme.getPoiStruct().getPoiId());
                dVar.mo47829a("poi_type", aweme.getPoiStruct().getTypeCode());
            }
        }
        C26890h.m65011a(str, dVar.f61491a);
    }

    /* renamed from: a */
    public static void m87730a(C39067g gVar, String str, C23089d dVar) {
        if (gVar != null) {
            if (!TextUtils.isEmpty(gVar.getBackendType())) {
                dVar.mo47829a("poi_backend_type", gVar.getBackendType());
            }
            m87734a(gVar.getPoiCity(), dVar);
        }
        C26890h.m65011a(str, dVar.f61491a);
    }

    /* renamed from: a */
    public static void m87731a(PoiDetail poiDetail, String str, C23089d dVar) {
        if (poiDetail != null) {
            if (!TextUtils.isEmpty(poiDetail.getBackendType())) {
                dVar.mo47829a("poi_backend_type", poiDetail.getBackendType());
            }
            m87734a(poiDetail.getCityCode(), dVar);
        }
        C26890h.m65011a(str, dVar.f61491a);
    }

    /* renamed from: a */
    public static void m87732a(PoiStruct poiStruct, String str, C23089d dVar) {
        if (poiStruct != null) {
            if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                dVar.mo47829a("poi_backend_type", poiStruct.getBackendTypeCode());
            }
            m87734a(poiStruct.getCityCode(), dVar);
        }
        C26890h.m65011a(str, dVar.f61491a);
    }

    /* renamed from: a */
    public static void m87727a(Context context, String str, String str2, String str3) {
        if (!C39453m.m87737a(context)) {
            C10691a.m21542b(context, (int) R.string.cg1).mo19066a();
        } else if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(WebKitApi.SCHEME_HTTP)) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("use_webview_title", true);
                C39460p.m87761a(context, str, bundle);
                return;
            }
            if (str.contains("__enter_from__")) {
                str = str.replace("__enter_from__", str2);
            }
            if (str.contains("__enter_method__")) {
                str = str.replace("__enter_method__", str3);
            }
            C41302w.m91042a().mo83861a(str);
        }
    }
}
