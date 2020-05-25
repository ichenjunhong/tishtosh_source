package com.p683ss.android.ugc.aweme.sticker.panel;

import android.view.View;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.panel.l */
public final class C46194l {

    /* renamed from: a */
    public final int f116546a;

    /* renamed from: b */
    public final C52671b<View, C52860x> f116547b;

    public C46194l() {
        this(0, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46194l) {
                C46194l lVar = (C46194l) obj;
                if (!(this.f116546a == lVar.f116546a) || !C52711k.m112239a((Object) this.f116547b, (Object) lVar.f116547b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f116546a * 31;
        C52671b<View, C52860x> bVar = this.f116547b;
        return i + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReverseCameraConfigure(topMargin=");
        sb.append(this.f116546a);
        sb.append(", onSwitchCamera=");
        sb.append(this.f116547b);
        sb.append(")");
        return sb.toString();
    }

    private C46194l(int i, C52671b<? super View, C52860x> bVar) {
        this.f116546a = i;
        this.f116547b = bVar;
    }

    public /* synthetic */ C46194l(int i, C52671b bVar, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            bVar = null;
        }
        this(0, bVar);
    }
}
