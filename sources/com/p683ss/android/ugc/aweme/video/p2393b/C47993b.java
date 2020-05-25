package com.p683ss.android.ugc.aweme.video.p2393b;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.video.local.C48062f;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50146d;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50147e;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50149g;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50149g.C50151a;
import java.util.ArrayList;
import java.util.HashSet;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.video.b.b */
public final class C47993b implements C50149g {

    /* renamed from: a */
    public static final C47993b f120631a = new C47993b();

    /* renamed from: c */
    private static final HashSet<String> f120632c = new HashSet<>();

    private C47993b() {
    }

    /* renamed from: b */
    private static void m103830b(String str) {
        f120632c.add(str);
    }

    /* renamed from: a */
    public final C50147e mo95151a(C50151a aVar) {
        C50146d a = aVar.mo97947a();
        if (a != null) {
            VideoUrlModel videoUrlModel = a.f125656a;
            if (videoUrlModel != null) {
                if (f120632c.contains(videoUrlModel.getSourceId())) {
                    return new C50147e(videoUrlModel.getUri());
                }
                C50147e a2 = aVar.mo97948a(a);
                if (a2 == null) {
                    C52711k.m112234a();
                }
                return a2;
            }
        }
        C50147e a3 = aVar.mo97948a(a);
        if (a3 == null) {
            C52711k.m112234a();
        }
        return a3;
    }

    /* renamed from: a */
    public final Aweme mo95152a(String str) {
        C52711k.m112240b(str, "localVideoPath");
        Aweme aweme = new Aweme();
        Video video = new Video();
        C48062f fVar = new C48062f();
        fVar.setSourceId(str);
        fVar.setUri(str);
        fVar.setUrlList(new ArrayList());
        fVar.getUrlList().add(fVar.getUri());
        fVar.setUrlKey(str);
        video.setPlayAddr(fVar);
        video.setPlayAddrH265(video.getPlayAddr());
        aweme.setVideo(video);
        aweme.setAid(str);
        m103830b(str);
        return aweme;
    }
}
