package com.p683ss.android.ugc.aweme.music.p1978ui;

import com.p683ss.android.ugc.aweme.music.api.MusicApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bk */
final /* synthetic */ class C37551bk implements Callable {

    /* renamed from: a */
    private final C37541bj f95802a;

    C37551bk(C37541bj bjVar) {
        this.f95802a = bjVar;
    }

    public final Object call() {
        return MusicApi.m83621a(this.f95802a.f95791y.getMid(), 0).music;
    }
}
