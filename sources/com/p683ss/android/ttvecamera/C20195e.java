package com.p683ss.android.ttvecamera;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.util.Size;
import android.util.SizeF;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ttvecamera.C20201f.C20202a;
import com.p683ss.android.ttvecamera.C20201f.C20203b;
import com.p683ss.android.ttvecamera.C20275l.C20281f;
import com.p683ss.android.ttvecamera.C20275l.C20283h;
import com.p683ss.android.ttvecamera.C20275l.C20284i;
import com.p683ss.android.ttvecamera.p1226a.C20148a;
import com.p683ss.android.ttvecamera.p1228c.C20177b;
import com.p683ss.android.ttvecamera.p1229d.C20186c;
import com.p683ss.android.ttvecamera.p1230e.C20197a;
import com.p683ss.android.ttvecamera.p1231f.C20205a;
import com.p683ss.android.ttvecamera.p1233h.C20227a;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.e */
public abstract class C20195e extends C20201f {

    /* renamed from: a */
    protected C20186c f55507a;

    /* renamed from: b */
    protected volatile int f55508b;

    /* renamed from: c */
    protected CameraCharacteristics f55509c;

    /* renamed from: d */
    protected CaptureRequest f55510d;

    /* renamed from: e */
    protected boolean f55511e = true;

    /* renamed from: f */
    public C20177b f55512f;

    /* renamed from: com.ss.android.ttvecamera.e$a */
    public static class C20196a<T> {

        /* renamed from: a */
        WeakReference<C20195e> f55513a;

        public C20196a(C20195e eVar) {
            this.f55513a = new WeakReference<>(eVar);
        }

        /* renamed from: b */
        public final boolean mo42776b(T t) {
            C20296p.m50059a("TECamera2", "StateCallback::onDisconnected...");
            C20195e eVar = (C20195e) this.f55513a.get();
            if (eVar == null) {
                return false;
            }
            eVar.mo42672q();
            return true;
        }

        /* renamed from: a */
        public final boolean mo42774a(T t) {
            C20296p.m50059a("TECamera2", "StateCallback::onOpened...");
            C20195e eVar = (C20195e) this.f55513a.get();
            if (eVar == null) {
                return false;
            }
            eVar.f55508b = 2;
            if (eVar.f55522j != null) {
                eVar.f55522j.mo42781a(2, 0, (C20201f) null);
            } else {
                C20296p.m50063d("TECamera2", "mCameraEvents is null!");
            }
            eVar.f55511e = false;
            return true;
        }

        /* renamed from: a */
        public final boolean mo42775a(T t, int i) {
            C20296p.m50059a("TECamera2", "StateCallback::onError...");
            C20195e eVar = (C20195e) this.f55513a.get();
            if (eVar == null) {
                return false;
            }
            eVar.mo42672q();
            if (eVar.f55522j != null) {
                eVar.f55522j.mo42781a(eVar.f55520h.f55721c, i, (C20201f) null);
            }
            eVar.f55508b = 4;
            return true;
        }
    }

    /* renamed from: b */
    public final void mo42728b(int i) {
    }

    /* renamed from: b */
    public final void mo42729b(C20284i iVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo42666d(int i);

    /* renamed from: f */
    public final int mo42734f() {
        return 2;
    }

    /* renamed from: j */
    public final boolean mo42738j() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo42668m() throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo42669n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo42670o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract boolean mo42671p();

    /* renamed from: a */
    public final void mo42720a(int i, int i2, C20281f fVar) {
        if (this.f55508b == 1) {
            C20296p.m50061b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f55508b == 2) {
            C20296p.m50061b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!mo42671p() || this.f55512f == null) {
            String str = "takePicture : camera is null.";
            C20296p.m50063d("TECamera2", str);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str);
        } else {
            this.f55512f.mo42681a(i, i2, fVar);
        }
    }

    /* renamed from: a */
    public final void mo42721a(C20281f fVar) {
        if (this.f55508b == 1) {
            C20296p.m50061b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f55508b == 2) {
            C20296p.m50061b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!mo42671p() || this.f55512f == null) {
            String str = "takePicture : camera is null.";
            C20296p.m50063d("TECamera2", str);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str);
        } else {
            this.f55512f.mo42682a(fVar, this.f55528p);
        }
    }

    /* renamed from: a */
    public final void mo42719a(int i, int i2, float f, int i3, int i4) {
        C20296p.m50061b("TECamera2", "setFocusAreas...");
        if (this.f55508b == 1) {
            C20296p.m50061b("TECamera2", "Camera is opening, ignore setFocusAreas operation.");
        } else if (!mo42671p() || this.f55512f == null) {
            String str = "focusAtPoint : camera is null.";
            C20296p.m50063d("TECamera2", str);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str);
        } else {
            C20177b bVar = this.f55512f;
            C20294n nVar = new C20294n(i, i2, i3, i4, f);
            bVar.mo42747a(nVar);
        }
    }

    /* renamed from: a */
    public final void mo42724a(C20294n nVar) {
        C20296p.m50061b("TECamera2", "setFocusAreas...");
        if (this.f55508b == 1) {
            C20296p.m50061b("TECamera2", "Camera is opening, ignore setFocusAreas operation.");
        } else if (!mo42671p() || this.f55512f == null) {
            String str = "focusAtPoint : camera is null.";
            C20296p.m50063d("TECamera2", str);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str);
        } else {
            int a = this.f55512f.mo42747a(nVar);
            if (a != 0) {
                this.f55522j.mo42782a(this.f55520h.f55721c, a, "focusAtPoint : something wrong.");
            }
        }
    }

    /* renamed from: a */
    public final void mo42726a(boolean z, String str) {
        StringBuilder sb = new StringBuilder("setWhileBalance: ");
        sb.append(str);
        C20296p.m50061b("TECamera2", sb.toString());
        if (this.f55508b == 1) {
            C20296p.m50063d("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
        } else if (!mo42671p() || this.f55512f == null) {
            String str2 = "setWhileBalance : camera is null.";
            C20296p.m50063d("TECamera2", str2);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str2);
        } else {
            this.f55512f.mo42751a(z, str);
        }
    }

    /* renamed from: a */
    public final void mo42725a(boolean z) {
        StringBuilder sb = new StringBuilder("toggleTorch: ");
        sb.append(z);
        C20296p.m50061b("TECamera2", sb.toString());
        if (this.f55508b == 1) {
            C20296p.m50061b("TECamera2", "Camera is opening, ignore toggleTorch operation.");
        } else if (!mo42671p() || this.f55512f == null) {
            String str = "Toggle torch failed, you must open camera first.";
            C20296p.m50063d("TECamera2", str);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str);
        } else {
            this.f55512f.mo42748a(z);
        }
    }

    /* renamed from: a */
    public final void mo42723a(C20284i iVar) {
        String str = "";
        if (!mo42671p() || this.f55512f == null || this.f55512f.f55475n == null) {
            String str2 = "queryZoomAbility: camera is null.";
            C20296p.m50063d("TECamera2", str2);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str2);
        } else if (this.f55507a == null) {
            C20296p.m50063d("TECamera2", "DeviceProxy is null!");
            this.f55522j.mo42782a(this.f55520h.f55721c, -420, str);
        } else {
            CameraCharacteristics cameraCharacteristics = this.f55512f.f55475n;
            int i = this.f55520h.f55721c;
            float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
            if (i != 7) {
                floatValue /= 2.0f;
            }
            float f = floatValue;
            this.f55530r = f;
            StringBuilder sb = new StringBuilder("zoom: ");
            sb.append(f);
            C20296p.m50061b("TECamera2", sb.toString());
            if (iVar != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf((int) (100.0f * f)));
                iVar.mo42922a(this.f55520h.f55721c, f > 0.0f, false, f, arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo42722a(C20283h hVar) {
        String str = "";
        if (!mo42671p() || this.f55512f == null || this.f55512f.f55475n == null) {
            String str2 = "queryShaderZoomStep: camera is null.";
            C20296p.m50063d("TECamera2", str2);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str2);
        } else if (this.f55507a == null) {
            C20296p.m50063d("TECamera2", "DeviceProxy is null!");
            this.f55522j.mo42782a(this.f55520h.f55721c, -420, str);
        } else {
            CameraCharacteristics cameraCharacteristics = this.f55512f.f55475n;
            float floatValue = ((Float) cameraCharacteristics.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
            Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            Float.valueOf(new DecimalFormat("0.00").format((double) ((((float) (rect.width() - ((int) (((float) rect.width()) / floatValue)))) / floatValue) / ((float) rect.width())))).floatValue();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo42672q() {
        this.f55508b = 0;
        this.f55509c = null;
        this.f55510d = null;
    }

    /* renamed from: e */
    public final void mo42733e() {
        C20296p.m50061b("TECamera2", "close...");
        if (this.f55508b == 1) {
            C20296p.m50059a("TECamera2", "Camera is opening or pending, ignore close operation.");
            return;
        }
        mo42672q();
        this.f55522j.mo42783a(this);
    }

    /* renamed from: b */
    public final void mo42727b() {
        C20296p.m50061b("TECamera2", "stopCapture...");
        if (!mo42671p()) {
            C20296p.m50063d("TECamera2", "Device is not ready.");
            return;
        }
        if (this.f55508b != 3) {
            StringBuilder sb = new StringBuilder("Invalid state: ");
            sb.append(this.f55508b);
            C20296p.m50061b("TECamera2", sb.toString());
        }
        mo42670o();
    }

    /* renamed from: i */
    public final void mo42737i() {
        if (this.f55508b == 1) {
            C20296p.m50061b("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!mo42671p() || this.f55512f == null) {
            String str = "cancelFocus : camera is null.";
            C20296p.m50063d("TECamera2", str);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str);
        } else {
            this.f55512f.mo42756k();
        }
    }

    /* renamed from: k */
    public final boolean mo42739k() {
        String str = "";
        if (!mo42671p() || this.f55512f == null || this.f55512f.f55475n == null) {
            String str2 = "Query torch info failed, you must open camera first.";
            C20296p.m50063d("TECamera2", str2);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str2);
            return false;
        } else if (this.f55507a != null) {
            return ((Bundle) this.f55534v.get(this.f55520h.f55740v)).getBoolean("camera_torch_supported", false);
        } else {
            C20296p.m50063d("TECamera2", "DeviceProxy is null!");
            this.f55522j.mo42782a(this.f55520h.f55721c, -417, str);
            return false;
        }
    }

    /* renamed from: g */
    public final int mo42735g() {
        int i;
        int a = C20285m.m50044a(this.f55524l);
        this.f55527o = this.f55528p;
        if (this.f55509c != null) {
            i = ((Integer) this.f55509c.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } else {
            i = this.f55520h.f55724f;
            C20296p.m50059a("TECamera2", "mCameraCharacteristics is null,use settings rotation");
        }
        StringBuilder sb = new StringBuilder("getFrameOrientation senserOrientation: ");
        sb.append(i);
        C20296p.m50059a("TECamera2", sb.toString());
        if (this.f55527o == 1) {
            this.f55529q = (i + a) % 360;
            this.f55529q = ((360 - this.f55529q) + NormalGiftView.ALPHA_180) % 360;
        } else {
            this.f55529q = ((i - a) + 360) % 360;
        }
        StringBuilder sb2 = new StringBuilder("getFrameOrientation mCameraRotation: ");
        sb2.append(this.f55529q);
        C20296p.m50059a("TECamera2", sb2.toString());
        StringBuilder sb3 = new StringBuilder("getFrameOrientation mCameraSettings.mFacing: ");
        sb3.append(this.f55520h.f55723e);
        C20296p.m50059a("TECamera2", sb3.toString());
        return this.f55529q;
    }

    /* renamed from: a */
    public final void mo42715a() {
        C20296p.m50059a("TECamera2", "Camera startCapture...");
        if (!mo42671p() || this.f55526n == null) {
            C20296p.m50063d("TECamera2", "Device is not ready.");
        } else if (this.f55508b == 2 || this.f55508b == 3) {
            try {
                this.f55520h.f55724f = mo42735g();
                StringBuilder sb = new StringBuilder("Camera rotation = ");
                sb.append(this.f55520h.f55724f);
                C20296p.m50059a("TECamera2", sb.toString());
            } catch (Exception e) {
                C20225h.m49990a(e);
                mo42672q();
                if (this.f55522j != null) {
                    this.f55522j.mo42781a(2, -425, (C20201f) null);
                }
            }
            mo42669n();
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid state: ");
            sb2.append(this.f55508b);
            C20296p.m50061b("TECamera2", sb2.toString());
        }
    }

    /* renamed from: h */
    public final float[] mo42736h() {
        C20296p.m50061b("TECamera2", "getVFOV...");
        if (this.f55508b == 1) {
            C20296p.m50061b("TECamera2", "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        } else if (!mo42671p() || this.f55512f == null) {
            String str = "getFOV : camera is null.";
            C20296p.m50063d("TECamera2", str);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str);
            return new float[]{-2.0f, -2.0f};
        } else {
            C20177b bVar = this.f55512f;
            if (bVar.f55473l == null || bVar.f55477p == null || bVar.f55486y == null || bVar.f55478q == null) {
                C20296p.m50062c("TECameraModeBase", "Env is null");
                return new float[]{-2.0f, -2.0f};
            }
            float[] fArr = new float[2];
            double[] dArr = new double[2];
            SizeF sizeF = (SizeF) bVar.f55475n.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            Rect rect = (Rect) bVar.f55475n.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            Size size = (Size) bVar.f55475n.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
            Float f = (Float) bVar.f55478q.get(CaptureRequest.LENS_FOCAL_LENGTH);
            int abs = StrictMath.abs(rect.right - rect.left);
            int abs2 = StrictMath.abs(rect.top - rect.bottom);
            int i = bVar.f55472k.f55728j.f55398a;
            int i2 = bVar.f55472k.f55728j.f55399b;
            if (abs * i2 >= i / abs2) {
                dArr[0] = StrictMath.atan((double) (((sizeF.getWidth() * ((float) abs)) / ((float) size.getWidth())) / (f.floatValue() * 2.0f))) * 2.0d;
                dArr[1] = StrictMath.atan((double) (((((sizeF.getHeight() * ((float) abs2)) / ((float) size.getHeight())) * ((float) (i / i2))) / ((float) (abs / abs2))) / (f.floatValue() * 2.0f))) * 2.0d;
            } else {
                dArr[1] = StrictMath.atan((double) (((sizeF.getHeight() * ((float) abs2)) / ((float) size.getHeight())) / (f.floatValue() * 2.0f))) * 2.0d;
                dArr[0] = StrictMath.atan((double) (((((sizeF.getWidth() * ((float) abs)) / ((float) size.getWidth())) * ((float) (i2 / i))) / ((float) (abs2 / abs))) / (f.floatValue() * 2.0f))) * 2.0d;
            }
            fArr[0] = (float) ((dArr[1] * 180.0d) / 3.141592653589793d);
            fArr[1] = (float) ((dArr[0] * 180.0d) / 3.141592653589793d);
            StringBuilder sb = new StringBuilder("Camera2:verticalFOV = ");
            sb.append(fArr[0]);
            sb.append(",horizontalFOV = ");
            sb.append(fArr[1]);
            C20296p.m50061b("TECameraModeBase", sb.toString());
            return fArr;
        }
    }

    /* renamed from: a */
    public final void mo42718a(int i) {
        if (this.f55508b != 3) {
            StringBuilder sb = new StringBuilder("Invalid state: ");
            sb.append(this.f55508b);
            C20296p.m50061b("TECamera2", sb.toString());
            return;
        }
        mo42666d(i);
    }

    /* renamed from: e */
    public final boolean mo42773e(int i) {
        if (this.f55508b == i) {
            StringBuilder sb = new StringBuilder("No need update state: ");
            sb.append(i);
            C20296p.m50062c("TECamera2", sb.toString());
            return true;
        }
        this.f55508b = i;
        return true;
    }

    /* renamed from: a */
    public final int mo42713a(C20275l lVar) {
        this.f55520h = lVar;
        if (this.f55508b == 4) {
            mo42672q();
        }
        try {
            this.f55508b = 1;
            int m = mo42668m();
            this.f55528p = lVar.f55723e;
            StringBuilder sb = new StringBuilder("open: camera face = ");
            sb.append(this.f55528p);
            C20296p.m50059a("TECamera2", sb.toString());
            if (m == 0) {
                return 0;
            }
            this.f55508b = 0;
            mo42672q();
            if (this.f55522j != null) {
                this.f55522j.mo42781a(2, m, (C20201f) null);
            }
            return -1;
        } catch (Throwable unused) {
            this.f55508b = 4;
            mo42672q();
            if (this.f55522j != null) {
                this.f55522j.mo42781a(2, -401, (C20201f) null);
            }
            return -1;
        }
    }

    /* renamed from: c */
    public final void mo42731c(int i) {
        StringBuilder sb = new StringBuilder("switchFlashMode: ");
        sb.append(i);
        C20296p.m50061b("TECamera2", sb.toString());
        if (this.f55508b == 1) {
            C20296p.m50063d("TECamera2", "Camera is opening, ignore toggleTorch operation.");
        } else if (!mo42671p() || this.f55512f == null) {
            String str = "switch flash mode  failed, you must open camera first.";
            C20296p.m50063d("TECamera2", str);
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, str);
        } else {
            this.f55512f.mo42684b(i);
        }
    }

    /* renamed from: a */
    public final void mo42716a(float f) {
        if (this.f55508b != 3) {
            StringBuilder sb = new StringBuilder("Invalid state, state = ");
            sb.append(this.f55508b);
            this.f55522j.mo42782a(this.f55520h.f55721c, -420, sb.toString());
        } else if (!mo42671p() || this.f55512f == null) {
            this.f55522j.mo42782a(this.f55520h.f55721c, -401, "zoomV2 : Camera is null.");
        } else {
            this.f55512f.mo42753c(f);
        }
    }

    /* renamed from: a */
    public final TEFrameSizei mo42714a(float f, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2;
        if (this.f55508b == 0 || this.f55508b == 1) {
            C20296p.m50063d("TECamera2", "Camera is not opened, ignore getBestPreviewSize operation.");
            return null;
        }
        Size[] outputSizes = ((StreamConfigurationMap) this.f55512f.f55475n.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        if (tEFrameSizei != null) {
            tEFrameSizei2 = C20285m.m50046a((List<TEFrameSizei>) arrayList, tEFrameSizei);
        } else {
            tEFrameSizei2 = C20285m.m50045a((List<TEFrameSizei>) arrayList, f);
        }
        return tEFrameSizei2;
    }

    /* renamed from: a */
    public final void mo42717a(float f, C20284i iVar) {
        if (this.f55508b != 3) {
            StringBuilder sb = new StringBuilder("Invalid state, state = ");
            sb.append(this.f55508b);
            this.f55522j.mo42784b(this.f55520h.f55721c, -420, sb.toString());
        } else if (!mo42671p() || this.f55512f == null) {
            this.f55522j.mo42784b(this.f55520h.f55721c, -401, "startZoom : Camera is null.");
        } else {
            this.f55512f.mo42746a(f, iVar);
        }
    }

    protected C20195e(int i, Context context, C20202a aVar, Handler handler, C20203b bVar) {
        super(context, aVar, handler, bVar);
        this.f55520h = new C20275l(context, i);
        this.f55507a = C20186c.m49825a(context, i);
    }

    /* renamed from: a */
    public static C20195e m49850a(int i, Context context, C20202a aVar, Handler handler, C20203b bVar) {
        if (i == 4 && VERSION.SDK_INT >= 24) {
            C20197a aVar2 = new C20197a(i, context, aVar, handler, bVar);
            return aVar2;
        } else if (i == 5) {
            C20205a aVar3 = new C20205a(i, context, aVar, handler, bVar);
            return aVar3;
        } else if (i == 7) {
            C20227a aVar4 = new C20227a(i, context, aVar, handler, bVar);
            return aVar4;
        } else {
            C20148a aVar5 = new C20148a(i, context, aVar, handler, bVar);
            return aVar5;
        }
    }
}
