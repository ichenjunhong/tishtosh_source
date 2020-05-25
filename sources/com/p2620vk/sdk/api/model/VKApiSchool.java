package com.p2620vk.sdk.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.C2240a;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.model.VKApiSchool */
public class VKApiSchool extends VKApiModel implements Parcelable, C52413a {
    public static Creator<VKApiSchool> CREATOR = new Creator<VKApiSchool>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VKApiSchool[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VKApiSchool(parcel);
        }
    };

    /* renamed from: a */
    public int f130590a;

    /* renamed from: b */
    public int f130591b;

    /* renamed from: c */
    public int f130592c;

    /* renamed from: d */
    public String f130593d;

    /* renamed from: e */
    public int f130594e;

    /* renamed from: f */
    public int f130595f;

    /* renamed from: g */
    public int f130596g;

    /* renamed from: h */
    public String f130597h;

    /* renamed from: i */
    public String f130598i;

    /* renamed from: j */
    private String f130599j;

    public VKApiSchool() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        if (this.f130599j == null) {
            StringBuilder sb = new StringBuilder(this.f130593d);
            if (this.f130596g != 0) {
                sb.append(" '");
                sb.append(C2240a.m6772a("%02d", new Object[]{Integer.valueOf(this.f130596g % 100)}));
            }
            if (!(this.f130594e == 0 || this.f130595f == 0)) {
                sb.append(", ");
                sb.append(this.f130594e);
                sb.append('-');
                sb.append(this.f130595f);
            }
            if (!TextUtils.isEmpty(this.f130597h)) {
                sb.append('(');
                sb.append(this.f130597h);
                sb.append(')');
            }
            if (!TextUtils.isEmpty(this.f130598i)) {
                sb.append(", ");
                sb.append(this.f130598i);
            }
            this.f130599j = sb.toString();
        }
        return this.f130599j;
    }

    public VKApiSchool(Parcel parcel) {
        this.f130590a = parcel.readInt();
        this.f130591b = parcel.readInt();
        this.f130592c = parcel.readInt();
        this.f130593d = parcel.readString();
        this.f130594e = parcel.readInt();
        this.f130595f = parcel.readInt();
        this.f130596g = parcel.readInt();
        this.f130597h = parcel.readString();
        this.f130598i = parcel.readString();
    }

    /* renamed from: b */
    public final /* synthetic */ VKApiModel mo109175b(JSONObject jSONObject) throws JSONException {
        this.f130590a = jSONObject.optInt("id");
        this.f130591b = jSONObject.optInt("country_id");
        this.f130592c = jSONObject.optInt("city_id");
        this.f130593d = jSONObject.optString(LeakCanaryFileProvider.f132049i);
        this.f130594e = jSONObject.optInt("year_from");
        this.f130595f = jSONObject.optInt("year_to");
        this.f130596g = jSONObject.optInt("year_graduated");
        this.f130597h = jSONObject.optString("class");
        this.f130598i = jSONObject.optString("speciality");
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f130590a);
        parcel.writeInt(this.f130591b);
        parcel.writeInt(this.f130592c);
        parcel.writeString(this.f130593d);
        parcel.writeInt(this.f130594e);
        parcel.writeInt(this.f130595f);
        parcel.writeInt(this.f130596g);
        parcel.writeString(this.f130597h);
        parcel.writeString(this.f130598i);
    }
}
