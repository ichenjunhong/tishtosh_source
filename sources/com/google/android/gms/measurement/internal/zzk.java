package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzk extends AbstractSafeParcelable {
    public static final Creator<zzk> CREATOR = new C17106eq();

    /* renamed from: a */
    public final String f48487a;

    /* renamed from: b */
    public final String f48488b;

    /* renamed from: c */
    public final String f48489c;

    /* renamed from: d */
    public final String f48490d;

    /* renamed from: e */
    public final long f48491e;

    /* renamed from: f */
    public final long f48492f;

    /* renamed from: g */
    public final String f48493g;

    /* renamed from: h */
    public final boolean f48494h;

    /* renamed from: i */
    public final boolean f48495i;

    /* renamed from: j */
    public final long f48496j;

    /* renamed from: k */
    public final String f48497k;

    /* renamed from: l */
    public final long f48498l;

    /* renamed from: m */
    public final long f48499m;

    /* renamed from: n */
    public final int f48500n;

    /* renamed from: o */
    public final boolean f48501o;

    /* renamed from: p */
    public final boolean f48502p;

    /* renamed from: q */
    public final boolean f48503q;

    /* renamed from: r */
    public final String f48504r;

    zzk(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        C15464q.m32125a(str);
        this.f48487a = str;
        this.f48488b = TextUtils.isEmpty(str2) ? null : str2;
        this.f48489c = str3;
        this.f48496j = j;
        this.f48490d = str4;
        this.f48491e = j2;
        this.f48492f = j3;
        this.f48493g = str5;
        this.f48494h = z;
        this.f48495i = z2;
        this.f48497k = str6;
        this.f48498l = j4;
        this.f48499m = j5;
        this.f48500n = i;
        this.f48501o = z3;
        this.f48502p = z4;
        this.f48503q = z5;
        this.f48504r = str7;
    }

    zzk(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7) {
        this.f48487a = str;
        this.f48488b = str2;
        this.f48489c = str3;
        this.f48496j = j3;
        this.f48490d = str4;
        this.f48491e = j;
        this.f48492f = j2;
        this.f48493g = str5;
        this.f48494h = z;
        this.f48495i = z2;
        this.f48497k = str6;
        this.f48498l = j4;
        this.f48499m = j5;
        this.f48500n = i;
        this.f48501o = z3;
        this.f48502p = z4;
        this.f48503q = z5;
        this.f48504r = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f48487a, false);
        C15469b.m32187a(parcel, 3, this.f48488b, false);
        C15469b.m32187a(parcel, 4, this.f48489c, false);
        C15469b.m32187a(parcel, 5, this.f48490d, false);
        C15469b.m32180a(parcel, 6, this.f48491e);
        C15469b.m32180a(parcel, 7, this.f48492f);
        C15469b.m32187a(parcel, 8, this.f48493g, false);
        C15469b.m32189a(parcel, 9, this.f48494h);
        C15469b.m32189a(parcel, 10, this.f48495i);
        C15469b.m32180a(parcel, 11, this.f48496j);
        C15469b.m32187a(parcel, 12, this.f48497k, false);
        C15469b.m32180a(parcel, 13, this.f48498l);
        C15469b.m32180a(parcel, 14, this.f48499m);
        C15469b.m32195b(parcel, 15, this.f48500n);
        C15469b.m32189a(parcel, 16, this.f48501o);
        C15469b.m32189a(parcel, 17, this.f48502p);
        C15469b.m32189a(parcel, 18, this.f48503q);
        C15469b.m32187a(parcel, 19, this.f48504r, false);
        C15469b.m32197c(parcel, a);
    }
}
