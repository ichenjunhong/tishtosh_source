package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiVideo */
public class VKApiVideo extends VKApiAttachment implements Parcelable, C52413a {
    public static Creator<VKApiVideo> CREATOR = new Creator<VKApiVideo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiVideo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiVideo(parcel);
        }
    };

    /* renamed from: A */
    public String f130694A;

    /* renamed from: B */
    public String f130695B;

    /* renamed from: C */
    public String f130696C;

    /* renamed from: a */
    public int f130697a;

    /* renamed from: b */
    public int f130698b;

    /* renamed from: c */
    public int f130699c;

    /* renamed from: d */
    public String f130700d;

    /* renamed from: e */
    public String f130701e;

    /* renamed from: f */
    public int f130702f;

    /* renamed from: g */
    public String f130703g;

    /* renamed from: h */
    public long f130704h;

    /* renamed from: i */
    public int f130705i;

    /* renamed from: j */
    public String f130706j;

    /* renamed from: k */
    public String f130707k;

    /* renamed from: l */
    public String f130708l;

    /* renamed from: m */
    public String f130709m;

    /* renamed from: n */
    public VKPhotoSizes f130710n = new VKPhotoSizes();

    /* renamed from: o */
    public String f130711o;

    /* renamed from: p */
    public int f130712p;

    /* renamed from: q */
    public boolean f130713q;

    /* renamed from: r */
    public boolean f130714r;

    /* renamed from: s */
    public boolean f130715s;

    /* renamed from: t */
    public boolean f130716t;

    /* renamed from: u */
    public int f130717u;

    /* renamed from: v */
    public int f130718v;

    /* renamed from: w */
    public int f130719w;

    /* renamed from: x */
    public String f130720x;

    /* renamed from: y */
    public String f130721y;

    /* renamed from: z */
    public String f130722z;

    /* renamed from: b */
    public final String mo109176b() {
        return "video";
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f130700d;
    }

    public VKApiVideo() {
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        StringBuilder sb = new StringBuilder("video");
        sb.append(this.f130698b);
        sb.append('_');
        sb.append(this.f130697a);
        if (!TextUtils.isEmpty(this.f130711o)) {
            sb.append('_');
            sb.append(this.f130711o);
        }
        return sb;
    }

    public VKApiVideo(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f130697a = parcel.readInt();
        this.f130698b = parcel.readInt();
        this.f130699c = parcel.readInt();
        this.f130700d = parcel.readString();
        this.f130701e = parcel.readString();
        this.f130702f = parcel.readInt();
        this.f130703g = parcel.readString();
        this.f130704h = parcel.readLong();
        this.f130705i = parcel.readInt();
        this.f130706j = parcel.readString();
        this.f130707k = parcel.readString();
        this.f130708l = parcel.readString();
        this.f130709m = parcel.readString();
        this.f130710n = (VKPhotoSizes) parcel.readParcelable(VKPhotoSizes.class.getClassLoader());
        this.f130711o = parcel.readString();
        this.f130712p = parcel.readInt();
        boolean z4 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130713q = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f130714r = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f130715s = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.f130716t = z4;
        this.f130717u = parcel.readInt();
        this.f130718v = parcel.readInt();
        this.f130719w = parcel.readInt();
        this.f130720x = parcel.readString();
        this.f130721y = parcel.readString();
        this.f130722z = parcel.readString();
        this.f130694A = parcel.readString();
        this.f130695B = parcel.readString();
        this.f130696C = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiVideo mo109175b(JSONObject jSONObject) {
        this.f130697a = jSONObject.optInt("id");
        this.f130698b = jSONObject.optInt("owner_id");
        this.f130700d = jSONObject.optString("title");
        this.f130701e = jSONObject.optString("description");
        this.f130702f = jSONObject.optInt("duration");
        this.f130703g = jSONObject.optString("link");
        this.f130704h = jSONObject.optLong("date");
        this.f130705i = jSONObject.optInt("views");
        this.f130712p = jSONObject.optInt("comments");
        this.f130706j = jSONObject.optString("player");
        this.f130711o = jSONObject.optString("access_key");
        this.f130699c = jSONObject.optInt("album_id");
        JSONObject optJSONObject = jSONObject.optJSONObject("likes");
        if (optJSONObject != null) {
            this.f130717u = optJSONObject.optInt("count");
            this.f130715s = C52414b.m111969a(optJSONObject, "user_likes");
        }
        this.f130713q = C52414b.m111969a(jSONObject, "can_comment");
        this.f130714r = C52414b.m111969a(jSONObject, "can_repost");
        this.f130716t = C52414b.m111969a(jSONObject, "repeat");
        this.f130718v = C52415c.m111971a(jSONObject.optJSONObject("privacy_view"));
        this.f130719w = C52415c.m111971a(jSONObject.optJSONObject("privacy_comment"));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("files");
        if (optJSONObject2 != null) {
            this.f130720x = optJSONObject2.optString("mp4_240");
            this.f130721y = optJSONObject2.optString("mp4_360");
            this.f130722z = optJSONObject2.optString("mp4_480");
            this.f130694A = optJSONObject2.optString("mp4_720");
            this.f130695B = optJSONObject2.optString("mp4_1080");
            this.f130696C = optJSONObject2.optString("external");
        }
        this.f130707k = jSONObject.optString("photo_130");
        if (!TextUtils.isEmpty(this.f130707k)) {
            this.f130710n.add(VKApiPhotoSize.m111902a(this.f130707k, 130));
        }
        this.f130708l = jSONObject.optString("photo_320");
        if (!TextUtils.isEmpty(this.f130708l)) {
            this.f130710n.add(VKApiPhotoSize.m111902a(this.f130708l, 320));
        }
        this.f130709m = jSONObject.optString("photo_640");
        if (!TextUtils.isEmpty(this.f130709m)) {
            this.f130710n.add(VKApiPhotoSize.m111902a(this.f130709m, 640));
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130697a);
        parcel.writeInt(this.f130698b);
        parcel.writeInt(this.f130699c);
        parcel.writeString(this.f130700d);
        parcel.writeString(this.f130701e);
        parcel.writeInt(this.f130702f);
        parcel.writeString(this.f130703g);
        parcel.writeLong(this.f130704h);
        parcel.writeInt(this.f130705i);
        parcel.writeString(this.f130706j);
        parcel.writeString(this.f130707k);
        parcel.writeString(this.f130708l);
        parcel.writeString(this.f130709m);
        parcel.writeParcelable(this.f130710n, i);
        parcel.writeString(this.f130711o);
        parcel.writeInt(this.f130712p);
        parcel.writeByte(this.f130713q ? (byte) 1 : 0);
        parcel.writeByte(this.f130714r ? (byte) 1 : 0);
        parcel.writeByte(this.f130715s ? (byte) 1 : 0);
        parcel.writeByte(this.f130716t ? (byte) 1 : 0);
        parcel.writeInt(this.f130717u);
        parcel.writeInt(this.f130718v);
        parcel.writeInt(this.f130719w);
        parcel.writeString(this.f130720x);
        parcel.writeString(this.f130721y);
        parcel.writeString(this.f130722z);
        parcel.writeString(this.f130694A);
        parcel.writeString(this.f130695B);
        parcel.writeString(this.f130696C);
    }
}
