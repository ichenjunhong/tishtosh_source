package com.bytedance.apm.p476c;

import android.app.Activity;
import android.os.SystemClock;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p476c.p477a.C8978a;
import com.bytedance.apm.p497o.C9154c;
import com.bytedance.apm.p501q.C9185g;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.apm.api.C13220c;
import com.bytedance.services.slardar.config.C13226a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.c.b */
public final class C8979b extends C8978a implements C13220c, C13226a {

    /* renamed from: b */
    private boolean f24440b;

    /* renamed from: c */
    private boolean f24441c;

    /* renamed from: d */
    private C8983f f24442d = new C8983f();

    /* renamed from: c */
    public final void mo16273c(Activity activity) {
    }

    /* renamed from: d */
    public final void mo16274d(Activity activity) {
    }

    /* renamed from: e */
    public final void mo16224e() {
    }

    /* renamed from: c */
    public final boolean mo16265c() {
        return this.f24441c;
    }

    /* renamed from: f */
    public final void mo16267f() {
        super.mo16267f();
        this.f24442d.mo16279c();
    }

    /* renamed from: b */
    public final void mo16272b() {
        if (this.f24440b && !this.f24441c) {
            this.f24441c = true;
            C8981d.m17778a((C8978a) this);
            if (C8976c.m17751g()) {
                new String[1][0] = "BlockDetector start: ";
            }
        }
    }

    /* renamed from: a */
    public final void mo16268a() {
        ActivityLifeObserver.getInstance().register(this);
        ((IConfigManager) C12401c.m24975a(IConfigManager.class)).registerConfigListener(this);
        C8983f fVar = this.f24442d;
        fVar.f24455a = new C9154c("caton_dump_stack", 10);
        fVar.f24455a.mo16528a();
        this.f24440b = true;
        if (C8976c.m17751g()) {
            new String[1][0] = "BlockDetector init: ";
        }
    }

    /* renamed from: d */
    public final void mo16266d() {
        super.mo16266d();
        C8983f fVar = this.f24442d;
        try {
            if (fVar.f24455a.mo16532b()) {
                fVar.f24460f = new C8980c(SystemClock.uptimeMillis());
                fVar.f24455a.mo16530a(fVar.f24461g, fVar.f24457c);
                if (fVar.f24456b) {
                    fVar.f24455a.mo16530a(fVar.f24462h, fVar.f24458d);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final void mo16221b(Activity activity) {
        mo16272b();
    }

    /* renamed from: a */
    public final void mo16269a(long j) {
        this.f24442d.mo16278a(j);
    }

    /* renamed from: a */
    public final void mo16271a(boolean z) {
        this.f24442d.f24456b = z;
    }

    /* renamed from: a */
    public final void mo16218a(Activity activity) {
        if (this.f24441c) {
            this.f24441c = false;
            C8981d.m17780b(this);
            this.f24442d.mo16279c();
            if (C8976c.m17751g()) {
                new String[1][0] = "BlockDetector stop: ";
            }
        }
    }

    /* renamed from: a */
    public final void mo16270a(JSONObject jSONObject, boolean z) {
        JSONObject a = C9185g.m18234a(jSONObject, "performance_modules", "smooth");
        if (a != null) {
            long optLong = a.optLong("block_threshold", 2500);
            long optLong2 = a.optLong("serious_block_threshold", 5000);
            this.f24442d.mo16278a(optLong);
            C8983f fVar = this.f24442d;
            if (optLong2 < fVar.f24457c) {
                optLong2 = 5000;
            }
            fVar.f24458d = optLong2;
            fVar.mo16280d();
        }
    }
}
