package com.p683ss.android.ugc.aweme.shortvideo.presenter;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.presenter.c */
final /* synthetic */ class C44354c implements Runnable {

    /* renamed from: a */
    private final OnVideoCoverCallback f112254a;

    /* renamed from: b */
    private final Bitmap f112255b;

    C44354c(OnVideoCoverCallback onVideoCoverCallback, Bitmap bitmap) {
        this.f112254a = onVideoCoverCallback;
        this.f112255b = bitmap;
    }

    public final void run() {
        OnVideoCoverCallback onVideoCoverCallback = this.f112254a;
        Bitmap bitmap = this.f112255b;
        if (onVideoCoverCallback != null) {
            if (bitmap != null) {
                onVideoCoverCallback.onGetVideoCoverSuccess(bitmap);
                return;
            }
            onVideoCoverCallback.onGetVideoCoverFailed(-1);
        }
    }
}
