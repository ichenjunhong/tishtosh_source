package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.security.GeneralSecurityException;

final class aqg extends C15615app<apg, arp, arr> {
    public aqg() {
        super(apg.class, arp.class, arr.class, "type.googleapis.com/google.crypto.tink.AesEaxKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15645b mo29452c() {
        return C15645b.SYMMETRIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ azj mo29456e(awo awo) throws ayi {
        return arr.m34029a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29454d(awo awo) throws ayi {
        return arp.m34022a(awo);
    }

    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        arr arr = (arr) azj;
        avu.m34236a(arr.zzfir);
        if (arr.mo29486a().zzfjb == 12 || arr.mo29486a().zzfjb == 16) {
            return (arp) ((axz) arp.m34023b().mo29485a(awo.zzy(avr.m34234a(arr.zzfir))).mo29484a(arr.mo29486a()).mo29483a(0).mo29832e());
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        arp arp = (arp) azj;
        avu.m34237a(arp.zzfih, 0);
        avu.m34236a(arp.zzfip.size());
        if (arp.mo29482a().zzfjb == 12 || arp.mo29482a().zzfjb == 16) {
            return new aui(arp.zzfip.toByteArray(), arp.mo29482a().zzfjb);
        }
        throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
    }
}
