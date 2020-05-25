package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.model.am */
public final class C39107am implements Serializable {
    @C17952c(mo34828a = "questions")

    /* renamed from: a */
    private final List<C39106al> f99758a;
    @C17952c(mo34828a = "total_question_count")

    /* renamed from: b */
    private final long f99759b;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.poi.model.al>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.poi.model.C39107am copy$default(com.p683ss.android.ugc.aweme.poi.model.C39107am r0, java.util.List<com.p683ss.android.ugc.aweme.poi.model.C39106al> r1, long r2, int r4, java.lang.Object r5) {
        /*
            r5 = r4 & 1
            if (r5 == 0) goto L_0x0006
            java.util.List<com.ss.android.ugc.aweme.poi.model.al> r1 = r0.f99758a
        L_0x0006:
            r4 = r4 & 2
            if (r4 == 0) goto L_0x000c
            long r2 = r0.f99759b
        L_0x000c:
            com.ss.android.ugc.aweme.poi.model.am r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.poi.model.C39107am.copy$default(com.ss.android.ugc.aweme.poi.model.am, java.util.List, long, int, java.lang.Object):com.ss.android.ugc.aweme.poi.model.am");
    }

    public final List<C39106al> component1() {
        return this.f99758a;
    }

    public final long component2() {
        return this.f99759b;
    }

    public final C39107am copy(List<C39106al> list, long j) {
        C52711k.m112240b(list, "questions");
        return new C39107am(list, j);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39107am) {
                C39107am amVar = (C39107am) obj;
                if (C52711k.m112239a((Object) this.f99758a, (Object) amVar.f99758a)) {
                    if (this.f99759b == amVar.f99759b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final List<C39106al> getQuestions() {
        return this.f99758a;
    }

    public final long getTotalQuestionCount() {
        return this.f99759b;
    }

    public final int hashCode() {
        List<C39106al> list = this.f99758a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        long j = this.f99759b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiQuestionInfo(questions=");
        sb.append(this.f99758a);
        sb.append(", totalQuestionCount=");
        sb.append(this.f99759b);
        sb.append(")");
        return sb.toString();
    }

    public C39107am(List<C39106al> list, long j) {
        C52711k.m112240b(list, "questions");
        this.f99758a = list;
        this.f99759b = j;
    }

    public /* synthetic */ C39107am(List list, long j, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        this(list, j);
    }
}
