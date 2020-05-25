package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;
import com.google.android.gms.p1027a.C14888f;
import com.google.android.gms.p1027a.C14888f.C14889a;

@C16299uq
public final class bzp extends C14888f<C15877f> {
    public bzp() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* renamed from: a */
    public final C15795c mo30876a(Context context, String str, C16134on onVar) {
        try {
            IBinder a = ((C15877f) mo27253a(context)).mo31074a(C14886d.m30544a(context), str, onVar, 15302000);
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (queryLocalInterface instanceof C15795c) {
                return (C15795c) queryLocalInterface;
            }
            return new C15850e(a);
        } catch (RemoteException | C14889a e) {
            afc.m32795c("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo27254a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        if (queryLocalInterface instanceof C15877f) {
            return (C15877f) queryLocalInterface;
        }
        return new C15904g(iBinder);
    }
}
