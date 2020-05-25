package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.profile.model.YellowPointResponse;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.YellowPointCombineModel */
public final class YellowPointCombineModel extends BaseCombineMode {
    @C17952c(mo34828a = "body")
    private YellowPointResponse yellowPoint;

    public static /* synthetic */ YellowPointCombineModel copy$default(YellowPointCombineModel yellowPointCombineModel, YellowPointResponse yellowPointResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            yellowPointResponse = yellowPointCombineModel.yellowPoint;
        }
        return yellowPointCombineModel.copy(yellowPointResponse);
    }

    public final YellowPointResponse component1() {
        return this.yellowPoint;
    }

    public final YellowPointCombineModel copy(YellowPointResponse yellowPointResponse) {
        C52711k.m112240b(yellowPointResponse, "yellowPoint");
        return new YellowPointCombineModel(yellowPointResponse);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.yellowPoint, (java.lang.Object) ((com.p683ss.android.ugc.aweme.requestcombine.model.YellowPointCombineModel) r2).yellowPoint) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.requestcombine.model.YellowPointCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.YellowPointCombineModel r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.YellowPointCombineModel) r2
            com.ss.android.ugc.aweme.profile.model.YellowPointResponse r0 = r1.yellowPoint
            com.ss.android.ugc.aweme.profile.model.YellowPointResponse r2 = r2.yellowPoint
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.model.YellowPointCombineModel.equals(java.lang.Object):boolean");
    }

    public final YellowPointResponse getYellowPoint() {
        return this.yellowPoint;
    }

    public final int hashCode() {
        YellowPointResponse yellowPointResponse = this.yellowPoint;
        if (yellowPointResponse != null) {
            return yellowPointResponse.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("YellowPointCombineModel(yellowPoint=");
        sb.append(this.yellowPoint);
        sb.append(")");
        return sb.toString();
    }

    public final void setYellowPoint(YellowPointResponse yellowPointResponse) {
        C52711k.m112240b(yellowPointResponse, "<set-?>");
        this.yellowPoint = yellowPointResponse;
    }

    public YellowPointCombineModel(YellowPointResponse yellowPointResponse) {
        C52711k.m112240b(yellowPointResponse, "yellowPoint");
        this.yellowPoint = yellowPointResponse;
    }
}
