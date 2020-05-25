package com.p683ss.android.ugc.aweme.app;

import android.content.Intent;
import com.p683ss.android.newmedia.message.C19569a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.ab */
final class C22920ab {
    /* renamed from: a */
    static void m56372a(boolean z, String str, String str2, JSONObject jSONObject, Intent intent) {
        String str3;
        if (z) {
            try {
                int a = C19569a.m47872a(intent, "msg_from", -1);
                MobClick eventName = MobClick.obtain().setEventName(C22858c.f61208d);
                if (a == 1) {
                    str3 = "click_news_notify";
                } else {
                    str3 = "click_news_alert";
                }
                MobClick labelName = eventName.setLabelName(str3);
                if (str == null) {
                    str = "";
                }
                C26890h.onEvent(labelName.setValue(str).setExtValueString(str2).setJsonObject(jSONObject));
            } catch (Exception unused) {
            }
        }
    }
}
