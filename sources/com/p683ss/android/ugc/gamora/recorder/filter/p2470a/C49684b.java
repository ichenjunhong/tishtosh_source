package com.p683ss.android.ugc.gamora.recorder.filter.p2470a;

import com.p683ss.android.ugc.aweme.filter.C31459g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.filter.a.b */
public final class C49684b {

    /* renamed from: a */
    public C31459g f124614a;

    /* renamed from: b */
    public C31459g f124615b;

    /* renamed from: c */
    public boolean f124616c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49684b) {
                C49684b bVar = (C49684b) obj;
                if (C52711k.m112239a((Object) this.f124614a, (Object) bVar.f124614a) && C52711k.m112239a((Object) this.f124615b, (Object) bVar.f124615b)) {
                    if (this.f124616c == bVar.f124616c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C31459g gVar = this.f124614a;
        int i = 0;
        int hashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        C31459g gVar2 = this.f124615b;
        if (gVar2 != null) {
            i = gVar2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f124616c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterIndicatorData(previousFilter=");
        sb.append(this.f124614a);
        sb.append(", curFilter=");
        sb.append(this.f124615b);
        sb.append(", animRtl=");
        sb.append(this.f124616c);
        sb.append(")");
        return sb.toString();
    }

    public C49684b(C31459g gVar, C31459g gVar2, boolean z) {
        this.f124614a = gVar;
        this.f124615b = gVar2;
        this.f124616c = z;
    }
}
