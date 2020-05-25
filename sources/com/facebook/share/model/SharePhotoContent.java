package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent.C14634a;
import com.facebook.share.model.SharePhoto.C14656a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SharePhotoContent extends ShareContent<SharePhotoContent, C14658a> {
    public static final Creator<SharePhotoContent> CREATOR = new Creator<SharePhotoContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SharePhotoContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }
    };

    /* renamed from: a */
    public final List<SharePhoto> f38008a;

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    public static class C14658a extends C14634a<SharePhotoContent, C14658a> {

        /* renamed from: g */
        public final List<SharePhoto> f38009g = new ArrayList();

        /* renamed from: a */
        public final SharePhotoContent mo26926a() {
            return new SharePhotoContent(this);
        }

        /* renamed from: a */
        public final C14658a mo26871a(SharePhotoContent sharePhotoContent) {
            if (sharePhotoContent == null) {
                return this;
            }
            return ((C14658a) super.mo26871a(sharePhotoContent)).m29974b(sharePhotoContent.f38008a);
        }

        /* renamed from: b */
        private C14658a m29974b(List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto a : list) {
                    mo26923a(a);
                }
            }
            return this;
        }

        /* renamed from: a */
        public final C14658a mo26923a(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f38009g.add(new C14656a().mo26883a(sharePhoto).mo26920a());
            }
            return this;
        }

        /* renamed from: a */
        public final C14658a mo26925a(List<SharePhoto> list) {
            this.f38009g.clear();
            m29974b(list);
            return this;
        }
    }

    public final int describeContents() {
        return 0;
    }

    private SharePhotoContent(C14658a aVar) {
        super((C14634a) aVar);
        this.f38008a = Collections.unmodifiableList(aVar.f38009g);
    }

    SharePhotoContent(Parcel parcel) {
        super(parcel);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        ArrayList<ShareMedia> arrayList = new ArrayList<>(readParcelableArray.length);
        for (Parcelable parcelable : readParcelableArray) {
            arrayList.add((ShareMedia) parcelable);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : arrayList) {
            if (shareMedia instanceof SharePhoto) {
                arrayList2.add((SharePhoto) shareMedia);
            }
        }
        this.f38008a = Collections.unmodifiableList(arrayList2);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        List<SharePhoto> list = this.f38008a;
        ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            shareMediaArr[i2] = (ShareMedia) list.get(i2);
        }
        parcel.writeParcelableArray(shareMediaArr, i);
    }
}
