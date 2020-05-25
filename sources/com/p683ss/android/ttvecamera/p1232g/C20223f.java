package com.p683ss.android.ttvecamera.p1232g;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build.VERSION;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20201f;
import com.p683ss.android.ttvecamera.C20232i;
import com.p683ss.android.ttvecamera.C20232i.C20236c;
import com.p683ss.android.ttvecamera.C20285m;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ttvecamera.p1232g.C20217c.C20218a;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.f */
public final class C20223f extends C20214b {

    /* renamed from: a */
    SurfaceTexture f55570a;

    /* renamed from: b */
    Surface f55571b;

    /* renamed from: i */
    float[] f55572i = new float[16];

    /* renamed from: j */
    int f55573j;

    /* renamed from: a */
    public final Surface mo42801a() {
        return this.f55571b;
    }

    /* renamed from: b */
    public final SurfaceTexture mo42802b() {
        return this.f55570a;
    }

    /* renamed from: c */
    public final int mo42803c() {
        return 1;
    }

    /* renamed from: e */
    public final void mo42808e() {
        super.mo42808e();
        if (this.f55571b != null) {
            this.f55571b.release();
            this.f55571b = null;
        }
    }

    /* renamed from: d */
    public final void mo42804d() {
        if (this.f55571b != null) {
            this.f55571b.release();
        }
        if (this.f55570a != null) {
            this.f55570a.release();
        }
        this.f55570a = new SurfaceTexture(this.f55573j);
        this.f55571b = new Surface(this.f55570a);
        this.f55546c.onNewSurfaceTexture(this.f55570a);
    }

    /* renamed from: a */
    public final int mo42806a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return mo42800a(m49952a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), tEFrameSizei);
    }

    public C20223f(C20218a aVar, C20201f fVar) {
        super(aVar, fVar);
        this.f55570a = aVar.f55558d;
        this.f55573j = aVar.f55559e;
        this.f55571b = new Surface(this.f55570a);
    }

    /* renamed from: a */
    public final int mo42800a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f55548e = C20285m.m50046a(list, this.f55548e);
        }
        this.f55570a.setDefaultBufferSize(this.f55548e.f55398a, this.f55548e.f55399b);
        C202241 r2 = new OnFrameAvailableListener() {
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (C20223f.this.f55549f != null) {
                    surfaceTexture.getTransformMatrix(C20223f.this.f55572i);
                    C20232i iVar = new C20232i(C20223f.this.f55548e.f55398a, C20223f.this.f55548e.f55399b, surfaceTexture.getTimestamp());
                    C20236c cVar = new C20236c(iVar.f55591a, iVar.f55592b, iVar.f55593c, C20223f.this.f55573j, C20223f.this.f55549f.mo42779r(), C20223f.this.f55572i, C20223f.this.f55547d, C20223f.this.f55549f.f55527o);
                    iVar.f55594d = cVar;
                    C20223f.this.mo42807a(iVar);
                }
            }
        };
        if (VERSION.SDK_INT >= 21) {
            this.f55570a.setOnFrameAvailableListener(r2, this.f55549f.f55523k);
        } else {
            this.f55570a.setOnFrameAvailableListener(r2);
        }
        return 0;
    }
}
