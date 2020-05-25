package com.p683ss.android.ugc.aweme.compliance;

import android.net.Uri.Builder;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.report.C41201a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.ComplianceDependServiceImpl */
public final class ComplianceDependServiceImpl implements IComplianceDependService {
    public static IComplianceDependService createIComplianceDependServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IComplianceDependService.class);
        if (a != null) {
            return (IComplianceDependService) a;
        }
        if (C27991b.f73489at == null) {
            synchronized (IComplianceDependService.class) {
                if (C27991b.f73489at == null) {
                    C27991b.f73489at = new ComplianceDependServiceImpl();
                }
            }
        }
        return (ComplianceDependServiceImpl) C27991b.f73489at;
    }

    public final Builder getReportUrlParameter(Aweme aweme, String str, String str2) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "reportFrom");
        C52711k.m112240b(str2, "reportType");
        return C41201a.m90895a(aweme, str, str2);
    }
}
