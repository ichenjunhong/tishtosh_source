package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.setting.C41626j;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2146b.C41694c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.x */
final /* synthetic */ class C41896x implements OnClickListener {

    /* renamed from: a */
    private final PrivacySettingActivity f106043a;

    C41896x(PrivacySettingActivity privacySettingActivity) {
        this.f106043a = privacySettingActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        PrivacySettingActivity privacySettingActivity = this.f106043a;
        if (privacySettingActivity.f105745h == null || privacySettingActivity.f105745h.f105499o != C41626j.f105361d) {
            if (C26512f.m64060c(privacySettingActivity.f105742e)) {
                C10691a.m21542b((Context) privacySettingActivity, (int) R.string.dn).mo19066a();
            }
            if (!C41848ac.m91832a(privacySettingActivity)) {
                C10691a.m21548c((Context) privacySettingActivity, (int) R.string.cg0).mo19066a();
                return;
            }
            String str = "off";
            if (privacySettingActivity.f105744g) {
                C41694c cVar = privacySettingActivity.f105743f;
                Object[] objArr = new Object[3];
                objArr[0] = "item_comment";
                objArr[1] = Integer.valueOf(C41626j.f105361d);
                objArr[2] = privacySettingActivity.f105742e != null ? privacySettingActivity.f105742e.getAid() : "";
                cVar.mo44934a_(objArr);
                privacySettingActivity.f105744g = false;
            } else {
                C41694c cVar2 = privacySettingActivity.f105743f;
                Object[] objArr2 = new Object[3];
                objArr2[0] = "item_comment";
                objArr2[1] = Integer.valueOf(C41626j.f105358a);
                objArr2[2] = privacySettingActivity.f105742e != null ? privacySettingActivity.f105742e.getAid() : "";
                cVar2.mo44934a_(objArr2);
                privacySettingActivity.f105744g = true;
                str = "on";
            }
            C26890h.m65011a("disable_video_comment", new C23089d().mo47829a("enter_from", "privacy_settings").mo47829a("group_id", privacySettingActivity.f105742e != null ? privacySettingActivity.f105742e.getAid() : "").mo47829a("to_status", str).f61491a);
            privacySettingActivity.f105738a.setChecked(privacySettingActivity.f105744g);
            if (privacySettingActivity.f105742e != null) {
                C23324d.m57378a().updateCommentSetting(privacySettingActivity.f105742e, privacySettingActivity.f105744g ? C41626j.f105358a : C41626j.f105361d);
            }
            C25064a aVar = new C25064a(8, privacySettingActivity.f105742e != null ? privacySettingActivity.f105742e.getAid() : "");
            aVar.f66396d = privacySettingActivity.f105742e;
            C47718bf.m103288a(aVar);
            return;
        }
        C10691a.m21551c(privacySettingActivity.f105738a.getContext(), privacySettingActivity.f105738a.getContext().getString(R.string.hq)).mo19066a();
    }
}
