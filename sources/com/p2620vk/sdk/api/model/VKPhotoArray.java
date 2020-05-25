package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKPhotoArray */
public class VKPhotoArray extends VKList<VKApiPhoto> {
    public static Creator<VKPhotoArray> CREATOR = new Creator<VKPhotoArray>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKPhotoArray[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKPhotoArray(parcel);
        }
    };

    public VKPhotoArray() {
    }

    public VKPhotoArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        mo109353a(jSONObject, VKApiPhoto.class);
        return this;
    }
}
