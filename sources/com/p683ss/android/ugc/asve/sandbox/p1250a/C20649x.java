package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.medialib.presenter.IStickerRequestCallback;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20733y.C20734a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.x */
public final class C20649x extends C20734a {

    /* renamed from: a */
    private final WeakReference<IStickerRequestCallback> f56501a;

    public C20649x(IStickerRequestCallback iStickerRequestCallback) {
        C52711k.m112240b(iStickerRequestCallback, "listener");
        this.f56501a = new WeakReference<>(iStickerRequestCallback);
    }

    /* renamed from: a */
    public final void mo43783a(long j, boolean z) {
        IStickerRequestCallback iStickerRequestCallback = (IStickerRequestCallback) this.f56501a.get();
        if (iStickerRequestCallback != null) {
            iStickerRequestCallback.onStickerRequested(j, z);
        }
    }
}
