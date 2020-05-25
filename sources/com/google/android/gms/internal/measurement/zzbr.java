package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class zzbr implements Parcelable {
    public static final Creator<zzbr> CREATOR = new C16545ap();

    /* renamed from: a */
    public String f47588a;

    /* renamed from: b */
    public String f47589b;

    /* renamed from: c */
    private String f47590c;

    public final int describeContents() {
        return 0;
    }

    public zzbr() {
    }

    zzbr(Parcel parcel) {
        this.f47588a = parcel.readString();
        this.f47590c = parcel.readString();
        this.f47589b = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f47588a);
        parcel.writeString(this.f47590c);
        parcel.writeString(this.f47589b);
    }
}
