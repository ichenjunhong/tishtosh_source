package com.snapchat.kit.sdk.creative.media;

import com.snapchat.kit.sdk.creative.p1093b.C18308b;
import dagger.p2651a.C52867d;
import javax.p2677a.C53188a;

public final class SnapMediaFactory_Factory implements C52867d<SnapMediaFactory> {

    /* renamed from: a */
    private final C53188a<C18308b> f50528a;

    public final SnapMediaFactory get() {
        return new SnapMediaFactory((C18308b) this.f50528a.get());
    }

    public SnapMediaFactory_Factory(C53188a<C18308b> aVar) {
        this.f50528a = aVar;
    }

    public static C52867d<SnapMediaFactory> create(C53188a<C18308b> aVar) {
        return new SnapMediaFactory_Factory(aVar);
    }

    public static SnapMediaFactory newSnapMediaFactory(C18308b bVar) {
        return new SnapMediaFactory(bVar);
    }
}
