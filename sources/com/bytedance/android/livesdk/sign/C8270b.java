package com.bytedance.android.livesdk.sign;

import android.app.Activity;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.sign.b */
public final class C8270b implements C10762d {

    /* renamed from: a */
    private Activity f22617a;

    /* renamed from: b */
    private C8271a f22618b;

    /* renamed from: com.bytedance.android.livesdk.sign.b$a */
    public interface C8271a {
        /* renamed from: h */
        void mo14457h();
    }

    public C8270b(Activity activity, C8271a aVar) {
        this.f22617a = activity;
        this.f22618b = aVar;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        Activity activity = this.f22617a;
        TTLiveSDKContext.getHostService().mo10318k();
        activity.startActivity(null);
        if (this.f22618b != null) {
            this.f22618b.mo14457h();
        }
    }
}
