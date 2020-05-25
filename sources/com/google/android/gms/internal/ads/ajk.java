package com.google.android.gms.internal.ads;

final /* synthetic */ class ajk implements Runnable {

    /* renamed from: a */
    private final ajh f40689a;

    /* renamed from: b */
    private final String f40690b;

    ajk(ajh ajh, String str) {
        this.f40689a = ajh;
        this.f40690b = str;
    }

    public final void run() {
        ajh ajh = this.f40689a;
        String str = this.f40690b;
        if (ajh.f40668d != null) {
            ajh.f40668d.mo28878a("ExoPlayerAdapter error", str);
        }
    }
}
