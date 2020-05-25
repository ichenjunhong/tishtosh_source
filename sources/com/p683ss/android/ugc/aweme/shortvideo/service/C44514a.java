package com.p683ss.android.ugc.aweme.shortvideo.service;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p683ss.android.ugc.aweme.services.IPrivacySettingService.OnPostNowClickListener;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.service.a */
final /* synthetic */ class C44514a implements OnClickListener {

    /* renamed from: a */
    private final OnPostNowClickListener f112628a;

    C44514a(OnPostNowClickListener onPostNowClickListener) {
        this.f112628a = onPostNowClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PrivacySettingService.lambda$showPrivacyConfirmationDialog$0$PrivacySettingService(this.f112628a, dialogInterface, i);
    }
}
