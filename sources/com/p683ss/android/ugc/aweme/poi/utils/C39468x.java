package com.p683ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.poi.model.C39118b;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.x */
public final class C39468x {
    /* renamed from: a */
    public static boolean m87783a(Context context, PoiStruct poiStruct) {
        String str;
        if (poiStruct == null || context == null) {
            return false;
        }
        C36282r a = C36286a.m81925a().mo75118a();
        if (a == null || !a.isValid()) {
            return false;
        }
        C39118b address = poiStruct.getAddress();
        String poiLatitude = poiStruct.getPoiLatitude();
        String poiLongitude = poiStruct.getPoiLongitude();
        if (address == null) {
            str = "";
        } else {
            str = address.getCity();
        }
        return m87784a(a, poiLatitude, poiLongitude, str);
    }

    /* renamed from: a */
    public static boolean m87786a(PoiStruct poiStruct, C36282r rVar) {
        String str;
        if (poiStruct == null || rVar == null || !rVar.isValid()) {
            return false;
        }
        C39118b address = poiStruct.getAddress();
        String poiLatitude = poiStruct.getPoiLatitude();
        String poiLongitude = poiStruct.getPoiLongitude();
        if (address == null) {
            str = "";
        } else {
            str = address.getCity();
        }
        return m87784a(rVar, poiLatitude, poiLongitude, str);
    }

    /* renamed from: a */
    public static boolean m87787a(PoiStruct poiStruct, C39054d dVar) {
        String str;
        if (poiStruct == null || dVar == null || !dVar.isValid()) {
            return false;
        }
        C39118b address = poiStruct.getAddress();
        String poiLatitude = poiStruct.getPoiLatitude();
        String poiLongitude = poiStruct.getPoiLongitude();
        if (address == null) {
            str = "";
        } else {
            str = address.getCity();
        }
        return m87785a(dVar, poiLatitude, poiLongitude, str);
    }

    /* renamed from: a */
    public static boolean m87784a(C36282r rVar, String str, String str2, String str3) {
        if (!C36286a.m81927a(C11010c.m22280a())) {
            return false;
        }
        if (rVar != null) {
            rVar.getCity();
        }
        if (rVar == null || !rVar.isValid() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            if (C39442c.m87691a(Double.parseDouble(str), Double.parseDouble(str2), rVar.getLatitude(), rVar.getLongitude()) < 50.0d) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m87785a(C39054d dVar, String str, String str2, String str3) {
        if (!C36285u.m81919a(C11010c.m22280a()) || dVar == null || !dVar.isValid() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        try {
            if (C39442c.m87691a(Double.parseDouble(str), Double.parseDouble(str2), dVar.latitude, dVar.longitude) < 50.0d) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
