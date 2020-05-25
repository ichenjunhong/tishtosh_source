package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKCommentArray */
public class VKCommentArray extends VKList<VKApiComment> {
    public static Creator<VKCommentArray> CREATOR = new Creator<VKCommentArray>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKCommentArray[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKCommentArray(parcel);
        }
    };

    public VKCommentArray() {
    }

    public VKCommentArray(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public final VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        mo109353a(jSONObject, VKApiComment.class);
        return this;
    }
}
