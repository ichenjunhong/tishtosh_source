package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.p2077b;

import android.content.Context;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.poi.map.MapLayout;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.utils.C39442c;
import com.p683ss.android.ugc.aweme.poi.utils.C39462r;
import com.p683ss.android.ugc.aweme.poi.utils.C39468x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.e */
public final class C39335e {

    /* renamed from: a */
    MapLayout f100553a;

    /* renamed from: b */
    C23526a f100554b;

    /* renamed from: c */
    Context f100555c;

    /* renamed from: d */
    private PoiStruct f100556d;

    /* renamed from: e */
    private double[] f100557e;

    /* renamed from: f */
    private C36282r f100558f;

    /* renamed from: a */
    private final float m87442a() {
        if (C39468x.m87786a(this.f100556d, this.f100558f)) {
            MapLayout mapLayout = this.f100553a;
            if (mapLayout == null) {
                C52711k.m112237a("mMapLayout");
            }
            return mapLayout.getZoomBig();
        }
        MapLayout mapLayout2 = this.f100553a;
        if (mapLayout2 == null) {
            C52711k.m112237a("mMapLayout");
        }
        return mapLayout2.getZoomSmall();
    }

    /* renamed from: a */
    public final void mo80173a(PoiStruct poiStruct) {
        if (poiStruct == null) {
            C23131p.m57779a("poi_crash_log", C23088c.m56631a().mo47824a("poi_service", "poi_map").mo47824a("errorDesc", "poidetail is null").mo47824a("poitype", "map").mo47825b());
            return;
        }
        this.f100556d = poiStruct;
        this.f100558f = C36286a.m81925a().mo75118a();
        this.f100557e = C39442c.m87697a(poiStruct.getPoiLatitude(), poiStruct.getPoiLongitude());
        double[] dArr = this.f100557e;
        if (dArr != null) {
            MapLayout mapLayout = this.f100553a;
            if (mapLayout == null) {
                C52711k.m112237a("mMapLayout");
            }
            if (mapLayout == null) {
                C52711k.m112234a();
            }
            mapLayout.mo79267a(C39462r.m87764a(this.f100555c), dArr[0], dArr[1], m87442a(), null);
        }
    }
}
