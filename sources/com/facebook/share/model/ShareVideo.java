package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia.C14639a;
import com.facebook.share.model.ShareMedia.C14640b;

public final class ShareVideo extends ShareMedia {
    public static final Creator<ShareVideo> CREATOR = new Creator<ShareVideo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareVideo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }
    };

    /* renamed from: b */
    public final Uri f38014b;

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    public static final class C14661a extends C14639a<ShareVideo, C14661a> {

        /* renamed from: b */
        public Uri f38015b;

        /* renamed from: a */
        public final ShareVideo mo26934a() {
            return new ShareVideo(this);
        }

        /* renamed from: a */
        public final C14661a mo26931a(Uri uri) {
            this.f38015b = uri;
            return this;
        }

        /* renamed from: a */
        public final C14661a mo26883a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            return ((C14661a) super.mo26883a(shareVideo)).mo26931a(shareVideo.f38014b);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C14661a mo26932a(Parcel parcel) {
            return mo26883a((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }
    }

    /* renamed from: a */
    public final C14640b mo26880a() {
        return C14640b.VIDEO;
    }

    public final int describeContents() {
        return 0;
    }

    private ShareVideo(C14661a aVar) {
        super((C14639a) aVar);
        this.f38014b = aVar.f38015b;
    }

    ShareVideo(Parcel parcel) {
        super(parcel);
        this.f38014b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f38014b, 0);
    }
}
