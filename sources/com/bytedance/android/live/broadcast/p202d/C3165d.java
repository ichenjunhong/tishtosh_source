package com.bytedance.android.live.broadcast.p202d;

import android.os.Build.VERSION;
import com.bytedance.android.live.base.p185b.C2953a;
import com.bytedance.android.live.broadcast.effect.C3266p;
import com.bytedance.android.live.broadcast.effect.model.FilterModel;
import com.bytedance.android.live.broadcast.p213h.p216b.C3439a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.live.model.Camera2AB;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p385j.p387b.C7705a;
import com.bytedance.android.livesdkapi.C8737f;
import com.bytedance.android.livesdkapi.host.C8777a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.d.d */
public final class C3165d implements C3439a {

    /* renamed from: a */
    private C8737f f9198a = ((C8777a) C4116c.m10249a(C8777a.class)).mo15489b();

    /* renamed from: a */
    private static int m8761a(List<FilterModel> list) {
        int intValue = ((Integer) C4525b.f12317M.mo10345a()).intValue();
        if (intValue >= list.size() || intValue >= list.size() || intValue < 0) {
            return 0;
        }
        return intValue;
    }

    /* renamed from: a */
    public final void mo8496a(String str, JSONObject jSONObject) {
        String str2;
        if (!"live_client_monitor_log".equals(str)) {
            ((C2953a) C4116c.m10249a(C2953a.class)).mo7593a(str, jSONObject);
            return;
        }
        try {
            int cameraType = ((Camera2AB) LiveConfigSettingKeys.CAMERA_AB_SETTING_KEY.mo9431a()).getCameraType();
            if (VERSION.SDK_INT >= 28) {
                cameraType = 2;
            }
            jSONObject.put("camera", cameraType);
            List<FilterModel> list = C3266p.m8943a().f9434b;
            if (!C9414h.m18630a(list)) {
                String str3 = "filter_opened";
                if (list.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = ((FilterModel) list.get(m8761a(list))).getFilterPath();
                }
                jSONObject.put(str3, !C9431p.m18664a(str2));
                jSONObject.put("filter_name", ((FilterModel) list.get(m8761a(list))).getName());
            }
            jSONObject.put("beauty_white", (double) (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21200a.f21205a * ((Float) C4525b.f12318N.mo10345a()).floatValue()));
            jSONObject.put("beauty_skin", (double) (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21201b.f21205a * ((Float) C4525b.f12319O.mo10345a()).floatValue()));
            jSONObject.put("beauty_eye", (double) (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21202c.f21205a * ((Float) C4525b.f12320P.mo10345a()).floatValue()));
            jSONObject.put("beauty_face", (double) (((C7705a) LiveSettingKeys.LIVE_BEAUTY_PARAM.mo9431a()).f21203d.f21205a * ((Float) C4525b.f12321Q.mo10345a()).floatValue()));
        } catch (Throwable th) {
            C3831a.m9714b("StreamLog", th);
        }
        try {
            jSONObject.put("live_platform_version", 1510);
        } catch (Throwable th2) {
            C3831a.m9714b("StreamLog", th2);
        }
        ((C4139d) C4116c.m10249a(C4139d.class)).getLivePlayController().mo9614a(jSONObject);
    }
}
