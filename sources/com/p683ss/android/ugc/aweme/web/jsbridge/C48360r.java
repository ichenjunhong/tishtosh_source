package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.r */
public final class C48360r implements C10762d {

    /* renamed from: a */
    protected WeakReference<Context> f121655a;

    /* renamed from: b */
    private C10757a f121656b;

    public C48360r(WeakReference<Context> weakReference, C10757a aVar) {
        this.f121655a = weakReference;
        this.f121656b = aVar;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        jSONObject.put("code", 0);
        jSONObject.put("latitude", ProfileUiInitOptimizeEnterThreshold.DEFAULT);
        jSONObject.put("longitude", ProfileUiInitOptimizeEnterThreshold.DEFAULT);
    }
}
