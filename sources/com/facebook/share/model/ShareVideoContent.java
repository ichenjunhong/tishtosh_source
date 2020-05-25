package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent.C14634a;
import com.facebook.share.model.SharePhoto.C14656a;
import com.facebook.share.model.ShareVideo.C14661a;

public final class ShareVideoContent extends ShareContent<ShareVideoContent, C14663a> implements ShareModel {
    public static final Creator<ShareVideoContent> CREATOR = new Creator<ShareVideoContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareVideoContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }
    };

    /* renamed from: a */
    public final String f38016a;

    /* renamed from: b */
    public final String f38017b;

    /* renamed from: c */
    public final SharePhoto f38018c;

    /* renamed from: d */
    public final ShareVideo f38019d;

    /* renamed from: com.facebook.share.model.ShareVideoContent$a */
    public static final class C14663a extends C14634a<ShareVideoContent, C14663a> {

        /* renamed from: g */
        public String f38020g;

        /* renamed from: h */
        public String f38021h;

        /* renamed from: i */
        public SharePhoto f38022i;

        /* renamed from: j */
        public ShareVideo f38023j;

        /* renamed from: a */
        public final ShareVideoContent mo26938a() {
            return new ShareVideoContent(this);
        }

        /* renamed from: a */
        public final C14663a mo26937a(ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            this.f38023j = new C14661a().mo26883a(shareVideo).mo26934a();
            return this;
        }

        /* renamed from: a */
        public final /* synthetic */ C14634a mo26871a(ShareContent shareContent) {
            SharePhoto sharePhoto;
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            if (shareVideoContent == null) {
                return this;
            }
            C14663a aVar = (C14663a) super.mo26871a(shareVideoContent);
            aVar.f38020g = shareVideoContent.f38016a;
            aVar.f38021h = shareVideoContent.f38017b;
            SharePhoto sharePhoto2 = shareVideoContent.f38018c;
            if (sharePhoto2 == null) {
                sharePhoto = null;
            } else {
                sharePhoto = new C14656a().mo26883a(sharePhoto2).mo26920a();
            }
            aVar.f38022i = sharePhoto;
            return aVar.mo26937a(shareVideoContent.f38019d);
        }
    }

    public final int describeContents() {
        return 0;
    }

    private ShareVideoContent(C14663a aVar) {
        super((C14634a) aVar);
        this.f38016a = aVar.f38020g;
        this.f38017b = aVar.f38021h;
        this.f38018c = aVar.f38022i;
        this.f38019d = aVar.f38023j;
    }

    ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f38016a = parcel.readString();
        this.f38017b = parcel.readString();
        C14656a a = new C14656a().mo26918a(parcel);
        if (a.f38005c == null && a.f38004b == null) {
            this.f38018c = null;
        } else {
            this.f38018c = a.mo26920a();
        }
        this.f38019d = new C14661a().mo26932a(parcel).mo26934a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f38016a);
        parcel.writeString(this.f38017b);
        parcel.writeParcelable(this.f38018c, 0);
        parcel.writeParcelable(this.f38019d, 0);
    }
}
