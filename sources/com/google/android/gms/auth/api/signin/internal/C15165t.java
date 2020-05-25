package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth-api.C16444a;
import com.google.android.gms.internal.auth-api.C16446c;

/* renamed from: com.google.android.gms.auth.api.signin.internal.t */
public final class C15165t extends C16444a implements C15164s {
    C15165t(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void mo27975a(C15162q qVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel a = mo31648a();
        C16446c.m39310a(a, (IInterface) qVar);
        C16446c.m39311a(a, (Parcelable) googleSignInOptions);
        mo31649a(102, a);
    }

    /* renamed from: b */
    public final void mo27976b(C15162q qVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel a = mo31648a();
        C16446c.m39310a(a, (IInterface) qVar);
        C16446c.m39311a(a, (Parcelable) googleSignInOptions);
        mo31649a(103, a);
    }
}
