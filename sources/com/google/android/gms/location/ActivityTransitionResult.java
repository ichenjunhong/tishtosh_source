package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Collections;
import java.util.List;

public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionResult> CREATOR = new C16904v();

    /* renamed from: a */
    public final List<ActivityTransitionEvent> f47612a;

    public ActivityTransitionResult(List<ActivityTransitionEvent> list) {
        C15464q.m32124a(list, (Object) "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C15464q.m32133b(((ActivityTransitionEvent) list.get(i)).f47607c >= ((ActivityTransitionEvent) list.get(i + -1)).f47607c);
            }
        }
        this.f47612a = Collections.unmodifiableList(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f47612a.equals(((ActivityTransitionResult) obj).f47612a);
    }

    public int hashCode() {
        return this.f47612a.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32196b(parcel, 1, this.f47612a, false);
        C15469b.m32197c(parcel, a);
    }
}
