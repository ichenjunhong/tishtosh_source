package com.p683ss.android.ugc.aweme.sticker.presenter;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.m */
public final class C46355m {

    /* renamed from: a */
    public final String f116949a;

    /* renamed from: b */
    public final boolean f116950b;

    /* renamed from: c */
    public final boolean f116951c;

    /* renamed from: d */
    public final boolean f116952d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46355m) {
                C46355m mVar = (C46355m) obj;
                if (C52711k.m112239a((Object) this.f116949a, (Object) mVar.f116949a)) {
                    if (this.f116950b == mVar.f116950b) {
                        if (this.f116951c == mVar.f116951c) {
                            if (this.f116952d == mVar.f116952d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f116949a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f116950b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.f116951c;
        if (z2) {
            z2 = true;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f116952d;
        if (z3) {
            z3 = true;
        }
        return i2 + (z3 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerManagerConfigure(panel=");
        sb.append(this.f116949a);
        sb.append(", lazyLoad=");
        sb.append(this.f116950b);
        sb.append(", shouldPrefetch=");
        sb.append(this.f116951c);
        sb.append(", isFavoriteEnable=");
        sb.append(this.f116952d);
        sb.append(")");
        return sb.toString();
    }

    public C46355m(String str, boolean z, boolean z2, boolean z3) {
        C52711k.m112240b(str, "panel");
        this.f116949a = str;
        this.f116950b = z;
        this.f116951c = z2;
        this.f116952d = z3;
    }

    public /* synthetic */ C46355m(String str, boolean z, boolean z2, boolean z3, int i, C52707g gVar) {
        this(str, true, true, true);
    }
}
