package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15462p.C15463a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class Status extends AbstractSafeParcelable implements C15358j, ReflectedParcelable {
    public static final Creator<Status> CREATOR = new C15366r();

    /* renamed from: a */
    public static final Status f39265a = new Status(0);

    /* renamed from: b */
    public static final Status f39266b = new Status(14);

    /* renamed from: c */
    public static final Status f39267c = new Status(8);

    /* renamed from: d */
    public static final Status f39268d = new Status(15);

    /* renamed from: e */
    public static final Status f39269e = new Status(16);

    /* renamed from: f */
    public static final Status f39270f = new Status(18);

    /* renamed from: j */
    private static final Status f39271j = new Status(17);

    /* renamed from: g */
    public final int f39272g;

    /* renamed from: h */
    public final String f39273h;

    /* renamed from: i */
    public final PendingIntent f39274i;

    /* renamed from: k */
    private final int f39275k;

    Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f39275k = i;
        this.f39272g = i2;
        this.f39273h = str;
        this.f39274i = pendingIntent;
    }

    /* renamed from: a */
    public final Status mo27935a() {
        return this;
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: b */
    public final boolean mo28059b() {
        return this.f39274i != null;
    }

    /* renamed from: c */
    public final boolean mo28060c() {
        return this.f39272g <= 0;
    }

    public final int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f39275k), Integer.valueOf(this.f39272g), this.f39273h, this.f39274i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f39275k != status.f39275k || this.f39272g != status.f39272g || !C15462p.m32120a(this.f39273h, status.f39273h) || !C15462p.m32120a(this.f39274i, status.f39274i)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        C15463a a = C15462p.m32119a((Object) this);
        String str2 = "statusCode";
        if (this.f39273h != null) {
            str = this.f39273h;
        } else {
            str = C15229d.m31477a(this.f39272g);
        }
        return a.mo28449a(str2, str).mo28449a("resolution", this.f39274i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39272g);
        C15469b.m32187a(parcel, 2, this.f39273h, false);
        C15469b.m32183a(parcel, 3, (Parcelable) this.f39274i, i, false);
        C15469b.m32195b(parcel, 1000, this.f39275k);
        C15469b.m32197c(parcel, a);
    }
}
