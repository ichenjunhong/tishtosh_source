package com.p683ss.android.ugc.aweme.sticker.p2285i.p2296e;

import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.e.d */
public final class C46023d {

    /* renamed from: a */
    public final String f116153a;

    /* renamed from: b */
    public final int f116154b;

    /* renamed from: c */
    public final int f116155c;

    /* renamed from: d */
    public final boolean f116156d;

    public C46023d() {
        this(null, 0, 0, false, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46023d) {
                C46023d dVar = (C46023d) obj;
                if (C52711k.m112239a((Object) this.f116153a, (Object) dVar.f116153a)) {
                    if (this.f116154b == dVar.f116154b) {
                        if (this.f116155c == dVar.f116155c) {
                            if (this.f116156d == dVar.f116156d) {
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
        String str = this.f116153a;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f116154b) * 31) + this.f116155c) * 31;
        boolean z = this.f116156d;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPanelInfoFetcherRequest(category=");
        sb.append(this.f116153a);
        sb.append(", count=");
        sb.append(this.f116154b);
        sb.append(", cursor=");
        sb.append(this.f116155c);
        sb.append(", withCategoryEffects=");
        sb.append(this.f116156d);
        sb.append(")");
        return sb.toString();
    }

    private C46023d(String str, int i, int i2, boolean z) {
        C52711k.m112240b(str, "category");
        this.f116153a = str;
        this.f116154b = i;
        this.f116155c = i2;
        this.f116156d = z;
    }

    public /* synthetic */ C46023d(String str, int i, int i2, boolean z, int i3, C52707g gVar) {
        this("", 0, 0, true);
    }
}
