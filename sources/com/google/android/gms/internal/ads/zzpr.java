package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class zzpr extends zzpu {
    public static final Creator<zzpr> CREATOR = new bqp();

    /* renamed from: a */
    public final String f46290a;

    /* renamed from: b */
    public final String f46291b;

    /* renamed from: d */
    private final String f46292d;

    public zzpr(String str, String str2, String str3) {
        super("COMM");
        this.f46292d = str;
        this.f46290a = str2;
        this.f46291b = str3;
    }

    zzpr(Parcel parcel) {
        super("COMM");
        this.f46292d = parcel.readString();
        this.f46290a = parcel.readString();
        this.f46291b = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzpr zzpr = (zzpr) obj;
        return btw.m36762a((Object) this.f46290a, (Object) zzpr.f46290a) && btw.m36762a((Object) this.f46292d, (Object) zzpr.f46292d) && btw.m36762a((Object) this.f46291b, (Object) zzpr.f46291b);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.f46292d != null ? this.f46292d.hashCode() : 0) + 527) * 31) + (this.f46290a != null ? this.f46290a.hashCode() : 0)) * 31;
        if (this.f46291b != null) {
            i = this.f46291b.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46293c);
        parcel.writeString(this.f46292d);
        parcel.writeString(this.f46291b);
    }
}
