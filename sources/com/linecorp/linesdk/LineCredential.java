package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineCredential implements Parcelable {
    public static final Creator<LineCredential> CREATOR = new Creator<LineCredential>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LineCredential[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LineCredential(parcel);
        }
    };

    /* renamed from: a */
    public final LineAccessToken f50230a;

    /* renamed from: b */
    public final List<String> f50231b;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return (this.f50230a.hashCode() * 31) + this.f50231b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LineCredential{accessToken=");
        sb.append("#####");
        sb.append(", permission=");
        sb.append(this.f50231b);
        sb.append('}');
        return sb.toString();
    }

    private LineCredential(Parcel parcel) {
        this.f50230a = (LineAccessToken) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.f50231b = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineCredential lineCredential = (LineCredential) obj;
        if (!this.f50230a.equals(lineCredential.f50230a)) {
            return false;
        }
        return this.f50231b.equals(lineCredential.f50231b);
    }

    public LineCredential(LineAccessToken lineAccessToken, List<String> list) {
        this.f50230a = lineAccessToken;
        this.f50231b = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f50230a, i);
        parcel.writeStringList(this.f50231b);
    }
}
