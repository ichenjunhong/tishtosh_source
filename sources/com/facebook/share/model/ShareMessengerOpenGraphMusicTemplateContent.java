package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, Object> {
    public static final Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new Creator<ShareMessengerOpenGraphMusicTemplateContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareMessengerOpenGraphMusicTemplateContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
        }
    };

    /* renamed from: a */
    public final Uri f37988a;

    /* renamed from: b */
    public final ShareMessengerActionButton f37989b;

    public final int describeContents() {
        return 0;
    }

    ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel) {
        super(parcel);
        this.f37988a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37989b = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f37988a, i);
        parcel.writeParcelable(this.f37989b, i);
    }
}
