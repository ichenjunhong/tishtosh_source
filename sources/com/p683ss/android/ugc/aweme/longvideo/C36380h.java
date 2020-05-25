package com.p683ss.android.ugc.aweme.longvideo;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LongVideo;

/* renamed from: com.ss.android.ugc.aweme.longvideo.h */
public final class C36380h {

    /* renamed from: a */
    public static final C36380h f93145a = new C36380h();

    private C36380h() {
    }

    /* renamed from: a */
    public static LongVideo m82107a(Aweme aweme) {
        if (aweme == null || aweme.getLongVideos() == null || aweme.getLongVideos().size() <= 0) {
            return null;
        }
        return (LongVideo) aweme.getLongVideos().get(0);
    }
}
