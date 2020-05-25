package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;
import com.google.android.gms.p1027a.C14888f;
import com.google.android.gms.p1027a.C14888f.C14889a;

@C16299uq
public final class bzq extends C14888f<C16012k> {
    public bzq() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* renamed from: a */
    public final C15931h mo30877a(Context context, zzyz zzyz, String str, C16134on onVar, int i) {
        try {
            IBinder a = ((C16012k) mo27253a(context)).mo31118a(C14886d.m30544a(context), zzyz, str, onVar, 15302000, i);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (queryLocalInterface instanceof C15931h) {
                return (C15931h) queryLocalInterface;
            }
            return new C15985j(a);
        } catch (RemoteException | C14889a e) {
            afc.m32790a("Could not create remote AdManager.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo27254a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        if (queryLocalInterface instanceof C16012k) {
            return (C16012k) queryLocalInterface;
        }
        return new C16039l(iBinder);
    }
}
