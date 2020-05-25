package com.p683ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ttvecamera.TEFrameSizei */
public class TEFrameSizei implements Parcelable {
    public static final Creator<TEFrameSizei> CREATOR = new Creator<TEFrameSizei>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TEFrameSizei[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new TEFrameSizei(parcel);
        }
    };

    /* renamed from: a */
    public int f55398a = 720;

    /* renamed from: b */
    public int f55399b = 1280;

    public int describeContents() {
        return 0;
    }

    public TEFrameSizei() {
    }

    /* renamed from: a */
    public final boolean mo42655a() {
        if (this.f55398a <= 0 || this.f55399b <= 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f55398a * 65537) + 1 + this.f55399b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55398a);
        sb.append("x");
        sb.append(this.f55399b);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameSizei)) {
            return false;
        }
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        if (this.f55398a == tEFrameSizei.f55398a && this.f55399b == tEFrameSizei.f55399b) {
            return true;
        }
        return false;
    }

    protected TEFrameSizei(Parcel parcel) {
        this.f55398a = parcel.readInt();
        this.f55399b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f55398a);
        parcel.writeInt(this.f55399b);
    }

    public TEFrameSizei(int i, int i2) {
        this.f55398a = i;
        this.f55399b = i2;
    }
}
