package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.jsbridge.p296a.C4764b;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.j */
public final class C4790j implements C10762d {
    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        String str = "in_room_dialog";
        String str2 = "H5";
        String str3 = "H5";
        String str4 = "H5";
        if (!(hVar == null || hVar.f28947d == null)) {
            if (TextUtils.equals("new_page", hVar.f28947d.optString("type", ""))) {
                str = "new_page";
            }
            str2 = hVar.f28947d.optString("enter_from", "H5");
            str3 = hVar.f28947d.optString("click_type", "H5");
            JSONObject optJSONObject = hVar.f28947d.optJSONObject("args");
            if (optJSONObject != null) {
                str4 = optJSONObject.optString("charge_reason", "H5");
            }
        }
        C4495a.m10823a().mo10301a((Object) new C4764b(str, str2, str3, str4));
        jSONObject.put("code", 1);
    }
}
