package com.p683ss.android.sdk.webview.p1210b;

import android.content.Context;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p521a.C9369a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.c */
public final class C19742c implements C10762d {

    /* renamed from: a */
    private Context f54404a;

    public C19742c(Context context) {
        this.f54404a = context;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        String str;
        if (hVar.f28947d != null) {
            str = hVar.f28947d.optString(C42311c.f106865i);
        } else {
            str = null;
        }
        Context context = this.f54404a;
        int i = 0;
        if (context != null && !C9431p.m18664a(str)) {
            C9369a.m18549a(context, "", str);
            i = 1;
        }
        jSONObject.put("code", i);
    }
}
