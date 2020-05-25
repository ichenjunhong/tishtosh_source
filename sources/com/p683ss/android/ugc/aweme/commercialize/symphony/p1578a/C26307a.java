package com.p683ss.android.ugc.aweme.commercialize.symphony.p1578a;

import com.bytedance.p126ad.symphony.C2715d;
import com.bytedance.p126ad.symphony.p127a.p128a.C2678e;
import com.bytedance.p126ad.symphony.p131c.C2709c;
import com.bytedance.p126ad.symphony.p131c.C2713g;
import com.bytedance.p126ad.symphony.p134e.C2722a;
import com.bytedance.p126ad.symphony.p134e.p135a.C2724b;
import com.bytedance.p126ad.symphony.p139i.C2745d;
import com.bytedance.p126ad.symphony.p139i.C2746e;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.symphony.a.a */
public final class C26307a extends C2678e {

    /* renamed from: b */
    public C2722a f69431b;

    /* renamed from: c */
    public C2709c f69432c = new C2709c();

    /* renamed from: d */
    private C26308b f69433d = new C26308b();

    /* renamed from: a */
    public static C26307a m63681a(JSONObject jSONObject) {
        Map map;
        try {
            C26307a aVar = new C26307a();
            aVar.f69431b = C2722a.m7781a(jSONObject);
            C2709c cVar = new C2709c();
            cVar.f8199a = new HashMap();
            cVar.f8200b = "draw_ad";
            aVar.f69432c = cVar;
            if (!aVar.f69433d.f69434a) {
                C2722a aVar2 = aVar.f69431b;
                String str = aVar.f69432c.f8200b;
                Map<String, Object> map2 = aVar.f69432c.f8199a;
                if (aVar2 != null && !C2745d.m7836a(aVar2.f8224b) && C2713g.m7767a()) {
                    try {
                        map = new C2746e(map2);
                    } catch (ConcurrentModificationException e) {
                        C2715d.m7770a((Exception) e);
                        map = new C2746e();
                    }
                    List<String> list = aVar2.f8224b;
                    map.put("ad_placement_type", list);
                    if (!C2745d.m7836a(list)) {
                        map.put("ad_placement_type_prefix", C2724b.m7786a((String) list.get(0)));
                    }
                    String str2 = "ad_slot_receive";
                    if (aVar2 != null) {
                        C2713g.m7765a(str2, str, aVar2.f8226d, aVar2.f8225c, map);
                    }
                }
                aVar.f69433d.f69434a = true;
            }
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
