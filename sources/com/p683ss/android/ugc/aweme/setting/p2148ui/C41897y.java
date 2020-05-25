package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.y */
final /* synthetic */ class C41897y implements OnClickListener {

    /* renamed from: a */
    private final PrivacySettingActivity f106044a;

    C41897y(PrivacySettingActivity privacySettingActivity) {
        this.f106044a = privacySettingActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PrivacySettingActivity privacySettingActivity = this.f106044a;
        if (!C41848ac.m91832a(privacySettingActivity)) {
            C10691a.m21548c((Context) privacySettingActivity, (int) R.string.cg0).mo19066a();
            return;
        }
        if (privacySettingActivity.f105746i) {
            privacySettingActivity.f105746i = false;
        } else {
            privacySettingActivity.f105746i = true;
        }
        privacySettingActivity.f105739b.setChecked(privacySettingActivity.f105746i);
        C0013i.m16a((Callable<TResult>) new C41898z<TResult>(privacySettingActivity)).mo20a((C0011g<TResult, TContinuationResult>) new C41846aa<TResult,TContinuationResult>(privacySettingActivity), C0013i.f25b);
    }
}
