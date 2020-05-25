package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ai */
final /* synthetic */ class C25340ai implements OnClickListener {

    /* renamed from: a */
    private final KeyboardDialogFragment f67013a;

    C25340ai(KeyboardDialogFragment keyboardDialogFragment) {
        this.f67013a = keyboardDialogFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        KeyboardDialogFragment keyboardDialogFragment = this.f67013a;
        keyboardDialogFragment.mGifEmojiLayout.setVisibility(8);
        keyboardDialogFragment.mGifEmoji.setImageBitmap(null);
        keyboardDialogFragment.mo51847a((C29366a) null);
        keyboardDialogFragment.mo51866i();
    }
}
