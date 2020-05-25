package com.p683ss.android.ugc.playerkit.videoview;

import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38858d;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50143a;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50144b;
import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50148f;

/* renamed from: com.ss.android.ugc.playerkit.videoview.c */
public enum C50140c {
    INSTANCE;
    

    /* renamed from: a */
    private C38858d f125646a;

    /* renamed from: b */
    private C50134b f125647b;

    /* renamed from: c */
    private C50143a f125648c;

    /* renamed from: d */
    private C50144b f125649d;

    /* renamed from: e */
    private C50148f f125650e;

    public final C50134b cacheChecker() {
        return this.f125647b;
    }

    public final C50143a getBitrateManager() {
        return this.f125648c;
    }

    public final C50144b getHttpsHelper() {
        return this.f125649d;
    }

    public final C50148f getPlayUrlBuilder() {
        return this.f125650e;
    }

    public final C38858d playInfoCallback() {
        return this.f125646a;
    }

    public final C50140c setBitrateManager(C50143a aVar) {
        this.f125648c = aVar;
        return this;
    }

    public final C50140c setCacheChecker(C50134b bVar) {
        this.f125647b = bVar;
        return this;
    }

    public final C50140c setHttpsHelper(C50144b bVar) {
        this.f125649d = bVar;
        return this;
    }

    public final C50140c setPlayInfoCallback(C38858d dVar) {
        this.f125646a = dVar;
        return this;
    }

    public final C50140c setPlayUrlBuilder(C50148f fVar) {
        this.f125650e = fVar;
        return this;
    }
}
