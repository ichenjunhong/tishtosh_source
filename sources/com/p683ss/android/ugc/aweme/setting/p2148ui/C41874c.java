package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.c */
final /* synthetic */ class C41874c implements OnClickListener {

    /* renamed from: a */
    private final AdSettingsActivity f106022a;

    C41874c(AdSettingsActivity adSettingsActivity) {
        this.f106022a = adSettingsActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        AdSettingsActivity adSettingsActivity = this.f106022a;
        AdSettingsActivity.m91607a(adSettingsActivity.f105611i, (Context) adSettingsActivity);
        C10691a.m21533a((Context) adSettingsActivity, (int) R.string.aix).mo19066a();
    }
}
