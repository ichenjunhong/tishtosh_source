package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class akv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40791a;

    /* renamed from: b */
    private final /* synthetic */ String f40792b;

    /* renamed from: c */
    private final /* synthetic */ int f40793c;

    /* renamed from: d */
    private final /* synthetic */ int f40794d;

    /* renamed from: e */
    private final /* synthetic */ boolean f40795e;

    /* renamed from: f */
    private final /* synthetic */ int f40796f;

    /* renamed from: g */
    private final /* synthetic */ int f40797g;

    /* renamed from: h */
    private final /* synthetic */ akt f40798h;

    akv(akt akt, String str, String str2, int i, int i2, boolean z, int i3, int i4) {
        this.f40798h = akt;
        this.f40791a = str;
        this.f40792b = str2;
        this.f40793c = i;
        this.f40795e = z;
        this.f40796f = i3;
        this.f40797g = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f40791a);
        hashMap.put("cachedSrc", this.f40792b);
        hashMap.put("bytesLoaded", Integer.toString(this.f40793c));
        hashMap.put("totalBytes", Integer.toString(this.f40794d));
        hashMap.put("cacheReady", this.f40795e ? "1" : "0");
        hashMap.put("playerCount", Integer.toString(this.f40796f));
        hashMap.put("playerPreparedCount", Integer.toString(this.f40797g));
        akt.m33179a(this.f40798h, "onPrecacheEvent", (Map) hashMap);
    }
}
