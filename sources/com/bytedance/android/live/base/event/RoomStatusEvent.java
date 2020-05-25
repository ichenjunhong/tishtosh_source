package com.bytedance.android.live.base.event;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class RoomStatusEvent implements Parcelable {
    public static final Creator<RoomStatusEvent> CREATOR = new Creator<RoomStatusEvent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RoomStatusEvent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RoomStatusEvent(parcel);
        }
    };

    /* renamed from: a */
    public long f8660a;

    /* renamed from: b */
    public long f8661b;

    /* renamed from: c */
    public boolean f8662c;

    /* renamed from: d */
    public int f8663d;

    public RoomStatusEvent() {
    }

    public int describeContents() {
        return 0;
    }

    protected RoomStatusEvent(Parcel parcel) {
        boolean z;
        this.f8660a = parcel.readLong();
        this.f8661b = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f8662c = z;
        this.f8663d = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8660a);
        parcel.writeLong(this.f8661b);
        parcel.writeByte(this.f8662c ? (byte) 1 : 0);
        parcel.writeInt(this.f8663d);
    }
}
