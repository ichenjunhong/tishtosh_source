package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPlace */
public class VKApiPlace extends VKApiModel implements Parcelable, C52413a {
    public static Creator<VKApiPlace> CREATOR = new Creator<VKApiPlace>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiPlace[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiPlace(parcel);
        }
    };

    /* renamed from: a */
    public int f130548a;

    /* renamed from: b */
    public String f130549b;

    /* renamed from: c */
    public double f130550c;

    /* renamed from: d */
    public double f130551d;

    /* renamed from: e */
    public long f130552e;

    /* renamed from: f */
    public int f130553f;

    /* renamed from: g */
    public long f130554g;

    /* renamed from: h */
    public int f130555h;

    /* renamed from: i */
    public int f130556i;

    /* renamed from: j */
    public String f130557j;

    public VKApiPlace() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f130557j;
    }

    public VKApiPlace(Parcel parcel) {
        this.f130548a = parcel.readInt();
        this.f130549b = parcel.readString();
        this.f130550c = parcel.readDouble();
        this.f130551d = parcel.readDouble();
        this.f130552e = parcel.readLong();
        this.f130553f = parcel.readInt();
        this.f130554g = parcel.readLong();
        this.f130555h = parcel.readInt();
        this.f130556i = parcel.readInt();
        this.f130557j = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiPlace mo109175b(JSONObject jSONObject) {
        this.f130548a = jSONObject.optInt("id");
        this.f130549b = jSONObject.optString("title");
        this.f130550c = jSONObject.optDouble("latitude");
        this.f130551d = jSONObject.optDouble("longitude");
        this.f130552e = jSONObject.optLong("created");
        this.f130553f = jSONObject.optInt("checkins");
        this.f130554g = jSONObject.optLong("updated");
        this.f130555h = jSONObject.optInt("country");
        this.f130556i = jSONObject.optInt("city");
        this.f130557j = jSONObject.optString("address");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130548a);
        parcel.writeString(this.f130549b);
        parcel.writeDouble(this.f130550c);
        parcel.writeDouble(this.f130551d);
        parcel.writeLong(this.f130552e);
        parcel.writeInt(this.f130553f);
        parcel.writeLong(this.f130554g);
        parcel.writeInt(this.f130555h);
        parcel.writeInt(this.f130556i);
        parcel.writeString(this.f130557j);
    }
}
