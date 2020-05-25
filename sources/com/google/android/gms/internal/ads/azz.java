package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz.C15675e;

final class azz implements azh {

    /* renamed from: a */
    public final String f41695a;

    /* renamed from: b */
    public final Object[] f41696b;

    /* renamed from: c */
    private final azj f41697c;

    /* renamed from: d */
    private final int f41698d;

    azz(azj azj, String str, Object[] objArr) {
        this.f41697c = azj;
        this.f41695a = str;
        this.f41696b = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f41698d = charAt;
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
                this.f41698d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: c */
    public final azj mo29891c() {
        return this.f41697c;
    }

    /* renamed from: a */
    public final int mo29889a() {
        return (this.f41698d & 1) == 1 ? C15675e.f41616h : C15675e.f41617i;
    }

    /* renamed from: b */
    public final boolean mo29890b() {
        return (this.f41698d & 2) == 2;
    }
}
