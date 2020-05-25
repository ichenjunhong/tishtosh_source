package com.bytedance.android.live.core.performance;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.core.performance.e */
final /* synthetic */ class C3980e implements Runnable {

    /* renamed from: a */
    private final C39762 f11098a;

    /* renamed from: b */
    private final ArrayList f11099b;

    /* renamed from: c */
    private final String f11100c;

    /* renamed from: d */
    private final HashMap f11101d;

    C3980e(C39762 r1, ArrayList arrayList, String str, HashMap hashMap) {
        this.f11098a = r1;
        this.f11099b = arrayList;
        this.f11100c = str;
        this.f11101d = hashMap;
    }

    public final void run() {
        C39762 r0 = this.f11098a;
        ArrayList arrayList = this.f11099b;
        String str = this.f11100c;
        HashMap hashMap = this.f11101d;
        if (C3974b.m10060a(arrayList) != ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            C3974b.this.mo9380a(arrayList, str, "cpu", hashMap);
        }
    }
}
