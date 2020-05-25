package com.p683ss.android.ugc.aweme.account.login.authorize.platforms;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.platforms.ThirdPartyAuthInfo */
public class ThirdPartyAuthInfo implements Parcelable {
    public static final Creator<ThirdPartyAuthInfo> CREATOR = new Creator<ThirdPartyAuthInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ThirdPartyAuthInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ThirdPartyAuthInfo(parcel);
        }
    };

    /* renamed from: a */
    public String f57326a;

    /* renamed from: b */
    public long f57327b;

    /* renamed from: c */
    public String f57328c;

    /* renamed from: d */
    public String f57329d;

    /* renamed from: e */
    public String f57330e;

    /* renamed from: f */
    public int f57331f = -1;

    /* renamed from: g */
    public String f57332g = "";

    /* renamed from: h */
    public String f57333h = "";

    /* renamed from: i */
    public String f57334i = "";

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ThirdPartyAuthInfo{token='");
        sb.append(this.f57326a);
        sb.append('\'');
        sb.append(", expires=");
        sb.append(this.f57327b);
        sb.append(", uid='");
        sb.append(this.f57328c);
        sb.append('\'');
        sb.append(", code='");
        sb.append(this.f57329d);
        sb.append('\'');
        sb.append(", secret='");
        sb.append(this.f57330e);
        sb.append('\'');
        sb.append(", verifyType=");
        sb.append(this.f57331f);
        sb.append(", verifyTicket='");
        sb.append(this.f57332g);
        sb.append('\'');
        sb.append(", platform='");
        sb.append(this.f57333h);
        sb.append('\'');
        sb.append(", profileKey='");
        sb.append(this.f57334i);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    protected ThirdPartyAuthInfo(Parcel parcel) {
        this.f57326a = parcel.readString();
        this.f57327b = parcel.readLong();
        this.f57328c = parcel.readString();
        this.f57329d = parcel.readString();
        this.f57330e = parcel.readString();
        this.f57331f = parcel.readInt();
        this.f57332g = parcel.readString();
        this.f57333h = parcel.readString();
        this.f57334i = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57326a);
        parcel.writeLong(this.f57327b);
        parcel.writeString(this.f57328c);
        parcel.writeString(this.f57329d);
        parcel.writeString(this.f57330e);
        parcel.writeInt(this.f57331f);
        parcel.writeString(this.f57332g);
        parcel.writeString(this.f57333h);
        parcel.writeString(this.f57334i);
    }
}
