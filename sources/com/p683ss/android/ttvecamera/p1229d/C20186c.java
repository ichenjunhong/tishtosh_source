package com.p683ss.android.ttvecamera.p1229d;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.util.Range;
import com.p683ss.android.ttvecamera.C20239j;
import com.p683ss.android.ttvecamera.C20285m;
import com.p683ss.android.ttvecamera.C20295o;
import com.p683ss.android.ttvecamera.C20296p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.d.c */
public class C20186c {

    /* renamed from: a */
    protected static C20186c f55497a;

    /* renamed from: b */
    protected Context f55498b;

    /* renamed from: c */
    public int f55499c;

    /* renamed from: a */
    public boolean mo42771a(int i) {
        return false;
    }

    /* renamed from: a */
    public boolean mo42768a() {
        if (!mo42769b().equals("0")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String mo42769b() {
        CameraManager cameraManager = (CameraManager) this.f55498b.getSystemService("camera");
        try {
            return m49827a(cameraManager.getCameraIdList(), cameraManager);
        } catch (CameraAccessException unused) {
            return "0";
        }
    }

    public C20186c(Context context) {
        this.f55498b = context;
    }

    /* renamed from: a */
    public static boolean m49828a(CameraCharacteristics cameraCharacteristics) {
        return ((Boolean) cameraCharacteristics.get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
    }

    /* renamed from: c */
    public static boolean m49829c(CameraCharacteristics cameraCharacteristics) {
        if (cameraCharacteristics == null) {
            return false;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr == null || iArr.length <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo42772b(android.hardware.camera2.CameraCharacteristics r7) {
        /*
            r6 = this;
            boolean r0 = m49829c(r7)
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION
            java.lang.Object r7 = r7.get(r1)
            int[] r7 = (int[]) r7
            r1 = 0
            r2 = 1
            if (r7 == 0) goto L_0x001d
            int r3 = r7.length
            r4 = 0
        L_0x0012:
            if (r4 >= r3) goto L_0x001d
            r5 = r7[r4]
            if (r5 != r2) goto L_0x001a
            r7 = 1
            goto L_0x001e
        L_0x001a:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x001d:
            r7 = 0
        L_0x001e:
            if (r7 == 0) goto L_0x0022
            r0 = r0 | 2
        L_0x0022:
            java.lang.String r7 = "TECameraHardware2Proxy"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Stabilization type: "
            r3.<init>(r4)
            java.lang.String r4 = java.lang.Integer.toBinaryString(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p683ss.android.ttvecamera.C20296p.m50059a(r7, r3)
            java.lang.String r7 = "te_record_camera_stabilization"
            long r3 = (long) r0
            com.p683ss.android.ttvecamera.C20239j.m50016a(r7, r3)
            if (r0 <= 0) goto L_0x0042
            return r2
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.p1229d.C20186c.mo42772b(android.hardware.camera2.CameraCharacteristics):boolean");
    }

    /* renamed from: a */
    public static String m49827a(String[] strArr, CameraManager cameraManager) {
        String str = "0";
        try {
            int length = strArr.length;
            String str2 = str;
            int i = 0;
            float f = Float.MAX_VALUE;
            while (i < length) {
                try {
                    String str3 = strArr[i];
                    CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str3);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                    if (num == null || num.intValue() != 0) {
                        float f2 = ((float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS))[0];
                        if (f2 < f) {
                            str2 = str3;
                            f = f2;
                        }
                    }
                    i++;
                } catch (CameraAccessException unused) {
                    return str2;
                }
            }
            return str2;
        } catch (CameraAccessException unused2) {
            return str;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.ttvecamera.p1229d.C20186c m49825a(android.content.Context r5, int r6) {
        /*
            java.lang.String r0 = "TECameraHardware2Proxy"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getDeviceProxy:getDeviceProxy  "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.ttvecamera.C20296p.m50059a(r0, r1)
            com.ss.android.ttvecamera.d.c r0 = f55497a
            if (r0 != 0) goto L_0x00eb
            java.lang.Class<com.ss.android.ttvecamera.d.c> r0 = com.p683ss.android.ttvecamera.p1229d.C20186c.class
            monitor-enter(r0)
            com.ss.android.ttvecamera.d.c r1 = f55497a     // Catch:{ all -> 0x00e8 }
            if (r1 != 0) goto L_0x00e6
            r1 = 4
            if (r6 != r1) goto L_0x002a
            com.ss.android.ttvecamera.d.g r6 = new com.ss.android.ttvecamera.d.g     // Catch:{ all -> 0x00e8 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e8 }
            f55497a = r6     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x002a:
            r1 = 5
            if (r6 != r1) goto L_0x0036
            com.ss.android.ttvecamera.d.h r6 = new com.ss.android.ttvecamera.d.h     // Catch:{ all -> 0x00e8 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e8 }
            f55497a = r6     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x0036:
            r1 = 3
            if (r6 == r1) goto L_0x00df
            r1 = 6
            if (r6 != r1) goto L_0x003e
            goto L_0x00df
        L_0x003e:
            r1 = 7
            if (r6 != r1) goto L_0x004a
            com.ss.android.ttvecamera.d.i r6 = new com.ss.android.ttvecamera.d.i     // Catch:{ all -> 0x00e8 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e8 }
            f55497a = r6     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x004a:
            java.lang.String r6 = android.os.Build.HARDWARE     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = "qcom"
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x00e8 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0065
            java.lang.String r1 = "msm[0-9]*"
            boolean r6 = r6.matches(r1)     // Catch:{ all -> 0x00e8 }
            if (r6 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r6 = 0
            goto L_0x006d
        L_0x0065:
            java.lang.String r6 = "TECameraHardware2"
            java.lang.String r1 = "QCOM Platform."
            com.p683ss.android.ttvecamera.C20296p.m50061b(r6, r1)     // Catch:{ all -> 0x00e8 }
            r6 = 1
        L_0x006d:
            if (r6 == 0) goto L_0x0078
            com.ss.android.ttvecamera.d.f r6 = new com.ss.android.ttvecamera.d.f     // Catch:{ all -> 0x00e8 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e8 }
            f55497a = r6     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x0078:
            java.lang.String r6 = android.os.Build.HARDWARE     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = "mt[0-9]*"
            boolean r6 = r6.matches(r1)     // Catch:{ all -> 0x00e8 }
            if (r6 == 0) goto L_0x008f
            java.lang.String r6 = "TECameraHardware2"
            java.lang.String r1 = "MTK Platform."
            com.p683ss.android.ttvecamera.C20296p.m50061b(r6, r1)     // Catch:{ all -> 0x00e8 }
            r6 = 1
            goto L_0x0090
        L_0x008f:
            r6 = 0
        L_0x0090:
            if (r6 == 0) goto L_0x009a
            com.ss.android.ttvecamera.d.d r6 = new com.ss.android.ttvecamera.d.d     // Catch:{ all -> 0x00e8 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e8 }
            f55497a = r6     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x009a:
            java.lang.String r6 = android.os.Build.BRAND     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = r6.toLowerCase()     // Catch:{ all -> 0x00e8 }
            java.lang.String r1 = "huawei"
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x00e8 }
            if (r1 != 0) goto L_0x00b3
            java.lang.String r1 = "honor"
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x00e8 }
            if (r1 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r2 = 0
            goto L_0x00c6
        L_0x00b3:
            java.lang.String r1 = "TECameraHardware2"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = "HuaWei Platform, Brand: "
            r3.<init>(r4)     // Catch:{ all -> 0x00e8 }
            r3.append(r6)     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x00e8 }
            com.p683ss.android.ttvecamera.C20296p.m50061b(r1, r6)     // Catch:{ all -> 0x00e8 }
        L_0x00c6:
            if (r2 == 0) goto L_0x00d0
            com.ss.android.ttvecamera.d.a r6 = new com.ss.android.ttvecamera.d.a     // Catch:{ all -> 0x00e8 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e8 }
            f55497a = r6     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x00d0:
            java.lang.String r6 = "TECameraHardware2Proxy"
            java.lang.String r1 = "Unknown platform"
            com.p683ss.android.ttvecamera.C20296p.m50063d(r6, r1)     // Catch:{ all -> 0x00e8 }
            com.ss.android.ttvecamera.d.c r6 = new com.ss.android.ttvecamera.d.c     // Catch:{ all -> 0x00e8 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e8 }
            f55497a = r6     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x00df:
            com.ss.android.ttvecamera.d.a r6 = new com.ss.android.ttvecamera.d.a     // Catch:{ all -> 0x00e8 }
            r6.<init>(r5)     // Catch:{ all -> 0x00e8 }
            f55497a = r6     // Catch:{ all -> 0x00e8 }
        L_0x00e6:
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x00eb
        L_0x00e8:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e8 }
            throw r5
        L_0x00eb:
            com.ss.android.ttvecamera.d.c r5 = f55497a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ttvecamera.p1229d.C20186c.m49825a(android.content.Context, int):com.ss.android.ttvecamera.d.c");
    }

    /* renamed from: a */
    public int mo42770a(CameraCharacteristics cameraCharacteristics, Builder builder, boolean z) {
        if (cameraCharacteristics == null || builder == null) {
            return -100;
        }
        if (!z) {
            builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
            return 0;
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i : iArr) {
                StringBuilder sb = new StringBuilder("EIS mode: ");
                sb.append(i);
                C20296p.m50059a("TECameraHardware2Proxy", sb.toString());
                if (i == 1) {
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
                    C20296p.m50059a("TECameraHardware2Proxy", "Enable EIS");
                    return 0;
                }
            }
        } else {
            C20296p.m50059a("TECameraHardware2Proxy", "Don't supported EIS");
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                StringBuilder sb2 = new StringBuilder("OIS mode: ");
                sb2.append(i2);
                C20296p.m50059a("TECameraHardware2Proxy", sb2.toString());
                if (i2 == 1) {
                    builder.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(1));
                    builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
                    C20296p.m50059a("TECameraHardware2Proxy", "Enable OIS");
                    return 0;
                }
            }
        } else {
            C20296p.m50059a("TECameraHardware2Proxy", "Don't supported OIS");
        }
        return -200;
    }

    /* renamed from: a */
    public static C20295o m49826a(CameraCharacteristics cameraCharacteristics, int i, int i2, int i3) {
        int[] iArr;
        C20295o oVar = new C20295o(1, 30);
        if (cameraCharacteristics == null) {
            return oVar;
        }
        Range[] rangeArr = (Range[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        if (rangeArr == null) {
            return oVar;
        }
        ArrayList arrayList = new ArrayList(rangeArr.length);
        int i4 = oVar.f55774c;
        int i5 = 0;
        for (Range range : rangeArr) {
            int[] iArr2 = {((Integer) range.getLower()).intValue() * i4, ((Integer) range.getUpper()).intValue() * i4};
            arrayList.add(iArr2);
            if (i5 < iArr2[1]) {
                i5 = iArr2[1];
            }
            StringBuilder sb = new StringBuilder("Fps Range: [");
            sb.append(iArr2[0]);
            sb.append(", ");
            sb.append(iArr2[1]);
            sb.append("]");
            C20296p.m50061b("TECameraHardware2Proxy", sb.toString());
        }
        C20239j.m50016a("te_record_camera_max_fps", (long) i5);
        if (i3 == 0) {
            iArr = C20285m.m50054a(oVar.mo42932a(), (List<int[]>) arrayList);
        } else {
            iArr = C20285m.m50055b(oVar.mo42932a(), arrayList);
        }
        oVar.f55772a = iArr[0];
        oVar.f55773b = iArr[1];
        return oVar;
    }
}
