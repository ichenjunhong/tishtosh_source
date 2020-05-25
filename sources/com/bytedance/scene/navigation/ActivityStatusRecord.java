package com.bytedance.scene.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class ActivityStatusRecord implements Parcelable {
    public static final Creator<ActivityStatusRecord> CREATOR = new Creator<ActivityStatusRecord>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ActivityStatusRecord[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ActivityStatusRecord(parcel);
        }
    };

    /* renamed from: a */
    int f33867a;

    /* renamed from: b */
    int f33868b;

    /* renamed from: c */
    int f33869c;

    /* renamed from: d */
    int f33870d;

    /* renamed from: e */
    int f33871e;

    /* renamed from: f */
    int f33872f;

    ActivityStatusRecord() {
    }

    public int describeContents() {
        return 0;
    }

    protected ActivityStatusRecord(Parcel parcel) {
        this.f33867a = parcel.readInt();
        this.f33868b = parcel.readInt();
        this.f33869c = parcel.readInt();
        this.f33870d = parcel.readInt();
        this.f33871e = parcel.readInt();
        this.f33872f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33867a);
        parcel.writeInt(this.f33868b);
        parcel.writeInt(this.f33869c);
        parcel.writeInt(this.f33870d);
        parcel.writeInt(this.f33871e);
        parcel.writeInt(this.f33872f);
    }
}
