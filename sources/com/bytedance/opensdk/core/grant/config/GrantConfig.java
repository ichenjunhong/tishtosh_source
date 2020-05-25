package com.bytedance.opensdk.core.grant.config;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.opensdk.core.C12480a;
import com.bytedance.opensdk.core.base.config.AppConfig;
import com.bytedance.opensdk.core.grant.model.GrantInfo;
import java.util.Locale;
import p2628d.p2639f.p2641b.C52711k;

public final class GrantConfig implements Parcelable {
    public static final Creator CREATOR = new C12519a();

    /* renamed from: a */
    public final int f32868a;

    /* renamed from: b */
    public final AppConfig f32869b;

    /* renamed from: c */
    public final GrantInfo f32870c;

    /* renamed from: d */
    public final String f32871d;

    /* renamed from: e */
    public final C12480a f32872e;

    /* renamed from: f */
    public final Locale f32873f;

    /* renamed from: com.bytedance.opensdk.core.grant.config.GrantConfig$a */
    public static class C12519a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            GrantConfig grantConfig = new GrantConfig(parcel.readInt(), (AppConfig) AppConfig.CREATOR.createFromParcel(parcel), (GrantInfo) GrantInfo.CREATOR.createFromParcel(parcel), parcel.readString(), (C12480a) Enum.valueOf(C12480a.class, parcel.readString()), (Locale) parcel.readSerializable());
            return grantConfig;
        }

        public final Object[] newArray(int i) {
            return new GrantConfig[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.f32868a);
        this.f32869b.writeToParcel(parcel, 0);
        this.f32870c.writeToParcel(parcel, 0);
        parcel.writeString(this.f32871d);
        parcel.writeString(this.f32872e.name());
        parcel.writeSerializable(this.f32873f);
    }

    public GrantConfig(int i, AppConfig appConfig, GrantInfo grantInfo, String str, C12480a aVar, Locale locale) {
        C52711k.m112240b(appConfig, "appConfig");
        C52711k.m112240b(grantInfo, "grantInfo");
        C52711k.m112240b(str, "hostAuthCode");
        C52711k.m112240b(aVar, "apiInfo");
        C52711k.m112240b(locale, "appLocale");
        this.f32868a = i;
        this.f32869b = appConfig;
        this.f32870c = grantInfo;
        this.f32871d = str;
        this.f32872e = aVar;
        this.f32873f = locale;
    }
}
