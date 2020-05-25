package com.p683ss.android.ugc.aweme.shortvideo.upload;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo */
public final class UploadSpeedInfo implements Parcelable, Serializable {
    public static final Creator CREATOR = new C45238a();

    /* renamed from: a */
    private final long f114418a;

    /* renamed from: b */
    private final long f114419b;

    /* renamed from: c */
    private final long f114420c;

    /* renamed from: d */
    private int f114421d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo$a */
    public static class C45238a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            UploadSpeedInfo uploadSpeedInfo = new UploadSpeedInfo(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readInt());
            return uploadSpeedInfo;
        }

        public final Object[] newArray(int i) {
            return new UploadSpeedInfo[i];
        }
    }

    public UploadSpeedInfo() {
        this(0, 0, 0, 0, 15, null);
    }

    public UploadSpeedInfo(long j) {
        this(j, 0, 0, 0, 14, null);
    }

    public UploadSpeedInfo(long j, long j2) {
        this(j, j2, 0, 0, 12, null);
    }

    public UploadSpeedInfo(long j, long j2, long j3) {
        this(j, j2, j3, 0, 8, null);
    }

    public static /* synthetic */ UploadSpeedInfo copy$default(UploadSpeedInfo uploadSpeedInfo, long j, long j2, long j3, int i, int i2, Object obj) {
        UploadSpeedInfo uploadSpeedInfo2 = uploadSpeedInfo;
        return uploadSpeedInfo.copy((i2 & 1) != 0 ? uploadSpeedInfo2.f114418a : j, (i2 & 2) != 0 ? uploadSpeedInfo2.f114419b : j2, (i2 & 4) != 0 ? uploadSpeedInfo2.f114420c : j3, (i2 & 8) != 0 ? uploadSpeedInfo2.f114421d : i);
    }

    public final long component1() {
        return this.f114418a;
    }

    public final long component2() {
        return this.f114419b;
    }

    public final long component3() {
        return this.f114420c;
    }

    public final int component4() {
        return this.f114421d;
    }

    public final UploadSpeedInfo copy(long j, long j2, long j3, int i) {
        UploadSpeedInfo uploadSpeedInfo = new UploadSpeedInfo(j, j2, j3, i);
        return uploadSpeedInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UploadSpeedInfo) {
                UploadSpeedInfo uploadSpeedInfo = (UploadSpeedInfo) obj;
                if (this.f114418a == uploadSpeedInfo.f114418a) {
                    if (this.f114419b == uploadSpeedInfo.f114419b) {
                        if (this.f114420c == uploadSpeedInfo.f114420c) {
                            if (this.f114421d == uploadSpeedInfo.f114421d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final long getEndTime() {
        return this.f114420c;
    }

    public final long getSpeed() {
        return this.f114418a;
    }

    public final long getStartTime() {
        return this.f114419b;
    }

    public final int getUsedCompilerSettingGroup() {
        return this.f114421d;
    }

    public final int hashCode() {
        long j = this.f114418a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f114419b;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f114420c;
        return ((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + this.f114421d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadSpeedInfo(speed=");
        sb.append(this.f114418a);
        sb.append(", startTime=");
        sb.append(this.f114419b);
        sb.append(", endTime=");
        sb.append(this.f114420c);
        sb.append(", usedCompilerSettingGroup=");
        sb.append(this.f114421d);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeLong(this.f114418a);
        parcel.writeLong(this.f114419b);
        parcel.writeLong(this.f114420c);
        parcel.writeInt(this.f114421d);
    }

    public final void setUsedCompilerSettingGroup(int i) {
        this.f114421d = i;
    }

    public UploadSpeedInfo(long j, long j2, long j3, int i) {
        this.f114418a = j;
        this.f114419b = j2;
        this.f114420c = j3;
        this.f114421d = i;
    }

    public /* synthetic */ UploadSpeedInfo(long j, long j2, long j3, int i, int i2, C52707g gVar) {
        long j4;
        long j5;
        int i3;
        long j6 = -6;
        if ((i2 & 1) != 0) {
            j4 = -6;
        } else {
            j4 = j;
        }
        if ((i2 & 2) != 0) {
            j5 = -6;
        } else {
            j5 = j2;
        }
        if ((i2 & 4) == 0) {
            j6 = j3;
        }
        if ((i2 & 8) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        this(j4, j5, j6, i3);
    }
}
