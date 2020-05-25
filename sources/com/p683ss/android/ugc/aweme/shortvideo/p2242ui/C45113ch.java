package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.graphics.Point;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.C43866a;
import com.p683ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter;
import com.p683ss.android.ugc.aweme.shortvideo.p2185d.p2186a.C43204a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ch */
final /* synthetic */ class C45113ch implements Runnable {

    /* renamed from: a */
    private final VideoRecordNewActivity f114232a;

    C45113ch(VideoRecordNewActivity videoRecordNewActivity) {
        this.f114232a = videoRecordNewActivity;
    }

    public final void run() {
        VideoRecordNewActivity videoRecordNewActivity = this.f114232a;
        DefaultGesturePresenter defaultGesturePresenter = new DefaultGesturePresenter(videoRecordNewActivity, null, videoRecordNewActivity.f113797w);
        Point H = videoRecordNewActivity.f113766E.mo91302H();
        defaultGesturePresenter.mo89419a(1, (C43866a) new C43204a(videoRecordNewActivity.f113766E.mo91307M().getEffectController()).mo87815a(H.x, H.y));
    }
}
