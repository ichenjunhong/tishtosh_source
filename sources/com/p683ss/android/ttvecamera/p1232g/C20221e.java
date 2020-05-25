package com.p683ss.android.ttvecamera.p1232g;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20201f;
import com.p683ss.android.ttvecamera.C20232i;
import com.p683ss.android.ttvecamera.C20232i.C20235b;
import com.p683ss.android.ttvecamera.C20285m;
import com.p683ss.android.ttvecamera.C20298q;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ttvecamera.p1232g.C20217c.C20218a;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g.e */
public final class C20221e extends C20214b {

    /* renamed from: a */
    SurfaceTexture f55564a;

    /* renamed from: b */
    float[] f55565b = new float[16];

    /* renamed from: i */
    int f55566i;

    /* renamed from: j */
    ImageReader[] f55567j;

    /* renamed from: k */
    Surface[] f55568k;

    /* renamed from: b */
    public final SurfaceTexture mo42802b() {
        return this.f55564a;
    }

    /* renamed from: c */
    public final int mo42803c() {
        return 8;
    }

    /* renamed from: d */
    public final void mo42804d() {
    }

    /* renamed from: f */
    public final Surface[] mo42809f() {
        return this.f55568k;
    }

    /* renamed from: a */
    public final Surface mo42801a() {
        if (this.f55568k != null) {
            return this.f55568k[0];
        }
        return null;
    }

    /* renamed from: e */
    public final void mo42808e() {
        super.mo42808e();
        if (this.f55567j != null) {
            for (ImageReader close : this.f55567j) {
                close.close();
            }
            this.f55567j = null;
        }
        if (this.f55564a != null && this.f55568k != null && this.f55568k[0] != null) {
            this.f55568k[0].release();
        }
    }

    public C20221e(C20218a aVar, C20201f fVar) {
        int i;
        super(aVar, fVar);
        this.f55564a = aVar.f55558d;
        this.f55566i = aVar.f55559e;
        this.f55567j = new ImageReader[this.f55551h];
        if (this.f55564a != null) {
            i = this.f55551h + 1;
        } else {
            i = this.f55551h;
        }
        this.f55568k = new Surface[i];
        if (this.f55564a != null) {
            this.f55568k[0] = new Surface(this.f55564a);
        }
    }

    /* renamed from: a */
    public final int mo42806a(StreamConfigurationMap streamConfigurationMap, TEFrameSizei tEFrameSizei) {
        int[] outputFormats = streamConfigurationMap.getOutputFormats();
        int a = C20232i.m50010a(this.f55547d);
        int length = outputFormats.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = outputFormats[i2];
            if (i3 == a) {
                i = i3;
                break;
            }
            i2++;
        }
        if (i == 0) {
            i = 35;
            this.f55547d = C20235b.PIXEL_FORMAT_YUV420;
        }
        return mo42800a(m49952a(streamConfigurationMap.getOutputSizes(i)), tEFrameSizei);
    }

    /* renamed from: a */
    public final int mo42800a(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        if (list != null && list.size() > 0) {
            this.f55548e = C20285m.m50046a(list, this.f55548e);
        }
        if (this.f55564a != null) {
            this.f55564a.setDefaultBufferSize(this.f55548e.f55398a, this.f55548e.f55399b);
        }
        for (int i = 0; i < this.f55551h; i++) {
            this.f55567j[i] = ImageReader.newInstance(this.f55548e.f55398a, this.f55548e.f55399b, C20232i.m50010a(this.f55547d), 1);
            this.f55567j[i].setOnImageAvailableListener(new OnImageAvailableListener() {
                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        C20232i iVar = new C20232i(acquireNextImage.getWidth(), acquireNextImage.getHeight(), System.currentTimeMillis() * 1000);
                        iVar.mo42837a(new C20298q(acquireNextImage.getPlanes()), C20221e.this.f55549f.mo42779r(), C20221e.this.f55547d, C20221e.this.f55549f.f55527o);
                        C20221e.this.mo42807a(iVar);
                        acquireNextImage.close();
                    }
                }
            }, this.f55549f.f55523k);
            if (this.f55564a != null) {
                this.f55568k[i + 1] = this.f55567j[i].getSurface();
            } else {
                this.f55568k[i] = this.f55567j[i].getSurface();
            }
        }
        return 0;
    }
}
