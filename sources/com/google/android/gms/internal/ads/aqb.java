package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

public class aqb implements apx<apg> {

    /* renamed from: a */
    private static final Logger f41217a = Logger.getLogger(aqb.class.getName());

    /* renamed from: com.google.android.gms.internal.ads.aqb$a */
    static class C15617a implements apg {

        /* renamed from: a */
        private final apv<apg> f41218a;

        private C15617a(apv<apg> apv) {
            this.f41218a = apv;
        }

        /* renamed from: a */
        public final byte[] mo29441a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            return aul.m34176a(this.f41218a.f41203c.mo29461a(), ((apg) this.f41218a.f41203c.f41205a).mo29441a(bArr, bArr2));
        }
    }

    /* renamed from: a */
    public final Class<apg> mo29462a() {
        return apg.class;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo29463a(apv apv) throws GeneralSecurityException {
        return new C15617a(apv);
    }
}
