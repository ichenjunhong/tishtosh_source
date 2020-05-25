package com.p683ss.android.ugc.aweme.longvideo;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LongVideo;
import com.p683ss.android.ugc.aweme.feed.model.Video;

/* renamed from: com.ss.android.ugc.aweme.longvideo.m */
final /* synthetic */ class C36387m implements C36385k {

    /* renamed from: c */
    static final C36385k f93163c = new C36387m();

    private C36387m() {
    }

    /* renamed from: a */
    public final Video mo75308a(Aweme aweme) {
        if (C36368e.m82060a()) {
            if (aweme == null) {
                return null;
            }
            return aweme.getVideo();
        } else if (aweme == null || aweme.getLongVideos() == null || aweme.getLongVideos().size() <= 0) {
            return null;
        } else {
            return ((LongVideo) aweme.getLongVideos().get(0)).getVideo();
        }
    }
}
