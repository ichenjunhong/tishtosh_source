package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareOpenGraphAction.C14651a;

public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Creator<ShareOpenGraphContent> CREATOR = new Creator<ShareOpenGraphContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }
    };

    /* renamed from: a */
    public final ShareOpenGraphAction f37996a;

    /* renamed from: b */
    public final String f37997b;

    public final int describeContents() {
        return 0;
    }

    ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f37996a = new ShareOpenGraphAction(new C14651a().mo26903a(parcel));
        this.f37997b = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f37996a, 0);
        parcel.writeString(this.f37997b);
    }
}
