package com.p683ss.android.ugc.aweme.familiar.service;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25164b.C25165a;
import com.p683ss.android.ugc.aweme.comment.services.ICommentDialogParamsService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.familiar.service.CommentDialogParamsService */
public final class CommentDialogParamsService implements ICommentDialogParamsService {
    public final void disposeCommentDialogParams(C25165a aVar, Object obj, Aweme aweme) {
    }

    public static ICommentDialogParamsService createICommentDialogParamsServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ICommentDialogParamsService.class);
        if (a != null) {
            return (ICommentDialogParamsService) a;
        }
        if (C27991b.f73460aQ == null) {
            synchronized (ICommentDialogParamsService.class) {
                if (C27991b.f73460aQ == null) {
                    C27991b.f73460aQ = new CommentDialogParamsService();
                }
            }
        }
        return (CommentDialogParamsService) C27991b.f73460aQ;
    }
}
