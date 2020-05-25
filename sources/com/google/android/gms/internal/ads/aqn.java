package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;

final class aqn extends C15615app<C15614apm, asl, ash> implements apo<C15614apm> {
    public aqn() {
        super(C15614apm.class, asl.class, ash.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15645b mo29452c() {
        return C15645b.ASYMMETRIC_PRIVATE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ azj mo29456e(awo awo) throws ayi {
        return ash.m34050a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29454d(awo awo) throws ayi {
        return asl.m34058a(awo);
    }

    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        ash ash = (ash) azj;
        aqv.m33978a(ash.mo29493a());
        KeyPair a = auy.m34200a(auy.m34201a(aqv.m33975a(ash.mo29493a().mo29494a().mo29506a())));
        ECPublicKey eCPublicKey = (ECPublicKey) a.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a.getPrivate();
        ECPoint w = eCPublicKey.getW();
        return (asl) ((axz) asl.m34059b().mo29498a(0).mo29499a((asn) ((axz) asn.m34066b().mo29502a(0).mo29503a(ash.mo29493a()).mo29504a(awo.zzy(w.getAffineX().toByteArray())).mo29505b(awo.zzy(w.getAffineY().toByteArray())).mo29832e())).mo29500a(awo.zzy(eCPrivateKey.getS().toByteArray())).mo29832e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        asl asl = (asl) azj;
        avu.m34237a(asl.zzfih, 0);
        aqv.m33978a(asl.mo29497a().mo29501a());
        asj a = asl.mo29497a().mo29501a();
        asp a2 = a.mo29494a();
        ava a3 = aqv.m33975a(a2.mo29506a());
        byte[] byteArray = asl.zzfip.toByteArray();
        aur aur = new aur((ECPrivateKey) ((KeyFactory) avd.f41426g.mo29568a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, byteArray), auy.m34201a(a3))), a2.zzfky.toByteArray(), aqv.m33977a(a2.mo29507b()), aqv.m33976a(a.mo29496c()), new aqx(a.mo29495b().mo29492a()));
        return aur;
    }
}
