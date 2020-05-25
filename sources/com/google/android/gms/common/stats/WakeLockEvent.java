package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator<WakeLockEvent> CREATOR = new C15503g();

    /* renamed from: a */
    private final int f39939a;

    /* renamed from: b */
    private final long f39940b;

    /* renamed from: c */
    private int f39941c;

    /* renamed from: d */
    private final String f39942d;

    /* renamed from: e */
    private final String f39943e;

    /* renamed from: f */
    private final String f39944f;

    /* renamed from: g */
    private final int f39945g;

    /* renamed from: h */
    private final List<String> f39946h;

    /* renamed from: i */
    private final String f39947i;

    /* renamed from: j */
    private final long f39948j;

    /* renamed from: k */
    private int f39949k;

    /* renamed from: l */
    private final String f39950l;

    /* renamed from: m */
    private final float f39951m;

    /* renamed from: n */
    private final long f39952n;

    /* renamed from: o */
    private long f39953o;

    WakeLockEvent(int i, long j, int i2, String str, int i3, List<String> list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.f39939a = i;
        this.f39940b = j;
        this.f39941c = i2;
        this.f39942d = str;
        this.f39943e = str3;
        this.f39944f = str5;
        this.f39945g = i3;
        this.f39953o = -1;
        this.f39946h = list;
        this.f39947i = str2;
        this.f39948j = j2;
        this.f39949k = i4;
        this.f39950l = str4;
        this.f39951m = f;
        this.f39952n = j3;
    }

    public WakeLockEvent(long j, int i, String str, int i2, List<String> list, String str2, long j2, int i3, String str3, String str4, float f, long j3, String str5) {
        this(2, j, i, str, i2, list, str2, j2, i3, str3, str4, f, j3, str5);
    }

    /* renamed from: a */
    public final long mo28509a() {
        return this.f39940b;
    }

    /* renamed from: b */
    public final int mo28510b() {
        return this.f39941c;
    }

    /* renamed from: c */
    public final long mo28511c() {
        return this.f39953o;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39939a);
        C15469b.m32180a(parcel, 2, mo28509a());
        C15469b.m32187a(parcel, 4, this.f39942d, false);
        C15469b.m32195b(parcel, 5, this.f39945g);
        C15469b.m32188a(parcel, 6, this.f39946h, false);
        C15469b.m32180a(parcel, 8, this.f39948j);
        C15469b.m32187a(parcel, 10, this.f39943e, false);
        C15469b.m32195b(parcel, 11, mo28510b());
        C15469b.m32187a(parcel, 12, this.f39947i, false);
        C15469b.m32187a(parcel, 13, this.f39950l, false);
        C15469b.m32195b(parcel, 14, this.f39949k);
        C15469b.m32178a(parcel, 15, this.f39951m);
        C15469b.m32180a(parcel, 16, this.f39952n);
        C15469b.m32187a(parcel, 17, this.f39944f, false);
        C15469b.m32197c(parcel, a);
    }

    /* renamed from: d */
    public final String mo28512d() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = this.f39942d;
        int i = this.f39945g;
        if (this.f39946h == null) {
            str = "";
        } else {
            str = TextUtils.join(",", this.f39946h);
        }
        int i2 = this.f39949k;
        if (this.f39943e == null) {
            str2 = "";
        } else {
            str2 = this.f39943e;
        }
        if (this.f39950l == null) {
            str3 = "";
        } else {
            str3 = this.f39950l;
        }
        float f = this.f39951m;
        if (this.f39944f == null) {
            str4 = "";
        } else {
            str4 = this.f39944f;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 45 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str4);
        return sb.toString();
    }
}
