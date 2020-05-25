package com.p683ss.android.socialbase.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: com.ss.android.socialbase.downloader.model.HttpHeader */
public class HttpHeader implements Parcelable, Comparable {
    public static final Creator<HttpHeader> CREATOR = new Creator<HttpHeader>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new HttpHeader[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new HttpHeader(parcel);
        }
    };

    /* renamed from: a */
    public final String f55085a;

    /* renamed from: b */
    public final String f55086b;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (this.f55085a == null) {
            i = 0;
        } else {
            i = this.f55085a.hashCode();
        }
        int i3 = i * 31;
        if (this.f55086b != null) {
            i2 = this.f55086b.hashCode();
        }
        return i3 + i2;
    }

    protected HttpHeader(Parcel parcel) {
        this.f55085a = parcel.readString();
        this.f55086b = parcel.readString();
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof HttpHeader)) {
            return 1;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if (TextUtils.equals(this.f55085a, httpHeader.f55085a)) {
            return 0;
        }
        if (this.f55085a == null) {
            return -1;
        }
        int compareTo = this.f55085a.compareTo(httpHeader.f55085a);
        if (compareTo > 0) {
            return 1;
        }
        if (compareTo < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if (!TextUtils.equals(this.f55085a, httpHeader.f55085a) || !TextUtils.equals(this.f55086b, httpHeader.f55086b)) {
            return false;
        }
        return true;
    }

    public HttpHeader(String str, String str2) {
        this.f55085a = str;
        this.f55086b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f55085a);
        parcel.writeString(this.f55086b);
    }
}
