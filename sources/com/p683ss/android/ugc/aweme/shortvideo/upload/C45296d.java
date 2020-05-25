package com.p683ss.android.ugc.aweme.shortvideo.upload;

import android.arch.lifecycle.C0184k;
import android.view.SurfaceView;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45284c.C452851;
import dmt.p2652av.video.C52979m;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.d */
final /* synthetic */ class C45296d implements Callable {

    /* renamed from: a */
    private final C452851 f114541a;

    /* renamed from: b */
    private final VideoPublishEditModel f114542b;

    C45296d(C452851 r1, VideoPublishEditModel videoPublishEditModel) {
        this.f114541a = r1;
        this.f114542b = videoPublishEditModel;
    }

    public final Object call() {
        return C52979m.m112708a(this.f114542b, (C0184k) C45284c.this, (SurfaceView) null);
    }
}
