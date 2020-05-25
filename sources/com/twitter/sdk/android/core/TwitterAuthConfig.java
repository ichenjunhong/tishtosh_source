package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class TwitterAuthConfig implements Parcelable {
    public static final Creator<TwitterAuthConfig> CREATOR = new Creator<TwitterAuthConfig>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TwitterAuthConfig[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TwitterAuthConfig(parcel);
        }
    };

    /* renamed from: a */
    public final String f129647a;

    /* renamed from: b */
    public final String f129648b;

    public int describeContents() {
        return 0;
    }

    private TwitterAuthConfig(Parcel parcel) {
        this.f129647a = parcel.readString();
        this.f129648b = parcel.readString();
    }

    /* renamed from: a */
    private static String m111381a(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f129647a);
        parcel.writeString(this.f129648b);
    }

    public TwitterAuthConfig(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
        }
        this.f129647a = m111381a(str);
        this.f129648b = m111381a(str2);
    }
}
