package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import leakcanary.internal.LeakCanaryFileProvider;

public class Feature extends AbstractSafeParcelable {
    public static final Creator<Feature> CREATOR = new C15480m();

    /* renamed from: a */
    public final String f39250a;

    /* renamed from: b */
    private final int f39251b;

    /* renamed from: c */
    private final long f39252c;

    public Feature(String str, int i, long j) {
        this.f39250a = str;
        this.f39251b = i;
        this.f39252c = j;
    }

    /* renamed from: a */
    public final long mo28029a() {
        return this.f39252c == -1 ? (long) this.f39251b : this.f39252c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32187a(parcel, 1, this.f39250a, false);
        C15469b.m32195b(parcel, 2, this.f39251b);
        C15469b.m32180a(parcel, 3, mo28029a());
        C15469b.m32197c(parcel, a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (((this.f39250a == null || !this.f39250a.equals(feature.f39250a)) && (this.f39250a != null || feature.f39250a != null)) || mo28029a() != feature.mo28029a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C15462p.m32118a(this.f39250a, Long.valueOf(mo28029a()));
    }

    public String toString() {
        return C15462p.m32119a((Object) this).mo28449a(LeakCanaryFileProvider.f132049i, this.f39250a).mo28449a(C42311c.f106863g, Long.valueOf(mo28029a())).toString();
    }
}
