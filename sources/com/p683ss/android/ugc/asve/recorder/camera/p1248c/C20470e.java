package com.p683ss.android.ugc.asve.recorder.camera.p1248c;

import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.ugc.asve.sandbox.C20752d;
import com.p683ss.android.ugc.asve.sandbox.C20806o;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20600b;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20667c.C20668a;
import java.lang.reflect.Proxy;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.e */
public final class C20470e implements C20469d {

    /* renamed from: a */
    private final C20806o f56117a;

    /* renamed from: b */
    private final C20806o f56118b;

    /* renamed from: a */
    public final void mo43428a(boolean z) {
    }

    /* renamed from: c */
    public final int mo43432c() {
        return this.f56117a.mo44119d();
    }

    /* renamed from: d */
    public final int mo43434d() {
        return this.f56117a.mo44120e();
    }

    /* renamed from: e */
    public final boolean mo43435e() {
        return this.f56117a.mo44121f();
    }

    /* renamed from: f */
    public final boolean mo43436f() {
        return this.f56117a.mo44112a();
    }

    /* renamed from: g */
    public final boolean mo43437g() {
        return this.f56117a.mo44122g();
    }

    /* renamed from: a */
    public final int mo43425a() {
        return this.f56117a.mo44115b();
    }

    /* renamed from: b */
    public final boolean mo43430b() {
        return this.f56117a.mo44117c();
    }

    /* renamed from: c */
    public final boolean mo43433c(boolean z) {
        return this.f56117a.mo44118c(z);
    }

    /* renamed from: a */
    public final void mo43426a(int i) {
        this.f56117a.mo44110a(i);
    }

    /* renamed from: b */
    public final boolean mo43431b(boolean z) {
        return this.f56117a.mo44113a(z);
    }

    public C20470e(C20806o oVar) {
        C52711k.m112240b(oVar, "remoteWideCameraComponent");
        this.f56118b = oVar;
        Object newProxyInstance = Proxy.newProxyInstance(C20806o.class.getClassLoader(), new Class[]{C20806o.class}, new C20752d(this.f56118b));
        if (newProxyInstance != null) {
            this.f56117a = (C20806o) newProxyInstance;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
    }

    /* renamed from: a */
    public final void mo43427a(C19263c cVar) {
        C20668a aVar;
        C20806o oVar = this.f56117a;
        if (cVar != null) {
            aVar = C20600b.m51919a(cVar);
        } else {
            aVar = null;
        }
        oVar.mo44111a((C20667c) aVar);
    }

    /* renamed from: a */
    public final float mo43424a(float f, int i) {
        return this.f56117a.mo44109a(f, i);
    }

    /* renamed from: b */
    public final float mo43429b(float f, int i) {
        return this.f56117a.mo44114b(f, i);
    }
}
