package com.p683ss.android.ugc.aweme.setting;

import android.view.View;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.setting.p2148ui.SettingNewVersionActivity;
import com.p683ss.android.ugc.aweme.setting.services.ISettingDependService;
import java.util.HashSet;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.SettingDependService */
public final class SettingDependService implements ISettingDependService {
    public final List<String> itemListForPushSetting() {
        return null;
    }

    public final List<String> itmeListForPrivacySetting() {
        return null;
    }

    public final List<String> itmeListForSetting() {
        return null;
    }

    public static ISettingDependService createISettingDependServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ISettingDependService.class);
        if (a != null) {
            return (ISettingDependService) a;
        }
        if (C27991b.f73451aH == null) {
            synchronized (ISettingDependService.class) {
                if (C27991b.f73451aH == null) {
                    C27991b.f73451aH = new SettingDependService();
                }
            }
        }
        return (SettingDependService) C27991b.f73451aH;
    }

    public final void handleUnloginForSetting(SettingNewVersionActivity settingNewVersionActivity, HashSet<View> hashSet) {
        C52711k.m112240b(settingNewVersionActivity, "activity");
        C52711k.m112240b(hashSet, "unloginGoneView");
        I18nBridgeService.getBridgeService_Monster().handleUnloginForSetting(settingNewVersionActivity, hashSet);
    }
}
