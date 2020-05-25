package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class WsComponent implements Parcelable {
    public static final Creator<WsComponent> CREATOR = new Creator<WsComponent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new WsComponent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            WsComponent wsComponent = new WsComponent();
            wsComponent.f25971a = (ComponentName) parcel.readParcelable(getClass().getClassLoader());
            wsComponent.f25972b = parcel.createTypedArrayList(WsApi.CREATOR);
            return wsComponent;
        }
    };

    /* renamed from: a */
    public ComponentName f25971a;

    /* renamed from: b */
    public List<WsApi> f25972b;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25971a, i);
        parcel.writeTypedList(this.f25972b);
    }
}
