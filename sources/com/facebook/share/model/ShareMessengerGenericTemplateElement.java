package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Creator<ShareMessengerGenericTemplateElement> CREATOR = new Creator<ShareMessengerGenericTemplateElement>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }
    };

    /* renamed from: a */
    public final String f37978a;

    /* renamed from: b */
    public final String f37979b;

    /* renamed from: c */
    public final Uri f37980c;

    /* renamed from: d */
    public final ShareMessengerActionButton f37981d;

    /* renamed from: e */
    public final ShareMessengerActionButton f37982e;

    public final int describeContents() {
        return 0;
    }

    ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.f37978a = parcel.readString();
        this.f37979b = parcel.readString();
        this.f37980c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37981d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.f37982e = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37978a);
        parcel.writeString(this.f37979b);
        parcel.writeParcelable(this.f37980c, i);
        parcel.writeParcelable(this.f37981d, i);
        parcel.writeParcelable(this.f37982e, i);
    }
}
