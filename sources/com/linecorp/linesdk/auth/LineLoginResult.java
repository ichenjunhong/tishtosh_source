package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.linecorp.linesdk.C18233b;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;

public class LineLoginResult implements Parcelable {
    public static final Creator<LineLoginResult> CREATOR = new Creator<LineLoginResult>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LineLoginResult[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LineLoginResult(parcel);
        }
    };

    /* renamed from: a */
    public static final LineLoginResult f50294a = new LineLoginResult(C18233b.CANCEL, LineApiError.f50227a);

    /* renamed from: b */
    public final C18233b f50295b;

    /* renamed from: c */
    public final LineProfile f50296c;

    /* renamed from: d */
    public final LineCredential f50297d;

    /* renamed from: e */
    public final LineApiError f50298e;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f50295b.hashCode() * 31;
        int i2 = 0;
        if (this.f50296c != null) {
            i = this.f50296c.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        if (this.f50297d != null) {
            i2 = this.f50297d.hashCode();
        }
        return ((i3 + i2) * 31) + this.f50298e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineLoginResult{errorData=");
        sb.append(this.f50298e);
        sb.append(", responseCode=");
        sb.append(this.f50295b);
        sb.append(", lineProfile=");
        sb.append(this.f50296c);
        sb.append(", lineCredential=");
        sb.append(this.f50297d);
        sb.append('}');
        return sb.toString();
    }

    private LineLoginResult(Parcel parcel) {
        this.f50295b = (C18233b) parcel.readSerializable();
        this.f50296c = (LineProfile) parcel.readParcelable(LineProfile.class.getClassLoader());
        this.f50297d = (LineCredential) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        this.f50298e = (LineApiError) parcel.readParcelable(LineApiError.class.getClassLoader());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineLoginResult lineLoginResult = (LineLoginResult) obj;
        if (this.f50295b != lineLoginResult.f50295b) {
            return false;
        }
        if (this.f50296c == null ? lineLoginResult.f50296c != null : !this.f50296c.equals(lineLoginResult.f50296c)) {
            return false;
        }
        if (this.f50297d == null ? lineLoginResult.f50297d == null : this.f50297d.equals(lineLoginResult.f50297d)) {
            return this.f50298e.equals(lineLoginResult.f50298e);
        }
        return false;
    }

    public LineLoginResult(LineProfile lineProfile, LineCredential lineCredential) {
        this(C18233b.SUCCESS, lineProfile, lineCredential, LineApiError.f50227a);
    }

    public LineLoginResult(C18233b bVar, LineApiError lineApiError) {
        this(bVar, null, null, lineApiError);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f50295b);
        parcel.writeParcelable(this.f50296c, i);
        parcel.writeParcelable(this.f50297d, i);
        parcel.writeParcelable(this.f50298e, i);
    }

    private LineLoginResult(C18233b bVar, LineProfile lineProfile, LineCredential lineCredential, LineApiError lineApiError) {
        this.f50295b = bVar;
        this.f50296c = lineProfile;
        this.f50297d = lineCredential;
        this.f50298e = lineApiError;
    }
}
