package com.p683ss.android.ttvecamera.p1230e;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Handler;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20195e;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.p1226a.C20157d;
import com.p683ss.android.ttvecamera.p1232g.C20217c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p904e.p905a.C13456a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.e.c */
public class C20199c extends C20157d {

    /* renamed from: c */
    private static final String f55514c = "c";

    /* renamed from: d */
    private MediaRecorder f55515d;

    /* renamed from: e */
    private ImageReader f55516e;

    /* renamed from: f */
    private Surface f55517f;

    /* renamed from: d */
    public final void mo42686d() {
        if (!(this.f55486y == null || this.f55478q == null)) {
            C13456a.m27124a(this.f55486y, this.f55478q);
        }
        super.mo42686d();
        if (this.f55516e != null) {
            this.f55516e.close();
            this.f55516e = null;
        }
        if (this.f55515d != null) {
            this.f55515d.release();
            this.f55515d = null;
        }
        if (this.f55517f != null) {
            this.f55517f.release();
            this.f55517f = null;
        }
    }

    /* renamed from: c */
    public final int mo42685c() throws Exception {
        int i;
        C20217c cVar = this.f55471j.f55526n;
        if (this.f55407b == null || cVar == null) {
            C20296p.m50061b(f55514c, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int i2 = super.mo42754i();
        if (i2 != 0) {
            return i2;
        }
        this.f55478q = this.f55407b.createCaptureRequest(3);
        ArrayList<Surface> arrayList = new ArrayList<>();
        if (cVar.f55554b.mo42803c() == 8) {
            arrayList.addAll(Arrays.asList(cVar.mo42815c()));
        } else {
            arrayList.add(cVar.mo42814b());
        }
        for (Surface addTarget : arrayList) {
            this.f55478q.addTarget(addTarget);
        }
        if (this.f55472k.f55717B) {
            i = 32772;
            try {
                this.f55517f = MediaCodec.createPersistentInputSurface();
                this.f55515d = new MediaRecorder();
                this.f55515d.setAudioSource(1);
                this.f55515d.setVideoSource(2);
                this.f55515d.setOutputFormat(2);
                this.f55515d.setOutputFile("/storage/emulated/0/xiaomi_camera.mp4");
                this.f55515d.setVideoEncodingBitRate(10000000);
                this.f55515d.setVideoFrameRate(30);
                this.f55515d.setVideoSize(this.f55472k.f55728j.f55398a, this.f55472k.f55728j.f55399b);
                this.f55515d.setVideoEncoder(2);
                this.f55515d.setAudioEncoder(3);
                this.f55515d.setInputSurface(this.f55517f);
                this.f55515d.setOrientationHint(0);
                this.f55515d.prepare();
            } catch (IOException unused) {
            }
            arrayList.add(this.f55517f);
            if (this.f55516e != null) {
                this.f55516e.close();
            }
            C202001 r2 = new OnImageAvailableListener() {
                public final void onImageAvailable(ImageReader imageReader) {
                }
            };
            this.f55516e = ImageReader.newInstance(this.f55472k.f55728j.f55398a, this.f55472k.f55728j.f55399b, UnReadVideoExperiment.BROWSE_RECORD_LIST, 2);
            this.f55516e.setOnImageAvailableListener(r2, this.f55474m);
            arrayList.add(this.f55516e.getSurface());
        } else {
            i = 0;
        }
        C13456a.m27125a(arrayList, this.f55487z, this.f55474m, this.f55407b, i);
        return 0;
    }

    public C20199c(C20195e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
    }
}
