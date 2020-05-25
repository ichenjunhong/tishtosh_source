package com.p683ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString */
public final class TextStickerString implements Parcelable {
    public static final Creator CREATOR = new C46709a();
    private final String str;

    /* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textrecord.TextStickerString$a */
    public static class C46709a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C52711k.m112240b(parcel, "in");
            return new TextStickerString(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new TextStickerString[i];
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final String getStr() {
        return this.str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C52711k.m112240b(parcel, "parcel");
        parcel.writeString(this.str);
    }

    public TextStickerString(String str2) {
        C52711k.m112240b(str2, "str");
        this.str = str2;
    }
}
