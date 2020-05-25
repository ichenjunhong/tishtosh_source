package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiDocument */
public class VKApiDocument extends VKApiAttachment implements Parcelable, C52413a {
    public static Creator<VKApiDocument> CREATOR = new Creator<VKApiDocument>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiDocument[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiDocument(parcel);
        }
    };

    /* renamed from: a */
    public int f130468a;

    /* renamed from: b */
    public int f130469b;

    /* renamed from: c */
    public String f130470c;

    /* renamed from: d */
    public long f130471d;

    /* renamed from: e */
    public String f130472e;

    /* renamed from: f */
    public String f130473f;

    /* renamed from: g */
    public String f130474g;

    /* renamed from: h */
    public String f130475h;

    /* renamed from: i */
    public VKPhotoSizes f130476i = new VKPhotoSizes();

    /* renamed from: j */
    public String f130477j;

    /* renamed from: k */
    public long f130478k = 0;

    /* renamed from: l */
    private boolean f130479l;

    /* renamed from: m */
    private boolean f130480m;

    /* renamed from: b */
    public final String mo109176b() {
        return "doc";
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f130470c;
    }

    public VKApiDocument() {
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        StringBuilder sb = new StringBuilder("doc");
        sb.append(this.f130469b);
        sb.append('_');
        sb.append(this.f130468a);
        if (!TextUtils.isEmpty(this.f130477j)) {
            sb.append('_');
            sb.append(this.f130477j);
        }
        return sb;
    }

    public VKApiDocument(Parcel parcel) {
        boolean z;
        this.f130468a = parcel.readInt();
        this.f130469b = parcel.readInt();
        this.f130470c = parcel.readString();
        this.f130471d = parcel.readLong();
        this.f130472e = parcel.readString();
        this.f130473f = parcel.readString();
        this.f130478k = parcel.readLong();
        this.f130474g = parcel.readString();
        this.f130475h = parcel.readString();
        this.f130476i = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.f130477j = parcel.readString();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130480m = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f130479l = z2;
    }

    /* renamed from: a */
    public final VKApiDocument mo109175b(JSONObject jSONObject) {
        this.f130468a = jSONObject.optInt("id");
        this.f130469b = jSONObject.optInt("owner_id");
        this.f130470c = jSONObject.optString("title");
        this.f130471d = jSONObject.optLong("size");
        this.f130472e = jSONObject.optString("ext");
        this.f130473f = jSONObject.optString("url");
        this.f130477j = jSONObject.optString("access_key");
        this.f130478k = jSONObject.optLong("date", 0) * 1000;
        this.f130474g = jSONObject.optString("photo_100");
        if (!TextUtils.isEmpty(this.f130474g)) {
            this.f130476i.mo109354a(VKApiPhotoSize.m111903a(this.f130474g, 100, 75));
        }
        this.f130475h = jSONObject.optString("photo_130");
        if (!TextUtils.isEmpty(this.f130475h)) {
            this.f130476i.mo109354a(VKApiPhotoSize.m111903a(this.f130475h, 130, 100));
        }
        this.f130476i.mo109385a();
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130468a);
        parcel.writeInt(this.f130469b);
        parcel.writeString(this.f130470c);
        parcel.writeLong(this.f130471d);
        parcel.writeString(this.f130472e);
        parcel.writeString(this.f130473f);
        parcel.writeLong(this.f130478k);
        parcel.writeString(this.f130474g);
        parcel.writeString(this.f130475h);
        parcel.writeParcelable(this.f130476i, i);
        parcel.writeString(this.f130477j);
        parcel.writeByte(this.f130480m ? (byte) 1 : 0);
        parcel.writeByte(this.f130479l ? (byte) 1 : 0);
    }
}
