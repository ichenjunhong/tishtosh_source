package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.model.C22054b;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.util.C22262d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.account.ui.b */
final /* synthetic */ class C22227b implements C0199s {

    /* renamed from: a */
    private final BaseBindMobileActivity f59981a;

    C22227b(BaseBindMobileActivity baseBindMobileActivity) {
        this.f59981a = baseBindMobileActivity;
    }

    public final void onChanged(Object obj) {
        String str;
        BaseBindMobileActivity baseBindMobileActivity = this.f59981a;
        C22054b bVar = (C22054b) obj;
        if (bVar != null && !TextUtils.isEmpty(bVar.f59554a) && !TextUtils.isEmpty(baseBindMobileActivity.f59804k)) {
            if (baseBindMobileActivity.f59804k == null || !baseBindMobileActivity.f59804k.contains("third_party_")) {
                str = baseBindMobileActivity.f59804k;
            } else {
                str = "log_in";
            }
            C26890h.m65011a("phone_bundling_success", C20856a.m53173a().mo44776a("enter_from", str).mo44774a("status", 1).mo44776a("platform", C21021e.m53410a(C22262d.m55108a(baseBindMobileActivity.f59804k))).f56798a);
        }
    }
}
