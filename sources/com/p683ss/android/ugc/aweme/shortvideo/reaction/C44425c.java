package com.p683ss.android.ugc.aweme.shortvideo.reaction;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.reaction.c */
public final /* synthetic */ class C44425c implements Callable {

    /* renamed from: a */
    private final C44418b f112390a;

    public C44425c(C44418b bVar) {
        this.f112390a = bVar;
    }

    public final Object call() {
        return (C44409a) ReactApi.f112348a.fetchReactApi(this.f112390a.f112367b.getAid()).execute().f33552b;
    }
}
