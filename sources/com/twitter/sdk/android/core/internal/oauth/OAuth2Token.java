package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.p1076a.C17952c;
import com.twitter.sdk.android.core.C52067a;

public class OAuth2Token extends C52067a implements Parcelable {
    public static final Creator<OAuth2Token> CREATOR = new Creator<OAuth2Token>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OAuth2Token[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new OAuth2Token(parcel);
        }
    };
    @C17952c(mo34828a = "token_type")

    /* renamed from: c */
    public final String f129758c;
    @C17952c(mo34828a = "access_token")

    /* renamed from: d */
    public final String f129759d;

    /* renamed from: a */
    public boolean mo108827a() {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.f129758c != null) {
            i = this.f129758c.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.f129759d != null) {
            i2 = this.f129759d.hashCode();
        }
        return i3 + i2;
    }

    private OAuth2Token(Parcel parcel) {
        this.f129758c = parcel.readString();
        this.f129759d = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OAuth2Token oAuth2Token = (OAuth2Token) obj;
        if (this.f129759d == null ? oAuth2Token.f129759d != null : !this.f129759d.equals(oAuth2Token.f129759d)) {
            return false;
        }
        if (this.f129758c == null ? oAuth2Token.f129758c == null : this.f129758c.equals(oAuth2Token.f129758c)) {
            return true;
        }
        return false;
    }

    public OAuth2Token(String str, String str2) {
        this.f129758c = str;
        this.f129759d = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f129758c);
        parcel.writeString(this.f129759d);
    }
}
