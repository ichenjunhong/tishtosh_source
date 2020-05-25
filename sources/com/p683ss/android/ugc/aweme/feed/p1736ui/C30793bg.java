package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bg */
final /* synthetic */ class C30793bg implements OnClickListener {

    /* renamed from: a */
    private final LongPressLayout f80672a;

    C30793bg(LongPressLayout longPressLayout) {
        this.f80672a = longPressLayout;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        LongPressLayout longPressLayout = this.f80672a;
        if (longPressLayout.f80453g != null) {
            longPressLayout.f80453g.onClick(view);
        }
        if (!longPressLayout.f80455i) {
            longPressLayout.f80454h.onClick(view);
        }
        longPressLayout.f80455i = false;
    }
}
