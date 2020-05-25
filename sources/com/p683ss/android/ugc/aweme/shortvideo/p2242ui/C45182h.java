package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p683ss.android.ugc.aweme.shortvideo.C42428ar;
import com.p683ss.android.ugc.aweme.shortvideo.C43790en;
import com.p683ss.android.ugc.aweme.shortvideo.C43791eo;
import com.p683ss.android.ugc.aweme.shortvideo.C43802ey;
import com.p683ss.android.ugc.aweme.shortvideo.C43807fb;
import com.p683ss.android.ugc.aweme.shortvideo.C43989m;
import com.p683ss.android.ugc.aweme.shortvideo.C45327w;
import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2244b.C45017b;
import com.p683ss.android.ugc.aweme.tools.C46938d;
import com.p683ss.android.ugc.aweme.tools.C47063h;
import com.p683ss.android.ugc.aweme.tools.C47067l;
import com.p683ss.android.ugc.aweme.tools.C47348w;
import com.p683ss.android.ugc.aweme.tools.C47351z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.h */
public final class C45182h implements C45172e {

    /* renamed from: a */
    public final AppCompatActivity f114307a;

    /* renamed from: b */
    public final ASCameraView f114308b;

    /* renamed from: c */
    public final C45017b f114309c;

    /* renamed from: d */
    public final ShortVideoContext f114310d;

    /* renamed from: e */
    public C43791eo f114311e;

    /* renamed from: f */
    public C43807fb f114312f;

    /* renamed from: g */
    private C43989m f114313g;

    /* renamed from: h */
    private C43802ey f114314h;

    /* renamed from: i */
    private C45327w f114315i;

    /* renamed from: j */
    private C43790en f114316j;

    /* renamed from: k */
    private C42428ar f114317k;

    /* renamed from: a */
    public final void mo91384a(C46938d dVar) {
        if (this.f114313g == null) {
            this.f114313g = new C43989m(this.f114307a, this.f114309c);
        }
        this.f114313g.onEvent(dVar);
    }

    /* renamed from: a */
    public final void mo91385a(C47063h hVar) {
        if (this.f114315i == null) {
            this.f114315i = new C45327w(this.f114309c);
        }
        this.f114315i.onEvent(hVar);
    }

    /* renamed from: a */
    public final void mo91386a(C47067l lVar) {
        if (this.f114317k == null) {
            this.f114317k = new C42428ar(this.f114307a, this.f114308b, this.f114309c);
        }
        this.f114317k.onEvent(lVar);
    }

    /* renamed from: a */
    public final void mo91387a(C47348w wVar) {
        if (this.f114316j == null) {
            this.f114316j = new C43790en(this.f114307a, this.f114309c, this.f114310d, this.f114308b);
        }
        this.f114316j.onEvent(wVar);
    }

    /* renamed from: a */
    public final void mo91480a(C47351z zVar) {
        if (this.f114314h == null) {
            this.f114314h = new C43802ey(this.f114307a, this.f114308b, this.f114309c, this.f114310d);
        }
        this.f114314h.onEvent(zVar);
    }

    public C45182h(AppCompatActivity appCompatActivity, ASCameraView aSCameraView, C45017b bVar, ShortVideoContext shortVideoContext) {
        this.f114307a = appCompatActivity;
        this.f114308b = aSCameraView;
        this.f114309c = bVar;
        this.f114310d = shortVideoContext;
    }
}
