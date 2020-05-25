package com.p683ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo */
public final class ImportVideoInfo implements Parcelable, Serializable {
    public static final C42371a CREATOR = new C42371a(null);

    /* renamed from: a */
    private int f107003a;

    /* renamed from: b */
    private int f107004b;

    /* renamed from: c */
    private int f107005c;

    /* renamed from: d */
    private int f107006d;

    /* renamed from: e */
    private String f107007e;

    /* renamed from: f */
    private long f107008f;

    /* renamed from: g */
    private long f107009g;

    /* renamed from: h */
    private String f107010h;

    /* renamed from: i */
    private String f107011i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo$a */
    public static final class C42371a implements Creator<ImportVideoInfo> {
        private C42371a() {
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ImportVideoInfo[i];
        }

        public /* synthetic */ C42371a(C52707g gVar) {
            this();
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "parcel");
            return new ImportVideoInfo(parcel);
        }
    }

    public ImportVideoInfo() {
        this(0, 0, 0, 0, null, 0, 0, null, null, 511, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final int getBitRate() {
        return this.f107005c;
    }

    public final String getDescription() {
        return this.f107010h;
    }

    public final long getDuration() {
        return this.f107009g;
    }

    public final int getEncodeId() {
        return this.f107006d;
    }

    public final String getImportPath() {
        return this.f107007e;
    }

    public final long getImportfileDuration() {
        return this.f107008f;
    }

    public final String getMusicId() {
        return this.f107011i;
    }

    public final int getVideoHeight() {
        return this.f107004b;
    }

    public final int getVideoWidth() {
        return this.f107003a;
    }

    public final void setBitRate(int i) {
        this.f107005c = i;
    }

    public final void setDescription(String str) {
        this.f107010h = str;
    }

    public final void setDuration(long j) {
        this.f107009g = j;
    }

    public final void setEncodeId(int i) {
        this.f107006d = i;
    }

    public final void setImportPath(String str) {
        this.f107007e = str;
    }

    public final void setImportfileDuration(long j) {
        this.f107008f = j;
    }

    public final void setMusicId(String str) {
        this.f107011i = str;
    }

    public final void setVideoHeight(int i) {
        this.f107004b = i;
    }

    public final void setVideoWidth(int i) {
        this.f107003a = i;
    }

    public ImportVideoInfo(Parcel parcel) {
        C52711k.m112240b(parcel, "parcel");
        this(0, 0, 0, 0, null, 0, 0, null, null, 511, null);
        this.f107003a = parcel.readInt();
        this.f107004b = parcel.readInt();
        this.f107005c = parcel.readInt();
        this.f107006d = parcel.readInt();
        this.f107007e = parcel.readString();
        this.f107008f = parcel.readLong();
        this.f107009g = parcel.readLong();
        this.f107010h = parcel.readString();
        this.f107011i = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.f107003a);
        parcel.writeInt(this.f107004b);
        parcel.writeInt(this.f107005c);
        parcel.writeInt(this.f107006d);
        parcel.writeString(this.f107007e);
        parcel.writeLong(this.f107008f);
        parcel.writeLong(this.f107009g);
        parcel.writeString(this.f107010h);
        parcel.writeString(this.f107011i);
    }

    public ImportVideoInfo(int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3) {
        this.f107003a = i;
        this.f107004b = i2;
        this.f107005c = i3;
        this.f107006d = i4;
        this.f107007e = str;
        this.f107008f = j;
        this.f107009g = j2;
        this.f107010h = str2;
        this.f107011i = str3;
    }

    public /* synthetic */ ImportVideoInfo(int i, int i2, int i3, int i4, String str, long j, long j2, String str2, String str3, int i5, C52707g gVar) {
        int i6;
        int i7;
        int i8;
        String str4;
        long j3;
        String str5;
        int i9 = i5;
        int i10 = 0;
        if ((i9 & 1) != 0) {
            i6 = 0;
        } else {
            i6 = i;
        }
        if ((i9 & 2) != 0) {
            i7 = 0;
        } else {
            i7 = i2;
        }
        if ((i9 & 4) != 0) {
            i8 = 0;
        } else {
            i8 = i3;
        }
        if ((i9 & 8) == 0) {
            i10 = i4;
        }
        String str6 = null;
        if ((i9 & 16) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        long j4 = 0;
        if ((i9 & 32) != 0) {
            j3 = 0;
        } else {
            j3 = j;
        }
        if ((i9 & 64) == 0) {
            j4 = j2;
        }
        if ((i9 & 128) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i9 & UnReadVideoExperiment.BROWSE_RECORD_LIST) == 0) {
            str6 = str3;
        }
        this(i6, i7, i8, i10, str4, j3, j4, str5, str6);
    }
}
