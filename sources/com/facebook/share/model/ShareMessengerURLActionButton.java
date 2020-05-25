package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    public static final Creator<ShareMessengerURLActionButton> CREATOR = new Creator<ShareMessengerURLActionButton>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ShareMessengerURLActionButton(parcel);
        }
    };

    /* renamed from: b */
    public final Uri f37990b;

    /* renamed from: c */
    public final Uri f37991c;

    /* renamed from: d */
    public final boolean f37992d;

    /* renamed from: e */
    public final boolean f37993e;

    /* renamed from: f */
    public final C14649a f37994f;

    /* renamed from: com.facebook.share.model.ShareMessengerURLActionButton$a */
    public enum C14649a {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact
    }

    ShareMessengerURLActionButton(Parcel parcel) {
        boolean z;
        super(parcel);
        this.f37990b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37992d = z;
        this.f37991c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f37994f = (C14649a) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f37993e = z2;
    }
}
