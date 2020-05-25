package com.p683ss.android.ugc.aweme.requestcombine.p2114a;

import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.requesttask.p2116a.C41241c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.l */
public final class C41229l extends C41216a {

    /* renamed from: a */
    private BaseCombineMode f104676a;

    /* renamed from: b */
    public final BaseCombineMode mo83712b() {
        return this.f104676a;
    }

    /* renamed from: a */
    public final String mo83708a() {
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            return "/aweme/v1/user/settings/";
        }
        return null;
    }

    /* renamed from: a */
    public final void mo83710a(C35862d dVar) {
        C52711k.m112240b(dVar, "transaction");
        dVar.mo74519a(new C41241c(1));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83711a(com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r8 = r8.getData()
            if (r8 == 0) goto L_0x000e
            com.ss.android.ugc.aweme.requestcombine.model.UserSettingCombineModel r8 = r8.getUserSettingCombineModel()
            goto L_0x000f
        L_0x000e:
            r8 = r0
        L_0x000f:
            r1 = 0
            if (r8 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.setting.serverpush.a.c r2 = r8.getUserSetting()
            if (r2 == 0) goto L_0x0073
            int r2 = r2.status_code
            if (r2 == 0) goto L_0x001d
            goto L_0x0073
        L_0x001d:
            r2 = r8
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r2 = (com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r2
            r7.f104676a = r2
            int r2 = r8.getHttpCode()
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 1
            if (r2 != r3) goto L_0x006b
            com.ss.android.ugc.aweme.requestcombine.e$a r2 = com.p683ss.android.ugc.aweme.requestcombine.C41234e.f104680a
            com.ss.android.ugc.aweme.setting.serverpush.a.c r2 = r8.getUserSetting()
            java.lang.String r5 = "pushSettings"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r5)
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.p683ss.android.ugc.aweme.account.C20902b.m53242a()
            java.lang.String r6 = "AccountUserProxyService.get()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            boolean r5 = r5.isLogin()
            if (r5 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.requestcombine.e$a$a r0 = new com.ss.android.ugc.aweme.requestcombine.e$a$a
            r0.<init>(r4)
            com.ss.android.ugc.aweme.antiaddic.c r0 = (com.p683ss.android.ugc.aweme.antiaddic.C22692c) r0
            java.lang.String r5 = "pushSettings"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r5)
            java.util.List<com.ss.android.ugc.aweme.antiaddic.c> r5 = com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.f60888a
            boolean r5 = r5.contains(r0)
            if (r5 != 0) goto L_0x005e
            java.util.List<com.ss.android.ugc.aweme.antiaddic.c> r5 = com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.f60888a
            r5.add(r0)
        L_0x005e:
            boolean r0 = com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.f60889b
            if (r0 != 0) goto L_0x006b
            com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager.f60889b = r4
            com.p683ss.android.ugc.aweme.setting.serverpush.C41687b.m91547a(r2)
            goto L_0x006b
        L_0x0068:
            com.p683ss.android.ugc.aweme.requestcombine.C41234e.C41235a.m90963a(r4, r0)
        L_0x006b:
            int r8 = r8.getHttpCode()
            if (r8 != r3) goto L_0x0072
            return r4
        L_0x0072:
            return r1
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41229l.mo83711a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
