package com.p683ss.android.ugc.aweme.feed.p1736ui;

import com.p683ss.android.ugc.aweme.views.MentionTextView;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cu */
final /* synthetic */ class C30886cu implements Runnable {

    /* renamed from: a */
    private final MentionTextView f80890a;

    C30886cu(MentionTextView mentionTextView) {
        this.f80890a = mentionTextView;
    }

    public final void run() {
        MentionTextView mentionTextView = this.f80890a;
        if (mentionTextView.getLineCount() != 0) {
            mentionTextView.setLines(mentionTextView.getLineCount());
        }
    }
}
