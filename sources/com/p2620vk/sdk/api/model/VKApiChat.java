package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiChat */
public class VKApiChat extends VKApiModel implements Parcelable, C52413a {
    public static Creator<VKApiChat> CREATOR = new Creator<VKApiChat>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiChat[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiChat(parcel);
        }
    };

    /* renamed from: a */
    public int f130403a;

    /* renamed from: b */
    public String f130404b;

    /* renamed from: c */
    public String f130405c;

    /* renamed from: d */
    public int f130406d;

    /* renamed from: e */
    public int[] f130407e;

    public VKApiChat() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiChat(Parcel parcel) {
        this.f130403a = parcel.readInt();
        this.f130404b = parcel.readString();
        this.f130405c = parcel.readString();
        this.f130406d = parcel.readInt();
        this.f130407e = parcel.createIntArray();
    }

    /* renamed from: b */
    public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        this.f130403a = jSONObject.optInt("id");
        this.f130404b = jSONObject.optString("type");
        this.f130405c = jSONObject.optString("title");
        this.f130406d = jSONObject.optInt("admin_id");
        JSONArray optJSONArray = jSONObject.optJSONArray("users");
        if (optJSONArray != null) {
            this.f130407e = new int[optJSONArray.length()];
            for (int i = 0; i < this.f130407e.length; i++) {
                this.f130407e[i] = optJSONArray.optInt(i);
            }
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130403a);
        parcel.writeString(this.f130404b);
        parcel.writeString(this.f130405c);
        parcel.writeInt(this.f130406d);
        parcel.writeIntArray(this.f130407e);
    }
}
