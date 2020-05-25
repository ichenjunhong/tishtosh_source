package com.bytedance.android.livesdk.browser.p289c;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.monitor.webview.C8889a;
import com.bytedance.android.monitor.webview.C8892c.C8893a;
import com.bytedance.android.monitor.webview.C8894d;
import com.bytedance.android.monitor.webview.C8896f;
import com.bytedance.android.monitor.webview.C8902j;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.c.d */
public final class C4705d {

    /* renamed from: a */
    private static boolean f12817a;

    /* renamed from: a */
    public static void m11228a() {
        if (!f12817a) {
            f12817a = true;
            C8893a a = C8902j.m17571b().mo15894a();
            C8893a a2 = a.mo15910a((C8889a) new C8889a() {
                /* renamed from: a */
                public final void mo10526a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                    C3837e.m9745a(str, i, jSONObject, jSONObject2);
                }
            });
            a2.f24219h = true;
            if (a2.f24219h) {
                a2.f24226o = CustomActionPushReceiver.f104061f;
            }
            a2.mo15914a(a2.f24226o);
            a2.mo15916c((String) LiveSettingKeys.WEBVIEW_MONITOR_SLARDAR_SWITCH_SET.mo9431a()).mo15911a((C8894d) C8896f.m17517a());
            C8902j.m17571b().mo15906b(a);
        }
    }
}
