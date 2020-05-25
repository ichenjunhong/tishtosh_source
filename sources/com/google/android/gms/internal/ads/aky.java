package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class aky implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40813a;

    /* renamed from: b */
    private final /* synthetic */ String f40814b;

    /* renamed from: c */
    private final /* synthetic */ int f40815c;

    /* renamed from: d */
    private final /* synthetic */ int f40816d;

    /* renamed from: e */
    private final /* synthetic */ long f40817e;

    /* renamed from: f */
    private final /* synthetic */ long f40818f;

    /* renamed from: g */
    private final /* synthetic */ boolean f40819g;

    /* renamed from: h */
    private final /* synthetic */ int f40820h;

    /* renamed from: i */
    private final /* synthetic */ int f40821i;

    /* renamed from: j */
    private final /* synthetic */ akt f40822j;

    aky(akt akt, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f40822j = akt;
        this.f40813a = str;
        this.f40814b = str2;
        this.f40815c = i;
        this.f40816d = i2;
        this.f40817e = j;
        this.f40818f = j2;
        this.f40819g = z;
        this.f40820h = i3;
        this.f40821i = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f40813a);
        hashMap.put("cachedSrc", this.f40814b);
        hashMap.put("bytesLoaded", Integer.toString(this.f40815c));
        hashMap.put("totalBytes", Integer.toString(this.f40816d));
        hashMap.put("bufferedDuration", Long.toString(this.f40817e));
        hashMap.put("totalDuration", Long.toString(this.f40818f));
        hashMap.put("cacheReady", this.f40819g ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f40820h));
        hashMap.put("playerPreparedCount", Integer.toString(this.f40821i));
        akt.m33179a(this.f40822j, "onPrecacheEvent", (Map) hashMap);
    }
}
