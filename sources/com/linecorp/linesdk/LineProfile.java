package com.linecorp.linesdk;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LineProfile implements Parcelable {
    public static final Creator<LineProfile> CREATOR = new Creator<LineProfile>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LineProfile[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LineProfile(parcel);
        }
    };

    /* renamed from: a */
    public final String f50232a;

    /* renamed from: b */
    public final String f50233b;

    /* renamed from: c */
    public final Uri f50234c;

    /* renamed from: d */
    public final String f50235d;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f50232a.hashCode() * 31) + this.f50233b.hashCode()) * 31;
        int i2 = 0;
        if (this.f50234c != null) {
            i = this.f50234c.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        if (this.f50235d != null) {
            i2 = this.f50235d.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineProfile{displayName='");
        sb.append(this.f50233b);
        sb.append('\'');
        sb.append(", userId='");
        sb.append(this.f50232a);
        sb.append('\'');
        sb.append(", pictureUrl='");
        sb.append(this.f50234c);
        sb.append('\'');
        sb.append(", statusMessage='");
        sb.append(this.f50235d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    private LineProfile(Parcel parcel) {
        this.f50232a = parcel.readString();
        this.f50233b = parcel.readString();
        this.f50234c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f50235d = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineProfile lineProfile = (LineProfile) obj;
        if (!this.f50232a.equals(lineProfile.f50232a) || !this.f50233b.equals(lineProfile.f50233b)) {
            return false;
        }
        if (this.f50234c == null ? lineProfile.f50234c != null : !this.f50234c.equals(lineProfile.f50234c)) {
            return false;
        }
        if (this.f50235d != null) {
            return this.f50235d.equals(lineProfile.f50235d);
        }
        if (lineProfile.f50235d == null) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f50232a);
        parcel.writeString(this.f50233b);
        parcel.writeParcelable(this.f50234c, i);
        parcel.writeString(this.f50235d);
    }

    public LineProfile(String str, String str2, Uri uri, String str3) {
        this.f50232a = str;
        this.f50233b = str2;
        this.f50234c = uri;
        this.f50235d = str3;
    }
}
