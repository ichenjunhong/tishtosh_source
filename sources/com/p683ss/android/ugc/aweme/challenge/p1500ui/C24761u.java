package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.u */
final /* synthetic */ class C24761u implements OnClickListener {

    /* renamed from: a */
    private final ImageView f65548a;

    C24761u(ImageView imageView) {
        this.f65548a = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65548a.performClick();
    }
}
