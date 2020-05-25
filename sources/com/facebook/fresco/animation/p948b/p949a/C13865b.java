package com.facebook.fresco.animation.p948b.p949a;

import android.graphics.Bitmap;
import com.facebook.common.p924h.C13715a;
import com.facebook.fresco.animation.p948b.C13867b;

/* renamed from: com.facebook.fresco.animation.b.a.b */
public final class C13865b implements C13867b {

    /* renamed from: a */
    private int f36175a = -1;

    /* renamed from: b */
    private C13715a<Bitmap> f36176b;

    /* renamed from: b */
    public final void mo26015b(int i, C13715a<Bitmap> aVar, int i2) {
    }

    /* renamed from: a */
    public final synchronized void mo26012a() {
        m28230b();
    }

    /* renamed from: b */
    private synchronized void m28230b() {
        C13715a.m27752c(this.f36176b);
        this.f36176b = null;
        this.f36175a = -1;
    }

    /* renamed from: b */
    public final synchronized C13715a<Bitmap> mo26014b(int i) {
        return C13715a.m27751b(this.f36176b);
    }

    /* renamed from: a */
    public final synchronized C13715a<Bitmap> mo26010a(int i) {
        if (this.f36175a != i) {
            return null;
        }
        return C13715a.m27751b(this.f36176b);
    }

    /* renamed from: c */
    public final synchronized boolean mo26016c(int i) {
        boolean z;
        if (i != this.f36175a || !C13715a.m27750a(this.f36176b)) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized C13715a<Bitmap> mo26011a(int i, int i2, int i3) {
        C13715a<Bitmap> b;
        try {
            b = C13715a.m27751b(this.f36176b);
            m28230b();
        } catch (Throwable th) {
            m28230b();
            throw th;
        }
        return b;
    }

    /* renamed from: a */
    public final synchronized void mo26013a(int i, C13715a<Bitmap> aVar, int i2) {
        if (aVar != null) {
            if (this.f36176b != null && ((Bitmap) aVar.mo25630a()).equals(this.f36176b.mo25630a())) {
                return;
            }
        }
        C13715a.m27752c(this.f36176b);
        this.f36176b = C13715a.m27751b(aVar);
        this.f36175a = i;
    }
}
