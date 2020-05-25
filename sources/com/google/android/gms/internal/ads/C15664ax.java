package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p1027a.C14888f;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ax */
public final class C15664ax extends C14888f<C15562ab> {
    public C15664ax() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo27254a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        if (queryLocalInterface instanceof C15562ab) {
            return (C15562ab) queryLocalInterface;
        }
        return new C15566ad(iBinder);
    }
}
