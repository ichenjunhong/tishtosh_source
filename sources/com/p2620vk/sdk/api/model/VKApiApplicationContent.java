package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiApplicationContent */
public class VKApiApplicationContent extends VKApiAttachment implements Parcelable {
    public static Creator<VKApiApplicationContent> CREATOR = new Creator<VKApiApplicationContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiApplicationContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiApplicationContent(parcel);
        }
    };

    /* renamed from: a */
    public int f130388a;

    /* renamed from: b */
    public String f130389b;

    /* renamed from: c */
    public String f130390c;

    /* renamed from: d */
    public String f130391d;

    /* renamed from: e */
    public VKPhotoSizes f130392e = new VKPhotoSizes();

    /* renamed from: b */
    public final String mo109176b() {
        return "app";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        throw new UnsupportedOperationException("Attaching app info is not supported by VK.com API");
    }

    public VKApiApplicationContent() {
    }

    public VKApiApplicationContent(Parcel parcel) {
        this.f130388a = parcel.readInt();
        this.f130389b = parcel.readString();
        this.f130390c = parcel.readString();
        this.f130391d = parcel.readString();
        this.f130392e = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
    }

    /* renamed from: a */
    public final VKApiApplicationContent mo109175b(JSONObject jSONObject) {
        this.f130388a = jSONObject.optInt("id");
        this.f130389b = jSONObject.optString(LeakCanaryFileProvider.f132049i);
        this.f130390c = jSONObject.optString("photo_130");
        if (!TextUtils.isEmpty(this.f130390c)) {
            this.f130392e.mo109354a(VKApiPhotoSize.m111902a(this.f130390c, 130));
        }
        this.f130391d = jSONObject.optString("photo_604");
        if (!TextUtils.isEmpty(this.f130391d)) {
            this.f130392e.mo109354a(VKApiPhotoSize.m111902a(this.f130391d, 604));
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130388a);
        parcel.writeString(this.f130389b);
        parcel.writeString(this.f130390c);
        parcel.writeString(this.f130391d);
        parcel.writeParcelable(this.f130392e, i);
    }
}
