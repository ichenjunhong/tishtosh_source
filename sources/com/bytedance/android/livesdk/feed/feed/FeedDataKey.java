package com.bytedance.android.livesdk.feed.feed;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

public class FeedDataKey implements Parcelable {
    public static final Creator<FeedDataKey> CREATOR = new Creator<FeedDataKey>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FeedDataKey[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            FeedDataKey feedDataKey = new FeedDataKey(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
            return feedDataKey;
        }
    };

    /* renamed from: d */
    private static final Integer f18987d = Integer.valueOf(1);

    /* renamed from: e */
    private static final Integer f18988e = Integer.valueOf(0);

    /* renamed from: f */
    private static final Integer f18989f = Integer.valueOf(31);

    /* renamed from: a */
    public String f18990a;

    /* renamed from: b */
    public String f18991b;

    /* renamed from: c */
    public long f18992c;

    /* renamed from: g */
    private int f18993g;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int intValue = f18989f.intValue();
        int i2 = 0;
        if (this.f18991b != null) {
            i = this.f18991b.hashCode();
        } else {
            i = 0;
        }
        int intValue2 = f18989f.intValue() * (intValue + i);
        if (this.f18990a != null) {
            i2 = this.f18990a.hashCode();
        }
        return (f18989f.intValue() * (intValue2 + i2)) + Long.valueOf(this.f18992c).hashCode();
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("label: ");
        if (this.f18991b == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str = this.f18991b;
        }
        sb.append(str);
        sb.append("; url: ");
        if (this.f18990a == null) {
            str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str2 = this.f18990a;
        }
        sb.append(str2);
        sb.append("; id: ");
        sb.append(this.f18992c);
        sb.append("; repeatCheck: ");
        sb.append(this.f18993g);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof FeedDataKey)) {
            return false;
        }
        FeedDataKey feedDataKey = (FeedDataKey) obj;
        if (!TextUtils.equals(this.f18991b, feedDataKey.f18991b) || !TextUtils.equals(this.f18990a, feedDataKey.f18990a) || this.f18992c != feedDataKey.f18992c) {
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18991b);
        parcel.writeString(this.f18990a);
        parcel.writeLong(this.f18992c);
        parcel.writeInt(this.f18993g);
    }

    /* renamed from: a */
    public static FeedDataKey m14536a(String str, String str2, long j) {
        return m14537a(str, str2, j, f18987d.intValue());
    }

    private FeedDataKey(String str, String str2, long j, int i) {
        this.f18990a = "";
        this.f18991b = "";
        this.f18992c = Long.MIN_VALUE;
        this.f18993g = f18987d.intValue();
        this.f18991b = str;
        this.f18990a = str2;
        this.f18992c = j;
        this.f18993g = i;
    }

    /* renamed from: a */
    private static FeedDataKey m14537a(String str, String str2, long j, int i) {
        if (!TextUtils.isEmpty(str)) {
            FeedDataKey feedDataKey = new FeedDataKey(str, str2, j, i);
            return feedDataKey;
        }
        throw new IllegalArgumentException("label must not be null or empty");
    }
}
