package com.p683ss.android.ugc.aweme.shortvideo.p2265y;

import com.google.p1057b.p1058a.C17410f;
import com.p683ss.android.ugc.aweme.location.p1930a.C36254a;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y.b */
public final class C45626b implements C17410f<C39054d, C36254a> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33734a(Object obj) {
        return m99360a((C39054d) obj);
    }

    /* renamed from: a */
    public static C36254a m99360a(C39054d dVar) {
        if (dVar == null) {
            return null;
        }
        double[] gcj02towgs84 = PoiServiceImpl.createIPoiServicebyMonsterPlugin().gcj02towgs84(Double.valueOf(dVar.longitude), Double.valueOf(dVar.latitude));
        C36254a aVar = new C36254a(gcj02towgs84[1], gcj02towgs84[0], dVar.time, dVar.accuracy);
        return aVar;
    }
}
