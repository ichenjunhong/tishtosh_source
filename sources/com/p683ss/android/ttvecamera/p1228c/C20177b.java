package com.p683ss.android.ttvecamera.p1228c;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera.Area;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20145a.C20146a;
import com.p683ss.android.ttvecamera.C20145a.C20147b;
import com.p683ss.android.ttvecamera.C20195e;
import com.p683ss.android.ttvecamera.C20201f.C20202a;
import com.p683ss.android.ttvecamera.C20201f.C20203b;
import com.p683ss.android.ttvecamera.C20201f.C20204c;
import com.p683ss.android.ttvecamera.C20275l;
import com.p683ss.android.ttvecamera.C20275l.C20281f;
import com.p683ss.android.ttvecamera.C20275l.C20284i;
import com.p683ss.android.ttvecamera.C20285m;
import com.p683ss.android.ttvecamera.C20294n;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.TEFocusParameters;
import com.p683ss.android.ttvecamera.TEFrameSizei;
import com.p683ss.android.ttvecamera.p1227b.C20159a;
import com.p683ss.android.ttvecamera.p1227b.C20159a.C20160a;
import com.p683ss.android.ttvecamera.p1229d.C20186c;
import com.p683ss.android.ttvecamera.p1232g.C20217c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.c.b */
public abstract class C20177b implements C20160a, C20176a {

    /* renamed from: A */
    public CaptureCallback f55465A = new CaptureCallback() {
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (C20177b.this.f55480s) {
                C20177b.this.f55480s = C20285m.m50052a((Object) totalCaptureResult);
            }
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            StringBuilder sb = new StringBuilder("failure: ");
            sb.append(captureFailure);
            C20296p.m50063d("TECameraModeBase", sb.toString());
        }

        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    };

    /* renamed from: a */
    private Rect f55466a;

    /* renamed from: b */
    private float f55467b = 1.0f;

    /* renamed from: c */
    private Map<String, Integer> f55468c = new HashMap<String, Integer>() {
        {
            put("auto", Integer.valueOf(1));
            put("incandescent", Integer.valueOf(2));
            put("fluorescent", Integer.valueOf(3));
            put("warm-fluorescent", Integer.valueOf(4));
            put("daylight", Integer.valueOf(5));
            put("cloudy-daylight", Integer.valueOf(6));
            put("twilight", Integer.valueOf(7));
            put("shade", Integer.valueOf(8));
        }
    };

    /* renamed from: d */
    private Runnable f55469d = new Runnable() {
        public final void run() {
            C20177b.this.f55485x.mo42697a();
        }
    };

    /* renamed from: i */
    protected C20202a f55470i;

    /* renamed from: j */
    public C20195e f55471j;

    /* renamed from: k */
    public C20275l f55472k;

    /* renamed from: l */
    public C20186c f55473l;

    /* renamed from: m */
    public Handler f55474m;

    /* renamed from: n */
    public CameraCharacteristics f55475n;

    /* renamed from: o */
    StreamConfigurationMap f55476o;

    /* renamed from: p */
    public CaptureRequest f55477p;

    /* renamed from: q */
    public Builder f55478q;

    /* renamed from: r */
    protected AtomicBoolean f55479r = new AtomicBoolean(false);

    /* renamed from: s */
    public boolean f55480s = true;

    /* renamed from: t */
    protected float f55481t = 0.0f;

    /* renamed from: u */
    protected Rect f55482u = null;

    /* renamed from: v */
    protected C20203b f55483v;

    /* renamed from: w */
    public C20204c f55484w;

    /* renamed from: x */
    protected C20159a f55485x;

    /* renamed from: y */
    public CameraCaptureSession f55486y;

    /* renamed from: z */
    protected StateCallback f55487z = new StateCallback() {
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C20296p.m50061b("TECameraModeBase", "onConfigureFailed...");
            C20177b.this.f55471j.mo42773e(4);
        }

        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C20296p.m50059a("TECameraModeBase", "onConfigured...");
            C20177b.this.f55486y = cameraCaptureSession;
            try {
                int j = C20177b.this.mo42755j();
                if (j != 0) {
                    C20177b.this.f55470i.mo42782a(C20177b.this.f55472k.f55721c, j, "updateCapture : something wrong.");
                }
            } catch (Exception unused) {
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo42676a();

    /* renamed from: a */
    public void mo42681a(int i, int i2, C20281f fVar) {
    }

    /* renamed from: a */
    public void mo42682a(C20281f fVar, int i) {
    }

    /* renamed from: c */
    public abstract int mo42685c() throws Exception;

    /* renamed from: e */
    public void mo42687e() {
        this.f55482u = null;
    }

    /* renamed from: a */
    public Rect mo42749a(float f) {
        if (this.f55475n == null || this.f55478q == null) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -420, "Camera info is null, may be you need reopen camera.");
            return null;
        }
        float floatValue = ((Float) this.f55475n.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.f55475n.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = rect.width() - ((int) (((float) rect.width()) / floatValue));
        int height = rect.height() - ((int) (((float) rect.height()) / floatValue));
        int i = (int) ((((float) width) / floatValue) * f);
        int i2 = (int) ((((float) height) / floatValue) * f);
        int i3 = i - (i & 3);
        int i4 = i2 - (i2 & 3);
        return new Rect(i3, i4, rect.width() - i3, rect.height() - i4);
    }

    /* renamed from: a */
    public final void mo42751a(boolean z, String str) {
        int i;
        if (this.f55478q == null || this.f55486y == null) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -424, "Capture Session is null");
        }
        if (this.f55468c.get(str) == null) {
            i = 1;
        } else {
            i = ((Integer) this.f55468c.get(str)).intValue();
        }
        this.f55478q.set(CaptureRequest.CONTROL_AWB_LOCK, Boolean.valueOf(z));
        this.f55478q.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(i));
        try {
            this.f55486y.setRepeatingRequest(this.f55478q.build(), this.f55465A, null);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("setWhiteBalance exception: ");
            sb.append(e.getMessage());
            C20296p.m50063d("TECameraModeBase", sb.toString());
            StringBuilder sb2 = new StringBuilder("setWhiteBalance exception: ");
            sb2.append(e.getMessage());
            this.f55470i.mo42782a(this.f55472k.f55721c, -424, sb2.toString());
        }
    }

    /* renamed from: d */
    public void mo42686d() {
        if (this.f55486y != null && mo42676a() != null) {
            this.f55486y.close();
            this.f55486y = null;
        }
    }

    /* renamed from: k */
    public final int mo42756k() {
        if (this.f55478q != null) {
            return this.f55485x.mo42697a();
        }
        this.f55470i.mo42782a(this.f55472k.f55721c, -100, "rollbackNormalSessionRequest : param is null.");
        return -100;
    }

    /* renamed from: i */
    public final int mo42754i() {
        TEFrameSizei tEFrameSizei;
        C20217c cVar = this.f55471j.f55526n;
        if (mo42676a() == null || cVar == null) {
            C20296p.m50061b("TECameraModeBase", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f55475n.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (cVar.f55554b.f55550g) {
            cVar.mo42813a(streamConfigurationMap, null);
            this.f55472k.f55728j = cVar.mo42817e();
            if (this.f55472k.f55728j != null) {
                this.f55470i.mo42784b(50, 0, this.f55472k.f55728j.toString());
            }
        } else {
            cVar.mo42813a(streamConfigurationMap, this.f55472k.f55728j);
            C20275l lVar = this.f55472k;
            if (!cVar.f55554b.f55550g) {
                tEFrameSizei = cVar.f55554b.f55548e;
            } else {
                tEFrameSizei = new TEFrameSizei(1080, 1920);
            }
            lVar.f55729k = tEFrameSizei;
        }
        if (cVar.mo42812a() == 1) {
            if (cVar.mo42816d() == null) {
                C20296p.m50063d("TECameraModeBase", "SurfaceTexture is null.");
                return -100;
            }
            cVar.mo42816d().setDefaultBufferSize(this.f55472k.f55728j.f55398a, this.f55472k.f55728j.f55399b);
        } else if (!(cVar.mo42812a() == 2 || cVar.mo42812a() == 8)) {
            StringBuilder sb = new StringBuilder("Unsupported camera provider type : ");
            sb.append(cVar.mo42812a());
            C20296p.m50063d("TECameraModeBase", sb.toString());
            return -200;
        }
        return 0;
    }

    /* renamed from: j */
    public int mo42755j() throws CameraAccessException {
        if (this.f55471j.f55526n == null || this.f55478q == null) {
            return -100;
        }
        this.f55470i.mo42784b(0, 0, "TECamera2 preview");
        if (this.f55473l.mo42772b(this.f55475n)) {
            StringBuilder sb = new StringBuilder("Stabilization Supported, toggle = ");
            sb.append(this.f55472k.f55717B);
            C20296p.m50059a("TECameraModeBase", sb.toString());
            this.f55473l.mo42770a(this.f55475n, this.f55478q, this.f55472k.f55717B);
        }
        this.f55478q.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        if (this.f55472k.f55716A == 2) {
            this.f55478q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(0));
        }
        this.f55478q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f55472k.f55722d.f55772a / this.f55472k.f55722d.f55774c), Integer.valueOf(this.f55472k.f55722d.f55773b / this.f55472k.f55722d.f55774c)));
        this.f55477p = this.f55478q.build();
        this.f55486y.setRepeatingRequest(this.f55477p, this.f55465A, this.f55474m);
        this.f55472k.f55724f = ((Integer) this.f55475n.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f55471j.mo42773e(3);
        mo42757l();
        C20296p.m50059a("TECameraModeBase", "send capture request...");
        return 0;
    }

    /* renamed from: l */
    public final void mo42757l() {
        Bundle bundle;
        if (this.f55471j.f55534v.containsKey(this.f55472k.f55740v)) {
            bundle = (Bundle) this.f55471j.f55534v.get(this.f55472k.f55740v);
        } else {
            bundle = new Bundle();
            this.f55471j.f55534v.put(this.f55472k.f55740v, bundle);
        }
        bundle.putParcelable("camera_preview_size", this.f55472k.f55728j);
        if (this.f55473l != null) {
            bundle.putBoolean("camera_torch_supported", C20186c.m49828a(this.f55475n));
        } else {
            bundle.putBoolean("camera_torch_supported", false);
        }
        if (this.f55475n != null && this.f55477p != null) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.f55394a = (Rect) this.f55475n.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.f55395b = (Rect) this.f55477p.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.f55397d = ((Integer) this.f55475n.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.f55396c = ((Integer) this.f55475n.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            bundle.putParcelable("camera_focus_parameters", tEFocusParameters);
        }
    }

    /* renamed from: a */
    public final void mo42750a(C20203b bVar) {
        this.f55483v = bVar;
    }

    /* renamed from: a */
    public final int mo42748a(boolean z) {
        int i;
        if (this.f55478q == null || this.f55486y == null) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -100, "toggleTorch : Capture Session is null");
            return -100;
        }
        try {
            Builder builder = this.f55478q;
            Key key = CaptureRequest.FLASH_MODE;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            builder.set(key, Integer.valueOf(i));
            this.f55486y.setRepeatingRequest(this.f55478q.build(), this.f55465A, null);
            return 0;
        } catch (Exception e) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -417, e.toString());
            return -417;
        }
    }

    /* renamed from: b */
    public final Rect mo42752b(float f) {
        if (this.f55466a == null) {
            C20296p.m50063d("TECameraModeBase", "ActiveArraySize == null");
            this.f55470i.mo42782a(this.f55472k.f55721c, -420, "ActiveArraySize == null.");
            return null;
        } else if (this.f55467b <= 0.0f || this.f55467b > this.f55481t) {
            C20296p.m50063d("TECameraModeBase", "factor invalid");
            this.f55470i.mo42782a(this.f55472k.f55721c, -420, "factor invalid.");
            return null;
        } else {
            float f2 = 1.0f / this.f55467b;
            int width = (this.f55466a.width() - Math.round(((float) this.f55466a.width()) * f2)) / 2;
            int height = (this.f55466a.height() - Math.round(((float) this.f55466a.height()) * f2)) / 2;
            Rect rect = new Rect(C20285m.m50043a(width, this.f55466a.left, this.f55466a.right), C20285m.m50043a(height, this.f55466a.top, this.f55466a.bottom), C20285m.m50043a(this.f55466a.width() - width, this.f55466a.left, this.f55466a.right), C20285m.m50043a(this.f55466a.height() - height, this.f55466a.top, this.f55466a.bottom));
            if (rect.equals((Rect) this.f55477p.get(CaptureRequest.SCALER_CROP_REGION))) {
                C20296p.m50059a("TECameraModeBase", "same SCALER_CROP_REGION, no need to set");
            }
            return rect;
        }
    }

    /* renamed from: c */
    public void mo42753c(float f) {
        if (this.f55486y == null || this.f55477p == null || this.f55478q == null) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -420, "Camera info is null, may be you need reopen camera.");
        } else if ((this.f55467b < this.f55481t || f <= 1.0f) && (this.f55482u == null || !this.f55482u.equals(this.f55466a) || f > 1.0f)) {
            this.f55467b *= f;
            try {
                Rect b = mo42752b(this.f55467b);
                if (b != null) {
                    this.f55486y.stopRepeating();
                    this.f55478q.set(CaptureRequest.SCALER_CROP_REGION, b);
                    this.f55477p = this.f55478q.build();
                    this.f55486y.setRepeatingRequest(this.f55477p, this.f55465A, this.f55474m);
                    this.f55482u = b;
                    mo42757l();
                }
            } catch (Exception e) {
                this.f55470i.mo42782a(this.f55472k.f55721c, -420, e.toString());
            }
        } else {
            C20296p.m50063d("TECameraModeBase", "zoomV2 factor invalid");
        }
    }

    /* renamed from: a */
    public final int mo42747a(C20294n nVar) {
        boolean z;
        boolean z2;
        Rect rect;
        Rect rect2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C20294n nVar2 = nVar;
        if (this.f55473l == null || this.f55477p == null || this.f55486y == null || this.f55478q == null) {
            C20296p.m50062c("TECameraModeBase", "Env is null");
            return -100;
        } else if (this.f55479r.get()) {
            C20296p.m50062c("TECameraModeBase", "Manual focus already engaged");
            return 0;
        } else {
            CameraCharacteristics cameraCharacteristics = this.f55475n;
            if (cameraCharacteristics != null) {
                if (((Integer) cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() > 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z = z6;
            } else {
                z = false;
            }
            CameraCharacteristics cameraCharacteristics2 = this.f55475n;
            if (cameraCharacteristics2 != null) {
                if (((Integer) cameraCharacteristics2.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z2 = z5;
            } else {
                z2 = false;
            }
            if (z2 || z) {
                this.f55474m.removeCallbacks(this.f55469d);
                if (nVar2.f55770h != null) {
                    C20146a aVar = nVar2.f55770h;
                    int i = nVar2.f55763a;
                    int i2 = nVar2.f55764b;
                    int i3 = nVar2.f55765c;
                    int i4 = nVar2.f55766d;
                    int i5 = this.f55472k.f55724f;
                    if (this.f55472k.f55723e == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    rect = ((Area) aVar.mo42663a(i, i2, i3, i4, i5, z4).get(0)).rect;
                } else {
                    rect = m49800a(nVar2.f55763a, nVar2.f55764b, (float) nVar2.f55765c, (float) nVar2.f55766d, this.f55472k.f55724f, 0);
                }
                Rect rect3 = rect;
                if (nVar2.f55771i != null) {
                    C20147b bVar = nVar2.f55771i;
                    int i6 = nVar2.f55763a;
                    int i7 = nVar2.f55764b;
                    int i8 = nVar2.f55765c;
                    int i9 = nVar2.f55766d;
                    int i10 = this.f55472k.f55724f;
                    if (this.f55472k.f55723e == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    rect2 = ((Area) bVar.mo42664a(i6, i7, i8, i9, i10, z3).get(0)).rect;
                } else {
                    rect2 = m49800a(nVar2.f55763a, nVar2.f55764b, (float) nVar2.f55765c, (float) nVar2.f55766d, this.f55472k.f55724f, 1);
                }
                if (!C20285m.m50051a(rect3) || !C20285m.m50051a(rect2)) {
                    C20296p.m50063d("TECameraModeBase", "focusRect or meteringRect is not valid!");
                    return -100;
                }
                try {
                    this.f55486y.stopRepeating();
                    if (nVar2.f55769g && z) {
                        this.f55485x.mo42701b(this.f55478q, rect2);
                    }
                    if (z2) {
                        if (nVar2.f55768f) {
                            this.f55479r.set(true);
                            this.f55485x.mo42698a(this.f55478q, rect3);
                            this.f55477p = this.f55478q.build();
                            this.f55486y.setRepeatingRequest(this.f55477p, this.f55485x.mo42700a(this.f55478q, this.f55479r), this.f55474m);
                            this.f55474m.postDelayed(this.f55469d, 5000);
                            return 0;
                        }
                    }
                    if (z && nVar2.f55769g) {
                        this.f55477p = this.f55478q.build();
                        this.f55486y.setRepeatingRequest(this.f55477p, this.f55485x.mo42699a(this.f55478q), this.f55474m);
                        this.f55479r.set(false);
                    }
                    return -412;
                } catch (CameraAccessException unused) {
                    this.f55479r.set(false);
                }
            } else {
                C20296p.m50062c("TECameraModeBase", "do not support MeteringAreaAF!");
                return -412;
            }
        }
    }

    /* renamed from: a */
    public int mo42746a(float f, C20284i iVar) {
        Rect a = mo42749a(f);
        if (a == null) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -420, "zoom rect is null.");
            return -420;
        }
        this.f55478q.set(CaptureRequest.SCALER_CROP_REGION, a);
        try {
            this.f55477p = this.f55478q.build();
            this.f55486y.setRepeatingRequest(this.f55477p, this.f55465A, null);
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

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo42679a(java.lang.String r7, int r8) throws android.hardware.camera2.CameraAccessException {
        /*
            r6 = this;
            android.hardware.camera2.CameraCharacteristics r7 = r6.f55475n
            r0 = -401(0xfffffffffffffe6f, float:NaN)
            if (r7 != 0) goto L_0x0007
            return r0
        L_0x0007:
            com.ss.android.ttvecamera.d.c r7 = r6.f55473l
            android.hardware.camera2.CameraCharacteristics r1 = r6.f55475n
            r2 = 0
            if (r1 != 0) goto L_0x0011
        L_0x000e:
            r7 = 0
            goto L_0x0091
        L_0x0011:
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r1 = r1.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 < 0) goto L_0x007c
            r3 = 3
            if (r1 <= r3) goto L_0x0023
            goto L_0x007c
        L_0x0023:
            int[] r3 = com.p683ss.android.ttvecamera.p1229d.C20185b.f55496b
            r3 = r3[r1]
            r7.f55499c = r3
            java.lang.String r3 = "te_record_camera_hardware_level"
            int r4 = r7.f55499c
            long r4 = (long) r4
            com.p683ss.android.ttvecamera.C20239j.m50016a(r3, r4)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 22
            if (r3 >= r4) goto L_0x003b
            r3 = 2
            if (r1 != r3) goto L_0x003b
            goto L_0x000e
        L_0x003b:
            int r1 = r7.f55499c
            if (r1 < r8) goto L_0x005e
            java.lang.String r1 = "TECameraHardware2Proxy"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Camera hardware level supported, deviceLevel = "
            r3.<init>(r4)
            int r7 = r7.f55499c
            r3.append(r7)
            java.lang.String r7 = ", require = "
            r3.append(r7)
            r3.append(r8)
            java.lang.String r7 = r3.toString()
            com.p683ss.android.ttvecamera.C20296p.m50059a(r1, r7)
            r7 = 1
            goto L_0x0091
        L_0x005e:
            java.lang.String r1 = "TECameraHardware2Proxy"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Camera hardware level not supported, deviceLevel = "
            r3.<init>(r4)
            int r7 = r7.f55499c
            r3.append(r7)
            java.lang.String r7 = ", require = "
            r3.append(r7)
            r3.append(r8)
            java.lang.String r7 = r3.toString()
            com.p683ss.android.ttvecamera.C20296p.m50063d(r1, r7)
            goto L_0x000e
        L_0x007c:
            java.lang.String r7 = "TECameraHardware2Proxy"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid hardware level = "
            r8.<init>(r3)
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.p683ss.android.ttvecamera.C20296p.m50063d(r7, r8)
            goto L_0x000e
        L_0x0091:
            if (r7 != 0) goto L_0x0094
            return r0
        L_0x0094:
            com.ss.android.ttvecamera.l r7 = r6.f55472k
            android.hardware.camera2.CameraCharacteristics r8 = r6.f55475n
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r8 = r8.get(r1)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r7.f55724f = r8
            android.hardware.camera2.CameraCharacteristics r7 = r6.f55475n
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r7 = r7.get(r8)
            android.hardware.camera2.params.StreamConfigurationMap r7 = (android.hardware.camera2.params.StreamConfigurationMap) r7
            r6.f55476o = r7
            android.hardware.camera2.params.StreamConfigurationMap r7 = r6.f55476o
            if (r7 != 0) goto L_0x00b7
            return r0
        L_0x00b7:
            android.hardware.camera2.CameraCharacteristics r7 = r6.f55475n
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM
            java.lang.Object r7 = r7.get(r8)
            java.lang.Float r7 = (java.lang.Float) r7
            if (r7 == 0) goto L_0x00c9
            float r7 = r7.floatValue()
            r6.f55481t = r7
        L_0x00c9:
            r7 = 1065353216(0x3f800000, float:1.0)
            r6.f55467b = r7
            android.hardware.camera2.CameraCharacteristics r7 = r6.f55475n
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE
            java.lang.Object r7 = r7.get(r8)
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            r6.f55466a = r7
            com.ss.android.ttvecamera.l r7 = r6.f55472k
            android.hardware.camera2.CameraCharacteristics r8 = r6.f55475n
            com.ss.android.ttvecamera.l r0 = r6.f55472k
            com.ss.android.ttvecamera.o r0 = r0.f55722d
            int r0 = r0.f55772a
            com.ss.android.ttvecamera.l r1 = r6.f55472k
            com.ss.android.ttvecamera.o r1 = r1.f55722d
            int r1 = r1.f55773b
            com.ss.android.ttvecamera.l r3 = r6.f55472k
            int r3 = r3.f55716A
            com.ss.android.ttvecamera.o r8 = com.p683ss.android.ttvecamera.p1229d.C20186c.m49826a(r8, r0, r1, r3)
            r7.f55722d = r8
            java.lang.String r7 = "TECameraModeBase"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Set Fps Range: "
            r8.<init>(r0)
            com.ss.android.ttvecamera.l r0 = r6.f55472k
            com.ss.android.ttvecamera.o r0 = r0.f55722d
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            com.p683ss.android.ttvecamera.C20296p.m50061b(r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.p1228c.C20177b.mo42679a(java.lang.String, int):int");
    }

    public C20177b(C20195e eVar, Context context, Handler handler) {
        this.f55471j = eVar;
        this.f55472k = this.f55471j.f55520h;
        this.f55473l = C20186c.m49825a(context, this.f55472k.f55721c);
        this.f55470i = this.f55471j.f55522j;
        this.f55474m = handler;
    }

    /* renamed from: a */
    private Rect m49800a(int i, int i2, float f, float f2, int i3, int i4) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Rect rect = (Rect) this.f55475n.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        sb.append(rect.left);
        sb.append(", ");
        sb.append(rect.top);
        sb.append(", ");
        sb.append(rect.right);
        sb.append(", ");
        sb.append(rect.bottom);
        sb.append("]");
        C20296p.m50061b("TECameraModeBase", sb.toString());
        Size size = (Size) this.f55475n.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb2 = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb2.append(size.getWidth());
        sb2.append(", ");
        sb2.append(size.getHeight());
        sb2.append("]");
        C20296p.m50059a("onAreaTouchEvent", sb2.toString());
        int i8 = this.f55472k.f55728j.f55398a;
        int i9 = this.f55472k.f55728j.f55399b;
        if (90 == this.f55472k.f55724f || 270 == this.f55472k.f55724f) {
            i8 = this.f55472k.f55728j.f55399b;
            i9 = this.f55472k.f55728j.f55398a;
        }
        float f8 = 0.0f;
        if (i9 * i5 >= i8 * i6) {
            float f9 = (((float) i5) * 1.0f) / ((float) i8);
            f4 = f9;
            f3 = ((((float) i9) * f9) - ((float) i6)) / 2.0f;
            f5 = 0.0f;
        } else {
            float f10 = (((float) i6) * 1.0f) / ((float) i9);
            float f11 = ((((float) i8) * f10) - ((float) i5)) / 2.0f;
            f4 = f10;
            f3 = 0.0f;
            f5 = f11;
        }
        float f12 = (f + f5) / f4;
        float f13 = (f2 + f3) / f4;
        if (90 == i7) {
            f12 = ((float) this.f55472k.f55728j.f55399b) - f12;
        } else if (270 == i7) {
            f13 = ((float) this.f55472k.f55728j.f55398a) - f13;
        } else {
            float f14 = f13;
            f13 = f12;
            f12 = f14;
        }
        Rect rect2 = (Rect) this.f55477p.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            C20296p.m50062c("TECameraModeBase", "can't get crop region");
            rect2 = rect;
        }
        int width = rect2.width();
        int height = rect2.height();
        if (this.f55472k.f55728j.f55399b * width > this.f55472k.f55728j.f55398a * height) {
            float f15 = (((float) height) * 1.0f) / ((float) this.f55472k.f55728j.f55399b);
            f8 = (((float) width) - (((float) this.f55472k.f55728j.f55398a) * f15)) / 2.0f;
            f7 = f15;
            f6 = 0.0f;
        } else {
            f7 = (((float) width) * 1.0f) / ((float) this.f55472k.f55728j.f55398a);
            f6 = (((float) height) - (((float) this.f55472k.f55728j.f55399b) * f7)) / 2.0f;
        }
        float f16 = (f13 * f7) + f8 + ((float) rect2.left);
        float f17 = (f12 * f7) + f6 + ((float) rect2.top);
        if (this.f55472k.f55723e == 1) {
            f17 = ((float) rect2.height()) - f17;
        }
        Rect rect3 = new Rect();
        if (i4 == 0) {
            double d = (double) f16;
            double width2 = (double) rect2.width();
            Double.isNaN(width2);
            double d2 = width2 * 0.05d;
            Double.isNaN(d);
            rect3.left = C20285m.m50043a((int) (d - d2), 0, rect2.width());
            double width3 = (double) rect2.width();
            Double.isNaN(width3);
            double d3 = width3 * 0.05d;
            Double.isNaN(d);
            rect3.right = C20285m.m50043a((int) (d + d3), 0, rect2.width());
            double d4 = (double) f17;
            double height2 = (double) rect2.height();
            Double.isNaN(height2);
            double d5 = height2 * 0.05d;
            Double.isNaN(d4);
            rect3.top = C20285m.m50043a((int) (d4 - d5), 0, rect2.height());
            double height3 = (double) rect2.height();
            Double.isNaN(height3);
            double d6 = height3 * 0.05d;
            Double.isNaN(d4);
            rect3.bottom = C20285m.m50043a((int) (d4 + d6), 0, rect2.height());
        } else {
            double d7 = (double) f16;
            double width4 = (double) rect2.width();
            Double.isNaN(width4);
            double d8 = width4 * 0.1d;
            Double.isNaN(d7);
            rect3.left = C20285m.m50043a((int) (d7 - d8), 0, rect2.width());
            double width5 = (double) rect2.width();
            Double.isNaN(width5);
            double d9 = width5 * 0.1d;
            Double.isNaN(d7);
            rect3.right = C20285m.m50043a((int) (d7 + d9), 0, rect2.width());
            double d10 = (double) f17;
            double height4 = (double) rect2.height();
            Double.isNaN(height4);
            double d11 = height4 * 0.1d;
            Double.isNaN(d10);
            rect3.top = C20285m.m50043a((int) (d10 - d11), 0, rect2.height());
            double height5 = (double) rect2.height();
            Double.isNaN(height5);
            double d12 = height5 * 0.1d;
            Double.isNaN(d10);
            rect3.bottom = C20285m.m50043a((int) (d10 + d12), 0, rect2.height());
        }
        if (rect3.left < 0 || rect3.left > rect2.right) {
            rect3.left = rect2.left;
        }
        if (rect3.top < 0 || rect3.top > rect2.bottom) {
            rect3.top = rect2.top;
        }
        if (rect3.right < 0 || rect3.right > rect2.right) {
            rect3.right = rect2.right;
        }
        if (rect3.bottom < 0 || rect3.bottom > rect2.bottom) {
            rect3.bottom = rect2.bottom;
        }
        StringBuilder sb3 = new StringBuilder("Focus Rect: [left, top, right, bottom] = [");
        sb3.append(rect3.left);
        sb3.append(", ");
        sb3.append(rect3.top);
        sb3.append(", ");
        sb3.append(rect3.right);
        sb3.append(", ");
        sb3.append(rect3.bottom);
        sb3.append("]");
        C20296p.m50059a("TECameraModeBase", sb3.toString());
        return rect3;
    }
}
