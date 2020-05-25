package com.p683ss.android.ttvecamera.p1231f;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.view.Surface;
import com.p683ss.android.ttvecamera.C20195e;
import com.p683ss.android.ttvecamera.C20296p;
import com.p683ss.android.ttvecamera.p1226a.C20157d;
import com.p683ss.android.ttvecamera.p1232g.C20217c;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.f.c */
public final class C20207c extends C20157d {
    /* renamed from: c */
    public final int mo42685c() throws Exception {
        C20217c cVar = this.f55471j.f55526n;
        if (this.f55407b == null || cVar == null) {
            C20296p.m50061b("TEOppoVideoMode", "CameraDevice or ProviderManager is null!");
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
        if (this.f55472k.f55717B) {
            ((C20205a) this.f55471j).mo42787f(arrayList.size());
        }
        this.f55407b.createCaptureSession(arrayList, this.f55487z, this.f55474m);
        return 0;
    }

    public C20207c(C20195e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
    }
}
