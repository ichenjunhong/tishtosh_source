package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPost */
public class VKApiPost extends VKApiAttachment implements Parcelable, C52413a {
    public static Creator<VKApiPost> CREATOR = new Creator<VKApiPost>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiPost[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiPost(parcel);
        }
    };

    /* renamed from: a */
    public int f130569a;

    /* renamed from: b */
    public int f130570b;

    /* renamed from: c */
    public int f130571c;

    /* renamed from: d */
    public long f130572d;

    /* renamed from: e */
    public String f130573e;

    /* renamed from: f */
    public int f130574f;

    /* renamed from: g */
    public int f130575g;

    /* renamed from: h */
    public boolean f130576h;

    /* renamed from: i */
    public int f130577i;

    /* renamed from: j */
    public boolean f130578j;

    /* renamed from: k */
    public int f130579k;

    /* renamed from: l */
    public boolean f130580l;

    /* renamed from: m */
    public boolean f130581m;

    /* renamed from: n */
    public boolean f130582n;

    /* renamed from: o */
    public int f130583o;

    /* renamed from: p */
    public boolean f130584p;

    /* renamed from: q */
    public String f130585q;

    /* renamed from: r */
    public VKAttachments f130586r = new VKAttachments();

    /* renamed from: s */
    public VKApiPlace f130587s;

    /* renamed from: t */
    public int f130588t;

    /* renamed from: u */
    public VKList<VKApiPost> f130589u;

    /* renamed from: b */
    public final String mo109176b() {
        return "wall";
    }

    public int describeContents() {
        return 0;
    }

    public VKApiPost() {
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        StringBuilder sb = new StringBuilder("wall");
        sb.append(this.f130570b);
        sb.append('_');
        sb.append(this.f130569a);
        return sb;
    }

    public VKApiPost(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f130569a = parcel.readInt();
        this.f130570b = parcel.readInt();
        this.f130571c = parcel.readInt();
        this.f130572d = parcel.readLong();
        this.f130573e = parcel.readString();
        this.f130574f = parcel.readInt();
        this.f130575g = parcel.readInt();
        boolean z6 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130576h = z;
        this.f130577i = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f130578j = z2;
        this.f130579k = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f130580l = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f130581m = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f130582n = z5;
        this.f130583o = parcel.readInt();
        if (parcel.readByte() != 0) {
            z6 = true;
        }
        this.f130584p = z6;
        this.f130585q = parcel.readString();
        this.f130586r = (VKAttachments) parcel.readParcelable(VKAttachments.class.getClassLoader());
        this.f130587s = (VKApiPlace) parcel.readParcelable(VKApiPlace.class.getClassLoader());
        this.f130588t = parcel.readInt();
    }

    /* renamed from: a */
    public final VKApiPost mo109175b(JSONObject jSONObject) throws JSONException {
        this.f130569a = jSONObject.optInt("id");
        this.f130570b = jSONObject.optInt("to_id");
        this.f130571c = jSONObject.optInt("from_id");
        this.f130572d = jSONObject.optLong("date");
        this.f130573e = jSONObject.optString("text");
        this.f130574f = jSONObject.optInt("reply_owner_id");
        this.f130575g = jSONObject.optInt("reply_post_id");
        this.f130576h = C52414b.m111969a(jSONObject, "friends_only");
        JSONObject optJSONObject = jSONObject.optJSONObject("comments");
        if (optJSONObject != null) {
            this.f130577i = optJSONObject.optInt("count");
            this.f130578j = C52414b.m111969a(optJSONObject, "can_post");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("likes");
        if (optJSONObject2 != null) {
            this.f130579k = optJSONObject2.optInt("count");
            this.f130580l = C52414b.m111969a(optJSONObject2, "user_likes");
            this.f130581m = C52414b.m111969a(optJSONObject2, "can_like");
            this.f130582n = C52414b.m111969a(optJSONObject2, "can_publish");
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("reposts");
        if (optJSONObject3 != null) {
            this.f130583o = optJSONObject3.optInt("count");
            this.f130584p = C52414b.m111969a(optJSONObject3, "user_reposted");
        }
        this.f130585q = jSONObject.optString("post_type");
        this.f130586r.mo109341a(jSONObject.optJSONArray("attachments"));
        JSONObject optJSONObject4 = jSONObject.optJSONObject("geo");
        if (optJSONObject4 != null) {
            this.f130587s = new VKApiPlace().mo109175b(optJSONObject4);
        }
        this.f130588t = jSONObject.optInt("signer_id");
        this.f130589u = new VKList<>(jSONObject.optJSONArray("copy_history"), VKApiPost.class);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130569a);
        parcel.writeInt(this.f130570b);
        parcel.writeInt(this.f130571c);
        parcel.writeLong(this.f130572d);
        parcel.writeString(this.f130573e);
        parcel.writeInt(this.f130574f);
        parcel.writeInt(this.f130575g);
        parcel.writeByte(this.f130576h ? (byte) 1 : 0);
        parcel.writeInt(this.f130577i);
        parcel.writeByte(this.f130578j ? (byte) 1 : 0);
        parcel.writeInt(this.f130579k);
        parcel.writeByte(this.f130580l ? (byte) 1 : 0);
        parcel.writeByte(this.f130581m ? (byte) 1 : 0);
        parcel.writeByte(this.f130582n ? (byte) 1 : 0);
        parcel.writeInt(this.f130583o);
        parcel.writeByte(this.f130584p ? (byte) 1 : 0);
        parcel.writeString(this.f130585q);
        parcel.writeParcelable(this.f130586r, i);
        parcel.writeParcelable(this.f130587s, i);
        parcel.writeInt(this.f130588t);
    }
}
