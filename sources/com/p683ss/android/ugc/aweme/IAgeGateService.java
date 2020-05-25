package com.p683ss.android.ugc.aweme;

import android.app.Activity;

/* renamed from: com.ss.android.ugc.aweme.IAgeGateService */
public interface IAgeGateService {
    IAgeGateService keepCallback();

    void showAccountDeletedByAgeGatePage(Activity activity);

    boolean showFTCAgeGateForCurrentUser(Activity activity, C22543ah ahVar, int i);

    void syncAgeGateInfo();
}
