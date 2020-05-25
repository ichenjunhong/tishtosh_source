package com.p683ss.android.ugc.aweme.journey;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.journey.v */
public final class C35791v {
    @C17952c(mo34828a = "interest_list")

    /* renamed from: a */
    public final List<C35777q> f91928a;
    @C17952c(mo34828a = "recommend_group")

    /* renamed from: b */
    public final Integer f91929b;
    @C17952c(mo34828a = "special_type")

    /* renamed from: c */
    public final Integer f91930c;
    @C17952c(mo34828a = "select_duration")

    /* renamed from: d */
    public final Integer f91931d;
    @C17952c(mo34828a = "select_interest_type")

    /* renamed from: e */
    public final Integer f91932e;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f91932e, (java.lang.Object) r3.f91932e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.journey.C35791v
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.journey.v r3 = (com.p683ss.android.ugc.aweme.journey.C35791v) r3
            java.util.List<com.ss.android.ugc.aweme.journey.q> r0 = r2.f91928a
            java.util.List<com.ss.android.ugc.aweme.journey.q> r1 = r3.f91928a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r0 = r2.f91929b
            java.lang.Integer r1 = r3.f91929b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r0 = r2.f91930c
            java.lang.Integer r1 = r3.f91930c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r0 = r2.f91931d
            java.lang.Integer r1 = r3.f91931d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.Integer r0 = r2.f91932e
            java.lang.Integer r3 = r3.f91932e
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.journey.C35791v.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C35777q> list = this.f91928a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.f91929b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f91930c;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f91931d;
        int hashCode4 = (hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.f91932e;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectedInterestList(interest_list=");
        sb.append(this.f91928a);
        sb.append(", recommend_group=");
        sb.append(this.f91929b);
        sb.append(", special_type=");
        sb.append(this.f91930c);
        sb.append(", select_duration=");
        sb.append(this.f91931d);
        sb.append(", select_interest_type=");
        sb.append(this.f91932e);
        sb.append(")");
        return sb.toString();
    }

    private C35791v(List<C35777q> list, Integer num, Integer num2, Integer num3, Integer num4) {
        this.f91928a = list;
        this.f91929b = num;
        this.f91930c = num2;
        this.f91931d = num3;
        this.f91932e = num4;
    }

    public /* synthetic */ C35791v(List list, Integer num, Integer num2, Integer num3, Integer num4, int i, C52707g gVar) {
        if ((i & 8) != 0) {
            num3 = Integer.valueOf(0);
        }
        Integer num5 = num3;
        if ((i & 16) != 0) {
            num4 = Integer.valueOf(0);
        }
        this(list, num, num2, num5, num4);
    }
}
