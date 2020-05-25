package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.a */
final /* synthetic */ class C41845a implements OnClickListener {

    /* renamed from: a */
    private final AdSettingsActivity f105991a;

    C41845a(AdSettingsActivity adSettingsActivity) {
        this.f105991a = adSettingsActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!this.f105991a.f105603a.mo19040c()) {
            ImageView imageView = (ImageView) view;
            imageView.setSelected(!imageView.isSelected());
        }
    }
}
