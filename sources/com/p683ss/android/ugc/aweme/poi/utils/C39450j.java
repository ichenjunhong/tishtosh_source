package com.p683ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.text.TextUtils;
import com.C2240a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.j */
public final class C39450j {
    /* renamed from: a */
    public static HashMap<String, String> m87722a(Aweme aweme) {
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        if (!(aweme == null || aweme.getPoiStruct() == null)) {
            hashMap.put("poi_id", C23198ae.m56861e(aweme));
            hashMap.put("poi_channel", C23198ae.m56852b());
            PoiStruct poiStruct = aweme.getPoiStruct();
            if (!TextUtils.isEmpty(poiStruct.getBackendTypeCode())) {
                hashMap.put("poi_backend_type", poiStruct.getBackendTypeCode());
            }
            if (!TextUtils.isEmpty(poiStruct.getCityCode())) {
                hashMap.put("poi_city", poiStruct.getCityCode());
                String str2 = "poi_device_samecity";
                if (poiStruct.getCityCode().equalsIgnoreCase(C30228f.m70982f())) {
                    str = "1";
                } else {
                    str = "0";
                }
                hashMap.put(str2, str);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static String m87721a(Context context, PoiStruct poiStruct) {
        long j;
        String str = "0";
        if (poiStruct != null) {
            str = poiStruct.viewCount;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                j = Long.parseLong(str);
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
            return C2240a.m6772a(context.getResources().getString(R.string.p6), new Object[]{C33095b.m76068a(j)});
        }
        j = 0;
        return C2240a.m6772a(context.getResources().getString(R.string.p6), new Object[]{C33095b.m76068a(j)});
    }

    /* renamed from: a */
    private static void m87725a(String str, C23089d dVar) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            dVar.mo47829a("poi_city", str);
            String str3 = "poi_device_samecity";
            if (str.equalsIgnoreCase(C30228f.m70982f())) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            dVar.mo47829a(str3, str2);
        }
    }

    /* renamed from: a */
    public static void m87723a(Aweme aweme, String str, C23089d dVar) {
        if (aweme != null) {
            dVar.mo47829a("poi_backend_type", C23198ae.m56863f(aweme));
            if (aweme.getPoiStruct() != null) {
                m87725a(aweme.getPoiStruct().getCityCode(), dVar);
                dVar.mo47829a("poi_id", aweme.getPoiStruct().getPoiId());
                dVar.mo47829a("poi_type", aweme.getPoiStruct().getTypeCode());
            }
        }
        C26890h.m65012a(str, C23198ae.m56851a(dVar.f61491a));
    }

    /* renamed from: a */
    public static void m87724a(C39067g gVar, String str, C23089d dVar) {
        if (gVar != null) {
            if (!TextUtils.isEmpty(gVar.getBackendType())) {
                dVar.mo47829a("poi_backend_type", gVar.getBackendType());
            }
            m87725a(gVar.getPoiCity(), dVar);
        }
        C26890h.m65011a(str, dVar.f61491a);
    }
}
