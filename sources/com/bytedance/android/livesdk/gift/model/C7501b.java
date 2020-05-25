package com.bytedance.android.livesdk.gift.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.gift.model.b */
public final class C7501b {
    @C17952c(mo34828a = "data")

    /* renamed from: a */
    public C7502a f20518a;

    /* renamed from: com.bytedance.android.livesdk.gift.model.b$a */
    public static class C7502a {
        @C17952c(mo34828a = "addend")

        /* renamed from: a */
        public int f20519a;
        @C17952c(mo34828a = "anchor_rank_best_score")

        /* renamed from: b */
        public int f20520b;
        @C17952c(mo34828a = "anchor_rank_best_user_name")

        /* renamed from: c */
        public String f20521c;
        @C17952c(mo34828a = "best_score_self")

        /* renamed from: d */
        public int f20522d;
        @C17952c(mo34828a = "multiplier")

        /* renamed from: e */
        public int f20523e;
        @C17952c(mo34828a = "seed")

        /* renamed from: f */
        public long f20524f;
        @C17952c(mo34828a = "token")

        /* renamed from: g */
        public String f20525g;
        @C17952c(mo34828a = "rangeMap")

        /* renamed from: h */
        public List<C7503b> f20526h;
    }

    /* renamed from: com.bytedance.android.livesdk.gift.model.b$b */
    public static class C7503b {
        @C17952c(mo34828a = "max")

        /* renamed from: a */
        public int f20527a;
        @C17952c(mo34828a = "min")

        /* renamed from: b */
        public int f20528b;
        @C17952c(mo34828a = "result")

        /* renamed from: c */
        public int f20529c;
    }

    /* renamed from: a */
    public static String m15503a(C7502a aVar) {
        if (aVar == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("multiplier", aVar.f20523e);
            jSONObject.put("addend", aVar.f20519a);
            jSONObject.put("seed", aVar.f20524f);
            jSONObject.put("token", aVar.f20525g);
            jSONObject.put("maxScore", aVar.f20522d);
            JSONArray jSONArray = new JSONArray();
            for (C7503b bVar : aVar.f20526h) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("min", bVar.f20528b);
                jSONObject2.put("max", bVar.f20527a);
                jSONObject2.put("result", bVar.f20529c);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("rangeMap", jSONArray);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
