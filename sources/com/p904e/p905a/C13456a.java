package com.p904e.p905a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.p038f.C0799m;
import android.view.Surface;
import com.p904e.p905a.C13458b.C13459a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.e.a.a */
public class C13456a {

    /* renamed from: a */
    private static final String f35045a = "a";

    /* renamed from: b */
    private static String f35046b = "0";

    /* renamed from: c */
    private static String f35047c = "1";

    /* renamed from: d */
    private static String f35048d = "21";

    /* renamed from: com.e.a.a$a */
    static class C13457a implements Executor {

        /* renamed from: a */
        private final Handler f35049a;

        public final void execute(Runnable runnable) {
            this.f35049a.post(runnable);
        }

        public C13457a(Handler handler) {
            this.f35049a = (Handler) C0799m.m2267a(handler);
        }
    }

    private C13456a() {
    }

    /* renamed from: a */
    public static String m27122a(int i) {
        if (i == 21) {
            return f35048d;
        }
        switch (i) {
            case 0:
                return f35046b;
            case 1:
                return f35047c;
            default:
                return "0";
        }
    }

    /* renamed from: a */
    public static void m27124a(CameraCaptureSession cameraCaptureSession, Builder builder) {
        boolean z;
        Integer num = (Integer) builder.get(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE);
        if (num == null || num.intValue() != 1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            new StringBuilder("recordingEndOfStream: ").append("0x1");
            builder.set(C13459a.VIDEO_END.toCaptureRequestKey(), Byte.valueOf(1));
            try {
                cameraCaptureSession.capture(builder.build(), null, null);
            } catch (CameraAccessException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m27123a(int i, StateCallback stateCallback, Handler handler, CameraManager cameraManager) throws CameraAccessException {
        cameraManager.openCamera(m27122a(i), stateCallback, handler);
    }

    /* renamed from: a */
    public static void m27125a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler, CameraDevice cameraDevice, int i) throws CameraAccessException {
        ArrayList arrayList = new ArrayList(list.size());
        for (Surface outputConfiguration : list) {
            arrayList.add(new OutputConfiguration(outputConfiguration));
        }
        if (handler == null) {
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                handler = new Handler(myLooper);
            } else {
                throw new IllegalArgumentException("No handler given, and current thread has no looper!");
            }
        }
        cameraDevice.createCaptureSession(new SessionConfiguration(i, arrayList, new C13457a(handler), stateCallback));
    }
}
