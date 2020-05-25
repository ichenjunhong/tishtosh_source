package com.bytedance.common.wschannel.p537e;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.message.log.C19492c;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.wschannel.e.a */
public final class C9518a {
    /* renamed from: a */
    public static void m18888a(Context context, String str, Bundle bundle) {
        if (!C9431p.m18664a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            } catch (Throwable unused) {
            }
            C19492c.m47724a(context, "event_v3", str, null, 0, 0, jSONObject);
        }
    }
}
