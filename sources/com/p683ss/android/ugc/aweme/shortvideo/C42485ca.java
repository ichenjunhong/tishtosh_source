package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ca */
final /* synthetic */ class C42485ca implements Callable {

    /* renamed from: a */
    private final Object f107437a;

    C42485ca(Object obj) {
        this.f107437a = obj;
    }

    public final Object call() {
        String str = ((VideoPublishEditModel) this.f107437a).extractFramesModel.extractFramesDir;
        C48016e.m103954e(str);
        C48016e.m103947c(str);
        return null;
    }
}
