package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.miniapp_api.C36947d;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1961a.C36952a.C36953a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.k */
public final class C48352k implements C10762d {

    /* renamed from: a */
    protected WeakReference<Context> f121646a;

    public C48352k(WeakReference<Context> weakReference) {
        this.f121646a = weakReference;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if ((((Context) this.f121646a.get()) instanceof CrossPlatformActivity) && hVar.f28947d != null) {
            int optInt = hVar.f28947d.optInt("status");
            String optString = jSONObject.optString("msg");
            C36953a aVar = new C36953a();
            aVar.f94321a = optInt;
            C36947d.m83162a().f94316g = aVar.mo76202a("game_pay").mo76205b(optString).mo76204a();
        }
    }
}
