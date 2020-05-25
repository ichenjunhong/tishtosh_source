package com.p683ss.android.ugc.aweme.requestcombine.p2114a;

import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.requesttask.p2117b.C41244b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.e */
public final class C41222e extends C41216a {

    /* renamed from: a */
    private BaseCombineMode f104668a;

    /* renamed from: a */
    public final String mo83708a() {
        return "/aweme/v1/abtest/param/";
    }

    /* renamed from: b */
    public final BaseCombineMode mo83712b() {
        return this.f104668a;
    }

    /* renamed from: a */
    public final void mo83710a(C35862d dVar) {
        C52711k.m112240b(dVar, "transaction");
        dVar.mo74519a(new C41244b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d A[SYNTHETIC, Splitter:B:35:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83711a(com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r7 = r7.getData()
            if (r7 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.requestcombine.model.AbTestCombineModel r7 = r7.getAbTestCombineModel()
            goto L_0x000f
        L_0x000e:
            r7 = r0
        L_0x000f:
            r1 = 1
            if (r7 == 0) goto L_0x0039
            com.google.gson.l r2 = r7.getAbTestResponse()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r2.mo35006j()
            if (r2 != r1) goto L_0x0039
            com.google.gson.l r2 = r7.getAbTestResponse()
            if (r2 == 0) goto L_0x003e
            com.google.gson.o r2 = r2.mo35009m()
            java.lang.String r3 = "status_code"
            com.google.gson.l r2 = r2.mo35022b(r3)
            if (r2 == 0) goto L_0x003e
            int r0 = r2.mo34910g()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x003e
        L_0x0039:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x003e:
            r2 = 0
            if (r0 != 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0049
        L_0x0048:
            return r2
        L_0x0049:
            r0 = r7
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r0 = (com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r0
            r6.f104668a = r0
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 == 0) goto L_0x00a0
            int r3 = r7.getHttpCode()
            if (r3 != r0) goto L_0x00a0
            java.lang.String r3 = com.p683ss.android.deviceregister.C19034d.m46323c()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0076
            java.lang.String r3 = com.p683ss.android.deviceregister.C19034d.m46323c()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = "0"
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0076
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            com.google.gson.l r4 = r7.getAbTestResponse()
            if (r4 == 0) goto L_0x00a0
            com.ss.android.ugc.aweme.setting.api.c r5 = new com.ss.android.ugc.aweme.setting.api.c     // Catch:{ Exception -> 0x009f }
            r5.<init>(r4)     // Catch:{ Exception -> 0x009f }
            c.a.v r4 = p064c.p065a.C2201v.m6601a(r5)     // Catch:{ Exception -> 0x009f }
            c.a.ac r5 = p064c.p065a.p093k.C2168a.m6521b()     // Catch:{ Exception -> 0x009f }
            c.a.v r4 = r4.mo6529b(r5)     // Catch:{ Exception -> 0x009f }
            c.a.ac r5 = p064c.p065a.p066a.p068b.C1667a.m5940a()     // Catch:{ Exception -> 0x009f }
            c.a.v r4 = r4.mo6514a(r5)     // Catch:{ Exception -> 0x009f }
            com.ss.android.ugc.aweme.setting.api.AbTestApi$1 r5 = new com.ss.android.ugc.aweme.setting.api.AbTestApi$1     // Catch:{ Exception -> 0x009f }
            r5.<init>(r3)     // Catch:{ Exception -> 0x009f }
            r4.mo6314a(r5)     // Catch:{ Exception -> 0x009f }
            goto L_0x00a0
        L_0x009f:
        L_0x00a0:
            if (r7 == 0) goto L_0x00a9
            int r7 = r7.getHttpCode()
            if (r7 != r0) goto L_0x00a9
            return r1
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41222e.mo83711a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
