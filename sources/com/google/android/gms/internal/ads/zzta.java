package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzta implements Parcelable {
    public static final Creator<zzta> CREATOR = new bua();

    /* renamed from: a */
    public final int f46296a;

    /* renamed from: b */
    public final int f46297b;

    /* renamed from: c */
    public final int f46298c;

    /* renamed from: d */
    public final byte[] f46299d;

    /* renamed from: e */
    private int f46300e;

    public zzta(int i, int i2, int i3, byte[] bArr) {
        this.f46296a = i;
        this.f46297b = i2;
        this.f46298c = i3;
        this.f46299d = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    zzta(Parcel parcel) {
        this.f46296a = parcel.readInt();
        this.f46297b = parcel.readInt();
        this.f46298c = parcel.readInt();
        this.f46299d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzta zzta = (zzta) obj;
        return this.f46296a == zzta.f46296a && this.f46297b == zzta.f46297b && this.f46298c == zzta.f46298c && Arrays.equals(this.f46299d, zzta.f46299d);
    }

    public final String toString() {
        int i = this.f46296a;
        int i2 = this.f46297b;
        int i3 = this.f46298c;
        boolean z = this.f46299d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        if (this.f46300e == 0) {
            this.f46300e = ((((((this.f46296a + 527) * 31) + this.f46297b) * 31) + this.f46298c) * 31) + Arrays.hashCode(this.f46299d);
        }
        return this.f46300e;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f46296a);
        parcel.writeInt(this.f46297b);
        parcel.writeInt(this.f46298c);
        parcel.writeInt(this.f46299d != null ? 1 : 0);
        if (this.f46299d != null) {
            parcel.writeByteArray(this.f46299d);
        }
    }
}
