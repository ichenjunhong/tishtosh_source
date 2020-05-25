package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.sdk.webview.p1210b.C19746f;
import com.p683ss.android.ugc.aweme.base.C23555m;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.n */
public final class C48355n extends C19746f {
    public final void open(JSONObject jSONObject) {
    }

    public C48355n(WeakReference<Context> weakReference) {
        super(weakReference);
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        super.call(hVar, jSONObject);
        JSONObject jSONObject2 = hVar.f28947d;
        final String optString = jSONObject2.optString("download_url");
        final String optString2 = jSONObject2.optString("app_name");
        final Activity g = C11016e.m22312g();
        if (g != null) {
            C23555m.m57419a(g, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
                /* renamed from: a */
                public final void mo40906a(String[] strArr, int[] iArr) {
                    if (iArr != null && iArr.length > 0 && iArr[0] == 0) {
                        String str = optString;
                        String str2 = optString2;
                        Activity activity = g;
                        C52711k.m112240b(str, "downloadUrl");
                        C52711k.m112240b(str2, "appName");
                        C52711k.m112240b(activity, "context");
                    }
                }
            });
        }
    }
}
