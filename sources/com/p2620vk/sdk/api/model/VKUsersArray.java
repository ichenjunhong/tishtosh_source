package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKUsersArray */
public class VKUsersArray extends VKList<VKApiUserFull> {
    public static Creator<VKUsersArray> CREATOR = new Creator<VKUsersArray>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKUsersArray[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKUsersArray(parcel);
        }
    };

    public VKUsersArray() {
    }

    public VKUsersArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        mo109353a(jSONObject, VKApiUserFull.class);
        return this;
    }
}
