package com.p683ss.android.sdk.webview.p1210b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.C23060d;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.b */
public final class C19741b implements C10762d {

    /* renamed from: a */
    private WeakReference<Context> f54403a;

    public C19741b(WeakReference<Context> weakReference) {
        this.f54403a = weakReference;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        Context context;
        JSONObject jSONObject2 = hVar.f28947d;
        int i = -1;
        if (jSONObject2 == null) {
            jSONObject.put("installed", -1);
            return;
        }
        String optString = jSONObject2.optString("pkg_name");
        String optString2 = jSONObject2.optString(C23060d.f61428b);
        if (this.f54403a != null) {
            context = (Context) this.f54403a.get();
        } else {
            context = null;
        }
        if (context != null) {
            if (!TextUtils.isEmpty(optString)) {
                if (C18920g.m46052b(context, optString)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            if (i != 1 && !TextUtils.isEmpty(optString2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(optString2));
                if (C18920g.m46049a(context, intent)) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
        }
        jSONObject.put("installed", i);
    }
}
