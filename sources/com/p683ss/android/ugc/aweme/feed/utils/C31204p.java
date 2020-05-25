package com.p683ss.android.ugc.aweme.feed.utils;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.p */
public final class C31204p {
    /* renamed from: a */
    public static boolean m72865a(Aweme aweme) {
        int i;
        if (aweme == null || aweme.getVideoControl() == null) {
            i = -1;
        } else {
            i = aweme.getVideoControl().preventDownloadType;
        }
        if (C31190f.m72831a(aweme) || i != 3) {
            return false;
        }
        return true;
    }
}
