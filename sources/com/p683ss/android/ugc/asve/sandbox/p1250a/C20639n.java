package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.p683ss.android.medialib.FaceBeautyInvoker.OnARTextContentCallback;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20658a.C20659a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.n */
public final class C20639n extends C20659a {

    /* renamed from: a */
    private final WeakReference<OnARTextContentCallback> f56491a;

    public C20639n(OnARTextContentCallback onARTextContentCallback) {
        C52711k.m112240b(onARTextContentCallback, "listener");
        this.f56491a = new WeakReference<>(onARTextContentCallback);
    }

    /* renamed from: a */
    public final void mo43772a(String[] strArr) {
        OnARTextContentCallback onARTextContentCallback = (OnARTextContentCallback) this.f56491a.get();
        if (onARTextContentCallback != null) {
            onARTextContentCallback.onResult(strArr);
        }
    }
}
