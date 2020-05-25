package com.p683ss.android.ugc.aweme.photomovie.edit.player;

import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24455e;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.player.PhotoMoviePlayerModule */
public class PhotoMoviePlayerModule implements C0183j, C24455e, C38794a {

    /* renamed from: a */
    public PhotoMoviePlayerPresenter f98705a;

    /* renamed from: b */
    public C24454d f98706b;

    /* renamed from: c */
    private TextureView f98707c;

    /* renamed from: b */
    public final C24454d mo50231b() {
        return this.f98706b;
    }

    /* renamed from: a */
    public final PhotoMovieContext mo78753a() {
        return this.f98705a.mo78753a();
    }

    /* renamed from: c */
    public final long mo78760c() {
        return this.f98705a.mo78763b();
    }

    /* renamed from: b */
    public final void mo78759b(int i) {
        this.f98705a.mo78764b(i);
    }

    /* renamed from: a */
    public final void mo78754a(int i) {
        this.f98705a.mo78754a(i);
    }

    /* renamed from: a */
    public final void mo78756a(long j) {
        this.f98705a.mo78762a(j);
    }

    /* renamed from: a */
    public final void mo78758a(String str) {
        this.f98705a.mo78758a(str);
    }

    /* renamed from: a */
    public final void mo78755a(int i, int i2) {
        this.f98705a.mo78761a(100, 7);
    }

    /* renamed from: a */
    public final void mo78757a(C42482c cVar, String str) {
        this.f98705a.mo78757a(cVar, str);
    }

    public PhotoMoviePlayerModule(C0184k kVar, FrameLayout frameLayout, PhotoMovieContext photoMovieContext) {
        kVar.getLifecycle().mo324a(this);
        this.f98707c = (TextureView) frameLayout.findViewById(R.id.bxs);
        this.f98706b = new C38795b(frameLayout, this.f98707c);
        this.f98705a = new PhotoMoviePlayerPresenter(kVar, this.f98707c, photoMovieContext);
    }
}
