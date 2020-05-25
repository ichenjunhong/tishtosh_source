package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.C2240a;
import com.google.android.gms.common.internal.C15462p;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;
import com.google.android.gms.p1027a.C14882b.C14883a;

public class Cap extends AbstractSafeParcelable {
    public static final Creator<Cap> CREATOR = new C16958g();

    /* renamed from: a */
    private static final String f47730a = "Cap";

    /* renamed from: b */
    private final int f47731b;

    /* renamed from: c */
    private final C16952a f47732c;

    /* renamed from: d */
    private final Float f47733d;

    protected Cap(int i) {
        this(i, (C16952a) null, (Float) null);
    }

    Cap(int i, IBinder iBinder, Float f) {
        this(i, iBinder == null ? null : new C16952a(C14883a.m30535a(iBinder)), f);
    }

    private Cap(int i, C16952a aVar, Float f) {
        C15464q.m32134b(i != 3 || (aVar != null && (f != null && (f.floatValue() > 0.0f ? 1 : (f.floatValue() == 0.0f ? 0 : -1)) > 0)), C2240a.m6772a("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", new Object[]{Integer.valueOf(i), aVar, f}));
        this.f47731b = i;
        this.f47732c = aVar;
        this.f47733d = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f47731b == cap.f47731b && C15462p.m32120a(this.f47732c, cap.f47732c) && C15462p.m32120a(this.f47733d, cap.f47733d);
    }

    public int hashCode() {
        return C15462p.m32118a(Integer.valueOf(this.f47731b), this.f47732c, this.f47733d);
    }

    public String toString() {
        int i = this.f47731b;
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 2, this.f47731b);
        C15469b.m32182a(parcel, 3, this.f47732c == null ? null : this.f47732c.f47842a.asBinder(), false);
        C15469b.m32184a(parcel, 4, this.f47733d, false);
        C15469b.m32197c(parcel, a);
    }
}
