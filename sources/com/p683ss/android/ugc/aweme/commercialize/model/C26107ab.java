package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ab */
public final class C26107ab {
    @C17952c(mo34828a = "multiselect")

    /* renamed from: a */
    public final int f68913a;
    @C17952c(mo34828a = "depth")

    /* renamed from: b */
    public final int f68914b;
    @C17952c(mo34828a = "options")

    /* renamed from: c */
    public final List<C26106aa> f68915c;
    @C17952c(mo34828a = "selected")

    /* renamed from: d */
    public final List<Integer> f68916d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26107ab) {
                C26107ab abVar = (C26107ab) obj;
                if (this.f68913a == abVar.f68913a) {
                    if (!(this.f68914b == abVar.f68914b) || !C52711k.m112239a((Object) this.f68915c, (Object) abVar.f68915c) || !C52711k.m112239a((Object) this.f68916d, (Object) abVar.f68916d)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((Integer.hashCode(this.f68913a) * 31) + Integer.hashCode(this.f68914b)) * 31;
        List<C26106aa> list = this.f68915c;
        int i = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<Integer> list2 = this.f68916d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionListParams(multiSelect=");
        sb.append(this.f68913a);
        sb.append(", depth=");
        sb.append(this.f68914b);
        sb.append(", options=");
        sb.append(this.f68915c);
        sb.append(", selected=");
        sb.append(this.f68916d);
        sb.append(")");
        return sb.toString();
    }
}
