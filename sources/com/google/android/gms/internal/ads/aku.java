package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class aku implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40785a;

    /* renamed from: b */
    private final /* synthetic */ String f40786b;

    /* renamed from: c */
    private final /* synthetic */ int f40787c;

    /* renamed from: d */
    private final /* synthetic */ int f40788d;

    /* renamed from: e */
    private final /* synthetic */ boolean f40789e;

    /* renamed from: f */
    private final /* synthetic */ akt f40790f;

    aku(akt akt, String str, String str2, int i, int i2, boolean z) {
        this.f40790f = akt;
        this.f40785a = str;
        this.f40786b = str2;
        this.f40787c = i;
        this.f40788d = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f40785a);
        hashMap.put("cachedSrc", this.f40786b);
        hashMap.put("bytesLoaded", Integer.toString(this.f40787c));
        hashMap.put("totalBytes", Integer.toString(this.f40788d));
        hashMap.put("cacheReady", this.f40789e ? "1" : "0");
        akt.m33179a(this.f40790f, "onPrecacheEvent", (Map) hashMap);
    }
}
