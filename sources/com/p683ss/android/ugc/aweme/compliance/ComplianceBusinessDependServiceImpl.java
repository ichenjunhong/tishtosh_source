package com.p683ss.android.ugc.aweme.compliance;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.util.C22267i;
import com.p683ss.android.ugc.aweme.antiaddic.C22692c;
import com.p683ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformManager;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.IComplianceBusinessDependService;
import com.p683ss.android.ugc.aweme.setting.util.LoginDeviceManagerUrlExperiment;

/* renamed from: com.ss.android.ugc.aweme.compliance.ComplianceBusinessDependServiceImpl */
public final class ComplianceBusinessDependServiceImpl implements IComplianceBusinessDependService {
    public final String getLoginDeviceManagerUrl() {
        return C10181b.m20511a().mo18171a(LoginDeviceManagerUrlExperiment.class, true, "login_device_manager_url", 31744, "");
    }

    public static IComplianceBusinessDependService createIComplianceBusinessDependServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IComplianceBusinessDependService.class);
        if (a != null) {
            return (IComplianceBusinessDependService) a;
        }
        if (C27991b.f73505bi == null) {
            synchronized (IComplianceBusinessDependService.class) {
                if (C27991b.f73505bi == null) {
                    C27991b.f73505bi = new ComplianceBusinessDependServiceImpl();
                }
            }
        }
        return (ComplianceBusinessDependServiceImpl) C27991b.f73505bi;
    }

    public final void enterDigitalWellbeing(Activity activity) {
        ParentalPlatformManager.m55914a(activity);
    }

    public final void syncParentalData(C22692c cVar) {
        ParentalPlatformManager.m55915a(cVar);
    }

    public final void toDeleteAccount(Context context) {
        C22267i.m55116a(context);
    }
}
