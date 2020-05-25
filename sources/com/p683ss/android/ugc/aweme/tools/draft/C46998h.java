package com.p683ss.android.ugc.aweme.tools.draft;

import android.view.View;
import android.view.View.OnLongClickListener;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.h */
final /* synthetic */ class C46998h implements OnLongClickListener {

    /* renamed from: a */
    private final AwemeDraftViewHolder f118708a;

    C46998h(AwemeDraftViewHolder awemeDraftViewHolder) {
        this.f118708a = awemeDraftViewHolder;
    }

    public final boolean onLongClick(View view) {
        AwemeDraftViewHolder awemeDraftViewHolder = this.f118708a;
        if (C43214dh.m94817a().mo87852a(view.getContext())) {
            awemeDraftViewHolder.f118614g.mo94252a(view, (C29059c) awemeDraftViewHolder.f70665k);
        }
        return true;
    }
}
