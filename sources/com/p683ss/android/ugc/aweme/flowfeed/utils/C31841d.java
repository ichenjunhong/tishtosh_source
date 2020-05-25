package com.p683ss.android.ugc.aweme.flowfeed.utils;

import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.d */
public final class C31841d {

    /* renamed from: a */
    public static final C31841d f83199a = new C31841d();

    private C31841d() {
    }

    /* renamed from: a */
    public static void m74199a(C37859b bVar, Comment comment) {
        C52711k.m112240b(bVar, "flowFeed");
        if (bVar.needUpdateComment() && comment != null) {
            if (bVar.getCommentList() == null) {
                bVar.setCommentList(new ArrayList());
            }
            if (bVar instanceof FollowFeed) {
                FollowFeed followFeed = (FollowFeed) bVar;
                if (followFeed.isMomentStyle()) {
                    followFeed.getCommentList().add(comment);
                    return;
                }
            }
            bVar.getCommentList().add(0, comment);
        }
    }
}
