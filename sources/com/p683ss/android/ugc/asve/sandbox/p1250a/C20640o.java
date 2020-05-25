package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20727w.C20728a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.o */
public final class C20640o extends C20728a {

    /* renamed from: a */
    private final WeakReference<OnARTextCountCallback> f56492a;

    public C20640o(OnARTextCountCallback onARTextCountCallback) {
        C52711k.m112240b(onARTextCountCallback, "listener");
        this.f56492a = new WeakReference<>(onARTextCountCallback);
    }

    /* renamed from: a */
    public final void mo43773a(int i) {
        OnARTextCountCallback onARTextCountCallback = (OnARTextCountCallback) this.f56492a.get();
        if (onARTextCountCallback != null) {
            onARTextCountCallback.onResult(i);
        }
    }
}
