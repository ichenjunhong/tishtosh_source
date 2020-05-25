package com.p683ss.android.ugc.aweme.video.p2393b;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.video.experiment.ForceSoftwareExperiment;
import com.p683ss.android.ugc.aweme.video.local.C48062f;
import com.p683ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50146d;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50147e;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50149g;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50149g.C50151a;

/* renamed from: com.ss.android.ugc.aweme.video.b.c */
public final class C47994c implements C50149g {
    /* renamed from: a */
    public final C50147e mo95151a(C50151a aVar) {
        C50146d a = aVar.mo97947a();
        VideoUrlModel videoUrlModel = a.f125656a;
        LocalVideoPlayerManager a2 = LocalVideoPlayerManager.m104046a();
        String a3 = a2.mo95312a(videoUrlModel.getSourceId());
        if (!TextUtils.isEmpty(a3)) {
            C48062f a4 = a2.f120742a.mo95323a(videoUrlModel.getSourceId());
            if (a4 != null) {
                String uri = a4.getUri();
                String uri2 = videoUrlModel.getUri();
                if (!(uri == null || uri2 == null || TextUtils.equals(uri.split("_")[0], uri2.split("_")[0]))) {
                    a2.f120742a.mo95328b(a4.getSourceId());
                    a3 = null;
                }
            }
        }
        if (TextUtils.isEmpty(a3)) {
            return aVar.mo97948a(a);
        }
        StringBuilder sb = new StringBuilder("LocalVideoCache=>play video using cache,filePath:");
        sb.append(a3);
        C45407ay.m98968a(sb.toString());
        C50147e eVar = new C50147e(a3);
        if (C10181b.m20511a().mo18168a(ForceSoftwareExperiment.class, true, "force_software_play", 31744, 1) == 1) {
            eVar.f125660b = true;
        }
        return eVar;
    }
}
