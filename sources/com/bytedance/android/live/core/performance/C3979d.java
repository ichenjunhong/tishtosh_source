package com.bytedance.android.live.core.performance;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.core.performance.d */
final /* synthetic */ class C3979d implements Runnable {

    /* renamed from: a */
    private final C39751 f11094a;

    /* renamed from: b */
    private final ArrayList f11095b;

    /* renamed from: c */
    private final String f11096c;

    /* renamed from: d */
    private final HashMap f11097d;

    C3979d(C39751 r1, ArrayList arrayList, String str, HashMap hashMap) {
        this.f11094a = r1;
        this.f11095b = arrayList;
        this.f11096c = str;
        this.f11097d = hashMap;
    }

    public final void run() {
        C39751 r0 = this.f11094a;
        C3974b.this.mo9380a(this.f11095b, this.f11096c, "mem", this.f11097d);
    }
}
