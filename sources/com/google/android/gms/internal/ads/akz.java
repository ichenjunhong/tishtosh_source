package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

final class akz implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40823a;

    /* renamed from: b */
    private final /* synthetic */ String f40824b;

    /* renamed from: c */
    private final /* synthetic */ int f40825c;

    /* renamed from: d */
    private final /* synthetic */ akt f40826d;

    akz(akt akt, String str, String str2, int i) {
        this.f40826d = akt;
        this.f40823a = str;
        this.f40824b = str2;
        this.f40825c = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f40823a);
        hashMap.put("cachedSrc", this.f40824b);
        hashMap.put("totalBytes", Integer.toString(this.f40825c));
        akt.m33179a(this.f40826d, "onPrecacheEvent", (Map) hashMap);
    }
}
