package com.bytedance.android.livesdk.browser.jsbridge.p298c.p299a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.jsbridge.p298c.C4789i;
import com.bytedance.android.livesdk.browser.p290d.C4742w;
import com.bytedance.ies.p675g.p676a.C10766h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.a.a */
public final class C4774a extends C4789i {

    /* renamed from: b */
    private C4742w f12987b;

    public C4774a(WeakReference<Context> weakReference, C4742w wVar) {
        super(weakReference);
        this.f12987b = wVar;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        super.call(hVar, jSONObject);
        if (TextUtils.equals(hVar.f28947d.optString("type"), "gift_panel")) {
            this.f12987b.dismissAllowingStateLoss();
        }
    }
}
