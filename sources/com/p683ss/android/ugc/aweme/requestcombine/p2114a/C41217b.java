package com.p683ss.android.ugc.aweme.requestcombine.p2114a;

import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.antiaddic.p1354b.C22691a;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35862d;
import com.p683ss.android.ugc.aweme.protection.C40861b;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p683ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41256f;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.concurrent.Callable;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.b */
public final class C41217b extends C41216a {

    /* renamed from: a */
    private final String f104663a = "/aweme/v1/compliance/settings/";

    /* renamed from: b */
    private BaseCombineMode f104664b;

    /* renamed from: com.ss.android.ugc.aweme.requestcombine.a.b$a */
    static final class C41218a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ ComplianceSettingCombineModel f104665a;

        C41218a(ComplianceSettingCombineModel complianceSettingCombineModel) {
            this.f104665a = complianceSettingCombineModel;
        }

        public final /* synthetic */ Object call() {
            ComplianceSetting complianceSetting = this.f104665a.getComplianceSetting();
            C52711k.m112240b(complianceSetting, "setting");
            C40861b bVar = C40861b.f104024a;
            C52711k.m112240b(complianceSetting, "setting");
            C40869c.m90373a(complianceSetting);
            C40869c.f104035d.mo83209m();
            C40861b.m90358a();
            C22721g.f60930d.mo47165a(complianceSetting);
            C47718bf.m103289b(new C22691a());
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final String mo83708a() {
        return this.f104663a;
    }

    /* renamed from: b */
    public final BaseCombineMode mo83712b() {
        return this.f104664b;
    }

    /* renamed from: a */
    public final void mo83710a(C35862d dVar) {
        C52711k.m112240b(dVar, "transaction");
        dVar.mo74519a(new C41256f());
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo83711a(com.p683ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r3 = r3.getData()
            if (r3 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.ComplianceSettingCombineModel r3 = r3.getComplianceSetting()
            goto L_0x000e
        L_0x000d:
            r3 = 0
        L_0x000e:
            r0 = 0
            if (r3 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r1 = r3.getComplianceSetting()
            if (r1 == 0) goto L_0x003c
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x003c
        L_0x001c:
            r1 = r3
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p683ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r2.f104664b = r1
            com.ss.android.ugc.aweme.requestcombine.a.b$a r1 = new com.ss.android.ugc.aweme.requestcombine.a.b$a
            r1.<init>(r3)
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            p001a.C0013i.m16a(r1)
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r3 = r2.mo83712b()
            if (r3 == 0) goto L_0x003b
            int r3 = r3.getHttpCode()
            r1 = 200(0xc8, float:2.8E-43)
            if (r3 != r1) goto L_0x003b
            r3 = 1
            return r3
        L_0x003b:
            return r0
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.requestcombine.p2114a.C41217b.mo83711a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }
}
