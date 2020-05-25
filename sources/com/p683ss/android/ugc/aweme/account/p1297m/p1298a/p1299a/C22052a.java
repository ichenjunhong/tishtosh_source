package com.p683ss.android.ugc.aweme.account.p1297m.p1298a.p1299a;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.m.a.a.a */
public final class C22052a {

    /* renamed from: a */
    public Aweme f59548a;

    /* renamed from: b */
    public VideoViewComponent f59549b;

    /* renamed from: c */
    public C38871j f59550c;

    /* renamed from: a */
    public final void mo46144a() {
        this.f59549b.mo60215af();
    }

    /* renamed from: c */
    public final boolean mo46146c() {
        if (this.f59548a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo46145b() {
        if (mo46146c()) {
            this.f59549b.mo60207a(this.f59550c);
            VideoViewComponent videoViewComponent = this.f59549b;
            Aweme aweme = this.f59548a;
            if (aweme == null) {
                C52711k.m112234a();
            }
            videoViewComponent.mo60204a(aweme.getVideo());
        }
    }

    public C22052a(VideoViewComponent videoViewComponent, C38871j jVar) {
        C52711k.m112240b(videoViewComponent, "videoView");
        C52711k.m112240b(jVar, "onUIPlayListener");
        this.f59549b = videoViewComponent;
        this.f59550c = jVar;
    }
}
