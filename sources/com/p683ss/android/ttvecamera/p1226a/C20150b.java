package com.p683ss.android.ttvecamera.p1226a;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.p683ss.android.ttvecamera.C20195e;
import com.p683ss.android.ttvecamera.C20239j;
import com.p683ss.android.ttvecamera.C20285m;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.p1228c.C20177b;
import com.p683ss.android.ttvecamera.p1229d.C20186c;
import com.p683ss.android.ttvecamera.p1229d.C20191g;

/* renamed from: com.ss.android.ttvecamera.a.b */
public abstract class C20150b extends C20177b {

    /* renamed from: a */
    protected CameraManager f55406a;

    /* renamed from: b */
    protected CameraDevice f55407b;

    /* renamed from: a */
    public final Object mo42676a() {
        return this.f55407b;
    }

    /* renamed from: a */
    public final void mo42678a(Object obj) throws ClassCastException {
        this.f55407b = (CameraDevice) obj;
    }

    /* renamed from: a */
    public String mo42677a(int i) throws CameraAccessException {
        int i2;
        String[] cameraIdList = this.f55406a.getCameraIdList();
        String str = null;
        if (cameraIdList == null) {
            C20296p.m50062c("TECamera2Mode", "cameraList is null");
            return null;
        }
        C20239j.m50016a("te_record_camera_size", (long) cameraIdList.length);
        StringBuilder sb = new StringBuilder("selectCamera cameraList.size: ");
        sb.append(cameraIdList.length);
        C20296p.m50059a("TECamera2Mode", sb.toString());
        if (i != 2) {
            if (i >= cameraIdList.length || i < 0) {
                i = 1;
            }
            this.f55472k.f55723e = i;
            int length = cameraIdList.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                String str2 = cameraIdList[i3];
                if (((Integer) this.f55406a.getCameraCharacteristics(str2).get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                if (i2 == i) {
                    str = str2;
                    break;
                }
                i3++;
            }
        } else if (this.f55472k.f55721c == 4) {
            str = C20191g.m49836b(21);
        } else if (this.f55472k.f55741w.length() <= 0 || this.f55472k.f55741w.equals("-1")) {
            str = C20186c.m49827a(cameraIdList, this.f55406a);
        } else {
            StringBuilder sb2 = new StringBuilder("Wide-angle camera id: ");
            sb2.append(this.f55472k.f55741w);
            C20296p.m50059a("TECamera2Mode", sb2.toString());
            if (C20285m.m50053a(cameraIdList, this.f55472k.f55741w)) {
                str = this.f55472k.f55741w;
            } else {
                StringBuilder sb3 = new StringBuilder("Maybe this is not validate camera id: ");
                sb3.append(this.f55472k.f55741w);
                C20296p.m50062c("TECamera2Mode", sb3.toString());
            }
        }
        if (str == null) {
            C20296p.m50062c("TECamera2Mode", "selectCamera: camera tag is null, set 0 for default");
            str = "0";
            this.f55472k.f55723e = 0;
        }
        StringBuilder sb4 = new StringBuilder("selectCamera mCameraSettings.mFacing: ");
        sb4.append(this.f55472k.f55723e);
        C20296p.m50059a("TECamera2Mode", sb4.toString());
        StringBuilder sb5 = new StringBuilder("selectCamera cameraTag: ");
        sb5.append(str);
        C20296p.m50059a("TECamera2Mode", sb5.toString());
        this.f55475n = this.f55406a.getCameraCharacteristics(str);
        return str;
    }

    public C20150b(C20195e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, handler);
        this.f55406a = cameraManager;
    }
}
