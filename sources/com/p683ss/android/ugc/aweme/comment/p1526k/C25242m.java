package com.p683ss.android.ugc.aweme.comment.p1526k;

import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService;
import com.p683ss.android.ugc.aweme.p1632di.C27628bo;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.k.m */
public final class C25242m implements NoticeCommentHelperService {
    /* renamed from: a */
    public static NoticeCommentHelperService m61365a() {
        if (C27991b.f73424H == null) {
            synchronized (NoticeCommentHelperService.class) {
                if (C27991b.f73424H == null) {
                    C27991b.f73424H = C27628bo.m66315j();
                }
            }
        }
        return (NoticeCommentHelperService) C27991b.f73424H;
    }

    public final String getDisplayText(Comment comment, boolean z) {
        C52711k.m112240b(comment, "comment");
        return C25225e.m61337a(comment, z, false, 2, null);
    }
}
