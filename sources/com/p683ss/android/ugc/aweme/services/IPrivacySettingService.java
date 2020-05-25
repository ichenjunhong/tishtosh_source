package com.p683ss.android.ugc.aweme.services;

import android.app.Activity;

/* renamed from: com.ss.android.ugc.aweme.services.IPrivacySettingService */
public interface IPrivacySettingService {

    /* renamed from: com.ss.android.ugc.aweme.services.IPrivacySettingService$OnPostNowClickListener */
    public interface OnPostNowClickListener {
        void onPostNowClick();
    }

    boolean needShowPrivacyConfirmationDialog(Activity activity);

    void showPrivacyConfirmationDialog(Activity activity, OnPostNowClickListener onPostNowClickListener);
}
