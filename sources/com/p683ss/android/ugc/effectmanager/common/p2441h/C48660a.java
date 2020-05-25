package com.p683ss.android.ugc.effectmanager.common.p2441h;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.a */
public final class C48660a {
    /* renamed from: a */
    public static void m105288a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
