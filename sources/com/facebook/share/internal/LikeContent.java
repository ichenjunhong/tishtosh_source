package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareModel;

public class LikeContent implements ShareModel {
    public static final Creator<LikeContent> CREATOR = new Creator<LikeContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LikeContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LikeContent(parcel);
        }
    };

    /* renamed from: a */
    public final String f37881a;

    /* renamed from: b */
    public final String f37882b;

    public int describeContents() {
        return 0;
    }

    LikeContent(Parcel parcel) {
        this.f37881a = parcel.readString();
        this.f37882b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37881a);
        parcel.writeString(this.f37882b);
    }
}
