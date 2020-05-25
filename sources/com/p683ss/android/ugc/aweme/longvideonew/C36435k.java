package com.p683ss.android.ugc.aweme.longvideonew;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LongVideo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.longvideo.C36368e;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.k */
final /* synthetic */ class C36435k implements C36433i {

    /* renamed from: c */
    static final C36433i f93330c = new C36435k();

    private C36435k() {
    }

    /* renamed from: a */
    public final Video mo75372a(Aweme aweme) {
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
