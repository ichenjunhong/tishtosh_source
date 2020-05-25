package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, Object> {
    public static final Creator<ShareMessengerGenericTemplateContent> CREATOR = new Creator<ShareMessengerGenericTemplateContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }
    };

    /* renamed from: a */
    public final boolean f37974a;

    /* renamed from: b */
    public final C14643a f37975b;

    /* renamed from: c */
    public final ShareMessengerGenericTemplateElement f37976c;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$a */
    public enum C14643a {
        HORIZONTAL,
        SQUARE
    }

    public final int describeContents() {
        return 0;
    }

    ShareMessengerGenericTemplateContent(Parcel parcel) {
        boolean z;
        super(parcel);
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37974a = z;
        this.f37975b = (C14643a) parcel.readSerializable();
        this.f37976c = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f37974a ? (byte) 1 : 0);
        parcel.writeSerializable(this.f37975b);
        parcel.writeParcelable(this.f37976c, i);
    }
}
