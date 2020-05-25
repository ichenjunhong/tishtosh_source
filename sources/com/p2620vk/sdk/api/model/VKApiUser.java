package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiUser */
public class VKApiUser extends VKApiOwner implements Parcelable {
    public static Creator<VKApiUser> CREATOR = new Creator<VKApiUser>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiUser[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiUser(parcel);
        }
    };

    /* renamed from: a */
    public static final String f130612a = TextUtils.join(",", new String[]{"online", "online_mobile", "photo_50", "photo_100", "photo_200"});

    /* renamed from: b */
    public String f130613b = "DELETED";

    /* renamed from: c */
    public String f130614c = "DELETED";

    /* renamed from: d */
    public boolean f130615d;

    /* renamed from: e */
    public boolean f130616e;

    /* renamed from: f */
    public String f130617f = "http://vk.com/images/camera_c.gif";

    /* renamed from: g */
    public String f130618g = "http://vk.com/images/camera_b.gif";

    /* renamed from: h */
    public String f130619h = "http://vk.com/images/camera_a.gif";

    /* renamed from: i */
    public String f130620i = "http://vk.com/images/camera_a.gif";

    /* renamed from: j */
    public String f130621j = "";

    /* renamed from: k */
    public String f130622k = "http://vk.com/images/camera_b.gif";

    /* renamed from: l */
    public String f130623l = "http://vk.com/images/camera_a.gif";

    /* renamed from: m */
    public String f130624m = "";

    /* renamed from: n */
    public VKPhotoSizes f130625n = new VKPhotoSizes();

    /* renamed from: o */
    private String f130626o;

    public int describeContents() {
        return 0;
    }

    public VKApiUser() {
    }

    public String toString() {
        if (this.f130626o == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f130613b);
            sb.append(' ');
            sb.append(this.f130614c);
            this.f130626o = sb.toString();
        }
        return this.f130626o;
    }

    public VKApiUser(Parcel parcel) {
        boolean z;
        super(parcel);
        this.f130613b = parcel.readString();
        this.f130614c = parcel.readString();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130615d = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f130616e = z2;
        this.f130617f = parcel.readString();
        this.f130618g = parcel.readString();
        this.f130619h = parcel.readString();
        this.f130625n = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.f130626o = parcel.readString();
        this.f130621j = parcel.readString();
        this.f130622k = parcel.readString();
        this.f130623l = parcel.readString();
        this.f130624m = parcel.readString();
    }

    /* renamed from: a */
    public VKApiUser mo109201c(JSONObject jSONObject) {
        super.mo109175b(jSONObject);
        this.f130613b = jSONObject.optString("first_name", this.f130613b);
        this.f130614c = jSONObject.optString("last_name", this.f130614c);
        this.f130615d = C52414b.m111969a(jSONObject, "online");
        this.f130616e = C52414b.m111969a(jSONObject, "online_mobile");
        this.f130617f = m111925a(jSONObject.optString("photo_50", this.f130617f), 50);
        this.f130618g = m111925a(jSONObject.optString("photo_100", this.f130618g), 100);
        this.f130619h = m111925a(jSONObject.optString("photo_200", this.f130619h), 200);
        this.f130621j = jSONObject.optString("photo_400_orig", this.f130621j);
        this.f130622k = jSONObject.optString("photo_max", this.f130622k);
        this.f130623l = jSONObject.optString("photo_max_orig", this.f130623l);
        this.f130624m = jSONObject.optString("photo_big", this.f130624m);
        this.f130625n.mo109385a();
        return this;
    }

    /* renamed from: a */
    private String m111925a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f130625n.add(VKApiPhotoSize.m111902a(str, i));
        }
        return str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f130613b);
        parcel.writeString(this.f130614c);
        parcel.writeByte(this.f130615d ? (byte) 1 : 0);
        parcel.writeByte(this.f130616e ? (byte) 1 : 0);
        parcel.writeString(this.f130617f);
        parcel.writeString(this.f130618g);
        parcel.writeString(this.f130619h);
        parcel.writeParcelable(this.f130625n, i);
        parcel.writeString(this.f130626o);
        parcel.writeString(this.f130621j);
        parcel.writeString(this.f130622k);
        parcel.writeString(this.f130623l);
        parcel.writeString(this.f130624m);
    }
}
