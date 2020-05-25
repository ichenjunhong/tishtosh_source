package com.p683ss.android.ugc.aweme.shortvideo.presenter;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import com.p683ss.android.medialib.jni.FrameThumb;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.VideoFramePresenter */
public class VideoFramePresenter implements C0183j {

    /* renamed from: a */
    public FrameThumb f112247a;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f112247a.unInitVideoToGraph();
    }
}
