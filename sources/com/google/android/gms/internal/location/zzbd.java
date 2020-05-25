package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

public final class zzbd extends AbstractSafeParcelable {
    public static final Creator<zzbd> CREATOR = new C16520r();

    /* renamed from: a */
    public static final List<ClientIdentity> f46413a = Collections.emptyList();

    /* renamed from: b */
    private LocationRequest f46414b;

    /* renamed from: c */
    private List<ClientIdentity> f46415c;

    /* renamed from: d */
    private String f46416d;

    /* renamed from: e */
    private boolean f46417e;

    /* renamed from: f */
    private boolean f46418f;

    /* renamed from: g */
    private boolean f46419g;

    /* renamed from: h */
    private String f46420h;

    /* renamed from: i */
    private boolean f46421i = true;

    public zzbd(LocationRequest locationRequest, List<ClientIdentity> list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.f46414b = locationRequest;
        this.f46415c = list;
        this.f46416d = str;
        this.f46417e = z;
        this.f46418f = z2;
        this.f46419g = z3;
        this.f46420h = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbd)) {
            return false;
        }
        zzbd zzbd = (zzbd) obj;
        return C15462p.m32120a(this.f46414b, zzbd.f46414b) && C15462p.m32120a(this.f46415c, zzbd.f46415c) && C15462p.m32120a(this.f46416d, zzbd.f46416d) && this.f46417e == zzbd.f46417e && this.f46418f == zzbd.f46418f && this.f46419g == zzbd.f46419g && C15462p.m32120a(this.f46420h, zzbd.f46420h);
    }

    public final int hashCode() {
        return this.f46414b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46414b);
        if (this.f46416d != null) {
            sb.append(" tag=");
            sb.append(this.f46416d);
        }
        if (this.f46420h != null) {
            sb.append(" moduleId=");
            sb.append(this.f46420h);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f46417e);
        sb.append(" clients=");
        sb.append(this.f46415c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f46418f);
        if (this.f46419g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32183a(parcel, 1, (Parcelable) this.f46414b, i, false);
        C15469b.m32196b(parcel, 5, this.f46415c, false);
        C15469b.m32187a(parcel, 6, this.f46416d, false);
        C15469b.m32189a(parcel, 7, this.f46417e);
        C15469b.m32189a(parcel, 8, this.f46418f);
        C15469b.m32189a(parcel, 9, this.f46419g);
        C15469b.m32187a(parcel, 10, this.f46420h, false);
        C15469b.m32197c(parcel, a);
    }
}
