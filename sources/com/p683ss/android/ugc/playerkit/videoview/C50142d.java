package com.p683ss.android.ugc.playerkit.videoview;

import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.playerkit.C50105b;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d */
public final class C50142d {

    /* renamed from: a */
    public static boolean f125655a = true;

    /* renamed from: a */
    public static boolean m108198a(Video video, C50116c cVar) {
        if (!f125655a || !C50105b.m108061a((UrlModel) video.getPlayAddrH265()) || !C50105b.m108062a(cVar)) {
            return false;
        }
        return true;
    }
}
