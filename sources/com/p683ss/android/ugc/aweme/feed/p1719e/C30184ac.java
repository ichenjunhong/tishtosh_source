package com.p683ss.android.ugc.aweme.feed.p1719e;

import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;

/* renamed from: com.ss.android.ugc.aweme.feed.e.ac */
final /* synthetic */ class C30184ac implements Runnable {

    /* renamed from: a */
    private final C30200o f78775a;

    /* renamed from: b */
    private final C50112d f78776b;

    /* renamed from: c */
    private final Video f78777c;

    /* renamed from: d */
    private final C30016ag f78778d;

    C30184ac(C30200o oVar, C50112d dVar, Video video, C30016ag agVar) {
        this.f78775a = oVar;
        this.f78776b = dVar;
        this.f78777c = video;
        this.f78778d = agVar;
    }

    public final void run() {
        this.f78775a.mo60538a(this.f78776b, this.f78777c, this.f78778d);
    }
}
