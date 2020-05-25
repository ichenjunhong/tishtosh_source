package com.google.android.gms.internal.ads;

import com.google.ads.C14850a.C14851a;
import com.google.ads.C14850a.C14852b;
import com.google.ads.mediation.C14860a;
import java.util.Date;
import java.util.HashSet;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.py */
public final class C16172py {
    /* renamed from: a */
    public static int m38624a(C14851a aVar) {
        switch (C16173pz.f45435a[aVar.ordinal()]) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static C14860a m38625a(zzyv zzyv, boolean z) {
        C14852b bVar;
        HashSet hashSet = zzyv.f46321e != null ? new HashSet(zzyv.f46321e) : null;
        Date date = new Date(zzyv.f46318b);
        switch (zzyv.f46320d) {
            case 1:
                bVar = C14852b.MALE;
                break;
            case 2:
                bVar = C14852b.FEMALE;
                break;
            default:
                bVar = C14852b.UNKNOWN;
                break;
        }
        C14860a aVar = new C14860a(date, bVar, hashSet, z, zzyv.f46327k);
        return aVar;
    }
}
