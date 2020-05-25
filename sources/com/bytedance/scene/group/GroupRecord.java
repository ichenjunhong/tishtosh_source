package com.bytedance.scene.group;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.p841c.C12880l;

class GroupRecord implements Parcelable {
    public static final Creator<GroupRecord> CREATOR = new Creator<GroupRecord>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new GroupRecord[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new GroupRecord(parcel);
        }
    };

    /* renamed from: a */
    int f33741a = -1;

    /* renamed from: b */
    C12924i f33742b;

    /* renamed from: c */
    String f33743c;

    /* renamed from: d */
    public boolean f33744d;

    /* renamed from: e */
    boolean f33745e;

    /* renamed from: f */
    String f33746f;

    /* renamed from: g */
    Bundle f33747g;

    public int describeContents() {
        return 0;
    }

    public GroupRecord() {
    }

    protected GroupRecord(Parcel parcel) {
        boolean z;
        this.f33741a = parcel.readInt();
        this.f33743c = (String) C12880l.m25801a(parcel.readString(), "tag not found in Parcel");
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f33744d = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f33745e = z2;
        this.f33746f = (String) C12880l.m25801a(parcel.readString(), "class name not found in Parcel");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f33741a);
        parcel.writeString(this.f33743c);
        parcel.writeByte(this.f33744d ? (byte) 1 : 0);
        parcel.writeByte(this.f33745e ? (byte) 1 : 0);
        parcel.writeString(this.f33746f);
    }
}
