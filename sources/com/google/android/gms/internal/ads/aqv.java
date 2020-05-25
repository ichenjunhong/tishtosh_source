package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

final class aqv {
    /* renamed from: a */
    public static void m33978a(asj asj) throws GeneralSecurityException {
        auy.m34201a(m33975a(asj.mo29494a().mo29506a()));
        m33977a(asj.mo29494a().mo29507b());
        if (asj.mo29496c() != asc.UNKNOWN_FORMAT) {
            apy.m33898a(asj.mo29495b().mo29492a());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    /* renamed from: a */
    public static String m33977a(asv asv) throws NoSuchAlgorithmException {
        switch (aqw.f41228a[asv.ordinal()]) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha256";
            case 3:
                return "HmacSha512";
            default:
                String valueOf = String.valueOf(asv);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
                sb.append("hash unsupported for HMAC: ");
                sb.append(valueOf);
                throw new NoSuchAlgorithmException(sb.toString());
        }
    }

    /* renamed from: a */
    public static ava m33975a(asr asr) throws GeneralSecurityException {
        switch (aqw.f41229b[asr.ordinal()]) {
            case 1:
                return ava.NIST_P256;
            case 2:
                return ava.NIST_P384;
            case 3:
                return ava.NIST_P521;
            default:
                String valueOf = String.valueOf(asr);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("unknown curve type: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
    }

    /* renamed from: a */
    public static avb m33976a(asc asc) throws GeneralSecurityException {
        switch (aqw.f41230c[asc.ordinal()]) {
            case 1:
                return avb.UNCOMPRESSED;
            case 2:
                return avb.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
            case 3:
                return avb.COMPRESSED;
            default:
                String valueOf = String.valueOf(asc);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("unknown point format: ");
                sb.append(valueOf);
                throw new GeneralSecurityException(sb.toString());
        }
    }
}
