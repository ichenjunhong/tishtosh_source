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

/* renamed from: com.ss.android.ttvecamera.g.d */
public final class C20219d extends C20214b {

    /* renamed from: a */
    ImageReader f55562a;

    /* renamed from: b */
    public final SurfaceTexture mo42802b() {
        return null;
    }

    /* renamed from: c */
    public final int mo42803c() {
        return 2;
    }

    /* renamed from: d */
    public final void mo42804d() {
    }

    /* renamed from: a */
    public final Surface mo42801a() {
        if (this.f55562a != null) {
            return this.f55562a.getSurface();
        }
        return null;
    }

    /* renamed from: e */
    public final void mo42808e() {
        super.mo42808e();
        if (this.f55562a != null) {
            this.f55562a.close();
            this.f55562a = null;
        }
    }

    public C20219d(C20218a aVar, C20201f fVar) {
        super(aVar, fVar);
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
        if (this.f55562a != null) {
            this.f55562a.close();
        }
        this.f55562a = ImageReader.newInstance(this.f55548e.f55398a, this.f55548e.f55399b, C20232i.m50010a(this.f55547d), 1);
        this.f55562a.setOnImageAvailableListener(new OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                if (acquireLatestImage != null) {
                    try {
                        C20232i iVar = new C20232i(acquireLatestImage.getWidth(), acquireLatestImage.getHeight(), System.currentTimeMillis() * 1000);
                        iVar.mo42837a(new C20298q(acquireLatestImage.getPlanes()), C20219d.this.f55549f.mo42779r(), C20219d.this.f55547d, C20219d.this.f55549f.f55527o);
                        C20219d.this.mo42807a(iVar);
                    } catch (Exception unused) {
                    } finally {
                        acquireLatestImage.close();
                    }
                }
            }
        }, this.f55549f.f55523k);
        return 0;
    }
}
