package com.p683ss.android.ugc.aweme.requestcombine.p2114a;

import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41255e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.g */
public final class C41224g extends C41216a {

    /* renamed from: a */
    private BaseCombineMode f104670a;

    /* renamed from: a */
    public final String mo83708a() {
        return "/aweme/v1/commerce/settings/";
    }

    /* renamed from: b */
    public final BaseCombineMode mo83712b() {
        return this.f104670a;
    }

    /* renamed from: a */
    public final void mo83710a(C35862d dVar) {
        C52711k.m112240b(dVar, "transaction");
        dVar.mo74519a(new C41255e());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83711a(com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r4 = r4.getData()
            if (r4 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.CommerceSettingCombineModel r4 = r4.getCommerceSettingCombineModel()
            goto L_0x000e
        L_0x000d:
            r4 = 0
        L_0x000e:
            r0 = 0
            if (r4 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.commercialize.model.l r1 = r4.getCombineModel()
            if (r1 == 0) goto L_0x0038
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x0038
        L_0x001c:
            r1 = r4
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r3.f104670a = r1
            int r1 = r4.getHttpCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x002f
            com.ss.android.ugc.aweme.commercialize.model.l r1 = r4.getCombineModel()
            com.p683ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi.f67857b = r1
        L_0x002f:
            int r4 = r4.getHttpCode()
            if (r4 != r2) goto L_0x0037
            r4 = 1
            return r4
        L_0x0037:
            return r0
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41224g.mo83711a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
