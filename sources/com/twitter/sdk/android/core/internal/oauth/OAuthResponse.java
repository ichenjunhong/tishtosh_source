package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.twitter.sdk.android.core.TwitterAuthToken;

public class OAuthResponse implements Parcelable {
    public static final Creator<OAuthResponse> CREATOR = new Creator<OAuthResponse>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OAuthResponse[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new OAuthResponse(parcel);
        }
    };

    /* renamed from: a */
    public final TwitterAuthToken f129760a;

    /* renamed from: b */
    public final String f129761b;

    /* renamed from: c */
    public final long f129762c;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("authToken=");
        sb.append(this.f129760a);
        sb.append(",userName=");
        sb.append(this.f129761b);
        sb.append(",userId=");
        sb.append(this.f129762c);
        return sb.toString();
    }

    private OAuthResponse(Parcel parcel) {
        this.f129760a = (TwitterAuthToken) parcel.readParcelable(TwitterAuthToken.class.getClassLoader());
        this.f129761b = parcel.readString();
        this.f129762c = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f129760a, i);
        parcel.writeString(this.f129761b);
        parcel.writeLong(this.f129762c);
    }

    public OAuthResponse(TwitterAuthToken twitterAuthToken, String str, long j) {
        this.f129760a = twitterAuthToken;
        this.f129761b = str;
        this.f129762c = j;
    }
}
