package com.p683ss.android.ugc.aweme.requestcombine.p2114a;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.legoImp.task.C35989p;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.requesttask.p2117b.C41245c;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.f */
public final class C41223f extends C41216a {

    /* renamed from: a */
    private BaseCombineMode f104669a;

    /* renamed from: a */
    public final String mo83708a() {
        return "/aweme/v1/settings/";
    }

    /* renamed from: b */
    public final BaseCombineMode mo83712b() {
        return this.f104669a;
    }

    /* renamed from: a */
    public final void mo83710a(C35862d dVar) {
        C52711k.m112240b(dVar, "transaction");
        dVar.mo74519a(new C41245c());
    }

    /* renamed from: a */
    public final Map<String, String> mo83709a(Context context) {
        String str;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(context, "context");
        HashMap hashMap = new HashMap();
        Object systemService = context.getSystemService("phone");
        if (systemService != null) {
            Map<String, String> map = hashMap;
            String str2 = "is_cdma";
            if (((TelephonyManager) systemService).getPhoneType() == 2) {
                str = "1";
            } else {
                str = "0";
            }
            map.put(str2, str);
            String a = C35989p.m81164a();
            if (a != null) {
                hashMap.put("cpu_model", a);
            }
            return map;
        }
        throw new C52857u("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
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
            com.ss.android.ugc.aweme.requestcombine.model.AwemeSettingCombineModel r7 = r7.getAwemeSetting()
            goto L_0x000f
        L_0x000e:
            r7 = r0
        L_0x000f:
            r1 = 1
            if (r7 == 0) goto L_0x0039
            com.google.gson.l r2 = r7.getAwemeSetting()
            if (r2 == 0) goto L_0x0039
            boolean r2 = r2.mo35006j()
            if (r2 != r1) goto L_0x0039
            com.google.gson.l r2 = r7.getAwemeSetting()
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
            r6.f104669a = r0
            r0 = 200(0xc8, float:2.8E-43)
            if (r7 == 0) goto L_0x006b
            int r3 = r7.getHttpCode()
            if (r3 != r0) goto L_0x006b
            com.ss.android.ugc.aweme.setting.aq r3 = com.p683ss.android.ugc.aweme.setting.C41549aq.m91378a()
            com.google.gson.l r4 = r7.getAwemeSetting()
            com.ss.android.ugc.aweme.setting.as r5 = new com.ss.android.ugc.aweme.setting.as
            r5.<init>(r3, r4)
            p001a.C0013i.m16a(r5)
            r3.mo85333a(r4)
        L_0x006b:
            if (r7 == 0) goto L_0x0074
            int r7 = r7.getHttpCode()
            if (r7 != r0) goto L_0x0074
            return r1
        L_0x0074:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41223f.mo83711a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
