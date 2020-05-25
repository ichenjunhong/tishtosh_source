package com.linecorp.linesdk.auth;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class LineAuthenticationConfig implements Parcelable {
    public static final Creator<LineAuthenticationConfig> CREATOR = new Creator<LineAuthenticationConfig>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LineAuthenticationConfig[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LineAuthenticationConfig(parcel);
        }
    };

    /* renamed from: f */
    private static int f50282f = 1;

    /* renamed from: g */
    private static int f50283g = 2;

    /* renamed from: a */
    public final String f50284a;

    /* renamed from: b */
    public final Uri f50285b;

    /* renamed from: c */
    public final Uri f50286c;

    /* renamed from: d */
    public final boolean f50287d;

    /* renamed from: e */
    public final boolean f50288e;

    /* renamed from: com.linecorp.linesdk.auth.LineAuthenticationConfig$a */
    public static class C18219a {

        /* renamed from: a */
        public final String f50289a;

        /* renamed from: b */
        public Uri f50290b;

        /* renamed from: c */
        public Uri f50291c;

        /* renamed from: d */
        public boolean f50292d;

        /* renamed from: e */
        public boolean f50293e;

        public C18219a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f50289a = str;
                this.f50290b = Uri.parse("https://access.line.me/v2");
                this.f50291c = Uri.parse("https://access.line.me/dialog/oauth/weblogin");
                return;
            }
            throw new IllegalArgumentException("channelId is empty.");
        }
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (((((((this.f50284a.hashCode() * 31) + this.f50285b.hashCode()) * 31) + this.f50286c.hashCode()) * 31) + (this.f50287d ? 1 : 0)) * 31) + (this.f50288e ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineAuthenticationConfig{channelId=");
        sb.append(this.f50284a);
        sb.append(", endPointBaseUrl=");
        sb.append(this.f50285b);
        sb.append(", webLoginPageUrl=");
        sb.append(this.f50286c);
        sb.append(", isLineAppAuthenticationDisabled=");
        sb.append(this.f50287d);
        sb.append(", isEncryptorPreparationDisabled=");
        sb.append(this.f50288e);
        sb.append('}');
        return sb.toString();
    }

    private LineAuthenticationConfig(C18219a aVar) {
        this.f50284a = aVar.f50289a;
        this.f50285b = aVar.f50290b;
        this.f50286c = aVar.f50291c;
        this.f50287d = aVar.f50292d;
        this.f50288e = aVar.f50293e;
    }

    private LineAuthenticationConfig(Parcel parcel) {
        boolean z;
        this.f50284a = parcel.readString();
        this.f50285b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f50286c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        int readInt = parcel.readInt();
        boolean z2 = false;
        if ((f50282f & readInt) > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f50287d = z;
        if ((readInt & f50283g) > 0) {
            z2 = true;
        }
        this.f50288e = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAuthenticationConfig lineAuthenticationConfig = (LineAuthenticationConfig) obj;
        if (this.f50287d == lineAuthenticationConfig.f50287d && this.f50288e == lineAuthenticationConfig.f50288e && this.f50284a.equals(lineAuthenticationConfig.f50284a) && this.f50285b.equals(lineAuthenticationConfig.f50285b)) {
            return this.f50286c.equals(lineAuthenticationConfig.f50286c);
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeString(this.f50284a);
        parcel.writeParcelable(this.f50285b, i);
        parcel.writeParcelable(this.f50286c, i);
        int i3 = 0;
        if (this.f50287d) {
            i2 = f50282f;
        } else {
            i2 = 0;
        }
        int i4 = i2 | 0;
        if (this.f50288e) {
            i3 = f50283g;
        }
        parcel.writeInt(i4 | i3);
    }
}
