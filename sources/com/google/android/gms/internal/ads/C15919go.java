package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p1027a.C14888f;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.go */
public final class C15919go extends C14888f<C15879fb> {
    public C15919go() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo27254a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        if (queryLocalInterface instanceof C15879fb) {
            return (C15879fb) queryLocalInterface;
        }
        return new C15880fc(iBinder);
    }
}
