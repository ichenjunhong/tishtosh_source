package com.p683ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextUnderlineIndexRange */
public final class TextStickerTextUnderlineIndexRange implements Parcelable, Cloneable {
    public static final Creator CREATOR = new C46710a();
    private int end;
    private int start;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerTextUnderlineIndexRange$a */
    public static class C46710a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            return new TextStickerTextUnderlineIndexRange(parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new TextStickerTextUnderlineIndexRange[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final int hashCode() {
        return this.start;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
    }

    public final TextStickerTextUnderlineIndexRange clone() {
        return new TextStickerTextUnderlineIndexRange(this.start, this.end);
    }

    public final void setEnd(int i) {
        this.end = i;
    }

    public final void setStart(int i) {
        this.start = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStickerTextUnderlineIndexRange)) {
            return false;
        }
        TextStickerTextUnderlineIndexRange textStickerTextUnderlineIndexRange = (TextStickerTextUnderlineIndexRange) obj;
        if (this.start == textStickerTextUnderlineIndexRange.start && this.end == textStickerTextUnderlineIndexRange.end) {
            return true;
        }
        return false;
    }

    public final boolean isValid(int i) {
        if (i <= 0 || this.start < 0 || this.end > i || this.end - this.start <= 0) {
            return false;
        }
        return true;
    }

    public TextStickerTextUnderlineIndexRange(int i, int i2) {
        this.start = i;
        this.end = i2;
    }
}
