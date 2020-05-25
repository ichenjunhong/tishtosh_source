package com.p683ss.android.sdk.webview.p1210b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.common.util.C18920g;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.g */
public final class C19747g implements C10762d {

    /* renamed from: a */
    private Context f54411a;

    public C19747g(Context context) {
        this.f54411a = context;
    }

    /* renamed from: a */
    private boolean m48254a(JSONObject jSONObject) throws Exception {
        String str;
        String str2;
        Intent intent = null;
        if (jSONObject != null) {
            str = jSONObject.optString("pkg_name");
        } else {
            str = null;
        }
        if (jSONObject != null) {
            str2 = jSONObject.optString("pkg_class");
        } else {
            str2 = null;
        }
        Context context = this.f54411a;
        if (context == null || C9431p.m18664a(str)) {
            return false;
        }
        boolean equals = str.equals(context.getPackageName());
        if (!C9431p.m18664a(str2)) {
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(str, str2));
            intent2.addFlags(268435456);
            if (C18920g.m46049a(context, intent2)) {
                intent = intent2;
            }
        }
        if (intent == null && equals) {
            return true;
        }
        if (intent == null) {
            intent = C18920g.m46046a(context, str);
        }
        if (intent != null) {
            try {
                context.startActivity(intent);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (m48254a(hVar.f28947d)) {
            jSONObject.put("code", 1);
        } else {
            jSONObject.put("code", 0);
        }
    }
}
