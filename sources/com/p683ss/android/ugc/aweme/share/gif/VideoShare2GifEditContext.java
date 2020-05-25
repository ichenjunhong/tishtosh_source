package com.p683ss.android.ugc.aweme.share.gif;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext */
public class VideoShare2GifEditContext implements Parcelable {
    public static final Creator<VideoShare2GifEditContext> CREATOR = new Creator<VideoShare2GifEditContext>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VideoShare2GifEditContext[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VideoShare2GifEditContext(parcel);
        }
    };

    /* renamed from: a */
    public String f106354a;

    /* renamed from: b */
    public String f106355b;

    /* renamed from: c */
    public boolean f106356c;

    /* renamed from: d */
    public int f106357d;

    /* renamed from: e */
    public String f106358e;

    /* renamed from: f */
    public String f106359f;

    /* renamed from: g */
    public int f106360g;

    /* renamed from: h */
    public int f106361h;

    /* renamed from: i */
    public int f106362i;

    /* renamed from: j */
    public int f106363j;

    /* renamed from: k */
    public float f106364k;

    /* renamed from: l */
    public float f106365l;

    /* renamed from: m */
    public long f106366m;

    /* renamed from: n */
    public long f106367n;

    /* renamed from: o */
    public int f106368o;

    /* renamed from: p */
    public String f106369p;

    /* renamed from: q */
    public String f106370q;

    /* renamed from: r */
    public String f106371r;

    public VideoShare2GifEditContext() {
    }

    public int describeContents() {
        return 0;
    }

    protected VideoShare2GifEditContext(Parcel parcel) {
        boolean z;
        this.f106354a = parcel.readString();
        this.f106355b = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f106356c = z;
        this.f106358e = parcel.readString();
        this.f106360g = parcel.readInt();
        this.f106361h = parcel.readInt();
        this.f106362i = parcel.readInt();
        this.f106363j = parcel.readInt();
        this.f106364k = parcel.readFloat();
        this.f106365l = parcel.readFloat();
        this.f106369p = parcel.readString();
        this.f106370q = parcel.readString();
        this.f106371r = parcel.readString();
        this.f106366m = parcel.readLong();
        this.f106367n = parcel.readLong();
        this.f106368o = parcel.readInt();
        this.f106357d = parcel.readInt();
        this.f106359f = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106354a);
        parcel.writeString(this.f106355b);
        parcel.writeByte(this.f106356c ? (byte) 1 : 0);
        parcel.writeString(this.f106358e);
        parcel.writeInt(this.f106360g);
        parcel.writeInt(this.f106361h);
        parcel.writeInt(this.f106362i);
        parcel.writeInt(this.f106363j);
        parcel.writeFloat(this.f106364k);
        parcel.writeFloat(this.f106365l);
        parcel.writeString(this.f106369p);
        parcel.writeString(this.f106370q);
        parcel.writeString(this.f106371r);
        parcel.writeLong(this.f106366m);
        parcel.writeLong(this.f106367n);
        parcel.writeInt(this.f106368o);
        parcel.writeInt(this.f106357d);
        parcel.writeString(this.f106359f);
    }
}
