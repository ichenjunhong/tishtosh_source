package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C15365q();

    /* renamed from: a */
    public final String f39263a;

    /* renamed from: b */
    private final int f39264b;

    Scope(int i, String str) {
        C15464q.m32126a(str, (Object) "scopeUri must not be null or empty");
        this.f39264b = i;
        this.f39263a = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f39263a.equals(((Scope) obj).f39263a);
    }

    public final int hashCode() {
        return this.f39263a.hashCode();
    }

    public final String toString() {
        return this.f39263a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f39264b);
        C15469b.m32187a(parcel, 2, this.f39263a, false);
        C15469b.m32197c(parcel, a);
    }
}
