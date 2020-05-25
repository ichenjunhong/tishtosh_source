package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiCommunityFull */
public class VKApiCommunityFull extends VKApiCommunity implements Parcelable {
    public static Creator<VKApiCommunityFull> CREATOR = new Creator<VKApiCommunityFull>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiCommunityFull[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiCommunityFull(parcel);
        }
    };

    /* renamed from: A */
    public int f130431A;

    /* renamed from: B */
    public boolean f130432B;

    /* renamed from: C */
    public String f130433C;

    /* renamed from: D */
    public boolean f130434D;

    /* renamed from: l */
    public VKApiCity f130435l;

    /* renamed from: m */
    public VKApiCountry f130436m;

    /* renamed from: n */
    public VKApiAudio f130437n;

    /* renamed from: o */
    public VKApiPlace f130438o;

    /* renamed from: p */
    public String f130439p;

    /* renamed from: q */
    public String f130440q;

    /* renamed from: r */
    public int f130441r;

    /* renamed from: s */
    public Counters f130442s;

    /* renamed from: t */
    public long f130443t;

    /* renamed from: u */
    public long f130444u;

    /* renamed from: v */
    public boolean f130445v;

    /* renamed from: w */
    public boolean f130446w;

    /* renamed from: x */
    public String f130447x;

    /* renamed from: y */
    public VKList<Contact> f130448y;

    /* renamed from: z */
    public VKList<Link> f130449z;

    /* renamed from: com.vk.sdk.api.model.VKApiCommunityFull$Contact */
    public static class Contact extends VKApiModel implements Parcelable, C52413a {
        public static Creator<Contact> CREATOR = new Creator<Contact>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Contact[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Contact(parcel);
            }
        };

        /* renamed from: a */
        public int f130450a;

        /* renamed from: b */
        public VKApiUser f130451b;

        /* renamed from: c */
        public String f130452c;

        /* renamed from: d */
        public String f130453d;

        public int describeContents() {
            return 0;
        }

        public String toString() {
            if (this.f130451b != null) {
                return this.f130451b.toString();
            }
            if (this.f130452c != null) {
                return this.f130452c;
            }
            return null;
        }

        private Contact(Parcel parcel) {
            this.f130450a = parcel.readInt();
            this.f130453d = parcel.readString();
        }

        /* renamed from: b */
        public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
            this.f130450a = jSONObject.optInt("user_id");
            this.f130453d = jSONObject.optString("desc");
            this.f130452c = jSONObject.optString("email");
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f130450a);
            parcel.writeString(this.f130453d);
        }
    }

    /* renamed from: com.vk.sdk.api.model.VKApiCommunityFull$Counters */
    public static class Counters implements Parcelable {
        public static Creator<Counters> CREATOR = new Creator<Counters>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Counters[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Counters(parcel);
            }
        };

        /* renamed from: a */
        public int f130454a;

        /* renamed from: b */
        public int f130455b;

        /* renamed from: c */
        public int f130456c;

        /* renamed from: d */
        public int f130457d;

        /* renamed from: e */
        public int f130458e;

        /* renamed from: f */
        public int f130459f;

        public int describeContents() {
            return 0;
        }

        private Counters(Parcel parcel) {
            this.f130454a = -1;
            this.f130455b = -1;
            this.f130456c = -1;
            this.f130457d = -1;
            this.f130458e = -1;
            this.f130459f = -1;
            this.f130454a = parcel.readInt();
            this.f130455b = parcel.readInt();
            this.f130456c = parcel.readInt();
            this.f130457d = parcel.readInt();
            this.f130458e = parcel.readInt();
            this.f130459f = parcel.readInt();
        }

        public Counters(JSONObject jSONObject) {
            this.f130454a = -1;
            this.f130455b = -1;
            this.f130456c = -1;
            this.f130457d = -1;
            this.f130458e = -1;
            this.f130459f = -1;
            this.f130454a = jSONObject.optInt("photos", this.f130454a);
            this.f130455b = jSONObject.optInt("albums", this.f130455b);
            this.f130456c = jSONObject.optInt("audios", this.f130456c);
            this.f130457d = jSONObject.optInt("videos", this.f130457d);
            this.f130458e = jSONObject.optInt("topics", this.f130458e);
            this.f130459f = jSONObject.optInt("docs", this.f130459f);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f130454a);
            parcel.writeInt(this.f130455b);
            parcel.writeInt(this.f130456c);
            parcel.writeInt(this.f130457d);
            parcel.writeInt(this.f130458e);
            parcel.writeInt(this.f130459f);
        }
    }

    /* renamed from: com.vk.sdk.api.model.VKApiCommunityFull$Link */
    public static class Link extends VKApiModel implements Parcelable, C52413a {
        public static Creator<Link> CREATOR = new Creator<Link>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Link[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Link(parcel);
            }
        };

        /* renamed from: a */
        public String f130460a;

        /* renamed from: b */
        public String f130461b;

        /* renamed from: c */
        public String f130462c;

        /* renamed from: d */
        public VKPhotoSizes f130463d = new VKPhotoSizes();

        public int describeContents() {
            return 0;
        }

        public Link(Parcel parcel) {
            this.f130460a = parcel.readString();
            this.f130461b = parcel.readString();
            this.f130462c = parcel.readString();
            this.f130463d = (VKPhotoSizes) parcel.readParcelable(null);
        }

        /* renamed from: b */
        public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
            this.f130460a = jSONObject.optString("url");
            this.f130461b = jSONObject.optString(LeakCanaryFileProvider.f132049i);
            this.f130462c = jSONObject.optString("desc");
            String optString = jSONObject.optString("photo_50");
            if (!TextUtils.isEmpty(optString)) {
                this.f130463d.add(VKApiPhotoSize.m111902a(optString, 50));
            }
            String optString2 = jSONObject.optString("photo_100");
            if (!TextUtils.isEmpty(optString2)) {
                this.f130463d.add(VKApiPhotoSize.m111902a(optString2, 100));
            }
            this.f130463d.mo109385a();
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f130460a);
            parcel.writeString(this.f130461b);
            parcel.writeString(this.f130462c);
            parcel.writeParcelable(this.f130463d, i);
        }
    }

    public VKApiCommunityFull() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiCommunityFull(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        super(parcel);
        this.f130435l = (VKApiCity) parcel.readParcelable(VKApiCity.class.getClassLoader());
        this.f130436m = (VKApiCountry) parcel.readParcelable(VKApiCountry.class.getClassLoader());
        this.f130437n = (VKApiAudio) parcel.readParcelable(VKApiAudio.class.getClassLoader());
        this.f130438o = (VKApiPlace) parcel.readParcelable(VKApiPlace.class.getClassLoader());
        this.f130439p = parcel.readString();
        this.f130440q = parcel.readString();
        this.f130441r = parcel.readInt();
        this.f130442s = (Counters) parcel.readParcelable(Counters.class.getClassLoader());
        this.f130443t = parcel.readLong();
        this.f130444u = parcel.readLong();
        boolean z4 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130445v = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f130446w = z2;
        this.f130447x = parcel.readString();
        this.f130448y = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        this.f130449z = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        this.f130431A = parcel.readInt();
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f130432B = z3;
        this.f130433C = parcel.readString();
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.f130434D = z4;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public VKApiCommunityFull mo109201c(JSONObject jSONObject) {
        super.mo109201c(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("city");
        if (optJSONObject != null) {
            this.f130435l = new VKApiCity().mo109175b(optJSONObject);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("country");
        if (optJSONObject2 != null) {
            this.f130436m = new VKApiCountry().mo109175b(optJSONObject2);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("place");
        if (optJSONObject3 != null) {
            this.f130438o = new VKApiPlace().mo109175b(optJSONObject3);
        }
        this.f130439p = jSONObject.optString("description");
        this.f130440q = jSONObject.optString("wiki_page");
        this.f130441r = jSONObject.optInt("members_count");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("counters");
        if (optJSONObject4 != null) {
            this.f130442s = new Counters(optJSONObject4);
        }
        this.f130443t = jSONObject.optLong("start_date");
        this.f130444u = jSONObject.optLong("end_date");
        this.f130445v = C52414b.m111969a(jSONObject, "can_post");
        this.f130446w = C52414b.m111969a(jSONObject, "can_see_all_posts");
        this.f130447x = jSONObject.optString("status");
        JSONObject optJSONObject5 = jSONObject.optJSONObject("status_audio");
        if (optJSONObject5 != null) {
            this.f130437n = new VKApiAudio().mo109175b(optJSONObject5);
        }
        this.f130448y = new VKList<>(jSONObject.optJSONArray("contacts"), Contact.class);
        this.f130449z = new VKList<>(jSONObject.optJSONArray("links"), Link.class);
        this.f130431A = jSONObject.optInt("fixed_post");
        this.f130432B = C52414b.m111969a(jSONObject, "verified");
        this.f130434D = C52414b.m111969a(jSONObject, "verified");
        this.f130433C = jSONObject.optString("site");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f130435l, i);
        parcel.writeParcelable(this.f130436m, i);
        parcel.writeParcelable(this.f130437n, i);
        parcel.writeParcelable(this.f130438o, i);
        parcel.writeString(this.f130439p);
        parcel.writeString(this.f130440q);
        parcel.writeInt(this.f130441r);
        parcel.writeParcelable(this.f130442s, i);
        parcel.writeLong(this.f130443t);
        parcel.writeLong(this.f130444u);
        parcel.writeByte(this.f130445v ? (byte) 1 : 0);
        parcel.writeByte(this.f130446w ? (byte) 1 : 0);
        parcel.writeString(this.f130447x);
        parcel.writeParcelable(this.f130448y, i);
        parcel.writeParcelable(this.f130449z, i);
        parcel.writeInt(this.f130431A);
        parcel.writeByte(this.f130432B ? (byte) 1 : 0);
        parcel.writeString(this.f130433C);
        parcel.writeByte(this.f130434D ? (byte) 1 : 0);
    }
}
