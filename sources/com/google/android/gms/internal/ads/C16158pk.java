package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.C15050a;
import java.util.Date;
import java.util.Set;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.pk */
public final class C16158pk implements C15050a {

    /* renamed from: a */
    private final Date f45391a;

    /* renamed from: b */
    private final int f45392b;

    /* renamed from: c */
    private final Set<String> f45393c;

    /* renamed from: d */
    private final boolean f45394d;

    /* renamed from: e */
    private final Location f45395e;

    /* renamed from: f */
    private final int f45396f;

    /* renamed from: g */
    private final boolean f45397g;

    /* renamed from: h */
    private final int f45398h;

    /* renamed from: i */
    private final String f45399i;

    public C16158pk(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f45391a = date;
        this.f45392b = i;
        this.f45393c = set;
        this.f45395e = location;
        this.f45394d = z;
        this.f45396f = i2;
        this.f45397g = z2;
        this.f45398h = i3;
        this.f45399i = str;
    }

    /* renamed from: a */
    public final Date mo27748a() {
        return this.f45391a;
    }

    /* renamed from: b */
    public final int mo27749b() {
        return this.f45392b;
    }

    /* renamed from: c */
    public final Set<String> mo27750c() {
        return this.f45393c;
    }

    /* renamed from: d */
    public final Location mo27751d() {
        return this.f45395e;
    }

    /* renamed from: f */
    public final boolean mo27753f() {
        return this.f45394d;
    }

    /* renamed from: e */
    public final int mo27752e() {
        return this.f45396f;
    }

    /* renamed from: g */
    public final boolean mo27754g() {
        return this.f45397g;
    }
}
