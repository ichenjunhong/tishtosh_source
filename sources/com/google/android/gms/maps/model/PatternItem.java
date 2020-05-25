package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class PatternItem extends AbstractSafeParcelable {
    public static final Creator<PatternItem> CREATOR = new C16965n();

    /* renamed from: a */
    private static final String f47783a = "PatternItem";

    /* renamed from: b */
    private final int f47784b;

    /* renamed from: c */
    private final Float f47785c;

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        C15464q.m32134b(z, sb.toString());
        this.f47784b = i;
        this.f47785c = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f47784b == patternItem.f47784b && C15462p.m32120a(this.f47785c, patternItem.f47785c);
    }

    public int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f47784b), this.f47785c);
    }

    public String toString() {
        int i = this.f47784b;
        String valueOf = String.valueOf(this.f47785c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 2, this.f47784b);
        C15469b.m32184a(parcel, 3, this.f47785c, false);
        C15469b.m32197c(parcel, a);
    }
}
