package com.p683ss.android.ugc.aweme.profile.unlogin;

import com.bytedance.jedi.arch.C11932s;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileState */
public final class UnloginProfileState implements C11932s {
    private final List<Aweme> awemeList;
    private final C40486d statusViewState;

    public UnloginProfileState() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme>, for r2v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.profile.unlogin.UnloginProfileState copy$default(com.p683ss.android.ugc.aweme.profile.unlogin.UnloginProfileState r0, com.p683ss.android.ugc.aweme.profile.unlogin.C40486d r1, java.util.List<com.p683ss.android.ugc.aweme.feed.model.Aweme> r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            com.ss.android.ugc.aweme.profile.unlogin.d r1 = r0.statusViewState
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r0.awemeList
        L_0x000c:
            com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileState r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.unlogin.UnloginProfileState.copy$default(com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileState, com.ss.android.ugc.aweme.profile.unlogin.d, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileState");
    }

    public final C40486d component1() {
        return this.statusViewState;
    }

    public final List<Aweme> component2() {
        return this.awemeList;
    }

    public final UnloginProfileState copy(C40486d dVar, List<? extends Aweme> list) {
        C52711k.m112240b(dVar, "statusViewState");
        C52711k.m112240b(list, "awemeList");
        return new UnloginProfileState(dVar, list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.awemeList, (java.lang.Object) r3.awemeList) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.profile.unlogin.UnloginProfileState
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.profile.unlogin.UnloginProfileState r3 = (com.p683ss.android.ugc.aweme.profile.unlogin.UnloginProfileState) r3
            com.ss.android.ugc.aweme.profile.unlogin.d r0 = r2.statusViewState
            com.ss.android.ugc.aweme.profile.unlogin.d r1 = r3.statusViewState
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r2.awemeList
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r3.awemeList
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.unlogin.UnloginProfileState.equals(java.lang.Object):boolean");
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final C40486d getStatusViewState() {
        return this.statusViewState;
    }

    public final int hashCode() {
        C40486d dVar = this.statusViewState;
        int i = 0;
        int hashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        List<Aweme> list = this.awemeList;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnloginProfileState(statusViewState=");
        sb.append(this.statusViewState);
        sb.append(", awemeList=");
        sb.append(this.awemeList);
        sb.append(")");
        return sb.toString();
    }

    public UnloginProfileState(C40486d dVar, List<? extends Aweme> list) {
        C52711k.m112240b(dVar, "statusViewState");
        C52711k.m112240b(list, "awemeList");
        this.statusViewState = dVar;
        this.awemeList = list;
    }

    public /* synthetic */ UnloginProfileState(C40486d dVar, List list, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            dVar = C40486d.EMPTY;
        }
        if ((i & 2) != 0) {
            list = C52575l.m112097a();
        }
        this(dVar, list);
    }
}
