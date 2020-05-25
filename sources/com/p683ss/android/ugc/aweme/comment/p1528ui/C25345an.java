package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.an */
final /* synthetic */ class C25345an implements OnClickListener {

    /* renamed from: a */
    private final KeyboardDialogFragment f67019a;

    C25345an(KeyboardDialogFragment keyboardDialogFragment) {
        this.f67019a = keyboardDialogFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        KeyboardDialogFragment keyboardDialogFragment = this.f67019a;
        keyboardDialogFragment.f66981q.mo51118a(keyboardDialogFragment.mEditText.getSelectionStart(), keyboardDialogFragment.mEditText.getText());
    }
}
