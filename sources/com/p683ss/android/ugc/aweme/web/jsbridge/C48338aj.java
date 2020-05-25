package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.language.C35837h;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.aj */
public final class C48338aj implements C10762d {

    /* renamed from: a */
    WeakReference<Context> f121620a;

    /* renamed from: b */
    C10757a f121621b;

    public C48338aj(WeakReference<Context> weakReference, C10757a aVar) {
        this.f121620a = weakReference;
        this.f121621b = aVar;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("isTeenagersModel", TimeLockRuler.isContentFilterOn() ? 1 : 0);
            jSONObject2.put("language", C35837h.m80980e());
        } catch (JSONException unused) {
        }
        if (this.f121621b != null) {
            this.f121621b.mo19455a(hVar.f28945b, jSONObject2);
        }
    }
}
