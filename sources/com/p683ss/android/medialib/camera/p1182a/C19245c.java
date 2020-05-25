package com.p683ss.android.medialib.camera.p1182a;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import com.p683ss.android.medialib.camera.C19236a;
import com.p683ss.android.medialib.camera.C19268f;
import com.p683ss.android.medialib.camera.C19268f.C19271c;
import com.p683ss.android.medialib.camera.C19274g;
import com.p683ss.android.medialib.camera.C19307k;
import com.p683ss.android.medialib.camera.ImageFrame;
import com.p683ss.android.medialib.presenter.C19360c;

/* renamed from: com.ss.android.medialib.camera.a.c */
public final class C19245c extends C19242a {

    /* renamed from: h */
    public C19307k f53094h = new C19307k();

    /* renamed from: i */
    private boolean f53095i;

    /* renamed from: b */
    public final void mo39608b() {
        this.f53094h.mo39802b();
    }

    /* renamed from: d */
    public final void mo39678d() {
        if (this.f53088b != null) {
            this.f53088b.mo39659f();
        }
    }

    /* renamed from: c */
    public final int mo39609c() {
        C19360c cVar = this.f53087a;
        if (this.f53088b == null || cVar == null) {
            return 0;
        }
        if (this.f53090d) {
            synchronized (this.f53091e) {
                boolean z = true;
                if (this.f53088b.mo39666m() != 1) {
                    z = false;
                }
                cVar.mo40242a(this.f53093g, z);
                this.f53090d = false;
            }
        }
        if (this.f53095i) {
            SurfaceTexture surfaceTexture = this.f53094h.f53343b;
            if (surfaceTexture != null) {
                try {
                    surfaceTexture.updateTexImage();
                    cVar.mo40237a(this.f53094h.mo39804d());
                } catch (Throwable unused) {
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo39607a() {
        int i;
        if (this.f53087a != null) {
            if (this.f53088b.mo39668o() == 17) {
                i = 0;
            } else {
                i = 1;
            }
            this.f53087a.mo40238a(i);
        }
        this.f53094h.mo39801a();
        this.f53088b.mo39653b(this.f53094h.f53343b);
        if (C19274g.m47034b().f53200k.f53177o != 4) {
            this.f53094h.f53344c = new OnFrameAvailableListener() {
                public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                    if (C19245c.this.f53092f != C19245c.this.f53088b.mo39666m() || C19245c.this.f53093g != C19245c.this.f53088b.mo39660g()) {
                        synchronized (C19245c.this.f53091e) {
                            C19245c.this.f53092f = C19245c.this.f53088b.mo39666m();
                            C19245c.this.f53093g = C19245c.this.f53088b.mo39660g();
                            C19245c.this.f53090d = true;
                        }
                    }
                }
            };
        }
        if (this.f53087a != null) {
            this.f53087a.mo40243a(this.f53094h.f53343b);
        }
    }

    public C19245c(final C19268f fVar) {
        super(fVar);
        this.f53095i = fVar instanceof C19236a;
        fVar.mo39642a((C19271c) new C19271c() {
            /* renamed from: a */
            public final void mo39680a(int i, ImageFrame imageFrame) {
                if (!(C19274g.m47034b().f53200k.f53177o == 1 || (C19245c.this.f53092f == fVar.mo39666m() && C19245c.this.f53093g == fVar.mo39660g()))) {
                    synchronized (C19245c.this.f53091e) {
                        C19245c.this.f53092f = fVar.mo39666m();
                        C19245c.this.f53093g = fVar.mo39660g();
                        C19245c.this.f53090d = true;
                    }
                }
                if (!(C19245c.this.f53087a == null || fVar == null)) {
                    if (C19274g.m47034b().f53200k.f53177o == 4) {
                        C19245c.this.f53087a.mo40241a(imageFrame, C19245c.this.f53094h.f53342a);
                    } else {
                        C19245c.this.f53087a.mo40240a(imageFrame);
                    }
                }
                if (C19245c.this.f53089c != null) {
                    C19245c.this.f53089c.mo39679a();
                }
            }
        });
    }
}
