package com.google.android.gms.internal.ads;

final /* synthetic */ class agz implements Runnable {

    /* renamed from: a */
    private final agy f40468a;

    /* renamed from: b */
    private final int f40469b;

    agz(agy agy, int i) {
        this.f40468a = agy;
        this.f40469b = i;
    }

    public final void run() {
        agy agy = this.f40468a;
        int i = this.f40469b;
        if (agy.f40453a != null) {
            agy.f40453a.onWindowVisibilityChanged(i);
        }
    }
}
