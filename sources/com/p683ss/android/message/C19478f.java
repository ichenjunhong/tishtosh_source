package com.p683ss.android.message;

import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.message.p1186a.p1187a.C19410b;
import com.p683ss.android.message.p1191b.C19464g;
import com.p683ss.android.pushmanager.setting.C19710b;
import org.json.JSONObject;

/* renamed from: com.ss.android.message.f */
public final class C19478f {
    /* renamed from: a */
    public static void m47685a(Context context, JSONObject jSONObject, int i, String str) {
        if (jSONObject != null) {
            if (!C19710b.m48173a().mo41102k()) {
                StringBuilder sb = new StringBuilder("notifyEnable = ");
                sb.append(C19710b.m48173a().mo41102k());
                sb.append(" drop message");
                C19410b.m47510a(context, sb.toString());
            } else if (!C9431p.m18664a(jSONObject.optString("text"))) {
                if (jSONObject.optInt("id", 0) < 1000) {
                    C19410b.m47510a(context, "id < 1000, drop message");
                    return;
                }
                Intent intent = new Intent("com.ss.android.message");
                intent.putExtra("message_data", jSONObject.toString());
                if (!C9431p.m18664a(str)) {
                    intent.setPackage(str);
                } else {
                    intent.setPackage(context.getPackageName());
                }
                C19410b.m47510a(context, "sendMessageBroadcast");
                try {
                    C19464g.m47635a(context, intent);
                } catch (Exception unused) {
                }
            }
        }
    }
}
