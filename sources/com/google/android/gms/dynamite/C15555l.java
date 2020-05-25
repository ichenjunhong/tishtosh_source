package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1043d.C16479a;
import com.google.android.gms.internal.p1043d.C16481c;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.dynamite.l */
public final class C15555l extends C16479a implements C15554k {
    C15555l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* renamed from: a */
    public final C14882b mo28540a(C14882b bVar, String str, int i, C14882b bVar2) throws RemoteException {
        Parcel c = mo31690c();
        C16481c.m39348a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        C16481c.m39348a(c, (IInterface) bVar2);
        Parcel a = mo31687a(2, c);
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final C14882b mo28541b(C14882b bVar, String str, int i, C14882b bVar2) throws RemoteException {
        Parcel c = mo31690c();
        C16481c.m39348a(c, (IInterface) bVar);
        c.writeString(str);
        c.writeInt(i);
        C16481c.m39348a(c, (IInterface) bVar2);
        Parcel a = mo31687a(3, c);
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
