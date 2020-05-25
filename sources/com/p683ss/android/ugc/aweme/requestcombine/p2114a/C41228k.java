package com.p683ss.android.ugc.aweme.requestcombine.p2114a;

import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41258h;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.k */
public final class C41228k extends C41216a {

    /* renamed from: a */
    private BaseCombineMode f104675a;

    /* renamed from: a */
    public final String mo83708a() {
        return "/aweme/v2/platform/share/settings/";
    }

    /* renamed from: b */
    public final BaseCombineMode mo83712b() {
        return this.f104675a;
    }

    /* renamed from: a */
    public final void mo83710a(C35862d dVar) {
        C52711k.m112240b(dVar, "transaction");
        dVar.mo74519a(new C41258h());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83711a(com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r5 = r5.getData()
            if (r5 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.ShareSettingCombineModel r5 = r5.getShareSettingCombineModel()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            r0 = 0
            if (r5 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.setting.model.ShareSettings r1 = r5.getShareSetting()
            if (r1 == 0) goto L_0x003d
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x003d
        L_0x001c:
            r1 = r5
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r4.f104675a = r1
            int r1 = r5.getHttpCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x0034
            com.ss.android.ugc.aweme.setting.bc r1 = com.p683ss.android.ugc.aweme.setting.C41581bc.m91416a()
            com.ss.android.ugc.aweme.setting.model.ShareSettings r3 = r5.getShareSetting()
            r1.mo85360a(r3)
        L_0x0034:
            int r5 = r5.getHttpCode()
            if (r5 != r2) goto L_0x003c
            r5 = 1
            return r5
        L_0x003c:
            return r0
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41228k.mo83711a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
