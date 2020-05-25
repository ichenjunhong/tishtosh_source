package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiNote */
public class VKApiNote extends VKApiAttachment implements Parcelable, C52413a {
    public static Creator<VKApiNote> CREATOR = new Creator<VKApiNote>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiNote[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiNote(parcel);
        }
    };

    /* renamed from: a */
    public int f130503a;

    /* renamed from: b */
    public int f130504b;

    /* renamed from: c */
    public String f130505c;

    /* renamed from: d */
    public String f130506d;

    /* renamed from: e */
    public long f130507e;

    /* renamed from: f */
    public int f130508f;

    /* renamed from: g */
    public int f130509g;

    /* renamed from: h */
    public String f130510h;

    public VKApiNote() {
    }

    /* renamed from: b */
    public final String mo109176b() {
        return "note";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        StringBuilder sb = new StringBuilder("note");
        sb.append(this.f130504b);
        sb.append('_');
        sb.append(this.f130503a);
        return sb;
    }

    public VKApiNote(Parcel parcel) {
        this.f130503a = parcel.readInt();
        this.f130504b = parcel.readInt();
        this.f130505c = parcel.readString();
        this.f130506d = parcel.readString();
        this.f130507e = parcel.readLong();
        this.f130508f = parcel.readInt();
        this.f130509g = parcel.readInt();
        this.f130510h = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiNote mo109175b(JSONObject jSONObject) {
        this.f130503a = jSONObject.optInt("id");
        this.f130504b = jSONObject.optInt("user_id");
        this.f130505c = jSONObject.optString("title");
        this.f130506d = jSONObject.optString("text");
        this.f130507e = jSONObject.optLong("date");
        this.f130508f = jSONObject.optInt("comments");
        this.f130509g = jSONObject.optInt("read_comments");
        this.f130510h = jSONObject.optString("view_url");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130503a);
        parcel.writeInt(this.f130504b);
        parcel.writeString(this.f130505c);
        parcel.writeString(this.f130506d);
        parcel.writeLong(this.f130507e);
        parcel.writeInt(this.f130508f);
        parcel.writeInt(this.f130509g);
        parcel.writeString(this.f130510h);
    }
}
