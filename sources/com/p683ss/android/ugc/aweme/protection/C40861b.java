package com.p683ss.android.ugc.aweme.protection;

import android.app.Activity;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.C27987x;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22721g;
import com.p683ss.android.ugc.aweme.login.C27967h;
import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import com.p683ss.android.ugc.aweme.protection.p2099b.C40863a;
import com.p683ss.android.ugc.aweme.protection.p2099b.C40867b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.b */
public final class C40861b {

    /* renamed from: a */
    public static final C40861b f104024a = new C40861b();

    /* renamed from: com.ss.android.ugc.aweme.protection.b$a */
    public static final class C40862a implements C40867b {

        /* renamed from: a */
        final /* synthetic */ boolean f104025a;

        /* renamed from: b */
        final /* synthetic */ C27987x f104026b;

        /* renamed from: a */
        public final void mo83197a() {
            C27987x xVar = this.f104026b;
            if (xVar != null) {
                xVar.mo44973a();
            }
        }

        /* renamed from: a */
        public final void mo83198a(ComplianceSetting complianceSetting) {
            C52711k.m112240b(complianceSetting, "setting");
            C40861b.m90358a();
            C40869c.f104035d.mo83209m();
            C22721g.f60930d.mo47165a(complianceSetting);
            if (this.f104025a) {
                C40869c.f104035d.mo83206g();
            }
            C27987x xVar = this.f104026b;
            if (xVar != null) {
                xVar.mo44973a();
            }
        }

        C40862a(boolean z, C27987x xVar) {
            this.f104025a = z;
            this.f104026b = xVar;
        }
    }

    private C40861b() {
    }

    /* renamed from: a */
    public static void m90358a() {
        if (C40869c.m90380j()) {
            Activity g = C11016e.m22312g();
            if (g != null && !C27967h.f73399a) {
                C20854a.m53164d().showAccountDeletedByAgeGatePage(g);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m90360b() {
        /*
            com.ss.android.ugc.aweme.protection.a.a r0 = com.p683ss.android.ugc.aweme.protection.C40869c.f104033b
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r0 = r0.mo83162a()
            r1 = 0
            if (r0 == 0) goto L_0x0014
            java.lang.Boolean r0 = r0.getEnableTermsConsentPopup()
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.booleanValue()
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0021
            com.ss.android.ugc.aweme.compliance.termspp.b r0 = new com.ss.android.ugc.aweme.compliance.termspp.b
            r0.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            r0 = 1
            return r0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.C40861b.m90360b():boolean");
    }

    /* renamed from: a */
    public static void m90359a(boolean z, C40863a aVar, C27987x xVar) {
        C52711k.m112240b(aVar, "presenter");
        aVar.mo83200a(new C40862a(z, xVar));
    }
}
