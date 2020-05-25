package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.app.Dialog;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.RequestContactsPermissionAfterBindPhone */
public class RequestContactsPermissionAfterBindPhone extends AmeBaseActivity {

    /* renamed from: a */
    private String f59910a;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.d1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f59910a = getIntent().getStringExtra("ENTER_REASON");
        Dialog requestContactsPermissionAfterBindMobile = I18nBridgeService.getBridgeService_Monster().requestContactsPermissionAfterBindMobile(this, this.f59910a);
        if (requestContactsPermissionAfterBindMobile == null) {
            finish();
            return;
        }
        requestContactsPermissionAfterBindMobile.setOnDismissListener(new C22245k(this));
        requestContactsPermissionAfterBindMobile.show();
    }
}
