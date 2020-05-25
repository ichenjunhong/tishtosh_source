package com.p683ss.android.ugc.aweme.protection.serviceimpl;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.protection.api.services.C40860c;
import com.p683ss.android.ugc.aweme.protection.api.services.IAwemeProtectionService;

/* renamed from: com.ss.android.ugc.aweme.protection.serviceimpl.AwemeProtectionServiceImpl */
public final class AwemeProtectionServiceImpl implements IAwemeProtectionService {
    public final C40860c getAntiAddictionService() {
        return new C40881a();
    }

    public static IAwemeProtectionService createIAwemeProtectionServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IAwemeProtectionService.class);
        if (a != null) {
            return (IAwemeProtectionService) a;
        }
        if (C27991b.f73501be == null) {
            synchronized (IAwemeProtectionService.class) {
                if (C27991b.f73501be == null) {
                    C27991b.f73501be = new AwemeProtectionServiceImpl();
                }
            }
        }
        return (AwemeProtectionServiceImpl) C27991b.f73501be;
    }
}
