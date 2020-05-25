package com.p683ss.android.ugc.aweme.shortvideo.festival;

import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.m */
public final class C43825m {

    /* renamed from: a */
    public final int f110985a;

    /* renamed from: b */
    public final String f110986b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43825m) {
                C43825m mVar = (C43825m) obj;
                if (!(this.f110985a == mVar.f110985a) || !C52711k.m112239a((Object) this.f110986b, (Object) mVar.f110986b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f110985a * 31;
        String str = this.f110986b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WaterFile(index=");
        sb.append(this.f110985a);
        sb.append(", path=");
        sb.append(this.f110986b);
        sb.append(")");
        return sb.toString();
    }

    public C43825m(int i, String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        this.f110985a = i;
        this.f110986b = str;
    }
}
