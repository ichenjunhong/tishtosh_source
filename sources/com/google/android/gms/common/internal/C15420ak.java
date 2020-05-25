package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p1043d.C16479a;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14882b.C14883a;

/* renamed from: com.google.android.gms.common.internal.ak */
public final class C15420ak extends C16479a implements C15418ai {
    public C15420ak(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public final C14882b mo28387a() throws RemoteException {
        Parcel a = mo31687a(1, mo31690c());
        C14882b a2 = C14883a.m30535a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    /* renamed from: b */
    public final int mo28388b() throws RemoteException {
        Parcel a = mo31687a(2, mo31690c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
