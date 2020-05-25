package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.ShortVideoPublishService.C42378a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.el */
final /* synthetic */ class C43788el implements Callable {

    /* renamed from: a */
    private final C42378a f110872a;

    C43788el(C42378a aVar) {
        this.f110872a = aVar;
    }

    public final Object call() {
        ShortVideoPublishService.this.onError(new C43856fy(new Throwable("Video has failed to upload")));
        return null;
    }
}
