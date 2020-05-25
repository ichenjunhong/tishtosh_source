package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.a */
final /* synthetic */ class C25329a implements C0199s {

    /* renamed from: a */
    private final CommentInputFragment f66998a;

    C25329a(CommentInputFragment commentInputFragment) {
        this.f66998a = commentInputFragment;
    }

    public final void onChanged(Object obj) {
        float f;
        CommentInputFragment commentInputFragment = this.f66998a;
        Float f2 = (Float) obj;
        if (commentInputFragment.mLayout != null) {
            if (f2 == null) {
                f = 0.0f;
            } else {
                f = f2.floatValue();
            }
            commentInputFragment.mLayout.setTranslationX(((float) C23724k.m58224b(commentInputFragment.getContext())) * f);
            commentInputFragment.mLayout.setAlpha(1.0f - f);
        }
    }
}
