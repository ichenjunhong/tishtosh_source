package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.C2240a;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Creator<ActivityTransitionRequest> CREATOR = new C16903u();

    /* renamed from: a */
    public static final Comparator<ActivityTransition> f47608a = new C16902t();

    /* renamed from: b */
    private final List<ActivityTransition> f47609b;

    /* renamed from: c */
    private final String f47610c;

    /* renamed from: d */
    private final List<ClientIdentity> f47611d;

    public ActivityTransitionRequest(List<ActivityTransition> list, String str, List<ClientIdentity> list2) {
        C15464q.m32124a(list, (Object) "transitions can't be null");
        C15464q.m32134b(list.size() > 0, "transitions can't be empty.");
        TreeSet treeSet = new TreeSet(f47608a);
        for (ActivityTransition activityTransition : list) {
            C15464q.m32134b(treeSet.add(activityTransition), C2240a.m6772a("Found duplicated transition: %s.", new Object[]{activityTransition}));
        }
        this.f47609b = Collections.unmodifiableList(list);
        this.f47610c = str;
        this.f47611d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            return C15462p.m32120a(this.f47609b, activityTransitionRequest.f47609b) && C15462p.m32120a(this.f47610c, activityTransitionRequest.f47610c) && C15462p.m32120a(this.f47611d, activityTransitionRequest.f47611d);
        }
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.f47609b.hashCode() * 31) + (this.f47610c != null ? this.f47610c.hashCode() : 0)) * 31;
        if (this.f47611d != null) {
            i = this.f47611d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f47609b);
        String str = this.f47610c;
        String valueOf2 = String.valueOf(this.f47611d);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append('\'');
        sb.append(", mClients=");
        sb.append(valueOf2);
        sb.append(']');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32196b(parcel, 1, this.f47609b, false);
        C15469b.m32187a(parcel, 2, this.f47610c, false);
        C15469b.m32196b(parcel, 3, this.f47611d, false);
        C15469b.m32197c(parcel, a);
    }
}
