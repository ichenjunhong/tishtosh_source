package com.p683ss.android.ugc.aweme.app.api.p1367c;

import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.app.api.c.b */
final /* synthetic */ class C22976b implements C1710e {

    /* renamed from: a */
    private final boolean f61311a;

    C22976b(boolean z) {
        this.f61311a = z;
    }

    public final void accept(Object obj) {
        boolean z = this.f61311a;
        String str = (String) obj;
        JSONObject jSONObject = new JSONObject();
        String str2 = "proto";
        if (z) {
            str2 = "json";
        }
        try {
            jSONObject.put("service", str2);
            jSONObject.put("type", str2);
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
        C9951d.m19997a(C22975a.f61306a, jSONObject);
    }
}
