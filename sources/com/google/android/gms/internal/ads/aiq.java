package com.google.android.gms.internal.ads;

final /* synthetic */ class aiq implements Runnable {

    /* renamed from: a */
    private final ain f40633a;

    /* renamed from: b */
    private final int f40634b;

    aiq(ain ain, int i) {
        this.f40633a = ain;
        this.f40634b = i;
    }

    public final void run() {
        ain ain = this.f40633a;
        int i = this.f40634b;
        if (ain.f40608d != null) {
            ain.f40608d.onWindowVisibilityChanged(i);
        }
    }
}
