package com.bytedance.android.livesdk.p399o.p401b;

import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.p399o.p402c.C8058i;
import com.bytedance.android.livesdk.p399o.p402c.C8063n;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31483a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.o.b.p */
public final class C8047p extends C8032a<C8063n> {
    /* renamed from: a */
    public final /* synthetic */ void mo14196a(Map map, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        C8063n nVar = (C8063n) obj;
        super.mo14196a(map, nVar);
        if (nVar != null) {
            C7505d dVar = nVar.f22036c;
            Prop prop = nVar.f22037d;
            if (C8058i.f22019b == nVar.f22038e) {
                str = "guest_";
            } else {
                str = "";
            }
            if (dVar != null && dVar.mo13922a()) {
                str2 = "animation_gift";
            } else if (nVar.f22040g == 1) {
                str2 = "single_gift";
            } else if (nVar.f22041h > 1) {
                str2 = "bunching_gift";
            } else {
                str2 = "running_gift";
            }
            if (!map.containsKey("request_page")) {
                map.put("request_page", C31483a.f82385b);
            }
            if (nVar.f22035b > 0) {
                str3 = "prop_type";
            } else {
                str3 = "gift_type";
            }
            if (nVar.f22035b > 0) {
                str4 = "prop_id";
            } else {
                str4 = "gift_id";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            map.put(str3, sb.toString());
            if (nVar.f22035b > 0) {
                j = nVar.f22035b;
            } else {
                j = nVar.f22034a;
            }
            map.put(str4, String.valueOf(j));
            if (nVar.f22035b <= 0) {
                map.put("gift_cnt", String.valueOf(nVar.f22040g));
            } else {
                map.put("prop_cnt", String.valueOf(nVar.f22040g));
            }
            map.put("group_cnt", String.valueOf(nVar.f22041h));
            map.put("combo_cnt", String.valueOf(nVar.f22039f));
            if (C8058i.f22019b == nVar.f22038e) {
                map.put("guest_id", String.valueOf(nVar.f22043j));
            }
            if (nVar.f22035b <= 0 && dVar != null) {
                map.put("money", String.valueOf(nVar.f22040g * dVar.f20545f));
            } else if (!(nVar.f22035b <= 0 || prop == null || dVar == null)) {
                map.put("income", String.valueOf(nVar.f22040g * dVar.f20545f));
                map.put("money", String.valueOf(nVar.f22040g * dVar.f20545f));
            }
            try {
                JSONObject jSONObject = new JSONObject();
                if (nVar.f22035b <= 0) {
                    jSONObject.put(String.valueOf(nVar.f22034a), String.valueOf(nVar.f22040g));
                    map.put("gift_info", jSONObject.toString());
                } else {
                    jSONObject.put(String.valueOf(nVar.f22035b), String.valueOf(nVar.f22040g));
                    map.put("prop_info", jSONObject.toString());
                }
            } catch (Exception unused) {
            }
        }
    }
}
