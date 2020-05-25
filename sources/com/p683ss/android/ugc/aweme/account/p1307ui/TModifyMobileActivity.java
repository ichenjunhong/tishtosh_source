package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22162t;
import com.p683ss.android.ugc.aweme.account.login.sms.C21464e;
import com.p683ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.utils.C47661ab;

/* renamed from: com.ss.android.ugc.aweme.account.ui.TModifyMobileActivity */
public class TModifyMobileActivity extends BaseAccountActivity implements C22162t {

    /* renamed from: k */
    private C21464e f59911k;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.TModifyMobileActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.TModifyMobileActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.TModifyMobileActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final C0198r<String> al_() {
        if (this.f59911k != null) {
            return this.f59911k.f58231b;
        }
        return null;
    }

    public void finish() {
        super.finish();
        if (this.f59911k != null) {
            this.f59911k.mo45649c();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.TModifyMobileActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f59911k = new C21464e(this);
        this.f59911k.mo45648b();
        this.f59911k.mo45647a();
        ((AccountOpeModel) C0214z.m440a((FragmentActivity) this).mo359a(AccountOpeModel.class)).f59551b.observe(this, new C22246l(this));
        mo46248a(C22240g.m55094a(C47661ab.m103163a().mo94969a("type", 3).mo94972a("enter_from", "").f120139a));
        C26890h.m65005a((Context) this, "modify_phone_in", "phone", C23826bi.m58463d(), 0);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.ui.TModifyMobileActivity", "onCreate", false);
    }
}
