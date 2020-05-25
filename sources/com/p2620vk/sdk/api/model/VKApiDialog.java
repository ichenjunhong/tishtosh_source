package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiDialog */
public class VKApiDialog extends VKApiModel implements Parcelable, C52413a {
    public static Creator<VKApiDialog> CREATOR = new Creator<VKApiDialog>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiDialog[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiDialog(parcel);
        }
    };

    /* renamed from: a */
    public int f130466a;

    /* renamed from: b */
    public VKApiMessage f130467b;

    public VKApiDialog() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiDialog(Parcel parcel) {
        this.f130466a = parcel.readInt();
        this.f130467b = (VKApiMessage) parcel.readParcelable(VKApiMessage.class.getClassLoader());
    }

    /* renamed from: b */
    public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        this.f130466a = jSONObject.optInt("unread");
        this.f130467b = new VKApiMessage(jSONObject.optJSONObject("message"));
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130466a);
        parcel.writeParcelable(this.f130467b, i);
    }
}
