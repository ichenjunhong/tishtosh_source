package com.bytedance.jirafast.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class JIRADevice implements Parcelable {
    public static final Creator<JIRADevice> CREATOR = new Creator<JIRADevice>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new JIRADevice[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new JIRADevice(parcel);
        }
    };

    /* renamed from: a */
    public String f31848a;

    /* renamed from: b */
    public String f31849b;

    /* renamed from: c */
    public String f31850c;

    /* renamed from: d */
    public String f31851d;

    /* renamed from: e */
    public String f31852e;

    public JIRADevice() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Device{os='");
        sb.append(this.f31848a);
        sb.append('\'');
        sb.append(", brand='");
        sb.append(this.f31849b);
        sb.append('\'');
        sb.append(", model='");
        sb.append(this.f31850c);
        sb.append('\'');
        sb.append(", osVersion='");
        sb.append(this.f31851d);
        sb.append('\'');
        sb.append(", resolution='");
        sb.append(this.f31852e);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public JIRADevice(Parcel parcel) {
        this.f31848a = parcel.readString();
        this.f31849b = parcel.readString();
        this.f31850c = parcel.readString();
        this.f31851d = parcel.readString();
        this.f31852e = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31848a);
        parcel.writeString(this.f31849b);
        parcel.writeString(this.f31850c);
        parcel.writeString(this.f31851d);
        parcel.writeString(this.f31852e);
    }
}
