package com.p683ss.android.ugc.aweme.music.mediachoose.helper;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.C2240a;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel */
public class MediaModel implements Parcelable, Comparable<MediaModel> {
    public static final Creator<MediaModel> CREATOR = new Creator<MediaModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new MediaModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new MediaModel(parcel);
        }
    };

    /* renamed from: a */
    public long f95382a;

    /* renamed from: b */
    public String f95383b;

    /* renamed from: c */
    public long f95384c;

    /* renamed from: d */
    public int f95385d;

    /* renamed from: e */
    public long f95386e;

    /* renamed from: f */
    public long f95387f;

    /* renamed from: g */
    public String f95388g;

    /* renamed from: h */
    public String f95389h;

    /* renamed from: i */
    public int f95390i;

    /* renamed from: j */
    public int f95391j;

    /* renamed from: k */
    public double f95392k;

    /* renamed from: l */
    public double f95393l;

    /* renamed from: m */
    public int f95394m;

    /* renamed from: n */
    public int f95395n;

    /* renamed from: o */
    public float f95396o = 1.0f;

    /* renamed from: p */
    public String f95397p;

    /* renamed from: q */
    private long f95398q;

    public long ce_() {
        return this.f95398q;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: c */
    public final boolean mo76676c() {
        if (this.f95385d == 4) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Long.valueOf(this.f95382a).hashCode();
    }

    /* renamed from: b */
    public final String mo76675b() {
        if (this.f95392k == ProfileUiInitOptimizeEnterThreshold.DEFAULT || this.f95393l == ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(this.f95393l)}));
        sb.append(",");
        sb.append(C2240a.m6773a(Locale.US, "%.6f", new Object[]{Double.valueOf(this.f95392k)}));
        return sb.toString();
    }

    /* renamed from: a */
    public void mo76674a(long j) {
        this.f95398q = j;
    }

    public MediaModel(long j) {
        this.f95382a = j;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        MediaModel mediaModel = (MediaModel) obj;
        if (this.f95384c > mediaModel.f95384c) {
            return -1;
        }
        if (this.f95384c < mediaModel.f95384c) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaModel) || obj == null || this.f95382a != ((MediaModel) obj).f95382a) {
            return false;
        }
        return true;
    }

    protected MediaModel(Parcel parcel) {
        this.f95382a = parcel.readLong();
        this.f95383b = parcel.readString();
        this.f95384c = parcel.readLong();
        this.f95385d = parcel.readInt();
        this.f95386e = parcel.readLong();
        this.f95387f = parcel.readLong();
        this.f95388g = parcel.readString();
        this.f95389h = parcel.readString();
        this.f95390i = parcel.readInt();
        this.f95391j = parcel.readInt();
        this.f95392k = parcel.readDouble();
        this.f95393l = parcel.readDouble();
        this.f95394m = parcel.readInt();
        this.f95395n = parcel.readInt();
        this.f95397p = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f95382a);
        parcel.writeString(this.f95383b);
        parcel.writeLong(this.f95384c);
        parcel.writeInt(this.f95385d);
        parcel.writeLong(this.f95386e);
        parcel.writeLong(this.f95387f);
        parcel.writeString(this.f95388g);
        parcel.writeString(this.f95389h);
        parcel.writeInt(this.f95390i);
        parcel.writeInt(this.f95391j);
        parcel.writeDouble(this.f95392k);
        parcel.writeDouble(this.f95393l);
        parcel.writeInt(this.f95394m);
        parcel.writeInt(this.f95395n);
        parcel.writeString(this.f95397p);
    }
}
