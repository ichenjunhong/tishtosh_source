package com.p683ss.android.ugc.aweme.protection;

import com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting;
import com.p683ss.android.ugc.aweme.protection.p2093a.C40837a;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.e */
public final class C40877e implements C41683a {

    /* renamed from: a */
    public static final C40877e f104050a = new C40877e();

    private C40877e() {
    }

    /* renamed from: a */
    public final void mo47083a(Exception exc) {
        C52711k.m112240b(exc, "e");
    }

    /* renamed from: a */
    public final boolean mo47084a() {
        return false;
    }

    /* renamed from: a */
    public final void mo47082a(C41686c cVar) {
        int i;
        C52711k.m112240b(cVar, "settings");
        C40837a a = C40869c.m90371a();
        if (cVar.f105478U == 0) {
            ComplianceSetting a2 = a.mo83162a();
            if (a2 != null) {
                Integer defaultVpaContentChoice = a2.getDefaultVpaContentChoice();
                if (defaultVpaContentChoice != null) {
                    i = defaultVpaContentChoice.intValue();
                }
            }
            i = 1;
        } else {
            i = cVar.f105478U;
        }
        a.mo83166b(i);
    }
}
