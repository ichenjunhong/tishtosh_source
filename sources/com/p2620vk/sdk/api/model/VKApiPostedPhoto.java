package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPostedPhoto */
public class VKApiPostedPhoto extends VKApiPhoto {
    public static Creator<VKApiPostedPhoto> CREATOR = new Creator<VKApiPostedPhoto>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiPostedPhoto[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiPostedPhoto(parcel);
        }
    };

    public VKApiPostedPhoto() {
    }

    /* renamed from: b */
    public final String mo109176b() {
        return "posted_photo";
    }

    /* renamed from: c */
    public final VKApiPostedPhoto mo109175b(JSONObject jSONObject) {
        super.mo109175b(jSONObject);
        return this;
    }

    public VKApiPostedPhoto(Parcel parcel) {
        super(parcel);
    }
}
