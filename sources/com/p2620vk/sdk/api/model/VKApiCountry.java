package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiCountry */
public class VKApiCountry extends VKApiModel implements Parcelable, C52413a {
    public static Creator<VKApiCountry> CREATOR = new Creator<VKApiCountry>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiCountry[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiCountry(parcel);
        }
    };

    /* renamed from: a */
    public int f130464a;

    /* renamed from: b */
    public String f130465b;

    public VKApiCountry() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f130465b;
    }

    public VKApiCountry(Parcel parcel) {
        this.f130464a = parcel.readInt();
        this.f130465b = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiCountry mo109175b(JSONObject jSONObject) {
        this.f130464a = jSONObject.optInt("id");
        this.f130465b = jSONObject.optString("title");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130464a);
        parcel.writeString(this.f130465b);
    }
}
