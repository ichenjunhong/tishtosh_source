package com.p683ss.android.ugc.aweme.feed.helper;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.q */
public final class C30394q {

    /* renamed from: a */
    public Aweme f79456a;

    /* renamed from: b */
    public VideoViewComponent f79457b;

    /* renamed from: c */
    public C38871j f79458c;

    /* renamed from: e */
    private final boolean m71311e() {
        if (this.f79456a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo60813b() {
        this.f79457b.mo60215af();
    }

    /* renamed from: c */
    public final void mo60814c() {
        if (m71311e()) {
            this.f79457b.mo60207a(this.f79458c);
            VideoViewComponent videoViewComponent = this.f79457b;
            Aweme aweme = this.f79456a;
            if (aweme == null) {
                C52711k.m112234a();
            }
            videoViewComponent.mo60204a(aweme.getVideo());
        }
    }

    /* renamed from: d */
    public final void mo60815d() {
        this.f79457b.mo60226b(this.f79458c);
        this.f79457b.mo60216ag();
        this.f79457b.mo97919b();
    }

    /* renamed from: a */
    public final void mo60812a() {
        if (m71311e()) {
            this.f79457b.mo60207a(this.f79458c);
            VideoViewComponent videoViewComponent = this.f79457b;
            Aweme aweme = this.f79456a;
            if (aweme == null) {
                C52711k.m112234a();
            }
            videoViewComponent.mo60205a(aweme.getVideo(), true, C10181b.m20511a().mo18168a(Get265DecodeTypeExperiment.class, true, "decoder_type", 31744, 0));
        }
    }

    public C30394q(VideoViewComponent videoViewComponent, C38871j jVar) {
        C52711k.m112240b(videoViewComponent, "videoView");
        C52711k.m112240b(jVar, "onUIPlayListener");
        this.f79457b = videoViewComponent;
        this.f79458c = jVar;
    }
}
