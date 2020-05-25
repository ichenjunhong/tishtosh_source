package com.p683ss.android.ugc.aweme.commercialize.utils;

import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.y */
public final class C26542y {

    /* renamed from: a */
    public Aweme f69878a;

    /* renamed from: b */
    public Aweme f69879b;

    /* renamed from: c */
    public C50160i f69880c;

    /* renamed from: d */
    public final C38871j f69881d;

    /* renamed from: e */
    public final C26376ag f69882e;

    /* renamed from: f */
    public C48021h f69883f;

    /* renamed from: g */
    private VideoViewComponent f69884g;

    /* renamed from: c */
    public final void mo54224c() {
        if (this.f69883f != null) {
            this.f69883f.mo95268E();
        }
    }

    /* renamed from: d */
    private boolean m64271d() {
        if (this.f69878a == null || this.f69878a.getStatus() == null || !this.f69878a.getStatus().isDelete()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo54223b() {
        if (!this.f69880c.mo97954c() || m64271d()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public VideoUrlModel mo54222a() {
        Aweme aweme;
        Video a = this.f69882e.mo54099a(this.f69878a);
        if (a == null) {
            return null;
        }
        VideoUrlModel properPlayAddr = a.getProperPlayAddr();
        if (properPlayAddr == null) {
            return null;
        }
        if (this.f69879b == null) {
            aweme = this.f69878a;
        } else {
            aweme = this.f69879b;
        }
        a.setRationAndSourceId(aweme.getAid());
        return properPlayAddr;
    }

    public C26542y(VideoViewComponent videoViewComponent, C38871j jVar) {
        this(videoViewComponent, jVar, C26376ag.f69590a);
    }

    private C26542y(VideoViewComponent videoViewComponent, C38871j jVar, C26376ag agVar) {
        this.f69884g = videoViewComponent;
        this.f69880c = this.f69884g.f125619b;
        this.f69881d = jVar;
        this.f69882e = agVar;
    }
}
