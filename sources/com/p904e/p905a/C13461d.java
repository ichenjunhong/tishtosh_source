package com.p904e.p905a;

import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import java.lang.reflect.Constructor;

/* renamed from: com.e.a.d */
public final class C13461d {

    /* renamed from: a */
    private static Constructor<Key> f35054a;

    /* renamed from: b */
    private static Constructor<CaptureResult.Key> f35055b;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> android.hardware.camera2.CaptureRequest.Key<T> m27127a(java.lang.String r6, java.lang.Class<T> r7) {
        /*
            java.lang.reflect.Constructor<android.hardware.camera2.CaptureRequest$Key> r0 = f35054a     // Catch:{  }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L_0x001e
            java.lang.Class<android.hardware.camera2.CaptureRequest$Key> r0 = android.hardware.camera2.CaptureRequest.Key.class
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5     // Catch:{  }
            java.lang.Class r5 = r7.getClass()     // Catch:{  }
            r4[r3] = r5     // Catch:{  }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r4)     // Catch:{  }
            f35054a = r0     // Catch:{  }
            r0.setAccessible(r3)     // Catch:{  }
        L_0x001e:
            java.lang.reflect.Constructor<android.hardware.camera2.CaptureRequest$Key> r0 = f35054a     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x002d }
            r2[r1] = r6     // Catch:{ NoSuchMethodException -> 0x002d }
            r2[r3] = r7     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Object r6 = r0.newInstance(r2)     // Catch:{ NoSuchMethodException -> 0x002d }
            android.hardware.camera2.CaptureRequest$Key r6 = (android.hardware.camera2.CaptureRequest.Key) r6     // Catch:{ NoSuchMethodException -> 0x002d }
            return r6
        L_0x002d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p904e.p905a.C13461d.m27127a(java.lang.String, java.lang.Class):android.hardware.camera2.CaptureRequest$Key");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> android.hardware.camera2.CaptureResult.Key<T> m27128b(java.lang.String r6, java.lang.Class<T> r7) {
        /*
            java.lang.reflect.Constructor<android.hardware.camera2.CaptureResult$Key> r0 = f35055b     // Catch:{  }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L_0x001e
            java.lang.Class<android.hardware.camera2.CaptureResult$Key> r0 = android.hardware.camera2.CaptureResult.Key.class
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5     // Catch:{  }
            java.lang.Class r5 = r7.getClass()     // Catch:{  }
            r4[r3] = r5     // Catch:{  }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r4)     // Catch:{  }
            f35055b = r0     // Catch:{  }
            r0.setAccessible(r3)     // Catch:{  }
        L_0x001e:
            java.lang.reflect.Constructor<android.hardware.camera2.CaptureResult$Key> r0 = f35055b     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x002d }
            r2[r1] = r6     // Catch:{ NoSuchMethodException -> 0x002d }
            r2[r3] = r7     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Object r6 = r0.newInstance(r2)     // Catch:{ NoSuchMethodException -> 0x002d }
            android.hardware.camera2.CaptureResult$Key r6 = (android.hardware.camera2.CaptureResult.Key) r6     // Catch:{ NoSuchMethodException -> 0x002d }
            return r6
        L_0x002d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p904e.p905a.C13461d.m27128b(java.lang.String, java.lang.Class):android.hardware.camera2.CaptureResult$Key");
    }
}
