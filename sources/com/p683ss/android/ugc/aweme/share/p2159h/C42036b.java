package com.p683ss.android.ugc.aweme.share.p2159h;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.share.C42228p;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.h.b */
public final class C42036b {

    /* renamed from: a */
    public static final C42036b f106424a = new C42036b();

    private C42036b() {
    }

    /* renamed from: a */
    public static final VideoUrlModel m92001a(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        Video video = aweme.getVideo();
        C52711k.m112236a((Object) video, "aweme.video");
        C42228p pVar = (C42228p) new C17971f().mo34884a(video.getMiscDownloadAddrs(), C42228p.class);
        if (pVar != null) {
            return pVar.getSnapchatDownloadAddr();
        }
        return null;
    }
}
