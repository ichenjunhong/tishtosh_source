package com.p683ss.android.ugc.aweme.setting.services;

import android.view.View;
import com.p683ss.android.ugc.aweme.setting.p2148ui.SettingNewVersionActivity;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.services.ISettingDependService */
public interface ISettingDependService {
    void handleUnloginForSetting(SettingNewVersionActivity settingNewVersionActivity, HashSet<View> hashSet);

    List<String> itemListForPushSetting();

    List<String> itmeListForPrivacySetting();

    List<String> itmeListForSetting();
}
