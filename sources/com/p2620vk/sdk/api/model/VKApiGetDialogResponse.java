package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiGetDialogResponse */
public class VKApiGetDialogResponse extends VKApiModel implements Parcelable {
    public static Creator<VKApiGetDialogResponse> CREATOR = new Creator<VKApiGetDialogResponse>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiGetDialogResponse[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiGetDialogResponse(parcel);
        }
    };

    /* renamed from: a */
    public int f130481a;

    /* renamed from: b */
    public int f130482b;

    /* renamed from: c */
    public VKList<VKApiDialog> f130483c;

    public VKApiGetDialogResponse() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiGetDialogResponse(Parcel parcel) {
        this.f130481a = parcel.readInt();
        this.f130482b = parcel.readInt();
        this.f130483c = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
    }

    /* renamed from: b */
    public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        this.f130481a = optJSONObject.optInt("count");
        this.f130482b = optJSONObject.optInt("unread_dialogs");
        this.f130483c = new VKList<>(optJSONObject.optJSONArray("items"), VKApiDialog.class);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130481a);
        parcel.writeInt(this.f130482b);
        parcel.writeParcelable(this.f130483c, i);
    }
}
