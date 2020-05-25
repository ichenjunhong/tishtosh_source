package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class AppInviteContent implements ShareModel {
    public static final Creator<AppInviteContent> CREATOR = new Creator<AppInviteContent>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AppInviteContent[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AppInviteContent(parcel);
        }
    };

    /* renamed from: a */
    public final String f37922a;

    /* renamed from: b */
    public final String f37923b;

    /* renamed from: c */
    public final String f37924c;

    /* renamed from: d */
    public final String f37925d;

    /* renamed from: e */
    private final C14625a f37926e;

    /* renamed from: com.facebook.share.model.AppInviteContent$a */
    public static class C14624a {

        /* renamed from: com.facebook.share.model.AppInviteContent$a$a */
        public enum C14625a {
            FACEBOOK("facebook"),
            MESSENGER("messenger");
            

            /* renamed from: a */
            private final String f37928a;

            public final String toString() {
                return this.f37928a;
            }

            public final boolean equalsName(String str) {
                if (str == null) {
                    return false;
                }
                return this.f37928a.equals(str);
            }

            private C14625a(String str) {
                this.f37928a = str;
            }
        }
    }

    public final int describeContents() {
        return 0;
    }

    AppInviteContent(Parcel parcel) {
        this.f37922a = parcel.readString();
        this.f37923b = parcel.readString();
        this.f37925d = parcel.readString();
        this.f37924c = parcel.readString();
        String readString = parcel.readString();
        if (readString.length() > 0) {
            this.f37926e = C14625a.valueOf(readString);
        } else {
            this.f37926e = C14625a.FACEBOOK;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f37922a);
        parcel.writeString(this.f37923b);
        parcel.writeString(this.f37925d);
        parcel.writeString(this.f37924c);
        parcel.writeString(this.f37926e.toString());
    }
}
