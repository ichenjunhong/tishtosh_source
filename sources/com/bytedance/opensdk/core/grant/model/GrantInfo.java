package com.bytedance.opensdk.core.grant.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p2628d.p2639f.p2641b.C52711k;

public final class GrantInfo implements Parcelable {
    public static final Creator CREATOR = new C12520a();

    /* renamed from: a */
    public final String f32874a;

    /* renamed from: b */
    public final String f32875b;

    /* renamed from: c */
    public final int f32876c;

    /* renamed from: d */
    public final int f32877d;

    /* renamed from: com.bytedance.opensdk.core.grant.model.GrantInfo$a */
    public static class C12520a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            return new GrantInfo(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new GrantInfo[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.f32874a);
        parcel.writeString(this.f32875b);
        parcel.writeInt(this.f32876c);
        parcel.writeInt(this.f32877d);
    }

    public GrantInfo(String str, String str2, int i, int i2) {
        C52711k.m112240b(str, "grantName");
        C52711k.m112240b(str2, "grantIcon");
        this.f32874a = str;
        this.f32875b = str2;
        this.f32876c = i;
        this.f32877d = i2;
    }
}
