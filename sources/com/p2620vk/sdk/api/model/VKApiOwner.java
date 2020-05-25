package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiOwner */
public class VKApiOwner extends VKApiModel implements Parcelable, C52413a {
    public static Creator<VKApiOwner> CREATOR = new Creator<VKApiOwner>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiOwner[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiOwner(parcel);
        }
    };

    /* renamed from: F */
    public int f130511F;

    public VKApiOwner() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiOwner(Parcel parcel) {
        this.f130511F = parcel.readInt();
    }

    /* renamed from: c */
    public VKApiOwner mo109175b(JSONObject jSONObject) {
        this.f130502E = jSONObject;
        this.f130511F = jSONObject.optInt("id");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130511F);
    }
}
