package com.p683ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.vesdk.VESize */
public class VESize implements Parcelable {
    public static final Creator<VESize> CREATOR = new Creator<VESize>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VESize[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VESize(parcel);
        }
    };
    public int height = 1280;
    public int width = 720;

    public int describeContents() {
        return 0;
    }

    public boolean isValid() {
        if (this.width <= 0 || this.height <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.width);
        sb.append("*");
        sb.append(this.height);
        return sb.toString();
    }

    protected VESize(Parcel parcel) {
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VESize)) {
            return false;
        }
        VESize vESize = (VESize) obj;
        if (this.width == vESize.width && this.height == vESize.height) {
            return true;
        }
        return false;
    }

    public VESize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
