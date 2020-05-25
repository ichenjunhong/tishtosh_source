package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPhotoAlbum */
public class VKApiPhotoAlbum extends VKApiAttachment implements Parcelable, C52413a {
    public static Creator<VKApiPhotoAlbum> CREATOR = new Creator<VKApiPhotoAlbum>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiPhotoAlbum[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiPhotoAlbum(parcel);
        }
    };

    /* renamed from: a */
    public int f130532a;

    /* renamed from: b */
    public String f130533b;

    /* renamed from: c */
    public int f130534c;

    /* renamed from: d */
    public int f130535d;

    /* renamed from: e */
    public String f130536e;

    /* renamed from: f */
    public int f130537f;

    /* renamed from: g */
    public boolean f130538g;

    /* renamed from: h */
    public long f130539h;

    /* renamed from: i */
    public long f130540i;

    /* renamed from: j */
    public int f130541j;

    /* renamed from: k */
    public String f130542k;

    /* renamed from: l */
    public VKPhotoSizes f130543l = new VKPhotoSizes();

    /* renamed from: b */
    public final String mo109176b() {
        return "album";
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f130533b;
    }

    public VKApiPhotoAlbum() {
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        StringBuilder sb = new StringBuilder("album");
        sb.append(this.f130537f);
        sb.append('_');
        sb.append(this.f130532a);
        return sb;
    }

    public VKApiPhotoAlbum(Parcel parcel) {
        boolean z;
        this.f130532a = parcel.readInt();
        this.f130533b = parcel.readString();
        this.f130534c = parcel.readInt();
        this.f130535d = parcel.readInt();
        this.f130536e = parcel.readString();
        this.f130537f = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130538g = z;
        this.f130539h = parcel.readLong();
        this.f130540i = parcel.readLong();
        this.f130541j = parcel.readInt();
        this.f130542k = parcel.readString();
        this.f130543l = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
    }

    /* renamed from: a */
    public final VKApiPhotoAlbum mo109175b(JSONObject jSONObject) {
        this.f130532a = jSONObject.optInt("id");
        this.f130541j = jSONObject.optInt("thumb_id");
        this.f130537f = jSONObject.optInt("owner_id");
        this.f130533b = jSONObject.optString("title");
        this.f130536e = jSONObject.optString("description");
        this.f130540i = jSONObject.optLong("created");
        this.f130539h = jSONObject.optLong("updated");
        this.f130534c = jSONObject.optInt("size");
        this.f130538g = C52414b.m111969a(jSONObject, "can_upload");
        this.f130542k = jSONObject.optString("thumb_src");
        if (jSONObject.has("privacy")) {
            this.f130535d = jSONObject.optInt("privacy");
        } else {
            this.f130535d = C52415c.m111971a(jSONObject.optJSONObject("privacy_view"));
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("sizes");
        if (optJSONArray != null) {
            this.f130543l.mo109386a(optJSONArray);
        } else {
            this.f130543l.add(VKApiPhotoSize.m111903a("http://vk.com/images/s_noalbum.png", 75, 55));
            this.f130543l.add(VKApiPhotoSize.m111903a("http://vk.com/images/m_noalbum.png", 130, 97));
            this.f130543l.add(VKApiPhotoSize.m111903a("http://vk.com/images/x_noalbum.png", 432, 249));
            this.f130543l.mo109385a();
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130532a);
        parcel.writeString(this.f130533b);
        parcel.writeInt(this.f130534c);
        parcel.writeInt(this.f130535d);
        parcel.writeString(this.f130536e);
        parcel.writeInt(this.f130537f);
        parcel.writeByte(this.f130538g ? (byte) 1 : 0);
        parcel.writeLong(this.f130539h);
        parcel.writeLong(this.f130540i);
        parcel.writeInt(this.f130541j);
        parcel.writeString(this.f130542k);
        parcel.writeParcelable(this.f130543l, i);
    }
}
