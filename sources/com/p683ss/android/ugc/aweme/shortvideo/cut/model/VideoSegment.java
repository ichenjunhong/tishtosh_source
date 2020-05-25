package com.p683ss.android.ugc.aweme.shortvideo.cut.model;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.tools.C47339t;
import com.p683ss.android.ugc.aweme.tools.p2348b.C46813b;
import com.p683ss.android.ugc.tools.utils.C50200d;
import com.p683ss.android.vesdk.clipparam.VEClipAlgorithmParam;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment */
public class VideoSegment implements Parcelable {
    public static final Creator<VideoSegment> CREATOR = new Creator<VideoSegment>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new VideoSegment[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new VideoSegment(parcel);
        }
    };

    /* renamed from: a */
    public int f107902a;

    /* renamed from: b */
    public String f107903b;

    /* renamed from: c */
    public long f107904c;

    /* renamed from: d */
    public long f107905d;

    /* renamed from: e */
    public long f107906e;

    /* renamed from: f */
    public float f107907f;

    /* renamed from: g */
    public int f107908g;

    /* renamed from: h */
    public int f107909h;

    /* renamed from: i */
    public String f107910i;

    /* renamed from: j */
    public boolean f107911j;

    /* renamed from: k */
    public int f107912k;

    /* renamed from: l */
    public float f107913l = 1.0f;

    /* renamed from: m */
    public float f107914m = 1.0f;

    /* renamed from: n */
    public String f107915n;

    /* renamed from: o */
    public String f107916o;

    /* renamed from: p */
    public C42662e f107917p;

    /* renamed from: q */
    public boolean f107918q;

    /* renamed from: r */
    public boolean f107919r;

    /* renamed from: s */
    public int f107920s = VEClipAlgorithmParam.BINGO_EFFECT_NULL;

    /* renamed from: t */
    public int f107921t;

    /* renamed from: u */
    public int f107922u;

    /* renamed from: v */
    public int f107923v;

    /* renamed from: w */
    public int f107924w;

    /* renamed from: x */
    public String f107925x;

    /* renamed from: y */
    public String f107926y;

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo86950e() {
        return mo86941a(true);
    }

    /* renamed from: b */
    public final int mo86945b() {
        if (this.f107921t == 0) {
            m93597j();
        }
        return this.f107921t;
    }

    /* renamed from: c */
    public final int mo86947c() {
        if (this.f107924w == 0) {
            m93597j();
        }
        return this.f107924w;
    }

    /* renamed from: d */
    public final int mo86948d() {
        if (this.f107922u == 0) {
            m93597j();
        }
        return this.f107922u;
    }

    /* renamed from: f */
    public final long mo86952f() {
        if (mo86955i()) {
            return this.f107917p.getVideoStart();
        }
        return this.f107905d;
    }

    /* renamed from: g */
    public final long mo86953g() {
        if (mo86955i()) {
            return this.f107917p.getVideoEnd();
        }
        return this.f107906e;
    }

    /* renamed from: h */
    public final float mo86954h() {
        if (mo86955i()) {
            return this.f107917p.getSpeed();
        }
        return this.f107907f;
    }

    /* renamed from: i */
    public final boolean mo86955i() {
        if (!this.f107918q || this.f107917p == null) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private void m93597j() {
        int[] iArr = new int[10];
        if (C46813b.m101656a(this.f107903b, iArr) == 0) {
            this.f107908g = iArr[0];
            this.f107909h = iArr[1];
            this.f107921t = iArr[7];
            this.f107924w = iArr[8];
            this.f107922u = iArr[6];
            this.f107923v = iArr[9];
        }
    }

    /* renamed from: a */
    public final boolean mo86944a() {
        if (!C50200d.m108346a(this.f107903b)) {
            return false;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.f107903b, options);
        String str = options.outMimeType;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("png") || str.contains("jpg") || str.contains("jpeg")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo86943a(long j) {
        if (mo86955i()) {
            this.f107917p.setVideoStart(j);
        } else {
            this.f107905d = j;
        }
    }

    /* renamed from: a */
    public final String mo86941a(boolean z) {
        if (!z) {
            return this.f107903b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f107902a);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo86946b(long j) {
        if (mo86955i()) {
            this.f107917p.setVideoEnd(j);
        } else {
            this.f107906e = j;
        }
    }

    public VideoSegment(MediaModel mediaModel) {
        this.f107903b = mediaModel.f95383b;
        this.f107908g = mediaModel.f95390i;
        this.f107909h = mediaModel.f95391j;
        this.f107910i = mediaModel.f95389h;
        this.f107904c = mediaModel.f95386e;
        this.f107905d = (long) mediaModel.f95394m;
        if (mediaModel.f95395n > 0) {
            this.f107906e = (long) mediaModel.f95395n;
        } else {
            this.f107906e = this.f107904c;
        }
        this.f107907f = mediaModel.f95396o;
        this.f107915n = mediaModel.mo76675b();
    }

    /* renamed from: a */
    public final void mo86942a(float f) {
        if (mo86955i()) {
            this.f107917p.setSpeed(1.0f);
        } else {
            this.f107907f = f;
        }
    }

    protected VideoSegment(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f107902a = parcel.readInt();
        this.f107903b = parcel.readString();
        this.f107904c = parcel.readLong();
        this.f107905d = parcel.readLong();
        this.f107906e = parcel.readLong();
        this.f107907f = parcel.readFloat();
        this.f107908g = parcel.readInt();
        this.f107909h = parcel.readInt();
        this.f107910i = parcel.readString();
        boolean z3 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f107911j = z;
        this.f107912k = parcel.readInt();
        this.f107915n = parcel.readString();
        this.f107916o = parcel.readString();
        this.f107913l = parcel.readFloat();
        this.f107914m = parcel.readFloat();
        this.f107917p = (C42662e) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f107918q = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        }
        this.f107919r = z3;
        this.f107920s = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSegment)) {
            return false;
        }
        VideoSegment videoSegment = (VideoSegment) obj;
        if (this.f107902a == videoSegment.f107902a && this.f107904c == videoSegment.f107904c && this.f107905d == videoSegment.f107905d && this.f107906e == videoSegment.f107906e && Float.compare(videoSegment.f107907f, this.f107907f) == 0 && this.f107908g == videoSegment.f107908g && this.f107909h == videoSegment.f107909h && this.f107911j == videoSegment.f107911j && ((this.f107903b == videoSegment.f107903b || (this.f107903b != null && this.f107903b.equals(videoSegment.f107903b))) && ((this.f107910i == videoSegment.f107910i || (this.f107910i != null && this.f107910i.equals(videoSegment.f107910i))) && ((this.f107915n == videoSegment.f107915n || (this.f107915n != null && this.f107915n.equals(videoSegment.f107915n))) && (this.f107916o == videoSegment.f107916o || (this.f107916o != null && this.f107916o.equals(videoSegment.f107916o))))))) {
            return true;
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f107902a);
        parcel.writeString(this.f107903b);
        parcel.writeLong(this.f107904c);
        parcel.writeLong(this.f107905d);
        parcel.writeLong(this.f107906e);
        parcel.writeFloat(this.f107907f);
        parcel.writeInt(this.f107908g);
        parcel.writeInt(this.f107909h);
        parcel.writeString(this.f107910i);
        parcel.writeByte(this.f107911j ? (byte) 1 : 0);
        parcel.writeInt(this.f107912k);
        parcel.writeString(this.f107915n);
        parcel.writeString(this.f107916o);
        parcel.writeFloat(this.f107913l);
        parcel.writeFloat(this.f107914m);
        parcel.writeSerializable(this.f107917p);
        parcel.writeInt(this.f107918q ? 1 : 0);
        parcel.writeInt(this.f107919r ? 1 : 0);
        parcel.writeInt(this.f107920s);
    }

    public VideoSegment(String str, int i, int i2, int i3) {
        this.f107903b = str;
        this.f107908g = i;
        this.f107909h = i2;
        this.f107910i = "";
        long j = (long) i3;
        this.f107904c = j;
        this.f107906e = j;
        this.f107907f = C47339t.NORMAL.value();
    }
}
