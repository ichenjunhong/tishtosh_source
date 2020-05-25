package com.p683ss.android.ugc.aweme.protection.antiaddiction.p2094a;

import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40849c;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.a.a */
public final class C40840a {

    /* renamed from: a */
    public int f103988a;

    /* renamed from: b */
    public int f103989b;

    /* renamed from: c */
    public int f103990c;

    /* renamed from: d */
    private String f103991d;

    public C40840a() {
        this("05:00");
    }

    /* renamed from: a */
    public static C23051bf<Long> m90320a() {
        return SharePrefCache.inst().getLastHintToastTime();
    }

    /* renamed from: b */
    public static long m90321b() {
        return C40849c.m90331a().mo83178b();
    }

    private C40840a(String str) {
        this.f103991d = str;
        try {
            String[] split = this.f103991d.split(":");
            this.f103988a = Integer.parseInt(split[0]);
            this.f103989b = Integer.parseInt(split[1]);
        } catch (Exception unused) {
            this.f103988a = 5;
            this.f103989b = 0;
        }
        this.f103990c = 0;
    }
}
