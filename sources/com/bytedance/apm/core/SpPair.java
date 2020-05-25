package com.bytedance.apm.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class SpPair implements Parcelable {
    public static final Creator<SpPair> CREATOR = new Creator<SpPair>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SpPair[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SpPair(parcel);
        }
    };

    /* renamed from: a */
    public String f24468a;

    /* renamed from: b */
    public Object f24469b;

    public int describeContents() {
        return 0;
    }

    protected SpPair(Parcel parcel) {
        this.f24468a = parcel.readString();
        this.f24469b = parcel.readValue(getClass().getClassLoader());
    }

    public SpPair(String str, Object obj) {
        this.f24468a = str;
        this.f24469b = obj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24468a);
        parcel.writeValue(this.f24469b);
    }
}
