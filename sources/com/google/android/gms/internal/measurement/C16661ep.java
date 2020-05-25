package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.ep */
final class C16661ep extends ContentObserver {
    C16661ep(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        C16660eo.f46881d.set(true);
    }
}
