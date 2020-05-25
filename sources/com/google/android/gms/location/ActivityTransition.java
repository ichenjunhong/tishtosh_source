package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class ActivityTransition extends AbstractSafeParcelable {
    public static final Creator<ActivityTransition> CREATOR = new C16900r();

    /* renamed from: a */
    public final int f47603a;

    /* renamed from: b */
    public final int f47604b;

    ActivityTransition(int i, int i2) {
        this.f47603a = i;
        this.f47604b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f47603a == activityTransition.f47603a && this.f47604b == activityTransition.f47604b;
    }

    public int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f47603a), Integer.valueOf(this.f47604b));
    }

    public String toString() {
        int i = this.f47603a;
        int i2 = this.f47604b;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f47603a);
        C15469b.m32195b(parcel, 2, this.f47604b);
        C15469b.m32197c(parcel, a);
    }
}
