package com.p683ss.android.ugc.aweme.shortvideo.edit.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.PhotoSegment */
public final class PhotoSegment implements Parcelable {
    public static final Creator CREATOR = new C43663a();
    private final int height;
    private final String path;
    private final int width;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.PhotoSegment$a */
    public static class C43663a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            return new PhotoSegment(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new PhotoSegment[i];
        }
    }

    public static /* synthetic */ PhotoSegment copy$default(PhotoSegment photoSegment, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = photoSegment.path;
        }
        if ((i3 & 2) != 0) {
            i = photoSegment.width;
        }
        if ((i3 & 4) != 0) {
            i2 = photoSegment.height;
        }
        return photoSegment.copy(str, i, i2);
    }

    public final String component1() {
        return this.path;
    }

    public final int component2() {
        return this.width;
    }

    public final int component3() {
        return this.height;
    }

    public final PhotoSegment copy(String str, int i, int i2) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        return new PhotoSegment(str, i, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PhotoSegment) {
                PhotoSegment photoSegment = (PhotoSegment) obj;
                if (C52711k.m112239a((Object) this.path, (Object) photoSegment.path)) {
                    if (this.width == photoSegment.width) {
                        if (this.height == photoSegment.height) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        String str = this.path;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.width) * 31) + this.height;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoSegment(path=");
        sb.append(this.path);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.path);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public PhotoSegment(String str, int i, int i2) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        this.path = str;
        this.width = i;
        this.height = i2;
    }
}
