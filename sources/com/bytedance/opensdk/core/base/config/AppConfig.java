package com.bytedance.opensdk.core.base.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Locale;
import p2628d.p2639f.p2641b.C52711k;

public final class AppConfig implements Parcelable {
    public static final Creator CREATOR = new C12503a();

    /* renamed from: a */
    public final String f32829a;

    /* renamed from: b */
    public final String f32830b;

    /* renamed from: c */
    public final int f32831c;

    /* renamed from: d */
    public final String f32832d;

    /* renamed from: e */
    public final String f32833e;

    /* renamed from: f */
    public final String f32834f;

    /* renamed from: g */
    public Locale f32835g;

    /* renamed from: com.bytedance.opensdk.core.base.config.AppConfig$a */
    public static class C12503a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            AppConfig appConfig = new AppConfig(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), (Locale) parcel.readSerializable());
            return appConfig;
        }

        public final Object[] newArray(int i) {
            return new AppConfig[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f32829a);
        parcel.writeString(this.f32830b);
        parcel.writeInt(this.f32831c);
        parcel.writeString(this.f32832d);
        parcel.writeString(this.f32833e);
        parcel.writeString(this.f32834f);
        parcel.writeSerializable(this.f32835g);
    }

    public AppConfig(String str, String str2, int i, String str3, String str4, String str5, Locale locale) {
        C52711k.m112240b(str, "appName");
        C52711k.m112240b(str2, "appIcon");
        C52711k.m112240b(str3, "platformAppId");
        C52711k.m112240b(str4, "platform");
        C52711k.m112240b(str5, "deviceId");
        C52711k.m112240b(locale, "appLocale");
        this.f32829a = str;
        this.f32830b = str2;
        this.f32831c = i;
        this.f32832d = str3;
        this.f32833e = str4;
        this.f32834f = str5;
        this.f32835g = locale;
    }
}
