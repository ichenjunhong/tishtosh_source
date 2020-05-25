package com.p683ss.android.ugc.aweme.compliance.businesses.vzbv.p1611ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.businesses.vzbv.p1610a.C27075a;
import com.p683ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.businesses.vzbv.ui.a */
final /* synthetic */ class C27076a implements OnClickListener {

    /* renamed from: a */
    private final PrivacyAccountTipActivity f71435a;

    C27076a(PrivacyAccountTipActivity privacyAccountTipActivity) {
        this.f71435a = privacyAccountTipActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PrivacyAccountTipActivity privacyAccountTipActivity = this.f71435a;
        SharePrefCache.inst().getShouldShowPrivateAccountTipInProfile().mo47776a(Boolean.valueOf(true));
        if (!privacyAccountTipActivity.isViewValid() || C27077b.m65313a(privacyAccountTipActivity)) {
            if (privacyAccountTipActivity.f71431b == null) {
                privacyAccountTipActivity.mo55311a();
            }
            privacyAccountTipActivity.f71431b.mo81854a(true);
            C23794bh.m58381G().mo47255p();
            privacyAccountTipActivity.finish();
        } else {
            C10691a.m21551c((Context) privacyAccountTipActivity, privacyAccountTipActivity.getString(R.string.cfw)).mo19066a();
        }
        C23794bh.m58381G().mo47254o();
        SettingServiceImpl.createISettingServicebyMonsterPlugin().providePushSettingChangePresenter().mo44934a_("notify_private_account", Integer.valueOf(1));
        C27075a.m65300a("privacy_account_setting_confirm", privacyAccountTipActivity.f71430a);
        C26890h.m65011a("tns_privacy_notify_confirm_check", C23089d.m56640a().f61491a);
    }
}
