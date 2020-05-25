package com.p683ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c.C42543a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.b */
final /* synthetic */ class C42541b implements Runnable {

    /* renamed from: a */
    private final C42543a f107592a;

    /* renamed from: b */
    private final int f107593b;

    /* renamed from: c */
    private final Bitmap f107594c;

    C42541b(C42543a aVar, int i, Bitmap bitmap) {
        this.f107592a = aVar;
        this.f107593b = i;
        this.f107594c = bitmap;
    }

    public final void run() {
        this.f107592a.mo86764a(this.f107593b, this.f107594c);
    }
}
