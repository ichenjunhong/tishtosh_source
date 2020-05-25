package com.p683ss.android.ugc.aweme.sticker.p2285i.p2296e;

import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.e.b */
public final class C46021b {

    /* renamed from: a */
    public final List<Effect> f116145a;

    /* renamed from: b */
    public final int f116146b;

    /* renamed from: c */
    public final int f116147c;

    /* renamed from: d */
    public final Map<String, String> f116148d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46021b) {
                C46021b bVar = (C46021b) obj;
                if (C52711k.m112239a((Object) this.f116145a, (Object) bVar.f116145a)) {
                    if (this.f116146b == bVar.f116146b) {
                        if (!(this.f116147c == bVar.f116147c) || !C52711k.m112239a((Object) this.f116148d, (Object) bVar.f116148d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List<Effect> list = this.f116145a;
        int i = 0;
        int hashCode = (((((list != null ? list.hashCode() : 0) * 31) + this.f116146b) * 31) + this.f116147c) * 31;
        Map<String, String> map = this.f116148d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PinStickerRequest(effects=");
        sb.append(this.f116145a);
        sb.append(", pinIndex=");
        sb.append(this.f116146b);
        sb.append(", priority=");
        sb.append(this.f116147c);
        sb.append(", extraParam=");
        sb.append(this.f116148d);
        sb.append(")");
        return sb.toString();
    }

    public C46021b(List<? extends Effect> list, int i, int i2, Map<String, String> map) {
        C52711k.m112240b(list, "effects");
        this.f116145a = list;
        this.f116146b = i;
        this.f116147c = i2;
        this.f116148d = map;
    }

    public /* synthetic */ C46021b(List list, int i, int i2, Map map, int i3, C52707g gVar) {
        this(list, i, 0, null);
    }
}
