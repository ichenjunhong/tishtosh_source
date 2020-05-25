package com.p683ss.android.ugc.aweme.video;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ttnet.p883a.C13258a;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.android.ugc.playerkit.videoview.C50142d;
import java.net.URI;

/* renamed from: com.ss.android.ugc.aweme.video.p */
public final class C48070p {
    /* renamed from: a */
    public static VideoUrlModel m104093a(Video video) {
        return m104094a(video, C50109a.m108068s().mo95420a());
    }

    /* renamed from: a */
    public static VideoUrlModel m104094a(Video video, C50116c cVar) {
        if (video == null) {
            return null;
        }
        if (!C48069o.m104087I()) {
            if (C50142d.m108198a(video, cVar)) {
                return video.getPlayAddrH265();
            }
            return video.getPlayAddrH264();
        } else if (C50142d.m108198a(video, cVar)) {
            return video.getPlayAddrH265();
        } else {
            return video.getPlayAddrH264();
        }
    }

    /* renamed from: a */
    public static boolean m104095a(Context context, String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("https://")) {
            return false;
        }
        try {
            if (C13258a.m26660a(context).mo17830d(URI.create(str).getHost()) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
