package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareMedia.C14639a;
import com.facebook.share.model.ShareMedia.C14640b;

public final class SharePhoto extends ShareMedia {
    public static final Creator<SharePhoto> CREATOR = new Creator<SharePhoto>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SharePhoto[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }
    };

    /* renamed from: b */
    public final Bitmap f38000b;

    /* renamed from: c */
    public final Uri f38001c;

    /* renamed from: d */
    public final boolean f38002d;

    /* renamed from: e */
    public final String f38003e;

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    public static final class C14656a extends C14639a<SharePhoto, C14656a> {

        /* renamed from: b */
        public Bitmap f38004b;

        /* renamed from: c */
        public Uri f38005c;

        /* renamed from: d */
        public boolean f38006d;

        /* renamed from: e */
        public String f38007e;

        /* renamed from: a */
        public final SharePhoto mo26920a() {
            return new SharePhoto(this);
        }

        /* renamed from: a */
        public final C14656a mo26916a(Bitmap bitmap) {
            this.f38004b = bitmap;
            return this;
        }

        /* renamed from: a */
        public final C14656a mo26917a(Uri uri) {
            this.f38005c = uri;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C14656a mo26918a(Parcel parcel) {
            return mo26883a((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        /* renamed from: a */
        public final C14656a mo26883a(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            C14656a a = ((C14656a) super.mo26883a(sharePhoto)).mo26916a(sharePhoto.f38000b).mo26917a(sharePhoto.f38001c);
            a.f38006d = sharePhoto.f38002d;
            a.f38007e = sharePhoto.f38003e;
            return a;
        }
    }

    /* renamed from: a */
    public final C14640b mo26880a() {
        return C14640b.PHOTO;
    }

    public final int describeContents() {
        return 0;
    }

    private SharePhoto(C14656a aVar) {
        super((C14639a) aVar);
        this.f38000b = aVar.f38004b;
        this.f38001c = aVar.f38005c;
        this.f38002d = aVar.f38006d;
        this.f38003e = aVar.f38007e;
    }

    SharePhoto(Parcel parcel) {
        boolean z;
        super(parcel);
        this.f38000b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f38001c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f38002d = z;
        this.f38003e = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f38000b, 0);
        parcel.writeParcelable(this.f38001c, 0);
        parcel.writeByte(this.f38002d ? (byte) 1 : 0);
        parcel.writeString(this.f38003e);
    }
}
