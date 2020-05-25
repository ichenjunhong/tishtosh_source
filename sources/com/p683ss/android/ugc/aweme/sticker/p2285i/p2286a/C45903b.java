package com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a;

import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.a.b */
public final class C45903b {

    /* renamed from: a */
    public final boolean f115915a;

    /* renamed from: b */
    public final Effect f115916b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45903b) {
                C45903b bVar = (C45903b) obj;
                if (!(this.f115915a == bVar.f115915a) || !C52711k.m112239a((Object) this.f115916b, (Object) bVar.f115916b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f115915a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        Effect effect = this.f115916b;
        return i + (effect != null ? effect.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteModifyEvent(isFavorite=");
        sb.append(this.f115915a);
        sb.append(", effect=");
        sb.append(this.f115916b);
        sb.append(")");
        return sb.toString();
    }

    public C45903b(boolean z, Effect effect) {
        C52711k.m112240b(effect, "effect");
        this.f115915a = z;
        this.f115916b = effect;
    }
}
