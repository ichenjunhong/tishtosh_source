package com.bytedance.android.live.core.setting;

import com.p683ss.android.ugc.aweme.keva.C35807d;
import java.util.Map;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.core.setting.j */
final /* synthetic */ class C4089j implements C1710e {

    /* renamed from: a */
    static final C1710e f11248a = new C4089j();

    private C4089j() {
    }

    public final void accept(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            try {
                JSONObject jSONObject = new JSONObject(C4088i.f11245a.getString("key_ttlive_sdk_setting", ""));
                String str = "key_ttlive_sdk_setting";
                C4088i.f11246b.put(str, jSONObject);
                C4088i.f11247c.clear();
                if (C4088i.f11247c.get(str) != null) {
                    ((Map) C4088i.f11247c.get(str)).clear();
                }
                C35807d.m80935a(C4088i.m10204a(), "ttlive_sdk_shared_pref_cache", 4).edit().putString(str, jSONObject.toString()).commit();
            } catch (Exception unused) {
            }
        }
    }
}
