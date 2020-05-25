package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.g */
final /* synthetic */ class C24662g implements OnClickListener {

    /* renamed from: a */
    private final ImageView f65260a;

    C24662g(ImageView imageView) {
        this.f65260a = imageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f65260a.performClick();
    }
}
