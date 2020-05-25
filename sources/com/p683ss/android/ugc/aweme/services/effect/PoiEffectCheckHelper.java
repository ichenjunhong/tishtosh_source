package com.p683ss.android.ugc.aweme.services.effect;

import com.p683ss.android.ugc.aweme.base.p1417h.C23541e;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.utils.C47840eb;
import java.util.LinkedHashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.effect.PoiEffectCheckHelper */
public final class PoiEffectCheckHelper {
    private final String CITY_CODE_LAST_SP_KEY = "poi_effect_last_city_code";
    private final String LATITUDE_LAST_SP_KEY = "poi_effect_last_latitude";
    private final String LONGITUDE_LAST_SP_KEY = "poi_effect_last_longitude";
    private final C23543g guideSP = C23541e.m57714a(C39629l.m88233b(), C39630m.m88234a().mo58623u().mo74236a());

    public final C23543g getGuideSP() {
        return this.guideSP;
    }

    public final void setPoiLastSP() {
        String str = C47840eb.f120402a;
        if (str != null) {
            this.guideSP.mo48709b(this.LATITUDE_LAST_SP_KEY, str);
        }
        String str2 = C47840eb.f120403b;
        if (str2 != null) {
            this.guideSP.mo48709b(this.LONGITUDE_LAST_SP_KEY, str2);
        }
        String str3 = C47840eb.f120404c;
        if (str3 != null) {
            this.guideSP.mo48709b(this.CITY_CODE_LAST_SP_KEY, str3);
        }
    }

    public final Map<String, String> getPoiLastMap() {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        String a = this.guideSP.mo48703a(this.LATITUDE_LAST_SP_KEY, "");
        C52711k.m112236a((Object) a, "guideSP.get(LATITUDE_LAST_SP_KEY, \"\")");
        linkedHashMap.put("latitude_last", a);
        String a2 = this.guideSP.mo48703a(this.LONGITUDE_LAST_SP_KEY, "");
        C52711k.m112236a((Object) a2, "guideSP.get(LONGITUDE_LAST_SP_KEY, \"\")");
        linkedHashMap.put("longitude_last", a2);
        String a3 = this.guideSP.mo48703a(this.CITY_CODE_LAST_SP_KEY, "");
        C52711k.m112236a((Object) a3, "guideSP.get(CITY_CODE_LAST_SP_KEY, \"\")");
        linkedHashMap.put("city_code_last", a3);
        return linkedHashMap;
    }
}
