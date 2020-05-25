package com.p683ss.android.vesdk.p2535e;

import android.view.Surface;
import com.p683ss.android.vesdk.C50588a;

/* renamed from: com.ss.android.vesdk.e.c */
public class C50688c implements C50689d {

    /* renamed from: a */
    private C50588a<C50689d> f127119a;

    /* renamed from: c */
    public int f127120c;

    /* renamed from: d */
    public int f127121d;

    /* renamed from: e */
    public Surface f127122e;

    /* renamed from: f */
    public boolean f127123f;

    /* renamed from: a */
    public final boolean mo99107a(C50689d dVar) {
        return this.f127119a.mo98727a(dVar);
    }

    /* renamed from: b */
    public final boolean mo99108b(C50689d dVar) {
        return this.f127119a.mo98729b(dVar);
    }

    /* renamed from: a */
    public final void mo98904a(Surface surface) {
        this.f127122e = surface;
        this.f127123f = false;
        for (C50689d a : this.f127119a.mo98728b()) {
            a.mo98904a(surface);
        }
    }

    /* renamed from: b */
    public final void mo98906b(Surface surface) {
        for (C50689d b : this.f127119a.mo98728b()) {
            b.mo98906b(surface);
        }
    }

    /* renamed from: a */
    public final void mo98905a(Surface surface, int i, int i2, int i3) {
        if (this.f127120c == i3 && this.f127121d == i3 && surface == this.f127122e) {
            this.f127123f = false;
        } else {
            this.f127123f = true;
            this.f127120c = i2;
            this.f127121d = i3;
        }
        for (C50689d a : this.f127119a.mo98728b()) {
            a.mo98905a(surface, i, i2, i3);
        }
    }
}
