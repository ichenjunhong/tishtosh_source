package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p2620vk.sdk.api.model.VKAttachments.VKApiAttachment;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiPoll */
public class VKApiPoll extends VKApiAttachment implements Parcelable {
    public static Creator<VKApiPoll> CREATOR = new Creator<VKApiPoll>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiPoll[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiPoll(parcel);
        }
    };

    /* renamed from: a */
    public int f130558a;

    /* renamed from: b */
    public int f130559b;

    /* renamed from: c */
    public long f130560c;

    /* renamed from: d */
    public String f130561d;

    /* renamed from: e */
    public int f130562e;

    /* renamed from: f */
    public int f130563f;

    /* renamed from: g */
    public VKList<Answer> f130564g;

    /* renamed from: com.vk.sdk.api.model.VKApiPoll$Answer */
    public static final class Answer extends VKApiModel implements Parcelable, C52413a {
        public static Creator<Answer> CREATOR = new Creator<Answer>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new Answer[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Answer(parcel);
            }
        };

        /* renamed from: a */
        public int f130565a;

        /* renamed from: b */
        public String f130566b;

        /* renamed from: c */
        public int f130567c;

        /* renamed from: d */
        public double f130568d;

        public final int describeContents() {
            return 0;
        }

        public Answer(Parcel parcel) {
            this.f130565a = parcel.readInt();
            this.f130566b = parcel.readString();
            this.f130567c = parcel.readInt();
            this.f130568d = parcel.readDouble();
        }

        /* renamed from: b */
        public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
            this.f130565a = jSONObject.optInt("id");
            this.f130566b = jSONObject.optString("text");
            this.f130567c = jSONObject.optInt("votes");
            this.f130568d = jSONObject.optDouble("rate");
            return this;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f130565a);
            parcel.writeString(this.f130566b);
            parcel.writeInt(this.f130567c);
            parcel.writeDouble(this.f130568d);
        }
    }

    public VKApiPoll() {
    }

    /* renamed from: a */
    public final CharSequence mo109174a() {
        return null;
    }

    /* renamed from: b */
    public final String mo109176b() {
        return "poll";
    }

    public int describeContents() {
        return 0;
    }

    public VKApiPoll(Parcel parcel) {
        this.f130558a = parcel.readInt();
        this.f130559b = parcel.readInt();
        this.f130560c = parcel.readLong();
        this.f130561d = parcel.readString();
        this.f130562e = parcel.readInt();
        this.f130563f = parcel.readInt();
        this.f130564g = (VKList) parcel.readParcelable(VKList.class.getClassLoader());
    }

    /* renamed from: a */
    public final VKApiPoll mo109175b(JSONObject jSONObject) {
        this.f130558a = jSONObject.optInt("id");
        this.f130559b = jSONObject.optInt("owner_id");
        this.f130560c = jSONObject.optLong("created");
        this.f130561d = jSONObject.optString("question");
        this.f130562e = jSONObject.optInt("votes");
        this.f130563f = jSONObject.optInt("answer_id");
        this.f130564g = new VKList<>(jSONObject.optJSONArray("answers"), Answer.class);
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130558a);
        parcel.writeInt(this.f130559b);
        parcel.writeLong(this.f130560c);
        parcel.writeString(this.f130561d);
        parcel.writeInt(this.f130562e);
        parcel.writeInt(this.f130563f);
        parcel.writeParcelable(this.f130564g, i);
    }
}
