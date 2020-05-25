package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiAudio */
public class VKApiAudio extends VKApiAttachment implements Parcelable, C52413a {
    public static Creator<VKApiAudio> CREATOR = new Creator<VKApiAudio>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiAudio[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiAudio(parcel);
        }
    };

    /* renamed from: a */
    public int f130393a;

    /* renamed from: b */
    public int f130394b;

    /* renamed from: c */
    public String f130395c;

    /* renamed from: d */
    public String f130396d;

    /* renamed from: e */
    public int f130397e;

    /* renamed from: f */
    public String f130398f;

    /* renamed from: g */
    public int f130399g;

    /* renamed from: h */
    public int f130400h;

    /* renamed from: i */
    public int f130401i;

    /* renamed from: j */
    public String f130402j;

    public VKApiAudio() {
    }

    /* renamed from: b */
    public final String mo109176b() {
        return "audio";
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        StringBuilder sb = new StringBuilder("audio");
        sb.append(this.f130394b);
        sb.append('_');
        sb.append(this.f130393a);
        if (!TextUtils.isEmpty(this.f130402j)) {
            sb.append('_');
            sb.append(this.f130402j);
        }
        return sb;
    }

    public VKApiAudio(Parcel parcel) {
        this.f130393a = parcel.readInt();
        this.f130394b = parcel.readInt();
        this.f130395c = parcel.readString();
        this.f130396d = parcel.readString();
        this.f130397e = parcel.readInt();
        this.f130398f = parcel.readString();
        this.f130399g = parcel.readInt();
        this.f130400h = parcel.readInt();
        this.f130401i = parcel.readInt();
        this.f130402j = parcel.readString();
    }

    /* renamed from: a */
    public final VKApiAudio mo109175b(JSONObject jSONObject) {
        this.f130393a = jSONObject.optInt("id");
        this.f130394b = jSONObject.optInt("owner_id");
        this.f130395c = jSONObject.optString("artist");
        this.f130396d = jSONObject.optString("title");
        this.f130397e = jSONObject.optInt("duration");
        this.f130398f = jSONObject.optString("url");
        this.f130399g = jSONObject.optInt("lyrics_id");
        this.f130400h = jSONObject.optInt("album_id");
        this.f130401i = jSONObject.optInt("genre_id");
        this.f130402j = jSONObject.optString("access_key");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130393a);
        parcel.writeInt(this.f130394b);
        parcel.writeString(this.f130395c);
        parcel.writeString(this.f130396d);
        parcel.writeInt(this.f130397e);
        parcel.writeString(this.f130398f);
        parcel.writeInt(this.f130399g);
        parcel.writeInt(this.f130400h);
        parcel.writeInt(this.f130401i);
        parcel.writeString(this.f130402j);
    }
}
