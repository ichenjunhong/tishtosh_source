package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPhoto */
public class VKApiPhoto extends VKApiAttachment implements Parcelable, C52413a {
    public static Creator<VKApiPhoto> CREATOR = new Creator<VKApiPhoto>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiPhoto[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiPhoto(parcel);
        }
    };

    /* renamed from: a */
    public int f130512a;

    /* renamed from: b */
    public int f130513b;

    /* renamed from: c */
    public int f130514c;

    /* renamed from: d */
    public int f130515d;

    /* renamed from: e */
    public int f130516e;

    /* renamed from: f */
    public String f130517f;

    /* renamed from: g */
    public long f130518g;

    /* renamed from: h */
    public String f130519h;

    /* renamed from: i */
    public String f130520i;

    /* renamed from: j */
    public String f130521j;

    /* renamed from: k */
    public String f130522k;

    /* renamed from: l */
    public String f130523l;

    /* renamed from: m */
    public String f130524m;

    /* renamed from: n */
    public VKPhotoSizes f130525n = new VKPhotoSizes();

    /* renamed from: o */
    public boolean f130526o;

    /* renamed from: p */
    public boolean f130527p;

    /* renamed from: q */
    public int f130528q;

    /* renamed from: r */
    public int f130529r;

    /* renamed from: s */
    public int f130530s;

    /* renamed from: t */
    public String f130531t;

    /* renamed from: b */
    public String mo109176b() {
        return "photo";
    }

    public int describeContents() {
        return 0;
    }

    public VKApiPhoto() {
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        StringBuilder sb = new StringBuilder("photo");
        sb.append(this.f130514c);
        sb.append('_');
        sb.append(this.f130512a);
        if (!TextUtils.isEmpty(this.f130531t)) {
            sb.append('_');
            sb.append(this.f130531t);
        }
        return sb;
    }

    public VKApiPhoto(Parcel parcel) {
        boolean z;
        this.f130512a = parcel.readInt();
        this.f130513b = parcel.readInt();
        this.f130514c = parcel.readInt();
        this.f130515d = parcel.readInt();
        this.f130516e = parcel.readInt();
        this.f130517f = parcel.readString();
        this.f130518g = parcel.readLong();
        this.f130525n = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.f130519h = parcel.readString();
        this.f130520i = parcel.readString();
        this.f130521j = parcel.readString();
        this.f130522k = parcel.readString();
        this.f130523l = parcel.readString();
        this.f130524m = parcel.readString();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130526o = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f130527p = z2;
        this.f130528q = parcel.readInt();
        this.f130529r = parcel.readInt();
        this.f130530s = parcel.readInt();
        this.f130531t = parcel.readString();
    }

    /* renamed from: a */
    public VKApiPhoto mo109175b(JSONObject jSONObject) {
        this.f130513b = jSONObject.optInt("album_id");
        this.f130518g = jSONObject.optLong("date");
        this.f130516e = jSONObject.optInt("height");
        this.f130515d = jSONObject.optInt("width");
        this.f130514c = jSONObject.optInt("owner_id");
        this.f130512a = jSONObject.optInt("id");
        this.f130517f = jSONObject.optString("text");
        this.f130531t = jSONObject.optString("access_key");
        this.f130519h = jSONObject.optString("photo_75");
        this.f130520i = jSONObject.optString("photo_130");
        this.f130521j = jSONObject.optString("photo_604");
        this.f130522k = jSONObject.optString("photo_807");
        this.f130523l = jSONObject.optString("photo_1280");
        this.f130524m = jSONObject.optString("photo_2560");
        JSONObject optJSONObject = jSONObject.optJSONObject("likes");
        this.f130528q = C52414b.m111970b(optJSONObject, "count");
        this.f130526o = C52414b.m111969a(optJSONObject, "user_likes");
        this.f130529r = C52414b.m111970b(jSONObject.optJSONObject("comments"), "count");
        this.f130530s = C52414b.m111970b(jSONObject.optJSONObject(C42311c.f106869m), "count");
        this.f130527p = C52414b.m111969a(jSONObject, "can_comment");
        VKPhotoSizes vKPhotoSizes = this.f130525n;
        int i = this.f130515d;
        int i2 = this.f130516e;
        if (i != 0) {
            vKPhotoSizes.f130744b = i;
        }
        if (i2 != 0) {
            vKPhotoSizes.f130745c = i2;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("sizes");
        if (optJSONArray != null) {
            this.f130525n.mo109386a(optJSONArray);
        } else {
            if (!TextUtils.isEmpty(this.f130519h)) {
                this.f130525n.add(VKApiPhotoSize.m111901a(this.f130519h, 's', this.f130515d, this.f130516e));
            }
            if (!TextUtils.isEmpty(this.f130520i)) {
                this.f130525n.add(VKApiPhotoSize.m111901a(this.f130520i, 'm', this.f130515d, this.f130516e));
            }
            if (!TextUtils.isEmpty(this.f130521j)) {
                this.f130525n.add(VKApiPhotoSize.m111901a(this.f130521j, 'x', this.f130515d, this.f130516e));
            }
            if (!TextUtils.isEmpty(this.f130522k)) {
                this.f130525n.add(VKApiPhotoSize.m111901a(this.f130522k, 'y', this.f130515d, this.f130516e));
            }
            if (!TextUtils.isEmpty(this.f130523l)) {
                this.f130525n.add(VKApiPhotoSize.m111901a(this.f130523l, 'z', this.f130515d, this.f130516e));
            }
            if (!TextUtils.isEmpty(this.f130524m)) {
                this.f130525n.add(VKApiPhotoSize.m111901a(this.f130524m, 'w', this.f130515d, this.f130516e));
            }
            this.f130525n.mo109385a();
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130512a);
        parcel.writeInt(this.f130513b);
        parcel.writeInt(this.f130514c);
        parcel.writeInt(this.f130515d);
        parcel.writeInt(this.f130516e);
        parcel.writeString(this.f130517f);
        parcel.writeLong(this.f130518g);
        parcel.writeParcelable(this.f130525n, i);
        parcel.writeString(this.f130519h);
        parcel.writeString(this.f130520i);
        parcel.writeString(this.f130521j);
        parcel.writeString(this.f130522k);
        parcel.writeString(this.f130523l);
        parcel.writeString(this.f130524m);
        parcel.writeByte(this.f130526o ? (byte) 1 : 0);
        parcel.writeByte(this.f130527p ? (byte) 1 : 0);
        parcel.writeInt(this.f130528q);
        parcel.writeInt(this.f130529r);
        parcel.writeInt(this.f130530s);
        parcel.writeString(this.f130531t);
    }
}
