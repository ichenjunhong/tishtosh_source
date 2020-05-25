package com.p683ss.android.ugc.aweme.profile.adapter;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.k */
final /* synthetic */ class C39750k implements IGetInfoCallback {

    /* renamed from: a */
    private final C39744e f101480a;

    C39750k(C39744e eVar) {
        this.f101480a = eVar;
    }

    public final void finish(Object obj) {
        C0013i.m18a((Callable<TResult>) new C39752m<TResult>(this.f101480a, (Bitmap) obj), (Executor) C23551l.f62672a);
    }
}
