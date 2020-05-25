package com.p683ss.android.ugc.aweme.services.external;

import com.p683ss.android.ugc.aweme.services.IShortVideoConfig;
import com.p683ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.p683ss.android.ugc.aweme.services.settings.IDmtAVSettingsService;

/* renamed from: com.ss.android.ugc.aweme.services.external.IConfigService */
public interface IConfigService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* renamed from: com.ss.android.ugc.aweme.services.external.IConfigService$Companion */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    IAVSettingsService avsettingsConfig();

    ICacheService cacheConfig();

    IDmtAVSettingsService dmtAvSettingConfig();

    IPrivacyConfig privacyConfig();

    IShortVideoConfig shortVideoConfig();

    boolean storySettingDoudouSwitch();

    void userAction(int i);
}
