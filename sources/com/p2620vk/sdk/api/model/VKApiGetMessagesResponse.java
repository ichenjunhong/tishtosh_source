package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiGetMessagesResponse */
public class VKApiGetMessagesResponse extends VKApiModel implements Parcelable {
    public static Creator<VKApiGetMessagesResponse> CREATOR = new Creator<VKApiGetMessagesResponse>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiGetMessagesResponse[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiGetMessagesResponse(parcel);
        }
    };

    /* renamed from: a */
    public int f130484a;

    /* renamed from: b */
    public VKList<VKApiMessage> f130485b;

    public VKApiGetMessagesResponse() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiGetMessagesResponse(Parcel parcel) {
        this.f130484a = parcel.readInt();
        this.f130485b = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
    }

    /* renamed from: b */
    public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        this.f130484a = optJSONObject.optInt("count");
        this.f130485b = new VKList<>(optJSONObject.optJSONArray("items"), VKApiMessage.class);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130484a);
        parcel.writeParcelable(this.f130485b, i);
    }
}
