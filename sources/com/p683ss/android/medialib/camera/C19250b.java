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
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.medialib.camera.C19268f.C19270b;
import com.p683ss.android.medialib.camera.C19268f.C19271c;
import com.p683ss.android.medialib.camera.C19268f.C19272d;
import com.p683ss.android.medialib.camera.C19268f.C19273e;
import com.p683ss.android.medialib.p1180b.C19226c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.vesdk.C50792y;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.camera.b */
public final class C19250b implements C19268f {

    /* renamed from: A */
    private int f53102A;

    /* renamed from: B */
    private int f53103B;

    /* renamed from: C */
    private int f53104C;

    /* renamed from: D */
    private Size[] f53105D;

    /* renamed from: E */
    private int f53106E = -1;

    /* renamed from: F */
    private int f53107F = -1;

    /* renamed from: G */
    private Surface f53108G;

    /* renamed from: H */
    private List<Surface> f53109H = new ArrayList();

    /* renamed from: I */
    private C19273e f53110I;

    /* renamed from: J */
    private C19272d f53111J;

    /* renamed from: K */
    private int f53112K = 1;

    /* renamed from: L */
    private boolean f53113L;

    /* renamed from: M */
    private ImageReader f53114M;

    /* renamed from: N */
    private SurfaceTexture f53115N;

    /* renamed from: O */
    private ImageReader f53116O;

    /* renamed from: P */
    private C19264d f53117P;

    /* renamed from: Q */
    private Rect f53118Q;

    /* renamed from: R */
    private Size f53119R;

    /* renamed from: S */
    private C19269a f53120S;

    /* renamed from: T */
    private StateCallback f53121T = new StateCallback() {
        public final void onDisconnected(CameraDevice cameraDevice) {
            StringBuilder sb = new StringBuilder("StateCallback::onDisconnected: thread_name = ");
            sb.append(Thread.currentThread().getName());
            C50792y.m109913c("Camera2", sb.toString());
            C19250b.this.mo39651b();
        }

        public final void onOpened(CameraDevice cameraDevice) {
            StringBuilder sb = new StringBuilder("StateCallback::onOpened: thread_name = ");
            sb.append(Thread.currentThread().getName());
            C50792y.m109913c("Camera2", sb.toString());
            C19250b.this.f53130g = 2;
            C19250b.this.f53124a = cameraDevice;
            if (C19250b.this.f53127d != null) {
                C19250b.this.f53127d.mo39670a(2);
            } else {
                C50792y.m109914d("Camera2", "mCameraOpenListener is null!");
            }
            C19250b.this.f53134k = false;
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            StringBuilder sb = new StringBuilder("StateCallback::onError: thread_name = ");
            sb.append(Thread.currentThread().getName());
            sb.append("error: ");
            sb.append(i);
            C50792y.m109913c("Camera2", sb.toString());
            int i2 = 4;
            C19250b.this.f53130g = 4;
            if (C19250b.this.f53127d != null) {
                C19263c cVar = C19250b.this.f53127d;
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
                        break;
                    case 5:
                        i2 = 5;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
                cVar.mo39671a(2, i2, "StateCallback::onError");
                C19250b.this.f53127d = null;
            }
            C19250b.this.mo39683p();
        }
    };

    /* renamed from: U */
    private CameraCharacteristics f53122U;

    /* renamed from: V */
    private Runnable f53123V = new Runnable() {
        public final void run() {
            if (C19250b.this.f53139p != 0) {
                C19250b.this.f53139p = 0;
                C19250b.this.f53138o = 0;
                if (C19250b.this.f53125b != null) {
                    C19250b bVar = C19250b.this;
                    if (bVar.f53130g != 3) {
                        StringBuilder sb = new StringBuilder("Ignore cancelAutoFocus operation, invalid state = ");
                        sb.append(bVar.f53130g);
                        C50792y.m109914d("Camera2", sb.toString());
                    } else if (bVar.mo39685r() && bVar.f53126c != null && bVar.f53124a != null) {
                        bVar.f53126c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                        bVar.f53126c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(3));
                        bVar.f53142s = bVar.f53126c.build();
                        try {
                            bVar.f53125b.setRepeatingRequest(bVar.f53142s, null, bVar.f53131h);
                        } catch (CameraAccessException e) {
                            StringBuilder sb2 = new StringBuilder("setRepeatingRequest failed, errMsg: ");
                            sb2.append(e.getMessage());
                            C50792y.m109914d("Camera2", sb2.toString());
                        }
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public CameraDevice f53124a;

    /* renamed from: b */
    public CameraCaptureSession f53125b;

    /* renamed from: c */
    public Builder f53126c;

    /* renamed from: d */
    public C19263c f53127d;

    /* renamed from: e */
    public int f53128e;

    /* renamed from: f */
    public volatile boolean f53129f;

    /* renamed from: g */
    public volatile int f53130g;

    /* renamed from: h */
    public Handler f53131h;

    /* renamed from: i */
    int[] f53132i = new int[2];

    /* renamed from: j */
    int f53133j = 1;

    /* renamed from: k */
    public boolean f53134k = true;

    /* renamed from: l */
    public C19270b f53135l;

    /* renamed from: m */
    public int f53136m;

    /* renamed from: n */
    public C19271c f53137n;

    /* renamed from: o */
    public int f53138o;

    /* renamed from: p */
    public int f53139p;

    /* renamed from: q */
    public int f53140q;

    /* renamed from: r */
    public CaptureCallback f53141r = new CaptureCallback() {
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            StringBuilder sb = new StringBuilder("Manual AF failure: ");
            sb.append(captureFailure);
            sb.append(", thread id = ");
            sb.append(Thread.currentThread().getId());
            C50792y.m109914d("Camera2", sb.toString());
        }
    };

    /* renamed from: s */
    public CaptureRequest f53142s;

    /* renamed from: t */
    CameraCaptureSession.StateCallback f53143t;

    /* renamed from: u */
    CaptureCallback f53144u = new CaptureCallback() {
        /* renamed from: a */
        private void m46982a(CaptureResult captureResult, boolean z) {
            switch (C19250b.this.f53140q) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        C19250b.this.mo39686s();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            C19250b.this.f53140q = 4;
                            C19250b.this.mo39686s();
                            break;
                        } else {
                            C19250b bVar = C19250b.this;
                            try {
                                bVar.f53126c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
                                bVar.f53140q = 2;
                                bVar.f53125b.capture(bVar.f53126c.build(), bVar.f53144u, bVar.f53131h);
                                break;
                            } catch (CameraAccessException unused) {
                                return;
                            }
                        }
                    } else if (z) {
                        C50792y.m109911b("Camera2", "No Focus");
                        C19250b.this.mo39686s();
                        return;
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        C19250b.this.mo39686s();
                        C19250b.this.f53140q = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        C19250b.this.f53140q = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        C19250b.this.f53140q = 4;
                        C19250b.this.mo39686s();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m46982a(totalCaptureResult, true);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m46982a(captureResult, false);
        }
    };

    /* renamed from: x */
    private CameraManager f53145x;

    /* renamed from: y */
    private Handler f53146y = new Handler(Looper.getMainLooper());

    /* renamed from: z */
    private int f53147z;

    /* renamed from: b */
    public final void mo39654b(boolean z) {
    }

    /* renamed from: e */
    public final void mo39658e() {
        m46942w();
    }

    /* renamed from: g */
    public final int mo39660g() {
        return this.f53102A;
    }

    /* renamed from: m */
    public final int mo39666m() {
        return this.f53106E;
    }

    /* renamed from: n */
    public final boolean mo39667n() {
        return false;
    }

    /* renamed from: o */
    public final int mo39668o() {
        return 35;
    }

    /* renamed from: a */
    public final void mo39640a(C19264d dVar) {
        if (dVar == null || !dVar.mo39711a()) {
            C50792y.m109914d("Camera2", "Invalid CameraParams");
            return;
        }
        this.f53131h = new Handler();
        StringBuilder sb = new StringBuilder("init: thread_name = ");
        sb.append(Thread.currentThread().getName());
        C50792y.m109913c("Camera2", sb.toString());
        this.f53112K = dVar.f53178p;
        if (this.f53145x == null) {
            this.f53145x = (CameraManager) dVar.f53164b.getSystemService("camera");
        }
        this.f53117P = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0150 A[Catch:{ Throwable -> 0x022f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39649a(final int r11, com.p683ss.android.medialib.camera.C19263c r12) {
        /*
            r10 = this;
            java.lang.String r0 = "Camera2"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "open: thread_name = "
            r1.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r1)
            int r0 = r10.f53130g
            r1 = 4
            if (r0 != r1) goto L_0x0023
            r10.mo39683p()
        L_0x0023:
            r10.f53127d = r12
            r12 = 1
            r0 = 0
            r10.f53130g = r12     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraManager r2 = r10.f53145x     // Catch:{ Throwable -> 0x022f }
            java.lang.String[] r2 = r2.getCameraIdList()     // Catch:{ Throwable -> 0x022f }
            java.lang.String r3 = "Camera2"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "open cameraList.size: "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x022f }
            int r5 = r2.length     // Catch:{ Throwable -> 0x022f }
            r4.append(r5)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x022f }
            com.p683ss.android.vesdk.C50792y.m109909a(r3, r4)     // Catch:{ Throwable -> 0x022f }
            if (r11 < 0) goto L_0x0222
            r3 = 2
            if (r11 <= r3) goto L_0x004a
            goto L_0x0222
        L_0x004a:
            int r4 = r2.length     // Catch:{ Throwable -> 0x022f }
            if (r11 < r4) goto L_0x004e
            r11 = 1
        L_0x004e:
            r10.f53107F = r11     // Catch:{ Throwable -> 0x022f }
            java.lang.String r11 = ""
            int r4 = r2.length     // Catch:{ Throwable -> 0x022f }
            if (r4 != r12) goto L_0x0057
            r10.f53107F = r0     // Catch:{ Throwable -> 0x022f }
        L_0x0057:
            int r4 = r2.length     // Catch:{ Throwable -> 0x022f }
            r5 = 0
        L_0x0059:
            if (r5 >= r4) goto L_0x007d
            r6 = r2[r5]     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraManager r7 = r10.f53145x     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraCharacteristics r7 = r7.getCameraCharacteristics(r6)     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ Throwable -> 0x022f }
            java.lang.Object r7 = r7.get(r8)     // Catch:{ Throwable -> 0x022f }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Throwable -> 0x022f }
            int r7 = r7.intValue()     // Catch:{ Throwable -> 0x022f }
            if (r7 != r12) goto L_0x0073
            r7 = 0
            goto L_0x0074
        L_0x0073:
            r7 = 1
        L_0x0074:
            int r8 = r10.f53107F     // Catch:{ Throwable -> 0x022f }
            if (r7 != r8) goto L_0x007a
            r11 = r6
            goto L_0x007d
        L_0x007a:
            int r5 = r5 + 1
            goto L_0x0059
        L_0x007d:
            android.hardware.camera2.CameraManager r2 = r10.f53145x     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraCharacteristics r2 = r2.getCameraCharacteristics(r11)     // Catch:{ Throwable -> 0x022f }
            r10.f53122U = r2     // Catch:{ Throwable -> 0x022f }
            java.lang.String r2 = "Camera2"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "open newCameraPosition: "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x022f }
            int r5 = r10.f53107F     // Catch:{ Throwable -> 0x022f }
            r4.append(r5)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x022f }
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r4)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r2 = "Camera2"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "open currentCameraId: "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x022f }
            r4.append(r11)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x022f }
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r4)     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraCharacteristics r2 = r10.f53122U     // Catch:{ Throwable -> 0x022f }
            if (r2 != 0) goto L_0x00b9
            java.lang.String r11 = "Camera2"
            java.lang.String r12 = "mCameraCharacteristics is null"
            com.p683ss.android.vesdk.C50792y.m109914d(r11, r12)     // Catch:{ Throwable -> 0x022f }
            return r0
        L_0x00b9:
            boolean r2 = r10.f53134k     // Catch:{ Throwable -> 0x022f }
            if (r2 == 0) goto L_0x0177
            android.hardware.camera2.CameraCharacteristics r2 = r10.f53122U     // Catch:{ Throwable -> 0x022f }
            int r4 = r10.f53112K     // Catch:{ Throwable -> 0x022f }
            int r5 = r10.f53128e     // Catch:{ Throwable -> 0x022f }
            if (r5 == 0) goto L_0x00cc
            int r5 = r10.f53128e     // Catch:{ Throwable -> 0x022f }
            if (r4 < r5) goto L_0x00cc
        L_0x00c9:
            r2 = 1
            goto L_0x014e
        L_0x00cc:
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ Throwable -> 0x022f }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Throwable -> 0x022f }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Throwable -> 0x022f }
            int r2 = r2.intValue()     // Catch:{ Throwable -> 0x022f }
            if (r2 < 0) goto L_0x013a
            r5 = 3
            if (r2 <= r5) goto L_0x00de
            goto L_0x013a
        L_0x00de:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x022f }
            r6 = 22
            if (r5 >= r6) goto L_0x00e8
            if (r2 != r3) goto L_0x00e8
        L_0x00e6:
            r2 = 0
            goto L_0x014e
        L_0x00e8:
            int[] r5 = f53184w     // Catch:{ Throwable -> 0x022f }
            r2 = r5[r2]     // Catch:{ Throwable -> 0x022f }
            r10.f53128e = r2     // Catch:{ Throwable -> 0x022f }
            java.lang.String r2 = "iesve_record_camera_hw_level"
            int r5 = r10.f53128e     // Catch:{ Throwable -> 0x022f }
            long r5 = (long) r5     // Catch:{ Throwable -> 0x022f }
            com.p683ss.android.ttve.monitor.C20114g.m49648a(r2, r5)     // Catch:{ Throwable -> 0x022f }
            int r2 = r10.f53128e     // Catch:{ Throwable -> 0x022f }
            if (r2 < r4) goto L_0x011a
            java.lang.String r2 = "Camera2"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "Camera hardware level supported, deviceLevel = "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x022f }
            int r5 = r10.f53128e     // Catch:{ Throwable -> 0x022f }
            r4.append(r5)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = ", require = "
            r4.append(r5)     // Catch:{ Throwable -> 0x022f }
            int r5 = r10.f53112K     // Catch:{ Throwable -> 0x022f }
            r4.append(r5)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x022f }
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r4)     // Catch:{ Throwable -> 0x022f }
            goto L_0x00c9
        L_0x011a:
            java.lang.String r2 = "Camera2"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = "Camera hardware level not supported, deviceLevel = "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x022f }
            int r5 = r10.f53128e     // Catch:{ Throwable -> 0x022f }
            r4.append(r5)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r5 = ", require = "
            r4.append(r5)     // Catch:{ Throwable -> 0x022f }
            int r5 = r10.f53112K     // Catch:{ Throwable -> 0x022f }
            r4.append(r5)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x022f }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r4)     // Catch:{ Throwable -> 0x022f }
            goto L_0x00e6
        L_0x013a:
            java.lang.String r4 = "Camera2"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x022f }
            java.lang.String r6 = "Invalid hardware level = "
            r5.<init>(r6)     // Catch:{ Throwable -> 0x022f }
            r5.append(r2)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r2 = r5.toString()     // Catch:{ Throwable -> 0x022f }
            com.p683ss.android.vesdk.C50792y.m109914d(r4, r2)     // Catch:{ Throwable -> 0x022f }
            goto L_0x00e6
        L_0x014e:
            if (r2 != 0) goto L_0x0177
            com.ss.android.medialib.camera.c r11 = r10.f53127d     // Catch:{ Throwable -> 0x022f }
            if (r11 == 0) goto L_0x0174
            com.ss.android.medialib.camera.c r11 = r10.f53127d     // Catch:{ Throwable -> 0x022f }
            r12 = -4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x022f }
            java.lang.String r4 = "Camera hardware level not supported, deviceLevel = "
            r2.<init>(r4)     // Catch:{ Throwable -> 0x022f }
            int r4 = r10.f53128e     // Catch:{ Throwable -> 0x022f }
            r2.append(r4)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r4 = ", require = "
            r2.append(r4)     // Catch:{ Throwable -> 0x022f }
            int r4 = r10.f53112K     // Catch:{ Throwable -> 0x022f }
            r2.append(r4)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x022f }
            r11.mo39671a(r3, r12, r2)     // Catch:{ Throwable -> 0x022f }
        L_0x0174:
            r10.f53130g = r0     // Catch:{ Throwable -> 0x022f }
            return r0
        L_0x0177:
            android.hardware.camera2.CameraCharacteristics r2 = r10.f53122U     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ Throwable -> 0x022f }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Throwable -> 0x022f }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Throwable -> 0x022f }
            int r2 = r2.intValue()     // Catch:{ Throwable -> 0x022f }
            r10.f53147z = r2     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraCharacteristics r2 = r10.f53122U     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Throwable -> 0x022f }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2     // Catch:{ Throwable -> 0x022f }
            java.lang.Class<android.graphics.SurfaceTexture> r3 = android.graphics.SurfaceTexture.class
            android.util.Size[] r3 = r2.getOutputSizes(r3)     // Catch:{ Throwable -> 0x022f }
            r10.f53105D = r3     // Catch:{ Throwable -> 0x022f }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x022f }
            r4.<init>()     // Catch:{ Throwable -> 0x022f }
            android.util.Size[] r3 = r10.f53105D     // Catch:{ Throwable -> 0x022f }
            int r5 = r3.length     // Catch:{ Throwable -> 0x022f }
            r6 = 0
        L_0x01a2:
            if (r6 >= r5) goto L_0x01b9
            r7 = r3[r6]     // Catch:{ Throwable -> 0x022f }
            android.graphics.Point r8 = new android.graphics.Point     // Catch:{ Throwable -> 0x022f }
            int r9 = r7.getWidth()     // Catch:{ Throwable -> 0x022f }
            int r7 = r7.getHeight()     // Catch:{ Throwable -> 0x022f }
            r8.<init>(r9, r7)     // Catch:{ Throwable -> 0x022f }
            r4.add(r8)     // Catch:{ Throwable -> 0x022f }
            int r6 = r6 + 1
            goto L_0x01a2
        L_0x01b9:
            com.ss.android.medialib.camera.d r3 = r10.f53117P     // Catch:{ Throwable -> 0x022f }
            boolean r3 = r3.f53170h     // Catch:{ Throwable -> 0x022f }
            if (r3 == 0) goto L_0x01f8
            r3 = 256(0x100, float:3.59E-43)
            android.util.Size[] r2 = r2.getOutputSizes(r3)     // Catch:{ Throwable -> 0x022f }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Throwable -> 0x022f }
            r7.<init>()     // Catch:{ Throwable -> 0x022f }
            int r3 = r2.length     // Catch:{ Throwable -> 0x022f }
            r5 = 0
        L_0x01cc:
            if (r5 >= r3) goto L_0x01e3
            r6 = r2[r5]     // Catch:{ Throwable -> 0x022f }
            android.graphics.Point r8 = new android.graphics.Point     // Catch:{ Throwable -> 0x022f }
            int r9 = r6.getWidth()     // Catch:{ Throwable -> 0x022f }
            int r6 = r6.getHeight()     // Catch:{ Throwable -> 0x022f }
            r8.<init>(r9, r6)     // Catch:{ Throwable -> 0x022f }
            r7.add(r8)     // Catch:{ Throwable -> 0x022f }
            int r5 = r5 + 1
            goto L_0x01cc
        L_0x01e3:
            com.ss.android.medialib.camera.d r2 = r10.f53117P     // Catch:{ Throwable -> 0x022f }
            int r5 = r2.f53168f     // Catch:{ Throwable -> 0x022f }
            com.ss.android.medialib.camera.d r2 = r10.f53117P     // Catch:{ Throwable -> 0x022f }
            int r6 = r2.f53169g     // Catch:{ Throwable -> 0x022f }
            com.ss.android.medialib.camera.d r2 = r10.f53117P     // Catch:{ Throwable -> 0x022f }
            int r8 = r2.f53171i     // Catch:{ Throwable -> 0x022f }
            com.ss.android.medialib.camera.d r2 = r10.f53117P     // Catch:{ Throwable -> 0x022f }
            int r9 = r2.f53172j     // Catch:{ Throwable -> 0x022f }
            android.graphics.Point r2 = com.p683ss.android.medialib.camera.C19265e.m46989a(r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x022f }
            goto L_0x0204
        L_0x01f8:
            com.ss.android.medialib.camera.d r2 = r10.f53117P     // Catch:{ Throwable -> 0x022f }
            int r2 = r2.f53168f     // Catch:{ Throwable -> 0x022f }
            com.ss.android.medialib.camera.d r3 = r10.f53117P     // Catch:{ Throwable -> 0x022f }
            int r3 = r3.f53169g     // Catch:{ Throwable -> 0x022f }
            android.graphics.Point r2 = com.p683ss.android.medialib.camera.C19265e.m46988a(r4, r2, r3)     // Catch:{ Throwable -> 0x022f }
        L_0x0204:
            if (r2 == 0) goto L_0x020e
            int r3 = r2.x     // Catch:{ Throwable -> 0x022f }
            r10.f53103B = r3     // Catch:{ Throwable -> 0x022f }
            int r2 = r2.y     // Catch:{ Throwable -> 0x022f }
            r10.f53104C = r2     // Catch:{ Throwable -> 0x022f }
        L_0x020e:
            r10.m46941v()     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraManager r2 = r10.f53145x     // Catch:{ Throwable -> 0x022f }
            android.hardware.camera2.CameraDevice$StateCallback r3 = r10.f53121T     // Catch:{ Throwable -> 0x022f }
            android.os.Handler r4 = r10.f53131h     // Catch:{ Throwable -> 0x022f }
            r2.openCamera(r11, r3, r4)     // Catch:{ Throwable -> 0x022f }
            java.lang.String r11 = "iesve_record_camera_type"
            r2 = 2
            com.p683ss.android.ttve.monitor.C20114g.m49648a(r11, r2)     // Catch:{ Throwable -> 0x022f }
            return r12
        L_0x0222:
            android.os.Handler r12 = r10.f53146y     // Catch:{ Throwable -> 0x022f }
            com.ss.android.medialib.camera.b$6 r2 = new com.ss.android.medialib.camera.b$6     // Catch:{ Throwable -> 0x022f }
            r2.<init>(r11)     // Catch:{ Throwable -> 0x022f }
            r12.post(r2)     // Catch:{ Throwable -> 0x022f }
            r10.f53130g = r0     // Catch:{ Throwable -> 0x022f }
            return r0
        L_0x022f:
            r11 = move-exception
            java.lang.String r12 = "Camera2"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "open failed: "
            r2.<init>(r3)
            java.lang.String r3 = android.util.Log.getStackTraceString(r11)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p683ss.android.vesdk.C50792y.m109914d(r12, r2)
            r10.f53130g = r1
            android.os.Handler r12 = r10.f53146y
            com.ss.android.medialib.camera.b$7 r1 = new com.ss.android.medialib.camera.b$7
            r1.<init>(r11)
            r12.post(r1)
            r10.mo39683p()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19250b.mo39649a(int, com.ss.android.medialib.camera.c):boolean");
    }

    /* renamed from: a */
    public final boolean mo39647a(int i) {
        if (this.f53126c == null || this.f53125b == null) {
            return false;
        }
        switch (i) {
            case 0:
                this.f53126c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53126c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                break;
            case 1:
                this.f53126c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(3));
                break;
            case 2:
                this.f53126c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53126c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                break;
            case 3:
                this.f53126c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
                break;
            case 4:
                try {
                    this.f53126c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(4));
                    break;
                } catch (Exception unused) {
                    return false;
                }
            default:
                return false;
        }
        this.f53136m = i;
        this.f53125b.setRepeatingRequest(this.f53126c.build(), null, this.f53131h);
        return true;
    }

    /* renamed from: a */
    public final boolean mo39646a() {
        boolean z = false;
        if (this.f53145x == null) {
            return false;
        }
        try {
            z = ((Boolean) this.f53145x.getCameraCharacteristics("0").get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("isTorchSupported: ");
            sb.append(e.getMessage());
            C19226c.m46861c("Camera2", sb.toString());
        } catch (AssertionError e2) {
            StringBuilder sb2 = new StringBuilder("isTorchSupported: ");
            sb2.append(e2.getMessage());
            C19226c.m46861c("Camera2", sb2.toString());
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo39648a(int i, int i2, float f, float[] fArr, int i3) {
        StringBuilder sb = new StringBuilder("setFocusAreas: thread_name = ");
        sb.append(Thread.currentThread().getName());
        C50792y.m109911b("Camera2", sb.toString());
        if (this.f53130g != 3) {
            StringBuilder sb2 = new StringBuilder("Ignore setFocusAreas operation, invalid state = ");
            sb2.append(this.f53130g);
            C50792y.m109913c("Camera2", sb2.toString());
            return false;
        } else if (this.f53126c == null || this.f53124a == null || this.f53125b == null || this.f53122U == null) {
            C50792y.m109914d("Camera2", "Set focus failed, you must open camera first.");
            return false;
        } else if (this.f53129f) {
            C50792y.m109913c("Camera2", "Manual focus already engaged");
            return true;
        } else if (this.f53140q != 0) {
            C50792y.m109913c("Camera2", "capturing now");
            return false;
        } else {
            this.f53131h.removeCallbacks(this.f53123V);
            Rect a = m46938a(i, i2, fArr, i3, 0);
            Rect a2 = m46938a(i, i2, fArr, i3, 1);
            C192629 r11 = new CaptureCallback() {
                public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                    super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    StringBuilder sb = new StringBuilder("Manual AF failure: ");
                    sb.append(captureFailure);
                    C50792y.m109914d("Camera2", sb.toString());
                    C19250b.this.f53129f = false;
                }

                public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    StringBuilder sb = new StringBuilder("Focus::onCaptureCompleted: thread_name = ");
                    sb.append(Thread.currentThread().getName());
                    C50792y.m109911b("Camera2", sb.toString());
                    if (captureRequest == null || captureRequest.getTag() != "FOCUS_TAG") {
                        C50792y.m109913c("Camera2", "Not focus request!");
                        return;
                    }
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (!(num == null || C19250b.this.f53126c == null)) {
                        C19250b.this.f53138o++;
                        if (C19250b.this.f53139p != 3 && C19250b.this.f53139p != 4 && C19250b.this.f53139p != 5) {
                            C19250b.this.f53139p = num.intValue();
                        } else if (num.intValue() == 4 || num.intValue() == 5) {
                            C19250b.this.f53129f = false;
                            try {
                                C19250b.this.f53126c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                                C19250b.this.f53126c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(3));
                                C19250b.this.f53142s = C19250b.this.f53126c.build();
                                if (C19250b.this.f53125b != null) {
                                    C19250b.this.f53125b.setRepeatingRequest(C19250b.this.f53142s, C19250b.this.f53141r, C19250b.this.f53131h);
                                }
                                StringBuilder sb2 = new StringBuilder("Focus done, try count = ");
                                sb2.append(C19250b.this.f53138o);
                                C50792y.m109909a("Camera2", sb2.toString());
                                C19250b.this.f53138o = 0;
                                C19250b.this.f53139p = 0;
                            } catch (CameraAccessException unused) {
                            }
                        }
                    }
                }
            };
            try {
                if (m46943x()) {
                    if (VERSION.SDK_INT >= 23) {
                        this.f53126c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    }
                    this.f53126c.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a2, 999)});
                }
                if (!mo39685r()) {
                    if (m46943x()) {
                        this.f53125b.stopRepeating();
                        this.f53142s = this.f53126c.build();
                        this.f53125b.setRepeatingRequest(this.f53142s, r11, this.f53131h);
                    } else {
                        C50792y.m109913c("Camera2", "do not support MeteringAreaAE!");
                    }
                    C50792y.m109913c("Camera2", "do not support MeteringAreaAF!");
                    return false;
                }
                this.f53125b.stopRepeating();
                this.f53126c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
                this.f53126c.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a, 999)});
                this.f53126c.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.f53126c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
                this.f53126c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                this.f53126c.setTag("FOCUS_TAG");
                this.f53142s = this.f53126c.build();
                this.f53129f = true;
                this.f53125b.setRepeatingRequest(this.f53142s, r11, this.f53131h);
                this.f53131h.postDelayed(this.f53123V, 5000);
                return true;
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder("setRepeatingRequest failed, ");
                sb3.append(e.getMessage());
                C50792y.m109914d("Camera2", sb3.toString());
                this.f53130g = 4;
                mo39683p();
                return false;
            }
        }
    }

    /* renamed from: f */
    public final void mo39659f() {
        mo39639a(this.f53115N);
    }

    /* renamed from: j */
    public final boolean mo39663j() {
        if (this.f53124a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo39656c() {
        this.f53130g = 0;
        mo39683p();
        this.f53135l = null;
    }

    /* renamed from: h */
    public final int[] mo39661h() {
        return new int[]{this.f53103B, this.f53104C};
    }

    /* renamed from: k */
    public final int[] mo39664k() {
        return new int[]{this.f53103B, this.f53104C};
    }

    /* renamed from: d */
    public final void mo39657d() {
        if (this.f53117P.f53177o == 1) {
            mo39639a(this.f53115N);
        } else {
            mo39659f();
        }
    }

    /* renamed from: t */
    public final void mo39687t() {
        try {
            this.f53126c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            this.f53140q = 1;
            this.f53125b.capture(this.f53126c.build(), this.f53144u, this.f53131h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: w */
    private void m46942w() {
        this.f53131h.removeCallbacks(this.f53123V);
        this.f53109H.clear();
        if (this.f53125b != null) {
            this.f53125b.close();
            this.f53125b = null;
        }
        if (this.f53114M != null) {
            this.f53114M.close();
            this.f53114M = null;
        }
        if (this.f53116O != null) {
            this.f53116O.close();
            this.f53116O = null;
        }
    }

    /* renamed from: x */
    private boolean m46943x() {
        if (this.f53122U == null) {
            try {
                if (((Integer) this.f53145x.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53122U.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo39651b() {
        StringBuilder sb = new StringBuilder("close: thread_name = ");
        sb.append(Thread.currentThread().getName());
        C50792y.m109911b("Camera2", sb.toString());
        if (this.f53130g == 1) {
            C50792y.m109913c("Camera2", "Camera is opening or pending, ignore close operation.");
            return;
        }
        this.f53130g = 0;
        mo39683p();
        this.f53135l = null;
    }

    /* renamed from: l */
    public final List<int[]> mo39665l() {
        Size[] sizeArr;
        ArrayList arrayList = new ArrayList();
        if (this.f53105D == null) {
            return arrayList;
        }
        for (Size size : this.f53105D) {
            if (size != null) {
                arrayList.add(new int[]{size.getWidth(), size.getHeight()});
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public boolean mo39685r() {
        if (this.f53122U == null) {
            try {
                if (((Integer) this.f53145x.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53122U.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final void mo39686s() {
        try {
            Builder createCaptureRequest = this.f53124a.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.f53114M.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
            this.f53125b.stopRepeating();
            if (this.f53118Q != null) {
                createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.f53118Q);
            }
            this.f53125b.capture(createCaptureRequest.build(), new CaptureCallback() {
                public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    C19250b.this.mo39688u();
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    if (C19250b.this.f53135l != null) {
                        C19250b.this.f53135l.mo39715a(null);
                    }
                    C19250b.this.mo39688u();
                }
            }, this.f53131h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: u */
    public final void mo39688u() {
        try {
            if (!(this.f53126c == null || this.f53125b == null)) {
                if (this.f53140q != 0) {
                    this.f53126c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                    this.f53126c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    this.f53125b.capture(this.f53126c.build(), this.f53144u, this.f53131h);
                    this.f53140q = 0;
                }
            }
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: i */
    public final float mo39662i() {
        float f;
        boolean z;
        if (this.f53122U == null) {
            f = -1.0f;
        } else {
            f = ((Float) this.f53122U.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f2 = f / 2.0f;
        if (this.f53110I != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f2)));
            C19273e eVar = this.f53110I;
            if (f2 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            eVar.mo39717a(2, z, false, 99.0f, arrayList);
        }
        return 99.0f;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|3|4|5|6|(1:8)|9|(1:11)|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0036 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39683p() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "Camera2"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "reset: thread_name = "
            r1.<init>(r2)     // Catch:{ all -> 0x004d }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004d }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x004d }
            r1.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004d }
            com.p683ss.android.vesdk.C50792y.m109913c(r0, r1)     // Catch:{ all -> 0x004d }
            r0 = 0
            r3.m46942w()     // Catch:{ Throwable -> 0x0036 }
            android.view.Surface r1 = r3.f53108G     // Catch:{ Throwable -> 0x0036 }
            if (r1 == 0) goto L_0x002b
            android.view.Surface r1 = r3.f53108G     // Catch:{ Throwable -> 0x0036 }
            r1.release()     // Catch:{ Throwable -> 0x0036 }
            r3.f53108G = r0     // Catch:{ Throwable -> 0x0036 }
        L_0x002b:
            android.hardware.camera2.CameraDevice r1 = r3.f53124a     // Catch:{ Throwable -> 0x0036 }
            if (r1 == 0) goto L_0x0036
            android.hardware.camera2.CameraDevice r1 = r3.f53124a     // Catch:{ Throwable -> 0x0036 }
            r1.close()     // Catch:{ Throwable -> 0x0036 }
            r3.f53124a = r0     // Catch:{ Throwable -> 0x0036 }
        L_0x0036:
            r3.f53127d = r0     // Catch:{ all -> 0x004d }
            r1 = 0
            r3.f53130g = r1     // Catch:{ all -> 0x004d }
            r3.f53124a = r0     // Catch:{ all -> 0x004d }
            r3.f53126c = r0     // Catch:{ all -> 0x004d }
            r3.f53125b = r0     // Catch:{ all -> 0x004d }
            r3.f53122U = r0     // Catch:{ all -> 0x004d }
            r3.f53142s = r0     // Catch:{ all -> 0x004d }
            r3.f53136m = r1     // Catch:{ all -> 0x004d }
            r3.f53129f = r1     // Catch:{ all -> 0x004d }
            r3.f53118Q = r0     // Catch:{ all -> 0x004d }
            monitor-exit(r3)
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19250b.mo39683p():void");
    }

    /* renamed from: v */
    private void m46941v() {
        if (this.f53122U != null) {
            Range[] rangeArr = (Range[]) this.f53122U.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr != null) {
                int i = 1000;
                if (rangeArr.length <= 0 || ((Integer) rangeArr[0].getUpper()).intValue() >= 1000) {
                    i = 1;
                }
                this.f53133j = i;
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range range : rangeArr) {
                    int[] iArr = {((Integer) range.getLower()).intValue() * this.f53133j, ((Integer) range.getUpper()).intValue() * this.f53133j};
                    arrayList.add(iArr);
                    StringBuilder sb = new StringBuilder("Fps Range: [");
                    sb.append(iArr[0]);
                    sb.append(", ");
                    sb.append(iArr[1]);
                    sb.append("]");
                    C50792y.m109911b("Camera2", sb.toString());
                }
                this.f53132i = C19265e.m46991a(new int[]{this.f53117P.f53166d * this.f53133j, this.f53117P.f53167e * this.f53133j}, arrayList);
                StringBuilder sb2 = new StringBuilder("Set Fps Range: [");
                sb2.append(this.f53132i[0]);
                sb2.append(", ");
                sb2.append(this.f53132i[1]);
                sb2.append("]");
                C50792y.m109909a("Camera2", sb2.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39684q() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "Camera2"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "updatePreview: thread_name = "
            r1.<init>(r2)     // Catch:{ all -> 0x00da }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00da }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x00da }
            r1.append(r2)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00da }
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)     // Catch:{ all -> 0x00da }
            android.hardware.camera2.CameraDevice r0 = r6.f53124a     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d8
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53126c     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d8
            android.hardware.camera2.CameraCaptureSession r0 = r6.f53125b     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d8
            java.util.List<android.view.Surface> r0 = r6.f53109H     // Catch:{ all -> 0x00da }
            int r0 = r0.size()     // Catch:{ all -> 0x00da }
            if (r0 > 0) goto L_0x0032
            goto L_0x00d8
        L_0x0032:
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53126c     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE     // Catch:{ Exception -> 0x00b8 }
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00b8 }
            r0.set(r1, r3)     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53126c     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_ANTIBANDING_MODE     // Catch:{ Exception -> 0x00b8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00b8 }
            r0.set(r1, r3)     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53126c     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE     // Catch:{ Exception -> 0x00b8 }
            android.util.Range r3 = new android.util.Range     // Catch:{ Exception -> 0x00b8 }
            int[] r4 = r6.f53132i     // Catch:{ Exception -> 0x00b8 }
            r5 = 0
            r4 = r4[r5]     // Catch:{ Exception -> 0x00b8 }
            int r5 = r6.f53133j     // Catch:{ Exception -> 0x00b8 }
            int r4 = r4 / r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00b8 }
            int[] r5 = r6.f53132i     // Catch:{ Exception -> 0x00b8 }
            r2 = r5[r2]     // Catch:{ Exception -> 0x00b8 }
            int r5 = r6.f53133j     // Catch:{ Exception -> 0x00b8 }
            int r2 = r2 / r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00b8 }
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x00b8 }
            r0.set(r1, r3)     // Catch:{ Exception -> 0x00b8 }
            com.ss.android.medialib.camera.d r0 = r6.f53117P     // Catch:{ Exception -> 0x00b8 }
            boolean r0 = r0.f53175m     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x0083
            com.ss.android.medialib.camera.d r0 = r6.f53117P     // Catch:{ Exception -> 0x00b8 }
            boolean r0 = r0.f53175m     // Catch:{ Exception -> 0x00b8 }
            boolean r0 = r6.m46940c(r0)     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "Camera2"
            java.lang.String r1 = "Enable video stabilization."
            com.p683ss.android.vesdk.C50792y.m109909a(r0, r1)     // Catch:{ Exception -> 0x00b8 }
        L_0x0083:
            android.graphics.Rect r0 = r6.f53118Q     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x0090
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53126c     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION     // Catch:{ Exception -> 0x00b8 }
            android.graphics.Rect r2 = r6.f53118Q     // Catch:{ Exception -> 0x00b8 }
            r0.set(r1, r2)     // Catch:{ Exception -> 0x00b8 }
        L_0x0090:
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53126c     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest r0 = r0.build()     // Catch:{ Exception -> 0x00b8 }
            r6.f53142s = r0     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CameraCaptureSession r0 = r6.f53125b     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest r1 = r6.f53142s     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = r6.f53141r     // Catch:{ Exception -> 0x00b8 }
            android.os.Handler r3 = r6.f53131h     // Catch:{ Exception -> 0x00b8 }
            r0.setRepeatingRequest(r1, r2, r3)     // Catch:{ Exception -> 0x00b8 }
            r0 = 3
            r6.f53130g = r0     // Catch:{ Exception -> 0x00b8 }
            com.ss.android.medialib.camera.f$a r0 = r6.f53120S     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x00af
            com.ss.android.medialib.camera.f$a r0 = r6.f53120S     // Catch:{ Exception -> 0x00b8 }
            r0.mo39714a()     // Catch:{ Exception -> 0x00b8 }
        L_0x00af:
            java.lang.String r0 = "Camera2"
            java.lang.String r1 = "send capture request..."
            com.p683ss.android.vesdk.C50792y.m109911b(r0, r1)     // Catch:{ Exception -> 0x00b8 }
            monitor-exit(r6)
            return
        L_0x00b8:
            r0 = move-exception
            java.lang.String r1 = "Camera2"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            java.lang.String r3 = "updatePreview error: "
            r2.<init>(r3)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x00da }
            r2.append(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00da }
            com.p683ss.android.vesdk.C50792y.m109914d(r1, r0)     // Catch:{ all -> 0x00da }
            r0 = 4
            r6.f53130g = r0     // Catch:{ all -> 0x00da }
            r6.mo39683p()     // Catch:{ all -> 0x00da }
            monitor-exit(r6)
            return
        L_0x00d8:
            monitor-exit(r6)
            return
        L_0x00da:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19250b.mo39684q():void");
    }

    /* renamed from: a */
    public final void mo39641a(C19269a aVar) {
        this.f53120S = aVar;
    }

    /* renamed from: b */
    public final void mo39653b(SurfaceTexture surfaceTexture) {
        this.f53115N = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo39642a(C19271c cVar) {
        this.f53137n = cVar;
    }

    /* renamed from: a */
    public final void mo39643a(C19272d dVar) {
        this.f53111J = dVar;
    }

    /* renamed from: a */
    public final void mo39644a(C19273e eVar) {
        this.f53110I = eVar;
    }

    /* renamed from: a */
    public final void mo39645a(boolean z) {
        int i;
        if (this.f53126c != null && this.f53125b != null) {
            try {
                Builder builder = this.f53126c;
                Key key = CaptureRequest.FLASH_MODE;
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                builder.set(key, Integer.valueOf(i));
                this.f53125b.setRepeatingRequest(this.f53126c.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final int mo39650b(int i) {
        int i2;
        this.f53106E = this.f53107F;
        if (this.f53106E == 1) {
            i2 = ((360 - ((this.f53147z + i) % 360)) + NormalGiftView.ALPHA_180) % 360;
        } else {
            i2 = ((this.f53147z - i) + 360) % 360;
        }
        this.f53102A = i2;
        StringBuilder sb = new StringBuilder("currentCameraPosition: ");
        sb.append(this.f53106E);
        C50792y.m109909a("Camera2", sb.toString());
        StringBuilder sb2 = new StringBuilder("mCameraRotation: ");
        sb2.append(this.f53102A);
        C50792y.m109909a("Camera2", sb2.toString());
        return i2;
    }

    /* renamed from: c */
    private boolean m46940c(boolean z) {
        if (this.f53122U == null) {
            return false;
        }
        if (!z) {
            this.f53126c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
            this.f53126c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
            return true;
        }
        int[] iArr = (int[]) this.f53122U.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    this.f53126c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(1));
                    this.f53126c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
                    C50792y.m109909a("Camera2", "Enable OIS");
                    return true;
                }
            }
        }
        for (int i2 : (int[]) this.f53122U.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
            if (i2 == 1) {
                this.f53126c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
                this.f53126c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
                C50792y.m109909a("Camera2", "Enable EIS");
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo39637a(float f) {
        float min = Math.min(Math.max(1.0f, f), 100.0f);
        if (this.f53122U != null && this.f53126c != null && this.f53125b != null) {
            Rect rect = (Rect) this.f53122U.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            C50792y.m109911b("Camera2", sb.toString());
            Rect rect2 = new Rect(i, i2, rect.width() - i, rect.height() - i2);
            this.f53118Q = rect2;
            try {
                this.f53126c.set(CaptureRequest.SCALER_CROP_REGION, rect2);
                this.f53125b.setRepeatingRequest(this.f53126c.build(), null, null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo39652b(float f) {
        if (this.f53122U != null && this.f53126c != null && this.f53125b != null) {
            Rect rect = (Rect) this.f53122U.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            C50792y.m109911b("Camera2", sb.toString());
            Rect rect2 = new Rect(i, i2, rect.width() - i, rect.height() - i2);
            this.f53118Q = rect2;
            try {
                this.f53126c.set(CaptureRequest.SCALER_CROP_REGION, rect2);
                this.f53125b.setRepeatingRequest(this.f53126c.build(), null, null);
                if (this.f53110I != null) {
                    this.f53110I.mo39716a(2, f, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo39639a(SurfaceTexture surfaceTexture) {
        boolean z;
        String str = "Camera2";
        StringBuilder sb = new StringBuilder("startPreview... thread id = ");
        sb.append(Thread.currentThread().getId());
        C50792y.m109911b(str, sb.toString());
        boolean z2 = true;
        if (this.f53124a != null) {
            if (surfaceTexture != null) {
                if (this.f53130g == 2 || this.f53130g == 3) {
                    try {
                        m46942w();
                        this.f53115N = surfaceTexture;
                        this.f53126c = this.f53124a.createCaptureRequest(3);
                        Surface surface = null;
                        surfaceTexture.setDefaultBufferSize(this.f53103B, this.f53104C);
                        if (this.f53117P.f53177o == 2) {
                            this.f53116O = ImageReader.newInstance(this.f53103B, this.f53104C, 35, 1);
                            this.f53116O.setOnImageAvailableListener(new OnImageAvailableListener() {
                                public final void onImageAvailable(ImageReader imageReader) {
                                    try {
                                        Image acquireNextImage = imageReader.acquireNextImage();
                                        if (acquireNextImage != null) {
                                            ImageFrame imageFrame = new ImageFrame(new C19306j(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                                            if (C19250b.this.f53137n != null) {
                                                C19250b.this.f53137n.mo39680a(2, imageFrame);
                                            }
                                            acquireNextImage.close();
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }, this.f53131h);
                            if (this.f53116O != null) {
                                surface = this.f53116O.getSurface();
                            }
                        } else {
                            surface = new Surface(surfaceTexture);
                        }
                        if (!(surface == this.f53108G || this.f53108G == null)) {
                            this.f53126c.removeTarget(this.f53108G);
                            this.f53108G.release();
                        }
                        this.f53108G = surface;
                        this.f53109H.add(this.f53108G);
                        this.f53126c.addTarget(this.f53108G);
                        if (this.f53117P.f53170h && (this.f53119R == null || (this.f53119R.getWidth() == this.f53117P.f53171i && this.f53119R.getHeight() == this.f53117P.f53172j))) {
                            m46939a(this.f53117P.f53171i, this.f53117P.f53172j);
                            this.f53109H.add(this.f53114M.getSurface());
                        } else if (this.f53119R != null && this.f53113L) {
                            m46939a(this.f53119R.getWidth(), this.f53119R.getHeight());
                            this.f53109H.add(this.f53114M.getSurface());
                        }
                        C50792y.m109909a("Camera2", "createCaptureSession");
                        this.f53124a.createCaptureSession(this.f53109H, new CameraCaptureSession.StateCallback() {
                            public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                                StringBuilder sb = new StringBuilder("onConfigureFailed: thread_name = ");
                                sb.append(Thread.currentThread().getName());
                                C50792y.m109914d("Camera2", sb.toString());
                                C19250b.this.f53130g = 4;
                                C19250b.this.mo39683p();
                                if (C19250b.this.f53143t != null) {
                                    C19250b.this.f53143t.onConfigureFailed(cameraCaptureSession);
                                }
                            }

                            public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                                StringBuilder sb = new StringBuilder("onConfigured: thread_name = ");
                                sb.append(Thread.currentThread().getName());
                                C50792y.m109911b("Camera2", sb.toString());
                                C19250b.this.f53125b = cameraCaptureSession;
                                C19250b.this.mo39684q();
                                if (C19250b.this.f53143t != null) {
                                    C19250b.this.f53143t.onConfigured(cameraCaptureSession);
                                }
                            }
                        }, this.f53131h);
                        return;
                    } catch (CameraAccessException e) {
                        String str2 = "Camera2";
                        StringBuilder sb2 = new StringBuilder("Start Preview CameraAccessException:");
                        sb2.append(Log.getStackTraceString(e));
                        C50792y.m109914d(str2, sb2.toString());
                        return;
                    } catch (IllegalArgumentException e2) {
                        String str3 = "Camera2";
                        StringBuilder sb3 = new StringBuilder("Start Preview IllegalArgumentException:");
                        sb3.append(Log.getStackTraceString(e2));
                        C50792y.m109914d(str3, sb3.toString());
                        return;
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder("Invalid state: ");
                    sb4.append(this.f53130g);
                    C50792y.m109914d("Camera2", sb4.toString());
                    return;
                }
            }
        }
        String str4 = "Camera2";
        StringBuilder sb5 = new StringBuilder("Invalid param,mCameraDevice:");
        if (this.f53124a == null) {
            z = true;
        } else {
            z = false;
        }
        sb5.append(z);
        sb5.append(",surfaceTexture:");
        if (surfaceTexture != null) {
            z2 = false;
        }
        sb5.append(z2);
        C50792y.m109914d(str4, sb5.toString());
    }

    /* renamed from: a */
    private void m46939a(int i, int i2) {
        Size[] outputSizes = ((StreamConfigurationMap) this.f53122U.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(UnReadVideoExperiment.BROWSE_RECORD_LIST);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new Point(size.getWidth(), size.getHeight()));
        }
        Point a = C19265e.m46990a((List<Point>) arrayList, new Point(this.f53103B, this.f53104C), (float) i, (float) i2);
        this.f53117P.f53176n = a;
        if (a != null) {
            this.f53114M = ImageReader.newInstance(a.x, a.y, 35, 1);
            this.f53114M.setOnImageAvailableListener(new OnImageAvailableListener() {
                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        ImageFrame imageFrame = new ImageFrame(new C19306j(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                        if (C19250b.this.f53135l != null) {
                            C19250b.this.f53135l.mo39715a(imageFrame);
                        }
                        acquireNextImage.close();
                    }
                }
            }, this.f53131h);
        }
    }

    /* renamed from: b */
    public final boolean mo39655b(int i, C19263c cVar) {
        StringBuilder sb = new StringBuilder("changeCamera: thread_name = ");
        sb.append(Thread.currentThread().getName());
        C50792y.m109911b("Camera2", sb.toString());
        StringBuilder sb2 = new StringBuilder("changeCamera cameraPosition: ");
        sb2.append(i);
        C50792y.m109909a("Camera2", sb2.toString());
        if (this.f53130g == 1 || this.f53130g == 2) {
            C50792y.m109913c("Camera2", "Camera is opening or pending, ignore changeCamera operation.");
            return false;
        }
        mo39651b();
        mo39649a(i, cVar);
        C19274g.f53186l = true;
        return true;
    }

    /* renamed from: a */
    public final void mo39638a(int i, int i2, final C19270b bVar) {
        this.f53135l = bVar;
        this.f53119R = new Size(i, i2);
        if (this.f53124a == null || this.f53125b == null || this.f53122U == null) {
            if (bVar != null) {
                bVar.mo39715a(null);
            }
            return;
        }
        try {
            this.f53113L = true;
            if (this.f53117P.f53170h && this.f53117P.f53171i == i && this.f53117P.f53172j == i2) {
                if (this.f53136m == 0 || this.f53136m == 2) {
                    mo39686s();
                } else {
                    mo39687t();
                }
                return;
            }
            this.f53143t = new CameraCaptureSession.StateCallback() {
                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    C19250b.this.f53143t = null;
                    if (bVar != null) {
                        bVar.mo39715a(null);
                    }
                }

                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    C19250b.this.f53143t = null;
                    try {
                        if (C19250b.this.f53136m == 0 || C19250b.this.f53136m == 2) {
                            C19250b.this.mo39686s();
                        } else {
                            C19250b.this.mo39687t();
                        }
                    } catch (Throwable unused) {
                        if (bVar != null) {
                            bVar.mo39715a(null);
                        }
                    }
                }
            };
            mo39639a(this.f53115N);
            this.f53113L = false;
        } catch (Throwable unused) {
            if (bVar != null) {
                bVar.mo39715a(null);
            }
        } finally {
            this.f53113L = false;
        }
    }

    /* renamed from: a */
    private Rect m46938a(int i, int i2, float[] fArr, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Rect rect = (Rect) this.f53122U.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        sb.append(rect.left);
        sb.append(", ");
        sb.append(rect.top);
        sb.append(", ");
        sb.append(rect.right);
        sb.append(", ");
        sb.append(rect.bottom);
        sb.append("]");
        C50792y.m109911b("Camera2", sb.toString());
        Size size = (Size) this.f53122U.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb2 = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb2.append(size.getWidth());
        sb2.append(", ");
        sb2.append(size.getHeight());
        sb2.append("]");
        C50792y.m109909a("onAreaTouchEvent", sb2.toString());
        float f6 = fArr[0];
        float f7 = fArr[1];
        int i8 = this.f53103B;
        int i9 = this.f53104C;
        if (90 == this.f53147z || 270 == this.f53147z) {
            i8 = this.f53104C;
            i9 = this.f53103B;
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
            f10 = ((float) this.f53104C) - f10;
        } else if (270 == i7) {
            f11 = ((float) this.f53103B) - f11;
        } else {
            float f12 = f10;
            f10 = f11;
            f11 = f12;
        }
        Rect rect2 = (Rect) this.f53142s.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            C50792y.m109913c("Camera2", "can't get crop region");
            rect2 = rect;
        }
        int width = rect2.width();
        int height = rect2.height();
        if (this.f53104C * width > this.f53103B * height) {
            float f13 = (((float) height) * 1.0f) / ((float) this.f53104C);
            f8 = (((float) width) - (((float) this.f53103B) * f13)) / 2.0f;
            f5 = f13;
            f4 = 0.0f;
        } else {
            f5 = (((float) width) * 1.0f) / ((float) this.f53103B);
            f4 = (((float) height) - (((float) this.f53104C) * f5)) / 2.0f;
        }
        float f14 = (f11 * f5) + f8 + ((float) rect2.left);
        float f15 = (f10 * f5) + f4 + ((float) rect2.top);
        if (mo39666m() == 1) {
            f15 = ((float) rect2.height()) - f15;
        }
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
        StringBuilder sb3 = new StringBuilder("Rect: [left, top, right, bottom] = [");
        sb3.append(rect3.left);
        sb3.append(", ");
        sb3.append(rect3.top);
        sb3.append(", ");
        sb3.append(rect3.right);
        sb3.append(", ");
        sb3.append(rect3.bottom);
        sb3.append("]");
        C50792y.m109911b("Camera2", sb3.toString());
        return rect3;
    }
}
