package com.bytedance.ies.bullet.p628b.p630b;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.bytedance.ies.bullet.b.b.a */
public final class C10243a {

    /* renamed from: a */
    public boolean f27637a;

    /* renamed from: b */
    public boolean f27638b;

    public C10243a() {
        this(false, false, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10243a) {
                C10243a aVar = (C10243a) obj;
                if (this.f27637a == aVar.f27637a) {
                    if (this.f27638b == aVar.f27638b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f27637a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.f27638b;
        if (!z2) {
            i = z2;
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DebugConfiguration(debuggable=");
        sb.append(this.f27637a);
        sb.append(", showDebugTagView=");
        sb.append(this.f27638b);
        sb.append(")");
        return sb.toString();
    }

    public C10243a(boolean z, boolean z2) {
        this.f27637a = z;
        this.f27638b = z2;
    }

    public /* synthetic */ C10243a(boolean z, boolean z2, int i, C52707g gVar) {
        this(false, true);
    }
}
