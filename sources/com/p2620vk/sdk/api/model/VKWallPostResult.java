package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.vk.sdk.api.model.VKWallPostResult */
public class VKWallPostResult extends VKApiModel {
    public static Creator<VKWallPostResult> CREATOR = new Creator<VKWallPostResult>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKWallPostResult[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            VKWallPostResult vKWallPostResult = new VKWallPostResult();
            vKWallPostResult.f130750a = parcel.readInt();
            return vKWallPostResult;
        }
    };

    /* renamed from: a */
    public int f130750a;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130750a);
    }
}
