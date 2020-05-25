package com.p683ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.C0199s;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.e */
final /* synthetic */ class C42645e implements C0199s {

    /* renamed from: a */
    private final Video2GifCutFragment f107886a;

    C42645e(Video2GifCutFragment video2GifCutFragment) {
        this.f107886a = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        Video2GifCutFragment video2GifCutFragment = this.f107886a;
        Void voidR = (Void) obj;
        if (video2GifCutFragment.videoEditView.getPlayBoundary() != null && video2GifCutFragment.videoEditView.getPlayBoundary().f2712b != null) {
            video2GifCutFragment.f107853b.f93929b.mo75882c(((Long) video2GifCutFragment.videoEditView.getPlayBoundary().f2712b).longValue());
            video2GifCutFragment.mo86898a();
        }
    }
}
