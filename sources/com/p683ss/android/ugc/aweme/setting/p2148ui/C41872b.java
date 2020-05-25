package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.b */
final /* synthetic */ class C41872b implements OnClickListener {

    /* renamed from: a */
    private final AdSettingsActivity f106021a;

    C41872b(AdSettingsActivity adSettingsActivity) {
        this.f106021a = adSettingsActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        AdSettingsActivity adSettingsActivity = this.f106021a;
        boolean c = adSettingsActivity.f105603a.mo19040c();
        if (!c) {
            if (adSettingsActivity.f105609g.isSelected()) {
                adSettingsActivity.mo85574a(adSettingsActivity.f105604b.getAid(), "1", c);
            }
        } else if (adSettingsActivity.f105610h) {
            C10691a.m21549c(C11010c.m22280a(), (int) R.string.dgd, 1).mo19066a();
        } else {
            adSettingsActivity.mo85574a(adSettingsActivity.f105604b.getAid(), "0", c);
        }
    }
}
