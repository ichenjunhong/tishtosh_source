package com.p683ss.android.ugc.asve.recorder.camera.p1248c;

import android.content.Context;
import com.p683ss.android.medialib.camera.C19263c;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.ugc.asve.recorder.camera.C20457b;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.f */
public final class C20471f extends C20464a {

    /* renamed from: e */
    public C20457b f56119e;

    /* renamed from: f */
    private final float f56120f = 14.874f;

    /* renamed from: b */
    public final boolean mo43421b() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo43422b(boolean z) {
        return z;
    }

    /* renamed from: c */
    public final boolean mo43423c() {
        return true;
    }

    /* renamed from: a */
    public final void mo43419a(final boolean z) {
        this.f56110c = z;
        this.f56111d = new C19263c() {
            /* renamed from: a */
            public final void mo39671a(int i, int i2, String str) {
            }

            /* renamed from: a */
            public final void mo39670a(int i) {
                if (C20471f.this.f56119e.mo43365d() == 1) {
                    C20471f.this.f56119e.mo43343a((C19269a) new C20473g(this, z));
                } else {
                    C20471f.this.f56119e.mo43343a((C19269a) null);
                }
            }
        };
    }

    public C20471f(C20457b bVar, C20476i iVar) {
        super(iVar);
        this.f56119e = bVar;
    }

    /* renamed from: a */
    public final float mo43416a(float f, int i) {
        float f2;
        if (i != 1 || !this.f56110c) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        return Math.min(f2, f);
    }

    /* renamed from: a */
    public final void mo43418a(Context context, C19263c cVar) {
        float f;
        this.f56110c = !this.f56110c;
        C20457b bVar = this.f56119e;
        if (this.f56110c) {
            f = 0.0f;
        } else {
            f = 14.874f;
        }
        bVar.mo43352a(f);
        this.f56108a.mo43428a(this.f56110c);
    }

    /* renamed from: b */
    public final float mo43420b(float f, int i) {
        float f2;
        if (i != 1) {
            f2 = f;
        } else if (this.f56110c) {
            f2 = 0.0f;
        } else {
            f2 = 14.874f;
        }
        return Math.max(f2, f);
    }
}
