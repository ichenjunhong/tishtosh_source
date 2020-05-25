package com.bytedance.android.live.core.performance;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.core.performance.f */
final /* synthetic */ class C3981f implements Runnable {

    /* renamed from: a */
    private final C39773 f11102a;

    /* renamed from: b */
    private final ArrayList f11103b;

    /* renamed from: c */
    private final String f11104c;

    /* renamed from: d */
    private final HashMap f11105d;

    C3981f(C39773 r1, ArrayList arrayList, String str, HashMap hashMap) {
        this.f11102a = r1;
        this.f11103b = arrayList;
        this.f11104c = str;
        this.f11105d = hashMap;
    }

    public final void run() {
        C39773 r0 = this.f11102a;
        C3974b.this.mo9380a(this.f11103b, this.f11104c, "fps", this.f11105d);
    }
}
