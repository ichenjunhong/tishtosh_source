package com.p683ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.C0199s;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.f */
final /* synthetic */ class C42646f implements C0199s {

    /* renamed from: a */
    private final Video2GifCutFragment f107887a;

    C42646f(Video2GifCutFragment video2GifCutFragment) {
        this.f107887a = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        Video2GifCutFragment video2GifCutFragment = this.f107887a;
        Void voidR = (Void) obj;
        if (video2GifCutFragment.videoEditView.getPlayBoundary() != null && video2GifCutFragment.videoEditView.getPlayBoundary().f2711a != null) {
            video2GifCutFragment.f107853b.f93929b.mo75879b(((Long) video2GifCutFragment.videoEditView.getPlayBoundary().f2711a).longValue());
            video2GifCutFragment.mo86898a();
        }
    }
}
