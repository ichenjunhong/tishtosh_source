package com.bytedance.android.monitor.p462b;

import com.bytedance.android.monitor.p461a.C8870b;
import com.bytedance.android.monitor.p461a.C8870b.C8871a;
import com.bytedance.android.monitor.p463c.C8880a;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.monitor.b.b */
public abstract class C8876b implements C8870b {

    /* renamed from: a */
    private boolean f24182a = true;

    /* renamed from: b */
    private C8871a f24183b;

    /* renamed from: a */
    public final boolean mo15872a() {
        return this.f24182a;
    }

    /* renamed from: a */
    public final void mo15866a(C8871a aVar) {
        this.f24183b = aVar;
    }

    /* renamed from: b */
    public final void mo15873b(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (mo15872a() && this.f24183b != null && this.f24183b.f24180a != null) {
            if (this.f24183b.f24181b != null) {
                str = this.f24183b.f24181b.mo15870b(str);
                C8880a.m17464a(jSONObject2, "service", str);
            }
            this.f24183b.f24180a.mo15871a(str, 0, null, jSONObject2);
        }
    }
}
