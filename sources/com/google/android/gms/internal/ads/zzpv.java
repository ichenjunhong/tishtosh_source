package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzpv extends zzpu {
    public static final Creator<zzpv> CREATOR = new bqr();

    /* renamed from: a */
    private final String f46294a;

    /* renamed from: b */
    private final String f46295b;

    public zzpv(String str, String str2, String str3) {
        super(str);
        this.f46295b = str3;
    }

    zzpv(Parcel parcel) {
        super(parcel.readString());
        this.f46294a = parcel.readString();
        this.f46295b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzpv zzpv = (zzpv) obj;
        return this.f46293c.equals(zzpv.f46293c) && btw.m36762a((Object) this.f46294a, (Object) zzpv.f46294a) && btw.m36762a((Object) this.f46295b, (Object) zzpv.f46295b);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((this.f46293c.hashCode() + 527) * 31) + (this.f46294a != null ? this.f46294a.hashCode() : 0)) * 31;
        if (this.f46295b != null) {
            i = this.f46295b.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46293c);
        parcel.writeString(this.f46294a);
        parcel.writeString(this.f46295b);
    }
}
