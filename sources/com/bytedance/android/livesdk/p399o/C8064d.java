package com.bytedance.android.livesdk.p399o;

import com.bytedance.android.live.core.p224c.C3832b;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8045n;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.o.d */
public final class C8064d extends C3832b {

    /* renamed from: a */
    private static C8064d f22044a;

    private C8064d() {
    }

    /* renamed from: b */
    public static synchronized C8064d m16005b() {
        C8064d dVar;
        synchronized (C8064d.class) {
            if (f22044a == null) {
                f22044a = new C8064d();
            }
            dVar = f22044a;
        }
        return dVar;
    }

    /* renamed from: a */
    public final JSONObject mo9196a() {
        long j;
        JSONObject jSONObject = new JSONObject();
        C8038g a = C8049c.m15979a().mo14201a(Room.class);
        String str = "";
        String str2 = "";
        if (a instanceof C8045n) {
            C8045n nVar = (C8045n) a;
            if (nVar.mo14192a().containsKey("room_id")) {
                str = (String) nVar.mo14192a().get("room_id");
            }
            if (nVar.mo14192a().containsKey("anchor_id")) {
                str2 = (String) nVar.mo14192a().get("anchor_id");
            }
            j = nVar.f21981c;
        } else {
            j = 0;
        }
        try {
            jSONObject.put("user_id", String.valueOf(j));
            jSONObject.put("room_id", str);
            jSONObject.put("anchor_id", str2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
