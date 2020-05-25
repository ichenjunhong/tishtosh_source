package com.p683ss.android.ugc.aweme.requestcombine.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel */
public final class UserSettingCombineModel extends BaseCombineMode {
    @C17952c(mo34828a = "body")
    private C41686c userSetting;

    public static /* synthetic */ UserSettingCombineModel copy$default(UserSettingCombineModel userSettingCombineModel, C41686c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = userSettingCombineModel.userSetting;
        }
        return userSettingCombineModel.copy(cVar);
    }

    public final C41686c component1() {
        return this.userSetting;
    }

    public final UserSettingCombineModel copy(C41686c cVar) {
        C52711k.m112240b(cVar, "userSetting");
        return new UserSettingCombineModel(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.userSetting, (java.lang.Object) ((com.p683ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel) r2).userSetting) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel) r2
            com.ss.android.ugc.aweme.setting.serverpush.a.c r0 = r1.userSetting
            com.ss.android.ugc.aweme.setting.serverpush.a.c r2 = r2.userSetting
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel.equals(java.lang.Object):boolean");
    }

    public final C41686c getUserSetting() {
        return this.userSetting;
    }

    public final int hashCode() {
        C41686c cVar = this.userSetting;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSettingCombineModel(userSetting=");
        sb.append(this.userSetting);
        sb.append(")");
        return sb.toString();
    }

    public final void setUserSetting(C41686c cVar) {
        C52711k.m112240b(cVar, "<set-?>");
        this.userSetting = cVar;
    }

    public UserSettingCombineModel(C41686c cVar) {
        C52711k.m112240b(cVar, "userSetting");
        this.userSetting = cVar;
    }
}
