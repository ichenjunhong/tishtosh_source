package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25219b;
import com.p683ss.android.ugc.aweme.comment.p1526k.C25230h;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ar */
final /* synthetic */ class C25349ar implements OnClickListener {

    /* renamed from: a */
    private final KeyboardDialogFragment f67035a;

    C25349ar(KeyboardDialogFragment keyboardDialogFragment) {
        this.f67035a = keyboardDialogFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        KeyboardDialogFragment keyboardDialogFragment = this.f67035a;
        C25230h.m61352a(keyboardDialogFragment.getContext(), new C25219b() {
            /* renamed from: a */
            public final void mo51480a(boolean z) {
                KeyboardDialogFragment.this.mo51858c();
            }
        });
    }
}
