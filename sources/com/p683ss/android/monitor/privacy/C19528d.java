package com.p683ss.android.monitor.privacy;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.monitor.privacy.d */
final /* synthetic */ class C19528d implements Callable {

    /* renamed from: a */
    private final Context f53875a;

    C19528d(Context context) {
        this.f53875a = context;
    }

    public final Object call() {
        return PrivacyCheckerInitializer.lambda$run$0$PrivacyCheckerInitializer(this.f53875a);
    }
}
