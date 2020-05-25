package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@C16299uq
public final class zzaxe extends AbstractSafeParcelable {
    public static final Creator<zzaxe> CREATOR = new C16325vp();

    /* renamed from: A */
    public final long f46097A;

    /* renamed from: B */
    public final String f46098B;

    /* renamed from: C */
    public final float f46099C;

    /* renamed from: D */
    public final int f46100D;

    /* renamed from: E */
    public final int f46101E;

    /* renamed from: F */
    public final boolean f46102F;

    /* renamed from: G */
    public final boolean f46103G;

    /* renamed from: H */
    public final String f46104H;

    /* renamed from: I */
    public final boolean f46105I;

    /* renamed from: J */
    public final String f46106J;

    /* renamed from: K */
    public final boolean f46107K;

    /* renamed from: L */
    public final int f46108L;

    /* renamed from: M */
    public final Bundle f46109M;

    /* renamed from: N */
    public final String f46110N;

    /* renamed from: O */
    public final zzabp f46111O;

    /* renamed from: P */
    public final boolean f46112P;

    /* renamed from: Q */
    public final Bundle f46113Q;

    /* renamed from: R */
    public final String f46114R;

    /* renamed from: S */
    public final String f46115S;

    /* renamed from: T */
    public final String f46116T;

    /* renamed from: U */
    public final boolean f46117U;

    /* renamed from: V */
    public final List<Integer> f46118V;

    /* renamed from: W */
    public final String f46119W;

    /* renamed from: X */
    public final List<String> f46120X;

    /* renamed from: Y */
    public final int f46121Y;

    /* renamed from: Z */
    public final boolean f46122Z;

    /* renamed from: a */
    public final int f46123a;

    /* renamed from: aa */
    public final boolean f46124aa;

    /* renamed from: ab */
    public final boolean f46125ab;

    /* renamed from: ac */
    public final ArrayList<String> f46126ac;

    /* renamed from: ad */
    public final String f46127ad;

    /* renamed from: ae */
    public final zzaks f46128ae;

    /* renamed from: af */
    public final String f46129af;

    /* renamed from: ag */
    public final Bundle f46130ag;

    /* renamed from: b */
    public final Bundle f46131b;

    /* renamed from: c */
    public final zzyv f46132c;

    /* renamed from: d */
    public final zzyz f46133d;

    /* renamed from: e */
    public final String f46134e;

    /* renamed from: f */
    public final ApplicationInfo f46135f;

    /* renamed from: g */
    public final PackageInfo f46136g;

    /* renamed from: h */
    public final String f46137h;

    /* renamed from: i */
    public final String f46138i;

    /* renamed from: j */
    public final String f46139j;

    /* renamed from: k */
    public final zzbgz f46140k;

    /* renamed from: l */
    public final Bundle f46141l;

    /* renamed from: m */
    public final int f46142m;

    /* renamed from: n */
    public final List<String> f46143n;

    /* renamed from: o */
    public final Bundle f46144o;

    /* renamed from: p */
    public final boolean f46145p;

    /* renamed from: q */
    public final int f46146q;

    /* renamed from: r */
    public final int f46147r;

    /* renamed from: s */
    public final float f46148s;

    /* renamed from: t */
    public final String f46149t;

    /* renamed from: u */
    public final long f46150u;

    /* renamed from: v */
    public final String f46151v;

    /* renamed from: w */
    public final List<String> f46152w;

    /* renamed from: x */
    public final String f46153x;

    /* renamed from: y */
    public final zzafl f46154y;

    /* renamed from: z */
    public final List<String> f46155z;

    private zzaxe(Bundle bundle, zzyv zzyv, zzyz zzyz, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzbgz zzbgz, Bundle bundle2, int i, List<String> list, List<String> list2, Bundle bundle3, boolean z, int i2, int i3, float f, String str5, long j, String str6, List<String> list3, String str7, zzafl zzafl, long j2, String str8, float f2, boolean z2, int i4, int i5, boolean z3, boolean z4, String str9, String str10, boolean z5, int i6, Bundle bundle4, String str11, zzabp zzabp, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i7, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzaks zzaks, String str17, Bundle bundle6) {
        this(24, bundle, zzyv, zzyz, str, applicationInfo, packageInfo, str2, str3, str4, zzbgz, bundle2, i, list, bundle3, z, i2, i3, f, str5, j, str6, list3, str7, zzafl, list2, j2, str8, f2, z2, i4, i5, z3, z4, str9, str10, z5, i6, bundle4, str11, zzabp, z6, bundle5, str12, str13, str14, z7, list4, str15, list5, i7, z8, z9, z10, arrayList, str16, zzaks, str17, bundle6);
    }

    public zzaxe(C16324vo voVar, long j, String str, String str2, String str3, String str4) {
        C16324vo voVar2 = voVar;
        long j2 = j;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        Bundle bundle = voVar2.f45759a;
        zzyv zzyv = voVar2.f45761b;
        zzyz zzyz = voVar2.f45762c;
        this(bundle, zzyv, zzyz, voVar2.f45763d, voVar2.f45764e, voVar2.f45765f, (String) afp.m32825a(voVar2.f45749Q, ""), voVar2.f45766g, voVar2.f45767h, voVar2.f45769j, voVar2.f45768i, voVar2.f45770k, voVar2.f45771l, voVar2.f45772m, voVar2.f45774o, voVar2.f45775p, voVar2.f45776q, voVar2.f45777r, voVar2.f45778s, voVar2.f45779t, voVar2.f45780u, voVar2.f45781v, voVar2.f45782w, voVar2.f45783x, voVar2.f45784y, j2, voVar2.f45785z, voVar2.f45733A, voVar2.f45734B, voVar2.f45735C, voVar2.f45736D, voVar2.f45737E, voVar2.f45738F, (String) afp.m32826a(voVar2.f45739G, "", 1, TimeUnit.SECONDS), voVar2.f45740H, voVar2.f45741I, voVar2.f45742J, voVar2.f45743K, voVar2.f45744L, voVar2.f45745M, voVar2.f45746N, voVar2.f45747O, str5, str6, str7, voVar2.f45748P, voVar2.f45750R, voVar2.f45751S, voVar2.f45773n, voVar2.f45752T, voVar2.f45753U, voVar2.f45754V, voVar2.f45755W, voVar2.f45756X, voVar2.f45757Y, voVar2.f45758Z, str8, voVar2.f45760aa);
    }

    zzaxe(int i, Bundle bundle, zzyv zzyv, zzyz zzyz, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzbgz zzbgz, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzafl zzafl, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, boolean z4, String str9, String str10, boolean z5, int i7, Bundle bundle4, String str11, zzabp zzabp, boolean z6, Bundle bundle5, String str12, String str13, String str14, boolean z7, List<Integer> list4, String str15, List<String> list5, int i8, boolean z8, boolean z9, boolean z10, ArrayList<String> arrayList, String str16, zzaks zzaks, String str17, Bundle bundle6) {
        List<String> list6;
        List<String> list7;
        this.f46123a = i;
        this.f46131b = bundle;
        this.f46132c = zzyv;
        this.f46133d = zzyz;
        this.f46134e = str;
        this.f46135f = applicationInfo;
        this.f46136g = packageInfo;
        this.f46137h = str2;
        this.f46138i = str3;
        this.f46139j = str4;
        this.f46140k = zzbgz;
        this.f46141l = bundle2;
        this.f46142m = i2;
        this.f46143n = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.f46155z = list6;
        this.f46144o = bundle3;
        this.f46145p = z;
        this.f46146q = i3;
        this.f46147r = i4;
        this.f46148s = f;
        this.f46149t = str5;
        this.f46150u = j;
        this.f46151v = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.f46152w = list7;
        this.f46153x = str7;
        this.f46154y = zzafl;
        this.f46097A = j2;
        this.f46098B = str8;
        this.f46099C = f2;
        this.f46105I = z2;
        this.f46100D = i5;
        this.f46101E = i6;
        this.f46102F = z3;
        this.f46103G = z4;
        this.f46104H = str9;
        this.f46106J = str10;
        this.f46107K = z5;
        this.f46108L = i7;
        this.f46109M = bundle4;
        this.f46110N = str11;
        this.f46111O = zzabp;
        this.f46112P = z6;
        this.f46113Q = bundle5;
        this.f46114R = str12;
        this.f46115S = str13;
        this.f46116T = str14;
        this.f46117U = z7;
        this.f46118V = list4;
        this.f46119W = str15;
        this.f46120X = list5;
        this.f46121Y = i8;
        this.f46122Z = z8;
        this.f46124aa = z9;
        this.f46125ab = z10;
        this.f46126ac = arrayList;
        this.f46127ad = str16;
        this.f46128ae = zzaks;
        this.f46129af = str17;
        this.f46130ag = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46123a);
        C15469b.m32181a(parcel, 2, this.f46131b, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f46132c, i, false);
        C15469b.m32183a(parcel, 4, (Parcelable) this.f46133d, i, false);
        C15469b.m32187a(parcel, 5, this.f46134e, false);
        C15469b.m32183a(parcel, 6, (Parcelable) this.f46135f, i, false);
        C15469b.m32183a(parcel, 7, (Parcelable) this.f46136g, i, false);
        C15469b.m32187a(parcel, 8, this.f46137h, false);
        C15469b.m32187a(parcel, 9, this.f46138i, false);
        C15469b.m32187a(parcel, 10, this.f46139j, false);
        C15469b.m32183a(parcel, 11, (Parcelable) this.f46140k, i, false);
        C15469b.m32181a(parcel, 12, this.f46141l, false);
        C15469b.m32195b(parcel, 13, this.f46142m);
        C15469b.m32188a(parcel, 14, this.f46143n, false);
        C15469b.m32181a(parcel, 15, this.f46144o, false);
        C15469b.m32189a(parcel, 16, this.f46145p);
        C15469b.m32195b(parcel, 18, this.f46146q);
        C15469b.m32195b(parcel, 19, this.f46147r);
        C15469b.m32178a(parcel, 20, this.f46148s);
        C15469b.m32187a(parcel, 21, this.f46149t, false);
        C15469b.m32180a(parcel, 25, this.f46150u);
        C15469b.m32187a(parcel, 26, this.f46151v, false);
        C15469b.m32188a(parcel, 27, this.f46152w, false);
        C15469b.m32187a(parcel, 28, this.f46153x, false);
        C15469b.m32183a(parcel, 29, (Parcelable) this.f46154y, i, false);
        C15469b.m32188a(parcel, 30, this.f46155z, false);
        C15469b.m32180a(parcel, 31, this.f46097A);
        C15469b.m32187a(parcel, 33, this.f46098B, false);
        C15469b.m32178a(parcel, 34, this.f46099C);
        C15469b.m32195b(parcel, 35, this.f46100D);
        C15469b.m32195b(parcel, 36, this.f46101E);
        C15469b.m32189a(parcel, 37, this.f46102F);
        C15469b.m32189a(parcel, 38, this.f46103G);
        C15469b.m32187a(parcel, 39, this.f46104H, false);
        C15469b.m32189a(parcel, 40, this.f46105I);
        C15469b.m32187a(parcel, 41, this.f46106J, false);
        C15469b.m32189a(parcel, 42, this.f46107K);
        C15469b.m32195b(parcel, 43, this.f46108L);
        C15469b.m32181a(parcel, 44, this.f46109M, false);
        C15469b.m32187a(parcel, 45, this.f46110N, false);
        C15469b.m32183a(parcel, 46, (Parcelable) this.f46111O, i, false);
        C15469b.m32189a(parcel, 47, this.f46112P);
        C15469b.m32181a(parcel, 48, this.f46113Q, false);
        C15469b.m32187a(parcel, 49, this.f46114R, false);
        C15469b.m32187a(parcel, 50, this.f46115S, false);
        C15469b.m32187a(parcel, 51, this.f46116T, false);
        C15469b.m32189a(parcel, 52, this.f46117U);
        List<Integer> list = this.f46118V;
        if (list != null) {
            int a2 = C15469b.m32175a(parcel, 53);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            C15469b.m32194b(parcel, a2);
        }
        C15469b.m32187a(parcel, 54, this.f46119W, false);
        C15469b.m32188a(parcel, 55, this.f46120X, false);
        C15469b.m32195b(parcel, 56, this.f46121Y);
        C15469b.m32189a(parcel, 57, this.f46122Z);
        C15469b.m32189a(parcel, 58, this.f46124aa);
        C15469b.m32189a(parcel, 59, this.f46125ab);
        C15469b.m32188a(parcel, 60, (List<String>) this.f46126ac, false);
        C15469b.m32187a(parcel, 61, this.f46127ad, false);
        C15469b.m32183a(parcel, 63, (Parcelable) this.f46128ae, i, false);
        C15469b.m32187a(parcel, 64, this.f46129af, false);
        C15469b.m32181a(parcel, 65, this.f46130ag, false);
        C15469b.m32197c(parcel, a);
    }
}
