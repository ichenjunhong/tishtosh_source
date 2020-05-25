package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.medialib.FaceBeautyInvoker.OnCherEffectParmaCallback;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20706p.C20707a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.j */
public final class C20635j extends C20707a {

    /* renamed from: a */
    private final WeakReference<OnCherEffectParmaCallback> f56487a;

    public C20635j(OnCherEffectParmaCallback onCherEffectParmaCallback) {
        C52711k.m112240b(onCherEffectParmaCallback, "listener");
        this.f56487a = new WeakReference<>(onCherEffectParmaCallback);
    }

    /* renamed from: a */
    public final void mo43767a(String[] strArr, double[] dArr, boolean[] zArr) {
        OnCherEffectParmaCallback onCherEffectParmaCallback = (OnCherEffectParmaCallback) this.f56487a.get();
        if (onCherEffectParmaCallback != null) {
            onCherEffectParmaCallback.onCherEffect(strArr, dArr, zArr);
        }
    }
}
