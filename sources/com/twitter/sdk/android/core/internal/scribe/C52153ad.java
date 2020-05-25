package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.C52114g;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.ad */
public final class C52153ad implements Runnable {

    /* renamed from: a */
    private final Context f129816a;

    /* renamed from: b */
    private final C52171p f129817b;

    public final void run() {
        try {
            C52114g.m111464a(this.f129816a, "Performing time based file roll over.");
            if (!this.f129817b.mo108867c()) {
                this.f129817b.mo108866b();
            }
        } catch (Exception e) {
            C52114g.m111465a(this.f129816a, "Failed to roll over file", (Throwable) e);
        }
    }

    public C52153ad(Context context, C52171p pVar) {
        this.f129816a = context;
        this.f129817b = pVar;
    }
}
