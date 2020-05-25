package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.arch.lifecycle.C0198r;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.an */
public final class C43502an {

    /* renamed from: a */
    static int f110022a;

    /* renamed from: b */
    static int f110023b = 100;

    /* renamed from: c */
    public static C0198r<Integer> f110024c = new C0198r<>();

    /* renamed from: d */
    public static final C43502an f110025d = new C43502an();

    /* renamed from: e */
    private static C0198r<Integer> f110026e = new C0198r<>();

    private C43502an() {
    }

    /* renamed from: a */
    public static C0198r<Integer> m95361a() {
        return f110026e;
    }

    /* renamed from: c */
    public static int m95363c() {
        return f110023b;
    }

    /* renamed from: b */
    public static int m95362b() {
        int i = f110022a + 1;
        f110022a = i;
        if (i > f110023b) {
            f110023b += 50;
            f110024c.setValue(Integer.valueOf(f110023b));
        }
        return f110022a;
    }
}
