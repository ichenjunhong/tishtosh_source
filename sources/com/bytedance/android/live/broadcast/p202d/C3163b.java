package com.bytedance.android.live.broadcast.p202d;

import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.p399o.p400a.C8029a;
import com.bytedance.android.livesdk.p399o.p400a.C8030b;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.d.b */
public final class C3163b extends C3833a {
    /* renamed from: a */
    public static void m8760a(int i, String str, boolean z) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        m9730a(jSONObject, "error_code", (long) i);
        m9731a(jSONObject, "error_msg", str);
        String str3 = "media_type";
        if (z) {
            str2 = "audio";
        } else {
            str2 = "video";
        }
        m9731a(jSONObject, str3, str2);
        C3837e.m9749b("ttlive_create_room_all", 1, jSONObject);
        C3837e.m9744a("ttlive_create_room_error", 1, jSONObject);
        C8029a.m15933a().mo14190a(C8030b.Room.info, "ttlive_create_room", 1, jSONObject);
    }
}
