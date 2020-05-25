package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiLink */
public class VKApiLink extends VKApiAttachment implements Parcelable {
    public static Creator<VKApiLink> CREATOR = new Creator<VKApiLink>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiLink[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiLink(parcel);
        }
    };

    /* renamed from: a */
    public String f130486a;

    /* renamed from: b */
    public String f130487b;

    /* renamed from: c */
    public String f130488c;

    /* renamed from: d */
    public String f130489d;

    /* renamed from: e */
    public String f130490e;

    public VKApiLink() {
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        return this.f130486a;
    }

    /* renamed from: b */
    public final String mo109176b() {
        return "link";
    }

    public int describeContents() {
        return 0;
    }

    private VKApiLink(Parcel parcel) {
        this.f130486a = parcel.readString();
        this.f130487b = parcel.readString();
        this.f130488c = parcel.readString();
        this.f130489d = parcel.readString();
        this.f130490e = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiLink mo109175b(JSONObject jSONObject) {
        this.f130486a = jSONObject.optString("url");
        this.f130487b = jSONObject.optString("title");
        this.f130488c = jSONObject.optString("description");
        this.f130489d = jSONObject.optString("image_src");
        this.f130490e = jSONObject.optString("preview_page");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f130486a);
        parcel.writeString(this.f130487b);
        parcel.writeString(this.f130488c);
        parcel.writeString(this.f130489d);
        parcel.writeString(this.f130490e);
    }
}
