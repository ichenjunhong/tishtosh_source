package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

public final class zzpn implements Parcelable {
    public static final Creator<zzpn> CREATOR = new bqn();

    /* renamed from: a */
    final zza[] f46285a;

    public interface zza extends Parcelable {
    }

    public zzpn(List<? extends zza> list) {
        this.f46285a = new zza[list.size()];
        list.toArray(this.f46285a);
    }

    public final int describeContents() {
        return 0;
    }

    zzpn(Parcel parcel) {
        this.f46285a = new zza[parcel.readInt()];
        for (int i = 0; i < this.f46285a.length; i++) {
            this.f46285a[i] = (zza) parcel.readParcelable(zza.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f46285a, ((zzpn) obj).f46285a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f46285a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f46285a.length);
        for (zza writeParcelable : this.f46285a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
