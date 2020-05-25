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
import com.p683ss.android.ttvecamera.p1226a.C20151c;
import com.p683ss.android.ttvecamera.p1229d.C20186c;
import com.p683ss.android.ttvecamera.p1229d.C20194i;
import com.p683ss.android.ttvecamera.p1232g.C20217c;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.h.b */
public final class C20228b extends C20151c {

    /* renamed from: B */
    public int f55576B = -1;

    /* renamed from: C */
    public float f55577C;

    /* renamed from: D */
    private Surface f55578D;

    /* renamed from: E */
    private MediaCodec f55579E;

    /* renamed from: F */
    private CaptureCallback f55580F = new CaptureCallback() {
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
            C20296p.m50063d("TEImage2Mode", sb.toString());
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (C20228b.this.f55472k.f55723e != 1) {
                int a = C20194i.m49843a(totalCaptureResult, C20228b.this.f55472k.f55723e);
                if (a != C20228b.this.f55576B) {
                    C20228b.this.f55576B = a;
                    if (C20228b.this.f55484w != null) {
                        C20228b.this.f55484w.mo42786a(a, C20228b.this.f55577C);
                    }
                }
            }
            if (C20228b.this.f55480s) {
                C20228b.this.f55480s = C20285m.m50052a((Object) totalCaptureResult);
            }
        }

        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    };

    /* renamed from: d */
    public final void mo42686d() {
        if (this.f55579E != null) {
            this.f55579E.release();
            this.f55578D.release();
            this.f55579E = null;
            this.f55578D = null;
        }
        super.mo42686d();
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
            C20296p.m50059a("TEImage2Mode", sb.toString());
            this.f55473l.mo42770a(this.f55475n, this.f55478q, this.f55472k.f55717B);
        }
        this.f55478q.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        if (C20186c.m49829c(this.f55475n)) {
            this.f55478q.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
        }
        this.f55478q.set(CaptureRequest.SCALER_CROP_REGION, mo42749a(1.0f));
        this.f55478q.set(C20194i.f55505e, Float.valueOf(1.0f));
        this.f55477p = this.f55478q.build();
        this.f55486y.setRepeatingRequest(this.f55477p, this.f55580F, this.f55474m);
        this.f55472k.f55724f = ((Integer) this.f55475n.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f55471j.mo42773e(3);
        mo42757l();
        C20296p.m50059a("TEImage2Mode", "send capture request...");
        return 0;
    }

    /* renamed from: c */
    public final int mo42685c() throws Exception {
        mo42686d();
        C20217c cVar = this.f55471j.f55526n;
        if (this.f55407b == null || cVar == null) {
            C20296p.m50061b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int i = super.mo42754i();
        if (i != 0) {
            return i;
        }
        mo42680a(this.f55472k.f55729k.f55398a, this.f55472k.f55729k.f55399b);
        this.f55478q = this.f55407b.createCaptureRequest(1);
        if (this.f55482u != null) {
            this.f55478q.set(CaptureRequest.SCALER_CROP_REGION, this.f55482u);
        }
        ArrayList<Surface> arrayList = new ArrayList<>();
        if (cVar.f55554b.mo42803c() == 8) {
            arrayList.addAll(Arrays.asList(cVar.mo42815c()));
        } else {
            arrayList.add(cVar.mo42814b());
        }
        for (Surface addTarget : arrayList) {
            this.f55478q.addTarget(addTarget);
        }
        this.f55478q.addTarget(this.f55413d.getSurface());
        if (this.f55472k.f55723e == 0) {
            if (this.f55578D == null) {
                try {
                    this.f55579E = MediaCodec.createEncoderByType("video/avc");
                    TEFrameSizei tEFrameSizei = this.f55472k.f55728j;
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", tEFrameSizei.f55398a, tEFrameSizei.f55399b);
                    createVideoFormat.setInteger("bitrate", 6000000);
                    createVideoFormat.setInteger("frame-rate", 30);
                    createVideoFormat.setInteger("i-frame-interval", 1);
                    this.f55579E.configure(createVideoFormat, null, null, 1);
                    this.f55578D = this.f55579E.createInputSurface();
                } catch (Exception unused) {
                    C20296p.m50063d("TEImage2Mode", "create mediaCodec fail");
                    this.f55578D = null;
                }
            }
            if (this.f55578D != null) {
                arrayList.add(this.f55578D);
            } else {
                C20296p.m50063d("TEImage2Mode", "startPreview: mMediaCodecSurface is null");
                return -1;
            }
        }
        arrayList.add(this.f55413d.getSurface());
        this.f55478q.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        this.f55407b.createCaptureSession(arrayList, this.f55487z, this.f55474m);
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
                this.f55486y.setRepeatingRequest(this.f55477p, this.f55580F, this.f55474m);
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
        C20296p.m50061b("TEImage2Mode", sb.toString());
        StringBuilder sb2 = new StringBuilder("calculateZoomSize:crop  ");
        sb2.append(rect2.width());
        sb2.append("----");
        sb2.append(rect2.height());
        C20296p.m50061b("TEImage2Mode", sb2.toString());
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
            if (C20194i.m49844a(new String((byte[]) cameraCharacteristics.get(C20194i.f55504d)).trim(), ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue()) == i) {
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
        C20296p.m50059a("TEImage2Mode", sb.toString());
        StringBuilder sb2 = new StringBuilder("selectCamera cameraTag: ");
        sb2.append(str);
        C20296p.m50059a("TEImage2Mode", sb2.toString());
        this.f55475n = this.f55406a.getCameraCharacteristics(str);
        return str;
    }

    /* renamed from: a */
    public final int mo42746a(float f, C20284i iVar) {
        if (f > this.f55481t) {
            f = this.f55481t;
        }
        if (f < 1.0f) {
            f = 1.0f;
        }
        Rect a = mo42749a(f);
        this.f55577C = f;
        this.f55478q.set(CaptureRequest.SCALER_CROP_REGION, a);
        this.f55478q.set(C20194i.f55505e, Float.valueOf(f));
        try {
            this.f55477p = this.f55478q.build();
            this.f55486y.setRepeatingRequest(this.f55477p, this.f55580F, null);
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

    public C20228b(C20195e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
    }
}
