package com.google.android.gms.tagmanager;

import java.util.List;

/* renamed from: com.google.android.gms.tagmanager.l */
final class C17216l implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ List f48672a;

    /* renamed from: b */
    private final /* synthetic */ long f48673b;

    /* renamed from: c */
    private final /* synthetic */ C17215k f48674c;

    C17216l(C17215k kVar, List list, long j) {
        this.f48674c = kVar;
        this.f48672a = list;
        this.f48673b = j;
    }

    public final void run() {
        this.f48674c.mo33474b(this.f48672a, this.f48673b);
    }
}
