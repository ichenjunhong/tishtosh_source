package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LineAccessToken implements Parcelable {
    public static final Creator<LineAccessToken> CREATOR = new Creator<LineAccessToken>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LineAccessToken[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LineAccessToken(parcel);
        }
    };

    /* renamed from: a */
    public final String f50224a;

    /* renamed from: b */
    public final long f50225b;

    /* renamed from: c */
    public final long f50226c;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((this.f50224a.hashCode() * 31) + ((int) (this.f50225b ^ (this.f50225b >>> 32)))) * 31) + ((int) (this.f50226c ^ (this.f50226c >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineAccessToken{accessToken='#####', expiresInMillis=");
        sb.append(this.f50225b);
        sb.append(", issuedClientTimeMillis=");
        sb.append(this.f50226c);
        sb.append('}');
        return sb.toString();
    }

    private LineAccessToken(Parcel parcel) {
        this.f50224a = parcel.readString();
        this.f50225b = parcel.readLong();
        this.f50226c = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAccessToken lineAccessToken = (LineAccessToken) obj;
        if (this.f50225b == lineAccessToken.f50225b && this.f50226c == lineAccessToken.f50226c) {
            return this.f50224a.equals(lineAccessToken.f50224a);
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50224a);
        parcel.writeLong(this.f50225b);
        parcel.writeLong(this.f50226c);
    }

    public LineAccessToken(String str, long j, long j2) {
        this.f50224a = str;
        this.f50225b = j;
        this.f50226c = j2;
    }
}
