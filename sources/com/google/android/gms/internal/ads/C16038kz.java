package com.google.android.gms.internal.ads;

import android.content.Context;
import com.C2240a;
import com.google.android.gms.ads.internal.C14963ax;
import java.util.Map;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.kz */
public final class C16038kz extends C16050lk<C16090mx> implements C16046lg, C16053ln {

    /* renamed from: a */
    final aod f45148a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C16054lo f45149c;

    public C16038kz(Context context, zzbgz zzbgz) throws amk {
        try {
            this.f45148a = new aod(context, new C16045lf(this));
            this.f45148a.setWillNotDraw(true);
            this.f45148a.addJavascriptInterface(new C16044le(this), "GoogleJsInterface");
            C14963ax.m30831a().mo28665a(context, zzbgz.f46237a, this.f45148a.getSettings());
            this.f45160b = this;
        } catch (Throwable th) {
            throw new amk("Init failed.", th);
        }
    }

    /* renamed from: a */
    public final void mo29386a(String str, String str2) {
        C16047lh.m38005a((C16046lg) this, str, str2);
    }

    /* renamed from: a */
    public final void mo29242a(String str, Map map) {
        C16047lh.m38006a((C16046lg) this, str, map);
    }

    /* renamed from: a */
    public final void mo29243a(String str, JSONObject jSONObject) {
        C16047lh.m38008b(this, str, jSONObject);
    }

    /* renamed from: b */
    public final void mo29247b(String str, JSONObject jSONObject) {
        C16047lh.m38007a((C16046lg) this, str, jSONObject);
    }

    /* renamed from: a */
    public final void mo31149a(String str) {
        mo31150b(C2240a.m6772a("<!DOCTYPE html><html><head><script src=\"%s\"></script></head></html>", new Object[]{str}));
    }

    /* renamed from: b */
    public final void mo31150b(String str) {
        agf.f40430a.execute(new C16040la(this, str));
    }

    /* renamed from: c */
    public final void mo31153c(String str) {
        agf.f40430a.execute(new C16041lb(this, str));
    }

    /* renamed from: a */
    public final void mo31148a(C16054lo loVar) {
        this.f45149c = loVar;
    }

    /* renamed from: a */
    public final void mo31147a() {
        this.f45148a.destroy();
    }

    /* renamed from: b */
    public final boolean mo31151b() {
        return this.f45148a.mo29408C();
    }

    /* renamed from: c */
    public final C16091my mo31152c() {
        return new C16092mz(this);
    }

    /* renamed from: d */
    public final void mo29248d(String str) {
        agf.f40430a.execute(new C16042lc(this, str));
    }
}
