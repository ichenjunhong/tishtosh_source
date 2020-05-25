package com.p683ss.android.ugc.aweme.setting.services;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.utils.C47897fr;

/* renamed from: com.ss.android.ugc.aweme.setting.services.SettingServiceImpl */
public final class SettingServiceImpl extends BaseSettingServiceImpl {
    public static final SettingServiceImpl INSTANCE = new SettingServiceImpl();

    public final boolean needShowRedDotOnMyProfileMore() {
        return C47897fr.f120492a.mo95101e();
    }

    public static ISettingService createISettingServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ISettingService.class);
        if (a != null) {
            return (ISettingService) a;
        }
        if (C27991b.f73475af == null) {
            synchronized (ISettingService.class) {
                if (C27991b.f73475af == null) {
                    C27991b.f73475af = new SettingServiceImpl();
                }
            }
        }
        return (SettingServiceImpl) C27991b.f73475af;
    }
}
