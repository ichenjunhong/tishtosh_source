package com.p683ss.android.ugc.gamora.recorder.localmedia;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument */
public final class LocalMediaArgument implements Parcelable {
    public static final C49894a CREATOR = new C49894a(null);

    /* renamed from: a */
    public final int f125027a;

    /* renamed from: b */
    public final int f125028b;

    /* renamed from: c */
    public final int f125029c;

    /* renamed from: d */
    public final boolean f125030d;

    /* renamed from: e */
    public final int f125031e;

    /* renamed from: f */
    public final long f125032f;

    /* renamed from: g */
    public final int f125033g;

    /* renamed from: h */
    public final int f125034h;

    /* renamed from: i */
    public final int f125035i;

    /* renamed from: j */
    public final int f125036j;

    /* renamed from: com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument$a */
    public static final class C49894a implements Creator<LocalMediaArgument> {
        private C49894a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LocalMediaArgument[i];
        }

        public /* synthetic */ C49894a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new LocalMediaArgument(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalMediaArgument) {
                LocalMediaArgument localMediaArgument = (LocalMediaArgument) obj;
                if (this.f125027a == localMediaArgument.f125027a) {
                    if (this.f125028b == localMediaArgument.f125028b) {
                        if (this.f125029c == localMediaArgument.f125029c) {
                            if (this.f125030d == localMediaArgument.f125030d) {
                                if (this.f125031e == localMediaArgument.f125031e) {
                                    if (this.f125032f == localMediaArgument.f125032f) {
                                        if (this.f125033g == localMediaArgument.f125033g) {
                                            if (this.f125034h == localMediaArgument.f125034h) {
                                                if (this.f125035i == localMediaArgument.f125035i) {
                                                    if (this.f125036j == localMediaArgument.f125036j) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f125027a * 31) + this.f125028b) * 31) + this.f125029c) * 31;
        boolean z = this.f125030d;
        if (z) {
            z = true;
        }
        int i2 = (((i + (z ? 1 : 0)) * 31) + this.f125031e) * 31;
        long j = this.f125032f;
        return ((((((((i2 + ((int) (j ^ (j >>> 32)))) * 31) + this.f125033g) * 31) + this.f125034h) * 31) + this.f125035i) * 31) + this.f125036j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalMediaArgument(chooseRequestCode=");
        sb.append(this.f125027a);
        sb.append(", requestCode=");
        sb.append(this.f125028b);
        sb.append(", supportFlag=");
        sb.append(this.f125029c);
        sb.append(", enableMultiVideo=");
        sb.append(this.f125030d);
        sb.append(", chooseScene=");
        sb.append(this.f125031e);
        sb.append(", minDuration=");
        sb.append(this.f125032f);
        sb.append(", minPhotoCount=");
        sb.append(this.f125033g);
        sb.append(", maxPhotoCount=");
        sb.append(this.f125034h);
        sb.append(", minVideoCount=");
        sb.append(this.f125035i);
        sb.append(", maxVideoCount=");
        sb.append(this.f125036j);
        sb.append(")");
        return sb.toString();
    }

    public LocalMediaArgument(Parcel parcel) {
        boolean z;
        C52711k.m112240b(parcel, "parcel");
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this(readInt, readInt2, readInt3, z, parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.f125027a);
        parcel.writeInt(this.f125028b);
        parcel.writeInt(this.f125029c);
        parcel.writeByte(this.f125030d ? (byte) 1 : 0);
        parcel.writeInt(this.f125031e);
        parcel.writeLong(this.f125032f);
        parcel.writeInt(this.f125033g);
        parcel.writeInt(this.f125034h);
        parcel.writeInt(this.f125035i);
        parcel.writeInt(this.f125036j);
    }

    public LocalMediaArgument(int i, int i2, int i3, boolean z, int i4, long j, int i5, int i6, int i7, int i8) {
        this.f125027a = i;
        this.f125028b = i2;
        this.f125029c = i3;
        this.f125030d = z;
        this.f125031e = i4;
        this.f125032f = j;
        this.f125033g = i5;
        this.f125034h = i6;
        this.f125035i = i7;
        this.f125036j = i8;
    }
}
