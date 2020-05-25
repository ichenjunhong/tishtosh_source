package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ef */
final /* synthetic */ class C40372ef implements OnClickListener {

    /* renamed from: a */
    private final UpdateUserInfoDialog f103039a;

    C40372ef(UpdateUserInfoDialog updateUserInfoDialog) {
        this.f103039a = updateUserInfoDialog;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        UpdateUserInfoDialog updateUserInfoDialog = this.f103039a;
        updateUserInfoDialog.dismiss();
        if (updateUserInfoDialog.f102598e) {
            SharePrefCache.inst().getLastCloseUpdateDialogTime().mo47776a(Long.valueOf(System.currentTimeMillis()));
        } else {
            SharePrefCache.inst().getLastCloseFeedUpdateDialogTime().mo47776a(Long.valueOf(System.currentTimeMillis()));
        }
    }
}
