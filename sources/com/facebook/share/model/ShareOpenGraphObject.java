package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, Object> {
    public static final Creator<ShareOpenGraphObject> CREATOR = new Creator<ShareOpenGraphObject>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareOpenGraphObject[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }
    };

    ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
