package com.p683ss.android.vesdk.p2532b;

import android.graphics.SurfaceTexture;
import com.p683ss.android.ttvecamera.C20232i.C20235b;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.vesdk.p2532b.C50654b.C50655a;

/* renamed from: com.ss.android.vesdk.b.a */
public final class C50653a extends C50654b {

    /* renamed from: a */
    public int f127001a;

    /* renamed from: h */
    private SurfaceTexture f127002h;

    /* renamed from: a */
    public final SurfaceTexture mo99029a() {
        return this.f127002h;
    }

    /* renamed from: b */
    public final boolean mo99030b() {
        return super.mo99030b();
    }

    public C50653a(TEFrameSizei tEFrameSizei, C50655a aVar, boolean z, SurfaceTexture surfaceTexture, int i) {
        super(C20235b.PIXEL_FORMAT_BUFFER, tEFrameSizei, aVar, true, surfaceTexture);
        this.f127002h = surfaceTexture;
        this.f127001a = i;
    }
}
