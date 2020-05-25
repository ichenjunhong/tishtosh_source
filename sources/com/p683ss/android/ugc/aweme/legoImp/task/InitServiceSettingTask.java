package com.p683ss.android.ugc.aweme.legoImp.task;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.p1739a.C31347a;
import com.p683ss.android.ugc.aweme.p684l.C10912c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitServiceSettingTask */
public final class InitServiceSettingTask extends BaseInitServiceSettingTask {
    /* access modifiers changed from: protected */
    public final void handleConfig(JSONObject jSONObject) {
        C10912c cVar;
        super.handleConfig(jSONObject);
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("aweme_activity_setting");
            if (optJSONObject != null) {
                if (optJSONObject != null) {
                    try {
                        cVar = (C10912c) new C17971f().mo34884a(optJSONObject.toString(), C10912c.class);
                    } catch (Exception unused) {
                        cVar = null;
                    }
                    if (cVar != null) {
                        C31357a.f82126d = cVar;
                    }
                }
                C23183v a = C23183v.m56778a();
                C52711k.m112236a((Object) a, "CommonSharePrefCache.inst()");
                a.mo47898I().mo47776a(optJSONObject.toString());
                C47718bf.m103288a(new C31347a());
            } else {
                C23183v a2 = C23183v.m56778a();
                C52711k.m112236a((Object) a2, "CommonSharePrefCache.inst()");
                a2.mo47898I().mo47776a("");
            }
        }
    }
}
