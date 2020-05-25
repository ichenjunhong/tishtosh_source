package com.p683ss.android.ugc.aweme.feed.adapter;

import com.p683ss.android.ugc.aweme.feed.model.Video;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bf */
final /* synthetic */ class C30067bf implements Runnable {

    /* renamed from: a */
    private final VideoViewHolder f78483a;

    /* renamed from: b */
    private final Video f78484b;

    C30067bf(VideoViewHolder videoViewHolder, Video video) {
        this.f78483a = videoViewHolder;
        this.f78484b = video;
    }

    public final void run() {
        this.f78483a.mo60225b(this.f78484b);
    }
}
