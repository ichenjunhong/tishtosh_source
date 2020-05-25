package com.twitter.sdk.android.tweetui.internal;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.twitter.sdk.android.tweetui.internal.i */
final /* synthetic */ class C52301i implements OnClickListener {

    /* renamed from: a */
    private final VideoControlView f130247a;

    C52301i(VideoControlView videoControlView) {
        this.f130247a = videoControlView;
    }

    public final void onClick(View view) {
        VideoControlView videoControlView = this.f130247a;
        if (videoControlView.f130186a.mo109074c()) {
            videoControlView.f130186a.mo109073b();
        } else {
            videoControlView.f130186a.mo109071a();
        }
        videoControlView.mo109061b();
    }
}
