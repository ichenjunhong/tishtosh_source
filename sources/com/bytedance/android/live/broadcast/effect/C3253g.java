package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.C3617q;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.common.utility.C9431p;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.effect.g */
public final class C3253g extends C3197a {

    /* renamed from: g */
    private final String f9394g = "smooth/frag/whitenIntensity";

    /* renamed from: h */
    private final String f9395h = "smooth/frag/smoothIntensity";

    /* renamed from: i */
    private final String f9396i = "";

    /* renamed from: j */
    private final String f9397j = "FaceDistortionEyeIntensity";

    /* renamed from: k */
    private final String f9398k = "FaceDistortionCheekIntensity";

    /* renamed from: l */
    private C8688c f9399l = new C8688c();

    /* renamed from: m */
    private C8688c f9400m;

    /* renamed from: c */
    private void m8912c() {
        C3395f.m9156f().mo8740a().mo8268a("beauty", this.f9400m);
        m8909a(this.f9397j, this.f9266b);
        m8909a(this.f9398k, this.f9267c);
    }

    /* renamed from: b */
    private void m8911b() {
        C3395f.m9156f().mo8740a().mo8268a("beauty", this.f9399l);
        m8909a(this.f9396i, this.f9269e);
        m8909a(this.f9395h, this.f9265a);
        m8909a(this.f9394g, this.f9268d);
    }

    public C3253g() {
        this.f9399l.f23751l.addAll(Arrays.asList(new String[]{this.f9396i, this.f9395h, this.f9394g}));
        this.f9399l.f23759t = C3617q.INST.getBeautyComposerFilePath();
        this.f9400m = new C8688c();
        this.f9400m.f23744e = 1112;
        this.f9400m.f23751l.addAll(Arrays.asList(new String[]{this.f9398k, this.f9397j}));
        this.f9400m.f23759t = C3617q.INST.getReshapeComposerFilePath();
        mo8542d(((Float) C4525b.f12318N.mo10345a()).floatValue());
        mo8538a(((Float) C4525b.f12319O.mo10345a()).floatValue());
        mo8541c(((Float) C4525b.f12321Q.mo10345a()).floatValue());
        mo8540b(((Float) C4525b.f12320P.mo10345a()).floatValue());
    }

    /* renamed from: e */
    public final void mo8543e(float f) {
        if (!m8910a(C3395f.m9156f().mo8740a().mo8260a("beauty"), this.f9399l)) {
            m8911b();
        } else {
            m8909a(this.f9395h, f);
        }
    }

    /* renamed from: f */
    public final void mo8544f(float f) {
        if (!m8910a(C3395f.m9156f().mo8740a().mo8260a("beauty"), this.f9400m)) {
            m8912c();
        } else {
            m8909a(this.f9397j, f);
        }
    }

    /* renamed from: g */
    public final void mo8545g(float f) {
        if (!m8910a(C3395f.m9156f().mo8740a().mo8260a("beauty"), this.f9400m)) {
            m8912c();
        } else {
            m8909a(this.f9398k, f);
        }
    }

    /* renamed from: h */
    public final void mo8546h(float f) {
        if (!m8910a(C3395f.m9156f().mo8740a().mo8260a("beauty"), this.f9399l)) {
            m8911b();
        } else {
            m8909a(this.f9396i, f);
        }
    }

    /* renamed from: i */
    public final void mo8547i(float f) {
        if (!m8910a(C3395f.m9156f().mo8740a().mo8260a("beauty"), this.f9399l)) {
            m8911b();
        } else {
            m8909a(this.f9394g, 0.0f);
        }
    }

    /* renamed from: a */
    private static void m8909a(String str, float f) {
        C3395f.m9156f().mo8740a().mo8267a(str, f);
    }

    /* renamed from: a */
    private static boolean m8910a(List<C8688c> list, C8688c cVar) {
        for (C8688c cVar2 : list) {
            if (C9431p.m18665a(cVar2.f23759t, cVar.f23759t)) {
                return true;
            }
        }
        return false;
    }
}
