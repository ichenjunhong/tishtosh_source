package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.p1027a.C14888f;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.yl */
public final class C16402yl extends C14888f<C16394yd> {
    public C16402yl() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo27254a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        if (queryLocalInterface instanceof C16394yd) {
            return (C16394yd) queryLocalInterface;
        }
        return new C16395ye(iBinder);
    }
}
