package com.p683ss.android.ugc.aweme.p1468bu;

import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bu.l */
public final class C24084l implements C24062d {
    /* renamed from: c */
    public final boolean mo49828c() {
        if (C9951d.m20000a("task_blocked")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo49830d() {
        if (C9951d.m20000a("task_rejected")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo49824a() {
        if (C9951d.m20000a("task_wait_timeout")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo49826b() {
        if (C9951d.m20000a("task_execute_timeout")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo49827c(JSONObject jSONObject) {
        C23569o.m57779a("task_blocked", jSONObject);
    }

    /* renamed from: d */
    public final void mo49829d(JSONObject jSONObject) {
        C23569o.m57779a("task_rejected", jSONObject);
    }

    /* renamed from: a */
    public final void mo49823a(JSONObject jSONObject) {
        if (jSONObject != null) {
            C23569o.m57779a("task_wait_timeout", jSONObject);
        }
    }

    /* renamed from: b */
    public final void mo49825b(JSONObject jSONObject) {
        if (jSONObject != null) {
            C23569o.m57779a("task_execute_timeout", jSONObject);
        }
    }
}
