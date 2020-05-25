package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;

public class TwitterAuthToken extends C52067a implements Parcelable {
    public static final Creator<TwitterAuthToken> CREATOR = new Creator<TwitterAuthToken>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TwitterAuthToken[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TwitterAuthToken(parcel);
        }
    };
    @C17952c(mo34828a = "token")

    /* renamed from: b */
    public final String f129649b;
    @C17952c(mo34828a = "secret")

    /* renamed from: c */
    public final String f129650c;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.f129649b != null) {
            i = this.f129649b.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.f129650c != null) {
            i2 = this.f129650c.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("token=");
        sb.append(this.f129649b);
        sb.append(",secret=");
        sb.append(this.f129650c);
        return sb.toString();
    }

    private TwitterAuthToken(Parcel parcel) {
        this.f129649b = parcel.readString();
        this.f129650c = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterAuthToken)) {
            return false;
        }
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) obj;
        if (this.f129650c == null ? twitterAuthToken.f129650c != null : !this.f129650c.equals(twitterAuthToken.f129650c)) {
            return false;
        }
        if (this.f129649b == null ? twitterAuthToken.f129649b == null : this.f129649b.equals(twitterAuthToken.f129649b)) {
            return true;
        }
        return false;
    }

    public TwitterAuthToken(String str, String str2) {
        this.f129649b = str;
        this.f129650c = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f129649b);
        parcel.writeString(this.f129650c);
    }
}
