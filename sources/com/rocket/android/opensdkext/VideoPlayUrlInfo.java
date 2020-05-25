package com.rocket.android.opensdkext;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VideoPlayUrlInfo implements Parcelable {
    public static final Creator<VideoPlayUrlInfo> CREATOR = new Creator<VideoPlayUrlInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VideoPlayUrlInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VideoPlayUrlInfo(parcel);
        }
    };

    /* renamed from: a */
    public String f50340a;

    /* renamed from: b */
    public long f50341b;

    public int describeContents() {
        return 0;
    }

    public VideoPlayUrlInfo(Parcel parcel) {
        this.f50340a = parcel.readString();
        this.f50341b = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50340a);
        parcel.writeLong(this.f50341b);
    }
}
