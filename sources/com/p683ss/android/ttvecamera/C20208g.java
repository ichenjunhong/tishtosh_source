package com.p683ss.android.ttvecamera;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import com.p683ss.android.ttvecamera.p1229d.C20186c;
import com.p683ss.android.ttvecamera.p1229d.C20188e;
import com.p683ss.android.ttvecamera.p1232g.C20217c.C20218a;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.g */
public final class C20208g {

    /* renamed from: a */
    protected C20275l f55536a;

    /* renamed from: b */
    protected C20209a f55537b = C20210b.m49945a();

    /* renamed from: c */
    protected C20211c f55538c;

    /* renamed from: com.ss.android.ttvecamera.g$a */
    public interface C20209a {
        void onCaptureStarted(int i, int i2);

        void onCaptureStopped(int i);

        void onError(int i, String str);

        void onInfo(int i, int i2, String str);
    }

    /* renamed from: com.ss.android.ttvecamera.g$b */
    protected static class C20210b implements C20209a {

        /* renamed from: a */
        private static volatile C20210b f55539a;

        protected C20210b() {
        }

        public void onCaptureStarted(int i, int i2) {
        }

        public void onCaptureStopped(int i) {
        }

        public void onError(int i, String str) {
        }

        public void onInfo(int i, int i2, String str) {
        }

        /* renamed from: a */
        public static C20210b m49945a() {
            C20210b bVar;
            synchronized (C20210b.class) {
                if (f55539a == null) {
                    synchronized (C20210b.class) {
                        f55539a = new C20210b();
                    }
                }
                bVar = f55539a;
            }
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.g$c */
    public interface C20211c {
        /* renamed from: a */
        TEFrameSizei mo42799a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* renamed from: a */
    private static boolean m49936a(Context context, int i) {
        return i != 3;
    }

    /* renamed from: b */
    public final int mo42792b() {
        return C20241k.INSTANCE.start(this);
    }

    /* renamed from: c */
    public final int mo42794c() {
        return C20241k.INSTANCE.stop(this);
    }

    /* renamed from: a */
    public final int mo42788a() {
        return C20241k.INSTANCE.disConnect(this);
    }

    public C20208g(C20209a aVar) {
        this.f55537b = aVar;
    }

    /* renamed from: b */
    public final int mo42793b(C20275l lVar) {
        this.f55536a = lVar;
        return C20241k.INSTANCE.switchCamera(this, lVar);
    }

    /* renamed from: a */
    public final int mo42790a(C20218a aVar) {
        return C20241k.INSTANCE.addCameraProvider(this, aVar);
    }

    /* renamed from: a */
    public final int mo42791a(C20275l lVar) {
        this.f55536a = lVar;
        return C20241k.INSTANCE.connect(this, this.f55537b, this.f55536a, this.f55538c);
    }

    public C20208g(C20209a aVar, C20211c cVar) {
        this.f55537b = aVar;
        this.f55538c = cVar;
    }

    /* renamed from: a */
    public static void m49935a(Context context, int i, Bundle bundle) {
        if (m49936a(context, i)) {
            boolean z = false;
            for (String str : bundle.keySet()) {
                if ("device_support_camera".equals(str)) {
                    bundle.putBoolean("device_support_camera", m49936a(context, i));
                } else if (!"device_support_wide_angle".equals(str) || i == 1) {
                    z = true;
                } else {
                    Long valueOf = Long.valueOf(System.currentTimeMillis());
                    bundle.putBoolean("device_support_wide_angle", C20186c.m49825a(context, i).mo42768a());
                    StringBuilder sb = new StringBuilder("Get wide angle info cost ");
                    sb.append(System.currentTimeMillis() - valueOf.longValue());
                    sb.append("ms");
                    C20296p.m50061b("TECameraCapture", sb.toString());
                }
            }
            if (z) {
                m49937b(context, i, bundle);
            }
        }
    }

    /* renamed from: b */
    private static void m49937b(Context context, int i, Bundle bundle) {
        String[] cameraIdList;
        int i2;
        try {
            CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
            HashMap hashMap = null;
            for (String str : cameraManager.getCameraIdList()) {
                Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
                if (num == null || num.intValue() == 0 || num.intValue() == 1) {
                    for (String equals : bundle.keySet()) {
                        if ("support_anti_shake".equals(equals) && i == 5) {
                            if (hashMap == null) {
                                hashMap = new HashMap();
                            }
                            if (num.intValue() == 0) {
                                i2 = 1;
                            } else {
                                i2 = 0;
                            }
                            hashMap.put(Integer.valueOf(i2), Boolean.valueOf(C20188e.m49835b(context, Integer.parseInt(str))));
                            bundle.putSerializable("support_anti_shake", hashMap);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final int mo42789a(int i, int i2, float f, int i3, int i4) {
        return C20241k.INSTANCE.focusAtPoint(this, i, i2, f, i3, i4);
    }
}
