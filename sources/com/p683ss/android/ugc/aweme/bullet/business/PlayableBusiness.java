package com.p683ss.android.ugc.aweme.bullet.business;

import com.bytedance.ies.bullet.kit.web.p649b.C10492a;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import com.p683ss.android.ugc.aweme.bullet.business.BulletBusinessService.Business;
import com.p683ss.android.ugc.aweme.bullet.module.p1477ad.C24310h;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.PlayableBusiness */
public final class PlayableBusiness extends Business {

    /* renamed from: a */
    public boolean f64347a;

    /* renamed from: a */
    public final void mo49998a() {
        if (!this.f64347a) {
            mo50000a(false, true);
        }
    }

    /* renamed from: b */
    public final void mo50001b() {
        if (!this.f64347a) {
            mo50000a(true, false);
        }
    }

    /* renamed from: a */
    public final void mo49999a(String str) {
        mo50000a(false, true);
    }

    public PlayableBusiness(C24252a aVar) {
        C52711k.m112240b(aVar, "bulletBusiness");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo50000a(boolean z, boolean z2) {
        C10578a b = this.f64316k.mo50019b();
        if (b instanceof C24310h) {
            Integer num = (Integer) ((C24310h) b).f64504g.mo18457b();
            if (num != null && num.intValue() == 1) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(C24255c.m59399b(), z);
                    jSONObject.put(C24255c.m59400c(), z2);
                    C10492a c = this.f64316k.mo50020c();
                    if (c != null) {
                        c.mo18618a(C24255c.m59398a(), jSONObject);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }
}
