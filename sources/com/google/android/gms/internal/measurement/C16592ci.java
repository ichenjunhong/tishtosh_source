package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;

/* renamed from: com.google.android.gms.internal.measurement.ci */
public final class C16592ci extends C16655ej implements C16591ch {
    C16592ci(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    /* renamed from: a */
    public final void mo31873a(C14882b bVar, zzdy zzdy, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) bVar);
        C16666eu.m39820a(a, (Parcelable) zzdy);
        a.writeLong(j);
        mo31968b(1, a);
    }

    /* renamed from: a */
    public final void mo31879a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeString(str2);
        C16666eu.m39820a(a, (Parcelable) bundle);
        C16666eu.m39821a(a, z);
        C16666eu.m39821a(a, z2);
        a.writeLong(j);
        mo31968b(2, a);
    }

    /* renamed from: a */
    public final void mo31880a(String str, String str2, C14882b bVar, boolean z, long j) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeString(str2);
        C16666eu.m39819a(a, (IInterface) bVar);
        C16666eu.m39821a(a, z);
        a.writeLong(j);
        mo31968b(4, a);
    }

    /* renamed from: a */
    public final void mo31882a(String str, String str2, boolean z, C16593cj cjVar) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeString(str2);
        C16666eu.m39821a(a, z);
        C16666eu.m39819a(a, (IInterface) cjVar);
        mo31968b(5, a);
    }

    /* renamed from: a */
    public final void mo31877a(String str, C16593cj cjVar) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        C16666eu.m39819a(a, (IInterface) cjVar);
        mo31968b(6, a);
    }

    /* renamed from: a */
    public final void mo31868a(Bundle bundle, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) bundle);
        a.writeLong(j);
        mo31968b(8, a);
    }

    /* renamed from: a */
    public final void mo31878a(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeString(str2);
        C16666eu.m39820a(a, (Parcelable) bundle);
        mo31968b(9, a);
    }

    /* renamed from: a */
    public final void mo31881a(String str, String str2, C16593cj cjVar) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeString(str2);
        C16666eu.m39819a(a, (IInterface) cjVar);
        mo31968b(10, a);
    }

    /* renamed from: a */
    public final void mo31874a(C14882b bVar, String str, String str2, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) bVar);
        a.writeString(str);
        a.writeString(str2);
        a.writeLong(j);
        mo31968b(15, a);
    }

    /* renamed from: a */
    public final void mo31875a(C16593cj cjVar) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) cjVar);
        mo31968b(16, a);
    }

    /* renamed from: b */
    public final void mo31884b(C16593cj cjVar) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) cjVar);
        mo31968b(17, a);
    }

    /* renamed from: c */
    public final void mo31887c(C16593cj cjVar) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) cjVar);
        mo31968b(19, a);
    }

    /* renamed from: d */
    public final void mo31889d(C16593cj cjVar) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) cjVar);
        mo31968b(21, a);
    }

    /* renamed from: e */
    public final void mo31891e(C16593cj cjVar) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) cjVar);
        mo31968b(22, a);
    }

    /* renamed from: a */
    public final void mo31876a(String str, long j) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeLong(j);
        mo31968b(23, a);
    }

    /* renamed from: b */
    public final void mo31885b(String str, long j) throws RemoteException {
        Parcel a = mo31965a();
        a.writeString(str);
        a.writeLong(j);
        mo31968b(24, a);
    }

    /* renamed from: a */
    public final void mo31870a(C14882b bVar, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) bVar);
        a.writeLong(j);
        mo31968b(25, a);
    }

    /* renamed from: b */
    public final void mo31883b(C14882b bVar, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) bVar);
        a.writeLong(j);
        mo31968b(26, a);
    }

    /* renamed from: a */
    public final void mo31871a(C14882b bVar, Bundle bundle, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) bVar);
        C16666eu.m39820a(a, (Parcelable) bundle);
        a.writeLong(j);
        mo31968b(27, a);
    }

    /* renamed from: c */
    public final void mo31886c(C14882b bVar, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) bVar);
        a.writeLong(j);
        mo31968b(28, a);
    }

    /* renamed from: d */
    public final void mo31888d(C14882b bVar, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) bVar);
        a.writeLong(j);
        mo31968b(29, a);
    }

    /* renamed from: e */
    public final void mo31890e(C14882b bVar, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) bVar);
        a.writeLong(j);
        mo31968b(30, a);
    }

    /* renamed from: a */
    public final void mo31872a(C14882b bVar, C16593cj cjVar, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39819a(a, (IInterface) bVar);
        C16666eu.m39819a(a, (IInterface) cjVar);
        a.writeLong(j);
        mo31968b(31, a);
    }

    /* renamed from: a */
    public final void mo31869a(Bundle bundle, C16593cj cjVar, long j) throws RemoteException {
        Parcel a = mo31965a();
        C16666eu.m39820a(a, (Parcelable) bundle);
        C16666eu.m39819a(a, (IInterface) cjVar);
        a.writeLong(j);
        mo31968b(32, a);
    }

    /* renamed from: a */
    public final void mo31867a(int i, String str, C14882b bVar, C14882b bVar2, C14882b bVar3) throws RemoteException {
        Parcel a = mo31965a();
        a.writeInt(i);
        a.writeString(str);
        C16666eu.m39819a(a, (IInterface) bVar);
        C16666eu.m39819a(a, (IInterface) bVar2);
        C16666eu.m39819a(a, (IInterface) bVar3);
        mo31968b(33, a);
    }
}
