package com.p683ss.android.ugc.aweme.sticker.presenter;

import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.h */
public final class C46299h {

    /* renamed from: a */
    public final Effect f116795a;

    /* renamed from: b */
    public final int f116796b;

    public C46299h() {
        this(null, 0, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46299h) {
                C46299h hVar = (C46299h) obj;
                if (C52711k.m112239a((Object) this.f116795a, (Object) hVar.f116795a)) {
                    if (this.f116796b == hVar.f116796b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Effect effect = this.f116795a;
        return ((effect != null ? effect.hashCode() : 0) * 31) + this.f116796b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSticker(effect=");
        sb.append(this.f116795a);
        sb.append(", position=");
        sb.append(this.f116796b);
        sb.append(")");
        return sb.toString();
    }

    public C46299h(Effect effect, int i) {
        this.f116795a = effect;
        this.f116796b = i;
    }

    public /* synthetic */ C46299h(Effect effect, int i, int i2, C52707g gVar) {
        this(null, -1);
    }
}
