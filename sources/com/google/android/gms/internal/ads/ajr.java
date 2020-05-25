package com.google.android.gms.internal.ads;

final /* synthetic */ class ajr implements Runnable {

    /* renamed from: a */
    private final ajh f40703a;

    /* renamed from: b */
    private final int f40704b;

    ajr(ajh ajh, int i) {
        this.f40703a = ajh;
        this.f40704b = i;
    }

    public final void run() {
        ajh ajh = this.f40703a;
        int i = this.f40704b;
        if (ajh.f40668d != null) {
            ajh.f40668d.onWindowVisibilityChanged(i);
        }
    }
}
