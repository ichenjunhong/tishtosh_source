package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.twitter.sdk.android.core.identity.b */
public final class C52083b {

    /* renamed from: a */
    public final AtomicReference<C52082a> f129686a = new AtomicReference<>(null);

    C52083b() {
    }

    /* renamed from: a */
    public final boolean mo108786a() {
        if (this.f129686a.get() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo108787a(Activity activity, C52082a aVar) {
        if (mo108786a() || !aVar.mo108785a(activity)) {
            return false;
        }
        return this.f129686a.compareAndSet(null, aVar);
    }
}
