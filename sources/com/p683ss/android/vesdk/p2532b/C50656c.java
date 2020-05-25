package com.p683ss.android.vesdk.p2532b;

import android.graphics.SurfaceTexture;
import com.p683ss.android.ttvecamera.C20232i.C20235b;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.vesdk.p2532b.C50654b.C50655a;

/* renamed from: com.ss.android.vesdk.b.c */
public final class C50656c extends C50654b {

    /* renamed from: a */
    public int f127009a;

    /* renamed from: h */
    public SurfaceTexture f127010h;

    /* renamed from: a */
    public final SurfaceTexture mo99029a() {
        return this.f127010h;
    }

    /* renamed from: b */
    public final boolean mo99030b() {
        if (!super.mo99030b() || this.f127009a == 0 || this.f127010h == null) {
            return false;
        }
        return true;
    }

    public C50656c(TEFrameSizei tEFrameSizei, C50655a aVar, boolean z, int i, SurfaceTexture surfaceTexture) {
        super(C20235b.PIXEL_FORMAT_OpenGL_OES, tEFrameSizei, aVar, true, surfaceTexture);
        this.f127009a = i;
        this.f127010h = surfaceTexture;
    }
}
