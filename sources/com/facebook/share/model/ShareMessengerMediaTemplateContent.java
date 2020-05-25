package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Object> {
    public static final Creator<ShareMessengerMediaTemplateContent> CREATOR = new Creator<ShareMessengerMediaTemplateContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }
    };

    /* renamed from: a */
    public final C14646a f37983a;

    /* renamed from: b */
    public final String f37984b;

    /* renamed from: c */
    public final Uri f37985c;

    /* renamed from: d */
    public final ShareMessengerActionButton f37986d;

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$a */
    public enum C14646a {
        IMAGE,
        VIDEO
    }

    public final int describeContents() {
        return 0;
    }

    ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.f37983a = (C14646a) parcel.readSerializable();
        this.f37984b = parcel.readString();
        this.f37985c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37986d = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f37983a);
        parcel.writeString(this.f37984b);
        parcel.writeParcelable(this.f37985c, i);
        parcel.writeParcelable(this.f37986d, i);
    }
}
