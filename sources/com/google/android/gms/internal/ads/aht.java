package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.List;

@C16299uq
public final class aht extends ahl {
    /* renamed from: a */
    public final ahk mo28894a(Context context, aib aib, int i, boolean z, C15806ck ckVar, aia aia) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        boolean z2 = false;
        if (!(applicationInfo == null || applicationInfo.targetSdkVersion >= 11)) {
            return null;
        }
        aic aic = new aic(context, aib.mo28944k(), aib.mo28941g(), ckVar, aib.mo28937c());
        if (VERSION.SDK_INT < 16) {
            int i2 = i;
        } else if (i == 2) {
            z2 = true;
        }
        if (z2) {
            List asList = Arrays.asList(aia.f40556e.split(","));
            if (asList.contains("3")) {
                ajh ajh = new ajh(context, aic, aib, z, m32915a(aib), aia);
                return ajh;
            } else if (asList.contains("1")) {
                ain ain = new ain(context, aic, aib, i, z, m32915a(aib), aia);
                return ain;
            }
        } else {
            aia aia2 = aia;
        }
        boolean a = m32915a(aib);
        aic aic2 = new aic(context, aib.mo28944k(), aib.mo28941g(), ckVar, aib.mo28937c());
        agy agy = new agy(context, z, a, aia, aic2);
        return agy;
    }
}
