package com.p683ss.android.ugc.aweme.live.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.live.model.c */
public final class C36142c implements Serializable {
    @C17952c(mo34828a = "rooms")

    /* renamed from: a */
    private final List<Object> f92550a;

    public C36142c() {
        this(null, 1, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.live.model.C36142c copy$default(com.p683ss.android.ugc.aweme.live.model.C36142c r0, java.util.List<java.lang.Object> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<java.lang.Object> r1 = r0.f92550a
        L_0x0006:
            com.ss.android.ugc.aweme.live.model.c r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.live.model.C36142c.copy$default(com.ss.android.ugc.aweme.live.model.c, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.live.model.c");
    }

    public final List<Object> component1() {
        return this.f92550a;
    }

    public final C36142c copy(List<Object> list) {
        return new C36142c(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f92550a, (java.lang.Object) ((com.p683ss.android.ugc.aweme.live.model.C36142c) r2).f92550a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.live.model.C36142c
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.live.model.c r2 = (com.p683ss.android.ugc.aweme.live.model.C36142c) r2
            java.util.List<java.lang.Object> r0 = r1.f92550a
            java.util.List<java.lang.Object> r2 = r2.f92550a
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.live.model.C36142c.equals(java.lang.Object):boolean");
    }

    public final List<Object> getRooms() {
        return this.f92550a;
    }

    public final int hashCode() {
        List<Object> list = this.f92550a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpecialTopicLiveCardStruct(rooms=");
        sb.append(this.f92550a);
        sb.append(")");
        return sb.toString();
    }

    public C36142c(List<Object> list) {
        this.f92550a = list;
    }

    public /* synthetic */ C36142c(List list, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            list = null;
        }
        this(list);
    }
}
