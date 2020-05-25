package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.List;

@C16299uq
public final class akl implements ald {
    /* renamed from: a */
    public final akt mo29084a(aib aib, int i, String str, aia aia) {
        if (VERSION.SDK_INT >= 16 && i > 0) {
            List asList = Arrays.asList(aia.f40556e.split(","));
            if (asList.contains("3")) {
                int b = ajz.m33123b();
                if (b < aia.f40559h) {
                    return new alq(aib, aia);
                }
                if (b < aia.f40553b) {
                    return new alp(aib, aia);
                }
                return new alf(aib);
            } else if (asList.contains("1")) {
                int a = aig.m32996a();
                if (a < aia.f40559h) {
                    if (i == 1) {
                        return new alk(aib);
                    }
                    if (i == 2) {
                        return new alh(aib, null);
                    }
                }
                if (a < aia.f40553b) {
                    return new alg(aib, aia);
                }
                return new alf(aib);
            }
        }
        return new ale(aib);
    }
}
