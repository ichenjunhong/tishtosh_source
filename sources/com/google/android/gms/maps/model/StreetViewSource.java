package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.C2240a;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Creator<StreetViewSource> CREATOR = new C16973v();

    /* renamed from: a */
    public static final StreetViewSource f47824a = new StreetViewSource(0);

    /* renamed from: b */
    public static final StreetViewSource f47825b = new StreetViewSource(1);

    /* renamed from: c */
    private static final String f47826c = "StreetViewSource";

    /* renamed from: d */
    private final int f47827d;

    public StreetViewSource(int i) {
        this.f47827d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewSource)) {
            return false;
        }
        return this.f47827d == ((StreetViewSource) obj).f47827d;
    }

    public final int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f47827d));
    }

    public final String toString() {
        String str;
        switch (this.f47827d) {
            case 0:
                str = "DEFAULT";
                break;
            case 1:
                str = "OUTDOOR";
                break;
            default:
                str = C2240a.m6772a("UNKNOWN(%s)", new Object[]{Integer.valueOf(this.f47827d)});
                break;
        }
        return C2240a.m6772a("StreetViewSource:%s", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 2, this.f47827d);
        C15469b.m32197c(parcel, a);
    }
}
