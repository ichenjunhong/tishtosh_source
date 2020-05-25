package com.p683ss.android.ugc.aweme.comment;

import com.p683ss.android.ugc.aweme.feed.model.CommentEggDataManager;

/* renamed from: com.ss.android.ugc.aweme.comment.d */
public final class C25150d implements C25279s {
    /* renamed from: a */
    public final void mo51278a(String str) {
        CommentEggDataManager.deleteCommentEggGroup(str);
    }

    /* renamed from: a */
    public final String mo51277a(String str, String str2) {
        return CommentEggDataManager.getHint(str, str2);
    }
}
