package com.p683ss.android.ugc.network.observer.bean;

import com.p683ss.android.ugc.network.observer.C50088b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.network.observer.bean.a */
public final class C50092a {

    /* renamed from: a */
    public final boolean f125465a;

    /* renamed from: b */
    public final C50088b f125466b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C50092a) {
                C50092a aVar = (C50092a) obj;
                if (!(this.f125465a == aVar.f125465a) || !C52711k.m112239a((Object) this.f125466b, (Object) aVar.f125466b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f125465a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        C50088b bVar = this.f125466b;
        return i + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DetectResult(needNextStep=");
        sb.append(this.f125465a);
        sb.append(", state=");
        sb.append(this.f125466b);
        sb.append(")");
        return sb.toString();
    }

    public C50092a(boolean z, C50088b bVar) {
        C52711k.m112240b(bVar, "state");
        this.f125465a = z;
        this.f125466b = bVar;
    }
}
