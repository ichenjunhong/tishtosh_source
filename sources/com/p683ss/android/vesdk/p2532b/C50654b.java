package com.p683ss.android.vesdk.p2532b;

import android.graphics.SurfaceTexture;
import com.p683ss.android.ttvecamera.C20232i;
import com.p683ss.android.ttvecamera.C20232i.C20235b;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ttvecamera.p1232g.C20214b.C20216a;

/* renamed from: com.ss.android.vesdk.b.b */
public class C50654b {

    /* renamed from: b */
    public C20235b f127003b;

    /* renamed from: c */
    public TEFrameSizei f127004c;

    /* renamed from: d */
    public C50655a f127005d;

    /* renamed from: e */
    public boolean f127006e;

    /* renamed from: f */
    public boolean f127007f;

    /* renamed from: g */
    SurfaceTexture f127008g;

    /* renamed from: com.ss.android.vesdk.b.b$a */
    public interface C50655a extends C20216a {
        /* renamed from: a */
        void mo99031a(TEFrameSizei tEFrameSizei);

        void onFrameCaptured(C20232i iVar);

        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* renamed from: a */
    public SurfaceTexture mo99029a() {
        return this.f127008g;
    }

    /* renamed from: b */
    public boolean mo99030b() {
        if (this.f127004c == null || this.f127004c.f55398a <= 0 || this.f127004c.f55399b <= 0 || this.f127005d == null) {
            return false;
        }
        return true;
    }

    public C50654b(C20235b bVar, TEFrameSizei tEFrameSizei, C50655a aVar, boolean z, SurfaceTexture surfaceTexture) {
        this.f127003b = bVar;
        this.f127004c = tEFrameSizei;
        this.f127005d = aVar;
        this.f127006e = z;
        this.f127008g = surfaceTexture;
    }
}
