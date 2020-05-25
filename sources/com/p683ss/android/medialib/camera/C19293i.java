package com.p683ss.android.medialib.camera;

import android.content.Context;
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
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.medialib.camera.C19268f.C19270b;
import com.p683ss.android.medialib.camera.C19268f.C19271c;
import com.p683ss.android.medialib.camera.C19268f.C19272d;
import com.p683ss.android.medialib.camera.C19268f.C19273e;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.vesdk.C50792y;
import com.p907f.p908a.C13486b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.medialib.camera.i */
public final class C19293i implements C19268f {

    /* renamed from: y */
    private static final Map<String, String> f53282y = new HashMap<String, String>() {
        {
            put("com.ss.android.ugc.trill", "VdRQAXll2qGqBr3q0pv9fxjKUNSUZE5Au4tXeYAjvegHPG8+QL6PB65CdoZjef9mmWbVU0avYTAujNyKeSbN696+CZwbhwMnT28B8LU0XECzBxuUCrSUIK2DSy8KOLKDgbcseRuqLdEO91Wo70115XKAUOMkMaZosdSVnqhHYP4=");
            put("com.ss.android.ttve.app", "acJhRrV9SGJSFhTPJu53AJUEzAIie4adIn1J3yC+QG5FXX3h/GX7gaeDXRlRMoUa80Jv43LwjuMR47MPdPzldZp6PCPxXNW81maIAc0oebAMT6NgTHf5O8wgkbAZFNilvD70Cjd8YbYfDvSJ5O63V4+VHcNJ/LV3p1id21Z9FLU=");
            put("com.zhiliaoapp.musically", "I1nLPCzgp4J6fBHsdd82IBOcMK+AY67rPqYPuw4WfLYtvifBG+ABEO+Wh3N0t5siZ6dA6ZTdSIBxEZSVZlHRyD7VRaPajn/oghXkdYuDkyzzEexN6BDEXHd+B7aC2yb080U3MSzCDya2wAg6QG2IRYl1TIMlET7EhR9lmQetYdc=");
            put("com.ss.android.ugc.aweme", "V0smG6erGIWwu3z5JaAn4ibfK6iq5uW3qRb+zT6rqgpy8HHYw5TeFOMt2k0cNWuSWv4Rxn1gW+nK5oGMpBwf8nYKppzfrtXQsYgsumcg8yNRVpKZ0WSntuSCCkAtFKcnNx/DoEAjXZuqs5Vzg9VbcOmKwsgsz58eJdXiEMUqoZw=");
        }
    };

    /* renamed from: A */
    private CameraManager f53283A;

    /* renamed from: B */
    private Handler f53284B = new Handler(Looper.getMainLooper());

    /* renamed from: C */
    private int f53285C;

    /* renamed from: D */
    private int f53286D;

    /* renamed from: E */
    private int f53287E;

    /* renamed from: F */
    private int f53288F;

    /* renamed from: G */
    private Size[] f53289G;

    /* renamed from: H */
    private int f53290H = -1;

    /* renamed from: I */
    private Surface f53291I;

    /* renamed from: J */
    private C19273e f53292J;

    /* renamed from: K */
    private C19272d f53293K;

    /* renamed from: L */
    private int f53294L = 1;

    /* renamed from: M */
    private boolean f53295M;

    /* renamed from: N */
    private ImageReader f53296N;

    /* renamed from: O */
    private SurfaceTexture f53297O;

    /* renamed from: P */
    private ImageReader f53298P;

    /* renamed from: Q */
    private Size f53299Q;

    /* renamed from: R */
    private boolean f53300R;

    /* renamed from: S */
    private int f53301S;

    /* renamed from: T */
    private StateCallback f53302T = new StateCallback() {
        public final void onDisconnected(CameraDevice cameraDevice) {
            C50792y.m109911b("IESOppoCamera", "StateCallback::onDisconnected...");
            C19293i.this.mo39651b();
        }

        public final void onOpened(CameraDevice cameraDevice) {
            C50792y.m109909a("IESOppoCamera", "StateCallback::onOpened...");
            C19293i.this.f53310g = 2;
            C19293i.this.f53304a = cameraDevice;
            if (C19293i.this.f53307d != null) {
                C19293i.this.f53307d.mo39670a(5);
            } else {
                C50792y.m109914d("IESOppoCamera", "mCameraOpenListener is null!");
            }
            C19293i.this.f53314k = false;
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            C50792y.m109911b("IESOppoCamera", "StateCallback::onError...");
            int i2 = 4;
            C19293i.this.f53310g = 4;
            if (C19293i.this.f53307d != null) {
                C19263c cVar = C19293i.this.f53307d;
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
                cVar.mo39671a(5, i2, "StateCallback::onError");
                C19293i.this.f53307d = null;
            }
            C19293i.this.mo39776p();
        }
    };

    /* renamed from: U */
    private CameraCharacteristics f53303U;

    /* renamed from: a */
    public CameraDevice f53304a;

    /* renamed from: b */
    public CameraCaptureSession f53305b;

    /* renamed from: c */
    public Builder f53306c;

    /* renamed from: d */
    public C19263c f53307d;

    /* renamed from: e */
    public int f53308e;

    /* renamed from: f */
    public volatile boolean f53309f;

    /* renamed from: g */
    public volatile int f53310g;

    /* renamed from: h */
    public Handler f53311h;

    /* renamed from: i */
    int[] f53312i = new int[2];

    /* renamed from: j */
    int f53313j = 1;

    /* renamed from: k */
    public boolean f53314k = true;

    /* renamed from: l */
    C19264d f53315l;

    /* renamed from: m */
    public C19270b f53316m;

    /* renamed from: n */
    public int f53317n;

    /* renamed from: o */
    public C19271c f53318o;

    /* renamed from: p */
    C19269a f53319p;

    /* renamed from: q */
    public int f53320q;

    /* renamed from: r */
    public int f53321r;

    /* renamed from: s */
    public CaptureCallback f53322s = new CaptureCallback() {
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
            C50792y.m109914d("IESOppoCamera", sb.toString());
        }
    };

    /* renamed from: t */
    public CaptureRequest f53323t;

    /* renamed from: u */
    CameraCaptureSession.StateCallback f53324u;

    /* renamed from: x */
    CaptureCallback f53325x = new CaptureCallback() {
        /* renamed from: a */
        private void m47164a(CaptureResult captureResult, boolean z) {
            switch (C19293i.this.f53321r) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        C19293i.this.mo39777q();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            C19293i.this.f53321r = 4;
                            C19293i.this.mo39777q();
                            break;
                        } else {
                            C19293i iVar = C19293i.this;
                            try {
                                iVar.f53306c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
                                iVar.f53321r = 2;
                                iVar.f53305b.capture(iVar.f53306c.build(), iVar.f53325x, iVar.f53311h);
                                break;
                            } catch (CameraAccessException unused) {
                                return;
                            }
                        }
                    } else if (z) {
                        C50792y.m109911b("IESOppoCamera", "No Focus");
                        C19293i.this.mo39777q();
                        return;
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        C19293i.this.mo39777q();
                        C19293i.this.f53321r = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        C19293i.this.f53321r = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        C19293i.this.f53321r = 4;
                        C19293i.this.mo39777q();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m47164a(totalCaptureResult, true);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m47164a(captureResult, false);
        }
    };

    /* renamed from: z */
    private String f53326z;

    /* renamed from: e */
    public final void mo39658e() {
        m47124u();
    }

    /* renamed from: g */
    public final int mo39660g() {
        return this.f53286D;
    }

    /* renamed from: m */
    public final int mo39666m() {
        return this.f53290H;
    }

    /* renamed from: n */
    public final boolean mo39667n() {
        return false;
    }

    /* renamed from: o */
    public final int mo39668o() {
        return 35;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ce A[Catch:{ Throwable -> 0x01ae }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo39649a(final int r11, com.p683ss.android.medialib.camera.C19263c r12) {
        /*
            r10 = this;
            java.lang.String r0 = "IESOppoCamera"
            java.lang.String r1 = "open..."
            com.p683ss.android.vesdk.C50792y.m109911b(r0, r1)
            int r0 = r10.f53310g
            r1 = 4
            if (r0 != r1) goto L_0x000f
            r10.mo39776p()
        L_0x000f:
            r10.f53307d = r12
            r12 = 1
            r0 = 0
            r10.f53310g = r12     // Catch:{ Throwable -> 0x01ae }
            android.hardware.camera2.CameraManager r2 = r10.f53283A     // Catch:{ Throwable -> 0x01ae }
            java.lang.String[] r2 = r2.getCameraIdList()     // Catch:{ Throwable -> 0x01ae }
            if (r11 < 0) goto L_0x01a1
            r3 = 2
            if (r11 <= r3) goto L_0x0022
            goto L_0x01a1
        L_0x0022:
            int r4 = r2.length     // Catch:{ Throwable -> 0x01ae }
            if (r11 < r4) goto L_0x0026
            r11 = 1
        L_0x0026:
            r10.f53290H = r11     // Catch:{ Throwable -> 0x01ae }
            r11 = r2[r11]     // Catch:{ Throwable -> 0x01ae }
            android.hardware.camera2.CameraManager r2 = r10.f53283A     // Catch:{ Throwable -> 0x01ae }
            android.hardware.camera2.CameraCharacteristics r2 = r2.getCameraCharacteristics(r11)     // Catch:{ Throwable -> 0x01ae }
            r10.f53303U = r2     // Catch:{ Throwable -> 0x01ae }
            android.hardware.camera2.CameraCharacteristics r2 = r10.f53303U     // Catch:{ Throwable -> 0x01ae }
            if (r2 != 0) goto L_0x0037
            return r0
        L_0x0037:
            boolean r2 = r10.f53314k     // Catch:{ Throwable -> 0x01ae }
            if (r2 == 0) goto L_0x00f6
            android.hardware.camera2.CameraCharacteristics r2 = r10.f53303U     // Catch:{ Throwable -> 0x01ae }
            int r4 = r10.f53294L     // Catch:{ Throwable -> 0x01ae }
            int r5 = r10.f53308e     // Catch:{ Throwable -> 0x01ae }
            if (r5 == 0) goto L_0x004a
            int r5 = r10.f53308e     // Catch:{ Throwable -> 0x01ae }
            if (r4 < r5) goto L_0x004a
        L_0x0047:
            r2 = 1
            goto L_0x00cc
        L_0x004a:
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ Throwable -> 0x01ae }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ Throwable -> 0x01ae }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Throwable -> 0x01ae }
            int r2 = r2.intValue()     // Catch:{ Throwable -> 0x01ae }
            if (r2 < 0) goto L_0x00b8
            r5 = 3
            if (r2 <= r5) goto L_0x005c
            goto L_0x00b8
        L_0x005c:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x01ae }
            r6 = 22
            if (r5 >= r6) goto L_0x0066
            if (r2 != r3) goto L_0x0066
        L_0x0064:
            r2 = 0
            goto L_0x00cc
        L_0x0066:
            int[] r3 = f53184w     // Catch:{ Throwable -> 0x01ae }
            r2 = r3[r2]     // Catch:{ Throwable -> 0x01ae }
            r10.f53308e = r2     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r2 = "iesve_record_camera_hw_level"
            int r3 = r10.f53308e     // Catch:{ Throwable -> 0x01ae }
            long r5 = (long) r3     // Catch:{ Throwable -> 0x01ae }
            com.p683ss.android.ttve.monitor.C20114g.m49648a(r2, r5)     // Catch:{ Throwable -> 0x01ae }
            int r2 = r10.f53308e     // Catch:{ Throwable -> 0x01ae }
            if (r2 < r4) goto L_0x0098
            java.lang.String r2 = "IESOppoCamera"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r4 = "Camera hardware level supported, deviceLevel = "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x01ae }
            int r4 = r10.f53308e     // Catch:{ Throwable -> 0x01ae }
            r3.append(r4)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r4 = ", require = "
            r3.append(r4)     // Catch:{ Throwable -> 0x01ae }
            int r4 = r10.f53294L     // Catch:{ Throwable -> 0x01ae }
            r3.append(r4)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x01ae }
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r3)     // Catch:{ Throwable -> 0x01ae }
            goto L_0x0047
        L_0x0098:
            java.lang.String r2 = "IESOppoCamera"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r4 = "Camera hardware level not supported, deviceLevel = "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x01ae }
            int r4 = r10.f53308e     // Catch:{ Throwable -> 0x01ae }
            r3.append(r4)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r4 = ", require = "
            r3.append(r4)     // Catch:{ Throwable -> 0x01ae }
            int r4 = r10.f53294L     // Catch:{ Throwable -> 0x01ae }
            r3.append(r4)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x01ae }
            com.p683ss.android.vesdk.C50792y.m109914d(r2, r3)     // Catch:{ Throwable -> 0x01ae }
            goto L_0x0064
        L_0x00b8:
            java.lang.String r3 = "IESOppoCamera"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r5 = "Invalid hardware level = "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x01ae }
            r4.append(r2)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r2 = r4.toString()     // Catch:{ Throwable -> 0x01ae }
            com.p683ss.android.vesdk.C50792y.m109914d(r3, r2)     // Catch:{ Throwable -> 0x01ae }
            goto L_0x0064
        L_0x00cc:
            if (r2 != 0) goto L_0x00f6
            com.ss.android.medialib.camera.c r11 = r10.f53307d     // Catch:{ Throwable -> 0x01ae }
            if (r11 == 0) goto L_0x00f3
            com.ss.android.medialib.camera.c r11 = r10.f53307d     // Catch:{ Throwable -> 0x01ae }
            r12 = 5
            r2 = -4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r4 = "Camera hardware level not supported, deviceLevel = "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x01ae }
            int r4 = r10.f53308e     // Catch:{ Throwable -> 0x01ae }
            r3.append(r4)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r4 = ", require = "
            r3.append(r4)     // Catch:{ Throwable -> 0x01ae }
            int r4 = r10.f53294L     // Catch:{ Throwable -> 0x01ae }
            r3.append(r4)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x01ae }
            r11.mo39671a(r12, r2, r3)     // Catch:{ Throwable -> 0x01ae }
        L_0x00f3:
            r10.f53310g = r0     // Catch:{ Throwable -> 0x01ae }
            return r0
        L_0x00f6:
            android.hardware.camera2.CameraCharacteristics r2 = r10.f53303U     // Catch:{ Throwable -> 0x01ae }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ Throwable -> 0x01ae }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Throwable -> 0x01ae }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Throwable -> 0x01ae }
            int r2 = r2.intValue()     // Catch:{ Throwable -> 0x01ae }
            r10.f53285C = r2     // Catch:{ Throwable -> 0x01ae }
            android.hardware.camera2.CameraCharacteristics r2 = r10.f53303U     // Catch:{ Throwable -> 0x01ae }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Throwable -> 0x01ae }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ Throwable -> 0x01ae }
            android.hardware.camera2.params.StreamConfigurationMap r2 = (android.hardware.camera2.params.StreamConfigurationMap) r2     // Catch:{ Throwable -> 0x01ae }
            java.lang.Class<android.graphics.SurfaceTexture> r3 = android.graphics.SurfaceTexture.class
            android.util.Size[] r3 = r2.getOutputSizes(r3)     // Catch:{ Throwable -> 0x01ae }
            r10.f53289G = r3     // Catch:{ Throwable -> 0x01ae }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x01ae }
            r4.<init>()     // Catch:{ Throwable -> 0x01ae }
            android.util.Size[] r3 = r10.f53289G     // Catch:{ Throwable -> 0x01ae }
            int r5 = r3.length     // Catch:{ Throwable -> 0x01ae }
            r6 = 0
        L_0x0121:
            if (r6 >= r5) goto L_0x0138
            r7 = r3[r6]     // Catch:{ Throwable -> 0x01ae }
            android.graphics.Point r8 = new android.graphics.Point     // Catch:{ Throwable -> 0x01ae }
            int r9 = r7.getWidth()     // Catch:{ Throwable -> 0x01ae }
            int r7 = r7.getHeight()     // Catch:{ Throwable -> 0x01ae }
            r8.<init>(r9, r7)     // Catch:{ Throwable -> 0x01ae }
            r4.add(r8)     // Catch:{ Throwable -> 0x01ae }
            int r6 = r6 + 1
            goto L_0x0121
        L_0x0138:
            com.ss.android.medialib.camera.d r3 = r10.f53315l     // Catch:{ Throwable -> 0x01ae }
            boolean r3 = r3.f53170h     // Catch:{ Throwable -> 0x01ae }
            if (r3 == 0) goto L_0x0177
            r3 = 256(0x100, float:3.59E-43)
            android.util.Size[] r2 = r2.getOutputSizes(r3)     // Catch:{ Throwable -> 0x01ae }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Throwable -> 0x01ae }
            r7.<init>()     // Catch:{ Throwable -> 0x01ae }
            int r3 = r2.length     // Catch:{ Throwable -> 0x01ae }
            r5 = 0
        L_0x014b:
            if (r5 >= r3) goto L_0x0162
            r6 = r2[r5]     // Catch:{ Throwable -> 0x01ae }
            android.graphics.Point r8 = new android.graphics.Point     // Catch:{ Throwable -> 0x01ae }
            int r9 = r6.getWidth()     // Catch:{ Throwable -> 0x01ae }
            int r6 = r6.getHeight()     // Catch:{ Throwable -> 0x01ae }
            r8.<init>(r9, r6)     // Catch:{ Throwable -> 0x01ae }
            r7.add(r8)     // Catch:{ Throwable -> 0x01ae }
            int r5 = r5 + 1
            goto L_0x014b
        L_0x0162:
            com.ss.android.medialib.camera.d r2 = r10.f53315l     // Catch:{ Throwable -> 0x01ae }
            int r5 = r2.f53168f     // Catch:{ Throwable -> 0x01ae }
            com.ss.android.medialib.camera.d r2 = r10.f53315l     // Catch:{ Throwable -> 0x01ae }
            int r6 = r2.f53169g     // Catch:{ Throwable -> 0x01ae }
            com.ss.android.medialib.camera.d r2 = r10.f53315l     // Catch:{ Throwable -> 0x01ae }
            int r8 = r2.f53171i     // Catch:{ Throwable -> 0x01ae }
            com.ss.android.medialib.camera.d r2 = r10.f53315l     // Catch:{ Throwable -> 0x01ae }
            int r9 = r2.f53172j     // Catch:{ Throwable -> 0x01ae }
            android.graphics.Point r2 = com.p683ss.android.medialib.camera.C19265e.m46989a(r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x01ae }
            goto L_0x0183
        L_0x0177:
            com.ss.android.medialib.camera.d r2 = r10.f53315l     // Catch:{ Throwable -> 0x01ae }
            int r2 = r2.f53168f     // Catch:{ Throwable -> 0x01ae }
            com.ss.android.medialib.camera.d r3 = r10.f53315l     // Catch:{ Throwable -> 0x01ae }
            int r3 = r3.f53169g     // Catch:{ Throwable -> 0x01ae }
            android.graphics.Point r2 = com.p683ss.android.medialib.camera.C19265e.m46988a(r4, r2, r3)     // Catch:{ Throwable -> 0x01ae }
        L_0x0183:
            if (r2 == 0) goto L_0x018d
            int r3 = r2.x     // Catch:{ Throwable -> 0x01ae }
            r10.f53287E = r3     // Catch:{ Throwable -> 0x01ae }
            int r2 = r2.y     // Catch:{ Throwable -> 0x01ae }
            r10.f53288F = r2     // Catch:{ Throwable -> 0x01ae }
        L_0x018d:
            r10.m47123t()     // Catch:{ Throwable -> 0x01ae }
            android.hardware.camera2.CameraManager r2 = r10.f53283A     // Catch:{ Throwable -> 0x01ae }
            android.hardware.camera2.CameraDevice$StateCallback r3 = r10.f53302T     // Catch:{ Throwable -> 0x01ae }
            android.os.Handler r4 = r10.f53311h     // Catch:{ Throwable -> 0x01ae }
            r2.openCamera(r11, r3, r4)     // Catch:{ Throwable -> 0x01ae }
            java.lang.String r11 = "iesve_record_camera_type"
            r2 = 2
            com.p683ss.android.ttve.monitor.C20114g.m49648a(r11, r2)     // Catch:{ Throwable -> 0x01ae }
            return r12
        L_0x01a1:
            android.os.Handler r12 = r10.f53284B     // Catch:{ Throwable -> 0x01ae }
            com.ss.android.medialib.camera.i$7 r2 = new com.ss.android.medialib.camera.i$7     // Catch:{ Throwable -> 0x01ae }
            r2.<init>(r11)     // Catch:{ Throwable -> 0x01ae }
            r12.post(r2)     // Catch:{ Throwable -> 0x01ae }
            r10.f53310g = r0     // Catch:{ Throwable -> 0x01ae }
            return r0
        L_0x01ae:
            r11 = move-exception
            r10.f53310g = r1
            r10.mo39776p()
            android.os.Handler r12 = r10.f53284B
            com.ss.android.medialib.camera.i$8 r1 = new com.ss.android.medialib.camera.i$8
            r1.<init>(r11)
            r12.post(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19293i.mo39649a(int, com.ss.android.medialib.camera.c):boolean");
    }

    /* renamed from: a */
    public final void mo39645a(boolean z) {
        if (this.f53306c != null && this.f53305b != null) {
            try {
                this.f53306c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z ? 2 : 0));
                this.f53305b.setRepeatingRequest(this.f53306c.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo39647a(int i) {
        if (this.f53306c == null || this.f53305b == null) {
            return false;
        }
        switch (i) {
            case 0:
                this.f53306c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53306c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                break;
            case 1:
                this.f53306c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(3));
                break;
            case 2:
                this.f53306c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53306c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                break;
            case 3:
                this.f53306c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
                break;
            case 4:
                try {
                    this.f53306c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(4));
                    break;
                } catch (Exception unused) {
                    return false;
                }
            default:
                return false;
        }
        this.f53317n = i;
        this.f53305b.setRepeatingRequest(this.f53306c.build(), this.f53325x, this.f53311h);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0278, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo39639a(android.graphics.SurfaceTexture r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "IESOppoCamera"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            java.lang.String r2 = "startPreview... thread id = "
            r1.<init>(r2)     // Catch:{ all -> 0x0279 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0279 }
            long r2 = r2.getId()     // Catch:{ all -> 0x0279 }
            r1.append(r2)     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0279 }
            com.p683ss.android.vesdk.C50792y.m109911b(r0, r1)     // Catch:{ all -> 0x0279 }
            android.hardware.camera2.CameraDevice r0 = r9.f53304a     // Catch:{ all -> 0x0279 }
            if (r0 == 0) goto L_0x0277
            if (r10 != 0) goto L_0x0024
            goto L_0x0277
        L_0x0024:
            int r0 = r9.f53310g     // Catch:{ all -> 0x0279 }
            r1 = 3
            r2 = 2
            if (r0 == r2) goto L_0x0045
            int r0 = r9.f53310g     // Catch:{ all -> 0x0279 }
            if (r0 == r1) goto L_0x0045
            java.lang.String r10 = "IESOppoCamera"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0279 }
            java.lang.String r1 = "Invalid state: "
            r0.<init>(r1)     // Catch:{ all -> 0x0279 }
            int r1 = r9.f53310g     // Catch:{ all -> 0x0279 }
            r0.append(r1)     // Catch:{ all -> 0x0279 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0279 }
            com.p683ss.android.vesdk.C50792y.m109911b(r10, r0)     // Catch:{ all -> 0x0279 }
            monitor-exit(r9)
            return
        L_0x0045:
            r9.m47124u()     // Catch:{ CameraAccessException -> 0x0275 }
            r9.f53297O = r10     // Catch:{ CameraAccessException -> 0x0275 }
            android.hardware.camera2.CameraDevice r0 = r9.f53304a     // Catch:{ CameraAccessException -> 0x0275 }
            android.hardware.camera2.CaptureRequest$Builder r0 = r0.createCaptureRequest(r1)     // Catch:{ CameraAccessException -> 0x0275 }
            r9.f53306c = r0     // Catch:{ CameraAccessException -> 0x0275 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0275 }
            r0.<init>()     // Catch:{ CameraAccessException -> 0x0275 }
            android.view.Surface r1 = r9.f53291I     // Catch:{ CameraAccessException -> 0x0275 }
            r3 = 0
            if (r1 == 0) goto L_0x006a
            android.hardware.camera2.CaptureRequest$Builder r1 = r9.f53306c     // Catch:{ CameraAccessException -> 0x0275 }
            android.view.Surface r4 = r9.f53291I     // Catch:{ CameraAccessException -> 0x0275 }
            r1.removeTarget(r4)     // Catch:{ CameraAccessException -> 0x0275 }
            android.view.Surface r1 = r9.f53291I     // Catch:{ CameraAccessException -> 0x0275 }
            r1.release()     // Catch:{ CameraAccessException -> 0x0275 }
            r9.f53291I = r3     // Catch:{ CameraAccessException -> 0x0275 }
        L_0x006a:
            int r1 = r9.f53287E     // Catch:{ CameraAccessException -> 0x0275 }
            int r4 = r9.f53288F     // Catch:{ CameraAccessException -> 0x0275 }
            r10.setDefaultBufferSize(r1, r4)     // Catch:{ CameraAccessException -> 0x0275 }
            com.ss.android.medialib.camera.d r1 = r9.f53315l     // Catch:{ CameraAccessException -> 0x0275 }
            int r1 = r1.f53177o     // Catch:{ CameraAccessException -> 0x0275 }
            r4 = 1
            if (r1 != r2) goto L_0x009d
            int r10 = r9.f53287E     // Catch:{ CameraAccessException -> 0x0275 }
            int r1 = r9.f53288F     // Catch:{ CameraAccessException -> 0x0275 }
            r2 = 35
            android.media.ImageReader r10 = android.media.ImageReader.newInstance(r10, r1, r2, r4)     // Catch:{ CameraAccessException -> 0x0275 }
            r9.f53298P = r10     // Catch:{ CameraAccessException -> 0x0275 }
            android.media.ImageReader r10 = r9.f53298P     // Catch:{ CameraAccessException -> 0x0275 }
            com.ss.android.medialib.camera.i$12 r1 = new com.ss.android.medialib.camera.i$12     // Catch:{ CameraAccessException -> 0x0275 }
            r1.<init>()     // Catch:{ CameraAccessException -> 0x0275 }
            android.os.Handler r2 = r9.f53311h     // Catch:{ CameraAccessException -> 0x0275 }
            r10.setOnImageAvailableListener(r1, r2)     // Catch:{ CameraAccessException -> 0x0275 }
            android.media.ImageReader r10 = r9.f53298P     // Catch:{ CameraAccessException -> 0x0275 }
            if (r10 == 0) goto L_0x00a4
            android.media.ImageReader r10 = r9.f53298P     // Catch:{ CameraAccessException -> 0x0275 }
            android.view.Surface r10 = r10.getSurface()     // Catch:{ CameraAccessException -> 0x0275 }
            r9.f53291I = r10     // Catch:{ CameraAccessException -> 0x0275 }
            goto L_0x00a4
        L_0x009d:
            android.view.Surface r1 = new android.view.Surface     // Catch:{ CameraAccessException -> 0x0275 }
            r1.<init>(r10)     // Catch:{ CameraAccessException -> 0x0275 }
            r9.f53291I = r1     // Catch:{ CameraAccessException -> 0x0275 }
        L_0x00a4:
            android.view.Surface r10 = r9.f53291I     // Catch:{ CameraAccessException -> 0x0275 }
            r0.add(r10)     // Catch:{ CameraAccessException -> 0x0275 }
            android.hardware.camera2.CaptureRequest$Builder r10 = r9.f53306c     // Catch:{ CameraAccessException -> 0x0275 }
            android.view.Surface r1 = r9.f53291I     // Catch:{ CameraAccessException -> 0x0275 }
            r10.addTarget(r1)     // Catch:{ CameraAccessException -> 0x0275 }
            com.ss.android.medialib.camera.d r10 = r9.f53315l     // Catch:{ CameraAccessException -> 0x0275 }
            boolean r10 = r10.f53170h     // Catch:{ CameraAccessException -> 0x0275 }
            if (r10 == 0) goto L_0x00e7
            android.util.Size r10 = r9.f53299Q     // Catch:{ CameraAccessException -> 0x0275 }
            if (r10 == 0) goto L_0x00d2
            android.util.Size r10 = r9.f53299Q     // Catch:{ CameraAccessException -> 0x0275 }
            int r10 = r10.getWidth()     // Catch:{ CameraAccessException -> 0x0275 }
            com.ss.android.medialib.camera.d r1 = r9.f53315l     // Catch:{ CameraAccessException -> 0x0275 }
            int r1 = r1.f53171i     // Catch:{ CameraAccessException -> 0x0275 }
            if (r10 != r1) goto L_0x00e7
            android.util.Size r10 = r9.f53299Q     // Catch:{ CameraAccessException -> 0x0275 }
            int r10 = r10.getHeight()     // Catch:{ CameraAccessException -> 0x0275 }
            com.ss.android.medialib.camera.d r1 = r9.f53315l     // Catch:{ CameraAccessException -> 0x0275 }
            int r1 = r1.f53172j     // Catch:{ CameraAccessException -> 0x0275 }
            if (r10 != r1) goto L_0x00e7
        L_0x00d2:
            com.ss.android.medialib.camera.d r10 = r9.f53315l     // Catch:{ CameraAccessException -> 0x0275 }
            int r10 = r10.f53171i     // Catch:{ CameraAccessException -> 0x0275 }
            com.ss.android.medialib.camera.d r1 = r9.f53315l     // Catch:{ CameraAccessException -> 0x0275 }
            int r1 = r1.f53172j     // Catch:{ CameraAccessException -> 0x0275 }
            r9.m47121a(r10, r1)     // Catch:{ CameraAccessException -> 0x0275 }
            android.media.ImageReader r10 = r9.f53296N     // Catch:{ CameraAccessException -> 0x0275 }
            android.view.Surface r10 = r10.getSurface()     // Catch:{ CameraAccessException -> 0x0275 }
            r0.add(r10)     // Catch:{ CameraAccessException -> 0x0275 }
            goto L_0x0107
        L_0x00e7:
            android.util.Size r10 = r9.f53299Q     // Catch:{ CameraAccessException -> 0x0275 }
            if (r10 == 0) goto L_0x0107
            boolean r10 = r9.f53295M     // Catch:{ CameraAccessException -> 0x0275 }
            if (r10 == 0) goto L_0x0107
            android.util.Size r10 = r9.f53299Q     // Catch:{ CameraAccessException -> 0x0275 }
            int r10 = r10.getWidth()     // Catch:{ CameraAccessException -> 0x0275 }
            android.util.Size r1 = r9.f53299Q     // Catch:{ CameraAccessException -> 0x0275 }
            int r1 = r1.getHeight()     // Catch:{ CameraAccessException -> 0x0275 }
            r9.m47121a(r10, r1)     // Catch:{ CameraAccessException -> 0x0275 }
            android.media.ImageReader r10 = r9.f53296N     // Catch:{ CameraAccessException -> 0x0275 }
            android.view.Surface r10 = r10.getSurface()     // Catch:{ CameraAccessException -> 0x0275 }
            r0.add(r10)     // Catch:{ CameraAccessException -> 0x0275 }
        L_0x0107:
            int r10 = r0.size()     // Catch:{ CameraAccessException -> 0x0275 }
            r9.f53301S = r10     // Catch:{ CameraAccessException -> 0x0275 }
            java.lang.String r10 = "IESOppoCamera"
            java.lang.String r1 = "updateAntiShake"
            com.p683ss.android.vesdk.C50792y.m109911b(r10, r1)     // Catch:{ CameraAccessException -> 0x0275 }
            boolean r10 = r9.f53300R     // Catch:{ CameraAccessException -> 0x0275 }
            if (r10 == 0) goto L_0x0267
            android.util.Size r10 = new android.util.Size     // Catch:{ CameraAccessException -> 0x0275 }
            int r1 = r9.f53287E     // Catch:{ CameraAccessException -> 0x0275 }
            int r2 = r9.f53288F     // Catch:{ CameraAccessException -> 0x0275 }
            r10.<init>(r1, r2)     // Catch:{ CameraAccessException -> 0x0275 }
            int r1 = r9.f53301S     // Catch:{ CameraAccessException -> 0x0275 }
            android.hardware.camera2.CameraDevice r2 = r9.f53304a     // Catch:{ CameraAccessException -> 0x0275 }
            java.lang.String r2 = r2.getId()     // Catch:{ CameraAccessException -> 0x0275 }
            com.f.a.b r5 = com.p907f.p908a.C13486b.m27243a()     // Catch:{ CameraAccessException -> 0x0275 }
            java.util.Map<java.lang.String, java.lang.String> r6 = f53282y     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r7 = r9.f53326z     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.Object r6 = r6.get(r7)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r6 = r5.mo25276b(r6)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            if (r6 == 0) goto L_0x0241
            boolean r6 = r6.isEmpty()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            if (r6 != 0) goto L_0x0241
            java.lang.String r6 = r5.mo25275b()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            if (r6 == 0) goto L_0x0239
            boolean r6 = r6.contains(r2)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            if (r6 == 0) goto L_0x0239
            java.lang.String r6 = r5.mo25277c(r2)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            if (r6 == 0) goto L_0x0220
            boolean r7 = r6.isEmpty()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            if (r7 != 0) goto L_0x0220
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r7.<init>(r6)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r8 = "EIS"
            int r8 = r7.optInt(r8)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            if (r4 != r8) goto L_0x0173
            java.lang.String r3 = "EIS"
            r2.put(r3, r4)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            goto L_0x0180
        L_0x0173:
            java.lang.String r8 = "OIS-Movie"
            int r7 = r7.optInt(r8)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            if (r4 != r7) goto L_0x0180
            java.lang.String r3 = "OIS-Movie"
            r2.put(r3, r4)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
        L_0x0180:
            r4 = 0
            if (r6 == 0) goto L_0x01d4
            if (r3 == 0) goto L_0x01d4
            boolean r7 = r3.isEmpty()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            if (r7 != 0) goto L_0x01d4
            android.util.Size r4 = new android.util.Size     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            int r7 = r10.getWidth()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            int r8 = r10.getHeight()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r4.<init>(r7, r8)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            boolean r4 = com.p907f.p908a.C13486b.m27246a(r6, r3, r4)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            boolean r1 = com.p907f.p908a.C13486b.m27245a(r6, r3, r1)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r3 = "IESOppoCamera"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r7 = "w:"
            r6.<init>(r7)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            int r7 = r10.getWidth()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r6.append(r7)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r7 = " h:"
            r6.append(r7)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            int r10 = r10.getHeight()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r6.append(r10)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r10 = "sizeCheck:"
            r6.append(r10)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r6.append(r4)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r10 = " countCheck:"
            r6.append(r10)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r6.append(r1)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r10 = r6.toString()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            com.p683ss.android.vesdk.C50792y.m109911b(r3, r10)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r4 = r4 & r1
        L_0x01d4:
            int r10 = r2.length()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            if (r10 <= 0) goto L_0x0204
            if (r4 == 0) goto L_0x0204
            java.lang.String r10 = r2.toString()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            boolean r10 = r5.mo25274a(r10)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r1 = "IESOppoCamera"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r4 = "omedia set capability: "
            r3.<init>(r4)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r2 = r2.toString()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r3.append(r2)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r2 = " setFeatureSuccess:"
            r3.append(r2)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r3.append(r10)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r10 = r3.toString()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            com.p683ss.android.vesdk.C50792y.m109911b(r1, r10)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            goto L_0x0267
        L_0x0204:
            java.lang.String r10 = "IESOppoCamera"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r3 = "omedia update parm str is null "
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r1.append(r4)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            com.p683ss.android.vesdk.C50792y.m109913c(r10, r1)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            goto L_0x0267
        L_0x0220:
            java.lang.String r10 = "IESOppoCamera"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r3 = "omedia camera:"
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r2 = "capability is null"
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            com.p683ss.android.vesdk.C50792y.m109913c(r10, r1)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            goto L_0x0267
        L_0x0239:
            java.lang.String r10 = "IESOppoCamera"
            java.lang.String r1 = "omedia camList is null"
            com.p683ss.android.vesdk.C50792y.m109913c(r10, r1)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            goto L_0x0267
        L_0x0241:
            java.lang.String r10 = "IESOppoCamera"
            byte r1 = com.p683ss.android.medialib.p1180b.C19226c.f53016b     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            byte r2 = com.p683ss.android.medialib.p1180b.C19226c.f53017c     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0267
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            java.lang.String r2 = com.p683ss.android.medialib.p1180b.C19226c.f53015a     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            r1.append(r10)     // Catch:{ RuntimeException -> 0x0260, JSONException -> 0x0258 }
            goto L_0x0267
        L_0x0258:
            java.lang.String r10 = "IESOppoCamera"
            java.lang.String r1 = "omedia got a json Exception"
            com.p683ss.android.vesdk.C50792y.m109913c(r10, r1)     // Catch:{ CameraAccessException -> 0x0275 }
            goto L_0x0267
        L_0x0260:
            java.lang.String r10 = "IESOppoCamera"
            java.lang.String r1 = "omedia got a RuntimeException"
            com.p683ss.android.vesdk.C50792y.m109914d(r10, r1)     // Catch:{ CameraAccessException -> 0x0275 }
        L_0x0267:
            android.hardware.camera2.CameraDevice r10 = r9.f53304a     // Catch:{ CameraAccessException -> 0x0275 }
            com.ss.android.medialib.camera.i$9 r1 = new com.ss.android.medialib.camera.i$9     // Catch:{ CameraAccessException -> 0x0275 }
            r1.<init>()     // Catch:{ CameraAccessException -> 0x0275 }
            android.os.Handler r2 = r9.f53311h     // Catch:{ CameraAccessException -> 0x0275 }
            r10.createCaptureSession(r0, r1, r2)     // Catch:{ CameraAccessException -> 0x0275 }
            monitor-exit(r9)
            return
        L_0x0275:
            monitor-exit(r9)
            return
        L_0x0277:
            monitor-exit(r9)
            return
        L_0x0279:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19293i.mo39639a(android.graphics.SurfaceTexture):void");
    }

    /* renamed from: a */
    public final boolean mo39646a() {
        try {
            return ((Boolean) this.f53283A.getCameraCharacteristics("0").get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } catch (CameraAccessException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo39648a(int i, int i2, float f, float[] fArr, int i3) {
        C50792y.m109911b("IESOppoCamera", "setFocusAreas...");
        if (this.f53310g != 3) {
            StringBuilder sb = new StringBuilder("Ignore setFocusAreas operation, invalid state = ");
            sb.append(this.f53310g);
            C50792y.m109911b("IESOppoCamera", sb.toString());
            return false;
        } else if (this.f53306c == null || this.f53304a == null || this.f53305b == null) {
            C50792y.m109914d("IESOppoCamera", "Set focus failed, you must open camera first.");
            return false;
        } else if (this.f53309f) {
            C50792y.m109913c("IESOppoCamera", "Manual focus already engaged");
            return true;
        } else if (this.f53321r != 0) {
            C50792y.m109913c("IESOppoCamera", "capturing now");
            return false;
        } else {
            int i4 = i;
            int i5 = i2;
            float[] fArr2 = fArr;
            int i6 = i3;
            Rect a = m47120a(i4, i5, fArr2, i6, 0);
            Rect a2 = m47120a(i4, i5, fArr2, i6, 1);
            C1929510 r10 = new CaptureCallback() {
                public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                    super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    StringBuilder sb = new StringBuilder("Manual AF failure: ");
                    sb.append(captureFailure);
                    C50792y.m109914d("IESOppoCamera", sb.toString());
                    C19293i.this.f53309f = false;
                }

                /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
                /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession r9, android.hardware.camera2.CaptureRequest r10, android.hardware.camera2.TotalCaptureResult r11) {
                    /*
                        r8 = this;
                        if (r10 == 0) goto L_0x0123
                        java.lang.Object r9 = r10.getTag()
                        java.lang.String r10 = "FOCUS_TAG"
                        if (r9 == r10) goto L_0x000c
                        goto L_0x0123
                    L_0x000c:
                        android.hardware.camera2.CaptureResult$Key r9 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                        java.lang.Object r9 = r11.get(r9)
                        java.lang.Integer r9 = (java.lang.Integer) r9
                        android.hardware.camera2.CaptureResult$Key r10 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
                        java.lang.Object r10 = r11.get(r10)
                        java.lang.Integer r10 = (java.lang.Integer) r10
                        r11 = 5
                        r0 = 4
                        r1 = 2
                        r2 = 1
                        r3 = 0
                        if (r9 == 0) goto L_0x0057
                        java.lang.String r4 = "IESOppoCamera"
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
                        if (r1 == r4) goto L_0x0055
                        r4 = 6
                        int r5 = r9.intValue()
                        if (r4 == r5) goto L_0x0055
                        int r9 = r9.intValue()
                        if (r9 != 0) goto L_0x005e
                    L_0x0055:
                        r9 = 1
                        goto L_0x005f
                    L_0x0057:
                        java.lang.String r9 = "IESOppoCamera"
                        java.lang.String r4 = "afState is null"
                        com.p683ss.android.vesdk.C50792y.m109913c(r9, r4)
                    L_0x005e:
                        r9 = 0
                    L_0x005f:
                        r4 = 3
                        if (r10 == 0) goto L_0x008c
                        int r5 = r10.intValue()
                        if (r4 == r5) goto L_0x0077
                        int r5 = r10.intValue()
                        if (r1 == r5) goto L_0x0077
                        int r5 = r10.intValue()
                        if (r0 != r5) goto L_0x0075
                        goto L_0x0077
                    L_0x0075:
                        r0 = 0
                        goto L_0x0078
                    L_0x0077:
                        r0 = 1
                    L_0x0078:
                        java.lang.String r5 = "IESOppoCamera"
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        java.lang.String r7 = "aeState = "
                        r6.<init>(r7)
                        r6.append(r10)
                        java.lang.String r10 = r6.toString()
                        com.p683ss.android.vesdk.C50792y.m109911b(r5, r10)
                        goto L_0x0094
                    L_0x008c:
                        java.lang.String r10 = "IESOppoCamera"
                        java.lang.String r0 = "aeState is null"
                        com.p683ss.android.vesdk.C50792y.m109913c(r10, r0)
                        r0 = 0
                    L_0x0094:
                        com.ss.android.medialib.camera.i r10 = com.p683ss.android.medialib.camera.C19293i.this
                        android.hardware.camera2.CaptureRequest$Builder r10 = r10.f53306c
                        if (r10 == 0) goto L_0x0122
                        com.ss.android.medialib.camera.i r10 = com.p683ss.android.medialib.camera.C19293i.this
                        int r5 = r10.f53320q
                        int r5 = r5 + r2
                        r10.f53320q = r5
                        com.ss.android.medialib.camera.i r10 = com.p683ss.android.medialib.camera.C19293i.this
                        int r10 = r10.f53320q
                        if (r10 >= r11) goto L_0x00c9
                        if (r9 == 0) goto L_0x00ac
                        if (r0 == 0) goto L_0x00ac
                        goto L_0x00c9
                    L_0x00ac:
                        java.lang.String r9 = "IESOppoCamera"
                        java.lang.StringBuilder r10 = new java.lang.StringBuilder
                        java.lang.String r11 = "Focus not finished, do "
                        r10.<init>(r11)
                        com.ss.android.medialib.camera.i r11 = com.p683ss.android.medialib.camera.C19293i.this
                        int r11 = r11.f53320q
                        r10.append(r11)
                        java.lang.String r11 = " capture."
                        r10.append(r11)
                        java.lang.String r10 = r10.toString()
                        com.p683ss.android.vesdk.C50792y.m109909a(r9, r10)
                        goto L_0x0122
                    L_0x00c9:
                        com.ss.android.medialib.camera.i r9 = com.p683ss.android.medialib.camera.C19293i.this
                        r9.f53309f = r3
                        com.ss.android.medialib.camera.i r9 = com.p683ss.android.medialib.camera.C19293i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest$Builder r9 = r9.f53306c     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER     // Catch:{ CameraAccessException -> 0x0121 }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch:{ CameraAccessException -> 0x0121 }
                        r9.set(r10, r11)     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r9 = com.p683ss.android.medialib.camera.C19293i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest$Builder r9 = r9.f53306c     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE     // Catch:{ CameraAccessException -> 0x0121 }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ CameraAccessException -> 0x0121 }
                        r9.set(r10, r11)     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r9 = com.p683ss.android.medialib.camera.C19293i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r10 = com.p683ss.android.medialib.camera.C19293i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest$Builder r10 = r10.f53306c     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest r10 = r10.build()     // Catch:{ CameraAccessException -> 0x0121 }
                        r9.f53323t = r10     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r9 = com.p683ss.android.medialib.camera.C19293i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CameraCaptureSession r9 = r9.f53305b     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r10 = com.p683ss.android.medialib.camera.C19293i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest r10 = r10.f53323t     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r11 = com.p683ss.android.medialib.camera.C19293i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CameraCaptureSession$CaptureCallback r11 = r11.f53322s     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r0 = com.p683ss.android.medialib.camera.C19293i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.os.Handler r0 = r0.f53311h     // Catch:{ CameraAccessException -> 0x0121 }
                        r9.setRepeatingRequest(r10, r11, r0)     // Catch:{ CameraAccessException -> 0x0121 }
                        java.lang.String r9 = "IESOppoCamera"
                        java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x0121 }
                        java.lang.String r11 = "Focus done, try count = "
                        r10.<init>(r11)     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r11 = com.p683ss.android.medialib.camera.C19293i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        int r11 = r11.f53320q     // Catch:{ CameraAccessException -> 0x0121 }
                        r10.append(r11)     // Catch:{ CameraAccessException -> 0x0121 }
                        java.lang.String r10 = r10.toString()     // Catch:{ CameraAccessException -> 0x0121 }
                        com.p683ss.android.vesdk.C50792y.m109911b(r9, r10)     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r9 = com.p683ss.android.medialib.camera.C19293i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        r9.f53320q = r3     // Catch:{ CameraAccessException -> 0x0121 }
                    L_0x0121:
                        return
                    L_0x0122:
                        return
                    L_0x0123:
                        java.lang.String r9 = "IESOppoCamera"
                        java.lang.String r10 = "Not focus request!"
                        com.p683ss.android.vesdk.C50792y.m109913c(r9, r10)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19293i.C1929510.onCaptureCompleted(android.hardware.camera2.CameraCaptureSession, android.hardware.camera2.CaptureRequest, android.hardware.camera2.TotalCaptureResult):void");
                }
            };
            try {
                this.f53305b.stopRepeating();
                if (m47126w()) {
                    if (VERSION.SDK_INT >= 23) {
                        this.f53306c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    }
                    this.f53306c.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a2, 999)});
                }
                if (!m47125v()) {
                    if (m47126w()) {
                        this.f53323t = this.f53306c.build();
                        this.f53305b.setRepeatingRequest(this.f53323t, r10, this.f53311h);
                    } else {
                        C50792y.m109913c("IESOppoCamera", "do not support MeteringAreaAE!");
                    }
                    C50792y.m109913c("IESOppoCamera", "do not support MeteringAreaAF!");
                    return false;
                }
                this.f53306c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
                this.f53306c.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a, 999)});
                this.f53306c.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.f53306c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
                this.f53306c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                this.f53306c.setTag("FOCUS_TAG");
                if (VERSION.SDK_INT >= 23) {
                    this.f53306c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
                }
                this.f53323t = this.f53306c.build();
                this.f53305b.setRepeatingRequest(this.f53323t, r10, this.f53311h);
                return true;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("setRepeatingRequest failed, ");
                sb2.append(e.getMessage());
                C50792y.m109914d("IESOppoCamera", sb2.toString());
                this.f53310g = 4;
                mo39776p();
                return false;
            }
        }
    }

    /* renamed from: f */
    public final void mo39659f() {
        mo39639a(this.f53297O);
    }

    /* renamed from: j */
    public final boolean mo39663j() {
        if (this.f53304a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo39656c() {
        this.f53310g = 0;
        mo39776p();
        this.f53316m = null;
    }

    /* renamed from: h */
    public final int[] mo39661h() {
        return new int[]{this.f53287E, this.f53288F};
    }

    /* renamed from: k */
    public final int[] mo39664k() {
        return new int[]{this.f53287E, this.f53288F};
    }

    /* renamed from: b */
    public final void mo39651b() {
        C50792y.m109911b("IESOppoCamera", "close...");
        if (this.f53310g == 1) {
            C50792y.m109911b("IESOppoCamera", "Camera is opening or pending, ignore close operation.");
            return;
        }
        this.f53310g = 0;
        mo39776p();
        this.f53316m = null;
    }

    /* renamed from: d */
    public final void mo39657d() {
        if (this.f53315l.f53177o == 1) {
            mo39639a(this.f53297O);
        } else {
            mo39659f();
        }
    }

    /* renamed from: r */
    public final void mo39778r() {
        try {
            this.f53306c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            this.f53321r = 1;
            this.f53305b.capture(this.f53306c.build(), this.f53325x, this.f53311h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: u */
    private void m47124u() {
        if (this.f53305b != null) {
            this.f53305b.close();
            this.f53305b = null;
        }
        if (this.f53296N != null) {
            this.f53296N.close();
            this.f53296N = null;
        }
        if (this.f53298P != null) {
            this.f53298P.close();
            this.f53298P = null;
        }
    }

    /* renamed from: v */
    private boolean m47125v() {
        if (this.f53303U == null) {
            try {
                if (((Integer) this.f53283A.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53303U.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    private boolean m47126w() {
        if (this.f53303U == null) {
            try {
                if (((Integer) this.f53283A.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53303U.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final List<int[]> mo39665l() {
        Size[] sizeArr;
        ArrayList arrayList = new ArrayList();
        if (this.f53289G == null) {
            return arrayList;
        }
        for (Size size : this.f53289G) {
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
    public final synchronized void mo39776p() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.m47124u()     // Catch:{ Throwable -> 0x001e }
            android.view.Surface r1 = r2.f53291I     // Catch:{ Throwable -> 0x001e }
            if (r1 == 0) goto L_0x0010
            android.view.Surface r1 = r2.f53291I     // Catch:{ Throwable -> 0x001e }
            r1.release()     // Catch:{ Throwable -> 0x001e }
            r2.f53291I = r0     // Catch:{ Throwable -> 0x001e }
        L_0x0010:
            android.hardware.camera2.CameraDevice r1 = r2.f53304a     // Catch:{ Throwable -> 0x001e }
            if (r1 == 0) goto L_0x001e
            android.hardware.camera2.CameraDevice r1 = r2.f53304a     // Catch:{ Throwable -> 0x001e }
            r1.close()     // Catch:{ Throwable -> 0x001e }
            r2.f53304a = r0     // Catch:{ Throwable -> 0x001e }
            goto L_0x001e
        L_0x001c:
            r0 = move-exception
            goto L_0x0031
        L_0x001e:
            r2.f53307d = r0     // Catch:{ all -> 0x001c }
            r1 = 0
            r2.f53310g = r1     // Catch:{ all -> 0x001c }
            r2.f53304a = r0     // Catch:{ all -> 0x001c }
            r2.f53306c = r0     // Catch:{ all -> 0x001c }
            r2.f53305b = r0     // Catch:{ all -> 0x001c }
            r2.f53303U = r0     // Catch:{ all -> 0x001c }
            r2.f53323t = r0     // Catch:{ all -> 0x001c }
            r2.f53317n = r1     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x0031:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19293i.mo39776p():void");
    }

    /* renamed from: q */
    public final void mo39777q() {
        try {
            Builder createCaptureRequest = this.f53304a.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.f53296N.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
            this.f53305b.stopRepeating();
            this.f53305b.capture(createCaptureRequest.build(), new CaptureCallback() {
                public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    C19293i.this.mo39779s();
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    if (C19293i.this.f53316m != null) {
                        C19293i.this.f53316m.mo39715a(null);
                    }
                    C19293i.this.mo39779s();
                }
            }, this.f53311h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: i */
    public final float mo39662i() {
        float f;
        boolean z;
        if (this.f53303U == null) {
            f = -1.0f;
        } else {
            f = ((Float) this.f53303U.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f2 = f / 2.0f;
        if (this.f53292J != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f2)));
            C19273e eVar = this.f53292J;
            if (f2 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            eVar.mo39717a(5, z, false, 99.0f, arrayList);
        }
        return 99.0f;
    }

    /* renamed from: s */
    public final void mo39779s() {
        try {
            if (!(this.f53306c == null || this.f53305b == null)) {
                if (this.f53321r != 0) {
                    this.f53306c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                    this.f53306c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    this.f53305b.capture(this.f53306c.build(), this.f53325x, this.f53311h);
                    this.f53321r = 0;
                    this.f53305b.setRepeatingRequest(this.f53306c.build(), this.f53325x, this.f53311h);
                }
            }
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: t */
    private void m47123t() {
        if (this.f53303U != null) {
            Range[] rangeArr = (Range[]) this.f53303U.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr != null) {
                int i = 1000;
                if (rangeArr.length <= 0 || ((Integer) rangeArr[0].getUpper()).intValue() >= 1000) {
                    i = 1;
                }
                this.f53313j = i;
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range range : rangeArr) {
                    int[] iArr = {((Integer) range.getLower()).intValue() * this.f53313j, ((Integer) range.getUpper()).intValue() * this.f53313j};
                    arrayList.add(iArr);
                    StringBuilder sb = new StringBuilder("Fps Range: [");
                    sb.append(iArr[0]);
                    sb.append(", ");
                    sb.append(iArr[1]);
                    sb.append("]");
                    C50792y.m109911b("IESOppoCamera", sb.toString());
                }
                this.f53312i = C19265e.m46991a(new int[]{this.f53315l.f53166d * this.f53313j, this.f53315l.f53167e * this.f53313j}, arrayList);
                StringBuilder sb2 = new StringBuilder("Set Fps Range: [");
                sb2.append(this.f53312i[0]);
                sb2.append(", ");
                sb2.append(this.f53312i[1]);
                sb2.append("]");
                C50792y.m109911b("IESOppoCamera", sb2.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo39641a(C19269a aVar) {
        this.f53319p = aVar;
    }

    /* renamed from: b */
    public final void mo39653b(SurfaceTexture surfaceTexture) {
        this.f53297O = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo39642a(C19271c cVar) {
        this.f53318o = cVar;
    }

    /* renamed from: b */
    public final void mo39654b(boolean z) {
        this.f53300R = z;
    }

    /* renamed from: a */
    public final void mo39643a(C19272d dVar) {
        this.f53293K = dVar;
    }

    /* renamed from: a */
    public final void mo39644a(C19273e eVar) {
        this.f53292J = eVar;
    }

    /* renamed from: a */
    public final void mo39640a(C19264d dVar) {
        if (dVar == null || !dVar.mo39711a()) {
            C50792y.m109914d("IESOppoCamera", "Invalid CameraParams");
            return;
        }
        this.f53311h = new Handler();
        this.f53294L = dVar.f53178p;
        if (this.f53283A == null) {
            this.f53283A = (CameraManager) dVar.f53164b.getSystemService("camera");
        }
        this.f53315l = dVar;
        this.f53326z = dVar.f53164b.getPackageName();
    }

    /* renamed from: b */
    public final int mo39650b(int i) {
        int i2;
        if (this.f53290H == 1) {
            i2 = ((360 - ((this.f53285C + i) % 360)) + NormalGiftView.ALPHA_180) % 360;
        } else {
            i2 = ((this.f53285C - i) + 360) % 360;
        }
        if (this.f53315l.f53177o == 2) {
            i2 = (360 - i2) % 360;
        }
        this.f53286D = i2;
        StringBuilder sb = new StringBuilder("currentCameraPosition: ");
        sb.append(this.f53290H);
        C50792y.m109909a("IESOppoCamera", sb.toString());
        StringBuilder sb2 = new StringBuilder("mCameraRotation: ");
        sb2.append(this.f53286D);
        C50792y.m109909a("IESOppoCamera", sb2.toString());
        return i2;
    }

    /* renamed from: b */
    public final void mo39652b(float f) {
        if (this.f53303U != null && this.f53306c != null && this.f53305b != null) {
            Rect rect = (Rect) this.f53303U.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            try {
                this.f53306c.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i, i2, rect.width() - i, rect.height() - i2));
                this.f53305b.setRepeatingRequest(this.f53306c.build(), null, null);
                if (this.f53292J != null) {
                    this.f53292J.mo39716a(5, f, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    public final boolean mo39775c(boolean z) {
        if (!z) {
            this.f53306c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
            this.f53306c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
            return true;
        }
        int[] iArr = (int[]) this.f53303U.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    this.f53306c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(1));
                    this.f53306c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
                    C50792y.m109909a("IESOppoCamera", "Enable OIS");
                    return true;
                }
            }
        }
        for (int i2 : (int[]) this.f53303U.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
            if (i2 == 1) {
                this.f53306c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
                this.f53306c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
                C50792y.m109909a("IESOppoCamera", "Enable EIS");
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo39637a(float f) {
        float min = Math.min(Math.max(1.0f, f), 100.0f);
        if (this.f53303U != null && this.f53306c != null && this.f53305b != null) {
            Rect rect = (Rect) this.f53303U.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            C50792y.m109911b("IESOppoCamera", sb.toString());
            try {
                this.f53306c.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i, i2, rect.width() - i, rect.height() - i2));
                this.f53305b.setRepeatingRequest(this.f53306c.build(), null, null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final boolean mo39655b(int i, C19263c cVar) {
        C50792y.m109911b("IESOppoCamera", "changeCamera...");
        if (this.f53310g == 1 || this.f53310g == 2) {
            C50792y.m109911b("IESOppoCamera", "Camera is opening or pending, ignore changeCamera operation.");
            return false;
        }
        mo39651b();
        mo39649a(i, cVar);
        C19274g.f53186l = true;
        return true;
    }

    /* renamed from: a */
    private void m47121a(int i, int i2) {
        Size[] outputSizes = ((StreamConfigurationMap) this.f53303U.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(UnReadVideoExperiment.BROWSE_RECORD_LIST);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new Point(size.getWidth(), size.getHeight()));
        }
        Point a = C19265e.m46990a((List<Point>) arrayList, new Point(this.f53287E, this.f53288F), (float) i, (float) i2);
        this.f53315l.f53176n = a;
        if (a != null) {
            this.f53296N = ImageReader.newInstance(a.x, a.y, 35, 1);
            this.f53296N.setOnImageAvailableListener(new OnImageAvailableListener() {
                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        ImageFrame imageFrame = new ImageFrame(new C19306j(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                        if (C19293i.this.f53316m != null) {
                            C19293i.this.f53316m.mo39715a(imageFrame);
                        }
                        acquireNextImage.close();
                    }
                }
            }, this.f53311h);
        }
    }

    /* renamed from: a */
    public static boolean m47122a(Context context, int i) {
        try {
            C13486b a = C13486b.m27243a();
            String str = ((CameraManager) context.getSystemService("camera")).getCameraIdList()[i];
            String b = a.mo25276b((String) f53282y.get(context.getPackageName()));
            if (b != null && !b.isEmpty()) {
                String b2 = a.mo25275b();
                if (b2 != null && b2.contains(str)) {
                    String c = a.mo25277c(str);
                    if (c != null && !c.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(c);
                        if (1 == jSONObject.optInt("EIS") || 1 == jSONObject.optInt("OIS-Movie")) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            C50792y.m109913c("IESOppoCamera", "AntiShake verify cause this exception");
        }
        return false;
    }

    /* renamed from: a */
    public final void mo39638a(int i, int i2, final C19270b bVar) {
        this.f53316m = bVar;
        this.f53299Q = new Size(i, i2);
        if (this.f53304a == null || this.f53305b == null || this.f53303U == null) {
            if (bVar != null) {
                bVar.mo39715a(null);
            }
            return;
        }
        try {
            this.f53295M = true;
            if (this.f53315l.f53170h && this.f53315l.f53171i == i && this.f53315l.f53172j == i2) {
                if (this.f53317n == 0 || this.f53317n == 2) {
                    mo39777q();
                } else {
                    mo39778r();
                }
                return;
            }
            this.f53324u = new CameraCaptureSession.StateCallback() {
                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    C19293i.this.f53324u = null;
                    if (bVar != null) {
                        bVar.mo39715a(null);
                    }
                }

                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    C19293i.this.f53324u = null;
                    try {
                        if (C19293i.this.f53317n == 0 || C19293i.this.f53317n == 2) {
                            C19293i.this.mo39777q();
                        } else {
                            C19293i.this.mo39778r();
                        }
                    } catch (Throwable unused) {
                        if (bVar != null) {
                            bVar.mo39715a(null);
                        }
                    }
                }
            };
            mo39639a(this.f53297O);
            this.f53295M = false;
        } catch (Throwable unused) {
            if (bVar != null) {
                bVar.mo39715a(null);
            }
        } finally {
            this.f53295M = false;
        }
    }

    /* renamed from: a */
    private Rect m47120a(int i, int i2, float[] fArr, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Rect rect = (Rect) this.f53303U.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        sb.append(rect.left);
        sb.append(", ");
        sb.append(rect.top);
        sb.append(", ");
        sb.append(rect.right);
        sb.append(", ");
        sb.append(rect.bottom);
        sb.append("]");
        C50792y.m109911b("IESOppoCamera", sb.toString());
        Size size = (Size) this.f53303U.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb2 = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb2.append(size.getWidth());
        sb2.append(", ");
        sb2.append(size.getHeight());
        sb2.append("]");
        C50792y.m109909a("onAreaTouchEvent", sb2.toString());
        float f6 = fArr[0];
        float f7 = fArr[1];
        int i8 = this.f53287E;
        int i9 = this.f53288F;
        if (90 == this.f53285C || 270 == this.f53285C) {
            i8 = this.f53288F;
            i9 = this.f53287E;
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
            f10 = ((float) this.f53288F) - f10;
        } else if (270 == i7) {
            f11 = ((float) this.f53287E) - f11;
        } else {
            float f12 = f10;
            f10 = f11;
            f11 = f12;
        }
        Rect rect2 = (Rect) this.f53323t.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            C50792y.m109913c("IESOppoCamera", "can't get crop region");
            rect2 = rect;
        }
        int width = rect2.width();
        int height = rect2.height();
        if (this.f53288F * width > this.f53287E * height) {
            float f13 = (((float) height) * 1.0f) / ((float) this.f53288F);
            f8 = (((float) width) - (((float) this.f53287E) * f13)) / 2.0f;
            f5 = f13;
            f4 = 0.0f;
        } else {
            f5 = (((float) width) * 1.0f) / ((float) this.f53287E);
            f4 = (((float) height) - (((float) this.f53288F) * f5)) / 2.0f;
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
        C50792y.m109911b("IESOppoCamera", sb3.toString());
        return rect3;
    }
}
