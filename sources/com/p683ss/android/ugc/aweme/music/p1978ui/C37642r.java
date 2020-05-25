package com.p683ss.android.ugc.aweme.music.p1978ui;

import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.r */
public final class C37642r {

    /* renamed from: a */
    public int f95984a;

    /* renamed from: b */
    public int f95985b;

    /* renamed from: c */
    public Effect f95986c;

    /* renamed from: d */
    public long f95987d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37642r) {
                C37642r rVar = (C37642r) obj;
                if (this.f95984a == rVar.f95984a) {
                    if ((this.f95985b == rVar.f95985b) && C52711k.m112239a((Object) this.f95986c, (Object) rVar.f95986c)) {
                        if (this.f95987d == rVar.f95987d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f95984a * 31) + this.f95985b) * 31;
        Effect effect = this.f95986c;
        int hashCode = (i + (effect != null ? effect.hashCode() : 0)) * 31;
        long j = this.f95987d;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicAndEffectProgress(type=");
        sb.append(this.f95984a);
        sb.append(", progress=");
        sb.append(this.f95985b);
        sb.append(", effect=");
        sb.append(this.f95986c);
        sb.append(", effectTotalSize=");
        sb.append(this.f95987d);
        sb.append(")");
        return sb.toString();
    }

    public C37642r(int i, int i2, Effect effect, long j) {
        this.f95984a = i;
        this.f95985b = i2;
        this.f95986c = effect;
        this.f95987d = j;
    }

    public /* synthetic */ C37642r(int i, int i2, Effect effect, long j, int i3, C52707g gVar) {
        int i4;
        if ((i3 & 2) != 0) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        if ((i3 & 4) != 0) {
            effect = null;
        }
        this(i, i4, effect, 0);
    }
}
