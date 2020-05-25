package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* renamed from: com.google.android.gms.internal.measurement.ew */
public final /* synthetic */ class C16668ew {
    /* renamed from: a */
    public static <V> V m39824a(C16669ex<V> exVar) {
        long clearCallingIdentity;
        try {
            return exVar.mo31979a();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            V a = exVar.mo31979a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }
}
