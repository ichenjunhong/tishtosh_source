package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.C15515f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

@C16299uq
public final class ams extends C15584al {

    /* renamed from: a */
    final aib f41035a;

    /* renamed from: b */
    final Object f41036b = new Object();

    /* renamed from: c */
    int f41037c;

    /* renamed from: d */
    C15606an f41038d;

    /* renamed from: e */
    boolean f41039e;

    /* renamed from: f */
    boolean f41040f = true;

    /* renamed from: g */
    private final boolean f41041g;

    /* renamed from: h */
    private final boolean f41042h;

    /* renamed from: i */
    private float f41043i;

    /* renamed from: j */
    private float f41044j;

    /* renamed from: k */
    private float f41045k;

    /* renamed from: l */
    private boolean f41046l;

    /* renamed from: m */
    private boolean f41047m;

    public ams(aib aib, float f, boolean z, boolean z2) {
        this.f41035a = aib;
        this.f41043i = f;
        this.f41041g = z;
        this.f41042h = z2;
    }

    /* renamed from: a */
    public final void mo29062a() {
        m33613a("play", null);
    }

    /* renamed from: b */
    public final void mo29065b() {
        m33613a("pause", null);
    }

    /* renamed from: k */
    public final void mo29074k() {
        m33613a("stop", null);
    }

    /* renamed from: a */
    public final void mo29064a(boolean z) {
        m33613a(z ? "mute" : "unmute", null);
    }

    /* renamed from: a */
    public final void mo29350a(zzacq zzacq) {
        mo29351a(zzacq.f46062a, zzacq.f46063b, zzacq.f46064c);
    }

    /* renamed from: a */
    public final void mo29351a(boolean z, boolean z2, boolean z3) {
        synchronized (this.f41036b) {
            this.f41046l = z2;
            this.f41047m = z3;
        }
        m33613a("initialState", C15515f.m32275a("muteStart", z ? "1" : "0", "customControlsRequested", z2 ? "1" : "0", "clickToExpandRequested", z3 ? "1" : "0"));
    }

    /* renamed from: a */
    private final void m33613a(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        agf.f40430a.execute(new amt(this, hashMap));
    }

    /* renamed from: c */
    public final boolean mo29066c() {
        boolean z;
        synchronized (this.f41036b) {
            z = this.f41040f;
        }
        return z;
    }

    /* renamed from: d */
    public final int mo29067d() {
        int i;
        synchronized (this.f41036b) {
            i = this.f41037c;
        }
        return i;
    }

    /* renamed from: g */
    public final float mo29070g() {
        float f;
        synchronized (this.f41036b) {
            f = this.f41045k;
        }
        return f;
    }

    /* renamed from: e */
    public final float mo29068e() {
        float f;
        synchronized (this.f41036b) {
            f = this.f41043i;
        }
        return f;
    }

    /* renamed from: f */
    public final float mo29069f() {
        float f;
        synchronized (this.f41036b) {
            f = this.f41044j;
        }
        return f;
    }

    /* renamed from: a */
    public final void mo29063a(C15606an anVar) {
        synchronized (this.f41036b) {
            this.f41038d = anVar;
        }
    }

    /* renamed from: i */
    public final C15606an mo29072i() throws RemoteException {
        C15606an anVar;
        synchronized (this.f41036b) {
            anVar = this.f41038d;
        }
        return anVar;
    }

    /* renamed from: h */
    public final boolean mo29071h() {
        boolean z;
        synchronized (this.f41036b) {
            z = this.f41041g && this.f41046l;
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo29073j() {
        boolean z;
        boolean h = mo29071h();
        synchronized (this.f41036b) {
            if (!h) {
                try {
                    if (this.f41047m && this.f41042h) {
                        z = true;
                    }
                } finally {
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo29347a(float f) {
        synchronized (this.f41036b) {
            this.f41044j = f;
        }
    }

    /* renamed from: a */
    public final void mo29348a(float f, float f2, int i, boolean z, float f3) {
        boolean z2;
        int i2;
        synchronized (this.f41036b) {
            this.f41043i = f2;
            this.f41044j = f;
            z2 = this.f41040f;
            this.f41040f = z;
            i2 = this.f41037c;
            this.f41037c = i;
            float f4 = this.f41045k;
            this.f41045k = f3;
            if (Math.abs(this.f41045k - f4) > 1.0E-4f) {
                this.f41035a.getView().invalidate();
            }
        }
        mo29349a(i2, i, z2, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29349a(int i, int i2, boolean z, boolean z2) {
        Executor executor = agf.f40430a;
        amu amu = new amu(this, i, i2, z, z2);
        executor.execute(amu);
    }
}
