package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.List;

@C16299uq
public final class zzyv extends AbstractSafeParcelable {
    public static final Creator<zzyv> CREATOR = new bzt();

    /* renamed from: a */
    public final int f46317a;

    /* renamed from: b */
    public final long f46318b;

    /* renamed from: c */
    public final Bundle f46319c;

    /* renamed from: d */
    public final int f46320d;

    /* renamed from: e */
    public final List<String> f46321e;

    /* renamed from: f */
    public final boolean f46322f;

    /* renamed from: g */
    public final int f46323g;

    /* renamed from: h */
    public final boolean f46324h;

    /* renamed from: i */
    public final String f46325i;

    /* renamed from: j */
    public final zzacm f46326j;

    /* renamed from: k */
    public final Location f46327k;

    /* renamed from: l */
    public final String f46328l;

    /* renamed from: m */
    public final Bundle f46329m;

    /* renamed from: n */
    public final Bundle f46330n;

    /* renamed from: o */
    public final List<String> f46331o;

    /* renamed from: p */
    public final String f46332p;

    /* renamed from: q */
    public final String f46333q;

    /* renamed from: r */
    public final boolean f46334r;

    /* renamed from: s */
    public final zzyp f46335s;

    /* renamed from: t */
    public final int f46336t;

    /* renamed from: u */
    public final String f46337u;

    public zzyv(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzacm zzacm, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, zzyp zzyp, int i4, String str5) {
        this.f46317a = i;
        this.f46318b = j;
        this.f46319c = bundle == null ? new Bundle() : bundle;
        this.f46320d = i2;
        this.f46321e = list;
        this.f46322f = z;
        this.f46323g = i3;
        this.f46324h = z2;
        this.f46325i = str;
        this.f46326j = zzacm;
        this.f46327k = location;
        this.f46328l = str2;
        this.f46329m = bundle2 == null ? new Bundle() : bundle2;
        this.f46330n = bundle3;
        this.f46331o = list2;
        this.f46332p = str3;
        this.f46333q = str4;
        this.f46334r = z3;
        this.f46335s = zzyp;
        this.f46336t = i4;
        this.f46337u = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46317a);
        C15469b.m32180a(parcel, 2, this.f46318b);
        C15469b.m32181a(parcel, 3, this.f46319c, false);
        C15469b.m32195b(parcel, 4, this.f46320d);
        C15469b.m32188a(parcel, 5, this.f46321e, false);
        C15469b.m32189a(parcel, 6, this.f46322f);
        C15469b.m32195b(parcel, 7, this.f46323g);
        C15469b.m32189a(parcel, 8, this.f46324h);
        C15469b.m32187a(parcel, 9, this.f46325i, false);
        C15469b.m32183a(parcel, 10, (Parcelable) this.f46326j, i, false);
        C15469b.m32183a(parcel, 11, (Parcelable) this.f46327k, i, false);
        C15469b.m32187a(parcel, 12, this.f46328l, false);
        C15469b.m32181a(parcel, 13, this.f46329m, false);
        C15469b.m32181a(parcel, 14, this.f46330n, false);
        C15469b.m32188a(parcel, 15, this.f46331o, false);
        C15469b.m32187a(parcel, 16, this.f46332p, false);
        C15469b.m32187a(parcel, 17, this.f46333q, false);
        C15469b.m32189a(parcel, 18, this.f46334r);
        C15469b.m32183a(parcel, 19, (Parcelable) this.f46335s, i, false);
        C15469b.m32195b(parcel, 20, this.f46336t);
        C15469b.m32187a(parcel, 21, this.f46337u, false);
        C15469b.m32197c(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzyv)) {
            return false;
        }
        zzyv zzyv = (zzyv) obj;
        if (this.f46317a != zzyv.f46317a || this.f46318b != zzyv.f46318b || !C15462p.m32120a(this.f46319c, zzyv.f46319c) || this.f46320d != zzyv.f46320d || !C15462p.m32120a(this.f46321e, zzyv.f46321e) || this.f46322f != zzyv.f46322f || this.f46323g != zzyv.f46323g || this.f46324h != zzyv.f46324h || !C15462p.m32120a(this.f46325i, zzyv.f46325i) || !C15462p.m32120a(this.f46326j, zzyv.f46326j) || !C15462p.m32120a(this.f46327k, zzyv.f46327k) || !C15462p.m32120a(this.f46328l, zzyv.f46328l) || !C15462p.m32120a(this.f46329m, zzyv.f46329m) || !C15462p.m32120a(this.f46330n, zzyv.f46330n) || !C15462p.m32120a(this.f46331o, zzyv.f46331o) || !C15462p.m32120a(this.f46332p, zzyv.f46332p) || !C15462p.m32120a(this.f46333q, zzyv.f46333q) || this.f46334r != zzyv.f46334r || this.f46336t != zzyv.f46336t || !C15462p.m32120a(this.f46337u, zzyv.f46337u)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f46317a), Long.valueOf(this.f46318b), this.f46319c, Integer.valueOf(this.f46320d), this.f46321e, Boolean.valueOf(this.f46322f), Integer.valueOf(this.f46323g), Boolean.valueOf(this.f46324h), this.f46325i, this.f46326j, this.f46327k, this.f46328l, this.f46329m, this.f46330n, this.f46331o, this.f46332p, this.f46333q, Boolean.valueOf(this.f46334r), Integer.valueOf(this.f46336t), this.f46337u);
    }

    /* renamed from: a */
    public final zzyv mo31643a() {
        Bundle bundle = this.f46329m.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle == null) {
            bundle = this.f46319c;
            this.f46329m.putBundle("com.google.ads.mediation.admob.AdMobAdapter", this.f46319c);
        }
        zzyv zzyv = new zzyv(this.f46317a, this.f46318b, bundle, this.f46320d, this.f46321e, this.f46322f, this.f46323g, this.f46324h, this.f46325i, this.f46326j, this.f46327k, this.f46328l, this.f46329m, this.f46330n, this.f46331o, this.f46332p, this.f46333q, this.f46334r, this.f46335s, this.f46336t, this.f46337u);
        return zzyv;
    }
}
