package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2292c;

import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.d */
public final class C45951d {

    /* renamed from: a */
    public final Effect f115957a;

    /* renamed from: b */
    public final boolean f115958b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45951d) {
                C45951d dVar = (C45951d) obj;
                if (C52711k.m112239a((Object) this.f115957a, (Object) dVar.f115957a)) {
                    if (this.f115958b == dVar.f115958b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Effect effect = this.f115957a;
        int hashCode = (effect != null ? effect.hashCode() : 0) * 31;
        boolean z = this.f115958b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteModifyFetcherRequest(favorite=");
        sb.append(this.f115957a);
        sb.append(", isFavorite=");
        sb.append(this.f115958b);
        sb.append(")");
        return sb.toString();
    }

    public C45951d(Effect effect, boolean z) {
        C52711k.m112240b(effect, "favorite");
        this.f115957a = effect;
        this.f115958b = z;
    }
}
