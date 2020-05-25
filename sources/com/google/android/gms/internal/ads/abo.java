package com.google.android.gms.internal.ads;

import java.math.BigInteger;

@C16299uq
public final class abo {

    /* renamed from: a */
    private BigInteger f40195a = BigInteger.ONE;

    /* renamed from: b */
    private String f40196b = "0";

    /* renamed from: a */
    public final synchronized String mo28605a() {
        String bigInteger;
        bigInteger = this.f40195a.toString();
        this.f40195a = this.f40195a.add(BigInteger.ONE);
        this.f40196b = bigInteger;
        return bigInteger;
    }

    /* renamed from: b */
    public final synchronized String mo28606b() {
        return this.f40196b;
    }
}
