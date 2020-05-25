package com.p683ss.android.ugc.aweme.profile.util;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.util.l */
final /* synthetic */ class C40553l implements OnClickListener {

    /* renamed from: a */
    private final ImageView f103471a;

    C40553l(ImageView imageView) {
        this.f103471a = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f103471a.performClick();
    }
}
