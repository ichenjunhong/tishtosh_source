package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent.C14634a;

public final class ShareLinkContent extends ShareContent<ShareLinkContent, C14638a> {
    public static final Creator<ShareLinkContent> CREATOR = new Creator<ShareLinkContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareLinkContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }
    };

    /* renamed from: a */
    public final String f37960a;

    /* renamed from: b */
    public final String f37961b;

    /* renamed from: c */
    public final Uri f37962c;

    /* renamed from: d */
    public final String f37963d;

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    public static final class C14638a extends C14634a<ShareLinkContent, C14638a> {

        /* renamed from: g */
        static final String f37964g = "ShareLinkContent$a";

        /* renamed from: h */
        public String f37965h;

        /* renamed from: i */
        public String f37966i;

        /* renamed from: j */
        public Uri f37967j;

        /* renamed from: k */
        public String f37968k;

        /* renamed from: a */
        public final ShareLinkContent mo26879a() {
            return new ShareLinkContent(this);
        }

        /* renamed from: a */
        public final C14638a mo26878a(String str) {
            this.f37968k = str;
            return this;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ C14634a mo26871a(ShareContent shareContent) {
            ShareLinkContent shareLinkContent = (ShareLinkContent) shareContent;
            if (shareLinkContent == null) {
                return this;
            }
            C14638a aVar = (C14638a) super.mo26871a(shareLinkContent);
            String str = shareLinkContent.f37960a;
            Uri uri = shareLinkContent.f37962c;
            String str2 = shareLinkContent.f37961b;
            return aVar.mo26878a(shareLinkContent.f37963d);
        }
    }

    public final int describeContents() {
        return 0;
    }

    private ShareLinkContent(C14638a aVar) {
        super((C14634a) aVar);
        this.f37960a = aVar.f37965h;
        this.f37961b = aVar.f37966i;
        this.f37962c = aVar.f37967j;
        this.f37963d = aVar.f37968k;
    }

    ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f37960a = parcel.readString();
        this.f37961b = parcel.readString();
        this.f37962c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37963d = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37960a);
        parcel.writeString(this.f37961b);
        parcel.writeParcelable(this.f37962c, 0);
        parcel.writeString(this.f37963d);
    }
}
