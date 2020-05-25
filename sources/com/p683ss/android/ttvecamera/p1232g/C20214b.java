package com.p683ss.android.ttvecamera.p1232g;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20201f;
import com.p683ss.android.ttvecamera.C20232i;
import com.p683ss.android.ttvecamera.C20232i.C20235b;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ttvecamera.p1232g.C20217c.C20218a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.b */
public abstract class C20214b {

    /* renamed from: a */
    private C20216a f55545a = new C20216a() {
        public final void onFrameCaptured(C20232i iVar) {
        }

        public final void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
        }
    };

    /* renamed from: c */
    C20216a f55546c;

    /* renamed from: d */
    public C20235b f55547d;

    /* renamed from: e */
    public TEFrameSizei f55548e = new TEFrameSizei();

    /* renamed from: f */
    C20201f f55549f;

    /* renamed from: g */
    public boolean f55550g = true;

    /* renamed from: h */
    public int f55551h = 1;

    /* renamed from: com.ss.android.ttvecamera.g.b$a */
    public interface C20216a {
        void onFrameCaptured(C20232i iVar);

        void onNewSurfaceTexture(SurfaceTexture surfaceTexture);
    }

    /* renamed from: a */
    public int mo42806a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        return -1;
    }

    /* renamed from: a */
    public abstract int mo42800a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei);

    /* renamed from: a */
    public abstract Surface mo42801a();

    /* renamed from: b */
    public abstract SurfaceTexture mo42802b();

    /* renamed from: c */
    public abstract int mo42803c();

    /* renamed from: d */
    public abstract void mo42804d();

    /* renamed from: f */
    public Surface[] mo42809f() {
        return null;
    }

    /* renamed from: e */
    public void mo42808e() {
        this.f55546c = this.f55545a;
    }

    /* renamed from: a */
    public static List<TEFrameSizei> m49952a(Size[] sizeArr) {
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo42807a(C20232i iVar) {
        if (this.f55546c != null) {
            this.f55546c.onFrameCaptured(iVar);
        }
    }

    public C20214b(C20218a aVar, C20201f fVar) {
        this.f55547d = aVar.f55561g;
        this.f55546c = aVar.f55557c;
        this.f55548e = aVar.f55556b;
        this.f55549f = fVar;
        this.f55550g = aVar.f55555a;
        this.f55551h = aVar.f55560f;
    }
}
