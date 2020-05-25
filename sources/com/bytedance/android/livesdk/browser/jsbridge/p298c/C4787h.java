package com.bytedance.android.livesdk.browser.jsbridge.p298c;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.host.C8805i;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.h */
public final class C4787h implements C10762d {

    /* renamed from: a */
    private final WeakReference<Context> f13006a;

    public C4787h(WeakReference<Context> weakReference) {
        this.f13006a = weakReference;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (this.f13006a.get() instanceof Activity) {
            TTLiveSDKContext.getHostService().mo10310c().startBindPhoneDialogFragment((Activity) this.f13006a.get(), "", "", new C8805i() {
            });
            jSONObject.put("code", 1);
            return;
        }
        jSONObject.put("code", 0);
    }
}
