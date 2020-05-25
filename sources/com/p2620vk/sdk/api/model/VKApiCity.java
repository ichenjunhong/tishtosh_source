package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiCity */
public class VKApiCity extends VKApiModel implements Parcelable, C52413a {
    public static Creator<VKApiCity> CREATOR = new Creator<VKApiCity>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiCity[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiCity(parcel);
        }
    };

    /* renamed from: a */
    public int f130408a;

    /* renamed from: b */
    public String f130409b;

    public VKApiCity() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f130409b;
    }

    public VKApiCity(Parcel parcel) {
        this.f130408a = parcel.readInt();
        this.f130409b = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiCity mo109175b(JSONObject jSONObject) {
        this.f130408a = jSONObject.optInt("id");
        this.f130409b = jSONObject.optString("title");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130408a);
        parcel.writeString(this.f130409b);
    }
}
