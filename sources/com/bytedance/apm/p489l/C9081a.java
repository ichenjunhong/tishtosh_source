package com.bytedance.apm.p489l;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.apm.C8976c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.p480f.p481a.C9014a;
import com.bytedance.apm.p480f.p482b.C9024f;
import com.bytedance.apm.p497o.C9149b;
import com.bytedance.apm.p497o.C9149b.C9153b;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.apm.api.C13220c;
import com.bytedance.services.slardar.config.C13226a;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.l.a */
public abstract class C9081a implements C9153b, C13220c, C13226a {

    /* renamed from: a */
    private boolean f24808a;

    /* renamed from: b */
    private boolean f24809b;

    /* renamed from: c */
    public boolean f24810c;

    /* renamed from: d */
    public boolean f24811d;

    /* renamed from: e */
    protected String f24812e;

    /* renamed from: f */
    protected boolean f24813f;

    /* renamed from: g */
    private long f24814g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo16219a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo16220b() {
    }

    /* renamed from: c */
    public final void mo16273c(Activity activity) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo16222c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract long mo16223d();

    /* renamed from: d */
    public final void mo16274d(Activity activity) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo16225f() {
    }

    /* renamed from: e */
    public void mo16224e() {
        this.f24810c = true;
        m17982a();
    }

    /* renamed from: a */
    private final void m17982a() {
        if (!this.f24809b) {
            this.f24809b = true;
            if (mo16222c()) {
                C9149b.m18170a().mo16523a((C9153b) this);
            }
        }
        mo16225f();
        this.f24814g = System.currentTimeMillis();
    }

    /* renamed from: h */
    public final void mo16447h() {
        if (this.f24809b) {
            this.f24809b = false;
            if (mo16222c()) {
                C9149b.m18170a().mo16525b(this);
            }
        }
    }

    /* renamed from: g */
    public final void mo16446g() {
        if (!this.f24808a) {
            if (!TextUtils.isEmpty(this.f24812e)) {
                this.f24808a = true;
                ActivityLifeObserver.getInstance().register(this);
                this.f24811d = true ^ ActivityLifeObserver.getInstance().isForeground();
                mo16220b();
                ((IConfigManager) C12401c.m24975a(IConfigManager.class)).registerConfigListener(this);
                return;
            }
            throw new IllegalStateException("Must set collector Setting key, before init");
        }
    }

    /* renamed from: a */
    protected static void m17983a(C9024f fVar) {
        C9014a.m17825a().mo16336a(fVar);
    }

    /* renamed from: a */
    public void mo16218a(Activity activity) {
        this.f24811d = true;
        if (C8976c.m17748d()) {
            mo16447h();
        }
    }

    /* renamed from: b */
    public void mo16221b(Activity activity) {
        this.f24811d = false;
        if (C8976c.m17748d() && this.f24810c) {
            m17982a();
        }
    }

    /* renamed from: a */
    public final void mo16358a(long j) {
        long d = mo16223d();
        if (d > 0 && j - this.f24814g > d && this.f24810c) {
            mo16225f();
            this.f24814g = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo16270a(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject = jSONObject.optJSONObject("performance_modules");
        if (optJSONObject != null) {
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(this.f24812e);
            if (optJSONObject2 != null) {
                boolean z2 = false;
                if (optJSONObject2.optInt("enable_upload", 0) == 1) {
                    z2 = true;
                }
                this.f24813f = z2;
                mo16219a(optJSONObject2);
            }
        }
    }
}
