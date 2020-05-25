package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiMessage */
public class VKApiMessage extends VKApiModel implements Parcelable, C52413a {
    public static Creator<VKApiMessage> CREATOR = new Creator<VKApiMessage>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiMessage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiMessage(parcel);
        }
    };

    /* renamed from: a */
    public int f130491a;

    /* renamed from: b */
    public int f130492b;

    /* renamed from: c */
    public long f130493c;

    /* renamed from: d */
    public boolean f130494d;

    /* renamed from: e */
    public boolean f130495e;

    /* renamed from: f */
    public String f130496f;

    /* renamed from: g */
    public String f130497g;

    /* renamed from: h */
    public VKAttachments f130498h = new VKAttachments();

    /* renamed from: i */
    public VKList<VKApiMessage> f130499i;

    /* renamed from: j */
    public boolean f130500j;

    /* renamed from: k */
    public boolean f130501k;

    public int describeContents() {
        return 0;
    }

    public VKApiMessage() {
    }

    public VKApiMessage(JSONObject jSONObject) throws JSONException {
        mo109175b(jSONObject);
    }

    public VKApiMessage(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.f130491a = parcel.readInt();
        this.f130492b = parcel.readInt();
        this.f130493c = parcel.readLong();
        boolean z4 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130494d = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f130495e = z2;
        this.f130496f = parcel.readString();
        this.f130497g = parcel.readString();
        this.f130498h = (VKAttachments) parcel.readParcelable(VKAttachments.class.getClassLoader());
        this.f130499i = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f130500j = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.f130501k = z4;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public VKApiMessage mo109175b(JSONObject jSONObject) throws JSONException {
        this.f130491a = jSONObject.optInt("id");
        this.f130492b = jSONObject.optInt("user_id");
        this.f130493c = jSONObject.optLong("date");
        this.f130494d = C52414b.m111969a(jSONObject, "read_state");
        this.f130495e = C52414b.m111969a(jSONObject, "out");
        this.f130496f = jSONObject.optString("title");
        this.f130497g = jSONObject.optString("body");
        this.f130498h.mo109341a(jSONObject.optJSONArray("attachments"));
        this.f130499i = new VKList<>(jSONObject.optJSONArray("fwd_messages"), VKApiMessage.class);
        this.f130500j = C52414b.m111969a(jSONObject, "emoji");
        this.f130501k = C52414b.m111969a(jSONObject, "deleted");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130491a);
        parcel.writeInt(this.f130492b);
        parcel.writeLong(this.f130493c);
        parcel.writeByte(this.f130494d ? (byte) 1 : 0);
        parcel.writeByte(this.f130495e ? (byte) 1 : 0);
        parcel.writeString(this.f130496f);
        parcel.writeString(this.f130497g);
        parcel.writeParcelable(this.f130498h, i);
        parcel.writeParcelable(this.f130499i, i);
        parcel.writeByte(this.f130500j ? (byte) 1 : 0);
        parcel.writeByte(this.f130501k ? (byte) 1 : 0);
    }
}
