package com.p683ss.android.ttvecamera;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.ErrorCallback;
import android.hardware.Camera.OnZoomChangeListener;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.C2240a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ttvecamera.C20201f.C20202a;
import com.p683ss.android.ttvecamera.C20201f.C20203b;
import com.p683ss.android.ttvecamera.C20232i.C20235b;
import com.p683ss.android.ttvecamera.C20275l.C20280e;
import com.p683ss.android.ttvecamera.C20275l.C20281f;
import com.p683ss.android.ttvecamera.C20275l.C20283h;
import com.p683ss.android.ttvecamera.C20275l.C20284i;
import com.p683ss.android.ttvecamera.p1227b.C20161b;
import com.p683ss.android.ttvecamera.p1232g.C20212a;
import com.p683ss.android.ttvecamera.p1232g.C20217c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.c */
public final class C20169c extends C20201f {

    /* renamed from: A */
    private long f55444A = 0;

    /* renamed from: a */
    Camera f55445a;

    /* renamed from: b */
    public Parameters f55446b;

    /* renamed from: c */
    private C20161b f55447c;

    /* renamed from: d */
    private String f55448d = "";

    /* renamed from: e */
    private int f55449e;

    /* renamed from: f */
    private List<TEFrameSizei> f55450f = new ArrayList();

    /* renamed from: w */
    private List<TEFrameSizei> f55451w = new ArrayList();

    /* renamed from: x */
    private List<Integer> f55452x = null;

    /* renamed from: y */
    private float f55453y = 100.0f;

    /* renamed from: z */
    private AtomicBoolean f55454z = new AtomicBoolean(false);

    /* renamed from: f */
    public final int mo42734f() {
        return 1;
    }

    /* renamed from: a */
    public final void mo42720a(int i, int i2, final C20281f fVar) {
        if (this.f55445a == null) {
            String str = "takePicture : camera is null";
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, -401, str);
            return;
        }
        try {
            this.f55446b = this.f55445a.getParameters();
            if (!(this.f55446b.getPictureSize().width == i && this.f55446b.getPictureSize().height == i2)) {
                TEFrameSizei a = C20285m.m50048a(m49763a(this.f55446b.getSupportedPictureSizes()), this.f55520h.f55728j, new TEFrameSizei(i, i2));
                this.f55446b.setPictureSize(a.f55398a, a.f55399b);
                this.f55446b.setPictureFormat(UnReadVideoExperiment.BROWSE_RECORD_LIST);
                this.f55446b.setJpegQuality(100);
                this.f55445a.setParameters(this.f55446b);
            }
            this.f55521i = false;
            this.f55445a.takePicture(null, null, new PictureCallback() {
                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    if (fVar != null) {
                        new C20232i(bArr, C20235b.PIXEL_FORMAT_JPEG, C20169c.this.f55446b.getPictureSize().width, C20169c.this.f55446b.getPictureSize().height, 0);
                    }
                }
            });
        } catch (Exception e) {
            C20225h.m49990a(e);
        }
    }

    /* renamed from: a */
    public final void mo42721a(final C20281f fVar) {
        C20296p.m50059a("TECamera1", "takePicture...");
        if (this.f55445a == null) {
            String str = "takePicture: camera is null.";
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, -401, str);
            return;
        }
        try {
            this.f55521i = false;
            StringBuilder sb = new StringBuilder("takePicture size: ");
            sb.append(this.f55520h.f55729k.toString());
            C20296p.m50059a("TECamera1", sb.toString());
            this.f55445a.takePicture(null, null, new PictureCallback() {
                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    int i;
                    if (C20169c.this.f55445a != null) {
                        C20169c.this.f55445a.stopPreview();
                    }
                    if (fVar != null) {
                        C20235b bVar = C20235b.PIXEL_FORMAT_JPEG;
                        int i2 = C20169c.this.f55446b.getPictureSize().width;
                        int i3 = C20169c.this.f55446b.getPictureSize().height;
                        if (C20169c.this.f55528p == 1) {
                            i = 270;
                        } else {
                            i = 90;
                        }
                        new C20232i(bArr, bVar, i2, i3, i);
                    }
                }
            });
        } catch (Exception e) {
            C20225h.m49990a(e);
        }
    }

    /* renamed from: a */
    public final void mo42724a(C20294n nVar) {
        if (this.f55445a == null) {
            String str = "focusAtPoint: camera is null.";
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, -401, str);
            return;
        }
        try {
            this.f55446b = this.f55445a.getParameters();
            if (!this.f55447c.mo42703a(this.f55446b, this.f55448d)) {
                String str2 = "Error: not support focus.";
                C20296p.m50063d("TECamera1", str2);
                this.f55522j.mo42784b(1, -412, str2);
                if (C20161b.m49743a(this.f55520h.f55723e, this.f55446b) && nVar.f55769g) {
                    if (nVar.f55771i != null) {
                        this.f55446b.setMeteringAreas(nVar.f55771i.mo42664a(nVar.f55763a, nVar.f55764b, nVar.f55765c, nVar.f55766d, this.f55520h.f55724f, this.f55520h.f55723e == 1));
                    } else {
                        this.f55446b.setMeteringAreas(this.f55447c.mo42704b(nVar.f55763a, nVar.f55764b, nVar.f55767e, nVar.f55765c, nVar.f55766d, this.f55520h.f55724f));
                    }
                    this.f55445a.setParameters(this.f55446b);
                }
                return;
            }
            if (nVar.f55769g && C20161b.m49743a(this.f55520h.f55723e, this.f55446b)) {
                if (nVar.f55771i != null) {
                    this.f55446b.setMeteringAreas(nVar.f55771i.mo42664a(nVar.f55763a, nVar.f55764b, nVar.f55765c, nVar.f55766d, this.f55520h.f55724f, this.f55520h.f55723e == 1));
                } else {
                    this.f55446b.setMeteringAreas(this.f55447c.mo42704b(nVar.f55763a, nVar.f55764b, nVar.f55767e, nVar.f55765c, nVar.f55766d, this.f55520h.f55724f));
                }
            }
            if (nVar.f55768f) {
                if (nVar.f55770h != null) {
                    this.f55446b.setFocusAreas(nVar.f55770h.mo42663a(nVar.f55763a, nVar.f55764b, nVar.f55765c, nVar.f55766d, this.f55520h.f55724f, this.f55520h.f55723e == 1));
                } else {
                    this.f55446b.setFocusAreas(this.f55447c.mo42702a(nVar.f55763a, nVar.f55764b, nVar.f55767e, nVar.f55765c, nVar.f55766d, this.f55520h.f55724f));
                }
                this.f55446b.setFocusMode("auto");
                this.f55445a.setParameters(this.f55446b);
                this.f55445a.autoFocus(new AutoFocusCallback() {
                    public final void onAutoFocus(boolean z, Camera camera) {
                        if (z) {
                            C20296p.m50059a("TECamera1", "Camera Focus Succeed!");
                        } else {
                            C20296p.m50059a("TECamera1", "Camera Focus Failed!");
                        }
                        try {
                            camera.cancelAutoFocus();
                            Parameters parameters = camera.getParameters();
                            parameters.setFocusMode("continuous-video");
                            camera.setParameters(parameters);
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder("Error: focusAtPoint failed: ");
                            sb.append(e.toString());
                            String sb2 = sb.toString();
                            C20296p.m50063d("TECamera1", sb2);
                            C20169c.this.f55522j.mo42782a(1, -411, sb2);
                        }
                    }
                });
                return;
            }
            this.f55445a.setParameters(this.f55446b);
            C20296p.m50059a("TECamera1", "focus is not enable!");
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error: focusAtPoint failed: ");
            sb.append(e.toString());
            String sb2 = sb.toString();
            C20296p.m50063d("TECamera1", sb2);
            this.f55522j.mo42782a(1, -411, sb2);
        }
    }

    /* renamed from: a */
    public final void mo42726a(boolean z, String str) {
        if (this.f55445a == null || !this.f55521i) {
            String str2 = "setWhileBalance : Camera is null!";
            C20296p.m50063d("TECamera1", str2);
            this.f55522j.mo42782a(1, -401, str2);
            return;
        }
        try {
            this.f55446b = this.f55445a.getParameters();
            List supportedWhiteBalance = this.f55446b.getSupportedWhiteBalance();
            if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(str)) {
                StringBuilder sb = new StringBuilder("SupportWBList has no value: ");
                sb.append(str);
                String sb2 = sb.toString();
                C20296p.m50063d("TECamera1", sb2);
                this.f55522j.mo42782a(1, -424, sb2);
                return;
            }
            this.f55446b.setWhiteBalance(str);
            this.f55445a.setParameters(this.f55446b);
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder("Set WhileBalance failed: ");
            sb3.append(e.toString());
            String sb4 = sb3.toString();
            C20296p.m50063d("TECamera1", sb4);
            this.f55522j.mo42782a(1, -424, sb4);
        }
    }

    /* renamed from: a */
    public final void mo42725a(boolean z) {
        if (this.f55445a == null || !this.f55521i) {
            String str = "toggleTorch : Camera is not ready!";
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, -401, str);
        } else if (this.f55520h.f55723e == 1) {
            String str2 = "Front camera does not support torch!";
            C20296p.m50062c("TECamera1", str2);
            this.f55522j.mo42784b(1, -416, str2);
        } else {
            try {
                this.f55446b = this.f55445a.getParameters();
                this.f55446b.setFlashMode(z ? "torch" : "off");
                this.f55445a.setParameters(this.f55446b);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Toggle torch failed: ");
                sb.append(e.toString());
                String sb2 = sb.toString();
                C20296p.m50063d("TECamera1", sb2);
                this.f55522j.mo42782a(1, -417, sb2);
            }
        }
    }

    /* renamed from: a */
    public final void mo42723a(C20284i iVar) {
        if (iVar == null) {
            C20296p.m50063d("TECamera1", "ZoomCallback is null, do nothing!");
        } else if (this.f55445a == null) {
            String str = "queryZoomAbility : Camera is null!";
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, -401, str);
        } else {
            try {
                Parameters parameters = this.f55445a.getParameters();
                this.f55530r = (float) parameters.getMaxZoom();
                iVar.mo42922a(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), (float) parameters.getMaxZoom(), parameters.getZoomRatios());
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Query zoom ability failed : ");
                sb.append(e.toString());
                String sb2 = sb.toString();
                C20296p.m50063d("TECamera1", sb2);
                this.f55522j.mo42782a(1, -420, sb2);
            }
        }
    }

    /* renamed from: a */
    public final void mo42722a(C20283h hVar) {
        if (hVar == null) {
            C20296p.m50063d("TECamera1", "ShaderZoomCallback is null, do nothing!");
        } else if (this.f55445a == null) {
            String str = "queryShaderZoomStep : Camera is null!";
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, -401, str);
        } else {
            try {
                Parameters parameters = this.f55445a.getParameters();
                if (parameters != null && parameters.isZoomSupported()) {
                    int maxZoom = parameters.getMaxZoom();
                    if (maxZoom > 99) {
                        maxZoom = 99;
                    }
                    List zoomRatios = parameters.getZoomRatios();
                    if (maxZoom > 0) {
                        Math.pow((double) ((((float) (((Integer) zoomRatios.get(1)).intValue() - ((Integer) zoomRatios.get(0)).intValue())) / 100.0f) + 1.0f), 0.5d);
                    }
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Query shader zoom step failed : ");
                sb.append(e.toString());
                String sb2 = sb.toString();
                C20296p.m50063d("TECamera1", sb2);
                this.f55522j.mo42782a(1, -420, sb2);
            }
        }
    }

    /* renamed from: a */
    public final void mo42665a(Bundle bundle) {
        super.mo42665a(bundle);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.f55534v.get(this.f55520h.f55740v);
            for (String str : bundle.keySet()) {
                if (C20280e.m50037a(str, bundle.get(str)) && str == "support_light_soft") {
                    bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
                }
            }
        }
    }

    /* renamed from: o */
    private List<TEFrameSizei> m49766o() {
        if (this.f55446b == null) {
            this.f55450f.clear();
            return this.f55450f;
        }
        this.f55450f = m49763a(this.f55446b.getSupportedPreviewSizes());
        return this.f55450f;
    }

    /* renamed from: p */
    private List<TEFrameSizei> m49767p() {
        if (this.f55446b == null) {
            this.f55451w.clear();
            return this.f55451w;
        }
        this.f55451w = m49763a(this.f55446b.getSupportedPictureSizes());
        return this.f55451w;
    }

    /* renamed from: c */
    public final void mo42730c() {
        C20296p.m50061b("TECamera1", "Camera start face detect");
        if (this.f55521i && this.f55445a != null) {
            try {
                this.f55445a.startFaceDetection();
            } catch (Exception unused) {
                C20296p.m50063d("TECamera1", "camera start face detect failed");
            }
        }
    }

    /* renamed from: d */
    public final void mo42732d() {
        C20296p.m50061b("TECamera1", "Camera stop face detect");
        if (this.f55521i && this.f55445a != null) {
            try {
                this.f55445a.stopFaceDetection();
            } catch (Exception unused) {
                C20296p.m50063d("TECamera1", "camera stop face detect failed");
            }
        }
    }

    /* renamed from: i */
    public final void mo42737i() {
        C20296p.m50061b("TECamera1", "cancelFocus...");
        if (this.f55445a != null) {
            try {
                this.f55445a.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: k */
    public final boolean mo42739k() {
        return ((Bundle) this.f55534v.get(this.f55520h.f55740v)).getBoolean("camera_torch_supported", false);
    }

    /* renamed from: b */
    public final void mo42727b() {
        C20296p.m50061b("TECamera1", "Camera stopPreview...");
        if (this.f55521i && this.f55445a != null) {
            this.f55521i = false;
            this.f55445a.stopPreview();
            this.f55444A = 0;
            C20296p.m50059a("TECamera1", "Camera preview stopped!");
            this.f55522j.mo42784b(4, 0, "TECamera1 preview stoped");
        }
    }

    /* renamed from: j */
    public final boolean mo42738j() {
        try {
            if (this.f55445a == null || this.f55445a.getParameters() == null || this.f55445a.getParameters().getSupportedWhiteBalance() == null || !this.f55445a.getParameters().isAutoWhiteBalanceLockSupported()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Unsupported whileBalance!: ");
            sb.append(e.toString());
            C20296p.m50063d("TECamera1", sb.toString());
            return false;
        }
    }

    /* renamed from: e */
    public final void mo42733e() {
        C20296p.m50061b("TECamera1", "Camera close...");
        if (this.f55445a != null) {
            if (this.f55521i) {
                try {
                    this.f55446b = this.f55445a.getParameters();
                    this.f55446b.setFlashMode("off");
                    this.f55445a.setParameters(this.f55446b);
                    this.f55445a.stopPreview();
                    this.f55445a.setPreviewCallbackWithBuffer(null);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Close camera failed: ");
                    sb.append(e.getMessage());
                    C20296p.m50063d("TECamera1", sb.toString());
                }
                this.f55521i = false;
            }
            try {
                this.f55445a.release();
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder("Camera release failed: ");
                sb2.append(e2.getMessage());
                C20296p.m50063d("TECamera1", sb2.toString());
            }
            this.f55454z.set(false);
            this.f55445a = null;
            C20296p.m50059a("TECamera1", "Camera closed!");
            this.f55522j.mo42783a(this);
        }
    }

    /* renamed from: h */
    public final float[] mo42736h() {
        float[] fArr = new float[2];
        if (this.f55445a == null) {
            String str = "getFOV: camera device is null.";
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, -401, str);
            return new float[]{-2.0f, -2.0f};
        }
        try {
            this.f55446b = this.f55445a.getParameters();
            fArr[0] = this.f55446b.getVerticalViewAngle();
            fArr[1] = this.f55446b.getHorizontalViewAngle();
            StringBuilder sb = new StringBuilder("Camera1:verticalFOV = ");
            sb.append(fArr[0]);
            sb.append(",horizontalFOV = ");
            sb.append(fArr[1]);
            C20296p.m50061b("TECamera1", sb.toString());
            return fArr;
        } catch (Exception unused) {
            return new float[]{-2.0f, -2.0f};
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Bundle mo42667l() {
        boolean z;
        C20275l lVar = this.f55520h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55520h.f55723e);
        lVar.f55740v = sb.toString();
        Bundle l = super.mo42667l();
        l.putParcelableArrayList("support_preview_sizes", (ArrayList) m49766o());
        l.putParcelableArrayList("support_picture_sizes", (ArrayList) m49767p());
        l.putParcelable("camera_preview_size", this.f55520h.f55728j);
        try {
            if (this.f55445a == null || this.f55445a.getParameters() == null || this.f55445a.getParameters().getSupportedFlashModes() == null) {
                z = false;
            } else {
                z = true;
            }
            l.putBoolean("camera_torch_supported", z);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Get camera torch information failed: ");
            sb2.append(e.toString());
            C20296p.m50063d("TECamera1", sb2.toString());
            l.putBoolean("camera_torch_supported", false);
        }
        return l;
    }

    /* renamed from: g */
    public final int mo42735g() {
        int a = C20285m.m50044a(this.f55524l);
        CameraInfo cameraInfo = new CameraInfo();
        this.f55527o = this.f55528p;
        try {
            Camera.getCameraInfo(this.f55520h.f55725g, cameraInfo);
            if (this.f55527o == 1) {
                this.f55529q = (cameraInfo.orientation + a) % 360;
                this.f55529q = ((360 - this.f55529q) + NormalGiftView.ALPHA_180) % 360;
            } else {
                this.f55529q = ((cameraInfo.orientation - a) + 360) % 360;
            }
            StringBuilder sb = new StringBuilder("getFrameOrientation mCameraRotation: ");
            sb.append(this.f55529q);
            C20296p.m50059a("TECamera1", sb.toString());
            StringBuilder sb2 = new StringBuilder("getFrameOrientation mFacing: ");
            sb2.append(this.f55527o);
            C20296p.m50059a("TECamera1", sb2.toString());
            StringBuilder sb3 = new StringBuilder("getFrameOrientation mCameraSettings.mDefaultCameraID: ");
            sb3.append(this.f55520h.f55725g);
            C20296p.m50059a("TECamera1", sb3.toString());
            return this.f55529q;
        } catch (Exception e) {
            C20202a aVar = this.f55522j;
            StringBuilder sb4 = new StringBuilder("getFrameOrientation :");
            sb4.append(e.getMessage());
            aVar.mo42782a(1, -425, sb4.toString());
            return 0;
        }
    }

    /* renamed from: m */
    private int m49764m() {
        int i;
        try {
            if (VERSION.SDK_INT > 8) {
                this.f55449e = Camera.getNumberOfCameras();
                C20239j.m50016a("te_record_camera_size", (long) this.f55449e);
                StringBuilder sb = new StringBuilder("innerOpen mNumberOfCameras: ");
                sb.append(this.f55449e);
                C20296p.m50059a("TECamera1", sb.toString());
                CameraInfo cameraInfo = new CameraInfo();
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f55449e) {
                        break;
                    }
                    Camera.getCameraInfo(i2, cameraInfo);
                    if (cameraInfo.facing == this.f55520h.f55723e) {
                        this.f55520h.f55725g = i2;
                        break;
                    }
                    i2++;
                }
            }
            StringBuilder sb2 = new StringBuilder("innerOpen: ");
            sb2.append(this.f55520h.f55725g);
            C20296p.m50059a("TECamera1", sb2.toString());
            if (this.f55520h.f55725g < 0) {
                this.f55445a = Camera.open();
                this.f55520h.f55723e = 0;
                this.f55528p = this.f55520h.f55723e;
                CameraInfo cameraInfo2 = new CameraInfo();
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f55449e) {
                        break;
                    }
                    Camera.getCameraInfo(i3, cameraInfo2);
                    if (cameraInfo2.facing == this.f55528p) {
                        this.f55520h.f55725g = i3;
                        break;
                    }
                    i3++;
                }
            } else {
                this.f55445a = Camera.open(this.f55520h.f55725g);
            }
            StringBuilder sb3 = new StringBuilder("innerOpen mNewFacing: ");
            sb3.append(this.f55528p);
            C20296p.m50059a("TECamera1", sb3.toString());
            StringBuilder sb4 = new StringBuilder("innerOpen mCameraSettings.mDefaultCameraID: ");
            sb4.append(this.f55520h.f55725g);
            C20296p.m50059a("TECamera1", sb4.toString());
            if (this.f55445a == null) {
                StringBuilder sb5 = new StringBuilder("Open Camera Failed width ID:");
                sb5.append(this.f55520h.f55725g);
                C20296p.m50063d("TECamera1", sb5.toString());
                this.f55522j.mo42781a(1, -401, (C20201f) null);
                return -401;
            }
            try {
                i = m49765n();
                try {
                    mo42667l();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                i = 0;
                StringBuilder sb6 = new StringBuilder("Open init Camera Failed!: ");
                sb6.append(Log.getStackTraceString(e));
                C20296p.m50063d("TECamera1", sb6.toString());
                C20225h.m49990a(e);
                this.f55522j.mo42781a(1, i, (C20201f) this);
                return i;
            }
            this.f55522j.mo42781a(1, i, (C20201f) this);
            return i;
        } catch (RuntimeException e3) {
            StringBuilder sb7 = new StringBuilder("Open Camera Failed!: ");
            sb7.append(Log.getStackTraceString(e3));
            C20296p.m50063d("TECamera1", sb7.toString());
            C20225h.m49990a(e3);
            this.f55445a = null;
            this.f55522j.mo42781a(1, -401, (C20201f) null);
            return -401;
        }
    }

    /* renamed from: a */
    public final void mo42715a() {
        int i;
        C20296p.m50059a("TECamera1", "Camera startPreview...");
        if (this.f55521i) {
            C20296p.m50062c("TECamera1", "Camera is previewing...");
            return;
        }
        if (this.f55445a != null) {
            try {
                if (this.f55526n != null) {
                    this.f55446b = this.f55445a.getParameters();
                    List a = m49763a(this.f55446b.getSupportedPreviewSizes());
                    C20217c cVar = this.f55526n;
                    TEFrameSizei tEFrameSizei = this.f55520h.f55728j;
                    if (cVar.f55554b != null) {
                        i = cVar.f55554b.mo42800a(a, tEFrameSizei);
                    } else {
                        i = -112;
                    }
                    if (i != 0) {
                        StringBuilder sb = new StringBuilder("Init provider failed, ret = ");
                        sb.append(i);
                        C20296p.m50063d("TECamera1", sb.toString());
                        return;
                    }
                    if (this.f55526n.mo42812a() == 1) {
                        if (this.f55526n.mo42816d() != null) {
                            this.f55445a.setPreviewTexture(this.f55526n.mo42816d());
                        } else {
                            C20296p.m50063d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else if (this.f55526n.mo42812a() == 4) {
                        C20212a aVar = (C20212a) this.f55526n.f55554b;
                        if (aVar == null) {
                            throw new AndroidRuntimeException("Provider is null");
                        } else if (this.f55526n.mo42816d() != null) {
                            if (this.f55454z.compareAndSet(false, true)) {
                                for (byte[] addCallbackBuffer : (byte[][]) Array.newInstance(byte.class, new int[]{3, ((aVar.f55548e.f55398a * aVar.f55548e.f55399b) * 3) / 2})) {
                                    this.f55445a.addCallbackBuffer(addCallbackBuffer);
                                }
                            }
                            this.f55445a.setPreviewCallbackWithBuffer(aVar.f55541a);
                            this.f55445a.setPreviewTexture(this.f55526n.mo42816d());
                        } else {
                            C20296p.m50063d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Unsupported camera provider type : ");
                        sb2.append(this.f55526n.mo42812a());
                        C20296p.m50063d("TECamera1", sb2.toString());
                        return;
                    }
                    TEFrameSizei e = this.f55526n.mo42817e();
                    if (e != null) {
                        if (!(this.f55446b.getPreviewSize().width == e.f55398a && this.f55446b.getPreviewSize().height == e.f55399b)) {
                            this.f55446b.setPreviewSize(e.f55398a, e.f55399b);
                            if (this.f55520h.f55733o) {
                                this.f55520h.f55729k = C20285m.m50047a(m49763a(this.f55446b.getSupportedPictureSizes()), e, this.f55520h.f55731m);
                                this.f55446b.setPictureSize(this.f55520h.f55729k.f55398a, this.f55520h.f55729k.f55399b);
                            }
                            this.f55445a.setParameters(this.f55446b);
                        }
                        this.f55522j.mo42784b(50, 0, e.toString());
                    }
                    this.f55445a.setErrorCallback(new ErrorCallback() {
                        public final void onError(int i, Camera camera) {
                            String str;
                            C20239j.m50016a("te_record_camera_err_ret", (long) i);
                            if (i == 100) {
                                str = "Camera server died!";
                            } else if (VERSION.SDK_INT >= 23 && i == 2) {
                                StringBuilder sb = new StringBuilder("Camera disconnected: ");
                                sb.append(i);
                                str = sb.toString();
                            } else if (i == 1) {
                                StringBuilder sb2 = new StringBuilder("Camera unknown error: ");
                                sb2.append(i);
                                str = sb2.toString();
                            } else {
                                StringBuilder sb3 = new StringBuilder("Ignore camera error here: ");
                                sb3.append(i);
                                C20296p.m50062c("TECamera1", sb3.toString());
                                return;
                            }
                            C20296p.m50063d("TECamera1", str);
                            C20169c.this.mo42733e();
                            if (i == 2) {
                                C20169c.this.f55522j.mo42783a(C20169c.this);
                            } else {
                                C20169c.this.f55522j.mo42782a(1, -425, str);
                            }
                        }
                    });
                    this.f55520h.f55724f = mo42735g();
                    StringBuilder sb3 = new StringBuilder("Camera rotation = ");
                    sb3.append(this.f55520h.f55724f);
                    C20296p.m50061b("TECamera1", sb3.toString());
                    this.f55445a.startPreview();
                    if (this.f55520h.f55737s.getBoolean("useCameraFaceDetect")) {
                        try {
                            this.f55445a.startFaceDetection();
                        } catch (Exception unused) {
                            C20296p.m50063d("TECamera1", "camera start face detect failed");
                        }
                    }
                    this.f55444A = System.currentTimeMillis();
                    this.f55521i = true;
                    this.f55522j.mo42784b(0, 0, "TECamera1 preview");
                    return;
                }
                throw new AndroidRuntimeException("ProviderManager is null");
            } catch (Exception e2) {
                StringBuilder sb4 = new StringBuilder("startPreview: Error ");
                sb4.append(e2.getMessage());
                C20296p.m50063d("TECamera1", sb4.toString());
                C20225h.m49990a(e2);
                this.f55521i = false;
                try {
                    this.f55445a.release();
                } catch (Exception unused2) {
                }
                this.f55445a = null;
                this.f55522j.mo42782a(1, -425, e2.getMessage());
            }
        }
    }

    /* renamed from: n */
    private int m49765n() {
        int[] iArr;
        String str;
        String str2;
        boolean z;
        TEFrameSizei tEFrameSizei;
        if (this.f55445a == null) {
            String str3 = "initCamera: Camera is not opened!";
            C20296p.m50063d("TECamera1", str3);
            this.f55522j.mo42782a(1, -401, str3);
            return -401;
        }
        this.f55446b = this.f55445a.getParameters();
        List supportedPreviewFpsRange = this.f55446b.getSupportedPreviewFpsRange();
        int i = 1000;
        if (supportedPreviewFpsRange.size() <= 0 || ((int[]) supportedPreviewFpsRange.get(0))[1] <= 1000) {
            i = 1;
        }
        if (this.f55520h.f55716A == 0) {
            iArr = C20285m.m50054a(this.f55520h.f55722d.mo42933a(i), supportedPreviewFpsRange);
        } else {
            if (this.f55520h.f55716A == 2 && this.f55446b.isAutoExposureLockSupported()) {
                this.f55446b.setAutoExposureLock(true);
            }
            iArr = C20285m.m50055b(this.f55520h.f55722d.mo42933a(i), supportedPreviewFpsRange);
        }
        if (iArr != null) {
            this.f55520h.f55722d.f55772a = iArr[0];
            this.f55520h.f55722d.f55773b = iArr[1];
        }
        this.f55520h.f55722d.f55774c = i;
        StringBuilder sb = new StringBuilder("Selected FPS Range: ");
        sb.append(this.f55520h.f55722d.f55772a);
        sb.append(",");
        sb.append(this.f55520h.f55722d.f55773b);
        C20296p.m50061b("TECamera1", sb.toString());
        this.f55520h.f55728j = C20285m.m50046a(m49766o(), this.f55520h.f55728j);
        StringBuilder sb2 = new StringBuilder("Preview Size:");
        sb2.append(this.f55520h.f55728j);
        C20296p.m50059a("TECamera1", sb2.toString());
        this.f55446b.setPictureFormat(UnReadVideoExperiment.BROWSE_RECORD_LIST);
        this.f55446b.setJpegQuality(100);
        if (this.f55520h.f55733o) {
            this.f55520h.f55729k = C20285m.m50047a(m49763a(this.f55446b.getSupportedPictureSizes()), this.f55520h.f55728j, this.f55520h.f55731m);
        } else {
            if (this.f55531s != null) {
                tEFrameSizei = this.f55531s.mo42785a(m49763a(this.f55446b.getSupportedPictureSizes()), m49763a(this.f55446b.getSupportedPreviewSizes()));
            } else {
                tEFrameSizei = null;
            }
            if (tEFrameSizei != null) {
                this.f55520h.f55729k = tEFrameSizei;
            } else {
                this.f55520h.f55729k = C20285m.m50048a(m49767p(), this.f55520h.f55728j, this.f55520h.f55729k);
            }
        }
        if (this.f55520h.f55729k != null) {
            this.f55446b.setPictureSize(this.f55520h.f55729k.f55398a, this.f55520h.f55729k.f55399b);
            StringBuilder sb3 = new StringBuilder("Picture Size:");
            sb3.append(this.f55520h.f55729k);
            C20296p.m50059a("TECamera1", sb3.toString());
        } else {
            C20296p.m50063d("TECamera1", "No closest supported picture size");
        }
        this.f55446b.setPreviewSize(this.f55520h.f55728j.f55398a, this.f55520h.f55728j.f55399b);
        if (this.f55520h.f55737s == null || !this.f55520h.f55737s.getBoolean("enable_dim_light_quality") || this.f55520h.f55722d.f55772a <= this.f55520h.f55722d.f55773b) {
            this.f55446b.setPreviewFpsRange(this.f55520h.f55722d.f55772a, this.f55520h.f55722d.f55773b);
            if (this.f55520h.f55716A == 1) {
                this.f55446b.setRecordingHint(true);
                StringBuilder sb4 = new StringBuilder();
                sb4.append(Integer.toString(this.f55520h.f55728j.f55398a));
                sb4.append("x");
                sb4.append(Integer.toString(this.f55520h.f55728j.f55399b));
                this.f55446b.set("video-size", sb4.toString());
            }
        }
        this.f55446b.setWhiteBalance("auto");
        this.f55446b.setSceneMode("auto");
        this.f55446b.setPreviewFormat(this.f55520h.f55726h);
        this.f55445a.setParameters(this.f55446b);
        if (this.f55520h.f55717B && VERSION.SDK_INT >= 15) {
            if (this.f55446b.isVideoStabilizationSupported()) {
                this.f55446b.setVideoStabilization(true);
                C20239j.m50016a("te_record_camera_stabilization", 1);
            } else {
                C20239j.m50016a("te_record_camera_stabilization", 0);
            }
        }
        C20161b bVar = this.f55447c;
        int i2 = this.f55520h.f55723e;
        Parameters parameters = this.f55446b;
        boolean z2 = this.f55520h.f55737s.getBoolean("enableFrontFacingVideoContinueFocus");
        if (parameters == null) {
            str = "";
        } else {
            String str4 = "";
            bVar.f55430d = i2;
            List supportedFocusModes = parameters.getSupportedFocusModes();
            if (i2 == 1) {
                if (z2 && supportedFocusModes.contains("continuous-video")) {
                    str = "continuous-video";
                } else if (supportedFocusModes.contains("macro")) {
                    str = "macro";
                } else if (supportedFocusModes.contains("auto")) {
                    str = "auto";
                }
            } else if (supportedFocusModes.contains("continuous-video")) {
                str = "continuous-video";
            } else if (supportedFocusModes.contains("continuous-picture")) {
                str = "continuous-picture";
            } else if (supportedFocusModes.contains("auto")) {
                str = "auto";
            }
            str = str4;
        }
        this.f55448d = str;
        if (this.f55448d != "") {
            this.f55446b.setFocusMode(this.f55448d);
        } else {
            StringBuilder sb5 = new StringBuilder("No Supported Focus Mode for Facing");
            sb5.append(this.f55520h.f55723e);
            C20296p.m50062c("TECamera1", sb5.toString());
        }
        this.f55520h.f55742x.f55745a = this.f55446b.getMaxExposureCompensation();
        this.f55520h.f55742x.f55747c = this.f55446b.getMinExposureCompensation();
        this.f55520h.f55742x.f55748d = this.f55446b.getExposureCompensationStep();
        this.f55520h.f55742x.f55746b = this.f55446b.getExposureCompensation();
        if (this.f55520h.f55727i) {
            String str5 = this.f55446b.get("zsl-values");
            if ("off".equals(this.f55446b.get("zsl")) && str5 != null && str5.contains("on")) {
                this.f55446b.set("zsl", "on");
            }
            this.f55519g = "on".equals(this.f55446b.get("zsl"));
            if (!this.f55519g && this.f55520h.f55727i && TextUtils.isEmpty(str5) && (!TextUtils.isEmpty(C20183d.f55492a))) {
                if (!C20183d.f55494c) {
                    if (Collections.unmodifiableList(C20183d.f55493b).indexOf(C20183d.f55492a) < 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C20183d.f55494c = z;
                }
                if (C20183d.f55494c) {
                    String str6 = this.f55446b.get("zsd-mode-values");
                    if ("off".equals(this.f55446b.get("zsd-mode")) && str6 != null && str6.contains("on")) {
                        this.f55446b.set("zsd-mode", "on");
                    }
                    this.f55519g = "on".equals(this.f55446b.get("zsd-mode"));
                }
            }
        }
        String str7 = "TECamera1";
        String str8 = "%s zsl";
        Object[] objArr = new Object[1];
        if (this.f55519g) {
            str2 = "Enable";
        } else {
            str2 = "Disable";
        }
        objArr[0] = str2;
        C20296p.m50059a(str7, C2240a.m6772a(str8, objArr));
        this.f55452x = null;
        if (this.f55446b.isZoomSupported()) {
            this.f55452x = this.f55446b.getZoomRatios();
            Collections.sort(this.f55452x);
            this.f55453y = 100.0f;
        } else {
            C20296p.m50063d("TECamera1", "camera don't support zoom");
        }
        if (this.f55520h.f55737s.containsKey("enableShutterSound") && VERSION.SDK_INT >= 17) {
            try {
                this.f55445a.enableShutterSound(this.f55520h.f55737s.getBoolean("enableShutterSound"));
            } catch (Exception e) {
                StringBuilder sb6 = new StringBuilder("unsupport enableShutterSound, ");
                sb6.append(e.getMessage());
                C20296p.m50063d("TECamera1", sb6.toString());
            }
        }
        this.f55445a.setParameters(this.f55446b);
        try {
            this.f55445a.setDisplayOrientation(0);
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo42713a(C20275l lVar) {
        this.f55520h = lVar;
        this.f55528p = lVar.f55723e;
        return m49764m();
    }

    /* renamed from: a */
    public final void mo42718a(int i) {
        String str = "Does not support switch mode for camera1";
        C20296p.m50062c("TECamera1", str);
        this.f55522j.mo42784b(this.f55520h.f55721c, -200, str);
    }

    /* renamed from: a */
    private static List<TEFrameSizei> m49763a(List<Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void mo42729b(C20284i iVar) {
        if (this.f55445a == null) {
            String str = "stopZoom : Camera is null!";
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, -401, str);
            return;
        }
        try {
            if (this.f55445a.getParameters().isSmoothZoomSupported() && iVar != null && iVar.mo42923a()) {
                this.f55445a.stopSmoothZoom();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Stop zoom failed : ");
            sb.append(e.toString());
            String sb2 = sb.toString();
            C20296p.m50063d("TECamera1", sb2);
            this.f55522j.mo42782a(1, -420, sb2);
        }
    }

    /* renamed from: a */
    public final void mo42716a(float f) {
        if (this.f55452x != null && this.f55445a != null) {
            this.f55453y *= f;
            try {
                int i = 0;
                if (this.f55453y < ((float) ((Integer) this.f55452x.get(0)).intValue())) {
                    this.f55453y = (float) ((Integer) this.f55452x.get(0)).intValue();
                }
                if (this.f55453y > ((float) ((Integer) this.f55452x.get(this.f55452x.size() - 1)).intValue())) {
                    this.f55453y = (float) ((Integer) this.f55452x.get(this.f55452x.size() - 1)).intValue();
                }
                Parameters parameters = this.f55445a.getParameters();
                if (parameters != null) {
                    int i2 = (int) this.f55453y;
                    int size = this.f55452x.size() - 1;
                    while (size - i > 1) {
                        int i3 = (i + size) / 2;
                        if (i2 > ((Integer) this.f55452x.get(i3)).intValue()) {
                            i = i3;
                        } else {
                            size = i3;
                        }
                    }
                    if (Math.abs(i2 - ((Integer) this.f55452x.get(i)).intValue()) > Math.abs(i2 - ((Integer) this.f55452x.get(size)).intValue())) {
                        i = size;
                    }
                    if (parameters.getZoom() != i) {
                        parameters.setZoom(i);
                        this.f55445a.setParameters(parameters);
                    }
                    return;
                }
                C20296p.m50063d("TECamera1", "setZoom failed for getParameters null");
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("setZoom failed, ");
                sb.append(e.getMessage());
                C20296p.m50063d("TECamera1", sb.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo42728b(int i) {
        String str;
        int i2 = -413;
        if (this.f55445a == null || this.f55446b == null || !this.f55521i || !this.f55520h.f55742x.mo42918a()) {
            if (this.f55445a == null || this.f55446b == null || !this.f55521i) {
                str = "setExposureCompensation ： Camera is null.";
                this.f55522j.mo42782a(1, -401, str);
            } else {
                i2 = -414;
                str = "Unsupported exposure compensation!";
            }
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, i2, str);
        } else if (i > this.f55520h.f55742x.f55745a || i < this.f55520h.f55742x.f55747c) {
            StringBuilder sb = new StringBuilder("Invalid exposure: ");
            sb.append(i);
            this.f55522j.mo42782a(1, -415, sb.toString());
        } else {
            try {
                this.f55446b.setExposureCompensation(i);
                this.f55445a.setParameters(this.f55446b);
                this.f55520h.f55742x.f55746b = this.f55446b.getExposureCompensation();
                StringBuilder sb2 = new StringBuilder("EC = ");
                sb2.append(this.f55520h.f55742x.f55746b);
                sb2.append(", EV = ");
                sb2.append(((float) this.f55520h.f55742x.f55746b) * this.f55520h.f55742x.f55748d);
                C20296p.m50059a("TECamera1", sb2.toString());
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder("Error: setExposureCompensation failed: ");
                sb3.append(e.toString());
                String sb4 = sb3.toString();
                C20296p.m50063d("TECamera1", sb4);
                this.f55522j.mo42782a(1, -413, sb4);
            }
        }
    }

    /* renamed from: c */
    public final void mo42731c(final int i) {
        if (this.f55445a == null || !this.f55521i) {
            String str = "switchFlashMode failed: Camera is not ready!";
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, -401, str);
        } else if (this.f55444A == 0 || System.currentTimeMillis() - this.f55444A >= 200 || this.f55523k == null) {
            try {
                this.f55446b = this.f55445a.getParameters();
                List supportedFlashModes = this.f55446b.getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    String str2 = null;
                    switch (i) {
                        case 0:
                            str2 = "off";
                            break;
                        case 1:
                            str2 = "on";
                            break;
                        case 2:
                            str2 = "torch";
                            break;
                        case 3:
                            str2 = "auto";
                            break;
                        case 4:
                            str2 = "red-eye";
                            break;
                    }
                    if (str2 == this.f55446b.getFlashMode()) {
                        C20296p.m50063d("TECamera1", "no need switchFlashMode");
                        return;
                    } else if (str2 != null && supportedFlashModes.contains(str2)) {
                        this.f55446b.setFlashMode(str2);
                        this.f55445a.setParameters(this.f55446b);
                        if (str2 == "off" && this.f55520h.f55737s.getBoolean("enableSwitchFlashSleepToTakeEffect")) {
                            try {
                                Thread.sleep(200);
                                return;
                            } catch (InterruptedException unused) {
                            }
                        }
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder("Camera does not support flash mode: !");
                sb.append(i);
                String sb2 = sb.toString();
                C20296p.m50063d("TECamera1", sb2);
                this.f55522j.mo42782a(1, -419, sb2);
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder("Switch flash mode failed: ");
                sb3.append(e.toString());
                String sb4 = sb3.toString();
                C20296p.m50063d("TECamera1", sb4);
                this.f55522j.mo42782a(1, -418, sb4);
            }
        } else {
            this.f55523k.postDelayed(new Runnable() {
                public final void run() {
                    C20169c.this.mo42731c(i);
                }
            }, 200);
        }
    }

    /* renamed from: a */
    public final TEFrameSizei mo42714a(float f, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2;
        if (this.f55445a == null) {
            C20296p.m50063d("TECamera1", "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.f55446b == null) {
            this.f55446b = this.f55445a.getParameters();
        }
        if (tEFrameSizei != null) {
            tEFrameSizei2 = C20285m.m50046a(m49766o(), tEFrameSizei);
        } else {
            tEFrameSizei2 = C20285m.m50045a(m49766o(), f);
        }
        return tEFrameSizei2;
    }

    /* renamed from: a */
    public final void mo42717a(float f, final C20284i iVar) {
        if (this.f55445a == null) {
            String str = "startZoom : Camera is null!";
            C20296p.m50063d("TECamera1", str);
            this.f55522j.mo42782a(1, -401, str);
            return;
        }
        try {
            this.f55446b = this.f55445a.getParameters();
            if (this.f55446b.isZoomSupported() || this.f55446b.isSmoothZoomSupported()) {
                int min = (int) Math.min((float) this.f55446b.getMaxZoom(), f);
                if (!this.f55446b.isSmoothZoomSupported() || iVar == null || !iVar.mo42923a()) {
                    this.f55446b.setZoom(min);
                    this.f55445a.setParameters(this.f55446b);
                    if (iVar != null) {
                        iVar.mo42921a(1, (float) min, true);
                    }
                    return;
                }
                this.f55445a.startSmoothZoom(min);
                this.f55445a.setZoomChangeListener(new OnZoomChangeListener() {
                    public final void onZoomChange(int i, boolean z, Camera camera) {
                        if (iVar != null) {
                            iVar.mo42921a(1, (float) i, z);
                        }
                    }
                });
                return;
            }
            String str2 = "Camera is not support zoom!";
            C20296p.m50063d("TECamera1", str2);
            this.f55522j.mo42782a(1, -421, str2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Start zoom failed : ");
            sb.append(e.toString());
            String sb2 = sb.toString();
            C20296p.m50063d("TECamera1", sb2);
            this.f55522j.mo42782a(1, -420, sb2);
        }
    }

    /* renamed from: a */
    public static C20169c m49762a(Context context, C20202a aVar, Handler handler, C20203b bVar) {
        return new C20169c(context, aVar, handler, bVar);
    }

    private C20169c(Context context, C20202a aVar, Handler handler, C20203b bVar) {
        super(context, aVar, handler, bVar);
        this.f55520h = new C20275l(context, 1);
        this.f55447c = new C20161b(1);
    }

    /* renamed from: a */
    public final void mo42719a(int i, int i2, float f, int i3, int i4) {
        C20294n nVar = new C20294n(i, i2, i3, i4, f);
        mo42724a(nVar);
    }
}
