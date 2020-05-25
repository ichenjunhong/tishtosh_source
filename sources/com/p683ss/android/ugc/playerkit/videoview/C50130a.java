package com.p683ss.android.ugc.playerkit.videoview;

import android.arch.lifecycle.C0184k;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38866g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.playerkit.videoview.a */
public final class C50130a implements C50158g {

    /* renamed from: a */
    private WeakReference<VideoViewComponent> f125634a;

    /* renamed from: b */
    private Set<C0184k> f125635b;

    /* renamed from: com.ss.android.ugc.playerkit.videoview.a$a */
    static final class C50132a {

        /* renamed from: a */
        static final C50130a f125636a = new C50130a();
    }

    /* renamed from: a */
    public static C50130a m108170a() {
        return C50132a.f125636a;
    }

    private C50130a() {
        this.f125634a = new WeakReference<>(null);
        this.f125635b = Collections.newSetFromMap(new WeakHashMap());
    }

    /* renamed from: ad */
    public final void mo60213ad() {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo60213ad();
            }
        }
    }

    /* renamed from: ae */
    public final void mo60214ae() {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo60214ae();
            }
        }
    }

    /* renamed from: af */
    public final void mo60215af() {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo60215af();
            }
        }
    }

    /* renamed from: ag */
    public final void mo60216ag() {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo60216ag();
            }
        }
    }

    /* renamed from: ah */
    public final long mo60217ah() {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.mo60217ah();
            }
        }
        return 0;
    }

    /* renamed from: ai */
    public final void mo60218ai() {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo60218ai();
            }
        }
    }

    /* renamed from: aj */
    public final C38866g mo60219aj() {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.mo60219aj();
            }
        }
        return null;
    }

    /* renamed from: c */
    public final void mo97927c() {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo97919b();
            }
        }
    }

    /* renamed from: d */
    public final long mo97928d() {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.mo97921c();
            }
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo97926b() {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.mo97922d();
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo60204a(Video video) {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo60204a(video);
            }
        }
    }

    /* renamed from: b */
    public final void mo60226b(C38871j jVar) {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo60226b(jVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo60207a(C38871j jVar) {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo60207a(jVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo97925a(VideoViewComponent videoViewComponent) {
        VideoViewComponent videoViewComponent2 = (VideoViewComponent) this.f125634a.get();
        if (videoViewComponent2 != null) {
            for (C0184k kVar : this.f125635b) {
                if (kVar != null) {
                    kVar.getLifecycle().mo325b(videoViewComponent2);
                }
            }
        }
        this.f125634a = new WeakReference<>(videoViewComponent);
    }

    /* renamed from: a */
    public final void mo60205a(Video video, boolean z, int i) {
        if (this.f125634a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f125634a.get();
            if (videoViewComponent != null) {
                videoViewComponent.mo60205a(video, z, i);
            }
        }
    }
}
