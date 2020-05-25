package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41694c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.ab */
final /* synthetic */ class C41847ab implements OnClickListener {

    /* renamed from: a */
    private final PrivacySettingActivity f105993a;

    C41847ab(PrivacySettingActivity privacySettingActivity) {
        this.f105993a = privacySettingActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PrivacySettingActivity privacySettingActivity = this.f105993a;
        if (!C41848ac.m91832a(privacySettingActivity)) {
            C10691a.m21548c((Context) privacySettingActivity, (int) R.string.cg0).mo19066a();
        } else if (!privacySettingActivity.f105740c.mo19040c() && !privacySettingActivity.mo85673a()) {
            C10691a.m21542b((Context) privacySettingActivity, (int) R.string.ath).mo19066a();
        } else if (privacySettingActivity.f105742e != null && privacySettingActivity.f105743f != null) {
            privacySettingActivity.f105740c.setChecked(!privacySettingActivity.f105740c.mo19040c());
            C41694c cVar = privacySettingActivity.f105743f;
            int i = 3;
            Object[] objArr = new Object[3];
            objArr[0] = "item_download";
            objArr[1] = Integer.valueOf(privacySettingActivity.f105740c.mo19040c() ? 0 : 3);
            objArr[2] = privacySettingActivity.f105742e.getAid();
            cVar.mo44934a_(objArr);
            if (privacySettingActivity.f105742e != null) {
                IAwemeService a = C23324d.m57378a();
                Aweme aweme = privacySettingActivity.f105742e;
                if (privacySettingActivity.f105740c.mo19040c()) {
                    i = 0;
                }
                a.updatePreventDownloadType(aweme, i);
            }
        }
    }
}
