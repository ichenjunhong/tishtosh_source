package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class zzo extends AbstractSafeParcelable {
    public static final Creator<zzo> CREATOR = new C17109et();

    /* renamed from: a */
    public String f48505a;

    /* renamed from: b */
    public String f48506b;

    /* renamed from: c */
    public zzfv f48507c;

    /* renamed from: d */
    public long f48508d;

    /* renamed from: e */
    public boolean f48509e;

    /* renamed from: f */
    public String f48510f;

    /* renamed from: g */
    public zzag f48511g;

    /* renamed from: h */
    public long f48512h;

    /* renamed from: i */
    public zzag f48513i;

    /* renamed from: j */
    public long f48514j;

    /* renamed from: k */
    public zzag f48515k;

    zzo(zzo zzo) {
        C15464q.m32123a(zzo);
        this.f48505a = zzo.f48505a;
        this.f48506b = zzo.f48506b;
        this.f48507c = zzo.f48507c;
        this.f48508d = zzo.f48508d;
        this.f48509e = zzo.f48509e;
        this.f48510f = zzo.f48510f;
        this.f48511g = zzo.f48511g;
        this.f48512h = zzo.f48512h;
        this.f48513i = zzo.f48513i;
        this.f48514j = zzo.f48514j;
        this.f48515k = zzo.f48515k;
    }

    zzo(String str, String str2, zzfv zzfv, long j, boolean z, String str3, zzag zzag, long j2, zzag zzag2, long j3, zzag zzag3) {
        this.f48505a = str;
        this.f48506b = str2;
        this.f48507c = zzfv;
        this.f48508d = j;
        this.f48509e = z;
        this.f48510f = str3;
        this.f48511g = zzag;
        this.f48512h = j2;
        this.f48513i = zzag2;
        this.f48514j = j3;
        this.f48515k = zzag3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 2, this.f48505a, false);
        C15469b.m32187a(parcel, 3, this.f48506b, false);
        C15469b.m32183a(parcel, 4, (Parcelable) this.f48507c, i, false);
        C15469b.m32180a(parcel, 5, this.f48508d);
        C15469b.m32189a(parcel, 6, this.f48509e);
        C15469b.m32187a(parcel, 7, this.f48510f, false);
        C15469b.m32183a(parcel, 8, (Parcelable) this.f48511g, i, false);
        C15469b.m32180a(parcel, 9, this.f48512h);
        C15469b.m32183a(parcel, 10, (Parcelable) this.f48513i, i, false);
        C15469b.m32180a(parcel, 11, this.f48514j);
        C15469b.m32183a(parcel, 12, (Parcelable) this.f48515k, i, false);
        C15469b.m32197c(parcel, a);
    }
}
