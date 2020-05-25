package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public class ShareHashtag implements ShareModel {
    public static final Creator<ShareHashtag> CREATOR = new Creator<ShareHashtag>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareHashtag[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }
    };

    /* renamed from: a */
    public final String f37958a;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    public static class C14636a {

        /* renamed from: a */
        public String f37959a;
    }

    public int describeContents() {
        return 0;
    }

    private ShareHashtag(C14636a aVar) {
        this.f37958a = aVar.f37959a;
    }

    ShareHashtag(Parcel parcel) {
        this.f37958a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37958a);
    }
}
