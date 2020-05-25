package com.google.android.gms.internal.ads;

import android.content.Context;
import com.C2240a;
import com.google.android.gms.ads.internal.C14986bt;
import com.google.android.gms.common.util.C15525p;
import java.util.Map;
import org.json.JSONObject;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.lp */
public final class C16055lp implements C16046lg, C16053ln {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public final ama f45172a;

    /* renamed from: b */
    private final Context f45173b;

    public C16055lp(Context context, zzbgz zzbgz, beh beh, C14986bt btVar) throws amk {
        this.f45173b = context;
        this.f45172a = amg.m33346a(context, anp.m33671a(), "", false, false, beh, zzbgz, null, null, null, byc.m36979a());
        this.f45172a.getView().setWillNotDraw(true);
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
    private static void m38027a(Runnable runnable) {
        if (aes.m32760b()) {
            runnable.run();
        } else {
            acd.f40245a.post(runnable);
        }
    }

    /* renamed from: d */
    public final void mo29248d(String str) {
        m38027a((Runnable) new C16056lq(this, str));
    }

    /* renamed from: a */
    public final void mo31149a(String str) {
        m38027a((Runnable) new C16059lt(this, C2240a.m6772a("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    /* renamed from: b */
    public final void mo31150b(String str) {
        m38027a((Runnable) new C16060lu(this, str));
    }

    /* renamed from: c */
    public final void mo31153c(String str) {
        m38027a((Runnable) new C16061lv(this, str));
    }

    /* renamed from: a */
    public final void mo31166a(String str, C15948hq<? super C16090mx> hqVar) {
        this.f45172a.mo29157a(str, (C15948hq<? super ama>) new C16062lw<Object>(this, hqVar));
    }

    /* renamed from: b */
    public final void mo31167b(String str, C15948hq<? super C16090mx> hqVar) {
        this.f45172a.mo29156a(str, (C15525p<C15948hq<? super ama>>) new C16057lr<C15948hq<? super ama>>(hqVar));
    }

    /* renamed from: a */
    public final void mo31148a(C16054lo loVar) {
        anj w = this.f45172a.mo29197w();
        loVar.getClass();
        w.mo29208a((anl) new C16058ls(loVar));
    }

    /* renamed from: c */
    public final C16091my mo31152c() {
        return new C16092mz(this);
    }

    /* renamed from: a */
    public final void mo31147a() {
        this.f45172a.destroy();
    }

    /* renamed from: b */
    public final boolean mo31151b() {
        return this.f45172a.mo29139C();
    }
}
