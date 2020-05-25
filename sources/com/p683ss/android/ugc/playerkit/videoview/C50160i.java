package com.p683ss.android.ugc.playerkit.videoview;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;

/* renamed from: com.ss.android.ugc.playerkit.videoview.i */
public final class C50160i implements C50159h {

    /* renamed from: a */
    public C50159h f125678a;

    /* renamed from: a */
    public final View mo97949a() {
        return this.f125678a.mo97949a();
    }

    /* renamed from: b */
    public final Surface mo97952b() {
        return this.f125678a.mo97952b();
    }

    /* renamed from: c */
    public final boolean mo97954c() {
        return this.f125678a.mo97954c();
    }

    /* renamed from: d */
    public final void mo97955d() {
        this.f125678a.mo97955d();
    }

    /* renamed from: e */
    public final void mo97956e() {
        this.f125678a.mo97956e();
    }

    /* renamed from: f */
    public final void mo97957f() {
        this.f125678a.mo97957f();
    }

    /* renamed from: g */
    public final int mo97958g() {
        return this.f125678a.mo97958g();
    }

    /* renamed from: h */
    public final boolean mo97959h() {
        return this.f125678a.mo97959h();
    }

    /* renamed from: i */
    public final boolean mo97967i() {
        if (mo97958g() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo97950a(C50161j jVar) {
        this.f125678a.mo97950a(jVar);
    }

    /* renamed from: b */
    public final void mo97953b(C50161j jVar) {
        this.f125678a.mo97953b(jVar);
    }

    /* renamed from: a */
    public static C50160i m108259a(KeepSurfaceTextureView keepSurfaceTextureView) {
        Object tag = keepSurfaceTextureView.getTag();
        if (tag instanceof C50160i) {
            return (C50160i) tag;
        }
        C50160i iVar = new C50160i();
        iVar.f125678a = new C50156f(keepSurfaceTextureView);
        keepSurfaceTextureView.setTag(iVar);
        return iVar;
    }

    /* renamed from: a */
    public static C50160i m108258a(ViewGroup viewGroup) {
        boolean f = C50109a.m108068s().mo95425f();
        C50160i iVar = new C50160i();
        if (f) {
            iVar.f125678a = new C50154e(viewGroup);
        } else {
            iVar.f125678a = new C50156f(viewGroup);
        }
        iVar.mo97949a().setTag(iVar);
        return iVar;
    }

    /* renamed from: a */
    public final void mo97951a(boolean z) {
        this.f125678a.mo97951a(z);
    }
}
