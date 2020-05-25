package com.p683ss.android.ugc.asve.recorder;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.recorder.ASMediaSegment */
public final class ASMediaSegment implements Parcelable {
    public static final C20404a CREATOR = new C20404a(null);

    /* renamed from: a */
    public final long f55945a;

    /* renamed from: b */
    public final double f55946b;

    /* renamed from: com.ss.android.ugc.asve.recorder.ASMediaSegment$a */
    public static final class C20404a implements Creator<ASMediaSegment> {
        private C20404a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ASMediaSegment[i];
        }

        public /* synthetic */ C20404a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new ASMediaSegment(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ASMediaSegment) {
                ASMediaSegment aSMediaSegment = (ASMediaSegment) obj;
                if (!(this.f55945a == aSMediaSegment.f55945a) || Double.compare(this.f55946b, aSMediaSegment.f55946b) != 0) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f55945a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.f55946b);
        return i + ((int) ((doubleToLongBits >>> 32) ^ doubleToLongBits));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ASMediaSegment(duration=");
        sb.append(this.f55945a);
        sb.append(", speed=");
        sb.append(this.f55946b);
        sb.append(")");
        return sb.toString();
    }

    public ASMediaSegment(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this(parcel.readLong(), parcel.readDouble());
    }

    public ASMediaSegment(long j, double d) {
        this.f55945a = j;
        this.f55946b = d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeLong(this.f55945a);
        parcel.writeDouble(this.f55946b);
    }
}
