package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LongVideo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.longvideo.C36368e;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ai */
final /* synthetic */ class C26378ai implements C26376ag {

    /* renamed from: c */
    static final C26376ag f69593c = new C26378ai();

    private C26378ai() {
    }

    /* renamed from: a */
    public final Video mo54099a(Aweme aweme) {
        if (C36368e.m82060a()) {
            if (aweme == null) {
                return null;
            }
            return aweme.getVideo();
        } else if (C9376b.m18558a((Collection<T>) aweme.getLongVideos())) {
            return null;
        } else {
            return ((LongVideo) aweme.getLongVideos().get(0)).getVideo();
        }
    }
}
