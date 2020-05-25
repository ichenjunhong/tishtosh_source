package com.p683ss.android.ugc.aweme.shortvideo.p2204h;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.h.e */
public final class C43875e implements C43874d {

    /* renamed from: a */
    private static int f111133a = -1;

    /* renamed from: c */
    private static C40796a m96379c() {
        return C40796a.CameraPosition;
    }

    /* renamed from: b */
    private static int m96378b() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras > 0) {
                CameraInfo cameraInfo = new CameraInfo();
                for (int i = 0; i < numberOfCameras; i++) {
                    Camera.getCameraInfo(i, cameraInfo);
                    if (cameraInfo.facing == 1) {
                        return 1;
                    }
                }
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public final int mo89428a() {
        if (C39618d.f101151O.mo83122f(m96379c())) {
            return C39618d.f101151O.mo83118b(m96379c());
        }
        if (f111133a == -1) {
            f111133a = m96378b();
        }
        if (f111133a == -1) {
            return 0;
        }
        return f111133a;
    }

    /* renamed from: a */
    public final int mo89429a(int i) {
        if (i == 1) {
            i = m96378b();
        }
        if (i != -1) {
            return i;
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo89430b(int i) {
        C39618d.f101151O.mo83113a(m96379c(), i);
    }
}
