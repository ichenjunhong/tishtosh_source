package dmt.p2652av.video.superentrance.player;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.playerkit.videoview.C50159h;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p683ss.android.ugc.tools.utils.C50203g;
import dmt.p2652av.video.superentrance.C53015e;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.superentrance.player.SuperEntranceVideoPlayer */
public final class SuperEntranceVideoPlayer extends C53023a implements C0183j {

    /* renamed from: a */
    public final KeepSurfaceTextureView f131479a;

    /* renamed from: b */
    public final C52670a<C52860x> f131480b;

    /* renamed from: c */
    private VideoViewComponent f131481c;

    /* renamed from: d */
    private C50159h f131482d;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C50203g.m108358a("called SuperEntranceVideoPlayer onDestroy()");
        C50203g.m108358a("called SuperEntranceVideoPlayer release()");
        this.f131481c.mo97919b();
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void resume() {
        C50203g.m108358a("called SuperEntranceVideoPlayer resume()");
        this.f131481c.mo60214ae();
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void stop() {
        C50203g.m108358a("called SuperEntranceVideoPlayer stop()");
        this.f131481c.mo60215af();
    }

    /* renamed from: a */
    private void m112749a(Video video) {
        C52711k.m112240b(video, "video");
        C50203g.m108358a("called SuperEntranceVideoPlayer startPlay()");
        this.f131481c.mo60204a(video);
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
        super.mo53535e(str);
        m112749a(C53015e.m112740a(true));
        CharSequence charSequence = str;
        String str2 = null;
        VideoUrlModel playAddrH264 = C53015e.m112740a(false).getPlayAddrH264();
        if (playAddrH264 != null) {
            str2 = playAddrH264.getSourceId();
        }
        if (TextUtils.equals(charSequence, str2)) {
            C50203g.m108358a("called SuperEntranceVideoPlayer onFirstParagraphPlayCompleted()");
            this.f131480b.invoke();
        }
    }

    public SuperEntranceVideoPlayer(C0184k kVar, KeepSurfaceTextureView keepSurfaceTextureView, C52670a<C52860x> aVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(keepSurfaceTextureView, "surface");
        C52711k.m112240b(aVar, "onFirstParagraphPlayCompleted");
        this.f131479a = keepSurfaceTextureView;
        this.f131480b = aVar;
        kVar.getLifecycle().mo324a(this);
        C50160i a = C50160i.m108259a(this.f131479a);
        C52711k.m112236a((Object) a, "VideoSurfaceHolderImpl.wrap(surface)");
        this.f131482d = a;
        VideoViewComponent videoViewComponent = new VideoViewComponent();
        videoViewComponent.mo97917a(this.f131479a);
        videoViewComponent.mo60207a((C38871j) this);
        this.f131481c = videoViewComponent;
        m112749a(C53015e.m112740a(false));
        C26890h.m65011a("super_entrance_splash_play", C23089d.m56640a().f61491a);
    }
}
