package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.C2240a;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiUniversity */
public class VKApiUniversity extends VKApiModel implements Parcelable, C52413a {
    public static Creator<VKApiUniversity> CREATOR = new Creator<VKApiUniversity>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiUniversity[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiUniversity(parcel);
        }
    };

    /* renamed from: a */
    public int f130600a;

    /* renamed from: b */
    public int f130601b;

    /* renamed from: c */
    public int f130602c;

    /* renamed from: d */
    public String f130603d;

    /* renamed from: e */
    public String f130604e;

    /* renamed from: f */
    public String f130605f;

    /* renamed from: g */
    public int f130606g;

    /* renamed from: h */
    public String f130607h;

    /* renamed from: i */
    public int f130608i;

    /* renamed from: j */
    public String f130609j;

    /* renamed from: k */
    public String f130610k;

    /* renamed from: l */
    private String f130611l;

    public VKApiUniversity() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        if (this.f130611l == null) {
            StringBuilder sb = new StringBuilder(this.f130603d);
            sb.append(" '");
            sb.append(C2240a.m6772a("%02d", new Object[]{Integer.valueOf(this.f130608i % 100)}));
            if (!TextUtils.isEmpty(this.f130605f)) {
                sb.append(", ");
                sb.append(this.f130605f);
            }
            if (!TextUtils.isEmpty(this.f130607h)) {
                sb.append(", ");
                sb.append(this.f130607h);
            }
            this.f130611l = sb.toString();
        }
        return this.f130611l;
    }

    public VKApiUniversity(Parcel parcel) {
        this.f130600a = parcel.readInt();
        this.f130601b = parcel.readInt();
        this.f130602c = parcel.readInt();
        this.f130603d = parcel.readString();
        this.f130604e = parcel.readString();
        this.f130605f = parcel.readString();
        this.f130606g = parcel.readInt();
        this.f130607h = parcel.readString();
        this.f130608i = parcel.readInt();
        this.f130609j = parcel.readString();
        this.f130610k = parcel.readString();
    }

    /* renamed from: b */
    public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        this.f130600a = jSONObject.optInt("id");
        this.f130601b = jSONObject.optInt("country_id");
        this.f130602c = jSONObject.optInt("city_id");
        this.f130603d = jSONObject.optString(LeakCanaryFileProvider.f132049i);
        this.f130604e = jSONObject.optString("faculty");
        this.f130605f = jSONObject.optString("faculty_name");
        this.f130606g = jSONObject.optInt("chair");
        this.f130607h = jSONObject.optString("chair_name");
        this.f130608i = jSONObject.optInt("graduation");
        this.f130609j = jSONObject.optString("education_form");
        this.f130610k = jSONObject.optString("education_status");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130600a);
        parcel.writeInt(this.f130601b);
        parcel.writeInt(this.f130602c);
        parcel.writeString(this.f130603d);
        parcel.writeString(this.f130604e);
        parcel.writeString(this.f130605f);
        parcel.writeInt(this.f130606g);
        parcel.writeString(this.f130607h);
        parcel.writeInt(this.f130608i);
        parcel.writeString(this.f130609j);
        parcel.writeString(this.f130610k);
    }
}
