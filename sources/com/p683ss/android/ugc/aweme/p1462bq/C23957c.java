package com.p683ss.android.ugc.aweme.p1462bq;

import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;

/* renamed from: com.ss.android.ugc.aweme.bq.c */
public final class C23957c {

    /* renamed from: com.ss.android.ugc.aweme.bq.c$a */
    public enum C23958a {
        POST(new C23956b() {
            /* renamed from: a */
            public final Object mo49545a(Object[] objArr) throws Exception {
                Aweme aweme = objArr[0];
                new StringBuilder("preloadPostList ").append(aweme.getAuthorUid());
                C23794bh.m58400n().mo48391a(true, aweme.getAuthorUid(), aweme.getAuthor().getSecUid(), 0, 0, 20, C23955a.m58760a(aweme.getAid(), C23958a.POST));
                return null;
            }
        }),
        PROFILE(new C23956b() {
            /* renamed from: a */
            public final Object mo49545a(Object[] objArr) throws Exception {
                Aweme aweme = objArr[0];
                new StringBuilder("preloadProfile ").append(aweme.getAuthorUid());
                C23794bh.m58400n().mo48390a(aweme, true, C23955a.m58760a(aweme.getAid(), C23958a.PROFILE));
                return null;
            }
        }),
        COMMENT(new C23956b() {
            /* renamed from: a */
            public final Object mo49545a(Object[] objArr) throws Exception {
                Aweme aweme = objArr[0];
                String str = (String) objArr[1];
                new StringBuilder("preloadComment ").append(aweme.getAuthorUid());
                C25280a.m61493a().fetchPreloadCommentList(aweme.getAid(), 0, 20, 2, "", null, C47945d.m103731a(), C47945d.m103733b(), true, C23955a.m58760a(aweme.getAid(), C23958a.COMMENT), str);
                return null;
            }
        });
        

        /* renamed from: a */
        private C23956b f63627a;

        public final C23956b getPreloader() {
            return this.f63627a;
        }

        private C23958a(C23956b bVar) {
            this.f63627a = bVar;
        }
    }
}
