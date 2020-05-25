package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKPostArray */
public class VKPostArray extends VKList<VKApiPost> {
    public static Creator<VKPostArray> CREATOR = new Creator<VKPostArray>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKPostArray[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKPostArray(parcel);
        }
    };

    public VKPostArray() {
    }

    public VKPostArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        mo109353a(jSONObject, VKApiPost.class);
        return this;
    }
}
