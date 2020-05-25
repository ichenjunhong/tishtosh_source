package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class akw implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40799a;

    /* renamed from: b */
    private final /* synthetic */ String f40800b;

    /* renamed from: c */
    private final /* synthetic */ long f40801c;

    /* renamed from: d */
    private final /* synthetic */ long f40802d;

    /* renamed from: e */
    private final /* synthetic */ boolean f40803e;

    /* renamed from: f */
    private final /* synthetic */ akt f40804f;

    akw(akt akt, String str, String str2, long j, long j2, boolean z) {
        this.f40804f = akt;
        this.f40799a = str;
        this.f40800b = str2;
        this.f40801c = j;
        this.f40802d = j2;
        this.f40803e = z;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f40799a);
        hashMap.put("cachedSrc", this.f40800b);
        hashMap.put("bufferedDuration", Long.toString(this.f40801c));
        hashMap.put("totalDuration", Long.toString(this.f40802d));
        hashMap.put("cacheReady", this.f40803e ? "1" : "0");
        akt.m33179a(this.f40804f, "onPrecacheEvent", (Map) hashMap);
    }
}
