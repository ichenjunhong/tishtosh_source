package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VkVideoArray */
public class VkVideoArray extends VKList<VKApiVideo> {
    public static Creator<VkVideoArray> CREATOR = new Creator<VkVideoArray>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VkVideoArray[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VkVideoArray(parcel);
        }
    };

    public VkVideoArray() {
    }

    public VkVideoArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        mo109353a(jSONObject, VKApiVideo.class);
        return this;
    }
}
