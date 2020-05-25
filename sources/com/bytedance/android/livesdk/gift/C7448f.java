package com.bytedance.android.livesdk.gift;

import java.lang.ref.WeakReference;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.f */
final /* synthetic */ class C7448f implements C1710e {

    /* renamed from: a */
    private final boolean f20430a;

    /* renamed from: b */
    private final WeakReference f20431b;

    C7448f(boolean z, WeakReference weakReference) {
        this.f20430a = z;
        this.f20431b = weakReference;
    }

    public final void accept(Object obj) {
        GiftManager.lambda$syncGiftList$1$GiftManager(this.f20430a, this.f20431b, (Throwable) obj);
    }
}
