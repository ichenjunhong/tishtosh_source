package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14882b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.aa */
public final class C15561aa extends bgo implements C16390y {
    C15561aa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* renamed from: a */
    public final void mo27714a() throws RemoteException {
        mo30133b(1, mo30134z());
    }

    /* renamed from: a */
    public final void mo27715a(float f) throws RemoteException {
        Parcel z = mo30134z();
        z.writeFloat(f);
        mo30133b(2, z);
    }

    /* renamed from: a */
    public final void mo27719a(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(3, z);
    }

    /* renamed from: a */
    public final void mo27721a(boolean z) throws RemoteException {
        Parcel z2 = mo30134z();
        bgq.m35597a(z2, z);
        mo30133b(4, z2);
    }

    /* renamed from: a */
    public final void mo27716a(C14882b bVar, String str) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) bVar);
        z.writeString(str);
        mo30133b(5, z);
    }

    /* renamed from: a */
    public final void mo27720a(String str, C14882b bVar) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        bgq.m35595a(z, (IInterface) bVar);
        mo30133b(6, z);
    }

    /* renamed from: b */
    public final float mo27722b() throws RemoteException {
        Parcel a = mo30131a(7, mo30134z());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    /* renamed from: c */
    public final boolean mo27724c() throws RemoteException {
        Parcel a = mo30131a(8, mo30134z());
        boolean a2 = bgq.m35598a(a);
        a.recycle();
        return a2;
    }

    /* renamed from: d */
    public final String mo27725d() throws RemoteException {
        Parcel a = mo30131a(9, mo30134z());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final void mo27723b(String str) throws RemoteException {
        Parcel z = mo30134z();
        z.writeString(str);
        mo30133b(10, z);
    }

    /* renamed from: a */
    public final void mo27718a(C16134on onVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) onVar);
        mo30133b(11, z);
    }

    /* renamed from: a */
    public final void mo27717a(C15986ja jaVar) throws RemoteException {
        Parcel z = mo30134z();
        bgq.m35595a(z, (IInterface) jaVar);
        mo30133b(12, z);
    }

    /* renamed from: e */
    public final List<zzaki> mo27726e() throws RemoteException {
        Parcel a = mo30131a(13, mo30134z());
        ArrayList createTypedArrayList = a.createTypedArrayList(zzaki.CREATOR);
        a.recycle();
        return createTypedArrayList;
    }
}
