package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareContent;

public class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Creator<ShareFeedContent> CREATOR = new Creator<ShareFeedContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareFeedContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }
    };

    /* renamed from: a */
    public final String f37883a;

    /* renamed from: b */
    public final String f37884b;

    /* renamed from: c */
    public final String f37885c;

    /* renamed from: d */
    public final String f37886d;

    /* renamed from: e */
    public final String f37887e;

    /* renamed from: f */
    public final String f37888f;

    /* renamed from: g */
    public final String f37889g;

    public int describeContents() {
        return 0;
    }

    ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f37883a = parcel.readString();
        this.f37884b = parcel.readString();
        this.f37885c = parcel.readString();
        this.f37886d = parcel.readString();
        this.f37887e = parcel.readString();
        this.f37888f = parcel.readString();
        this.f37889g = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f37883a);
        parcel.writeString(this.f37884b);
        parcel.writeString(this.f37885c);
        parcel.writeString(this.f37886d);
        parcel.writeString(this.f37887e);
        parcel.writeString(this.f37888f);
        parcel.writeString(this.f37889g);
    }
}
