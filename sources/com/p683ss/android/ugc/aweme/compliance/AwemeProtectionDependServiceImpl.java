package com.p683ss.android.ugc.aweme.compliance;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22722h;
import com.p683ss.android.ugc.aweme.protection.api.services.IAwemeProtectionDependService;

/* renamed from: com.ss.android.ugc.aweme.compliance.AwemeProtectionDependServiceImpl */
public final class AwemeProtectionDependServiceImpl implements IAwemeProtectionDependService {
    public final String getTimeLockHelperEnterFrom() {
        return C22722h.m55986c();
    }

    public static IAwemeProtectionDependService createIAwemeProtectionDependServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IAwemeProtectionDependService.class);
        if (a != null) {
            return (IAwemeProtectionDependService) a;
        }
        if (C27991b.f73469aZ == null) {
            synchronized (IAwemeProtectionDependService.class) {
                if (C27991b.f73469aZ == null) {
                    C27991b.f73469aZ = new AwemeProtectionDependServiceImpl();
                }
            }
        }
        return (AwemeProtectionDependServiceImpl) C27991b.f73469aZ;
    }
}
