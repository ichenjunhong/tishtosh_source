package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C16656ek;
import com.google.android.gms.internal.measurement.C16666eu;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.j */
public abstract class C17125j extends C16656ek implements C17124i {
    public C17125j() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final boolean mo31893a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo32950a((zzag) C16666eu.m39818a(parcel, zzag.CREATOR), (zzk) C16666eu.m39818a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                mo32952a((zzfv) C16666eu.m39818a(parcel, zzfv.CREATOR), (zzk) C16666eu.m39818a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 4:
                mo32953a((zzk) C16666eu.m39818a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 5:
                mo32951a((zzag) C16666eu.m39818a(parcel, zzag.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                mo32957b((zzk) C16666eu.m39818a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 7:
                List a = mo32944a((zzk) C16666eu.m39818a(parcel, zzk.CREATOR), C16666eu.m39822a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                break;
            case 9:
                byte[] a2 = mo32956a((zzag) C16666eu.m39818a(parcel, zzag.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                break;
            case 10:
                mo32949a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                String c = mo32958c((zzk) C16666eu.m39818a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                break;
            case 12:
                mo32955a((zzo) C16666eu.m39818a(parcel, zzo.CREATOR), (zzk) C16666eu.m39818a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                mo32954a((zzo) C16666eu.m39818a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                List a3 = mo32948a(parcel.readString(), parcel.readString(), C16666eu.m39822a(parcel), (zzk) C16666eu.m39818a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                break;
            case 15:
                List a4 = mo32947a(parcel.readString(), parcel.readString(), parcel.readString(), C16666eu.m39822a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                break;
            case 16:
                List a5 = mo32945a(parcel.readString(), parcel.readString(), (zzk) C16666eu.m39818a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                break;
            case 17:
                List a6 = mo32946a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                break;
            case 18:
                mo32959d((zzk) C16666eu.m39818a(parcel, zzk.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
