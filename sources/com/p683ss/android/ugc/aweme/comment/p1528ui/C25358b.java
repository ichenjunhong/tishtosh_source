package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.arch.lifecycle.C0199s;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.b */
final /* synthetic */ class C25358b implements C0199s {

    /* renamed from: a */
    private final CommentInputFragment f67043a;

    C25358b(CommentInputFragment commentInputFragment) {
        this.f67043a = commentInputFragment;
    }

    public final void onChanged(Object obj) {
        CommentInputFragment commentInputFragment = this.f67043a;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            commentInputFragment.mEditText.setEnabled(true);
        } else {
            commentInputFragment.mEditText.setEnabled(false);
        }
    }
}
