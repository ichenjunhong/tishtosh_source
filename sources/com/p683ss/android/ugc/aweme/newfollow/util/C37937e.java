package com.p683ss.android.ugc.aweme.newfollow.util;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30181a;
import com.p683ss.android.ugc.aweme.longvideo.C36385k;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;

/* renamed from: com.ss.android.ugc.aweme.newfollow.util.e */
public final class C37937e {

    /* renamed from: a */
    public C48021h f96594a;

    /* renamed from: b */
    public String f96595b;

    /* renamed from: c */
    public boolean f96596c;

    /* renamed from: d */
    private Aweme f96597d;

    /* renamed from: e */
    private Aweme f96598e;

    /* renamed from: f */
    private C50160i f96599f;

    /* renamed from: g */
    private final C38871j f96600g;

    /* renamed from: h */
    private final C30181a f96601h;

    /* renamed from: i */
    private final C36385k f96602i;

    /* renamed from: j */
    private int f96603j;

    /* renamed from: k */
    private VideoViewComponent f96604k;

    /* renamed from: h */
    public static boolean m84810h() {
        return true;
    }

    /* renamed from: b */
    public final void mo77405b() {
        mo77410g();
    }

    /* renamed from: c */
    public final long mo77406c() {
        if (this.f96594a != null) {
            return this.f96594a.mo95251i();
        }
        return 0;
    }

    /* renamed from: d */
    public final long mo77407d() {
        if (this.f96594a != null) {
            return this.f96594a.mo95256n();
        }
        return 0;
    }

    /* renamed from: e */
    public final void mo77408e() {
        this.f96603j = 1;
        if (this.f96594a != null) {
            this.f96594a.mo95293z();
        }
    }

    /* renamed from: f */
    public final void mo77409f() {
        if (m84814n()) {
            this.f96603j = 2;
            m84811k();
        }
    }

    /* renamed from: g */
    public final void mo77410g() {
        if (m84814n()) {
            this.f96603j = 0;
            m84813m();
        }
    }

    /* renamed from: i */
    public final void mo77411i() {
        if (this.f96594a != null) {
            this.f96594a.mo95268E();
        }
    }

    /* renamed from: j */
    public final void mo77412j() {
        if (this.f96594a != null) {
            this.f96594a.mo95269F();
        }
    }

    /* renamed from: n */
    private boolean m84814n() {
        if (!this.f96599f.mo97954c() || m84816p() || !m84808a(true)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private String m84815o() {
        String str = "";
        if (!TextUtils.isEmpty(this.f96595b)) {
            return this.f96595b;
        }
        if (this.f96601h != null) {
            return this.f96601h.mo60476k();
        }
        return str;
    }

    /* renamed from: p */
    private boolean m84816p() {
        if (this.f96597d == null || this.f96597d.getStatus() == null || !this.f96597d.getStatus().isDelete()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo77401a() {
        if (this.f96594a != null && this.f96594a.mo95287b(this.f96600g)) {
            this.f96594a.mo95284a((C38871j) null);
        }
    }

    /* renamed from: k */
    private void m84811k() {
        if (m84812l() != null && this.f96594a != null) {
            this.f96594a.mo95284a(this.f96600g);
            this.f96594a.mo95281a(this.f96599f.mo97952b());
            this.f96594a.mo95274a(this.f96602i.mo75308a(this.f96597d), true);
        }
    }

    /* renamed from: l */
    private VideoUrlModel m84812l() {
        Aweme aweme;
        Video a = this.f96602i.mo75308a(this.f96597d);
        if (a == null) {
            return null;
        }
        VideoUrlModel properPlayAddr = a.getProperPlayAddr();
        if (properPlayAddr == null) {
            return null;
        }
        if (this.f96598e == null) {
            aweme = this.f96597d;
        } else {
            aweme = this.f96598e;
        }
        a.setRationAndSourceId(aweme.getAid());
        return properPlayAddr;
    }

    /* renamed from: m */
    private void m84813m() {
        if (m84812l() != null && this.f96594a != null) {
            this.f96594a.mo95284a(this.f96600g);
            this.f96594a.mo95281a(this.f96599f.mo97952b());
            this.f96594a.mo95272a(this.f96602i.mo75308a(this.f96597d), this.f96600g);
        }
    }

    /* renamed from: a */
    private boolean m84808a(boolean z) {
        m84815o();
        return true;
    }

    /* renamed from: a */
    public final void mo77402a(float f) {
        if (this.f96594a != null) {
            this.f96594a.mo95279a(f);
        }
    }

    /* renamed from: b */
    private void m84809b(int i) {
        if (m84812l() != null && this.f96594a != null) {
            this.f96594a.mo95284a(this.f96600g);
            this.f96594a.mo95281a(this.f96599f.mo97952b());
            this.f96594a.mo95275a(this.f96602i.mo75308a(this.f96597d), true, i);
        }
    }

    /* renamed from: a */
    public final void mo77403a(int i) {
        if (m84814n()) {
            this.f96603j = 2;
            m84809b(i);
        }
    }

    /* renamed from: a */
    public final void mo77404a(Aweme aweme) {
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                this.f96598e = aweme;
                this.f96597d = aweme.getForwardItem();
                return;
            }
            this.f96598e = null;
            this.f96597d = aweme;
        }
    }

    public C37937e(KeepSurfaceTextureView keepSurfaceTextureView, C38871j jVar, C30181a aVar) {
        this(keepSurfaceTextureView, jVar, (C30181a) null, C36385k.f93160a);
    }

    private C37937e(KeepSurfaceTextureView keepSurfaceTextureView, C38871j jVar, C30181a aVar, C36385k kVar) {
        this(C50160i.m108259a(keepSurfaceTextureView), jVar, aVar, kVar);
    }

    public C37937e(VideoViewComponent videoViewComponent, C38871j jVar, C30181a aVar, C36385k kVar) {
        this.f96604k = videoViewComponent;
        this.f96599f = this.f96604k.f125619b;
        this.f96600g = jVar;
        this.f96601h = null;
        this.f96602i = kVar;
    }

    public C37937e(C50160i iVar, C38871j jVar, C30181a aVar, C36385k kVar) {
        this.f96599f = iVar;
        this.f96600g = jVar;
        this.f96601h = aVar;
        this.f96602i = kVar;
    }
}
