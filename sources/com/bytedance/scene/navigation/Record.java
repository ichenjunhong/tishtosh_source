package com.bytedance.scene.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.p837a.C12837c;
import com.bytedance.scene.p840b.C12864g;

class Record implements Parcelable {
    public static final Creator<Record> CREATOR = new Creator<Record>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Record[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Record(parcel);
        }
    };

    /* renamed from: a */
    C12924i f33879a;

    /* renamed from: b */
    boolean f33880b;

    /* renamed from: c */
    ActivityStatusRecord f33881c;

    /* renamed from: d */
    C12837c f33882d;

    /* renamed from: e */
    Object f33883e;

    /* renamed from: f */
    C12864g f33884f;

    /* renamed from: g */
    String f33885g;

    public Record() {
    }

    public int describeContents() {
        return 0;
    }

    protected Record(Parcel parcel) {
        boolean z;
        this.f33881c = (ActivityStatusRecord) parcel.readParcelable(ActivityStatusRecord.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f33880b = z;
        this.f33885g = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f33881c, i);
        parcel.writeByte(this.f33880b ? (byte) 1 : 0);
        parcel.writeString(this.f33885g);
    }
}
