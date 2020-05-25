package com.p683ss.android.ugc.aweme.main.login.viewmodel;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ugc.aweme.main.login.viewmodel.ProxyUserInfo */
public class ProxyUserInfo implements Parcelable {
    public static final Creator<ProxyUserInfo> CREATOR = new Creator<ProxyUserInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ProxyUserInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ProxyUserInfo(parcel);
        }
    };

    /* renamed from: a */
    public int f93813a;

    /* renamed from: b */
    public String f93814b;

    /* renamed from: c */
    public String f93815c;

    /* renamed from: d */
    public String f93816d;

    /* renamed from: e */
    public String f93817e;

    /* renamed from: f */
    public String f93818f;

    /* renamed from: g */
    public String f93819g;

    /* renamed from: h */
    public Boolean f93820h;

    /* renamed from: i */
    public Boolean f93821i;

    /* renamed from: j */
    public String f93822j;

    public int describeContents() {
        return 0;
    }

    protected ProxyUserInfo(Parcel parcel) {
        this.f93813a = parcel.readInt();
        this.f93814b = parcel.readString();
        this.f93815c = parcel.readString();
        this.f93816d = parcel.readString();
        this.f93817e = parcel.readString();
        this.f93818f = parcel.readString();
        this.f93819g = parcel.readString();
        this.f93820h = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.f93821i = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
        this.f93822j = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f93813a);
        parcel.writeString(this.f93814b);
        parcel.writeString(this.f93815c);
        parcel.writeString(this.f93816d);
        parcel.writeString(this.f93817e);
        parcel.writeString(this.f93818f);
        parcel.writeString(this.f93819g);
        parcel.writeValue(this.f93820h);
        parcel.writeValue(this.f93821i);
        parcel.writeString(this.f93822j);
    }
}
