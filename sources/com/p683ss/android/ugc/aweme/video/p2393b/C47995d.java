package com.p683ss.android.ugc.aweme.video.p2393b;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LongVideo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50146d;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50147e;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50149g;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50149g.C50151a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.b.d */
public final class C47995d implements C50149g {
    /* renamed from: a */
    public final C50147e mo95151a(C50151a aVar) {
        C50146d a = aVar.mo97947a();
        VideoUrlModel videoUrlModel = a.f125656a;
        String sourceId = videoUrlModel.getSourceId();
        double duration = videoUrlModel.getDuration();
        boolean z = false;
        if (!TextUtils.isEmpty(sourceId)) {
            Aweme awemeById = C23324d.m57378a().getAwemeById(sourceId);
            if (awemeById != null) {
                List longVideos = awemeById.getLongVideos();
                if (longVideos != null && !longVideos.isEmpty()) {
                    Iterator it = longVideos.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        LongVideo longVideo = (LongVideo) it.next();
                        if (longVideo != null) {
                            Video video = longVideo.getVideo();
                            if (video != null && ((double) video.getDuration()) == duration) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (z) {
            return aVar.mo97948a(a);
        }
        String a2 = C25945k.m62918i().mo53856a(videoUrlModel.getSourceId());
        if (!TextUtils.isEmpty(a2)) {
            return new C50147e(a2);
        }
        String a3 = C25945k.m62919j().mo53881a(videoUrlModel.getSourceId());
        if (!TextUtils.isEmpty(a3)) {
            return new C50147e(a3);
        }
        return aVar.mo97948a(a);
    }
}
