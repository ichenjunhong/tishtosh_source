package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.d */
final class C52157d extends C52156c<C52181v> {

    /* renamed from: f */
    private final C52172q f129824f;

    /* renamed from: d */
    public final C52172q mo108868d() {
        return this.f129824f;
    }

    C52157d(Context context, ScheduledExecutorService scheduledExecutorService, C52184x xVar, C52180u uVar, ScribeFilesSender scribeFilesSender) {
        super(context, scheduledExecutorService, xVar);
        this.f129824f = scribeFilesSender;
        mo108869a(uVar.f129892h);
    }
}
