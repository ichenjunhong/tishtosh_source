package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.commnet;

import com.p683ss.android.ugc.aweme.comment_sticker.C25467c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.commnet.f */
final /* synthetic */ class C43557f implements Runnable {

    /* renamed from: a */
    private final CommentStickerInteractView f110221a;

    /* renamed from: b */
    private final C25467c f110222b;

    C43557f(CommentStickerInteractView commentStickerInteractView, C25467c cVar) {
        this.f110221a = commentStickerInteractView;
        this.f110222b = cVar;
    }

    public final void run() {
        CommentStickerInteractView commentStickerInteractView = this.f110221a;
        C25467c cVar = this.f110222b;
        commentStickerInteractView.mo88875f();
        commentStickerInteractView.setVisibility(0);
        if (cVar != null) {
            cVar.mo52061a();
        }
    }
}
