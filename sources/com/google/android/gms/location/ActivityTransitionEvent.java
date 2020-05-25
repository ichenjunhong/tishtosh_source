package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionEvent> CREATOR = new C16901s();

    /* renamed from: a */
    public final int f47605a;

    /* renamed from: b */
    public final int f47606b;

    /* renamed from: c */
    public final long f47607c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f47605a == activityTransitionEvent.f47605a && this.f47606b == activityTransitionEvent.f47606b && this.f47607c == activityTransitionEvent.f47607c;
    }

    public int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f47605a), Integer.valueOf(this.f47606b), Long.valueOf(this.f47607c));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f47605a;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f47606b;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f47607c;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f47605a);
        C15469b.m32195b(parcel, 2, this.f47606b);
        C15469b.m32180a(parcel, 3, this.f47607c);
        C15469b.m32197c(parcel, a);
    }

    public ActivityTransitionEvent(int i, int i2, long j) {
        boolean z = true;
        if (i2 < 0 || i2 > 1) {
            z = false;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i2);
        sb.append(" is not valid.");
        C15464q.m32134b(z, sb.toString());
        this.f47605a = i;
        this.f47606b = i2;
        this.f47607c = j;
    }
}
