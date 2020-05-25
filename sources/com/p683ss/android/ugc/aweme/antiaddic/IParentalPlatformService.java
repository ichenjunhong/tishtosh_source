package com.p683ss.android.ugc.aweme.antiaddic;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService */
public interface IParentalPlatformService {

    /* renamed from: com.ss.android.ugc.aweme.antiaddic.IParentalPlatformService$a */
    public enum C22687a {
        UNLINK_LOCKED,
        PARENT,
        CHILD,
        NONE,
        CLOSE
    }

    void enterDigitalWellbeing(Activity activity);

    String getChildScheme();

    String getEntranceScheme();

    String getParentScheme();

    C41686c getPushSettings();

    C22687a getRole();

    C22687a getRole(C41686c cVar);

    boolean showChatLockEntrance();

    void syncParentalData(C22692c cVar);
}
