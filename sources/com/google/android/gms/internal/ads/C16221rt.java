package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.p1027a.C14886d;
import com.google.android.gms.p1027a.C14888f;
import com.google.android.gms.p1027a.C14888f.C14889a;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.rt */
public final class C16221rt extends C14888f<C16225rx> {
    public C16221rt() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    /* renamed from: a */
    public final C16222ru mo31374a(Activity activity) {
        try {
            IBinder a = ((C16225rx) mo27253a((Context) activity)).mo31375a(C14886d.m30544a(activity));
            if (a == null) {
                return null;
            }
            IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            if (queryLocalInterface instanceof C16222ru) {
                return (C16222ru) queryLocalInterface;
            }
            return new C16224rw(a);
        } catch (RemoteException e) {
            afc.m32795c("Could not create remote AdOverlay.", e);
            return null;
        } catch (C14889a e2) {
            afc.m32795c("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo27254a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        if (queryLocalInterface instanceof C16225rx) {
            return (C16225rx) queryLocalInterface;
        }
        return new C16226ry(iBinder);
    }
}
