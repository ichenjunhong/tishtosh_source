package com.p683ss.android.ugc.aweme.feed.p1719e;

import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.e.ab */
final /* synthetic */ class C30183ab implements Callable {

    /* renamed from: a */
    private final Video f78772a;

    /* renamed from: b */
    private final C30016ag f78773b;

    /* renamed from: c */
    private final C50117f f78774c;

    C30183ab(Video video, C30016ag agVar, C50117f fVar) {
        this.f78772a = video;
        this.f78773b = agVar;
        this.f78774c = fVar;
    }

    public final Object call() {
        return C30200o.m70860a(this.f78772a, this.f78773b, this.f78774c);
    }
}
