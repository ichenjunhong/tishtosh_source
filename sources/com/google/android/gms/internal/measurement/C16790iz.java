package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16736hd.C16741e;

/* renamed from: com.google.android.gms.internal.measurement.iz */
final class C16790iz implements C16773ii {

    /* renamed from: a */
    public final String f47176a;

    /* renamed from: b */
    public final Object[] f47177b;

    /* renamed from: c */
    private final C16775ik f47178c;

    /* renamed from: d */
    private final int f47179d;

    C16790iz(C16775ik ikVar, String str, Object[] objArr) {
        this.f47178c = ikVar;
        this.f47176a = str;
        this.f47177b = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f47179d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f47179d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: c */
    public final C16775ik mo32296c() {
        return this.f47178c;
    }

    /* renamed from: a */
    public final int mo32294a() {
        return (this.f47179d & 1) == 1 ? C16741e.f47097h : C16741e.f47098i;
    }

    /* renamed from: b */
    public final boolean mo32295b() {
        return (this.f47179d & 2) == 2;
    }
}
