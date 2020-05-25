package com.p683ss.android.medialib.camera;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.C2240a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.medialib.camera.C19268f.C19270b;
import com.p683ss.android.medialib.camera.C19268f.C19271c;
import com.p683ss.android.medialib.camera.C19268f.C19272d;
import com.p683ss.android.medialib.camera.C19268f.C19273e;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.vesdk.C50792y;
import com.p904e.p905a.C13456a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.camera.h */
public final class C19280h implements C19268f {

    /* renamed from: A */
    private Handler f53222A = new Handler(Looper.getMainLooper());

    /* renamed from: B */
    private int f53223B;

    /* renamed from: C */
    private int f53224C;

    /* renamed from: D */
    private int f53225D;

    /* renamed from: E */
    private int f53226E;

    /* renamed from: F */
    private Size[] f53227F;

    /* renamed from: G */
    private int f53228G = -1;

    /* renamed from: H */
    private Surface f53229H;

    /* renamed from: I */
    private C19273e f53230I;

    /* renamed from: J */
    private C19272d f53231J;

    /* renamed from: K */
    private int f53232K = 1;

    /* renamed from: L */
    private boolean f53233L;

    /* renamed from: M */
    private ImageReader f53234M;

    /* renamed from: N */
    private SurfaceTexture f53235N;

    /* renamed from: O */
    private ImageReader f53236O;

    /* renamed from: P */
    private C19264d f53237P;

    /* renamed from: Q */
    private Size f53238Q;

    /* renamed from: R */
    private Surface f53239R;

    /* renamed from: S */
    private MediaRecorder f53240S;

    /* renamed from: T */
    private ImageReader f53241T;

    /* renamed from: U */
    private StateCallback f53242U = new StateCallback() {
        public final void onDisconnected(CameraDevice cameraDevice) {
            C50792y.m109914d("IESMiCamera", "StateCallback::onDisconnected...");
            C19280h.this.mo39651b();
        }

        public final void onOpened(CameraDevice cameraDevice) {
            C50792y.m109909a("IESMiCamera", "StateCallback::onOpened...");
            C19280h.this.f53249g = 2;
            C19280h.this.f53243a = cameraDevice;
            if (C19280h.this.f53246d != null) {
                C19280h.this.f53246d.mo39670a(4);
            }
            C19280h.this.f53253k = false;
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            int i2;
            C50792y.m109914d("IESMiCamera", "StateCallback::onError...");
            C19280h.this.f53249g = 4;
            if (C19280h.this.f53246d != null) {
                C19263c cVar = C19280h.this.f53246d;
                switch (i) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
                cVar.mo39671a(4, i2, "StateCallback::onError");
                C19280h.this.f53246d = null;
            }
            C19280h.this.mo39749p();
        }
    };

    /* renamed from: a */
    public CameraDevice f53243a;

    /* renamed from: b */
    public CameraCaptureSession f53244b;

    /* renamed from: c */
    public Builder f53245c;

    /* renamed from: d */
    public C19263c f53246d;

    /* renamed from: e */
    public int f53247e;

    /* renamed from: f */
    public volatile boolean f53248f;

    /* renamed from: g */
    public volatile int f53249g;

    /* renamed from: h */
    public Handler f53250h;

    /* renamed from: i */
    int[] f53251i = new int[2];

    /* renamed from: j */
    int f53252j = 1;

    /* renamed from: k */
    public boolean f53253k = true;

    /* renamed from: l */
    public C19270b f53254l;

    /* renamed from: m */
    public int f53255m;

    /* renamed from: n */
    public C19271c f53256n;

    /* renamed from: o */
    public int f53257o;

    /* renamed from: p */
    boolean f53258p;

    /* renamed from: q */
    public int f53259q;

    /* renamed from: r */
    C19269a f53260r;

    /* renamed from: s */
    public CaptureCallback f53261s = new CaptureCallback() {
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            StringBuilder sb = new StringBuilder("Manual AF failure: ");
            sb.append(captureFailure);
            C50792y.m109914d("IESMiCamera", sb.toString());
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            C50792y.m109911b("IESMiCamera", C2240a.m6772a("onCaptureProgressed: state[AE, AF, AWB] = [%d, %d, %d]", new Object[]{captureResult.get(CaptureResult.CONTROL_AE_STATE), captureResult.get(CaptureResult.CONTROL_AF_STATE), captureResult.get(CaptureResult.CONTROL_AWB_STATE)}));
        }
    };

    /* renamed from: t */
    CameraCharacteristics f53262t;

    /* renamed from: u */
    public CaptureRequest f53263u;

    /* renamed from: x */
    CameraCaptureSession.StateCallback f53264x;

    /* renamed from: y */
    CaptureCallback f53265y = new CaptureCallback() {
        /* renamed from: a */
        private void m47119a(CaptureResult captureResult) {
            switch (C19280h.this.f53259q) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        C19280h.this.mo39750q();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            C19280h.this.f53259q = 4;
                            C19280h.this.mo39750q();
                            break;
                        } else {
                            C19280h hVar = C19280h.this;
                            try {
                                hVar.f53245c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
                                hVar.f53259q = 2;
                                hVar.f53244b.capture(hVar.f53245c.build(), hVar.f53265y, hVar.f53250h);
                                break;
                            } catch (CameraAccessException unused) {
                                return;
                            }
                        }
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        C19280h.this.mo39750q();
                        C19280h.this.f53259q = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        C19280h.this.f53259q = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        C19280h.this.f53259q = 4;
                        C19280h.this.mo39750q();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m47119a(totalCaptureResult);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m47119a(captureResult);
        }
    };

    /* renamed from: z */
    private CameraManager f53266z;

    /* renamed from: a */
    public final void mo39642a(C19271c cVar) {
    }

    /* renamed from: e */
    public final void mo39658e() {
        m47080x();
    }

    /* renamed from: g */
    public final int mo39660g() {
        return this.f53224C;
    }

    /* renamed from: m */
    public final int mo39666m() {
        return this.f53228G;
    }

    /* renamed from: n */
    public final boolean mo39667n() {
        return false;
    }

    /* renamed from: o */
    public final int mo39668o() {
        return 35;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d0 A[Catch:{ Throwable -> 0x01bc }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39649a(final int r11, com.p683ss.android.medialib.camera.C19263c r12) {
        /*
            r10 = this;
            java.lang.String r0 = "IESMiCamera"
            java.lang.String r1 = "open..."
            com.p683ss.android.vesdk.C50792y.m109911b(r0, r1)
            int r0 = r10.f53249g
            r1 = 4
            if (r0 != r1) goto L_0x000f
            r10.mo39749p()
        L_0x000f:
            r10.f53246d = r12
            r12 = 1
            r0 = 0
            r10.f53249g = r12     // Catch:{ Throwable -> 0x01bc }
            r10.f53228G = r11     // Catch:{ Throwable -> 0x01bc }
            android.hardware.camera2.CameraManager r2 = r10.f53266z     // Catch:{ Throwable -> 0x01bc }
            r2.getCameraIdList()     // Catch:{ Throwable -> 0x01bc }
            r2 = 2
            if (r11 != r2) goto L_0x0022
            r11 = 21
            goto L_0x0028
        L_0x0022:
            if (r11 < 0) goto L_0x01af
            if (r11 <= r2) goto L_0x0028
            goto L_0x01af
        L_0x0028:
            java.lang.String r3 = com.p904e.p905a.C13456a.m27122a(r11)     // Catch:{ Throwable -> 0x01bc }
            android.hardware.camera2.CameraManager r4 = r10.f53266z     // Catch:{ Throwable -> 0x01bc }
            android.hardware.camera2.CameraCharacteristics r3 = r4.getCameraCharacteristics(r3)     // Catch:{ Throwable -> 0x01bc }
            r10.f53262t = r3     // Catch:{ Throwable -> 0x01bc }
            android.hardware.camera2.CameraCharacteristics r3 = r10.f53262t     // Catch:{ Throwable -> 0x01bc }
            if (r3 != 0) goto L_0x0039
            return r0
        L_0x0039:
            boolean r3 = r10.f53253k     // Catch:{ Throwable -> 0x01bc }
            if (r3 == 0) goto L_0x00f7
            android.hardware.camera2.CameraCharacteristics r3 = r10.f53262t     // Catch:{ Throwable -> 0x01bc }
            int r4 = r10.f53232K     // Catch:{ Throwable -> 0x01bc }
            int r5 = r10.f53247e     // Catch:{ Throwable -> 0x01bc }
            if (r5 == 0) goto L_0x004c
            int r5 = r10.f53247e     // Catch:{ Throwable -> 0x01bc }
            if (r4 < r5) goto L_0x004c
        L_0x0049:
            r2 = 1
            goto L_0x00ce
        L_0x004c:
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ Throwable -> 0x01bc }
            java.lang.Object r3 = r3.get(r5)     // Catch:{ Throwable -> 0x01bc }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Throwable -> 0x01bc }
            int r3 = r3.intValue()     // Catch:{ Throwable -> 0x01bc }
            if (r3 < 0) goto L_0x00ba
            r5 = 3
            if (r3 <= r5) goto L_0x005e
            goto L_0x00ba
        L_0x005e:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x01bc }
            r6 = 22
            if (r5 >= r6) goto L_0x0068
            if (r3 != r2) goto L_0x0068
        L_0x0066:
            r2 = 0
            goto L_0x00ce
        L_0x0068:
            int[] r2 = f53184w     // Catch:{ Throwable -> 0x01bc }
            r2 = r2[r3]     // Catch:{ Throwable -> 0x01bc }
            r10.f53247e = r2     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r2 = "iesve_record_camera_hw_level"
            int r3 = r10.f53247e     // Catch:{ Throwable -> 0x01bc }
            long r5 = (long) r3     // Catch:{ Throwable -> 0x01bc }
            com.p683ss.android.ttve.monitor.C20114g.m49648a(r2, r5)     // Catch:{ Throwable -> 0x01bc }
            int r2 = r10.f53247e     // Catch:{ Throwable -> 0x01bc }
            if (r2 < r4) goto L_0x009a
            java.lang.String r2 = "IESMiCamera"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r4 = "Camera hardware level supported, deviceLevel = "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x01bc }
            int r4 = r10.f53247e     // Catch:{ Throwable -> 0x01bc }
            r3.append(r4)     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r4 = ", require = "
            r3.append(r4)     // Catch:{ Throwable -> 0x01bc }
            int r4 = r10.f53232K     // Catch:{ Throwable -> 0x01bc }
            r3.append(r4)     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x01bc }
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r3)     // Catch:{ Throwable -> 0x01bc }
            goto L_0x0049
        L_0x009a:
            java.lang.String r2 = "IESMiCamera"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r4 = "Camera hardware level not supported, deviceLevel = "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x01bc }
            int r4 = r10.f53247e     // Catch:{ Throwable -> 0x01bc }
            r3.append(r4)     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r4 = ", require = "
            r3.append(r4)     // Catch:{ Throwable -> 0x01bc }
            int r4 = r10.f53232K     // Catch:{ Throwable -> 0x01bc }
            r3.append(r4)     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x01bc }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r3)     // Catch:{ Throwable -> 0x01bc }
            goto L_0x0066
        L_0x00ba:
            java.lang.String r2 = "IESMiCamera"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r5 = "Invalid hardware level = "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x01bc }
            r4.append(r3)     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r3 = r4.toString()     // Catch:{ Throwable -> 0x01bc }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r3)     // Catch:{ Throwable -> 0x01bc }
            goto L_0x0066
        L_0x00ce:
            if (r2 != 0) goto L_0x00f7
            com.ss.android.medialib.camera.c r11 = r10.f53246d     // Catch:{ Throwable -> 0x01bc }
            if (r11 == 0) goto L_0x00f4
            com.ss.android.medialib.camera.c r11 = r10.f53246d     // Catch:{ Throwable -> 0x01bc }
            r12 = -4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r3 = "Camera hardware level not supported, deviceLevel = "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x01bc }
            int r3 = r10.f53247e     // Catch:{ Throwable -> 0x01bc }
            r2.append(r3)     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r3 = ", require = "
            r2.append(r3)     // Catch:{ Throwable -> 0x01bc }
            int r3 = r10.f53232K     // Catch:{ Throwable -> 0x01bc }
            r2.append(r3)     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x01bc }
            r11.mo39671a(r1, r12, r2)     // Catch:{ Throwable -> 0x01bc }
        L_0x00f4:
            r10.f53249g = r0     // Catch:{ Throwable -> 0x01bc }
            return r0
        L_0x00f7:
            android.hardware.camera2.CameraCharacteristics r2 = r10.f53262t     // Catch:{ Throwable -> 0x01bc }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ Throwable -> 0x01bc }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Throwable -> 0x01bc }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Throwable -> 0x01bc }
            int r2 = r2.intValue()     // Catch:{ Throwable -> 0x01bc }
            r10.f53223B = r2     // Catch:{ Throwable -> 0x01bc }
            android.hardware.camera2.CameraCharacteristics r2 = r10.f53262t     // Catch:{ Throwable -> 0x01bc }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Throwable -> 0x01bc }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Throwable -> 0x01bc }
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2     // Catch:{ Throwable -> 0x01bc }
            java.lang.Class<android.graphics.SurfaceTexture> r3 = android.graphics.SurfaceTexture.class
            android.util.Size[] r3 = r2.getOutputSizes(r3)     // Catch:{ Throwable -> 0x01bc }
            r10.f53227F = r3     // Catch:{ Throwable -> 0x01bc }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x01bc }
            r4.<init>()     // Catch:{ Throwable -> 0x01bc }
            android.util.Size[] r3 = r10.f53227F     // Catch:{ Throwable -> 0x01bc }
            int r5 = r3.length     // Catch:{ Throwable -> 0x01bc }
            r6 = 0
        L_0x0122:
            if (r6 >= r5) goto L_0x0139
            r7 = r3[r6]     // Catch:{ Throwable -> 0x01bc }
            android.graphics.Point r8 = new android.graphics.Point     // Catch:{ Throwable -> 0x01bc }
            int r9 = r7.getWidth()     // Catch:{ Throwable -> 0x01bc }
            int r7 = r7.getHeight()     // Catch:{ Throwable -> 0x01bc }
            r8.<init>(r9, r7)     // Catch:{ Throwable -> 0x01bc }
            r4.add(r8)     // Catch:{ Throwable -> 0x01bc }
            int r6 = r6 + 1
            goto L_0x0122
        L_0x0139:
            com.ss.android.medialib.camera.d r3 = r10.f53237P     // Catch:{ Throwable -> 0x01bc }
            boolean r3 = r3.f53170h     // Catch:{ Throwable -> 0x01bc }
            if (r3 == 0) goto L_0x0178
            r3 = 256(0x100, float:3.59E-43)
            android.util.Size[] r2 = r2.getOutputSizes(r3)     // Catch:{ Throwable -> 0x01bc }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Throwable -> 0x01bc }
            r7.<init>()     // Catch:{ Throwable -> 0x01bc }
            int r3 = r2.length     // Catch:{ Throwable -> 0x01bc }
            r5 = 0
        L_0x014c:
            if (r5 >= r3) goto L_0x0163
            r6 = r2[r5]     // Catch:{ Throwable -> 0x01bc }
            android.graphics.Point r8 = new android.graphics.Point     // Catch:{ Throwable -> 0x01bc }
            int r9 = r6.getWidth()     // Catch:{ Throwable -> 0x01bc }
            int r6 = r6.getHeight()     // Catch:{ Throwable -> 0x01bc }
            r8.<init>(r9, r6)     // Catch:{ Throwable -> 0x01bc }
            r7.add(r8)     // Catch:{ Throwable -> 0x01bc }
            int r5 = r5 + 1
            goto L_0x014c
        L_0x0163:
            com.ss.android.medialib.camera.d r2 = r10.f53237P     // Catch:{ Throwable -> 0x01bc }
            int r5 = r2.f53168f     // Catch:{ Throwable -> 0x01bc }
            com.ss.android.medialib.camera.d r2 = r10.f53237P     // Catch:{ Throwable -> 0x01bc }
            int r6 = r2.f53169g     // Catch:{ Throwable -> 0x01bc }
            com.ss.android.medialib.camera.d r2 = r10.f53237P     // Catch:{ Throwable -> 0x01bc }
            int r8 = r2.f53171i     // Catch:{ Throwable -> 0x01bc }
            com.ss.android.medialib.camera.d r2 = r10.f53237P     // Catch:{ Throwable -> 0x01bc }
            int r9 = r2.f53172j     // Catch:{ Throwable -> 0x01bc }
            android.graphics.Point r2 = com.p683ss.android.medialib.camera.C19265e.m46989a(r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x01bc }
            goto L_0x0184
        L_0x0178:
            com.ss.android.medialib.camera.d r2 = r10.f53237P     // Catch:{ Throwable -> 0x01bc }
            int r2 = r2.f53168f     // Catch:{ Throwable -> 0x01bc }
            com.ss.android.medialib.camera.d r3 = r10.f53237P     // Catch:{ Throwable -> 0x01bc }
            int r3 = r3.f53169g     // Catch:{ Throwable -> 0x01bc }
            android.graphics.Point r2 = com.p683ss.android.medialib.camera.C19265e.m46988a(r4, r2, r3)     // Catch:{ Throwable -> 0x01bc }
        L_0x0184:
            if (r2 == 0) goto L_0x018e
            int r3 = r2.x     // Catch:{ Throwable -> 0x01bc }
            r10.f53225D = r3     // Catch:{ Throwable -> 0x01bc }
            int r2 = r2.y     // Catch:{ Throwable -> 0x01bc }
            r10.f53226E = r2     // Catch:{ Throwable -> 0x01bc }
        L_0x018e:
            r10.m47076t()     // Catch:{ Throwable -> 0x01bc }
            android.hardware.camera2.CameraDevice$StateCallback r2 = r10.f53242U     // Catch:{ Throwable -> 0x01bc }
            android.os.Handler r3 = r10.f53250h     // Catch:{ Throwable -> 0x01bc }
            android.hardware.camera2.CameraManager r4 = r10.f53266z     // Catch:{ Throwable -> 0x01bc }
            com.p904e.p905a.C13456a.m27123a(r11, r2, r3, r4)     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r11 = "iesve_record_camera_type"
            r2 = 2
            com.p683ss.android.ttve.monitor.C20114g.m49648a(r11, r2)     // Catch:{ Throwable -> 0x01bc }
            android.view.Surface r11 = android.media.MediaCodec.createPersistentInputSurface()     // Catch:{ Throwable -> 0x01bc }
            r10.f53239R = r11     // Catch:{ Throwable -> 0x01bc }
            java.lang.String r11 = "IESMiCamera"
            java.lang.String r2 = "initRecorderSurface: zhanghp"
            com.p683ss.android.vesdk.C50792y.m109911b(r11, r2)     // Catch:{ Throwable -> 0x01bc }
            return r12
        L_0x01af:
            android.os.Handler r12 = r10.f53222A     // Catch:{ Throwable -> 0x01bc }
            com.ss.android.medialib.camera.h$6 r2 = new com.ss.android.medialib.camera.h$6     // Catch:{ Throwable -> 0x01bc }
            r2.<init>(r11)     // Catch:{ Throwable -> 0x01bc }
            r12.post(r2)     // Catch:{ Throwable -> 0x01bc }
            r10.f53249g = r0     // Catch:{ Throwable -> 0x01bc }
            return r0
        L_0x01bc:
            r11 = move-exception
            r10.f53249g = r1
            r10.mo39749p()
            android.os.Handler r12 = r10.f53222A
            com.ss.android.medialib.camera.h$7 r1 = new com.ss.android.medialib.camera.h$7
            r1.<init>(r11)
            r12.post(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19280h.mo39649a(int, com.ss.android.medialib.camera.c):boolean");
    }

    /* renamed from: a */
    public final void mo39645a(boolean z) {
        if (this.f53245c != null && this.f53244b != null) {
            try {
                this.f53245c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z ? 2 : 0));
                this.f53244b.setRepeatingRequest(this.f53245c.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo39647a(int i) {
        if (this.f53245c == null || this.f53244b == null) {
            return false;
        }
        switch (i) {
            case 0:
                this.f53245c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53245c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                break;
            case 1:
                this.f53245c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(3));
                break;
            case 2:
                this.f53245c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53245c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                break;
            case 3:
                this.f53245c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
                break;
            case 4:
                try {
                    this.f53245c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(4));
                    break;
                } catch (Exception unused) {
                    return false;
                }
            default:
                return false;
        }
        this.f53255m = i;
        this.f53244b.setRepeatingRequest(this.f53245c.build(), this.f53265y, this.f53250h);
        return true;
    }

    /* renamed from: a */
    public final boolean mo39646a() {
        try {
            return ((Boolean) this.f53266z.getCameraCharacteristics("0").get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } catch (CameraAccessException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo39648a(int i, int i2, float f, float[] fArr, int i3) {
        C50792y.m109911b("IESMiCamera", "setFocusAreas...");
        if (this.f53249g != 3) {
            StringBuilder sb = new StringBuilder("Ignore setFocusAreas operation, invalid state = ");
            sb.append(this.f53249g);
            C50792y.m109913c("IESMiCamera", sb.toString());
            return false;
        } else if (this.f53245c == null || this.f53243a == null || this.f53244b == null) {
            C50792y.m109914d("IESMiCamera", "Set focus failed, you must open camera first.");
            return false;
        } else if (this.f53248f) {
            C50792y.m109913c("IESMiCamera", "Manual focus already engaged");
            return true;
        } else if (this.f53259q != 0) {
            C50792y.m109913c("IESMiCamera", "capturing now");
            return false;
        } else {
            int i4 = i;
            int i5 = i2;
            float[] fArr2 = fArr;
            int i6 = i3;
            Rect a = m47073a(i4, i5, fArr2, i6, 0);
            Rect a2 = m47073a(i4, i5, fArr2, i6, 1);
            C1928210 r10 = new CaptureCallback() {
                public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                    super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    StringBuilder sb = new StringBuilder("Manual AF failure: ");
                    sb.append(captureFailure);
                    C50792y.m109914d("IESMiCamera", sb.toString());
                    C19280h.this.f53248f = false;
                }

                /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
                /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession r9, android.hardware.camera2.CaptureRequest r10, android.hardware.camera2.TotalCaptureResult r11) {
                    /*
                        r8 = this;
                        if (r10 == 0) goto L_0x011f
                        java.lang.Object r9 = r10.getTag()
                        java.lang.String r10 = "FOCUS_TAG"
                        if (r9 == r10) goto L_0x000c
                        goto L_0x011f
                    L_0x000c:
                        android.hardware.camera2.CaptureResult$Key r9 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                        java.lang.Object r9 = r11.get(r9)
                        java.lang.Integer r9 = (java.lang.Integer) r9
                        android.hardware.camera2.CaptureResult$Key r10 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
                        java.lang.Object r10 = r11.get(r10)
                        java.lang.Integer r10 = (java.lang.Integer) r10
                        r11 = 5
                        r0 = 4
                        r1 = 1
                        r2 = 2
                        r3 = 0
                        if (r9 == 0) goto L_0x0057
                        java.lang.String r4 = "IESMiCamera"
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        java.lang.String r6 = "afState = "
                        r5.<init>(r6)
                        r5.append(r9)
                        java.lang.String r5 = r5.toString()
                        com.p683ss.android.vesdk.C50792y.m109911b(r4, r5)
                        int r4 = r9.intValue()
                        if (r0 == r4) goto L_0x0055
                        int r4 = r9.intValue()
                        if (r11 == r4) goto L_0x0055
                        int r4 = r9.intValue()
                        if (r2 == r4) goto L_0x0055
                        r4 = 6
                        int r5 = r9.intValue()
                        if (r4 == r5) goto L_0x0055
                        int r4 = r9.intValue()
                        if (r4 != 0) goto L_0x005e
                    L_0x0055:
                        r4 = 1
                        goto L_0x005f
                    L_0x0057:
                        java.lang.String r4 = "IESMiCamera"
                        java.lang.String r5 = "afState is null"
                        com.p683ss.android.vesdk.C50792y.m109913c(r4, r5)
                    L_0x005e:
                        r4 = 0
                    L_0x005f:
                        r5 = 3
                        if (r10 == 0) goto L_0x008c
                        int r6 = r9.intValue()
                        if (r5 == r6) goto L_0x0077
                        int r6 = r9.intValue()
                        if (r2 == r6) goto L_0x0077
                        int r9 = r9.intValue()
                        if (r0 != r9) goto L_0x0075
                        goto L_0x0077
                    L_0x0075:
                        r9 = 0
                        goto L_0x0078
                    L_0x0077:
                        r9 = 1
                    L_0x0078:
                        java.lang.String r0 = "IESMiCamera"
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        java.lang.String r7 = "aeState = "
                        r6.<init>(r7)
                        r6.append(r10)
                        java.lang.String r10 = r6.toString()
                        com.p683ss.android.vesdk.C50792y.m109911b(r0, r10)
                        goto L_0x0094
                    L_0x008c:
                        java.lang.String r9 = "IESMiCamera"
                        java.lang.String r10 = "aeState is null"
                        com.p683ss.android.vesdk.C50792y.m109913c(r9, r10)
                        r9 = 0
                    L_0x0094:
                        com.ss.android.medialib.camera.h r10 = com.p683ss.android.medialib.camera.C19280h.this
                        android.hardware.camera2.CaptureRequest$Builder r10 = r10.f53245c
                        if (r10 == 0) goto L_0x011e
                        com.ss.android.medialib.camera.h r10 = com.p683ss.android.medialib.camera.C19280h.this
                        int r0 = r10.f53257o
                        int r0 = r0 + r1
                        r10.f53257o = r0
                        com.ss.android.medialib.camera.h r10 = com.p683ss.android.medialib.camera.C19280h.this
                        int r10 = r10.f53257o
                        if (r10 >= r11) goto L_0x00c9
                        if (r4 == 0) goto L_0x00ac
                        if (r9 == 0) goto L_0x00ac
                        goto L_0x00c9
                    L_0x00ac:
                        java.lang.String r9 = "IESMiCamera"
                        java.lang.StringBuilder r10 = new java.lang.StringBuilder
                        java.lang.String r11 = "Focus not finished, do "
                        r10.<init>(r11)
                        com.ss.android.medialib.camera.h r11 = com.p683ss.android.medialib.camera.C19280h.this
                        int r11 = r11.f53257o
                        r10.append(r11)
                        java.lang.String r11 = " capture."
                        r10.append(r11)
                        java.lang.String r10 = r10.toString()
                        com.p683ss.android.vesdk.C50792y.m109909a(r9, r10)
                        goto L_0x011e
                    L_0x00c9:
                        com.ss.android.medialib.camera.h r9 = com.p683ss.android.medialib.camera.C19280h.this
                        r9.f53248f = r3
                        com.ss.android.medialib.camera.h r9 = com.p683ss.android.medialib.camera.C19280h.this
                        r9.f53257o = r3
                        com.ss.android.medialib.camera.h r9 = com.p683ss.android.medialib.camera.C19280h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Builder r9 = r9.f53245c     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER     // Catch:{ CameraAccessException -> 0x011d }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x011d }
                        r9.set(r10, r11)     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r9 = com.p683ss.android.medialib.camera.C19280h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Builder r9 = r9.f53245c     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE     // Catch:{ CameraAccessException -> 0x011d }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch:{ CameraAccessException -> 0x011d }
                        r9.set(r10, r11)     // Catch:{ CameraAccessException -> 0x011d }
                        int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ CameraAccessException -> 0x011d }
                        r10 = 23
                        if (r9 < r10) goto L_0x00fe
                        com.ss.android.medialib.camera.h r9 = com.p683ss.android.medialib.camera.C19280h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Builder r9 = r9.f53245c     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER     // Catch:{ CameraAccessException -> 0x011d }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x011d }
                        r9.set(r10, r11)     // Catch:{ CameraAccessException -> 0x011d }
                    L_0x00fe:
                        com.ss.android.medialib.camera.h r9 = com.p683ss.android.medialib.camera.C19280h.this     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r10 = com.p683ss.android.medialib.camera.C19280h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Builder r10 = r10.f53245c     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest r10 = r10.build()     // Catch:{ CameraAccessException -> 0x011d }
                        r9.f53263u = r10     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r9 = com.p683ss.android.medialib.camera.C19280h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CameraCaptureSession r9 = r9.f53244b     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r10 = com.p683ss.android.medialib.camera.C19280h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest r10 = r10.f53263u     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r11 = com.p683ss.android.medialib.camera.C19280h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CameraCaptureSession$CaptureCallback r11 = r11.f53261s     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r0 = com.p683ss.android.medialib.camera.C19280h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.os.Handler r0 = r0.f53250h     // Catch:{ CameraAccessException -> 0x011d }
                        r9.setRepeatingRequest(r10, r11, r0)     // Catch:{ CameraAccessException -> 0x011d }
                    L_0x011d:
                        return
                    L_0x011e:
                        return
                    L_0x011f:
                        java.lang.String r9 = "IESMiCamera"
                        java.lang.String r10 = "Not focus request!"
                        com.p683ss.android.vesdk.C50792y.m109913c(r9, r10)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19280h.C1928210.onCaptureCompleted(android.hardware.camera2.CameraCaptureSession, android.hardware.camera2.CaptureRequest, android.hardware.camera2.TotalCaptureResult):void");
                }
            };
            try {
                this.f53244b.stopRepeating();
                if (m47082z()) {
                    if (VERSION.SDK_INT >= 23) {
                        this.f53245c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    }
                    this.f53245c.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a2, 999)});
                }
                if (!m47081y()) {
                    if (m47082z()) {
                        this.f53263u = this.f53245c.build();
                        this.f53244b.setRepeatingRequest(this.f53263u, r10, this.f53250h);
                    } else {
                        C50792y.m109913c("IESMiCamera", "do not support MeteringAreaAE!");
                    }
                    C50792y.m109913c("IESMiCamera", "do not support MeteringAreaAF!");
                    return false;
                }
                this.f53245c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
                this.f53245c.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a, 999)});
                this.f53245c.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.f53245c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
                this.f53245c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                this.f53245c.setTag("FOCUS_TAG");
                if (VERSION.SDK_INT >= 23) {
                    this.f53245c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
                }
                this.f53263u = this.f53245c.build();
                this.f53244b.setRepeatingRequest(this.f53263u, r10, this.f53250h);
                return true;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("setRepeatingRequest failed, ");
                sb2.append(e.getMessage());
                C50792y.m109914d("IESMiCamera", sb2.toString());
                this.f53249g = 4;
                mo39749p();
                return false;
            }
        }
    }

    /* renamed from: a */
    public final void mo39644a(C19273e eVar) {
        this.f53230I = eVar;
    }

    /* renamed from: f */
    public final void mo39659f() {
        mo39639a(this.f53235N);
    }

    /* renamed from: j */
    public final boolean mo39663j() {
        if (this.f53243a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    private void m47077u() {
        if (this.f53239R != null) {
            this.f53239R.release();
            this.f53239R = null;
        }
    }

    /* renamed from: v */
    private void m47078v() {
        if (this.f53240S != null) {
            this.f53240S.release();
        }
    }

    /* renamed from: w */
    private void m47079w() {
        if (this.f53241T != null) {
            this.f53241T.close();
        }
    }

    /* renamed from: c */
    public final void mo39656c() {
        this.f53249g = 0;
        mo39749p();
        this.f53254l = null;
        m47077u();
    }

    /* renamed from: h */
    public final int[] mo39661h() {
        return new int[]{this.f53225D, this.f53226E};
    }

    /* renamed from: k */
    public final int[] mo39664k() {
        return new int[]{this.f53225D, this.f53226E};
    }

    /* renamed from: s */
    public final void mo39752s() {
        this.f53259q = 0;
        if (this.f53244b != null) {
            this.f53244b.close();
            this.f53244b = null;
        }
    }

    /* renamed from: d */
    public final void mo39657d() {
        if (this.f53237P.f53177o == 1) {
            mo39639a(this.f53235N);
        } else {
            mo39659f();
        }
    }

    /* renamed from: r */
    public final void mo39751r() {
        try {
            this.f53245c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            this.f53259q = 1;
            this.f53244b.capture(this.f53245c.build(), this.f53265y, this.f53250h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: x */
    private void m47080x() {
        if (this.f53244b != null) {
            if (this.f53245c != null) {
                C13456a.m27124a(this.f53244b, this.f53245c);
            }
            this.f53244b.close();
            this.f53244b = null;
        }
        m47079w();
        m47078v();
        if (this.f53234M != null) {
            this.f53234M.close();
            this.f53234M = null;
        }
        if (this.f53236O != null) {
            this.f53236O.close();
            this.f53236O = null;
        }
    }

    /* renamed from: y */
    private boolean m47081y() {
        if (this.f53262t == null) {
            try {
                if (((Integer) this.f53266z.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53262t.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private boolean m47082z() {
        if (this.f53262t == null) {
            try {
                if (((Integer) this.f53266z.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53262t.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo39651b() {
        C50792y.m109911b("IESMiCamera", "close...");
        if (this.f53249g == 1) {
            C50792y.m109913c("IESMiCamera", "Camera is opening or pending, ignore close operation.");
            return;
        }
        this.f53249g = 0;
        mo39749p();
        this.f53254l = null;
        m47077u();
    }

    /* renamed from: l */
    public final List<int[]> mo39665l() {
        Size[] sizeArr;
        ArrayList arrayList = new ArrayList();
        if (this.f53227F == null) {
            return arrayList;
        }
        for (Size size : this.f53227F) {
            if (size != null) {
                arrayList.add(new int[]{size.getWidth(), size.getHeight()});
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001e */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39749p() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.m47080x()     // Catch:{ Throwable -> 0x001e }
            android.view.Surface r1 = r2.f53229H     // Catch:{ Throwable -> 0x001e }
            if (r1 == 0) goto L_0x0010
            android.view.Surface r1 = r2.f53229H     // Catch:{ Throwable -> 0x001e }
            r1.release()     // Catch:{ Throwable -> 0x001e }
            r2.f53229H = r0     // Catch:{ Throwable -> 0x001e }
        L_0x0010:
            android.hardware.camera2.CameraDevice r1 = r2.f53243a     // Catch:{ Throwable -> 0x001e }
            if (r1 == 0) goto L_0x001e
            android.hardware.camera2.CameraDevice r1 = r2.f53243a     // Catch:{ Throwable -> 0x001e }
            r1.close()     // Catch:{ Throwable -> 0x001e }
            r2.f53243a = r0     // Catch:{ Throwable -> 0x001e }
            goto L_0x001e
        L_0x001c:
            r0 = move-exception
            goto L_0x002f
        L_0x001e:
            r2.f53246d = r0     // Catch:{ all -> 0x001c }
            r1 = 0
            r2.f53249g = r1     // Catch:{ all -> 0x001c }
            r2.f53243a = r0     // Catch:{ all -> 0x001c }
            r2.f53245c = r0     // Catch:{ all -> 0x001c }
            r2.f53244b = r0     // Catch:{ all -> 0x001c }
            r2.f53262t = r0     // Catch:{ all -> 0x001c }
            r2.f53263u = r0     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x002f:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19280h.mo39749p():void");
    }

    /* renamed from: q */
    public final void mo39750q() {
        try {
            Builder createCaptureRequest = this.f53243a.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.f53234M.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
            this.f53244b.stopRepeating();
            this.f53244b.capture(createCaptureRequest.build(), new CaptureCallback() {
                public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    C19280h.this.mo39752s();
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    if (C19280h.this.f53254l != null) {
                        C19280h.this.f53254l.mo39715a(null);
                    }
                    C19280h.this.mo39752s();
                }
            }, this.f53250h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: i */
    public final float mo39662i() {
        float f;
        boolean z;
        if (this.f53262t == null) {
            f = -1.0f;
        } else {
            f = ((Float) this.f53262t.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f2 = f / 2.0f;
        if (this.f53230I != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f2)));
            C19273e eVar = this.f53230I;
            if (f2 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            eVar.mo39717a(2, z, false, 99.0f, arrayList);
        }
        return 99.0f;
    }

    /* renamed from: t */
    private void m47076t() {
        if (this.f53262t != null) {
            Range[] rangeArr = (Range[]) this.f53262t.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr != null) {
                int i = 1000;
                if (rangeArr.length <= 0 || ((Integer) rangeArr[0].getUpper()).intValue() >= 1000) {
                    i = 1;
                }
                this.f53252j = i;
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range range : rangeArr) {
                    int[] iArr = {((Integer) range.getLower()).intValue() * this.f53252j, ((Integer) range.getUpper()).intValue() * this.f53252j};
                    arrayList.add(iArr);
                    StringBuilder sb = new StringBuilder("Fps Range: [");
                    sb.append(iArr[0]);
                    sb.append(", ");
                    sb.append(iArr[1]);
                    sb.append("]");
                    C50792y.m109911b("IESMiCamera", sb.toString());
                }
                this.f53251i = C19265e.m46991a(new int[]{this.f53237P.f53166d * this.f53252j, this.f53237P.f53167e * this.f53252j}, arrayList);
                StringBuilder sb2 = new StringBuilder("Set Fps Range: [");
                sb2.append(this.f53251i[0]);
                sb2.append(", ");
                sb2.append(this.f53251i[1]);
                sb2.append("]");
                C50792y.m109909a("IESMiCamera", sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo39641a(C19269a aVar) {
        this.f53260r = aVar;
    }

    /* renamed from: b */
    public final void mo39653b(SurfaceTexture surfaceTexture) {
        this.f53235N = surfaceTexture;
    }

    /* renamed from: b */
    public final void mo39654b(boolean z) {
        this.f53258p = z;
    }

    /* renamed from: a */
    public final void mo39643a(C19272d dVar) {
        this.f53231J = dVar;
    }

    /* renamed from: a */
    public final void mo39639a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f53225D, this.f53226E);
            m47075a(new Surface(surfaceTexture), surfaceTexture);
        }
    }

    /* renamed from: a */
    public final void mo39640a(C19264d dVar) {
        if (dVar == null || !dVar.mo39711a()) {
            C50792y.m109914d("IESMiCamera", "Invalid CameraParams");
            return;
        }
        this.f53250h = new Handler();
        this.f53232K = dVar.f53178p;
        if (this.f53266z == null) {
            this.f53266z = (CameraManager) dVar.f53164b.getSystemService("camera");
        }
        this.f53237P = dVar;
    }

    /* renamed from: b */
    public final int mo39650b(int i) {
        int i2;
        if (this.f53228G == 1) {
            i2 = ((360 - ((this.f53223B + i) % 360)) + NormalGiftView.ALPHA_180) % 360;
        } else {
            i2 = ((this.f53223B - i) + 360) % 360;
        }
        if (this.f53237P.f53177o == 2) {
            i2 = (360 - i2) % 360;
        }
        this.f53224C = i2;
        StringBuilder sb = new StringBuilder("currentCameraPosition: ");
        sb.append(this.f53228G);
        C50792y.m109909a("IESMiCamera", sb.toString());
        StringBuilder sb2 = new StringBuilder("mCameraRotation: ");
        sb2.append(this.f53224C);
        C50792y.m109909a("IESMiCamera", sb2.toString());
        return i2;
    }

    /* renamed from: a */
    public final void mo39637a(float f) {
        float min = Math.min(Math.max(1.0f, f), 100.0f);
        if (this.f53262t != null && this.f53245c != null && this.f53244b != null) {
            Rect rect = (Rect) this.f53262t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            double width = (double) (((float) rect.width()) / min);
            double height = (double) (((float) rect.height()) / min);
            double width2 = (double) rect.width();
            Double.isNaN(width2);
            Double.isNaN(width);
            int i = (int) ((width2 - width) / 2.0d);
            double height2 = (double) rect.height();
            Double.isNaN(height2);
            Double.isNaN(height);
            int i2 = (int) ((height2 - height) / 2.0d);
            StringBuilder sb = new StringBuilder("cropW: ");
            sb.append(i);
            sb.append(", cropH: ");
            sb.append(i2);
            sb.append(", width: ");
            sb.append(rect.width());
            sb.append(", height: ");
            sb.append(rect.height());
            C50792y.m109911b("IESMiCamera", sb.toString());
            try {
                this.f53245c.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i, i2, rect.width() - i, rect.height() - i2));
                this.f53244b.setRepeatingRequest(this.f53245c.build(), null, null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo39652b(float f) {
        if (this.f53262t != null && this.f53245c != null && this.f53244b != null) {
            Rect rect = (Rect) this.f53262t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (f > 99.0f) {
                f = 99.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            double pow = Math.pow(0.10000000149011612d, 0.10000000149011612d);
            double d = (double) (f / 10.0f);
            double pow2 = Math.pow(pow, d);
            double width = (double) rect.width();
            Double.isNaN(width);
            double d2 = pow2 * width;
            double pow3 = Math.pow(pow, d);
            double height = (double) rect.height();
            Double.isNaN(height);
            double d3 = pow3 * height;
            double width2 = (double) rect.width();
            Double.isNaN(width2);
            int i = (int) ((width2 - d2) / 2.0d);
            double height2 = (double) rect.height();
            Double.isNaN(height2);
            int i2 = (int) ((height2 - d3) / 2.0d);
            StringBuilder sb = new StringBuilder("cropW: ");
            sb.append(i);
            sb.append(", cropH: ");
            sb.append(i2);
            sb.append(", width: ");
            sb.append(rect.width());
            sb.append(", height: ");
            sb.append(rect.height());
            sb.append("zoom: ");
            sb.append(f);
            C50792y.m109911b("IESMiCamera", sb.toString());
            try {
                this.f53245c.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i, i2, rect.width() - i, rect.height() - i2));
                this.f53244b.setRepeatingRequest(this.f53245c.build(), null, null);
                if (this.f53230I != null) {
                    this.f53230I.mo39716a(2, f, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m47074a(int i, int i2) {
        Size[] outputSizes = ((StreamConfigurationMap) this.f53262t.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(UnReadVideoExperiment.BROWSE_RECORD_LIST);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new Point(size.getWidth(), size.getHeight()));
        }
        Point a = C19265e.m46990a((List<Point>) arrayList, new Point(this.f53225D, this.f53226E), (float) i, (float) i2);
        this.f53237P.f53176n = a;
        if (a != null) {
            this.f53234M = ImageReader.newInstance(a.x, a.y, 35, 1);
            this.f53234M.setOnImageAvailableListener(new OnImageAvailableListener() {
                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        ImageFrame imageFrame = new ImageFrame(new C19306j(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                        if (C19280h.this.f53254l != null) {
                            C19280h.this.f53254l.mo39715a(imageFrame);
                        }
                        acquireNextImage.close();
                    }
                }
            }, this.f53250h);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x012d */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0136 A[Catch:{ CameraAccessException -> 0x0172 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m47075a(android.view.Surface r7, android.graphics.SurfaceTexture r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "IESMiCamera"
            java.lang.String r1 = "startPreview..."
            com.p683ss.android.vesdk.C50792y.m109911b(r0, r1)     // Catch:{ all -> 0x0176 }
            android.hardware.camera2.CameraDevice r0 = r6.f53243a     // Catch:{ all -> 0x0176 }
            if (r0 == 0) goto L_0x0174
            int r0 = r6.f53249g     // Catch:{ all -> 0x0176 }
            r1 = 3
            r2 = 2
            if (r0 == r2) goto L_0x002d
            int r0 = r6.f53249g     // Catch:{ all -> 0x0176 }
            if (r0 == r1) goto L_0x002d
            java.lang.String r7 = "IESMiCamera"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0176 }
            java.lang.String r0 = "Invalid state: "
            r8.<init>(r0)     // Catch:{ all -> 0x0176 }
            int r0 = r6.f53249g     // Catch:{ all -> 0x0176 }
            r8.append(r0)     // Catch:{ all -> 0x0176 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0176 }
            com.p683ss.android.vesdk.C50792y.m109913c(r7, r8)     // Catch:{ all -> 0x0176 }
            monitor-exit(r6)
            return
        L_0x002d:
            r6.m47080x()     // Catch:{ CameraAccessException -> 0x0172 }
            r6.f53235N = r8     // Catch:{ CameraAccessException -> 0x0172 }
            android.hardware.camera2.CameraDevice r8 = r6.f53243a     // Catch:{ CameraAccessException -> 0x0172 }
            android.hardware.camera2.CaptureRequest$Builder r8 = r8.createCaptureRequest(r1)     // Catch:{ CameraAccessException -> 0x0172 }
            r6.f53245c = r8     // Catch:{ CameraAccessException -> 0x0172 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0172 }
            r8.<init>()     // Catch:{ CameraAccessException -> 0x0172 }
            android.view.Surface r0 = r6.f53229H     // Catch:{ CameraAccessException -> 0x0172 }
            if (r0 == 0) goto L_0x004a
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53245c     // Catch:{ CameraAccessException -> 0x0172 }
            android.view.Surface r3 = r6.f53229H     // Catch:{ CameraAccessException -> 0x0172 }
            r0.removeTarget(r3)     // Catch:{ CameraAccessException -> 0x0172 }
        L_0x004a:
            com.ss.android.medialib.camera.d r0 = r6.f53237P     // Catch:{ CameraAccessException -> 0x0172 }
            int r0 = r0.f53177o     // Catch:{ CameraAccessException -> 0x0172 }
            r3 = 1
            if (r0 != r2) goto L_0x0073
            int r0 = r6.f53225D     // Catch:{ CameraAccessException -> 0x0172 }
            int r4 = r6.f53226E     // Catch:{ CameraAccessException -> 0x0172 }
            r5 = 35
            android.media.ImageReader r0 = android.media.ImageReader.newInstance(r0, r4, r5, r3)     // Catch:{ CameraAccessException -> 0x0172 }
            r6.f53236O = r0     // Catch:{ CameraAccessException -> 0x0172 }
            android.media.ImageReader r0 = r6.f53236O     // Catch:{ CameraAccessException -> 0x0172 }
            com.ss.android.medialib.camera.h$12 r4 = new com.ss.android.medialib.camera.h$12     // Catch:{ CameraAccessException -> 0x0172 }
            r4.<init>()     // Catch:{ CameraAccessException -> 0x0172 }
            android.os.Handler r5 = r6.f53250h     // Catch:{ CameraAccessException -> 0x0172 }
            r0.setOnImageAvailableListener(r4, r5)     // Catch:{ CameraAccessException -> 0x0172 }
            android.media.ImageReader r0 = r6.f53236O     // Catch:{ CameraAccessException -> 0x0172 }
            if (r0 == 0) goto L_0x0073
            android.media.ImageReader r7 = r6.f53236O     // Catch:{ CameraAccessException -> 0x0172 }
            android.view.Surface r7 = r7.getSurface()     // Catch:{ CameraAccessException -> 0x0172 }
        L_0x0073:
            r6.f53229H = r7     // Catch:{ CameraAccessException -> 0x0172 }
            android.view.Surface r7 = r6.f53229H     // Catch:{ CameraAccessException -> 0x0172 }
            r8.add(r7)     // Catch:{ CameraAccessException -> 0x0172 }
            android.hardware.camera2.CaptureRequest$Builder r7 = r6.f53245c     // Catch:{ CameraAccessException -> 0x0172 }
            android.view.Surface r0 = r6.f53229H     // Catch:{ CameraAccessException -> 0x0172 }
            r7.addTarget(r0)     // Catch:{ CameraAccessException -> 0x0172 }
            com.ss.android.medialib.camera.d r7 = r6.f53237P     // Catch:{ CameraAccessException -> 0x0172 }
            boolean r7 = r7.f53170h     // Catch:{ CameraAccessException -> 0x0172 }
            if (r7 == 0) goto L_0x00b8
            android.util.Size r7 = r6.f53238Q     // Catch:{ CameraAccessException -> 0x0172 }
            if (r7 == 0) goto L_0x00a3
            android.util.Size r7 = r6.f53238Q     // Catch:{ CameraAccessException -> 0x0172 }
            int r7 = r7.getWidth()     // Catch:{ CameraAccessException -> 0x0172 }
            com.ss.android.medialib.camera.d r0 = r6.f53237P     // Catch:{ CameraAccessException -> 0x0172 }
            int r0 = r0.f53171i     // Catch:{ CameraAccessException -> 0x0172 }
            if (r7 != r0) goto L_0x00b8
            android.util.Size r7 = r6.f53238Q     // Catch:{ CameraAccessException -> 0x0172 }
            int r7 = r7.getHeight()     // Catch:{ CameraAccessException -> 0x0172 }
            com.ss.android.medialib.camera.d r0 = r6.f53237P     // Catch:{ CameraAccessException -> 0x0172 }
            int r0 = r0.f53172j     // Catch:{ CameraAccessException -> 0x0172 }
            if (r7 != r0) goto L_0x00b8
        L_0x00a3:
            com.ss.android.medialib.camera.d r7 = r6.f53237P     // Catch:{ CameraAccessException -> 0x0172 }
            int r7 = r7.f53171i     // Catch:{ CameraAccessException -> 0x0172 }
            com.ss.android.medialib.camera.d r0 = r6.f53237P     // Catch:{ CameraAccessException -> 0x0172 }
            int r0 = r0.f53172j     // Catch:{ CameraAccessException -> 0x0172 }
            r6.m47074a(r7, r0)     // Catch:{ CameraAccessException -> 0x0172 }
            android.media.ImageReader r7 = r6.f53234M     // Catch:{ CameraAccessException -> 0x0172 }
            android.view.Surface r7 = r7.getSurface()     // Catch:{ CameraAccessException -> 0x0172 }
            r8.add(r7)     // Catch:{ CameraAccessException -> 0x0172 }
            goto L_0x00d8
        L_0x00b8:
            android.util.Size r7 = r6.f53238Q     // Catch:{ CameraAccessException -> 0x0172 }
            if (r7 == 0) goto L_0x00d8
            boolean r7 = r6.f53233L     // Catch:{ CameraAccessException -> 0x0172 }
            if (r7 == 0) goto L_0x00d8
            android.util.Size r7 = r6.f53238Q     // Catch:{ CameraAccessException -> 0x0172 }
            int r7 = r7.getWidth()     // Catch:{ CameraAccessException -> 0x0172 }
            android.util.Size r0 = r6.f53238Q     // Catch:{ CameraAccessException -> 0x0172 }
            int r0 = r0.getHeight()     // Catch:{ CameraAccessException -> 0x0172 }
            r6.m47074a(r7, r0)     // Catch:{ CameraAccessException -> 0x0172 }
            android.media.ImageReader r7 = r6.f53234M     // Catch:{ CameraAccessException -> 0x0172 }
            android.view.Surface r7 = r7.getSurface()     // Catch:{ CameraAccessException -> 0x0172 }
            r8.add(r7)     // Catch:{ CameraAccessException -> 0x0172 }
        L_0x00d8:
            boolean r7 = r6.f53258p     // Catch:{ CameraAccessException -> 0x0172 }
            r0 = 0
            if (r7 == 0) goto L_0x015c
            android.media.MediaRecorder r7 = new android.media.MediaRecorder     // Catch:{ IOException -> 0x012d }
            r7.<init>()     // Catch:{ IOException -> 0x012d }
            r6.f53240S = r7     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            r7.setAudioSource(r3)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            r7.setVideoSource(r2)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            r7.setOutputFormat(r2)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            java.lang.String r3 = "/storage/emulated/0/xiaomi_camera.mp4"
            r7.setOutputFile(r3)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            r3 = 10000000(0x989680, float:1.4012985E-38)
            r7.setVideoEncodingBitRate(r3)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            r3 = 30
            r7.setVideoFrameRate(r3)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            int r3 = r6.f53225D     // Catch:{ IOException -> 0x012d }
            int r4 = r6.f53226E     // Catch:{ IOException -> 0x012d }
            r7.setVideoSize(r3, r4)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            r7.setVideoEncoder(r2)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            r7.setAudioEncoder(r1)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            android.view.Surface r1 = r6.f53239R     // Catch:{ IOException -> 0x012d }
            r7.setInputSurface(r1)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            r7.setOrientationHint(r0)     // Catch:{ IOException -> 0x012d }
            android.media.MediaRecorder r7 = r6.f53240S     // Catch:{ IOException -> 0x012d }
            r7.prepare()     // Catch:{ IOException -> 0x012d }
        L_0x012d:
            android.view.Surface r7 = r6.f53239R     // Catch:{ CameraAccessException -> 0x0172 }
            r8.add(r7)     // Catch:{ CameraAccessException -> 0x0172 }
            android.media.ImageReader r7 = r6.f53241T     // Catch:{ CameraAccessException -> 0x0172 }
            if (r7 == 0) goto L_0x013b
            android.media.ImageReader r7 = r6.f53241T     // Catch:{ CameraAccessException -> 0x0172 }
            r7.close()     // Catch:{ CameraAccessException -> 0x0172 }
        L_0x013b:
            com.ss.android.medialib.camera.h$8 r7 = new com.ss.android.medialib.camera.h$8     // Catch:{ CameraAccessException -> 0x0172 }
            r7.<init>()     // Catch:{ CameraAccessException -> 0x0172 }
            int r1 = r6.f53225D     // Catch:{ CameraAccessException -> 0x0172 }
            int r3 = r6.f53226E     // Catch:{ CameraAccessException -> 0x0172 }
            r4 = 256(0x100, float:3.59E-43)
            android.media.ImageReader r1 = android.media.ImageReader.newInstance(r1, r3, r4, r2)     // Catch:{ CameraAccessException -> 0x0172 }
            r6.f53241T = r1     // Catch:{ CameraAccessException -> 0x0172 }
            android.media.ImageReader r1 = r6.f53241T     // Catch:{ CameraAccessException -> 0x0172 }
            android.os.Handler r2 = r6.f53250h     // Catch:{ CameraAccessException -> 0x0172 }
            r1.setOnImageAvailableListener(r7, r2)     // Catch:{ CameraAccessException -> 0x0172 }
            android.media.ImageReader r7 = r6.f53241T     // Catch:{ CameraAccessException -> 0x0172 }
            android.view.Surface r7 = r7.getSurface()     // Catch:{ CameraAccessException -> 0x0172 }
            r8.add(r7)     // Catch:{ CameraAccessException -> 0x0172 }
        L_0x015c:
            r7 = 32772(0x8004, float:4.5923E-41)
            boolean r1 = r6.f53258p     // Catch:{ CameraAccessException -> 0x0172 }
            if (r1 != 0) goto L_0x0164
            r7 = 0
        L_0x0164:
            com.ss.android.medialib.camera.h$9 r0 = new com.ss.android.medialib.camera.h$9     // Catch:{ CameraAccessException -> 0x0172 }
            r0.<init>()     // Catch:{ CameraAccessException -> 0x0172 }
            android.os.Handler r1 = r6.f53250h     // Catch:{ CameraAccessException -> 0x0172 }
            android.hardware.camera2.CameraDevice r2 = r6.f53243a     // Catch:{ CameraAccessException -> 0x0172 }
            com.p904e.p905a.C13456a.m27125a(r8, r0, r1, r2, r7)     // Catch:{ CameraAccessException -> 0x0172 }
            monitor-exit(r6)
            return
        L_0x0172:
            monitor-exit(r6)
            return
        L_0x0174:
            monitor-exit(r6)
            return
        L_0x0176:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19280h.m47075a(android.view.Surface, android.graphics.SurfaceTexture):void");
    }

    /* renamed from: b */
    public final boolean mo39655b(int i, C19263c cVar) {
        C50792y.m109911b("IESMiCamera", "changeCamera...");
        if (this.f53249g == 1 || this.f53249g == 2) {
            C50792y.m109913c("IESMiCamera", "Camera is opening or pending, ignore changeCamera operation.");
            return false;
        }
        mo39651b();
        mo39649a(i, cVar);
        C19274g.f53186l = true;
        return true;
    }

    /* renamed from: a */
    public final void mo39638a(int i, int i2, final C19270b bVar) {
        this.f53254l = bVar;
        this.f53238Q = new Size(i, i2);
        if (this.f53243a == null || this.f53244b == null || this.f53262t == null) {
            if (bVar != null) {
                bVar.mo39715a(null);
            }
            return;
        }
        try {
            this.f53233L = true;
            if (this.f53237P.f53170h && this.f53237P.f53171i == i && this.f53237P.f53172j == i2) {
                if (this.f53255m == 0 || this.f53255m == 2) {
                    mo39750q();
                } else {
                    mo39751r();
                }
                return;
            }
            this.f53264x = new CameraCaptureSession.StateCallback() {
                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    C19280h.this.f53264x = null;
                    if (bVar != null) {
                        bVar.mo39715a(null);
                    }
                }

                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    C19280h.this.f53264x = null;
                    try {
                        if (C19280h.this.f53255m == 0) {
                            if (C19280h.this.f53255m == 2) {
                                C19280h.this.mo39750q();
                                return;
                            }
                        }
                        C19280h.this.mo39751r();
                    } catch (Throwable unused) {
                        if (bVar != null) {
                            bVar.mo39715a(null);
                        }
                    }
                }
            };
            mo39639a(this.f53235N);
            this.f53233L = false;
        } catch (Throwable unused) {
            if (bVar != null) {
                bVar.mo39715a(null);
            }
        } finally {
            this.f53233L = false;
        }
    }

    /* renamed from: a */
    private Rect m47073a(int i, int i2, float[] fArr, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Rect rect = (Rect) this.f53262t.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        sb.append(rect.left);
        sb.append(", ");
        sb.append(rect.top);
        sb.append(", ");
        sb.append(rect.right);
        sb.append(", ");
        sb.append(rect.bottom);
        sb.append("]");
        C50792y.m109911b("IESMiCamera", sb.toString());
        Size size = (Size) this.f53262t.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb2 = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb2.append(size.getWidth());
        sb2.append(", ");
        sb2.append(size.getHeight());
        sb2.append("]");
        C50792y.m109909a("onAreaTouchEvent", sb2.toString());
        float f6 = fArr[0];
        float f7 = fArr[1];
        int i8 = this.f53225D;
        int i9 = this.f53226E;
        if (90 == this.f53223B || 270 == this.f53223B) {
            i8 = this.f53226E;
            i9 = this.f53225D;
        }
        float f8 = 0.0f;
        if (i9 * i5 >= i8 * i6) {
            float f9 = (((float) i5) * 1.0f) / ((float) i8);
            f = ((((float) i9) * f9) - ((float) i6)) / 2.0f;
            f2 = f9;
            f3 = 0.0f;
        } else {
            f2 = (((float) i6) * 1.0f) / ((float) i9);
            f3 = ((((float) i8) * f2) - ((float) i5)) / 2.0f;
            f = 0.0f;
        }
        float f10 = (f6 + f3) / f2;
        float f11 = (f7 + f) / f2;
        if (90 == i7) {
            f10 = ((float) this.f53226E) - f10;
        } else if (270 == i7) {
            f11 = ((float) this.f53225D) - f11;
        } else {
            float f12 = f10;
            f10 = f11;
            f11 = f12;
        }
        Rect rect2 = (Rect) this.f53263u.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            C50792y.m109913c("IESMiCamera", "can't get crop region");
            rect2 = rect;
        }
        int width = rect2.width();
        int height = rect2.height();
        if (this.f53226E * width > this.f53225D * height) {
            float f13 = (((float) height) * 1.0f) / ((float) this.f53226E);
            f8 = (((float) width) - (((float) this.f53225D) * f13)) / 2.0f;
            f5 = f13;
            f4 = 0.0f;
        } else {
            f5 = (((float) width) * 1.0f) / ((float) this.f53225D);
            f4 = (((float) height) - (((float) this.f53226E) * f5)) / 2.0f;
        }
        float f14 = (f11 * f5) + f8 + ((float) rect2.left);
        float f15 = (f10 * f5) + f4 + ((float) rect2.top);
        Rect rect3 = new Rect();
        if (i4 == 0) {
            double d = (double) f14;
            double width2 = (double) rect2.width();
            Double.isNaN(width2);
            double d2 = width2 * 0.05d;
            Double.isNaN(d);
            rect3.left = C19265e.m46987a((int) (d - d2), 0, rect2.width());
            double width3 = (double) rect2.width();
            Double.isNaN(width3);
            double d3 = width3 * 0.05d;
            Double.isNaN(d);
            rect3.right = C19265e.m46987a((int) (d + d3), 0, rect2.width());
            double d4 = (double) f15;
            double height2 = (double) rect2.height();
            Double.isNaN(height2);
            double d5 = height2 * 0.05d;
            Double.isNaN(d4);
            rect3.top = C19265e.m46987a((int) (d4 - d5), 0, rect2.height());
            double height3 = (double) rect2.height();
            Double.isNaN(height3);
            double d6 = height3 * 0.05d;
            Double.isNaN(d4);
            rect3.bottom = C19265e.m46987a((int) (d4 + d6), 0, rect2.height());
        } else {
            double d7 = (double) f14;
            double width4 = (double) rect2.width();
            Double.isNaN(width4);
            double d8 = width4 * 0.1d;
            Double.isNaN(d7);
            rect3.left = C19265e.m46987a((int) (d7 - d8), 0, rect2.width());
            double width5 = (double) rect2.width();
            Double.isNaN(width5);
            double d9 = width5 * 0.1d;
            Double.isNaN(d7);
            rect3.right = C19265e.m46987a((int) (d7 + d9), 0, rect2.width());
            double d10 = (double) f15;
            double height4 = (double) rect2.height();
            Double.isNaN(height4);
            double d11 = height4 * 0.1d;
            Double.isNaN(d10);
            rect3.top = C19265e.m46987a((int) (d10 - d11), 0, rect2.height());
            double height5 = (double) rect2.height();
            Double.isNaN(height5);
            double d12 = height5 * 0.1d;
            Double.isNaN(d10);
            rect3.bottom = C19265e.m46987a((int) (d10 + d12), 0, rect2.height());
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
        C50792y.m109911b("IESMiCamera", sb3.toString());
        return rect3;
    }
}
