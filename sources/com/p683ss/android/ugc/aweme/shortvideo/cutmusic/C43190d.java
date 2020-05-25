package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import com.p683ss.android.ugc.aweme.utils.C47902fv;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.d */
final /* synthetic */ class C43190d implements Runnable {

    /* renamed from: a */
    private final MusicDragView f109214a;

    C43190d(MusicDragView musicDragView) {
        this.f109214a = musicDragView;
    }

    public final void run() {
        MusicDragView musicDragView = this.f109214a;
        if (musicDragView.f109171a != null && musicDragView.mKTVView != null) {
            double d = (double) musicDragView.f109174d;
            Double.isNaN(d);
            double d2 = d * 1.0d;
            double width = (double) musicDragView.mKTVView.getWidth();
            Double.isNaN(width);
            double d3 = d2 * width;
            double d4 = (double) musicDragView.f109175e;
            Double.isNaN(d4);
            int i = (int) (d3 / d4);
            musicDragView.f109171a.setX((musicDragView.mKTVView.getX() + ((float) i)) - ((float) (musicDragView.f109171a.getWidth() / 2)));
            musicDragView.mKTVView.setStart(i);
            musicDragView.mKTVView.setLength(musicDragView.mo87771a());
            musicDragView.mTextViewTimeStart.setText(C47902fv.m103621a(musicDragView.f109174d));
        }
    }
}
