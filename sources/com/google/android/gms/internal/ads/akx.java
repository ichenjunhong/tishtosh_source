package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class akx implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40805a;

    /* renamed from: b */
    private final /* synthetic */ String f40806b;

    /* renamed from: c */
    private final /* synthetic */ long f40807c;

    /* renamed from: d */
    private final /* synthetic */ long f40808d;

    /* renamed from: e */
    private final /* synthetic */ boolean f40809e;

    /* renamed from: f */
    private final /* synthetic */ int f40810f;

    /* renamed from: g */
    private final /* synthetic */ int f40811g;

    /* renamed from: h */
    private final /* synthetic */ akt f40812h;

    akx(akt akt, String str, String str2, long j, long j2, boolean z, int i, int i2) {
        this.f40812h = akt;
        this.f40805a = str;
        this.f40806b = str2;
        this.f40807c = j;
        this.f40808d = j2;
        this.f40809e = z;
        this.f40810f = i;
        this.f40811g = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f40805a);
        hashMap.put("cachedSrc", this.f40806b);
        hashMap.put("bufferedDuration", Long.toString(this.f40807c));
        hashMap.put("totalDuration", Long.toString(this.f40808d));
        hashMap.put("cacheReady", this.f40809e ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f40810f));
        hashMap.put("playerPreparedCount", Integer.toString(this.f40811g));
        akt.m33179a(this.f40812h, "onPrecacheEvent", (Map) hashMap);
    }
}
