package com.bytedance.ttnet.hostmonitor;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.C17971f;

public class HostStatus implements Parcelable {
    public static final Creator<HostStatus> CREATOR = new Creator<HostStatus>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new HostStatus[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new HostStatus(parcel);
        }
    };

    /* renamed from: a */
    public String f34819a;

    /* renamed from: b */
    public int f34820b;

    /* renamed from: c */
    public boolean f34821c;

    /* renamed from: d */
    public boolean f34822d;

    /* renamed from: e */
    public C13346a f34823e;

    /* renamed from: f */
    public C13346a f34824f;

    public HostStatus() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return new C17971f().mo34889b(this);
    }

    /* renamed from: a */
    public final HostStatus mo24950a(int i) {
        this.f34820b = i;
        return this;
    }

    /* renamed from: b */
    public final HostStatus mo24954b(C13346a aVar) {
        this.f34823e = aVar;
        return this;
    }

    /* renamed from: a */
    public final HostStatus mo24951a(C13346a aVar) {
        this.f34824f = aVar;
        return this;
    }

    /* renamed from: b */
    public final HostStatus mo24955b(boolean z) {
        this.f34822d = z;
        return this;
    }

    /* renamed from: a */
    public final HostStatus mo24952a(String str) {
        this.f34819a = str;
        return this;
    }

    /* renamed from: a */
    public final HostStatus mo24953a(boolean z) {
        this.f34821c = z;
        return this;
    }

    private HostStatus(Parcel parcel) {
        boolean z;
        this.f34819a = parcel.readString();
        this.f34820b = parcel.readInt();
        boolean z2 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f34821c = z;
        if (parcel.readInt() == 1) {
            z2 = true;
        }
        this.f34822d = z2;
        this.f34824f = C13346a.values()[parcel.readInt()];
        this.f34823e = C13346a.values()[parcel.readInt()];
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f34819a);
        parcel.writeInt(this.f34820b);
        parcel.writeInt(this.f34821c ? 1 : 0);
        parcel.writeInt(this.f34822d ? 1 : 0);
        parcel.writeInt(this.f34824f.ordinal());
        parcel.writeInt(this.f34823e.ordinal());
    }
}
