package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.List;

public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<ActivityRecognitionResult> CREATOR = new C16899q();

    /* renamed from: a */
    public List<DetectedActivity> f47598a;

    /* renamed from: b */
    public long f47599b;

    /* renamed from: c */
    public long f47600c;

    /* renamed from: d */
    private int f47601d;

    /* renamed from: e */
    private Bundle f47602e;

    public ActivityRecognitionResult(List<DetectedActivity> list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        C15464q.m32134b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        if (j <= 0 || j2 <= 0) {
            z = false;
        }
        C15464q.m32134b(z, "Must set times");
        this.f47598a = list;
        this.f47599b = j;
        this.f47600c = j2;
        this.f47601d = i;
        this.f47602e = bundle;
    }

    /* renamed from: a */
    private static boolean m40982a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return true;
        }
        if ((bundle == null && bundle2 != null) || ((bundle != null && bundle2 == null) || bundle.size() != bundle2.size())) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            if (bundle.get(str) == null) {
                if (bundle2.get(str) != null) {
                    return false;
                }
            } else if (bundle.get(str) instanceof Bundle) {
                if (!m40982a(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else if (!bundle.get(str).equals(bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.f47599b == activityRecognitionResult.f47599b && this.f47600c == activityRecognitionResult.f47600c && this.f47601d == activityRecognitionResult.f47601d && C15462p.m32120a(this.f47598a, activityRecognitionResult.f47598a) && m40982a(this.f47602e, activityRecognitionResult.f47602e);
        }
    }

    public int hashCode() {
        return C15462p.m32118a(Long.valueOf(this.f47599b), Long.valueOf(this.f47600c), Integer.valueOf(this.f47601d), this.f47598a, this.f47602e);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f47598a);
        long j = this.f47599b;
        long j2 = this.f47600c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32196b(parcel, 1, this.f47598a, false);
        C15469b.m32180a(parcel, 2, this.f47599b);
        C15469b.m32180a(parcel, 3, this.f47600c);
        C15469b.m32195b(parcel, 4, this.f47601d);
        C15469b.m32181a(parcel, 5, this.f47602e, false);
        C15469b.m32197c(parcel, a);
    }
}
