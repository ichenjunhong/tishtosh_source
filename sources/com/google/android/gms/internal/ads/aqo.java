package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

final class aqo extends C15615app<apn, asn, ast> {
    public aqo() {
        super(apn.class, asn.class, ast.class, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15645b mo29452c() {
        return C15645b.ASYMMETRIC_PUBLIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ azj mo29456e(awo awo) throws ayi {
        return ast.m34078a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29454d(awo awo) throws ayi {
        return asn.m34065a(awo);
    }

    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        throw new GeneralSecurityException("Not implemented.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        asn asn = (asn) azj;
        avu.m34237a(asn.zzfih, 0);
        aqv.m33978a(asn.mo29501a());
        asj a = asn.mo29501a();
        asp a2 = a.mo29494a();
        ava a3 = aqv.m33975a(a2.mo29506a());
        byte[] byteArray = asn.zzfke.toByteArray();
        byte[] byteArray2 = asn.zzfkf.toByteArray();
        ECParameterSpec a4 = auy.m34201a(a3);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
        auy.m34203a(eCPoint, a4.getCurve());
        aus aus = new aus((ECPublicKey) ((KeyFactory) avd.f41426g.mo29568a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, a4)), a2.zzfky.toByteArray(), aqv.m33977a(a2.mo29507b()), aqv.m33976a(a.mo29496c()), new aqx(a.mo29495b().mo29492a()));
        return aus;
    }
}
