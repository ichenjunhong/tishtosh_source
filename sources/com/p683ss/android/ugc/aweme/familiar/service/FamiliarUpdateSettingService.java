package com.p683ss.android.ugc.aweme.familiar.service;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.FamiliarUpdateSettingService */
public final class FamiliarUpdateSettingService implements IUpdateSettingService {
    public final void updateCurrentSetting(C41686c cVar) {
        C52711k.m112240b(cVar, "settings");
    }

    public static IUpdateSettingService createIUpdateSettingServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IUpdateSettingService.class);
        if (a != null) {
            return (IUpdateSettingService) a;
        }
        if (C27991b.f73441Y == null) {
            synchronized (IUpdateSettingService.class) {
                if (C27991b.f73441Y == null) {
                    C27991b.f73441Y = new FamiliarUpdateSettingService();
                }
            }
        }
        return (FamiliarUpdateSettingService) C27991b.f73441Y;
    }
}
