package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKDocsArray */
public class VKDocsArray extends VKList<VKApiDocument> {
    public static Creator<VKDocsArray> CREATOR = new Creator<VKDocsArray>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKDocsArray[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKDocsArray(parcel);
        }
    };

    public VKDocsArray() {
    }

    public VKDocsArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        mo109353a(jSONObject, VKApiDocument.class);
        return this;
    }
}
