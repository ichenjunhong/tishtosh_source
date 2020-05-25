package com.p683ss.android.ugc.aweme.video.bitrate;

import com.p683ss.android.ugc.aweme.feed.model.BitRate;
import java.util.Comparator;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.b */
public final /* synthetic */ class C47998b implements Comparator {

    /* renamed from: a */
    public static final Comparator f120637a = new C47998b();

    private C47998b() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((BitRate) obj2).getBitRate() - ((BitRate) obj).getBitRate();
    }
}
