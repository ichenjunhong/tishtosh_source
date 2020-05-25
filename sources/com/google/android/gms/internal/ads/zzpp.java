package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class zzpp extends zzpu {
    public static final Creator<zzpp> CREATOR = new bqo();

    /* renamed from: a */
    private final String f46286a;

    /* renamed from: b */
    private final String f46287b;

    /* renamed from: d */
    private final int f46288d;

    /* renamed from: e */
    private final byte[] f46289e;

    public zzpp(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f46286a = str;
        this.f46288d = 3;
        this.f46289e = bArr;
    }

    zzpp(Parcel parcel) {
        super("APIC");
        this.f46286a = parcel.readString();
        this.f46287b = parcel.readString();
        this.f46288d = parcel.readInt();
        this.f46289e = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzpp zzpp = (zzpp) obj;
        return this.f46288d == zzpp.f46288d && btw.m36762a((Object) this.f46286a, (Object) zzpp.f46286a) && btw.m36762a((Object) this.f46287b, (Object) zzpp.f46287b) && Arrays.equals(this.f46289e, zzpp.f46289e);
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((this.f46288d + 527) * 31) + (this.f46286a != null ? this.f46286a.hashCode() : 0)) * 31;
        if (this.f46287b != null) {
            i = this.f46287b.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.f46289e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46286a);
        parcel.writeString(this.f46287b);
        parcel.writeInt(this.f46288d);
        parcel.writeByteArray(this.f46289e);
    }
}
