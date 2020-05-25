package com.p683ss.android.ttvecamera.p1233h;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20195e;
import com.p683ss.android.ttvecamera.C20239j;
import com.p683ss.android.ttvecamera.C20275l.C20284i;
import com.p683ss.android.ttvecamera.C20285m;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ttvecamera.p1226a.C20157d;
import com.p683ss.android.ttvecamera.p1229d.C20186c;
import com.p683ss.android.ttvecamera.p1229d.C20194i;
import com.p683ss.android.ttvecamera.p1232g.C20217c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.h.c */
public final class C20230c extends C20157d {

    /* renamed from: B */
    private Surface f55582B;

    /* renamed from: C */
    private CaptureCallback f55583C = new CaptureCallback() {
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            StringBuilder sb = new StringBuilder("failure: ");
            sb.append(captureFailure);
            C20296p.m50063d("TEVivoVideoMode", sb.toString());
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (C20230c.this.f55472k.f55723e != 1) {
                int a = C20194i.m49843a(totalCaptureResult, C20230c.this.f55472k.f55723e);
                if (!(a == C20230c.this.f55584c && C20230c.this.f55585d == C20230c.this.f55586e)) {
                    C20230c.this.f55586e = C20230c.this.f55585d;
                    C20230c.this.f55584c = a;
                    if (C20230c.this.f55484w != null) {
                        C20230c.this.f55484w.mo42786a(a, C20230c.this.f55585d);
                        StringBuilder sb = new StringBuilder("SAT onChange ");
                        sb.append(a);
                        sb.append("----");
                        sb.append(C20230c.this.f55585d);
                        C20296p.m50059a("TEVivoVideoMode", sb.toString());
                    }
                }
            }
            if (C20230c.this.f55480s) {
                C20230c.this.f55480s = C20285m.m50052a((Object) totalCaptureResult);
            }
        }

        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    };

    /* renamed from: c */
    public int f55584c = -1;

    /* renamed from: d */
    public float f55585d;

    /* renamed from: e */
    public float f55586e = -1.0f;

    /* renamed from: f */
    private MediaCodec f55587f;

    /* renamed from: g */
    private ImageReader f55588g;

    /* renamed from: h */
    private Surface f55589h;

    /* renamed from: d */
    public final void mo42686d() {
        if (this.f55587f != null) {
            this.f55587f.release();
            this.f55589h.release();
            this.f55587f = null;
            this.f55589h = null;
        }
        if (this.f55588g != null) {
            this.f55588g.close();
            this.f55582B.release();
            this.f55588g = null;
            this.f55582B = null;
        }
        super.mo42686d();
    }

    /* renamed from: c */
    public final int mo42685c() throws Exception {
        C20217c cVar = this.f55471j.f55526n;
        if (this.f55407b == null || cVar == null) {
            C20296p.m50061b("TEVivoVideoMode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int i = super.mo42754i();
        if (i != 0) {
            return i;
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
        if (this.f55472k.f55723e == 0) {
            if (this.f55589h == null || this.f55582B == null) {
                try {
                    this.f55587f = MediaCodec.createEncoderByType("video/avc");
                    TEFrameSizei tEFrameSizei = this.f55472k.f55728j;
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", tEFrameSizei.f55398a, tEFrameSizei.f55399b);
                    createVideoFormat.setInteger("color-format", 2130708361);
                    createVideoFormat.setInteger("bitrate", 6000000);
                    createVideoFormat.setInteger("frame-rate", 30);
                    createVideoFormat.setInteger("i-frame-interval", 1);
                    this.f55587f.configure(createVideoFormat, null, null, 1);
                    this.f55589h = this.f55587f.createInputSurface();
                    this.f55588g = ImageReader.newInstance(tEFrameSizei.f55398a, tEFrameSizei.f55399b, UnReadVideoExperiment.BROWSE_RECORD_LIST, 1);
                    this.f55582B = this.f55588g.getSurface();
                } catch (Exception unused) {
                    C20296p.m50063d("TEVivoVideoMode", "create mediaCodec fail");
                    this.f55589h = null;
                    this.f55582B = null;
                }
            }
            if (this.f55589h != null) {
                arrayList.add(this.f55589h);
                if (this.f55582B != null) {
                    arrayList.add(this.f55582B);
                } else {
                    C20296p.m50063d("TEVivoVideoMode", "startPreview: mImageReaderSurface is null");
                    return -1;
                }
            } else {
                C20296p.m50063d("TEVivoVideoMode", "startPreview: mMediaCodecSurface is null");
                return -1;
            }
        }
        this.f55407b.createCaptureSession(arrayList, this.f55487z, this.f55474m);
        return 0;
    }

    /* renamed from: j */
    public final int mo42755j() throws CameraAccessException {
        if (this.f55471j.f55526n == null || this.f55478q == null) {
            return -100;
        }
        this.f55470i.mo42784b(0, 0, "TECamera2 preview");
        if (this.f55473l.mo42772b(this.f55475n)) {
            StringBuilder sb = new StringBuilder("Stabilization Supported, toggle = ");
            sb.append(this.f55472k.f55717B);
            C20296p.m50059a("TEVivoVideoMode", sb.toString());
            this.f55473l.mo42770a(this.f55475n, this.f55478q, this.f55472k.f55717B);
        }
        this.f55478q.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        if (C20186c.m49829c(this.f55475n)) {
            this.f55478q.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
        }
        this.f55478q.set(CaptureRequest.SCALER_CROP_REGION, mo42749a(1.0f));
        this.f55478q.set(C20194i.f55505e, Float.valueOf(1.0f));
        this.f55477p = this.f55478q.build();
        this.f55486y.setRepeatingRequest(this.f55477p, this.f55583C, this.f55474m);
        this.f55472k.f55724f = ((Integer) this.f55475n.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f55471j.mo42773e(3);
        mo42757l();
        C20296p.m50059a("TEVivoVideoMode", "send capture request...");
        return 0;
    }

    /* renamed from: c */
    public final void mo42753c(float f) {
        if (this.f55486y == null || this.f55477p == null || this.f55478q == null) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -420, "Camera info is null, may be you need reopen camera.");
            return;
        }
        try {
            Rect b = mo42752b(f);
            if (b != null) {
                this.f55486y.stopRepeating();
                this.f55478q.set(CaptureRequest.SCALER_CROP_REGION, b);
                this.f55478q.set(C20194i.f55505e, Float.valueOf(f));
                this.f55477p = this.f55478q.build();
                this.f55486y.setRepeatingRequest(this.f55477p, this.f55583C, this.f55474m);
                this.f55482u = b;
                mo42757l();
            }
        } catch (Exception e) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -420, e.toString());
        }
    }

    /* renamed from: a */
    public final Rect mo42749a(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f > this.f55481t) {
            f = this.f55481t;
        }
        Rect rect = (Rect) this.f55475n.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        int width2 = (int) ((((float) rect.width()) * 0.5f) / f);
        int height2 = (int) ((((float) rect.height()) * 0.5f) / f);
        Rect rect2 = new Rect(width - width2, height - height2, width + width2, height + height2);
        StringBuilder sb = new StringBuilder("calculateZoomSize:crop  ");
        sb.append(rect2.left);
        sb.append("----");
        sb.append(rect2.top);
        sb.append("----");
        sb.append(rect2.right);
        sb.append("----");
        sb.append(rect2.bottom);
        C20296p.m50061b("TEVivoVideoMode", sb.toString());
        StringBuilder sb2 = new StringBuilder("calculateZoomSize:crop  ");
        sb2.append(rect2.width());
        sb2.append("----");
        sb2.append(rect2.height());
        C20296p.m50061b("TEVivoVideoMode", sb2.toString());
        return rect2;
    }

    /* renamed from: a */
    public final String mo42677a(int i) throws CameraAccessException {
        String str;
        String[] cameraIdList = this.f55406a.getCameraIdList();
        C20239j.m50016a("te_record_camera_size", (long) cameraIdList.length);
        this.f55472k.f55723e = i;
        int length = cameraIdList.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str = null;
                break;
            }
            str = cameraIdList[i2];
            CameraCharacteristics cameraCharacteristics = this.f55406a.getCameraCharacteristics(str);
            int a = C20194i.m49844a(new String((byte[]) cameraCharacteristics.get(C20194i.f55504d)).trim(), ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue());
            if (a != -1 && a == i) {
                break;
            }
            i2++;
        }
        if (str == null) {
            str = "0";
            this.f55472k.f55723e = 0;
        }
        this.f55472k.f55740v = str;
        StringBuilder sb = new StringBuilder("selectCamera mCameraSettings.mFacing: ");
        sb.append(this.f55472k.f55723e);
        C20296p.m50059a("TEVivoVideoMode", sb.toString());
        StringBuilder sb2 = new StringBuilder("selectCamera cameraTag: ");
        sb2.append(str);
        C20296p.m50059a("TEVivoVideoMode", sb2.toString());
        this.f55475n = this.f55406a.getCameraCharacteristics(str);
        return str;
    }

    /* renamed from: a */
    public final int mo42746a(float f, C20284i iVar) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f > this.f55481t) {
            f = this.f55481t;
        }
        Rect a = mo42749a(f);
        this.f55585d = f;
        this.f55478q.set(CaptureRequest.SCALER_CROP_REGION, a);
        this.f55478q.set(C20194i.f55505e, Float.valueOf(f));
        try {
            this.f55477p = this.f55478q.build();
            this.f55486y.setRepeatingRequest(this.f55477p, this.f55583C, null);
            if (iVar != null) {
                iVar.mo42921a(this.f55472k.f55721c, f, true);
            }
            mo42757l();
            return 0;
        } catch (CameraAccessException e) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -420, e.toString());
            return -420;
        }
    }

    public C20230c(C20195e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
    }
}
