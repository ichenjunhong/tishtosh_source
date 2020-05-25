package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.C2240a;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiCommunity */
public class VKApiCommunity extends VKApiOwner implements Parcelable, C52413a {
    public static Creator<VKApiCommunity> CREATOR = new Creator<VKApiCommunity>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiCommunity[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiCommunity(parcel);
        }
    };

    /* renamed from: a */
    public String f130420a;

    /* renamed from: b */
    public String f130421b;

    /* renamed from: c */
    public int f130422c;

    /* renamed from: d */
    public boolean f130423d;

    /* renamed from: e */
    public int f130424e;

    /* renamed from: f */
    public boolean f130425f;

    /* renamed from: g */
    public int f130426g;

    /* renamed from: h */
    public String f130427h;

    /* renamed from: i */
    public String f130428i;

    /* renamed from: j */
    public String f130429j;

    /* renamed from: k */
    public VKPhotoSizes f130430k = new VKPhotoSizes();

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f130420a;
    }

    public VKApiCommunity() {
    }

    public VKApiCommunity(Parcel parcel) {
        boolean z;
        super(parcel);
        this.f130420a = parcel.readString();
        this.f130421b = parcel.readString();
        this.f130422c = parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130423d = z;
        this.f130424e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f130425f = z2;
        this.f130426g = parcel.readInt();
        this.f130427h = parcel.readString();
        this.f130428i = parcel.readString();
        this.f130429j = parcel.readString();
        this.f130430k = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
    }

    /* renamed from: a */
    public VKApiCommunity mo109201c(JSONObject jSONObject) {
        super.mo109175b(jSONObject);
        this.f130420a = jSONObject.optString(LeakCanaryFileProvider.f132049i);
        this.f130421b = jSONObject.optString("screen_name", C2240a.m6772a("club%d", new Object[]{Integer.valueOf(Math.abs(this.f130511F))}));
        this.f130422c = jSONObject.optInt("is_closed");
        this.f130423d = C52414b.m111969a(jSONObject, "is_admin");
        this.f130424e = jSONObject.optInt("admin_level");
        this.f130425f = C52414b.m111969a(jSONObject, "is_member");
        this.f130427h = jSONObject.optString("photo_50", "http://vk.com/images/community_50.gif");
        if (!TextUtils.isEmpty(this.f130427h)) {
            this.f130430k.mo109354a(VKApiPhotoSize.m111902a(this.f130427h, 50));
        }
        this.f130428i = jSONObject.optString("photo_100", "http://vk.com/images/community_100.gif");
        if (!TextUtils.isEmpty(this.f130428i)) {
            this.f130430k.mo109354a(VKApiPhotoSize.m111902a(this.f130428i, 100));
        }
        this.f130429j = jSONObject.optString("photo_200", null);
        if (!TextUtils.isEmpty(this.f130429j)) {
            this.f130430k.mo109354a(VKApiPhotoSize.m111902a(this.f130429j, 200));
        }
        this.f130430k.mo109385a();
        String optString = jSONObject.optString("type", "group");
        if ("group".equals(optString)) {
            this.f130426g = 0;
        } else if ("page".equals(optString)) {
            this.f130426g = 1;
        } else if ("event".equals(optString)) {
            this.f130426g = 2;
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f130420a);
        parcel.writeString(this.f130421b);
        parcel.writeInt(this.f130422c);
        parcel.writeByte(this.f130423d ? (byte) 1 : 0);
        parcel.writeInt(this.f130424e);
        parcel.writeByte(this.f130425f ? (byte) 1 : 0);
        parcel.writeInt(this.f130426g);
        parcel.writeString(this.f130427h);
        parcel.writeString(this.f130428i);
        parcel.writeString(this.f130429j);
        parcel.writeParcelable(this.f130430k, i);
    }
}
