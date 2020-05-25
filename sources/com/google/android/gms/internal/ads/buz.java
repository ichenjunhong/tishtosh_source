package com.google.android.gms.internal.ads;

import android.database.ContentObserver;
import android.os.Handler;

final class buz extends ContentObserver {

    /* renamed from: a */
    private final /* synthetic */ buv f44028a;

    public buz(buv buv, Handler handler) {
        this.f44028a = buv;
        super(handler);
    }

    public final void onChange(boolean z) {
        super.onChange(z);
        this.f44028a.mo30748a();
    }
}
