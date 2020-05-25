package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.ss.android.ugc.aweme.account.ui.VerificationActivity */
public class VerificationActivity extends BaseAccountActivity {

    /* renamed from: k */
    public int f59918k = -1;

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        this.f59918k = getIntent().getIntExtra("req_code", -1);
        ((AccountOpeModel) C0214z.m440a((FragmentActivity) this).mo359a(AccountOpeModel.class)).f59551b.observe(this, new C22250o(this));
        int intExtra = getIntent().getIntExtra("verify_type", PreloadTask.BYTE_UNIT_NUMBER);
        if (intExtra == 1024) {
            mo46248a(VerifyIDCardFragment.m55070a(""));
        } else if (intExtra == 2048) {
            User i = C23826bi.m58468i();
            if (i != null) {
                str = i.getBindPhone();
            } else {
                str = "";
            }
            mo46248a(VerificationCodeFragment.m55047b(6, str, "", "", ""));
        } else if (intExtra == 3072) {
            mo46248a(VerifyIDCardFragment.m55070a(getIntent().getStringExtra("shark_ticket")));
        } else {
            if (intExtra == 4096) {
                mo46248a(VerificationCodeFragment.m55047b(7, getIntent().getStringExtra("phone"), "", getIntent().getStringExtra("shark_ticket"), ""));
            }
        }
    }
}
