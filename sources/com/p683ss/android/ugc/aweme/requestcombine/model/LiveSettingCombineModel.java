package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.live.settings.C36167c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel */
public final class LiveSettingCombineModel extends BaseCombineMode {
    @C17952c(mo34828a = "body")
    private C36167c liveSetting;

    public static /* synthetic */ LiveSettingCombineModel copy$default(LiveSettingCombineModel liveSettingCombineModel, C36167c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = liveSettingCombineModel.liveSetting;
        }
        return liveSettingCombineModel.copy(cVar);
    }

    public final C36167c component1() {
        return this.liveSetting;
    }

    public final LiveSettingCombineModel copy(C36167c cVar) {
        C52711k.m112240b(cVar, "liveSetting");
        return new LiveSettingCombineModel(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.liveSetting, (java.lang.Object) ((com.p683ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel) r2).liveSetting) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel) r2
            com.ss.android.ugc.aweme.live.settings.c r0 = r1.liveSetting
            com.ss.android.ugc.aweme.live.settings.c r2 = r2.liveSetting
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final C36167c getLiveSetting() {
        return this.liveSetting;
    }

    public final int hashCode() {
        C36167c cVar = this.liveSetting;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LiveSettingCombineModel(liveSetting=");
        sb.append(this.liveSetting);
        sb.append(")");
        return sb.toString();
    }

    public final void setLiveSetting(C36167c cVar) {
        C52711k.m112240b(cVar, "<set-?>");
        this.liveSetting = cVar;
    }

    public LiveSettingCombineModel(C36167c cVar) {
        C52711k.m112240b(cVar, "liveSetting");
        this.liveSetting = cVar;
    }
}
