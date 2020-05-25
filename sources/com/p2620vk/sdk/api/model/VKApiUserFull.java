package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiUserFull */
public class VKApiUserFull extends VKApiUser implements Parcelable {
    public static Creator<VKApiUserFull> CREATOR = new Creator<VKApiUserFull>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiUserFull[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiUserFull(parcel);
        }
    };

    /* renamed from: A */
    public int f130627A;

    /* renamed from: B */
    public String f130628B;

    /* renamed from: C */
    public String[] f130629C;

    /* renamed from: D */
    public String f130630D;

    /* renamed from: G */
    public String f130631G;

    /* renamed from: H */
    public String f130632H;

    /* renamed from: I */
    public String f130633I;

    /* renamed from: J */
    public String f130634J;

    /* renamed from: K */
    public String f130635K;

    /* renamed from: L */
    public String f130636L;

    /* renamed from: M */
    public String f130637M;

    /* renamed from: N */
    public String f130638N;

    /* renamed from: O */
    public String f130639O;

    /* renamed from: P */
    public String f130640P;

    /* renamed from: Q */
    public String f130641Q;

    /* renamed from: R */
    public String f130642R;

    /* renamed from: S */
    public String f130643S;

    /* renamed from: T */
    public String f130644T;

    /* renamed from: U */
    public String f130645U;

    /* renamed from: V */
    public String f130646V;

    /* renamed from: W */
    public String f130647W;

    /* renamed from: X */
    public String f130648X;

    /* renamed from: Y */
    public String f130649Y;

    /* renamed from: Z */
    public boolean f130650Z;

    /* renamed from: aa */
    public boolean f130651aa;

    /* renamed from: ab */
    public boolean f130652ab;

    /* renamed from: ac */
    public boolean f130653ac;

    /* renamed from: ad */
    public boolean f130654ad;

    /* renamed from: ae */
    public boolean f130655ae;

    /* renamed from: af */
    public boolean f130656af;

    /* renamed from: ag */
    public boolean f130657ag;

    /* renamed from: ah */
    public int f130658ah;

    /* renamed from: ai */
    public Counters f130659ai;

    /* renamed from: aj */
    public Occupation f130660aj;

    /* renamed from: ak */
    public int f130661ak;

    /* renamed from: al */
    public VKList<Relative> f130662al;

    /* renamed from: am */
    public boolean f130663am;

    /* renamed from: o */
    public String f130664o;

    /* renamed from: p */
    public VKApiAudio f130665p;

    /* renamed from: q */
    public String f130666q;

    /* renamed from: r */
    public VKApiCity f130667r;

    /* renamed from: s */
    public VKApiCountry f130668s;

    /* renamed from: t */
    public long f130669t;

    /* renamed from: u */
    public VKList<VKApiUniversity> f130670u;

    /* renamed from: v */
    public VKList<VKApiSchool> f130671v;

    /* renamed from: w */
    public int f130672w;

    /* renamed from: x */
    public int f130673x;

    /* renamed from: y */
    public int f130674y;

    /* renamed from: z */
    public int f130675z;

    /* renamed from: com.vk.sdk.api.model.VKApiUserFull$Counters */
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
        public int f130676a;

        /* renamed from: b */
        public int f130677b;

        /* renamed from: c */
        public int f130678c;

        /* renamed from: d */
        public int f130679d;

        /* renamed from: e */
        public int f130680e;

        /* renamed from: f */
        public int f130681f;

        /* renamed from: g */
        public int f130682g;

        /* renamed from: h */
        public int f130683h;

        /* renamed from: i */
        public int f130684i;

        /* renamed from: j */
        public int f130685j;

        /* renamed from: k */
        public int f130686k;

        /* renamed from: l */
        public int f130687l;

        /* renamed from: m */
        public int f130688m;

        public int describeContents() {
            return 0;
        }

        private Counters(Parcel parcel) {
            this.f130676a = -1;
            this.f130677b = -1;
            this.f130678c = -1;
            this.f130679d = -1;
            this.f130680e = -1;
            this.f130681f = -1;
            this.f130682g = -1;
            this.f130683h = -1;
            this.f130684i = -1;
            this.f130685j = -1;
            this.f130686k = -1;
            this.f130687l = -1;
            this.f130688m = -1;
            this.f130676a = parcel.readInt();
            this.f130677b = parcel.readInt();
            this.f130678c = parcel.readInt();
            this.f130679d = parcel.readInt();
            this.f130680e = parcel.readInt();
            this.f130681f = parcel.readInt();
            this.f130682g = parcel.readInt();
            this.f130683h = parcel.readInt();
            this.f130684i = parcel.readInt();
            this.f130685j = parcel.readInt();
            this.f130686k = parcel.readInt();
            this.f130687l = parcel.readInt();
            this.f130688m = parcel.readInt();
        }

        Counters(JSONObject jSONObject) {
            this.f130676a = -1;
            this.f130677b = -1;
            this.f130678c = -1;
            this.f130679d = -1;
            this.f130680e = -1;
            this.f130681f = -1;
            this.f130682g = -1;
            this.f130683h = -1;
            this.f130684i = -1;
            this.f130685j = -1;
            this.f130686k = -1;
            this.f130687l = -1;
            this.f130688m = -1;
            this.f130676a = jSONObject.optInt("albums", this.f130676a);
            this.f130678c = jSONObject.optInt("audios", this.f130678c);
            this.f130686k = jSONObject.optInt("followers", this.f130686k);
            this.f130681f = jSONObject.optInt("photos", this.f130681f);
            this.f130680e = jSONObject.optInt("friends", this.f130680e);
            this.f130682g = jSONObject.optInt("groups", this.f130682g);
            this.f130684i = jSONObject.optInt("mutual_friends", this.f130684i);
            this.f130679d = jSONObject.optInt("notes", this.f130679d);
            this.f130683h = jSONObject.optInt("online_friends", this.f130683h);
            this.f130685j = jSONObject.optInt("user_videos", this.f130685j);
            this.f130677b = jSONObject.optInt("videos", this.f130677b);
            this.f130687l = jSONObject.optInt("subscriptions", this.f130687l);
            this.f130688m = jSONObject.optInt("pages", this.f130688m);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f130676a);
            parcel.writeInt(this.f130677b);
            parcel.writeInt(this.f130678c);
            parcel.writeInt(this.f130679d);
            parcel.writeInt(this.f130680e);
            parcel.writeInt(this.f130681f);
            parcel.writeInt(this.f130682g);
            parcel.writeInt(this.f130683h);
            parcel.writeInt(this.f130684i);
            parcel.writeInt(this.f130685j);
            parcel.writeInt(this.f130686k);
            parcel.writeInt(this.f130687l);
            parcel.writeInt(this.f130688m);
        }
    }

    /* renamed from: com.vk.sdk.api.model.VKApiUserFull$Occupation */
    public static class Occupation implements Parcelable {
        public static Creator<Occupation> CREATOR = new Creator<Occupation>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Occupation[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Occupation(parcel);
            }
        };

        /* renamed from: a */
        public String f130689a;

        /* renamed from: b */
        public int f130690b;

        /* renamed from: c */
        public String f130691c;

        public int describeContents() {
            return 0;
        }

        private Occupation(Parcel parcel) {
            this.f130690b = -1;
            this.f130689a = parcel.readString();
            this.f130690b = parcel.readInt();
            this.f130691c = parcel.readString();
        }

        Occupation(JSONObject jSONObject) {
            this.f130690b = -1;
            this.f130689a = jSONObject.optString("type");
            this.f130690b = jSONObject.optInt("id", this.f130690b);
            this.f130691c = jSONObject.optString(LeakCanaryFileProvider.f132049i);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f130689a);
            parcel.writeInt(this.f130690b);
            parcel.writeString(this.f130691c);
        }
    }

    /* renamed from: com.vk.sdk.api.model.VKApiUserFull$Relative */
    public static class Relative extends VKApiModel implements Parcelable, C52413a {
        public static Creator<Relative> CREATOR = new Creator<Relative>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Relative[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Relative(parcel);
            }
        };

        /* renamed from: a */
        public int f130692a;

        /* renamed from: b */
        public String f130693b;

        public int describeContents() {
            return 0;
        }

        private Relative(Parcel parcel) {
            this.f130692a = parcel.readInt();
            this.f130693b = parcel.readString();
        }

        /* renamed from: b */
        public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
            this.f130692a = jSONObject.optInt("id");
            this.f130693b = jSONObject.optString(LeakCanaryFileProvider.f132049i);
            return this;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f130692a);
            parcel.writeString(this.f130693b);
        }
    }

    public VKApiUserFull() {
    }

    public int describeContents() {
        return 0;
    }

    public VKApiUserFull(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        super(parcel);
        this.f130664o = parcel.readString();
        this.f130665p = (VKApiAudio) parcel.readParcelable(VKApiAudio.class.getClassLoader());
        this.f130666q = parcel.readString();
        this.f130667r = (VKApiCity) parcel.readParcelable(VKApiCity.class.getClassLoader());
        this.f130668s = (VKApiCountry) parcel.readParcelable(VKApiCountry.class.getClassLoader());
        this.f130669t = parcel.readLong();
        this.f130670u = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        this.f130671v = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        this.f130672w = parcel.readInt();
        this.f130673x = parcel.readInt();
        this.f130674y = parcel.readInt();
        this.f130675z = parcel.readInt();
        this.f130627A = parcel.readInt();
        this.f130628B = parcel.readString();
        this.f130629C = parcel.createStringArray();
        this.f130630D = parcel.readString();
        this.f130631G = parcel.readString();
        this.f130632H = parcel.readString();
        this.f130633I = parcel.readString();
        this.f130634J = parcel.readString();
        this.f130635K = parcel.readString();
        this.f130636L = parcel.readString();
        this.f130637M = parcel.readString();
        this.f130638N = parcel.readString();
        this.f130639O = parcel.readString();
        this.f130640P = parcel.readString();
        this.f130642R = parcel.readString();
        this.f130643S = parcel.readString();
        this.f130644T = parcel.readString();
        this.f130645U = parcel.readString();
        this.f130646V = parcel.readString();
        this.f130647W = parcel.readString();
        this.f130648X = parcel.readString();
        this.f130649Y = parcel.readString();
        boolean z9 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f130650Z = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f130651aa = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f130652ab = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f130653ac = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f130654ad = z5;
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f130655ae = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f130656af = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f130657ag = z8;
        this.f130658ah = parcel.readInt();
        this.f130659ai = (Counters) parcel.readParcelable(Counters.class.getClassLoader());
        this.f130660aj = (Occupation) parcel.readParcelable(Occupation.class.getClassLoader());
        this.f130661ak = parcel.readInt();
        this.f130662al = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z9 = true;
        }
        this.f130663am = z9;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public VKApiUserFull mo109201c(JSONObject jSONObject) {
        super.mo109201c(jSONObject);
        JSONObject optJSONObject = jSONObject.optJSONObject("last_seen");
        String str = "time";
        long j = 0;
        if (optJSONObject != null) {
            j = optJSONObject.optLong(str, 0);
        }
        this.f130669t = j;
        this.f130666q = jSONObject.optString("bdate");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("city");
        if (optJSONObject2 != null) {
            this.f130667r = new VKApiCity().mo109175b(optJSONObject2);
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("country");
        if (optJSONObject3 != null) {
            this.f130668s = new VKApiCountry().mo109175b(optJSONObject3);
        }
        this.f130670u = new VKList<>(jSONObject.optJSONArray("universities"), VKApiUniversity.class);
        this.f130671v = new VKList<>(jSONObject.optJSONArray("schools"), VKApiSchool.class);
        this.f130664o = jSONObject.optString("activity");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("status_audio");
        if (optJSONObject4 != null) {
            this.f130665p = new VKApiAudio().mo109175b(optJSONObject4);
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("personal");
        if (optJSONObject5 != null) {
            this.f130672w = optJSONObject5.optInt("smoking");
            this.f130673x = optJSONObject5.optInt("alcohol");
            this.f130674y = optJSONObject5.optInt("political");
            this.f130675z = optJSONObject5.optInt("life_main");
            this.f130627A = optJSONObject5.optInt("people_main");
            this.f130628B = optJSONObject5.optString("inspired_by");
            this.f130630D = optJSONObject5.optString("religion");
            if (optJSONObject5.has("langs")) {
                JSONArray optJSONArray = optJSONObject5.optJSONArray("langs");
                if (optJSONArray != null) {
                    this.f130629C = new String[optJSONArray.length()];
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        this.f130629C[i] = optJSONArray.optString(i);
                    }
                }
            }
        }
        this.f130631G = jSONObject.optString("facebook");
        this.f130632H = jSONObject.optString("facebook_name");
        this.f130633I = jSONObject.optString("livejournal");
        this.f130635K = jSONObject.optString("site");
        StringBuilder sb = new StringBuilder("id");
        sb.append(this.f130511F);
        this.f130640P = jSONObject.optString("screen_name", sb.toString());
        this.f130634J = jSONObject.optString("skype");
        this.f130638N = jSONObject.optString("mobile_phone");
        this.f130639O = jSONObject.optString("home_phone");
        this.f130636L = jSONObject.optString("twitter");
        this.f130637M = jSONObject.optString("instagram");
        this.f130648X = jSONObject.optString("about");
        this.f130642R = jSONObject.optString("activities");
        this.f130646V = jSONObject.optString("books");
        this.f130647W = jSONObject.optString("games");
        this.f130643S = jSONObject.optString("interests");
        this.f130644T = jSONObject.optString("movies");
        this.f130649Y = jSONObject.optString("quotes");
        this.f130645U = jSONObject.optString("tv");
        this.f130641Q = jSONObject.optString("nickname", null);
        this.f130650Z = C52414b.m111969a(jSONObject, "can_post");
        this.f130651aa = C52414b.m111969a(jSONObject, "can_see_all_posts");
        this.f130663am = C52414b.m111969a(jSONObject, "blacklisted_by_me");
        this.f130652ab = C52414b.m111969a(jSONObject, "can_write_private_message");
        this.f130653ac = C52414b.m111969a(jSONObject, "wall_default");
        String optString = jSONObject.optString("deactivated");
        this.f130655ae = "deleted".equals(optString);
        this.f130654ad = "banned".equals(optString);
        this.f130656af = "owner".equals(jSONObject.optString("wall_default"));
        this.f130657ag = C52414b.m111969a(jSONObject, "verified");
        this.f130658ah = jSONObject.optInt("sex");
        JSONObject optJSONObject6 = jSONObject.optJSONObject("counters");
        if (optJSONObject6 != null) {
            this.f130659ai = new Counters(optJSONObject6);
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("occupation");
        if (optJSONObject7 != null) {
            this.f130660aj = new Occupation(optJSONObject7);
        }
        this.f130661ak = jSONObject.optInt("relation");
        if (jSONObject.has("relatives")) {
            if (this.f130662al == null) {
                this.f130662al = new VKList<>();
            }
            this.f130662al.mo109352a(jSONObject.optJSONArray("relatives"), Relative.class);
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f130664o);
        parcel.writeParcelable(this.f130665p, i);
        parcel.writeString(this.f130666q);
        parcel.writeParcelable(this.f130667r, i);
        parcel.writeParcelable(this.f130668s, i);
        parcel.writeLong(this.f130669t);
        parcel.writeParcelable(this.f130670u, i);
        parcel.writeParcelable(this.f130671v, i);
        parcel.writeInt(this.f130672w);
        parcel.writeInt(this.f130673x);
        parcel.writeInt(this.f130674y);
        parcel.writeInt(this.f130675z);
        parcel.writeInt(this.f130627A);
        parcel.writeString(this.f130628B);
        parcel.writeStringArray(this.f130629C);
        parcel.writeString(this.f130630D);
        parcel.writeString(this.f130631G);
        parcel.writeString(this.f130632H);
        parcel.writeString(this.f130633I);
        parcel.writeString(this.f130634J);
        parcel.writeString(this.f130635K);
        parcel.writeString(this.f130636L);
        parcel.writeString(this.f130637M);
        parcel.writeString(this.f130638N);
        parcel.writeString(this.f130639O);
        parcel.writeString(this.f130640P);
        parcel.writeString(this.f130642R);
        parcel.writeString(this.f130643S);
        parcel.writeString(this.f130644T);
        parcel.writeString(this.f130645U);
        parcel.writeString(this.f130646V);
        parcel.writeString(this.f130647W);
        parcel.writeString(this.f130648X);
        parcel.writeString(this.f130649Y);
        parcel.writeByte(this.f130650Z ? (byte) 1 : 0);
        parcel.writeByte(this.f130651aa ? (byte) 1 : 0);
        parcel.writeByte(this.f130652ab ? (byte) 1 : 0);
        parcel.writeByte(this.f130653ac ? (byte) 1 : 0);
        parcel.writeByte(this.f130654ad ? (byte) 1 : 0);
        parcel.writeByte(this.f130655ae ? (byte) 1 : 0);
        parcel.writeByte(this.f130656af ? (byte) 1 : 0);
        parcel.writeByte(this.f130657ag ? (byte) 1 : 0);
        parcel.writeInt(this.f130658ah);
        parcel.writeParcelable(this.f130659ai, i);
        parcel.writeParcelable(this.f130660aj, i);
        parcel.writeInt(this.f130661ak);
        parcel.writeParcelable(this.f130662al, i);
        parcel.writeByte(this.f130663am ? (byte) 1 : 0);
    }
}
