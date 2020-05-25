package com.bytedance.android.livesdk.player;

import android.os.Build;
import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.player.s */
public final class C8109s {
    /* renamed from: a */
    public static void m16129a(JSONObject jSONObject, String str, String str2, String str3, String str4, String str5) {
        C3833a.m9731a(jSONObject, "device_name", Build.MODEL);
        C3833a.m9731a(jSONObject, "last_cdn_play_url", str);
        C3833a.m9731a(jSONObject, "url", str2);
        C3833a.m9731a(jSONObject, "pull_stream_data", str3);
        C3833a.m9731a(jSONObject, "default_resolution", str4);
        C3833a.m9731a(jSONObject, "sdk_params", str5);
        C3833a.m9730a(jSONObject, "uid", ((C4282a) C4116c.m10249a(C4282a.class)).user().mo14529b());
        C3837e.m9749b("ttlive_audience_enter_room_stream_switch", 0, jSONObject);
    }
}
