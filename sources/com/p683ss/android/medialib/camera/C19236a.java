package com.p683ss.android.medialib.camera;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.ErrorCallback;
import android.hardware.Camera.OnZoomChangeListener;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.medialib.camera.C19268f.C19269a;
import com.p683ss.android.medialib.camera.C19268f.C19270b;
import com.p683ss.android.medialib.camera.C19268f.C19271c;
import com.p683ss.android.medialib.camera.C19268f.C19272d;
import com.p683ss.android.medialib.camera.C19268f.C19273e;
import com.p683ss.android.medialib.util.C19389a;
import com.p683ss.android.ttve.monitor.C20114g;
import com.p683ss.android.vesdk.C50792y;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.camera.a */
public final class C19236a implements ErrorCallback, C19268f {

    /* renamed from: a */
    public Camera f53061a;

    /* renamed from: b */
    public int f53062b;

    /* renamed from: c */
    public int f53063c;

    /* renamed from: d */
    public int f53064d;

    /* renamed from: e */
    public C19273e f53065e;

    /* renamed from: f */
    C19264d f53066f;

    /* renamed from: g */
    public SurfaceTexture f53067g;

    /* renamed from: h */
    public boolean f53068h;

    /* renamed from: i */
    public C19271c f53069i;

    /* renamed from: j */
    public boolean f53070j = true;

    /* renamed from: k */
    private int f53071k = -1;

    /* renamed from: l */
    private C19272d f53072l;

    /* renamed from: m */
    private boolean f53073m;

    /* renamed from: n */
    private boolean f53074n;

    /* renamed from: o */
    private int f53075o;

    /* renamed from: p */
    private C19263c f53076p;

    /* renamed from: q */
    private C19269a f53077q;

    /* renamed from: r */
    private int f53078r;

    /* renamed from: s */
    private int f53079s;

    /* renamed from: t */
    private PreviewCallback f53080t = new PreviewCallback() {
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            if (C19236a.this.f53069i != null) {
                C19236a.this.f53069i.mo39680a(1, new ImageFrame(bArr, -3, C19236a.this.f53063c, C19236a.this.f53064d));
            }
            if (C19236a.this.f53061a != null) {
                C19236a.this.f53061a.addCallbackBuffer(bArr);
            }
        }
    };

    /* renamed from: a */
    private static int m46882a(int i, int i2, int i3) {
        if (i > 1000) {
            return 1000;
        }
        if (i < -1000) {
            return -1000;
        }
        return i;
    }

    /* renamed from: b */
    public final void mo39654b(boolean z) {
    }

    /* renamed from: g */
    public final int mo39660g() {
        return this.f53078r;
    }

    /* renamed from: m */
    public final int mo39666m() {
        return this.f53071k;
    }

    /* renamed from: n */
    public final boolean mo39667n() {
        return this.f53068h;
    }

    /* renamed from: o */
    public final int mo39668o() {
        return 17;
    }

    /* renamed from: a */
    public final boolean mo39646a() {
        try {
            if (this.f53061a == null || this.f53061a.getParameters() == null || this.f53061a.getParameters().getSupportedFlashModes() == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo39645a(boolean z) {
        if (this.f53061a != null) {
            try {
                Parameters parameters = this.f53061a.getParameters();
                if (parameters != null) {
                    parameters.setFlashMode(z ? "torch" : "off");
                    m46886a(this.f53061a, parameters);
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo39647a(int i) {
        if (this.f53061a == null) {
            return false;
        }
        try {
            Parameters parameters = this.f53061a.getParameters();
            if (parameters != null) {
                List supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    String str = null;
                    switch (i) {
                        case 0:
                            str = "off";
                            break;
                        case 1:
                            str = "on";
                            break;
                        case 2:
                            str = "torch";
                            break;
                        case 3:
                            str = "auto";
                            break;
                        case 4:
                            str = "red-eye";
                            break;
                    }
                    if (str != null && supportedFlashModes.contains(str)) {
                        parameters.setFlashMode(str);
                        m46886a(this.f53061a, parameters);
                        this.f53075o = i;
                        return true;
                    }
                }
                return true;
            }
        } catch (RuntimeException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo39649a(int i, C19263c cVar) {
        StringBuilder sb = new StringBuilder("open pos:");
        sb.append(i);
        sb.append(" >>");
        C50792y.m109909a("Camera1", sb.toString());
        C20114g.m49648a("iesve_record_camera_type", 1);
        try {
            this.f53061a = m46888d(i == 0 ? 0 : 1);
            if (this.f53061a != null) {
                this.f53061a.setErrorCallback(this);
                if (cVar != null) {
                    cVar.mo39670a(1);
                }
                C50792y.m109909a("Camera1", "open success: ");
                this.f53070j = false;
                return true;
            }
            if (cVar != null) {
                StringBuilder sb2 = new StringBuilder("No find camera @");
                sb2.append(i);
                cVar.mo39671a(1, -1, sb2.toString());
            }
            C50792y.m109909a("Camera1", "open failed: 2");
            return false;
        } catch (Throwable th) {
            if (cVar != null) {
                cVar.mo39671a(1, -3, th.getLocalizedMessage());
            }
            StringBuilder sb3 = new StringBuilder("open failed: ");
            sb3.append(Log.getStackTraceString(th));
            C50792y.m109909a("Camera1", sb3.toString());
            return false;
        }
    }

    /* renamed from: a */
    public final void mo39639a(SurfaceTexture surfaceTexture) {
        C50792y.m109909a("Camera1", "camera  startPreview >>");
        if (this.f53061a == null || surfaceTexture == null) {
            C50792y.m109914d("Camera1", "Camera || SurfaceTexture is null.");
            return;
        }
        C50792y.m109911b("Camera1", "startPreview...");
        try {
            if (this.f53073m) {
                this.f53061a.stopPreview();
            }
            this.f53067g = surfaceTexture;
            this.f53061a.setPreviewTexture(surfaceTexture);
            C50792y.m109909a("Camera1", "camera  startPreviewing...");
            this.f53061a.startPreview();
            int[] iArr = new int[2];
            this.f53061a.getParameters().getPreviewFpsRange(iArr);
            StringBuilder sb = new StringBuilder("Fps Range: [");
            sb.append(iArr[0]);
            sb.append(", ");
            sb.append(iArr[1]);
            sb.append("]");
            C50792y.m109909a("Camera1", sb.toString());
            this.f53073m = true;
            if (this.f53077q != null) {
                this.f53077q.mo39714a();
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("startPreview: Error ");
            sb2.append(e.getMessage());
            C50792y.m109914d("Camera1", sb2.toString());
            mo39651b();
        }
    }

    /* renamed from: a */
    public final boolean mo39648a(int i, int i2, float f, float[] fArr, int i3) {
        if (this.f53061a == null) {
            return false;
        }
        int i4 = i2;
        float f2 = f;
        float[] fArr2 = fArr;
        int i5 = i3;
        Rect a = m46884a(i, i4, f2, fArr2, i5, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Area(a, 1000));
        Rect a2 = m46884a(i, i4, f2, fArr2, i5, 1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Area(a2, 1000));
        try {
            Parameters parameters = this.f53061a.getParameters();
            if (parameters.getMaxNumMeteringAreas() <= 0) {
                C50792y.m109914d("Camera1", "metering areas not supported");
            } else if (!TextUtils.equals(Build.BRAND, "Multilaser") && !TextUtils.equals(Build.BRAND, "MS40")) {
                parameters.setMeteringAreas(arrayList2);
            }
            if (parameters.getMaxNumFocusAreas() <= 0) {
                m46886a(this.f53061a, parameters);
                C50792y.m109914d("Camera1", "focus areas not supported");
                return false;
            } else if (TextUtils.equals(Build.BRAND, "Multilaser") || TextUtils.equals(Build.BRAND, "MS40")) {
                return false;
            } else {
                parameters.setFocusAreas(arrayList);
                String flashMode = parameters.getFlashMode();
                if (!"off".equals(flashMode) && !"torch".equals(flashMode)) {
                    int i6 = this.f53075o;
                    parameters.setFlashMode("off");
                    this.f53075o = i6;
                }
                parameters.setFocusMode("auto");
                m46886a(this.f53061a, parameters);
                this.f53061a.autoFocus(new AutoFocusCallback() {
                    public final void onAutoFocus(boolean z, Camera camera) {
                        StringBuilder sb = new StringBuilder("focus: ");
                        sb.append(z);
                        C50792y.m109911b("Camera1", sb.toString());
                        if (!z) {
                            try {
                                camera.cancelAutoFocus();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        Parameters parameters = camera.getParameters();
                        parameters.setFocusMode("continuous-video");
                        C19236a.m46886a(camera, parameters);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo39644a(C19273e eVar) {
        this.f53065e = eVar;
    }

    /* renamed from: a */
    public final void mo39643a(C19272d dVar) {
        this.f53072l = dVar;
    }

    /* renamed from: j */
    public final boolean mo39663j() {
        if (this.f53061a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo39656c() {
        C50792y.m109909a("Camera1", "camera  release >>");
        mo39651b();
        C50792y.m109909a("Camera1", "camera  release <<");
    }

    /* renamed from: k */
    public final int[] mo39664k() {
        try {
            Size previewSize = this.f53061a.getParameters().getPreviewSize();
            return new int[]{previewSize.width, previewSize.height};
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo39651b() {
        C50792y.m109909a("Camera1", "camera close >>");
        if (this.f53061a != null) {
            try {
                this.f53061a.setErrorCallback(null);
                this.f53061a.setPreviewCallback(null);
                this.f53061a.setPreviewCallbackWithBuffer(null);
                this.f53061a.stopPreview();
                this.f53070j = true;
                this.f53061a.release();
                C50792y.m109909a("Camera1", "camera released");
            } catch (Exception unused) {
            }
        }
        this.f53073m = false;
        this.f53061a = null;
        this.f53076p = null;
        this.f53075o = 0;
        C50792y.m109909a("Camera1", "camera close <<");
    }

    /* renamed from: d */
    public final void mo39657d() {
        if (this.f53074n) {
            mo39651b();
            mo39649a(mo39666m(), (C19263c) new C19263c() {
                /* renamed from: a */
                public final void mo39671a(int i, int i2, String str) {
                }

                /* renamed from: a */
                public final void mo39670a(int i) {
                    C19236a.this.mo39661h();
                    if (C19236a.this.f53066f.f53177o == 1) {
                        C19236a.this.mo39639a(C19236a.this.f53067g);
                    } else {
                        C19236a.this.mo39659f();
                    }
                }
            });
        } else if (this.f53066f.f53177o == 1) {
            mo39639a(this.f53067g);
        } else {
            mo39659f();
        }
    }

    /* renamed from: e */
    public final void mo39658e() {
        C50792y.m109911b("Camera1", "stopPreview >>");
        if (this.f53061a != null) {
            try {
                this.f53061a.setPreviewCallback(null);
                this.f53061a.stopPreview();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("stopPreview: Error ");
                sb.append(Log.getStackTraceString(e));
                C50792y.m109914d("Camera1", sb.toString());
            }
        }
        this.f53073m = false;
        C50792y.m109911b("Camera1", "stopPreview <<");
    }

    /* renamed from: i */
    public final float mo39662i() {
        if (this.f53061a != null) {
            try {
                Parameters parameters = this.f53061a.getParameters();
                if (parameters != null && parameters.isZoomSupported()) {
                    if (this.f53065e != null) {
                        int maxZoom = parameters.getMaxZoom();
                        StringBuilder sb = new StringBuilder("Camera Max Zoom is: ");
                        sb.append(maxZoom);
                        C50792y.m109909a("Camera1", sb.toString());
                        this.f53079s = (maxZoom + 1) / 100;
                        if (maxZoom > 99) {
                            maxZoom = 99;
                        }
                        if (this.f53079s <= 0) {
                            this.f53079s = 1;
                        }
                        this.f53065e.mo39717a(1, true, parameters.isSmoothZoomSupported(), (float) maxZoom, parameters.getZoomRatios());
                    }
                    return (float) parameters.getMaxZoom();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f53065e != null) {
            this.f53065e.mo39717a(1, false, false, -1.0f, null);
        }
        return -1.0f;
    }

    /* renamed from: l */
    public final List<int[]> mo39665l() {
        if (this.f53061a == null) {
            return new ArrayList();
        }
        try {
            List<Size> supportedPreviewSizes = this.f53061a.getParameters().getSupportedPreviewSizes();
            ArrayList arrayList = new ArrayList();
            for (Size size : supportedPreviewSizes) {
                arrayList.add(new int[]{size.width, size.height});
            }
            return arrayList;
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    /* renamed from: f */
    public final void mo39659f() {
        if (this.f53061a == null) {
            C50792y.m109914d("Camera1", "Camera || SurfaceTexture is null.");
            return;
        }
        C50792y.m109911b("Camera1", "startPreview...");
        try {
            if (this.f53073m) {
                this.f53061a.stopPreview();
            }
            for (byte[] addCallbackBuffer : (byte[][]) Array.newInstance(byte.class, new int[]{3, ((this.f53063c * this.f53064d) * 3) / 2})) {
                this.f53061a.addCallbackBuffer(addCallbackBuffer);
            }
            this.f53061a.setPreviewCallbackWithBuffer(this.f53080t);
            this.f53061a.setPreviewTexture(this.f53067g);
            if (Build.MODEL.toLowerCase().contains("x9s plus")) {
                this.f53061a.getParameters().setPreviewFpsRange(7000, 25000);
            }
            this.f53061a.startPreview();
            int[] iArr = new int[2];
            this.f53061a.getParameters().getPreviewFpsRange(iArr);
            StringBuilder sb = new StringBuilder("Fps Range: [");
            sb.append(iArr[0]);
            sb.append(", ");
            sb.append(iArr[1]);
            sb.append("]");
            C50792y.m109909a("Camera1", sb.toString());
            this.f53073m = true;
            if (this.f53077q != null) {
                this.f53077q.mo39714a();
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("startPreview: Error ");
            sb2.append(Log.getStackTraceString(e));
            C50792y.m109914d("Camera1", sb2.toString());
            mo39651b();
        }
    }

    /* renamed from: h */
    public final int[] mo39661h() {
        Point point;
        if (this.f53061a != null) {
            try {
                Parameters parameters = this.f53061a.getParameters();
                List<Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                ArrayList arrayList = new ArrayList();
                for (Size size : supportedPreviewSizes) {
                    arrayList.add(new Point(size.width, size.height));
                }
                List<Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
                ArrayList arrayList2 = new ArrayList();
                for (Size size2 : supportedPictureSizes) {
                    arrayList2.add(new Point(size2.width, size2.height));
                }
                if (this.f53066f.f53170h) {
                    point = C19265e.m46989a(arrayList, this.f53066f.f53168f, this.f53066f.f53169g, arrayList2, this.f53066f.f53171i, this.f53066f.f53172j);
                } else {
                    point = C19265e.m46988a((List<Point>) arrayList, this.f53066f.f53168f, this.f53066f.f53169g);
                }
                if (point != null) {
                    this.f53063c = point.x;
                    this.f53064d = point.y;
                }
                StringBuilder sb = new StringBuilder("PreviewSize: ");
                sb.append(this.f53063c);
                sb.append(", ");
                sb.append(this.f53064d);
                C50792y.m109909a("Camera1", sb.toString());
                parameters.setPreviewSize(this.f53063c, this.f53064d);
                if (this.f53066f.f53170h) {
                    m46885a(parameters, this.f53066f.f53171i, this.f53066f.f53172j);
                } else if (VERSION.SDK_INT >= 21 && (this.f53066f.f53179q & 1) != 0) {
                    Point a = m46883a((List<Point>) arrayList2);
                    if (a != null) {
                        parameters.setPictureSize(a.x, a.y);
                        StringBuilder sb2 = new StringBuilder("PictureSize: ");
                        sb2.append(a.x);
                        sb2.append(", ");
                        sb2.append(a.y);
                        C50792y.m109909a("Camera1", sb2.toString());
                    }
                }
                List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
                if (supportedPreviewFrameRates != null) {
                    int i = 0;
                    for (Integer intValue : supportedPreviewFrameRates) {
                        int intValue2 = intValue.intValue();
                        if (intValue2 == 30) {
                            i = intValue2;
                        }
                    }
                    if (i == 0 && supportedPreviewFrameRates.size() > 0) {
                        i = ((Integer) supportedPreviewFrameRates.get(0)).intValue();
                    }
                    if (i != 0) {
                        parameters.setPreviewFrameRate(i);
                    }
                }
                List supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes.contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                } else if (supportedFocusModes.contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                } else if (supportedFocusModes.contains("auto")) {
                    parameters.setFocusMode("auto");
                }
                parameters.setPreviewFormat(17);
                if (this.f53066f.f53174l && (this.f53066f.f53179q & 4) != 0) {
                    if (this.f53066f.f53170h) {
                        parameters.set("MTK_CAMERA_MODE", "CAMERA_MODE_MTK_PRV");
                    } else {
                        parameters.set("MTK_CAMERA_MODE", "CAMERA_MODE_MTK_PVO");
                    }
                }
                m46886a(this.f53061a, parameters);
            } catch (Throwable unused) {
                C50792y.m109914d("Camera1", "Set camera params failed");
            }
        }
        return new int[]{this.f53063c, this.f53064d};
    }

    /* renamed from: a */
    public final void mo39640a(C19264d dVar) {
        this.f53066f = dVar;
    }

    /* renamed from: b */
    public final void mo39653b(SurfaceTexture surfaceTexture) {
        this.f53067g = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo39641a(C19269a aVar) {
        this.f53077q = aVar;
    }

    /* renamed from: c */
    private static int m46887c(int i) {
        return m46882a(i, -1000, 1000);
    }

    /* renamed from: a */
    public final void mo39642a(C19271c cVar) {
        this.f53069i = cVar;
    }

    /* renamed from: a */
    private Point m46883a(List<Point> list) {
        Point point = null;
        for (Point point2 : list) {
            if (Math.max(point2.x, point2.y) <= 1920 && point2.x * this.f53064d == point2.y * this.f53063c) {
                if (point == null || point2.x > point.x) {
                    point = point2;
                }
            }
        }
        if (point == null || point.x < this.f53063c || point.y < this.f53064d) {
            return null;
        }
        return point;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[SYNTHETIC, Splitter:B:23:0x0066] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.hardware.Camera m46888d(int r7) {
        /*
            r6 = this;
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
            r0.<init>()
            int r1 = android.hardware.Camera.getNumberOfCameras()
            java.lang.String r2 = "Camera1"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getCamera cameraCount: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.p683ss.android.vesdk.C50792y.m109909a(r2, r3)
            r2 = 0
        L_0x001d:
            r3 = 0
            if (r2 >= r1) goto L_0x0075
            r4 = 1
            android.hardware.Camera.getCameraInfo(r2, r0)     // Catch:{ RuntimeException -> 0x004b }
            int r5 = r0.facing     // Catch:{ RuntimeException -> 0x004b }
            if (r5 == r7) goto L_0x002e
            if (r1 != r4) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x002e:
            android.hardware.Camera r7 = android.hardware.Camera.open(r2)     // Catch:{ RuntimeException -> 0x004b }
            if (r7 == 0) goto L_0x0044
            com.ss.android.medialib.camera.d r1 = r6.f53066f     // Catch:{ RuntimeException -> 0x0042 }
            boolean r1 = r1.f53170h     // Catch:{ RuntimeException -> 0x0042 }
            if (r1 != 0) goto L_0x0044
            android.hardware.Camera$Parameters r1 = r7.getParameters()     // Catch:{ RuntimeException -> 0x0042 }
            m46886a(r7, r1)     // Catch:{ RuntimeException -> 0x0042 }
            goto L_0x0044
        L_0x0042:
            r0 = move-exception
            goto L_0x004d
        L_0x0044:
            r6.f53062b = r2     // Catch:{ RuntimeException -> 0x0042 }
            int r0 = r0.facing     // Catch:{ RuntimeException -> 0x0042 }
            r6.f53071k = r0     // Catch:{ RuntimeException -> 0x0042 }
            goto L_0x0076
        L_0x004b:
            r0 = move-exception
            r7 = r3
        L_0x004d:
            java.lang.String r1 = "Camera1"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Camera failed to open: "
            r2.<init>(r3)
            java.lang.String r3 = r0.getLocalizedMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p683ss.android.vesdk.C50792y.m109914d(r1, r2)
            if (r7 == 0) goto L_0x006b
            r6.f53070j = r4     // Catch:{ Exception -> 0x006b }
            r7.release()     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = r0.getLocalizedMessage()
            r7.<init>(r0)
            throw r7
        L_0x0075:
            r7 = r3
        L_0x0076:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19236a.m46888d(int):android.hardware.Camera");
    }

    /* renamed from: b */
    public final int mo39650b(int i) {
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(this.f53062b, cameraInfo);
        try {
            if (cameraInfo.facing == 0) {
                this.f53078r = ((cameraInfo.orientation - i) + 360) % 360;
            } else {
                this.f53078r = (cameraInfo.orientation + i) % 360;
                this.f53078r = ((360 - this.f53078r) + NormalGiftView.ALPHA_180) % 360;
            }
            StringBuilder sb = new StringBuilder("sCamIdx: ");
            sb.append(this.f53062b);
            C50792y.m109909a("Camera1", sb.toString());
            StringBuilder sb2 = new StringBuilder("mRotation: ");
            sb2.append(this.f53078r);
            C50792y.m109909a("Camera1", sb2.toString());
            this.f53061a.setDisplayOrientation(this.f53078r);
            return this.f53078r;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo39652b(float f) {
        if (this.f53061a != null) {
            try {
                Parameters parameters = this.f53061a.getParameters();
                if (parameters.isZoomSupported()) {
                    int maxZoom = parameters.getMaxZoom();
                    if (f != 99.0f) {
                        float f2 = (float) maxZoom;
                        if (f != f2) {
                            maxZoom = (int) Math.min(f2, f * ((float) this.f53079s));
                        }
                    }
                    StringBuilder sb = new StringBuilder("startZoom realZoom is: ");
                    sb.append(maxZoom);
                    C50792y.m109909a("Camera1", sb.toString());
                    if (!parameters.isSmoothZoomSupported() || this.f53065e == null || !this.f53065e.mo39718a()) {
                        parameters.setZoom(maxZoom);
                        m46886a(this.f53061a, parameters);
                        if (this.f53065e != null) {
                            this.f53065e.mo39716a(1, (float) maxZoom, true);
                        }
                        return;
                    }
                    this.f53061a.startSmoothZoom(maxZoom);
                    this.f53061a.setZoomChangeListener(new OnZoomChangeListener() {
                        public final void onZoomChange(int i, boolean z, Camera camera) {
                            if (C19236a.this.f53065e != null) {
                                C19236a.this.f53065e.mo39716a(1, (float) i, z);
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r3 = r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39637a(float r8) {
        /*
            r7 = this;
            android.hardware.Camera r0 = r7.f53061a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.hardware.Camera r0 = r7.f53061a     // Catch:{ Throwable -> 0x006a }
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ Throwable -> 0x006a }
            java.util.List r1 = r0.getZoomRatios()     // Catch:{ Throwable -> 0x006a }
            int r2 = r1.size()     // Catch:{ Throwable -> 0x006a }
            r3 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 * r3
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ Throwable -> 0x006a }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Throwable -> 0x006a }
            int r4 = r4.intValue()     // Catch:{ Throwable -> 0x006a }
            float r4 = (float) r4     // Catch:{ Throwable -> 0x006a }
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0028
            goto L_0x0061
        L_0x0028:
            r4 = 0
        L_0x0029:
            int r5 = r2 + -1
            if (r4 >= r5) goto L_0x0061
            java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x006a }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Throwable -> 0x006a }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x006a }
            r6 = 300(0x12c, float:4.2E-43)
            if (r5 < r6) goto L_0x003c
            goto L_0x005c
        L_0x003c:
            java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x006a }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Throwable -> 0x006a }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x006a }
            float r5 = (float) r5     // Catch:{ Throwable -> 0x006a }
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x005e
            int r5 = r4 + 1
            java.lang.Object r5 = r1.get(r5)     // Catch:{ Throwable -> 0x006a }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Throwable -> 0x006a }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x006a }
            float r5 = (float) r5     // Catch:{ Throwable -> 0x006a }
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x005e
        L_0x005c:
            r3 = r4
            goto L_0x0061
        L_0x005e:
            int r4 = r4 + 1
            goto L_0x0029
        L_0x0061:
            r0.setZoom(r3)     // Catch:{ Throwable -> 0x006a }
            android.hardware.Camera r8 = r7.f53061a     // Catch:{ Throwable -> 0x006a }
            m46886a(r8, r0)     // Catch:{ Throwable -> 0x006a }
            return
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.camera.C19236a.mo39637a(float):void");
    }

    /* renamed from: a */
    public static void m46886a(Camera camera, Parameters parameters) {
        if (!(camera == null || parameters == null)) {
            try {
                camera.setParameters(parameters);
            } catch (Throwable th) {
                if (!Build.MODEL.toLowerCase().contains("x9s plus")) {
                    throw th;
                }
            }
        }
    }

    public final void onError(int i, Camera camera) {
        StringBuilder sb = new StringBuilder("onError: ");
        sb.append(i);
        C50792y.m109914d("Camera1", sb.toString());
        if (this.f53076p != null) {
            C19263c cVar = this.f53076p;
            int i2 = 100;
            if (i != 100) {
                switch (i) {
                    case 1:
                        i2 = 1;
                        break;
                    case 2:
                        i2 = 2;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
            }
            cVar.mo39671a(1, i2, "camera1::error");
        }
    }

    /* renamed from: b */
    public final boolean mo39655b(int i, C19263c cVar) {
        CameraInfo cameraInfo = new CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        StringBuilder sb = new StringBuilder("changeCamera cameraPosition: ");
        sb.append(i);
        C50792y.m109909a("Camera1", sb.toString());
        StringBuilder sb2 = new StringBuilder("changeCamera cameraCount: ");
        sb2.append(numberOfCameras);
        C50792y.m109909a("Camera1", sb2.toString());
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (i == 1) {
                if (cameraInfo.facing == 1 || numberOfCameras == 1) {
                    mo39651b();
                    mo39649a(i2, (C19263c) null);
                    this.f53062b = i2;
                    this.f53071k = cameraInfo.facing;
                    cVar.mo39670a(1);
                    C19274g.f53186l = true;
                    return true;
                }
            } else if (cameraInfo.facing == 0) {
                mo39651b();
                mo39649a(i2, (C19263c) null);
                this.f53062b = i2;
                this.f53071k = cameraInfo.facing;
                cVar.mo39670a(1);
                C19274g.f53186l = true;
                return true;
            }
        }
        StringBuilder sb3 = new StringBuilder("Change camera failed @");
        sb3.append(i);
        sb3.append(" camera count = ");
        sb3.append(numberOfCameras);
        cVar.mo39671a(1, -1, sb3.toString());
        this.f53070j = true;
        return true;
    }

    /* renamed from: a */
    private void m46885a(Parameters parameters, int i, int i2) {
        if (parameters != null) {
            List<Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Size size : supportedPictureSizes) {
                arrayList.add(new Point(size.width, size.height));
            }
            Point a = C19265e.m46990a((List<Point>) arrayList, new Point(this.f53063c, this.f53064d), (float) i, (float) i2);
            parameters.setPictureSize(a.x, a.y);
            parameters.setJpegQuality(100);
            if (this.f53066f.f53170h) {
                String str = parameters.get("zsl-values");
                if ("off".equals(parameters.get("zsl")) && str != null && str.contains("on")) {
                    parameters.set("zsl", "on");
                }
                this.f53074n = "on".equals(parameters.get("zsl"));
                if (!this.f53074n && TextUtils.isEmpty(str) && this.f53066f.f53173k) {
                    String str2 = parameters.get("zsd-mode-values");
                    if ("off".equals(parameters.get("zsd-mode")) && str2 != null && str2.contains("on")) {
                        parameters.set("zsd-mode", "on");
                    }
                    this.f53074n = "on".equals(parameters.get("zsd-mode"));
                }
            }
            this.f53066f.f53176n = a;
        }
    }

    /* renamed from: a */
    public final void mo39638a(int i, int i2, final C19270b bVar) {
        if (this.f53061a != null) {
            this.f53068h = true;
            try {
                Parameters parameters = this.f53061a.getParameters();
                if (!(this.f53066f.f53170h && this.f53066f.f53171i == i && this.f53066f.f53172j == i2)) {
                    m46885a(parameters, i, i2);
                    m46886a(this.f53061a, parameters);
                }
                mo39647a(this.f53075o);
                this.f53061a.takePicture(null, null, new PictureCallback() {
                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        C19236a.this.f53068h = false;
                        if (!C19236a.this.f53070j) {
                            C19236a.this.f53061a.setPreviewCallbackWithBuffer(null);
                        }
                        if (bVar != null) {
                            bVar.mo39715a(new ImageFrame(bArr, 1, C19236a.this.f53066f.f53176n.x, C19236a.this.f53066f.f53176n.y));
                        }
                    }
                });
            } catch (Exception unused) {
                if (bVar != null) {
                    bVar.mo39715a(null);
                }
                this.f53068h = false;
            } finally {
                this.f53073m = false;
            }
        }
    }

    /* renamed from: a */
    private Rect m46884a(int i, int i2, float f, float[] fArr, int i3, int i4) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        int intValue = Float.valueOf((f * 60.0f) + 0.5f).intValue();
        if (i4 != 0) {
            intValue *= 2;
        }
        int i5 = ((int) ((f2 * 2000.0f) / ((float) i))) - 1000;
        int i6 = ((int) ((f3 * 2000.0f) / ((float) i2))) - 1000;
        if (mo39666m() == 1) {
            i5 = -i5;
        }
        int i7 = intValue / 2;
        int a = m46882a(i5 - i7, -1000, 1000);
        int a2 = m46882a(i6 - i7, -1000, 1000);
        RectF rectF = new RectF((float) a, (float) a2, (float) m46887c(a + intValue), (float) m46887c(a2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        C19389a.m47479a(i3, new Rect(-1000, -1000, 1000, 1000), rect);
        Rect rect2 = new Rect(rect.left - 1000, rect.top - 1000, rect.right - 1000, rect.bottom - 1000);
        rect2.left = m46887c(rect2.left);
        rect2.right = m46887c(rect2.right);
        rect2.top = m46887c(rect2.top);
        rect2.bottom = m46887c(rect2.bottom);
        return rect2;
    }
}
