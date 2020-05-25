package com.p683ss.android.ttvecamera.p1226a;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20195e;
import com.p683ss.android.ttvecamera.C20201f.C20202a;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.p1227b.C20166e;
import com.p683ss.android.ttvecamera.p1232g.C20217c;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.a.d */
public class C20157d extends C20150b {

    /* renamed from: c */
    private static final String f55425c = "d";

    /* renamed from: g */
    public final int mo42689g() {
        if (this.f55478q == null || this.f55486y == null) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.f55478q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        this.f55477p = this.f55478q.build();
        try {
            this.f55486y.setRepeatingRequest(this.f55477p, this.f55465A, this.f55474m);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    /* renamed from: c */
    public int mo42685c() throws Exception {
        C20217c cVar = this.f55471j.f55526n;
        if (this.f55407b == null || cVar == null) {
            C20296p.m50061b(f55425c, "CameraDevice or ProviderManager is null!");
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
        this.f55407b.createCaptureSession(arrayList, this.f55487z, this.f55474m);
        return 0;
    }

    /* renamed from: f */
    public final int mo42688f() {
        if (this.f55478q == null || this.f55486y == null) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.f55478q.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
        this.f55478q.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(3));
        this.f55478q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        this.f55477p = this.f55478q.build();
        try {
            this.f55486y.setRepeatingRequest(this.f55477p, this.f55465A, this.f55474m);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo42684b(int i) {
        if (this.f55478q == null || this.f55486y == null) {
            String str = "Capture Session is null";
            String str2 = f55425c;
            StringBuilder sb = new StringBuilder("switchFlashMode: ");
            sb.append(str);
            C20296p.m50063d(str2, sb.toString());
            C20202a aVar = this.f55470i;
            int i2 = this.f55472k.f55721c;
            StringBuilder sb2 = new StringBuilder("switchFlashMode:");
            sb2.append(str);
            aVar.mo42782a(i2, -100, sb2.toString());
            return;
        }
        if (i == 0) {
            this.f55478q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
            this.f55478q.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
        } else if (i != 2) {
            String str3 = f55425c;
            StringBuilder sb3 = new StringBuilder("Video Mode not support this mode : ");
            sb3.append(i);
            C20296p.m50062c(str3, sb3.toString());
            return;
        } else {
            this.f55478q.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
            this.f55478q.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
        }
        try {
            this.f55472k.f55718C = i;
            this.f55477p = this.f55478q.build();
            this.f55486y.setRepeatingRequest(this.f55477p, this.f55465A, this.f55474m);
        } catch (CameraAccessException unused) {
            this.f55470i.mo42782a(this.f55472k.f55721c, -418, "switch flash failed.");
        }
    }

    public C20157d(C20195e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
        this.f55485x = new C20166e(this);
    }
}
