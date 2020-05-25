package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class WsApi implements Parcelable {
    public static final Creator<WsApi> CREATOR = new Creator<WsApi>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new WsApi[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            WsApi wsApi = new WsApi();
            wsApi.f25946a = parcel.readInt();
            wsApi.f25947b = parcel.readInt();
            return wsApi;
        }
    };

    /* renamed from: a */
    public int f25946a;

    /* renamed from: b */
    public int f25947b;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25946a);
        parcel.writeInt(this.f25947b);
    }
}
