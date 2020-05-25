package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.formats.C14919c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15469b;

@C16299uq
public final class zzafl extends AbstractSafeParcelable {
    public static final Creator<zzafl> CREATOR = new C15854ed();

    /* renamed from: a */
    public final int f46065a;

    /* renamed from: b */
    public final boolean f46066b;

    /* renamed from: c */
    public final int f46067c;

    /* renamed from: d */
    public final boolean f46068d;

    /* renamed from: e */
    public final int f46069e;

    /* renamed from: f */
    public final zzacq f46070f;

    /* renamed from: g */
    private final boolean f46071g;

    /* renamed from: h */
    private final int f46072h;

    public zzafl(C14919c cVar) {
        boolean z = cVar.f38471a;
        int i = cVar.f38472b;
        boolean z2 = cVar.f38474d;
        int i2 = cVar.f38475e;
        zzacq zzacq = cVar.f38476f != null ? new zzacq(cVar.f38476f) : null;
        this(4, z, i, z2, i2, zzacq, cVar.f38477g, cVar.f38473c);
    }

    public zzafl(int i, boolean z, int i2, boolean z2, int i3, zzacq zzacq, boolean z3, int i4) {
        this.f46065a = i;
        this.f46066b = z;
        this.f46067c = i2;
        this.f46068d = z2;
        this.f46069e = i3;
        this.f46070f = zzacq;
        this.f46071g = z3;
        this.f46072h = i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15469b.m32174a(parcel);
        C15469b.m32195b(parcel, 1, this.f46065a);
        C15469b.m32189a(parcel, 2, this.f46066b);
        C15469b.m32195b(parcel, 3, this.f46067c);
        C15469b.m32189a(parcel, 4, this.f46068d);
        C15469b.m32195b(parcel, 5, this.f46069e);
        C15469b.m32183a(parcel, 6, (Parcelable) this.f46070f, i, false);
        C15469b.m32189a(parcel, 7, this.f46071g);
        C15469b.m32195b(parcel, 8, this.f46072h);
        C15469b.m32197c(parcel, a);
    }

    /* renamed from: a */
    public final String mo31570a() {
        switch (this.f46072h) {
            case 1:
                return "any";
            case 2:
                return "landscape";
            case 3:
                return "portrait";
            case 4:
                return "square";
            default:
                return "unknown";
        }
    }
}
