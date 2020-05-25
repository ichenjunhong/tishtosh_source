package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

final class aqy extends C15615app<apt, asx, ata> {
    public aqy() {
        super(apt.class, asx.class, ata.class, "type.googleapis.com/google.crypto.tink.HmacKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15645b mo29452c() {
        return C15645b.SYMMETRIC;
    }

    /* renamed from: a */
    private static void m33981a(atc atc) throws GeneralSecurityException {
        if (atc.zzflu >= 10) {
            switch (atc.mo29523a()) {
                case SHA1:
                    if (atc.zzflu > 20) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case SHA256:
                    if (atc.zzflu > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case SHA512:
                    if (atc.zzflu > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                default:
                    throw new GeneralSecurityException("unknown hash type");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ azj mo29456e(awo awo) throws ayi {
        return ata.m34101a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29454d(awo awo) throws ayi {
        return asx.m34080a(awo);
    }

    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        ata ata = (ata) azj;
        if (ata.zzfir >= 16) {
            m33981a(ata.mo29522a());
            return (asx) ((axz) asx.m34081b().mo29509a(0).mo29510a(ata.mo29522a()).mo29511a(awo.zzy(avr.m34234a(ata.zzfir))).mo29832e());
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        asx asx = (asx) azj;
        avu.m34237a(asx.zzfih, 0);
        if (asx.zzfip.size() >= 16) {
            m33981a(asx.mo29508a());
            asv a = asx.mo29508a().mo29523a();
            SecretKeySpec secretKeySpec = new SecretKeySpec(asx.zzfip.toByteArray(), "HMAC");
            int i = asx.mo29508a().zzflu;
            switch (a) {
                case SHA1:
                    return new avo("HMACSHA1", secretKeySpec, i);
                case SHA256:
                    return new avo("HMACSHA256", secretKeySpec, i);
                case SHA512:
                    return new avo("HMACSHA512", secretKeySpec, i);
                default:
                    throw new GeneralSecurityException("unknown hash");
            }
        } else {
            throw new GeneralSecurityException("key too short");
        }
    }
}
