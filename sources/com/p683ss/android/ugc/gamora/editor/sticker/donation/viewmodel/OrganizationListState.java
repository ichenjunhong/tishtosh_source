package com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import com.bytedance.jedi.arch.C11932s;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListState */
public final class OrganizationListState implements C11932s {
    private final C49521a result;

    public OrganizationListState() {
        this(null, 1, null);
    }

    public static /* synthetic */ OrganizationListState copy$default(OrganizationListState organizationListState, C49521a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = organizationListState.result;
        }
        return organizationListState.copy(aVar);
    }

    public final C49521a component1() {
        return this.result;
    }

    public final OrganizationListState copy(C49521a aVar) {
        return new OrganizationListState(aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.result, (java.lang.Object) ((com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListState) r2).result) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListState
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListState r2 = (com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListState) r2
            com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.a r0 = r1.result
            com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.a r2 = r2.result
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel.OrganizationListState.equals(java.lang.Object):boolean");
    }

    public final C49521a getResult() {
        return this.result;
    }

    public final int hashCode() {
        C49521a aVar = this.result;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationListState(result=");
        sb.append(this.result);
        sb.append(")");
        return sb.toString();
    }

    public OrganizationListState(C49521a aVar) {
        this.result = aVar;
    }

    public /* synthetic */ OrganizationListState(C49521a aVar, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        this(aVar);
    }
}
