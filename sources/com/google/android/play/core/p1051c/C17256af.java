package com.google.android.play.core.p1051c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.List;

/* renamed from: com.google.android.play.core.c.af */
public final class C17256af extends C17271at implements C17254ad {
    public C17256af(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* renamed from: a */
    public final void mo33528a(String str, int i, Bundle bundle, C17255ae aeVar) throws RemoteException {
        Parcel a = mo33575a();
        a.writeString(str);
        a.writeInt(i);
        C17273av.m42318a(a, (Parcelable) bundle);
        C17273av.m42317a(a, (IInterface) aeVar);
        mo33576a(4, a);
    }

    /* renamed from: a */
    public final void mo33529a(String str, int i, C17255ae aeVar) throws RemoteException {
        Parcel a = mo33575a();
        a.writeString(str);
        a.writeInt(i);
        C17273av.m42317a(a, (IInterface) aeVar);
        mo33576a(5, a);
    }

    /* renamed from: a */
    public final void mo33530a(String str, List<Bundle> list, Bundle bundle, C17255ae aeVar) throws RemoteException {
        Parcel a = mo33575a();
        a.writeString(str);
        a.writeTypedList(list);
        C17273av.m42318a(a, (Parcelable) bundle);
        C17273av.m42317a(a, (IInterface) aeVar);
        mo33576a(2, a);
    }
}
