package com.p683ss.android.ugc.aweme.comment.services;

import com.p683ss.android.ugc.aweme.comment.p1521f.C25164b.C25165a;
import com.p683ss.android.ugc.aweme.familiar.service.CommentDialogParamsService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.services.b */
public final class C25283b implements ICommentDialogParamsService {

    /* renamed from: a */
    public static final C25283b f66879a = new C25283b();

    /* renamed from: b */
    private final /* synthetic */ ICommentDialogParamsService f66880b;

    public final void disposeCommentDialogParams(C25165a aVar, Object obj, Aweme aweme) {
        this.f66880b.disposeCommentDialogParams(aVar, obj, aweme);
    }

    private C25283b() {
        ICommentDialogParamsService createICommentDialogParamsServicebyMonsterPlugin = CommentDialogParamsService.createICommentDialogParamsServicebyMonsterPlugin();
        C52711k.m112236a((Object) createICommentDialogParamsServicebyMonsterPlugin, "ServiceManager.get().get…aramsService::class.java)");
        this.f66880b = createICommentDialogParamsServicebyMonsterPlugin;
    }
}
