package com.p683ss.android.ugc.aweme.compliance.business.api.services;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.antiaddic.C22692c;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.api.services.IComplianceBusinessDependService */
public interface IComplianceBusinessDependService {
    void enterDigitalWellbeing(Activity activity);

    String getLoginDeviceManagerUrl();

    void syncParentalData(C22692c cVar);

    void toDeleteAccount(Context context);
}
