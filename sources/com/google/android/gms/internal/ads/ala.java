package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class ala implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40827a;

    /* renamed from: b */
    private final /* synthetic */ String f40828b;

    /* renamed from: c */
    private final /* synthetic */ long f40829c;

    /* renamed from: d */
    private final /* synthetic */ akt f40830d;

    ala(akt akt, String str, String str2, long j) {
        this.f40830d = akt;
        this.f40827a = str;
        this.f40828b = str2;
        this.f40829c = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f40827a);
        hashMap.put("cachedSrc", this.f40828b);
        hashMap.put("totalDuration", Long.toString(this.f40829c));
        akt.m33179a(this.f40830d, "onPrecacheEvent", (Map) hashMap);
    }
}
