package com.p683ss.android.ugc.aweme.shortvideo.cut.gif;

import android.arch.lifecycle.C0199s;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.c */
final /* synthetic */ class C42643c implements C0199s {

    /* renamed from: a */
    private final Video2GifCutFragment f107884a;

    C42643c(Video2GifCutFragment video2GifCutFragment) {
        this.f107884a = video2GifCutFragment;
    }

    public final void onChanged(Object obj) {
        Video2GifCutFragment video2GifCutFragment = this.f107884a;
        Long l = (Long) obj;
        if (l != null) {
            video2GifCutFragment.f107853b.f93929b.mo75872a(l.longValue());
        }
    }
}
