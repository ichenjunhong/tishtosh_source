package com.google.android.gms.measurement.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.C16655ej;
import com.google.android.gms.internal.measurement.C16666eu;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.k */
public final class C17126k extends C16655ej implements C17124i {
    C17126k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* renamed from: a */
    public final void mo32950a(zzag zzag, zzk zzk) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzag);
        C16666eu.m39820a(a, (Parcelable) zzk);
        mo31968b(1, a);
    }

    /* renamed from: a */
    public final void mo32952a(zzfv zzfv, zzk zzk) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzfv);
        C16666eu.m39820a(a, (Parcelable) zzk);
        mo31968b(2, a);
    }

    /* renamed from: a */
    public final void mo32953a(zzk zzk) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzk);
        mo31968b(4, a);
    }

    /* renamed from: a */
    public final void mo32951a(zzag zzag, String str, String str2) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzag);
        a.writeString(str);
        a.writeString(str2);
        mo31968b(5, a);
    }

    /* renamed from: b */
    public final void mo32957b(zzk zzk) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzk);
        mo31968b(6, a);
    }

    /* renamed from: a */
    public final List<zzfv> mo32944a(zzk zzk, boolean z) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzk);
        C16666eu.m39821a(a, z);
        Parcel a2 = mo31966a(7, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final byte[] mo32956a(zzag zzag, String str) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzag);
        a.writeString(str);
        Parcel a2 = mo31966a(9, a);
        byte[] createByteArray = a2.createByteArray();
        a2.recycle();
        return createByteArray;
    }

    /* renamed from: a */
    public final void mo32949a(long j, String str, String str2, String str3) throws RemoteException {
        Parcel a = mo31965a();
        a.writeLong(j);
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        mo31968b(10, a);
    }

    /* renamed from: c */
    public final String mo32958c(zzk zzk) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzk);
        Parcel a2 = mo31966a(11, a);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }

    /* renamed from: a */
    public final void mo32955a(zzo zzo, zzk zzk) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzo);
        C16666eu.m39820a(a, (Parcelable) zzk);
        mo31968b(12, a);
    }

    /* renamed from: a */
    public final void mo32954a(zzo zzo) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzo);
        mo31968b(13, a);
    }

    /* renamed from: a */
    public final List<zzfv> mo32948a(String str, String str2, boolean z, zzk zzk) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeString(str2);
        C16666eu.m39821a(a, z);
        C16666eu.m39820a(a, (Parcelable) zzk);
        Parcel a2 = mo31966a(14, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzfv> mo32947a(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        C16666eu.m39821a(a, z);
        Parcel a2 = mo31966a(15, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzfv.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzo> mo32945a(String str, String str2, zzk zzk) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeString(str2);
        C16666eu.m39820a(a, (Parcelable) zzk);
        Parcel a2 = mo31966a(16, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzo.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: a */
    public final List<zzo> mo32946a(String str, String str2, String str3) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeString(str2);
        a.writeString(str3);
        Parcel a2 = mo31966a(17, a);
        ArrayList createTypedArrayList = a2.createTypedArrayList(zzo.CREATOR);
        a2.recycle();
        return createTypedArrayList;
    }

    /* renamed from: d */
    public final void mo32959d(zzk zzk) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) zzk);
        mo31968b(18, a);
    }
}
