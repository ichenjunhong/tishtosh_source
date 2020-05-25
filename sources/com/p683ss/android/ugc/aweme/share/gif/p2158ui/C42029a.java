package com.p683ss.android.ugc.aweme.share.gif.p2158ui;

import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.share.gif.ui.a */
final /* synthetic */ class C42029a implements AsyncServiceLoader {

    /* renamed from: a */
    private final VideoShare2GifEditActivity f106414a;

    C42029a(VideoShare2GifEditActivity videoShare2GifEditActivity) {
        this.f106414a = videoShare2GifEditActivity;
    }

    public final void onLoad(AsyncAVService asyncAVService, long j) {
        C0013i.m18a((Callable<TResult>) new C42032d<TResult>(this.f106414a, asyncAVService), (Executor) C23551l.f62672a);
    }
}
