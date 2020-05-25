package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiComment */
public class VKApiComment extends VKApiModel implements Parcelable, C52413a {
    public static Creator<VKApiComment> CREATOR = new Creator<VKApiComment>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiComment[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiComment(parcel);
        }
    };

    /* renamed from: a */
    public int f130410a;

    /* renamed from: b */
    public int f130411b;

    /* renamed from: c */
    public long f130412c;

    /* renamed from: d */
    public String f130413d;

    /* renamed from: e */
    public int f130414e;

    /* renamed from: f */
    public int f130415f;

    /* renamed from: g */
    public int f130416g;

    /* renamed from: h */
    public boolean f130417h;

    /* renamed from: i */
    public boolean f130418i;

    /* renamed from: j */
    public VKAttachments f130419j = new VKAttachments();

    public int describeContents() {
        return 0;
    }

    public VKApiComment() {
    }

    public VKApiComment(Parcel parcel) {
        boolean z;
        this.f130410a = parcel.readInt();
        this.f130411b = parcel.readInt();
        this.f130412c = parcel.readLong();
        this.f130413d = parcel.readString();
        this.f130414e = parcel.readInt();
        this.f130415f = parcel.readInt();
        this.f130416g = parcel.readInt();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130417h = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f130418i = z2;
        this.f130419j = (VKAttachments) parcel.readParcelable(VKAttachments.class.getClassLoader());
    }

    /* renamed from: b */
    public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        this.f130410a = jSONObject.optInt("id");
        this.f130411b = jSONObject.optInt("from_id");
        this.f130412c = jSONObject.optLong("date");
        this.f130413d = jSONObject.optString("text");
        this.f130414e = jSONObject.optInt("reply_to_user");
        this.f130415f = jSONObject.optInt("reply_to_comment");
        this.f130419j.mo109341a(jSONObject.optJSONArray("attachments"));
        JSONObject optJSONObject = jSONObject.optJSONObject("likes");
        this.f130416g = C52414b.m111970b(optJSONObject, "count");
        this.f130417h = C52414b.m111969a(optJSONObject, "user_likes");
        this.f130418i = C52414b.m111969a(optJSONObject, "can_like");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130410a);
        parcel.writeInt(this.f130411b);
        parcel.writeLong(this.f130412c);
        parcel.writeString(this.f130413d);
        parcel.writeInt(this.f130414e);
        parcel.writeInt(this.f130415f);
        parcel.writeInt(this.f130416g);
        parcel.writeByte(this.f130417h ? (byte) 1 : 0);
        parcel.writeByte(this.f130418i ? (byte) 1 : 0);
        parcel.writeParcelable(this.f130419j, i);
    }
}
