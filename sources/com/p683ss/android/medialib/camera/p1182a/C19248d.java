package com.p683ss.android.medialib.camera.p1182a;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import com.p683ss.android.medialib.camera.C19268f;
import com.p683ss.android.medialib.camera.C19307k;
import com.p683ss.android.medialib.p1180b.C19222a;
import com.p683ss.android.medialib.presenter.C19360c;
import com.p683ss.android.vesdk.C50792y;

/* renamed from: com.ss.android.medialib.camera.a.d */
public class C19248d extends C19242a {

    /* renamed from: h */
    public static final String f53099h = "d";

    /* renamed from: i */
    public C19307k f53100i = new C19307k();

    /* renamed from: b */
    public final void mo39608b() {
        this.f53100i.mo39802b();
    }

    /* renamed from: d */
    public final void mo39678d() {
        if (this.f53088b != null) {
            this.f53088b.mo39639a(this.f53100i.f53343b);
        } else {
            C50792y.m109914d(f53099h, "startPreview: camera is null!");
        }
    }

    /* renamed from: a */
    public final void mo39607a() {
        this.f53100i.mo39801a();
        C19222a.m46852a("CreateTexture");
        this.f53100i.f53344c = new OnFrameAvailableListener() {
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (C19248d.this.f53087a != null) {
                    C19248d.this.f53087a.mo40239a(C19248d.this.f53100i.f53342a, C19248d.this.f53100i.f53345d);
                } else {
                    C50792y.m109913c(C19248d.f53099h, "onFrameAvailable: presenter is null!");
                }
                if (!(C19248d.this.f53092f == C19248d.this.f53088b.mo39666m() && C19248d.this.f53093g == C19248d.this.f53088b.mo39660g())) {
                    synchronized (C19248d.this.f53091e) {
                        C19248d.this.f53092f = C19248d.this.f53088b.mo39666m();
                        C19248d.this.f53093g = C19248d.this.f53088b.mo39660g();
                        C19248d.this.f53090d = true;
                    }
                }
                if (C19248d.this.f53089c != null) {
                    C19248d.this.f53089c.mo39679a();
                }
            }
        };
        if (this.f53087a != null) {
            this.f53087a.mo40243a(this.f53100i.f53343b);
        } else {
            C50792y.m109914d(f53099h, "onOpenGLCreate: presenter is null!");
        }
    }

    /* renamed from: c */
    public final int mo39609c() {
        C19360c cVar = this.f53087a;
        if (this.f53100i.f53343b == null || cVar == null) {
            C50792y.m109914d(f53099h, "SurfaceTexture is null");
            return -1;
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
        try {
            this.f53100i.mo39803c();
            double d = this.f53100i.mo39804d();
            this.f53087a.mo40237a(d);
            cVar.mo40237a(d);
            return 0;
        } catch (RuntimeException e) {
            C50792y.m109914d(f53099h, e.getMessage());
            return -2;
        }
    }

    public C19248d(C19268f fVar) {
        super(fVar);
    }
}
