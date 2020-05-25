package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.reward.C15081b;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.yk */
public final class C16401yk implements C15081b {

    /* renamed from: a */
    private final C16385xv f45988a;

    public C16401yk(C16385xv xvVar) {
        this.f45988a = xvVar;
    }

    /* renamed from: a */
    public final String mo27793a() {
        if (this.f45988a == null) {
            return null;
        }
        try {
            return this.f45988a.mo31475a();
        } catch (RemoteException e) {
            afc.m32795c("Could not forward getType to RewardItem", e);
            return null;
        }
    }

    /* renamed from: b */
    public final int mo27794b() {
        if (this.f45988a == null) {
            return 0;
        }
        try {
            return this.f45988a.mo31476b();
        } catch (RemoteException e) {
            afc.m32795c("Could not forward getAmount to RewardItem", e);
            return 0;
        }
    }
}
