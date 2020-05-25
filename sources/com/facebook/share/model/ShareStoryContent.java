package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    public static final Creator<ShareStoryContent> CREATOR = new Creator<ShareStoryContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareStoryContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }
    };

    /* renamed from: a */
    public final ShareMedia f38010a;

    /* renamed from: b */
    public final SharePhoto f38011b;

    /* renamed from: c */
    public final List<String> f38012c;

    /* renamed from: d */
    public final String f38013d;

    public final int describeContents() {
        return 0;
    }

    ShareStoryContent(Parcel parcel) {
        List<String> list;
        super(parcel);
        this.f38010a = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f38011b = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            list = null;
        } else {
            list = Collections.unmodifiableList(arrayList);
        }
        this.f38012c = list;
        this.f38013d = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f38010a, 0);
        parcel.writeParcelable(this.f38011b, 0);
        parcel.writeStringList(this.f38012c);
        parcel.writeString(this.f38013d);
    }
}
