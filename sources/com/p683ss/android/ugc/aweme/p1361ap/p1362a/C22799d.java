package com.p683ss.android.ugc.aweme.p1361ap.p1362a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.ap.a.d */
final /* synthetic */ class C22799d implements Callable {

    /* renamed from: a */
    private final C22795c f61078a;

    /* renamed from: b */
    private final int f61079b;

    /* renamed from: c */
    private final int f61080c;

    /* renamed from: d */
    private final int f61081d;

    C22799d(C22795c cVar, int i, int i2, int i3) {
        this.f61078a = cVar;
        this.f61079b = i;
        this.f61080c = i2;
        this.f61081d = i3;
    }

    public final Object call() {
        C22795c cVar = this.f61078a;
        int i = this.f61079b;
        int i2 = this.f61080c;
        int i3 = this.f61081d;
        ArrayList arrayList = new ArrayList();
        if (1 == i) {
            arrayList.addAll(C22794b.m56154a(cVar.f61071a, true, i2, i3));
        } else if (4 == i) {
            arrayList.addAll(C22794b.m56155b(cVar.f61071a, i2, i3));
        } else if (3 == i) {
            arrayList.addAll(C22794b.m56154a(cVar.f61071a, false, i2, i3));
        } else if (2 == i) {
            arrayList.addAll(C22794b.m56153a(cVar.f61071a, i2, i3));
        } else if (i == 0) {
            arrayList.addAll(C22794b.m56155b(cVar.f61071a, i2, i3));
            arrayList.addAll(C22794b.m56154a(cVar.f61071a, true, i2, i3));
            Collections.sort(arrayList);
        }
        return arrayList;
    }
}
