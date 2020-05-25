package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p1027a.C14888f;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.gn */
public final class C15918gn extends C14888f<C15873ew> {
    public C15918gn() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo27254a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        if (queryLocalInterface instanceof C15873ew) {
            return (C15873ew) queryLocalInterface;
        }
        return new C15874ex(iBinder);
    }
}
