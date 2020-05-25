package com.p683ss.android.vesdk;

/* renamed from: com.ss.android.vesdk.ab */
public final class C50592ab {

    /* renamed from: a */
    private String f126848a = "VEPerformanceUtils";

    /* renamed from: b */
    private volatile long f126849b;

    /* renamed from: c */
    private volatile long f126850c;

    /* renamed from: d */
    private volatile boolean f126851d;

    /* renamed from: e */
    private boolean f126852e = true;

    /* renamed from: com.ss.android.vesdk.ab$a */
    public enum C50593a {
        STATUS_DISABLED,
        STATUS_OK,
        STATUS_MARKED
    }

    /* renamed from: a */
    public final C50593a mo98738a() {
        if (!this.f126852e) {
            return C50593a.STATUS_DISABLED;
        }
        this.f126851d = true;
        this.f126850c = System.currentTimeMillis();
        return C50593a.STATUS_OK;
    }

    public C50592ab(String str) {
        this.f126848a = str;
    }

    /* renamed from: a */
    public final long mo98737a(String str) {
        if (!this.f126852e) {
            return 0;
        }
        this.f126849b = System.currentTimeMillis();
        long j = this.f126849b - this.f126850c;
        String str2 = this.f126848a;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" cost ");
        sb.append(j);
        sb.append("ms");
        C50792y.m109909a(str2, sb.toString());
        this.f126850c = this.f126849b;
        return j;
    }
}
