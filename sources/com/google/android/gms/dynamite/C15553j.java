package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1043d.C16479a;
import com.google.android.gms.internal.p1043d.C16481c;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.dynamite.j */
public final class C15553j extends C16479a implements C15552i {
    C15553j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* renamed from: a */
    public final C14882b mo28537a(C14882b bVar, String str, int i) throws RemoteException {
        Parcel c = mo31690c();
        C16481c.m39348a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo31687a(2, c);
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: a */
    public final int mo28536a(C14882b bVar, String str, boolean z) throws RemoteException {
        Parcel c = mo31690c();
        C16481c.m39348a(c, (IInterface) bVar);
        c.writeString(str);
        C16481c.m39350a(c, z);
        Parcel a = mo31687a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: b */
    public final C14882b mo28539b(C14882b bVar, String str, int i) throws RemoteException {
        Parcel c = mo31690c();
        C16481c.m39348a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = mo31687a(4, c);
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo28538b(C14882b bVar, String str, boolean z) throws RemoteException {
        Parcel c = mo31690c();
        C16481c.m39348a(c, (IInterface) bVar);
        c.writeString(str);
        C16481c.m39350a(c, z);
        Parcel a = mo31687a(5, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    /* renamed from: a */
    public final int mo28535a() throws RemoteException {
        Parcel a = mo31687a(6, mo31690c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
