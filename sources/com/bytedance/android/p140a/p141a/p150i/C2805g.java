package com.bytedance.android.p140a.p141a.p150i;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.bytedance.android.a.a.i.g */
public final class C2805g {
    /* renamed from: a */
    public static void m7975a(Closeable... closeableArr) {
        for (int i = 0; i <= 0; i++) {
            Closeable closeable = closeableArr[0];
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
