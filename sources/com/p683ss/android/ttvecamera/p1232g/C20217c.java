package com.p683ss.android.ttvecamera.p1232g;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20232i.C20235b;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ttvecamera.p1232g.C20214b.C20216a;

/* renamed from: com.ss.android.ttvecamera.g.c */
public class C20217c {

    /* renamed from: a */
    public static final String f55553a = "c";

    /* renamed from: b */
    public C20214b f55554b;

    /* renamed from: com.ss.android.ttvecamera.g.c$a */
    public static class C20218a {

        /* renamed from: a */
        public boolean f55555a = true;

        /* renamed from: b */
        public TEFrameSizei f55556b;

        /* renamed from: c */
        public C20216a f55557c;

        /* renamed from: d */
        public SurfaceTexture f55558d;

        /* renamed from: e */
        public int f55559e;

        /* renamed from: f */
        public int f55560f;

        /* renamed from: g */
        public C20235b f55561g = C20235b.PIXEL_FORMAT_Count;

        public C20218a(TEFrameSizei tEFrameSizei, C20216a aVar, boolean z, SurfaceTexture surfaceTexture, int i) {
            this.f55556b = tEFrameSizei;
            this.f55557c = aVar;
            this.f55558d = surfaceTexture;
            this.f55559e = i;
            this.f55555a = z;
            this.f55561g = C20235b.PIXEL_FORMAT_OpenGL_OES;
        }

        public C20218a(TEFrameSizei tEFrameSizei, C20216a aVar, boolean z, SurfaceTexture surfaceTexture, C20235b bVar, int i) {
            this.f55556b = tEFrameSizei;
            this.f55557c = aVar;
            this.f55558d = surfaceTexture;
            this.f55555a = z;
            this.f55561g = bVar;
            this.f55560f = i;
        }
    }

    /* renamed from: a */
    public final int mo42812a() {
        if (this.f55554b != null) {
            return this.f55554b.mo42803c();
        }
        return 0;
    }

    /* renamed from: b */
    public final Surface mo42814b() {
        if (this.f55554b != null) {
            return this.f55554b.mo42801a();
        }
        return null;
    }

    /* renamed from: c */
    public final Surface[] mo42815c() {
        if (this.f55554b != null) {
            return this.f55554b.mo42809f();
        }
        return null;
    }

    /* renamed from: d */
    public final SurfaceTexture mo42816d() {
        if (this.f55554b != null) {
            return this.f55554b.mo42802b();
        }
        return null;
    }

    /* renamed from: e */
    public final TEFrameSizei mo42817e() {
        if (this.f55554b.f55550g) {
            return this.f55554b.f55548e;
        }
        return null;
    }

    /* renamed from: a */
    public final int mo42813a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        if (this.f55554b == null || this.f55554b == null) {
            return -112;
        }
        return this.f55554b.mo42806a(streamConfigurationMap, tEFrameSizei);
    }
}
