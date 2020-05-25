package com.p683ss.android.ugc.aweme.requestcombine.p2114a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41257g;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.c */
public final class C41219c extends C41216a {

    /* renamed from: a */
    private BaseCombineMode f104666a;

    /* renamed from: a */
    public final String mo83708a() {
        return "/webcast/setting/";
    }

    /* renamed from: b */
    public final BaseCombineMode mo83712b() {
        return this.f104666a;
    }

    /* renamed from: a */
    public final void mo83710a(C35862d dVar) {
        C52711k.m112240b(dVar, "transaction");
        dVar.mo74519a(new C41257g());
    }

    /* renamed from: a */
    public final Map<String, String> mo83709a(Context context) {
        C52711k.m112240b(context, "context");
        Map<String, String> hashMap = new HashMap<>();
        ILiveOuterService a = C36173w.m81665a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
        a.getLiveFeedFactory().mo74832a(context);
        ILiveOuterService a2 = C36173w.m81665a();
        C52711k.m112236a((Object) a2, "ServiceManager.get().get…OuterService::class.java)");
        a2.getLiveFeedFactory().mo74833a(hashMap);
        return hashMap;
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
            com.ss.android.ugc.aweme.requestcombine.model.LiveSettingCombineModel r5 = r5.getLiveSetting()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            r0 = 0
            if (r5 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.live.settings.c r1 = r5.getLiveSetting()
            if (r1 == 0) goto L_0x005c
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x005c
        L_0x001c:
            r1 = r5
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r4.f104666a = r1
            int r1 = r5.getHttpCode()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 != r2) goto L_0x003f
            com.ss.android.ugc.aweme.live.ILiveOuterService r1 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()
            java.lang.String r3 = "ServiceManager.get().get…OuterService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            com.ss.android.ugc.aweme.live.ILiveOuterService r1 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r1
            com.ss.android.ugc.aweme.live.h r1 = r1.getLiveOuterSettingService()
            com.ss.android.ugc.aweme.live.settings.c r3 = r5.getLiveSetting()
            r1.mo74817a(r3)
        L_0x003f:
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = r4.mo83712b()
            if (r1 == 0) goto L_0x005b
            int r1 = r1.getHttpCode()
            if (r1 != r2) goto L_0x005b
            com.ss.android.ugc.aweme.live.settings.c r1 = r5.getLiveSetting()
            if (r1 == 0) goto L_0x005b
            com.ss.android.ugc.aweme.live.settings.c r5 = r5.getLiveSetting()
            int r5 = r5.status_code
            if (r5 != 0) goto L_0x005b
            r5 = 1
            return r5
        L_0x005b:
            return r0
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41219c.mo83711a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
