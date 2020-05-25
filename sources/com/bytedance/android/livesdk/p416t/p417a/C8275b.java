package com.bytedance.android.livesdk.p416t.p417a;

import android.content.Context;
import android.hardware.Camera;
import com.bytedance.android.livesdk.p416t.p418b.C8285a;
import com.bytedance.android.livesdk.p416t.p419c.C8294e;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.livesdk.t.a.b */
public final class C8275b implements C8277d {

    /* renamed from: a */
    private static C8285a f22620a;

    /* renamed from: b */
    private static Camera m16394b() {
        try {
            return m16392a(1);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m16393a() {
        Camera b = m16394b();
        if (b == null) {
            return false;
        }
        Field field = null;
        try {
            field = b.getClass().getDeclaredField("mHasPermission");
        } catch (NoSuchFieldException unused) {
        }
        if (field == null) {
            b.release();
            return true;
        }
        try {
            field.setAccessible(true);
            return field.getBoolean(b);
        } catch (IllegalAccessException unused2) {
            return true;
        } finally {
            b.release();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0030 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d A[SYNTHETIC, Splitter:B:17:0x002d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.hardware.Camera m16392a(int r4) {
        /*
            int r4 = android.hardware.Camera.getNumberOfCameras()
            r0 = 0
        L_0x0005:
            r1 = 0
            if (r0 >= r4) goto L_0x0035
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            android.hardware.Camera.getCameraInfo(r0, r2)
            int r2 = r2.facing
            r3 = 1
            if (r2 == r3) goto L_0x001b
            if (r4 != r3) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            int r0 = r0 + 1
            goto L_0x0005
        L_0x001b:
            android.hardware.Camera r4 = android.hardware.Camera.open(r0)     // Catch:{ RuntimeException -> 0x002a }
            if (r4 == 0) goto L_0x0028
            android.hardware.Camera$Parameters r0 = r4.getParameters()     // Catch:{ RuntimeException -> 0x002b }
            r4.setParameters(r0)     // Catch:{ RuntimeException -> 0x002b }
        L_0x0028:
            r1 = r4
            goto L_0x0035
        L_0x002a:
            r4 = r1
        L_0x002b:
            if (r4 == 0) goto L_0x0030
            r4.release()     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            android.hardware.Camera r4 = android.hardware.Camera.open()     // Catch:{ Exception -> 0x0035 }
            goto L_0x0028
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p416t.p417a.C8275b.m16392a(int):android.hardware.Camera");
    }

    /* renamed from: a */
    public final boolean mo14459a(Context context, String str) {
        boolean z;
        if (f22620a == null) {
            z = m16393a();
        } else if (!C8294e.m16435c().mo14474b() || !f22620a.mo14470a()) {
            return false;
        } else {
            z = true;
        }
        return z;
    }
}
