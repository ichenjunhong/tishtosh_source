package com.google.android.play.core.p1051c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.play.core.c.ay */
public final class C17276ay extends C17271at implements C17275ax {
    public C17276ay(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.appupdate.protocol.IAppUpdateService");
    }

    /* renamed from: a */
    public final void mo33580a(String str, Bundle bundle, C17279ba baVar) throws RemoteException {
        Parcel a = mo33575a();
        a.writeString(str);
        C17273av.m42318a(a, (Parcelable) bundle);
        C17273av.m42317a(a, (IInterface) baVar);
        mo33576a(2, a);
    }

    /* renamed from: b */
    public final void mo33581b(String str, Bundle bundle, C17279ba baVar) throws RemoteException {
        Parcel a = mo33575a();
        a.writeString(str);
        C17273av.m42318a(a, (Parcelable) bundle);
        C17273av.m42317a(a, (IInterface) baVar);
        mo33576a(3, a);
    }
}
