package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p1042c.C16475b;
import com.google.android.gms.internal.p1042c.C16476c;

/* renamed from: com.google.android.gms.signin.internal.e */
public abstract class C17152e extends C16475b implements C17151d {
    public C17152e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    /* renamed from: a */
    public final boolean mo28366a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                C16476c.m39341a(parcel, ConnectionResult.CREATOR);
                C16476c.m39341a(parcel, zaa.CREATOR);
                break;
            case 4:
                C16476c.m39341a(parcel, Status.CREATOR);
                break;
            case 6:
                C16476c.m39341a(parcel, Status.CREATOR);
                break;
            case 7:
                C16476c.m39341a(parcel, Status.CREATOR);
                C16476c.m39341a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo28166a((zaj) C16476c.m39341a(parcel, zaj.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
