package com.bytedance.lighten.loader;

import com.facebook.fresco.animation.p947a.C13857a;
import com.facebook.fresco.animation.p954d.C13884a;

/* renamed from: com.bytedance.lighten.loader.f */
final class C12226f implements C13884a {

    /* renamed from: a */
    final C13857a f32312a;

    /* renamed from: b */
    public int f32313b = -1;

    /* renamed from: c */
    private long f32314c = -1;

    /* renamed from: d */
    private int f32315d;

    /* renamed from: e */
    private long f32316e = -1;

    /* renamed from: f */
    private long f32317f = -1;

    /* renamed from: g */
    private int[] f32318g;

    /* renamed from: b */
    private boolean m24697b() {
        if (this.f32312a.mo26006e() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final long mo23161a() {
        if (this.f32314c != -1) {
            return this.f32314c;
        }
        this.f32314c = 0;
        for (int a : this.f32318g) {
            this.f32314c += (long) m24696a(a);
        }
        return this.f32314c;
    }

    /* renamed from: a */
    private int m24696a(int i) {
        if (i >= this.f32312a.mo26005d()) {
            return this.f32312a.mo26004c(0);
        }
        return this.f32312a.mo26004c(i);
    }

    /* renamed from: a */
    public final long mo23162a(long j) {
        if (mo23161a() == 0) {
            return -1;
        }
        if (!m24697b() && this.f32315d >= this.f32312a.mo26006e()) {
            return -1;
        }
        long a = (long) m24696a(this.f32318g[this.f32313b]);
        long j2 = this.f32316e + a;
        if (j2 >= j) {
            return j2;
        }
        return j + a;
    }

    public C12226f(C13857a aVar, int[] iArr) {
        this.f32312a = aVar;
        this.f32318g = iArr;
    }

    /* renamed from: a */
    public final int mo23160a(long j, long j2) {
        if (!m24697b() && j / mo23161a() >= ((long) this.f32312a.mo26006e())) {
            return -1;
        }
        long j3 = 0;
        int i = 0;
        do {
            j3 += (long) m24696a(this.f32318g[i]);
            i++;
        } while (j % mo23161a() >= j3);
        int i2 = i - 1;
        if (this.f32313b == -1 || j2 != this.f32317f) {
            this.f32316e = j;
            this.f32317f = j;
            this.f32313b = i2;
            return this.f32318g[i2];
        }
        this.f32317f = j;
        if (this.f32316e + ((long) m24696a(this.f32318g[this.f32313b])) > j) {
            return this.f32318g[this.f32313b];
        }
        this.f32316e = j;
        int i3 = this.f32313b + 1;
        if (i3 >= this.f32318g.length) {
            this.f32315d++;
            i3 = 0;
        }
        if (!this.f32312a.mo26002b(this.f32318g[i3])) {
            return this.f32318g[this.f32313b];
        }
        this.f32313b = i3;
        return this.f32318g[this.f32313b];
    }
}
