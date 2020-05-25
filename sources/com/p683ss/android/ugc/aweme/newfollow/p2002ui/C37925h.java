package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.h */
public final class C37925h {

    /* renamed from: a */
    public final String f96579a;

    /* renamed from: b */
    public final boolean f96580b = true;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37925h) {
                C37925h hVar = (C37925h) obj;
                if (C52711k.m112239a((Object) this.f96579a, (Object) hVar.f96579a)) {
                    if (this.f96580b == hVar.f96580b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f96579a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z = this.f96580b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserVisibleHintData(page=");
        sb.append(this.f96579a);
        sb.append(", visible=");
        sb.append(this.f96580b);
        sb.append(")");
        return sb.toString();
    }

    public C37925h(String str, boolean z) {
        this.f96579a = str;
    }
}
