package com.p683ss.android.ttvecamera;

import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ttvecamera.h */
public final class C20225h {

    /* renamed from: a */
    public static WeakReference<C20226a> f55575a;

    /* renamed from: com.ss.android.ttvecamera.h$a */
    public interface C20226a {
        /* renamed from: a */
        void mo42821a(Throwable th);
    }

    /* renamed from: a */
    public static void m49990a(Throwable th) {
        C20226a aVar;
        WeakReference<C20226a> weakReference = f55575a;
        if (weakReference == null) {
            aVar = null;
        } else {
            aVar = (C20226a) weakReference.get();
        }
        if (aVar != null) {
            aVar.mo42821a(th);
        }
    }
}
