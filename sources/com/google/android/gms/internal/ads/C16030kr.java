package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14979bm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.kr */
final class C16030kr {

    /* renamed from: a */
    private final Object[] f45116a;

    C16030kr(zzyv zzyv, String str, int i) {
        String str2 = (String) caf.m37099d().mo30717a(C15740bx.f44228aO);
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(",")));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("formatString")) {
            arrayList.add(null);
        }
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzyv.f46318b));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(C14979bm.m30907a(zzyv.f46319c));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzyv.f46320d));
        }
        if (hashSet.contains("keywords")) {
            if (zzyv.f46321e != null) {
                arrayList.add(zzyv.f46321e.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzyv.f46322f));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzyv.f46323g));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzyv.f46324h));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzyv.f46325i);
        }
        if (hashSet.contains("location")) {
            if (zzyv.f46327k != null) {
                arrayList.add(zzyv.f46327k.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzyv.f46328l);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(C14979bm.m30907a(zzyv.f46329m));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(C14979bm.m30907a(zzyv.f46330n));
        }
        if (hashSet.contains("categoryExclusions")) {
            if (zzyv.f46331o != null) {
                arrayList.add(zzyv.f46331o.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzyv.f46332p);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzyv.f46333q);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzyv.f46334r));
        }
        this.f45116a = arrayList.toArray();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16030kr)) {
            return false;
        }
        return Arrays.equals(this.f45116a, ((C16030kr) obj).f45116a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45116a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f45116a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 24);
        sb.append("[InterstitialAdPoolKey ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
