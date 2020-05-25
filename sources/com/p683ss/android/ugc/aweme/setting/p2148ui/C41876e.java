package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.router.C41302w;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.e */
final /* synthetic */ class C41876e implements OnClickListener {

    /* renamed from: a */
    private final AdSettingsActivity f106024a;

    C41876e(AdSettingsActivity adSettingsActivity) {
        this.f106024a = adSettingsActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        AdSettingsActivity adSettingsActivity = this.f106024a;
        String a = adSettingsActivity.mo85573a();
        if (TextUtils.isEmpty(a)) {
            if (!TextUtils.isEmpty(adSettingsActivity.f105612j)) {
                a = adSettingsActivity.f105612j;
            } else {
                return;
            }
        }
        C41302w.m91042a().mo83861a(a);
    }
}
