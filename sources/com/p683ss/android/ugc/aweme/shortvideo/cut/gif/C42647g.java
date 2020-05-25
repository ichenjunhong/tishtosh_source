package com.p683ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.C0199s;
import android.support.p030v4.p038f.C0794k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.g */
final /* synthetic */ class C42647g implements C0199s {

    /* renamed from: a */
    private final Video2GifCutFragment f107888a;

    C42647g(Video2GifCutFragment video2GifCutFragment) {
        this.f107888a = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        Video2GifCutFragment video2GifCutFragment = this.f107888a;
        Void voidR = (Void) obj;
        C0794k singleVideoPlayBoundary = video2GifCutFragment.videoEditView.getSingleVideoPlayBoundary();
        if (singleVideoPlayBoundary != null && singleVideoPlayBoundary.f2711a != null && singleVideoPlayBoundary.f2712b != null) {
            video2GifCutFragment.f107853b.f93929b.mo75876a(((Long) singleVideoPlayBoundary.f2711a).longValue(), ((Long) singleVideoPlayBoundary.f2712b).longValue());
            video2GifCutFragment.f107853b.f93929b.mo75872a(video2GifCutFragment.videoEditView.getSinglePlayingPosition());
        }
    }
}
