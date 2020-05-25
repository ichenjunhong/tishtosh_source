package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.model.as */
public final class C39113as {
    @C17952c(mo34828a = "tag_name")

    /* renamed from: a */
    public final String f99780a;
    @C17952c(mo34828a = "tag_type")

    /* renamed from: b */
    public final int f99781b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39113as) {
                C39113as asVar = (C39113as) obj;
                if (C52711k.m112239a((Object) this.f99780a, (Object) asVar.f99780a)) {
                    if (this.f99781b == asVar.f99781b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f99780a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f99781b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiTagStruct(tagName=");
        sb.append(this.f99780a);
        sb.append(", tagType=");
        sb.append(this.f99781b);
        sb.append(")");
        return sb.toString();
    }
}
