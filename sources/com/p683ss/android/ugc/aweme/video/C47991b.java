package com.p683ss.android.ugc.aweme.video;

import com.p683ss.android.ugc.aweme.feed.model.Video;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.video.b */
public final class C47991b {

    /* renamed from: a */
    private static String f120629a;

    /* renamed from: b */
    private static WeakReference<C48121w> f120630b;

    /* renamed from: a */
    public static void m103828a(C48121w wVar) {
        f120630b = new WeakReference<>(wVar);
    }

    /* renamed from: a */
    public static void m103827a(Video video) {
        if (video != null && video.getPlayAddr() != null) {
            f120629a = video.getPlayAddr().getSourceId();
        }
    }
}
