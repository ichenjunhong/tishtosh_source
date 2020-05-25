package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15453l.C15454a;

/* renamed from: com.google.android.gms.common.internal.a */
public final class C15395a extends C15454a {
    /* renamed from: a */
    public static Account m31981a(C15453l lVar) {
        if (lVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return lVar.mo28362a();
            } catch (RemoteException unused) {
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Account mo28362a() {
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        throw new NoSuchMethodError();
    }
}
