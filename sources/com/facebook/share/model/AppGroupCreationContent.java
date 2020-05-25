package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class AppGroupCreationContent implements ShareModel {
    public static final Creator<AppGroupCreationContent> CREATOR = new Creator<AppGroupCreationContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AppGroupCreationContent(parcel);
        }
    };

    /* renamed from: a */
    public final String f37918a;

    /* renamed from: b */
    public final String f37919b;

    /* renamed from: c */
    public C14622a f37920c;

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$a */
    public enum C14622a {
        Open,
        Closed
    }

    public final int describeContents() {
        return 0;
    }

    AppGroupCreationContent(Parcel parcel) {
        this.f37918a = parcel.readString();
        this.f37919b = parcel.readString();
        this.f37920c = (C14622a) parcel.readSerializable();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37918a);
        parcel.writeString(this.f37919b);
        parcel.writeSerializable(this.f37920c);
    }
}
