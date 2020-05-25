package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class IntegerParcelable implements Parcelable {
    public static final Creator<IntegerParcelable> CREATOR = new Creator<IntegerParcelable>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new IntegerParcelable[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new IntegerParcelable(parcel);
        }
    };

    /* renamed from: a */
    public final int f25918a;

    public int describeContents() {
        return 0;
    }

    public IntegerParcelable(int i) {
        this.f25918a = i;
    }

    protected IntegerParcelable(Parcel parcel) {
        this.f25918a = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25918a);
    }
}
