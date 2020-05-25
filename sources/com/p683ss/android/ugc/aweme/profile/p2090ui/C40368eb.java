package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.eb */
final /* synthetic */ class C40368eb implements OnClickListener {

    /* renamed from: a */
    private final UpdateAvatarDialog f103034a;

    C40368eb(UpdateAvatarDialog updateAvatarDialog) {
        this.f103034a = updateAvatarDialog;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f103034a.mo82387a(view);
    }
}
