package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VkAudioArray */
public class VkAudioArray extends VKList<VKApiAudio> {
    public static Creator<VkAudioArray> CREATOR = new Creator<VkAudioArray>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VkAudioArray[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VkAudioArray(parcel);
        }
    };

    public VkAudioArray() {
    }

    public VkAudioArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        mo109353a(jSONObject, VKApiAudio.class);
        return this;
    }
}
