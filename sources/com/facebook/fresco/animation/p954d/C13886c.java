package com.facebook.fresco.animation.p954d;

import com.facebook.fresco.animation.p947a.C13857a;

/* renamed from: com.facebook.fresco.animation.d.c */
public final class C13886c implements C13884a {

    /* renamed from: a */
    private final C13857a f36218a;

    /* renamed from: b */
    private long f36219b = -1;

    /* renamed from: c */
    private int f36220c;

    /* renamed from: d */
    private int f36221d = -1;

    /* renamed from: e */
    private long f36222e = -1;

    /* renamed from: f */
    private long f36223f = -1;

    /* renamed from: b */
    private boolean m28289b() {
        if (this.f36218a.mo26006e() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final long mo23161a() {
        if (this.f36219b != -1) {
            return this.f36219b;
        }
        this.f36219b = 0;
        int d = this.f36218a.mo26005d();
        for (int i = 0; i < d; i++) {
            this.f36219b += (long) this.f36218a.mo26004c(i);
        }
        return this.f36219b;
    }

    public C13886c(C13857a aVar) {
        this.f36218a = aVar;
    }

    /* renamed from: a */
    public final long mo23162a(long j) {
        if (mo23161a() == 0) {
            return -1;
        }
        if (!m28289b() && this.f36220c >= this.f36218a.mo26006e()) {
            return -1;
        }
        long c = (long) this.f36218a.mo26004c(this.f36221d);
        long j2 = this.f36222e + c;
        if (j2 >= j) {
            return j2;
        }
        return j + c;
    }

    /* renamed from: a */
    public final int mo23160a(long j, long j2) {
        if (!m28289b() && j / mo23161a() >= ((long) this.f36218a.mo26006e())) {
            return -1;
        }
        long j3 = 0;
        int i = 0;
        do {
            j3 += (long) this.f36218a.mo26004c(i);
            i++;
        } while (j % mo23161a() >= j3);
        int i2 = i - 1;
        if (this.f36221d == -1 || j2 != this.f36223f) {
            this.f36222e = j;
            this.f36223f = j;
            this.f36221d = i2;
            return i2;
        }
        this.f36223f = j;
        if (this.f36222e + ((long) this.f36218a.mo26004c(this.f36221d)) > j) {
            return this.f36221d;
        }
        this.f36222e = j;
        int i3 = this.f36221d + 1;
        if (i3 >= this.f36218a.mo26005d()) {
            this.f36220c++;
            i3 = 0;
        }
        if (!this.f36218a.mo26002b(i3)) {
            return this.f36221d;
        }
        this.f36221d = i3;
        return this.f36221d;
    }
}
