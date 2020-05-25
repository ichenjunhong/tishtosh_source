package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.arj.C15623a;
import com.google.android.gms.internal.ads.arw.C15629a;
import com.google.android.gms.internal.ads.asx.C15640a;
import java.security.GeneralSecurityException;
import java.util.Arrays;

final class aqx implements auq {

    /* renamed from: a */
    private final String f41231a;

    /* renamed from: b */
    private final int f41232b;

    /* renamed from: c */
    private arw f41233c;

    /* renamed from: d */
    private arf f41234d;

    /* renamed from: e */
    private int f41235e;

    aqx(atj atj) throws GeneralSecurityException {
        this.f41231a = atj.zzflw;
        if (this.f41231a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                ary a = ary.m34039a(atj.zzflx);
                this.f41233c = (arw) apy.m33907b(atj);
                this.f41232b = a.zzfir;
            } catch (ayi e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (this.f41231a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                arh a2 = arh.m34004a(atj.zzflx);
                this.f41234d = (arf) apy.m33907b(atj);
                this.f41235e = a2.mo29475a().zzfir;
                this.f41232b = this.f41235e + a2.mo29476b().zzfir;
            } catch (ayi e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else {
            String str = "unsupported AEAD DEM key type: ";
            String valueOf = String.valueOf(this.f41231a);
            throw new GeneralSecurityException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: a */
    public final int mo29466a() {
        return this.f41232b;
    }

    /* renamed from: a */
    public final apg mo29467a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.f41232b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f41231a.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            return (apg) apy.m33902a(this.f41231a, (azj) (arw) ((axz) ((C15629a) arw.m34034a().mo29582a(this.f41233c)).mo29488a(awo.zzi(bArr, 0, this.f41232b)).mo29832e()), apg.class);
        } else if (this.f41231a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f41235e);
            asx asx = (asx) ((axz) ((C15640a) asx.m34081b().mo29582a(this.f41234d.mo29471b())).mo29511a(awo.zzy(Arrays.copyOfRange(bArr, this.f41235e, this.f41232b))).mo29832e());
            return (apg) apy.m33902a(this.f41231a, (azj) (arf) ((axz) arf.m33997c().mo29472a(this.f41234d.zzfih).mo29473a((arj) ((axz) ((C15623a) arj.m34009b().mo29582a(this.f41234d.mo29470a())).mo29480a(awo.zzy(copyOfRange)).mo29832e())).mo29474a(asx).mo29832e()), apg.class);
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
