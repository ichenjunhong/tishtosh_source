package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.cz */
final class C15821cz implements C15948hq<Object> {

    /* renamed from: a */
    private final /* synthetic */ C15820cy f44816a;

    C15821cz(C15820cy cyVar) {
        this.f44816a = cyVar;
    }

    /* renamed from: a */
    public final void mo27606a(Object obj, Map<String, String> map) {
        try {
            this.f44816a.f44814e = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            abv.m32794c("Failed to call parse unconfirmedClickTimestamp.");
        }
        this.f44816a.f44813d = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (this.f44816a.f44811b == null) {
            abv.m32792b("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            this.f44816a.f44811b.mo31083a(str);
        } catch (RemoteException e) {
            afc.m32797d("#007 Could not call remote method.", e);
        }
    }
}
