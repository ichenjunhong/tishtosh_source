package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.aw */
final /* synthetic */ class C25354aw implements OnClickListener {

    /* renamed from: a */
    private final KeyboardDialogFragment f67040a;

    C25354aw(KeyboardDialogFragment keyboardDialogFragment) {
        this.f67040a = keyboardDialogFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f67040a.mo51854b(view);
    }
}
