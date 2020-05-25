package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.logging.Logger;

public final class ard implements apx<apt> {

    /* renamed from: a */
    private static final Logger f41260a = Logger.getLogger(ard.class.getName());

    /* renamed from: com.google.android.gms.internal.ads.ard$a */
    static class C15620a implements apt {

        /* renamed from: a */
        private final apv<apt> f41261a;

        /* renamed from: b */
        private final byte[] f41262b;

        private C15620a(apv<apt> apv) {
            this.f41262b = new byte[]{0};
            this.f41261a = apv;
        }

        /* renamed from: a */
        public final byte[] mo29460a(byte[] bArr) throws GeneralSecurityException {
            if (this.f41261a.f41203c.f41206b.equals(atz.LEGACY)) {
                return aul.m34176a(this.f41261a.f41203c.mo29461a(), ((apt) this.f41261a.f41203c.f41205a).mo29460a(aul.m34176a(bArr, this.f41262b)));
            }
            return aul.m34176a(this.f41261a.f41203c.mo29461a(), ((apt) this.f41261a.f41203c.f41205a).mo29460a(bArr));
        }
    }

    /* renamed from: a */
    public final Class<apt> mo29462a() {
        return apt.class;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo29463a(apv apv) throws GeneralSecurityException {
        return new C15620a(apv);
    }
}
