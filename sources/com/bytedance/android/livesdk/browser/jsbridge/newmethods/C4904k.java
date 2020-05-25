package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.support.p030v4.app.C0649f;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.k */
public final class C4904k extends C10782e<JSONObject, Object> {

    /* renamed from: a */
    private C0649f f13188a;

    /* renamed from: b */
    private Activity f13189b;

    public C4904k(Activity activity) {
        this.f13189b = activity;
    }

    public C4904k(C0649f fVar) {
        this.f13188a = fVar;
    }

    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f13188a != null) {
            this.f13188a.dismissAllowingStateLoss();
        } else if (this.f13189b != null) {
            this.f13189b.finish();
        } else {
            terminate();
        }
        return null;
    }
}
