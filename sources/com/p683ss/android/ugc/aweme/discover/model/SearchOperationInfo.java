package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchOperationInfo */
public final class SearchOperationInfo implements Serializable {
    @C17952c(mo34828a = "activity")
    private SearchOperation operation;

    public static /* synthetic */ SearchOperationInfo copy$default(SearchOperationInfo searchOperationInfo, SearchOperation searchOperation, int i, Object obj) {
        if ((i & 1) != 0) {
            searchOperation = searchOperationInfo.operation;
        }
        return searchOperationInfo.copy(searchOperation);
    }

    public final SearchOperation component1() {
        return this.operation;
    }

    public final SearchOperationInfo copy(SearchOperation searchOperation) {
        C52711k.m112240b(searchOperation, "operation");
        return new SearchOperationInfo(searchOperation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.operation, (java.lang.Object) ((com.p683ss.android.ugc.aweme.discover.model.SearchOperationInfo) r2).operation) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.discover.model.SearchOperationInfo
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.model.SearchOperationInfo r2 = (com.p683ss.android.ugc.aweme.discover.model.SearchOperationInfo) r2
            com.ss.android.ugc.aweme.discover.model.SearchOperation r0 = r1.operation
            com.ss.android.ugc.aweme.discover.model.SearchOperation r2 = r2.operation
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.SearchOperationInfo.equals(java.lang.Object):boolean");
    }

    public final SearchOperation getOperation() {
        return this.operation;
    }

    public final int hashCode() {
        SearchOperation searchOperation = this.operation;
        if (searchOperation != null) {
            return searchOperation.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchOperationInfo(operation=");
        sb.append(this.operation);
        sb.append(")");
        return sb.toString();
    }

    public final void setOperation(SearchOperation searchOperation) {
        C52711k.m112240b(searchOperation, "<set-?>");
        this.operation = searchOperation;
    }

    public SearchOperationInfo(SearchOperation searchOperation) {
        C52711k.m112240b(searchOperation, "operation");
        this.operation = searchOperation;
    }
}
